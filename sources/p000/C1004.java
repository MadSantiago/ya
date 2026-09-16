package p000;

/* JADX INFO: renamed from: ۥَؔۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1004 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ InterfaceC3320 f3586;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C3738 f3587;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f3588;

    public /* synthetic */ C1004(C3738 c3738, InterfaceC3320 interfaceC3320, int i) {
        this.f3588 = i;
        this.f3587 = c3738;
        this.f3586 = interfaceC3320;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f3588;
        Object obj = C2358.f7817;
        int i2 = 0;
        int i3 = 2;
        InterfaceC3320 interfaceC3320 = this.f3586;
        C3738 c3738 = this.f3587;
        switch (i) {
            case 0:
                C1484 c1484 = c3738.f12446;
                C0101 c0101 = new C0101(i3, interfaceC3320);
                C5450 c5450 = new C5450();
                c3738.f12445.m9077("dataBuilder", c1484, new C1225(i2, c5450, c0101));
                Object obj2 = c5450.f17965;
                if (obj2 != null) {
                    obj = obj2;
                }
                return (C1197) obj;
            case 1:
                C1484 c1485 = c3738.f12453;
                C1004 c1004 = new C1004(c3738, interfaceC3320, i3);
                C5450 c5451 = new C5450();
                c3738.f12445.m9077("positioner", c1485, new C1225(i2, c5451, c1004));
                Object obj3 = c5451.f17965;
                if (obj3 != null) {
                    obj = obj3;
                }
                return (C2793) obj;
            default:
                Object objMo449 = c3738.f12444.mo449();
                if (!((InterfaceC2015) objMo449).mo2807()) {
                    objMo449 = null;
                }
                InterfaceC2015 interfaceC2015 = (InterfaceC2015) objMo449;
                return interfaceC2015 == null ? C2793.f9340 : interfaceC3320.mo778(interfaceC2015).m5323(interfaceC2015.mo2808(0L));
        }
    }
}
