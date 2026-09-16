package p000;

/* JADX INFO: renamed from: ۦٗؕؐۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4366 {

    /* JADX INFO: renamed from: ۥۜ */
    public static C4366 f14372;

    /* JADX INFO: renamed from: ۥؗ */
    public final C1634 f14373;

    /* JADX INFO: renamed from: ۥُ */
    public final C3564 f14374;

    /* JADX INFO: renamed from: ۥۗ */
    public final C3564 f14376;

    /* JADX INFO: renamed from: ۥۣ */
    public final EnumC2459 f14377;

    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC4434 f14378;

    /* JADX INFO: renamed from: ۥّ */
    public float f14375 = Float.NaN;

    /* JADX INFO: renamed from: ۦۙ */
    public float f14379 = Float.NaN;

    public C4366(EnumC2459 enumC2459, C3564 c3564, C1634 c1634, InterfaceC4434 interfaceC4434) {
        this.f14377 = enumC2459;
        this.f14376 = c3564;
        this.f14373 = c1634;
        this.f14378 = interfaceC4434;
        this.f14374 = AbstractC5537.m9238(c3564, enumC2459);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final long m7673(long j, int i) {
        int iM6555;
        float f = this.f14379;
        float f2 = this.f14375;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = AbstractC5249.f17321;
            long jM1494 = AbstractC0671.m1494(0, 0, 0, 0, 15);
            C3564 c3564 = this.f14374;
            C1634 c1634 = this.f14373;
            float fM7592 = AbstractC5537.m9217(str, c3564, jM1494, c1634, this.f14378, 1, 96).m7592();
            float fM7593 = AbstractC5537.m9217(AbstractC5249.f17320, c3564, AbstractC0671.m1494(0, 0, 0, 0, 15), c1634, this.f14378, 2, 96).m7592() - fM7592;
            this.f14379 = fM7592;
            this.f14375 = fM7593;
            f2 = fM7593;
            f = fM7592;
        }
        if (i != 1) {
            int iRound = Math.round((f2 * (i - 1)) + f);
            iM6555 = iRound >= 0 ? iRound : 0;
            int iM6551 = C3693.m6551(j);
            if (iM6555 > iM6551) {
                iM6555 = iM6551;
            }
        } else {
            iM6555 = C3693.m6555(j);
        }
        return AbstractC0671.m1496(C3693.m6557(j), C3693.m6556(j), iM6555, C3693.m6551(j));
    }
}
