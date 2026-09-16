package p000;

/* JADX INFO: renamed from: ۦًِؓؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3165 extends AbstractC3019 implements InterfaceC5671, InterfaceC0882, InterfaceC4825, InterfaceC0349, InterfaceC0289 {

    /* JADX INFO: renamed from: ۦُ */
    public static final C4992 f10648 = new C4992(10);

    /* JADX INFO: renamed from: ۥٕ */
    public C2243 f10649;

    /* JADX INFO: renamed from: ۥۙ */
    public final InterfaceC4745 f10650;

    /* JADX INFO: renamed from: ۥۦ */
    public InterfaceC2015 f10651;

    /* JADX INFO: renamed from: ۦؖ */
    public C1506 f10652;

    /* JADX INFO: renamed from: ۦؗ */
    public final C3468 f10653;

    /* JADX INFO: renamed from: ۦؙ */
    public C3213 f10654;

    public C3165(C2243 c2243, int i, C0037 c0037) {
        this.f10649 = c2243;
        this.f10650 = c0037;
        C3468 c3468 = new C3468(i, new C2492(2, this, C3165.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 1), 10);
        m5603(c3468);
        this.f10653 = c3468;
    }

    /* JADX INFO: renamed from: ۥؐ */
    public final void m5841(C2243 c2243, InterfaceC2714 interfaceC2714) {
        if (!this.f17786) {
            c2243.m4291(interfaceC2714);
        } else {
            InterfaceC3196 interfaceC3196 = (InterfaceC3196) ((C3950) m9076()).f13208.mo865(C1397.f4791);
            AbstractC2765.m5135(m9076(), null, 0, new C0061(c2243, interfaceC2714, interfaceC3196 != null ? interfaceC3196.mo859(new C0079(15, c2243, interfaceC2714)) : null, null, 18), 3);
        }
    }

    @Override // p000.InterfaceC0289
    /* JADX INFO: renamed from: ۥٓ */
    public final Object mo612() {
        return f10648;
    }

    /* JADX INFO: renamed from: ۦؕ */
    public final void m5842(C2243 c2243) {
        C3213 c3213;
        if (AbstractC3831.m6874(this.f10649, c2243)) {
            return;
        }
        C2243 c2244 = this.f10649;
        if (c2244 != null && (c3213 = this.f10654) != null) {
            c2244.m4291(new C4315(c3213));
        }
        this.f10654 = null;
        this.f10649 = c2243;
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦؘ */
    public final boolean mo786() {
        return false;
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦً */
    public final void mo1267() {
        C1506 c1506 = this.f10652;
        if (c1506 != null) {
            c1506.m3182();
        }
        this.f10652 = null;
    }

    @Override // p000.InterfaceC0349
    /* JADX INFO: renamed from: ۦٖ */
    public final void mo772() {
        C5450 c5450 = new C5450();
        AbstractC5568.m9359(this, new C1225(12, c5450, this));
        C1506 c1506 = (C1506) c5450.f17965;
        if (this.f10653.m6254().m7315()) {
            C1506 c1507 = this.f10652;
            if (c1507 != null) {
                c1507.m3182();
            }
            if (c1506 != null) {
                c1506.m3183();
            } else {
                c1506 = null;
            }
            this.f10652 = c1506;
        }
    }

    @Override // p000.InterfaceC5671
    /* JADX INFO: renamed from: ۦٟ */
    public final void mo790(InterfaceC1066 interfaceC1066) {
        boolean zM7315 = this.f10653.m6254().m7315();
        InterfaceC0504[] interfaceC0504Arr = AbstractC3992.f13322;
        C3059 c3059 = AbstractC2771.f9220;
        InterfaceC0504 interfaceC0504 = AbstractC3992.f13322[4];
        interfaceC1066.mo2266(c3059, Boolean.valueOf(zM7315));
        interfaceC1066.mo2266(AbstractC0208.f771, new C0078(null, new C3548(0, this, C3165.class, "requestFocus", "requestFocus()Z", 0, 5)));
    }

    @Override // p000.InterfaceC0882
    /* JADX INFO: renamed from: ۦۛ */
    public final void mo1728(AbstractC1311 abstractC1311) {
        this.f10651 = abstractC1311;
        if (this.f10653.m6254().m7315()) {
            boolean z = abstractC1311.mo2787().f17786;
            C4036 c4036 = AbstractC2092.f6886;
            if (!z) {
                if (this.f17786) {
                    AbstractC5378.m9068(this, c4036);
                }
            } else {
                InterfaceC2015 interfaceC2015 = this.f10651;
                if (interfaceC2015 != null && interfaceC2015.mo2807() && this.f17786) {
                    AbstractC5378.m9068(this, c4036);
                }
            }
        }
    }
}
