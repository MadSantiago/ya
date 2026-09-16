package p000;

/* JADX INFO: renamed from: ۥؘۛؕ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2326 extends AbstractRunnableC4045 {

    /* JADX INFO: renamed from: ۥْ */
    public final Runnable f7700;

    public C2326(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.f7700 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7700.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f7700;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC4489.m7777(runnable));
        sb.append(", ");
        sb.append(this.f13486);
        sb.append(", ");
        return AbstractC5078.m8678(sb, this.f13485 ? "Blocking" : "Non-blocking", ']');
    }
}
