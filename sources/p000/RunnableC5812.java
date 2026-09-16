package p000;

/* JADX INFO: renamed from: ۦؘۧؒۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5812 implements Runnable {

    /* JADX INFO: renamed from: ۦۨ */
    public RunnableC5382 f19136;

    @Override // java.lang.Runnable
    public final synchronized void run() {
        this.f19136.run();
        this.f19136 = null;
        notifyAll();
    }
}
