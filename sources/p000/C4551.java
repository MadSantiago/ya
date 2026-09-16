package p000;

/* JADX INFO: renamed from: ۦَٚؔۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4551 implements InterfaceC5635 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ boolean f15032;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ C2384 f15033;

    public C4551(C2384 c2384, boolean z) {
        this.f15033 = c2384;
        this.f15032 = z;
    }

    @Override // p000.InterfaceC5635
    /* JADX INFO: renamed from: ۥؗ */
    public final C5548 mo7875() {
        boolean z = this.f15032;
        C2384 c2384 = this.f15033;
        return z ? new C5548(c2384.mo1406(), 1) : new C5548(1, c2384.mo1406());
    }

    @Override // p000.InterfaceC5635
    /* JADX INFO: renamed from: ۥُ */
    public final int mo7876() {
        C2384 c2384 = this.f15033;
        return (-c2384.m1402().f7486) + c2384.m1402().f7493;
    }

    @Override // p000.InterfaceC5635
    /* JADX INFO: renamed from: ۥّ */
    public final float mo7877() {
        C2384 c2384 = this.f15033;
        return AbstractC0630.m1388(c2384.m1402(), c2384.mo1406());
    }

    @Override // p000.InterfaceC5635
    /* JADX INFO: renamed from: ۥۗ */
    public final float mo7878() {
        return C4773.m8128(this.f15033);
    }

    @Override // p000.InterfaceC5635
    /* JADX INFO: renamed from: ۥۣ */
    public final int mo7879() {
        C2384 c2384 = this.f15033;
        return (int) (c2384.m1402().f7485 == EnumC1616.f5425 ? c2384.m1402().m4300() & 4294967295L : c2384.m1402().m4300() >> 32);
    }

    @Override // p000.InterfaceC5635
    /* JADX INFO: renamed from: ۦؑ */
    public final Object mo7880(int i, C0700 c0700) {
        C2384 c2384 = this.f15033;
        Object objMo1392 = c2384.mo1392(EnumC4386.f14455, new C0700(c2384, i, null, 1), c0700);
        C2358 c2358 = C2358.f7817;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        if (objMo1392 != enumC2282) {
            objMo1392 = c2358;
        }
        return objMo1392 == enumC2282 ? objMo1392 : c2358;
    }
}
