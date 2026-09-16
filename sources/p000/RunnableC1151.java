package p000;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: renamed from: ۥّؓؗٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1151 extends AbstractOwnableSynchronizer implements Runnable {

    /* JADX INFO: renamed from: ۦۨ */
    public final RunnableC3314 f4004;

    public RunnableC1151(RunnableC3314 runnableC3314) {
        this.f4004 = runnableC3314;
    }

    public final String toString() {
        return this.f4004.toString();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m2407(Thread thread) {
        setExclusiveOwnerThread(thread);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
