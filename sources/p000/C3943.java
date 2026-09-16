package p000;

import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ۦِؒؒؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3943 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f13157;

    /* JADX INFO: renamed from: ۥُ */
    public final int f13158;

    /* JADX INFO: renamed from: ۥّ */
    public final ArrayBlockingQueue f13159;

    /* JADX INFO: renamed from: ۥۗ */
    public final double f13160;

    /* JADX INFO: renamed from: ۥۜ */
    public final C1414 f13161;

    /* JADX INFO: renamed from: ۥۣ */
    public final double f13162;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f13163;

    /* JADX INFO: renamed from: ۦِ */
    public int f13164;

    /* JADX INFO: renamed from: ۦٛ */
    public final C3369 f13165;

    /* JADX INFO: renamed from: ۦۗ */
    public long f13166;

    /* JADX INFO: renamed from: ۦۙ */
    public final ThreadPoolExecutor f13167;

    public C3943(C1414 c1414, C5040 c5040, C3369 c3369) {
        double d = c5040.f16725;
        double d2 = c5040.f16721;
        long j = ((long) c5040.f16722) * 1000;
        this.f13162 = d;
        this.f13160 = d2;
        this.f13157 = j;
        this.f13161 = c1414;
        this.f13165 = c3369;
        this.f13163 = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.f13158 = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f13159 = arrayBlockingQueue;
        this.f13167 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f13164 = 0;
        this.f13166 = 0L;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m7104(final C3384 c3384, final C2332 c2332) {
        String str = "Sending report through Google DataTransport: " + c3384.f11281;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        final boolean z = SystemClock.elapsedRealtime() - this.f13163 < 2000;
        this.f13161.m2995(new C2937(c3384.f11282, EnumC4021.f13409), new InterfaceC4070() { // from class: ۥٝؔۜؓ
            @Override // p000.InterfaceC4070
            /* JADX INFO: renamed from: ۥۣ */
            public final void mo398(Exception exc) throws Throwable {
                C2332 c2333 = c2332;
                if (exc != null) {
                    c2333.m4375(exc);
                    return;
                }
                if (z) {
                    boolean z2 = true;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new RunnableC5689(17, this.f6257, countDownLatch)).start();
                    ExecutorService executorService = AbstractC1242.f4274;
                    boolean z3 = false;
                    try {
                        long jNanoTime = 2000000000;
                        long jNanoTime2 = System.nanoTime() + 2000000000;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(jNanoTime, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (Throwable th) {
                                    th = th;
                                    if (z2) {
                                        Thread.currentThread().interrupt();
                                    }
                                    throw th;
                                }
                            } catch (InterruptedException unused) {
                                jNanoTime = jNanoTime2 - System.nanoTime();
                                z3 = true;
                            }
                        }
                        if (z3) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z3;
                    }
                }
                c2333.m4374(c3384);
            }
        });
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m7105() {
        if (this.f13166 == 0) {
            this.f13166 = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f13166) / this.f13157);
        int size = this.f13159.size();
        int i = this.f13164;
        int iMin = size == this.f13158 ? Math.min(100, i + iCurrentTimeMillis) : Math.max(0, i - iCurrentTimeMillis);
        if (this.f13164 != iMin) {
            this.f13164 = iMin;
            this.f13166 = System.currentTimeMillis();
        }
        return iMin;
    }
}
