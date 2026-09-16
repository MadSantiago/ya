package p000;

/* JADX INFO: renamed from: ۥْٙؓٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1644 extends RuntimeException {

    /* JADX INFO: renamed from: ۦ۟ */
    public final Throwable f5491;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f5492;

    public C1644(int i, Throwable th) {
        super(th);
        this.f5492 = i;
        this.f5491 = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f5491;
    }
}
