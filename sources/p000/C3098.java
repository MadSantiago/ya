package p000;

/* JADX INFO: renamed from: ۦؒؓ٘ٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3098 extends AbstractC3925 {

    /* JADX INFO: renamed from: ۥۖ */
    public C0094 f10386;

    /* JADX INFO: renamed from: ۦٕ */
    public C2672 f10387;

    /* JADX INFO: renamed from: ۦۛ */
    public C2203 f10388;

    @Override // p000.AbstractC3925
    /* JADX INFO: renamed from: ۦٕ */
    public final int mo1447(C2024 c2024) {
        C2203 c2203 = this.f10388;
        int iMo1447 = c2203 != null ? c2203.mo1447(c2024) : 0;
        C0094 c0094 = this.f10386;
        int iMo1448 = c0094 != null ? c0094.mo1447(c2024) : 0;
        C2672 c2672 = this.f10387;
        int iMo1449 = c2672 != null ? c2672.mo1447(c2024) : 0;
        c2024.m3948(10);
        c2024.m3952(9, 0);
        c2024.m3952(8, 0);
        c2024.m3952(7, 0);
        c2024.m3952(6, 0);
        c2024.m3952(5, 0);
        c2024.m3952(4, 0);
        c2024.m3952(3, iMo1449);
        c2024.m3952(2, 0);
        c2024.m3952(1, iMo1448);
        c2024.m3952(0, iMo1447);
        int iM3950 = c2024.m3950();
        c2024.m3955(iM3950);
        return iM3950;
    }

    /* JADX INFO: renamed from: ۦۜ */
    public final void m5686(Class cls) {
        C2672 c2672 = new C2672();
        C2672.m4974(c2672, AbstractC1650.m3462(cls), 0, 6);
        this.f10387 = c2672;
    }
}
