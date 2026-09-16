package p000;

/* JADX INFO: renamed from: ۦۗؒؖٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4950 {

    /* JADX INFO: renamed from: ۦۙ */
    public static final C2346 f16376 = AbstractC2552.m4819(new C5338(14), new C1657(21));

    /* JADX INFO: renamed from: ۥّ */
    public final C4852 f16379;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0811 f16381;

    /* JADX INFO: renamed from: ۥۗ */
    public final C0811 f16380 = new C0811(0.0f);

    /* JADX INFO: renamed from: ۥؗ */
    public final C0169 f16377 = new C0169(0);

    /* JADX INFO: renamed from: ۦؑ */
    public C2793 f16382 = C2793.f9340;

    /* JADX INFO: renamed from: ۥُ */
    public long f16378 = C3346.f11196;

    public C4950(EnumC1616 enumC1616, float f) {
        this.f16381 = new C0811(f);
        this.f16379 = new C4852(enumC1616, C1298.f4439);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m8332(EnumC1616 enumC1616, C2793 c2793, int i, int i2) {
        float f;
        float f2 = i2 - i;
        this.f16380.m1710(f2);
        float f3 = c2793.f9343;
        float f4 = c2793.f9342;
        C2793 c2794 = this.f16382;
        float f5 = c2794.f9343;
        C0811 c0811 = this.f16381;
        if (f3 != f5 || f4 != c2794.f9342) {
            boolean z = enumC1616 == EnumC1616.f5425;
            if (z) {
                f3 = f4;
            }
            float f6 = z ? c2793.f9344 : c2793.f9341;
            float fM1711 = c0811.m1711();
            float f7 = i;
            float f8 = fM1711 + f7;
            if (f6 <= f8 && (f3 >= fM1711 || f6 - f3 <= f7)) {
                f = (f3 >= fM1711 || f6 - f3 > f7) ? 0.0f : f3 - fM1711;
            } else {
                f = f6 - f8;
            }
            c0811.m1710(c0811.m1711() + f);
            this.f16382 = c2793;
        }
        c0811.m1710(AbstractC4554.m7922(c0811.m1711(), 0.0f, f2));
        this.f16377.m359(i);
    }
}
