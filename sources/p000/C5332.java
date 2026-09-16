package p000;

/* JADX INFO: renamed from: ۦَؚ۟ؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5332 implements InterfaceC5635 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ C0846 f17589;

    /* JADX INFO: renamed from: ۥۣ */
    public final C5704 f17590;

    public C5332(C0846 c0846) {
        this.f17589 = c0846;
        this.f17590 = AbstractC3004.m5600(new C0101(19, c0846));
    }

    @Override // p000.InterfaceC5635
    /* JADX INFO: renamed from: ۥؗ */
    public final C5548 mo7875() {
        return new C5548(((Number) this.f17590.getValue()).intValue(), 1);
    }

    @Override // p000.InterfaceC5635
    /* JADX INFO: renamed from: ۥُ */
    public final int mo7876() {
        C0846 c0846 = this.f17589;
        return (-c0846.m1759().f4369) + c0846.m1759().f4376;
    }

    @Override // p000.InterfaceC5635
    /* JADX INFO: renamed from: ۥّ */
    public final float mo7877() {
        C0846 c0846 = this.f17589;
        int iM1761 = c0846.m1761();
        int iM360 = ((C0169) c0846.f3020.f15684).m360();
        return c0846.mo1391() ? (iM1761 * 500) + iM360 + 100.0f : (iM1761 * 500) + iM360;
    }

    @Override // p000.InterfaceC5635
    /* JADX INFO: renamed from: ۥۗ */
    public final float mo7878() {
        C0846 c0846 = this.f17589;
        return (c0846.m1761() * 500) + ((C0169) c0846.f3020.f15684).m360();
    }

    @Override // p000.InterfaceC5635
    /* JADX INFO: renamed from: ۥۣ */
    public final int mo7879() {
        C0846 c0846 = this.f17589;
        return (int) (c0846.m1759().f4377 == EnumC1616.f5425 ? c0846.m1759().m2712() & 4294967295L : c0846.m1759().m2712() >> 32);
    }

    @Override // p000.InterfaceC5635
    /* JADX INFO: renamed from: ۦؑ */
    public final Object mo7880(int i, C0700 c0700) {
        C2346 c2346 = C0846.f3017;
        C0846 c0846 = this.f17589;
        c0846.getClass();
        Object objMo1392 = c0846.mo1392(EnumC4386.f14455, new C2718(c0846, i, (InterfaceC0443) null), c0700);
        C2358 c2358 = C2358.f7817;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        if (objMo1392 != enumC2282) {
            objMo1392 = c2358;
        }
        return objMo1392 == enumC2282 ? objMo1392 : c2358;
    }
}
