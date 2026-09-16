package p000;

/* JADX INFO: renamed from: ۦٖۣؗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4319 {

    /* JADX INFO: renamed from: ۥۗ */
    public C0851 f14282;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC3237 f14283;

    /* JADX INFO: renamed from: ۥؗ */
    public final C4033 f14280 = new C4033(this, 2);

    /* JADX INFO: renamed from: ۦؑ */
    public final C4033 f14284 = new C4033(this, 0);

    /* JADX INFO: renamed from: ۥُ */
    public final C4033 f14281 = new C4033(this, 1);

    public C4319(InterfaceC3237 interfaceC3237) {
        this.f14283 = interfaceC3237;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C0851 m7619() {
        C0851 c0851 = this.f14282;
        if (c0851 != null) {
            return c0851;
        }
        C1078.m2272("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
