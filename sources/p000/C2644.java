package p000;

/* JADX INFO: renamed from: ۥٌۢؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2644 extends AbstractRunnableC1169 {

    /* JADX INFO: renamed from: ۥْ */
    public final Runnable f8787;

    public C2644(Runnable runnable, long j) {
        super(j);
        this.f8787 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8787.run();
    }

    @Override // p000.AbstractRunnableC1169
    public final String toString() {
        return super.toString() + this.f8787;
    }
}
