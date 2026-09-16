package p000;

/* JADX INFO: renamed from: ۦۦؕٞۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5765 {

    /* JADX INFO: renamed from: ۦؑ */
    public static final C2346 f19004 = AbstractC2552.m4819(new C5338(18), new C1657(26));

    /* JADX INFO: renamed from: ۥؗ */
    public final C0811 f19005;

    /* JADX INFO: renamed from: ۥۗ */
    public final C0811 f19006;

    /* JADX INFO: renamed from: ۥۣ */
    public float f19007;

    public C5765(float f, float f2, float f3) {
        this.f19007 = f;
        this.f19006 = new C0811(f3);
        this.f19005 = new C0811(f2);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m9576(float f) {
        this.f19005.m1710(AbstractC4554.m7922(f, this.f19007, 0.0f));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final float m9577() {
        if (this.f19007 == 0.0f) {
            return 0.0f;
        }
        return this.f19005.m1711() / this.f19007;
    }
}
