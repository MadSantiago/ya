package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۦًؚؒؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3644 extends AbstractC0243 {

    /* JADX INFO: renamed from: ۥٙ */
    public static final AtomicLong f12196 = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: ۥَ */
    public final PriorityBlockingQueue f12197;

    /* JADX INFO: renamed from: ۥْ */
    public C2056 f12198;

    /* JADX INFO: renamed from: ۥٓ */
    public C2056 f12199;

    /* JADX INFO: renamed from: ۥٖ */
    public final LinkedBlockingQueue f12200;

    /* JADX INFO: renamed from: ۥۖ */
    public final Object f12201;

    /* JADX INFO: renamed from: ۦٕ */
    public final Semaphore f12202;

    /* JADX INFO: renamed from: ۦٗ */
    public final C4875 f12203;

    /* JADX INFO: renamed from: ۦۛ */
    public final C4875 f12204;

    public C3644(C5371 c5371) {
        super(c5371);
        this.f12201 = new Object();
        this.f12202 = new Semaphore(2);
        this.f12197 = new PriorityBlockingQueue();
        this.f12200 = new LinkedBlockingQueue();
        this.f12203 = new C4875(this, "Thread death: Uncaught exception on worker thread");
        this.f12204 = new C4875(this, "Thread death: Uncaught exception on network thread");
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final Object m6514(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            C3644 c3644 = ((C5371) this.f18660).f17733;
            C5371.m9020(c3644);
            c3644.m6515(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                C3610 c3610 = ((C5371) this.f18660).f17717;
                C5371.m9020(c3610);
                C5590 c5590 = c3610.f12022;
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                c5590.m9432(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            C3610 c3611 = ((C5371) this.f18660).f17717;
            C5371.m9020(c3611);
            c3611.f12022.m9432("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final void m6515(Runnable runnable) {
        m503();
        AbstractC0487.m1047(runnable);
        m6523(new C5720(this, runnable, false, "Task exception on worker thread"));
    }

    /* JADX INFO: renamed from: ۥً */
    public final void m6516(Runnable runnable) {
        m503();
        C5720 c5720 = new C5720(this, runnable, false, "Task exception on network thread");
        synchronized (this.f12201) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.f12200;
                linkedBlockingQueue.add(c5720);
                C2056 c2056 = this.f12199;
                if (c2056 == null) {
                    C2056 c2057 = new C2056(this, "Measurement Network", linkedBlockingQueue);
                    this.f12199 = c2057;
                    c2057.setUncaughtExceptionHandler(this.f12204);
                    this.f12199.start();
                } else {
                    Object obj = c2056.f6774;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC5676
    /* JADX INFO: renamed from: ۥْ */
    public final void mo6517() {
        if (Thread.currentThread() == this.f12198) {
            return;
        }
        C1078.m2276("Call expected from worker thread");
    }

    @Override // p000.AbstractC0243
    /* JADX INFO: renamed from: ۥٓ */
    public final boolean mo504() {
        return false;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final C5720 m6518(Callable callable) {
        m503();
        C5720 c5720 = new C5720(this, callable, true);
        if (Thread.currentThread() == this.f12198) {
            c5720.run();
            return c5720;
        }
        m6523(c5720);
        return c5720;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final boolean m6519() {
        return Thread.currentThread() == this.f12198;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final void m6520(Runnable runnable) {
        m503();
        m6523(new C5720(this, runnable, true, "Task exception on worker thread"));
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final C5720 m6521(Callable callable) {
        m503();
        C5720 c5720 = new C5720(this, callable, false);
        if (Thread.currentThread() != this.f12198) {
            m6523(c5720);
            return c5720;
        }
        if (!this.f12197.isEmpty()) {
            C3610 c3610 = ((C5371) this.f18660).f17717;
            C5371.m9020(c3610);
            c3610.f12022.m9432("Callable skipped the worker queue.");
        }
        c5720.run();
        return c5720;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final void m6522() {
        if (Thread.currentThread() == this.f12199) {
            return;
        }
        C1078.m2276("Call expected from network thread");
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final void m6523(C5720 c5720) {
        synchronized (this.f12201) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f12197;
                priorityBlockingQueue.add(c5720);
                C2056 c2056 = this.f12198;
                if (c2056 == null) {
                    C2056 c2057 = new C2056(this, "Measurement Worker", priorityBlockingQueue);
                    this.f12198 = c2057;
                    c2057.setUncaughtExceptionHandler(this.f12203);
                    this.f12198.start();
                } else {
                    Object obj = c2056.f6774;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final void m6524() {
        if (Thread.currentThread() != this.f12198) {
            return;
        }
        C1078.m2276("Call not expected from worker thread");
    }
}
