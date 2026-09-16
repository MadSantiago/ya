package p000;

/* JADX INFO: renamed from: ۦۥؔۦ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5710 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f18797;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ int f18798;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f18799;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ Object f18800;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ Object f18801;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ Object f18802;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ Object f18803;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ boolean f18804;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f18805 = 0;

    public /* synthetic */ C5710(C3635 c3635, C5837 c5837, boolean z, InterfaceC4745 interfaceC4745, C5745 c5745, InterfaceC4120 interfaceC4120, InterfaceC2880 interfaceC2880, int i) {
        this.f18799 = c3635;
        this.f18797 = c5837;
        this.f18804 = z;
        this.f18800 = interfaceC4745;
        this.f18802 = c5745;
        this.f18803 = interfaceC4120;
        this.f18801 = interfaceC2880;
        this.f18798 = i;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f18805;
        C2358 c2358 = C2358.f7817;
        Object obj3 = this.f18801;
        Object obj4 = this.f18803;
        Object obj5 = this.f18802;
        Object obj6 = this.f18800;
        Object obj7 = this.f18797;
        Object obj8 = this.f18799;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                C4773.m8149((EnumC2887) obj8, (InterfaceC4448) obj7, (C3579) obj6, (C3579) obj5, (InterfaceC0705) obj4, this.f18804, (C3597) obj3, (C5362) obj, AbstractC3831.m6835(this.f18798 | 1));
                break;
            default:
                C3635 c3635 = (C3635) obj8;
                C5837 c5837 = (C5837) obj7;
                InterfaceC4745 interfaceC4745 = (InterfaceC4745) obj6;
                C5745 c5745 = (C5745) obj5;
                InterfaceC4120 interfaceC4120 = (InterfaceC4120) obj4;
                InterfaceC2880 interfaceC2880 = (InterfaceC2880) obj3;
                C5362 c5362 = (C5362) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c5362.m8982();
                } else {
                    C1483 c1483 = new C1483(c5837, interfaceC4745, c5745, interfaceC4120, interfaceC2880, this.f18798);
                    int iHashCode = Long.hashCode(c5362.f17657);
                    C2103 c2103M8994 = c5362.m8994();
                    InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, C4217.f13994);
                    InterfaceC4576.f15106.getClass();
                    C3709 c3709 = C0849.f3049;
                    c5362.m8983();
                    if (c5362.f17668) {
                        c5362.m9005(c3709);
                    } else {
                        c5362.m8972();
                    }
                    AbstractC0993.m2127(C0849.f3048, c5362, c1483);
                    AbstractC0993.m2127(C0849.f3047, c5362, c2103M8994);
                    AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode));
                    AbstractC0993.m2146(c5362, C0849.f3050);
                    AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
                    c5362.m9009(true);
                    EnumC1546 enumC1546M9647 = c5837.m9647();
                    EnumC1546 enumC1546 = EnumC1546.f5232;
                    boolean z = this.f18804;
                    AbstractC2776.m5211(c3635, enumC1546M9647 != enumC1546 && c5837.m9643() != null && c5837.m9643().mo2807() && z, c5362, 0);
                    if (c5837.m9647() == EnumC1546.f5229 && z) {
                        c5362.m8957(-714666198);
                        AbstractC2776.m5234(c3635, c5362, 0);
                        c5362.m9009(false);
                    } else {
                        c5362.m8957(-714589318);
                        c5362.m9009(false);
                    }
                }
                break;
        }
        return c2358;
    }

    public /* synthetic */ C5710(EnumC2887 enumC2887, InterfaceC4448 interfaceC4448, C3579 c3579, C3579 c35710, InterfaceC0705 interfaceC0705, boolean z, C3597 c3597, int i) {
        this.f18799 = enumC2887;
        this.f18797 = interfaceC4448;
        this.f18800 = c3579;
        this.f18802 = c35710;
        this.f18803 = interfaceC0705;
        this.f18804 = z;
        this.f18801 = c3597;
        this.f18798 = i;
    }
}
