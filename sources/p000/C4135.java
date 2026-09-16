package p000;

/* JADX INFO: renamed from: ۦؘٓؖٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4135 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f13760;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f13761;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f13762;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ InterfaceC0400 f13763;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C0857 f13764;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f13765 = 1;

    public /* synthetic */ C4135(InterfaceC5731 interfaceC5731, InterfaceC5731 interfaceC5732, C0857 c0857, InterfaceC5731 interfaceC5733, InterfaceC5731 interfaceC5734, int i) {
        this.f13761 = interfaceC5731;
        this.f13762 = interfaceC5732;
        this.f13764 = c0857;
        this.f13760 = interfaceC5733;
        this.f13763 = interfaceC5734;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f13765;
        C2358 c2358 = C2358.f7817;
        InterfaceC0400 interfaceC0400 = this.f13763;
        Object obj3 = this.f13760;
        Object obj4 = this.f13762;
        Object obj5 = this.f13761;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0993.m2166((InterfaceC5731) obj5, (InterfaceC5731) obj4, this.f13764, (InterfaceC5731) obj3, (InterfaceC5731) interfaceC0400, (C5362) obj, AbstractC3831.m6835(385));
                break;
            default:
                InterfaceC0705 interfaceC0705 = (InterfaceC0705) obj5;
                InterfaceC4367 interfaceC4367 = (InterfaceC4367) obj4;
                C4817 c4817 = (C4817) obj3;
                InterfaceC4448 interfaceC4448 = (InterfaceC4448) interfaceC0400;
                C5362 c5362 = (C5362) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c5362.m8982();
                } else {
                    Object objM8999 = c5362.m8999();
                    if (objM8999 == C2850.f9517) {
                        objM8999 = new C2136(interfaceC4367, 5);
                        c5362.m8987(objM8999);
                    }
                    InterfaceC0705 interfaceC0705M4198 = AbstractC2164.m4198(interfaceC0705, (InterfaceC4745) objM8999);
                    InterfaceC3228 interfaceC3228M2297 = AbstractC1089.m2297(C1298.f4456, true);
                    int iHashCode = Long.hashCode(c5362.f17657);
                    C2103 c2103M8994 = c5362.m8994();
                    InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705M4198);
                    InterfaceC4576.f15106.getClass();
                    C3709 c3709 = C0849.f3049;
                    c5362.m8983();
                    if (c5362.f17668) {
                        c5362.m9005(c3709);
                    } else {
                        c5362.m8972();
                    }
                    AbstractC0993.m2127(C0849.f3048, c5362, interfaceC3228M2297);
                    AbstractC0993.m2127(C0849.f3047, c5362, c2103M8994);
                    AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode));
                    AbstractC0993.m2146(c5362, C0849.f3050);
                    AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
                    this.f13764.mo219(c5362, 0);
                    c4817.m8193(interfaceC4448, c5362, 6);
                    c5362.m9009(true);
                }
                break;
        }
        return c2358;
    }

    public /* synthetic */ C4135(InterfaceC0705 interfaceC0705, InterfaceC4367 interfaceC4367, C0857 c0857, C4817 c4817, InterfaceC4448 interfaceC4448) {
        this.f13761 = interfaceC0705;
        this.f13762 = interfaceC4367;
        this.f13764 = c0857;
        this.f13760 = c4817;
        this.f13763 = interfaceC4448;
    }
}
