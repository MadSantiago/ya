package p000;

import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: ۦؕؓؓ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3267 implements Closeable {

    /* JADX INFO: renamed from: ۥَ */
    public final C2106 f10971;

    /* JADX INFO: renamed from: ۥْ */
    public final C2489 f10972;

    /* JADX INFO: renamed from: ۥٓ */
    public final C2106 f10973;

    /* JADX INFO: renamed from: ۥٖ */
    public final ReentrantLock f10974;

    /* JADX INFO: renamed from: ۥۖ */
    public boolean f10975;

    /* JADX INFO: renamed from: ۦٗ */
    public final Condition f10976;

    /* JADX INFO: renamed from: ۦۛ */
    public final ArrayDeque f10977;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Process f10978;

    /* JADX INFO: renamed from: ۦۨ */
    public volatile int f10979;

    /* JADX INFO: renamed from: ۦٕ */
    public static final ExecutorService f10970 = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: ۥٙ */
    public static final boolean f10969 = false;

    public C3267(C1984 c1984, Process process) throws IOException {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f10974 = reentrantLock;
        this.f10976 = reentrantLock.newCondition();
        this.f10977 = new ArrayDeque();
        this.f10975 = false;
        this.f10979 = -1;
        this.f10978 = process;
        OutputStream outputStream = process.getOutputStream();
        this.f10972 = new C2489(outputStream instanceof BufferedOutputStream ? outputStream : new BufferedOutputStream(outputStream));
        this.f10973 = new C2106(process.getInputStream());
        this.f10971 = new C2106(process.getErrorStream());
        FutureTask futureTask = new FutureTask(new CallableC4849(3, this));
        f10970.execute(futureTask);
        try {
            try {
                this.f10979 = ((Integer) futureTask.get(20L, TimeUnit.SECONDS)).intValue();
            } catch (InterruptedException e) {
                throw new IOException("Shell check interrupted", e);
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof IOException)) {
                    throw new IOException("Unknown ExecutionException", cause);
                }
                throw ((IOException) cause);
            } catch (TimeoutException e3) {
                throw new IOException("Shell check timeout", e3);
            }
        } catch (IOException e4) {
            m6032();
            throw e4;
        }
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static void m6029(InterfaceC4573 interfaceC4573) {
        ExecutorC4322 executorC4322 = AbstractC1436.f4923;
        C3267 c3267M4815 = AbstractC2552.m4815();
        if (c3267M4815 == null) {
            f10970.execute(new RunnableC5689(14, executorC4322, interfaceC4573));
        } else if (executorC4322 == null) {
            interfaceC4573.mo395(c3267M4815);
        } else {
            executorC4322.execute(new RunnableC5689(15, interfaceC4573, c3267M4815));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f10979 < 0) {
            return;
        }
        m6032();
    }

    /* JADX INFO: renamed from: ۥَ */
    public final boolean m6030() {
        return this.f10979 >= 1;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final InterfaceC0964 m6031(boolean z) {
        ArrayDeque arrayDeque = this.f10977;
        ReentrantLock reentrantLock = this.f10974;
        reentrantLock.lock();
        try {
            InterfaceC0964 interfaceC0964 = (InterfaceC0964) arrayDeque.poll();
            if (interfaceC0964 == null) {
                this.f10975 = false;
                this.f10976.signalAll();
                reentrantLock.unlock();
                return null;
            }
            if (interfaceC0964 instanceof C1234) {
                C1234 c1234 = (C1234) interfaceC0964;
                c1234.f4254 = true;
                c1234.f4255.signal();
                reentrantLock.unlock();
                return null;
            }
            if (!z) {
                reentrantLock.unlock();
                return interfaceC0964;
            }
            arrayDeque.offerFirst(interfaceC0964);
            reentrantLock.unlock();
            f10970.execute(new RunnableC0029(17, this));
            return null;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final void m6032() {
        this.f10979 = -1;
        try {
            this.f10972.m4642();
        } catch (IOException unused) {
        }
        try {
            this.f10971.m4087();
        } catch (IOException unused2) {
        }
        try {
            this.f10973.m4087();
        } catch (IOException unused3) {
        }
        this.f10978.destroy();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m6033(InterfaceC0964 interfaceC0964) {
        ReentrantLock reentrantLock = this.f10974;
        reentrantLock.lock();
        try {
            if (this.f10975) {
                C1234 c1234 = new C1234(reentrantLock.newCondition());
                this.f10977.offer(c1234);
                while (!c1234.f4254) {
                    try {
                        c1234.f4255.await();
                    } catch (InterruptedException unused) {
                    }
                }
            }
            this.f10975 = true;
            reentrantLock.unlock();
            m6034(interfaceC0964);
            m6031(true);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final synchronized void m6034(InterfaceC0964 interfaceC0964) {
        if (this.f10979 < 0) {
            interfaceC0964.mo2003();
            return;
        }
        AbstractC5537.m9275(this.f10973);
        AbstractC5537.m9275(this.f10971);
        try {
            this.f10972.write(10);
            this.f10972.flush();
            interfaceC0964.mo2002(this.f10972, this.f10973, this.f10971);
        } catch (IOException unused) {
            m6032();
            interfaceC0964.mo2003();
        }
    }
}
