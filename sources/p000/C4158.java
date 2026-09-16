package p000;

/* JADX INFO: renamed from: ۦٔؑۜٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4158 extends AbstractC3925 {

    /* JADX INFO: renamed from: ۦۛ */
    public C2672 f13851;

    @Override // p000.AbstractC3925
    /* JADX INFO: renamed from: ۦٕ */
    public final int mo1447(C2024 c2024) {
        C2672 c2672 = this.f13851;
        int iMo1447 = c2672 != null ? c2672.mo1447(c2024) : 0;
        c2024.m3948(2);
        c2024.m3952(1, iMo1447);
        c2024.m3952(0, 0);
        int iM3950 = c2024.m3950();
        c2024.m3955(iM3950);
        return iM3950;
    }

    /* JADX INFO: renamed from: ۦۜ */
    public final void m7353(Class cls) {
        C2672 c2672 = new C2672();
        C2672.m4974(c2672, AbstractC1650.m3462(cls), 0, 6);
        this.f13851 = c2672;
    }
}
