package p000;

/* JADX INFO: renamed from: ۥٖؔ٘ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1459 implements InterfaceC4734 {

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC5130 f4977 = AbstractC3933.m7095(2, new C0871(25, this));

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0103 mo193() {
        return (InterfaceC0103) this.f4977.getValue();
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo196(InterfaceC2125 interfaceC2125) {
        InterfaceC0103 interfaceC0103Mo193 = mo193();
        InterfaceC5308 interfaceC5308Mo4114 = interfaceC2125.mo4114(interfaceC0103Mo193);
        int iMo6291 = interfaceC5308Mo4114.mo6291(mo193());
        if (iMo6291 != -1) {
            throw new C0480(AbstractC5078.m8670(iMo6291, "Unexpected index "));
        }
        interfaceC5308Mo4114.mo5156(interfaceC0103Mo193);
        return C2358.f7817;
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        C3782 c3782M6691 = c3782.m6691(mo193());
        mo193();
        c3782M6691.m6683();
    }
}
