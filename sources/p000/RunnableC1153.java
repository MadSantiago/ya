package p000;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۥّؓٓۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1153 extends AbstractC5596 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: ۥۖ */
    public static final RunnableC1153 f4006;

    /* JADX INFO: renamed from: ۦٕ */
    public static final long f4007;

    static {
        Long l;
        RunnableC1153 runnableC1153 = new RunnableC1153();
        f4006 = runnableC1153;
        runnableC1153.m9441(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f4007 = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC4253.f14094.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    m2410();
                    if (m9444()) {
                        return;
                    }
                    mo2412();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jM9445 = m9445();
                    if (jM9445 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f4007 + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m2410();
                            if (m9444()) {
                                return;
                            }
                            mo2412();
                            return;
                        }
                        if (jM9445 > j2) {
                            jM9445 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jM9445 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m2410();
                            if (m9444()) {
                                return;
                            }
                            mo2412();
                            return;
                        }
                        LockSupport.parkNanos(this, jM9445);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            m2410();
            if (!m9444()) {
                mo2412();
            }
            throw th;
        }
    }

    @Override // p000.AbstractC5596
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p000.AbstractC2132
    public final String toString() {
        return "DefaultExecutor";
    }

    /* JADX INFO: renamed from: ۥؕ */
    public final synchronized void m2410() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            Unsafe unsafe = AbstractC3456.f11473;
            unsafe.putObjectVolatile(this, AbstractC5596.f18441, (Object) null);
            unsafe.putObjectVolatile(this, AbstractC5596.f18439, (Object) null);
            notifyAll();
        }
    }

    @Override // p000.AbstractC5596
    /* JADX INFO: renamed from: ۥٞ */
    public final void mo2411(long j, AbstractRunnableC1169 abstractRunnableC1169) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p000.AbstractC5596
    /* JADX INFO: renamed from: ۦؔ */
    public final Thread mo2412() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(RunnableC1153.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // p000.InterfaceC1312
    /* JADX INFO: renamed from: ۦٚ */
    public final InterfaceC4883 mo1552(long j, Runnable runnable, InterfaceC3534 interfaceC3534) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 >= 4611686018427387903L) {
            return C3364.f11240;
        }
        long jNanoTime = System.nanoTime();
        C2644 c2644 = new C2644(runnable, j2 + jNanoTime);
        m9447(jNanoTime, c2644);
        return c2644;
    }

    @Override // p000.AbstractC5596
    /* JADX INFO: renamed from: ۦ۠ */
    public final void mo2413(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo2413(runnable);
    }
}
