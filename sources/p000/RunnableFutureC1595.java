package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: ۥَ٘ؖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableFutureC1595 extends AbstractC5352 implements RunnableFuture {

    /* JADX INFO: renamed from: ۥۖ */
    public volatile RunnableC3314 f5353;

    public RunnableFutureC1595(Callable callable) {
        this.f5353 = new RunnableC3314(this, callable);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        RunnableC3314 runnableC3314 = this.f5353;
        if (runnableC3314 != null) {
            runnableC3314.run();
        }
        this.f5353 = null;
    }

    @Override // p000.AbstractC0032
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo2772() {
        RunnableC3314 runnableC3314;
        if (m3767() && (runnableC3314 = this.f5353) != null) {
            RunnableC2054 runnableC2054 = RunnableC3314.f11100;
            RunnableC2054 runnableC2055 = RunnableC3314.f11101;
            Runnable runnable = (Runnable) runnableC3314.get();
            if (runnable instanceof Thread) {
                RunnableC1151 runnableC1151 = new RunnableC1151(runnableC3314);
                runnableC1151.m2407(Thread.currentThread());
                if (runnableC3314.compareAndSet(runnable, runnableC1151)) {
                    try {
                        ((Thread) runnable).interrupt();
                        if (((Runnable) runnableC3314.getAndSet(runnableC2055)) == runnableC2054) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) runnableC3314.getAndSet(runnableC2055)) == runnableC2054) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th;
                    }
                }
            }
        }
        this.f5353 = null;
    }

    @Override // p000.AbstractC0032
    /* JADX INFO: renamed from: ۦِ */
    public final String mo2773() {
        RunnableC3314 runnableC3314 = this.f5353;
        if (runnableC3314 == null) {
            return super.mo2773();
        }
        String strValueOf = String.valueOf(runnableC3314);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 7);
        sb.append("task=[");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }
}
