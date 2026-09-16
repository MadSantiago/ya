package p000;

/* JADX INFO: renamed from: ۥٌٟؖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2018 implements InterfaceC4734 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC4734 f6654;

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC4734 f6655;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4734 f6656;

    /* JADX INFO: renamed from: ۦؑ */
    public final C2148 f6657 = AbstractC1631.m3428("kotlin.Triple", new InterfaceC0103[0], new C4884(22, this));

    public C2018(InterfaceC4734 interfaceC4734, InterfaceC4734 interfaceC4735, InterfaceC4734 interfaceC4736) {
        this.f6656 = interfaceC4734;
        this.f6655 = interfaceC4735;
        this.f6654 = interfaceC4736;
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0103 mo193() {
        return this.f6657;
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo196(InterfaceC2125 interfaceC2125) {
        C2148 c2148 = this.f6657;
        InterfaceC5308 interfaceC5308Mo4114 = interfaceC2125.mo4114(c2148);
        Object obj = AbstractC4489.f14854;
        Object objMo5162 = obj;
        Object objMo5163 = objMo5162;
        Object objMo5164 = objMo5163;
        while (true) {
            int iMo6291 = interfaceC5308Mo4114.mo6291(c2148);
            if (iMo6291 == -1) {
                interfaceC5308Mo4114.mo5156(c2148);
                if (objMo5162 == obj) {
                    throw new C0480("Element 'first' is missing");
                }
                if (objMo5163 == obj) {
                    throw new C0480("Element 'second' is missing");
                }
                if (objMo5164 != obj) {
                    return new C4060(objMo5162, objMo5163, objMo5164);
                }
                throw new C0480("Element 'third' is missing");
            }
            if (iMo6291 == 0) {
                objMo5162 = interfaceC5308Mo4114.mo5162(c2148, 0, this.f6656, null);
            } else if (iMo6291 == 1) {
                objMo5163 = interfaceC5308Mo4114.mo5162(c2148, 1, this.f6655, null);
            } else {
                if (iMo6291 != 2) {
                    throw new C0480(AbstractC5078.m8670(iMo6291, "Unexpected index "));
                }
                objMo5164 = interfaceC5308Mo4114.mo5162(c2148, 2, this.f6654, null);
            }
        }
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        C4060 c4060 = (C4060) obj;
        C2148 c2148 = this.f6657;
        C3782 c3782M6691 = c3782.m6691(c2148);
        c3782M6691.m6699(c2148, 0, this.f6656, c4060.f13529);
        c3782M6691.m6699(c2148, 1, this.f6655, c4060.f13528);
        c3782M6691.m6699(c2148, 2, this.f6654, c4060.f13527);
        c3782M6691.m6683();
    }
}
