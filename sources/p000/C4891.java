package p000;

/* JADX INFO: renamed from: ۦؘۖؒۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4891 extends AbstractC5381 implements InterfaceC5671 {

    /* JADX INFO: renamed from: ۥً */
    public InterfaceC4448 f16105;

    /* JADX INFO: renamed from: ۥٕ */
    public EnumC1616 f16106;

    /* JADX INFO: renamed from: ۥۙ */
    public boolean f16107;

    /* JADX INFO: renamed from: ۥۦ */
    public C0642 f16108;

    /* JADX INFO: renamed from: ۦؖ */
    public final C0642 f16109 = new C0642(this, 0);

    /* JADX INFO: renamed from: ۦؙ */
    public C4323 f16110;

    /* JADX INFO: renamed from: ۦٚ */
    public InterfaceC5635 f16111;

    public C4891(InterfaceC4448 interfaceC4448, InterfaceC5635 interfaceC5635, EnumC1616 enumC1616, boolean z) {
        this.f16105 = interfaceC4448;
        this.f16111 = interfaceC5635;
        this.f16106 = enumC1616;
        this.f16107 = z;
        m8229();
    }

    /* JADX INFO: renamed from: ۥؑ */
    public final void m8229() {
        this.f16110 = new C4323(new C4276(this, 0), new C4276(this, 1));
        this.f16108 = this.f16107 ? new C0642(this, 1) : null;
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦؘ */
    public final boolean mo786() {
        return false;
    }

    @Override // p000.InterfaceC5671
    /* JADX INFO: renamed from: ۦٟ */
    public final void mo790(InterfaceC1066 interfaceC1066) {
        InterfaceC0504[] interfaceC0504Arr;
        AbstractC3992.m7136(interfaceC1066);
        interfaceC1066.mo2266(AbstractC2771.f9233, this.f16109);
        EnumC1616 enumC1616 = this.f16106;
        C4323 c4323 = this.f16110;
        if (enumC1616 == EnumC1616.f5425) {
            if (c4323 == null) {
                c4323 = null;
            }
            C3059 c3059 = AbstractC2771.f9209;
            interfaceC0504Arr = AbstractC3992.f13322;
            InterfaceC0504 interfaceC0504 = interfaceC0504Arr[13];
            interfaceC1066.mo2266(c3059, c4323);
        } else {
            if (c4323 == null) {
                c4323 = null;
            }
            C3059 c30510 = AbstractC2771.f9232;
            interfaceC0504Arr = AbstractC3992.f13322;
            InterfaceC0504 interfaceC0505 = interfaceC0504Arr[12];
            interfaceC1066.mo2266(c30510, c4323);
        }
        C0642 c0642 = this.f16108;
        if (c0642 != null) {
            interfaceC1066.mo2266(AbstractC0208.f766, new C0078(null, c0642));
        }
        interfaceC1066.mo2266(AbstractC0208.f763, new C0078(null, new C2932(27, new C4276(this, 2))));
        C5548 c5548Mo7875 = this.f16111.mo7875();
        C3059 c30511 = AbstractC2771.f9201;
        InterfaceC0504 interfaceC0506 = interfaceC0504Arr[24];
        interfaceC1066.mo2266(c30511, c5548Mo7875);
    }
}
