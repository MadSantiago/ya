package p000;

/* JADX INFO: renamed from: ۥٌِۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1135 extends AbstractC3019 implements InterfaceC2766, InterfaceC3392, InterfaceC3569 {

    /* JADX INFO: renamed from: ۥٕ */
    public InterfaceC4448 f3969;

    /* JADX INFO: renamed from: ۥۙ */
    public boolean f3970;

    /* JADX INFO: renamed from: ۦؙ */
    public final C2439 f3971;

    public C1135(InterfaceC4448 interfaceC4448) {
        this.f3969 = interfaceC4448;
        C5410 c5410 = new C5410(4, this);
        C5639 c5639 = AbstractC2995.f10071;
        C2439 c2439 = new C2439(null, null, c5410);
        m5603(c2439);
        this.f3971 = c2439;
    }

    @Override // p000.InterfaceC2766
    /* JADX INFO: renamed from: ۥَ */
    public final long mo2391() {
        C4508 c4508 = AbstractC4009.f13363;
        InterfaceC2880 interfaceC2880 = AbstractC5537.m9270(this).f2236;
        c4508.getClass();
        int i = AbstractC3676.f12281;
        return AbstractC4225.m7458(interfaceC2880.mo743(10.0f), interfaceC2880.mo743(40.0f), interfaceC2880.mo743(10.0f), interfaceC2880.mo743(40.0f));
    }

    @Override // p000.InterfaceC3392
    /* JADX INFO: renamed from: ۥۥ */
    public final void mo2392(EnumC4125 enumC4125) {
        this.f3970 = enumC4125.m7315();
    }

    @Override // p000.InterfaceC2766
    /* JADX INFO: renamed from: ۦؓ */
    public final void mo783() {
        this.f3971.mo783();
    }

    @Override // p000.InterfaceC2766
    /* JADX INFO: renamed from: ۦؗ */
    public final void mo785(C5639 c5639, EnumC3834 enumC3834, long j) {
        this.f3971.mo785(c5639, enumC3834, j);
    }
}
