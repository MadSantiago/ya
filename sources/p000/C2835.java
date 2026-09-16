package p000;

/* JADX INFO: renamed from: ۥۦًؘٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2835 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f9470;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f9471;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f9472;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC0705 f9473;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f9474 = 0;

    public /* synthetic */ C2835(InterfaceC4448 interfaceC4448, InterfaceC0705 interfaceC0705, C2750 c2750, InterfaceC5572 interfaceC5572, int i) {
        this.f9471 = interfaceC4448;
        this.f9473 = interfaceC0705;
        this.f9472 = c2750;
        this.f9470 = interfaceC5572;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f9474;
        C2358 c2358 = C2358.f7817;
        Object obj3 = this.f9470;
        Object obj4 = this.f9472;
        Object obj5 = this.f9471;
        int i2 = 1;
        switch (i) {
            case 0:
                InterfaceC4367 interfaceC4367 = (InterfaceC4367) obj5;
                C0857 c0857 = (C0857) obj4;
                C4817 c4817 = (C4817) obj3;
                C5362 c5362 = (C5362) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c5362.m8982();
                } else {
                    Object objM8999 = c5362.m8999();
                    C4036 c4036 = C2850.f9517;
                    if (objM8999 == c4036) {
                        objM8999 = new C2136(interfaceC4367, i2);
                        c5362.m8987(objM8999);
                    }
                    InterfaceC0705 interfaceC0705M4198 = AbstractC2164.m4198(this.f9473, (InterfaceC4745) objM8999);
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
                    c0857.mo219(c5362, 0);
                    Object objM89910 = c5362.m8999();
                    if (objM89910 == c4036) {
                        objM89910 = new C0681(interfaceC4367, 1);
                        c5362.m8987(objM89910);
                    }
                    c4817.m8193((InterfaceC4448) objM89910, c5362, 6);
                    c5362.m9009(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC5568.m9351((InterfaceC4448) obj5, this.f9473, (C2750) obj4, (InterfaceC5572) obj3, (C5362) obj, AbstractC3831.m6835(1));
                break;
        }
        return c2358;
    }

    public /* synthetic */ C2835(InterfaceC0705 interfaceC0705, InterfaceC4367 interfaceC4367, C0857 c0857, C4817 c4817) {
        this.f9473 = interfaceC0705;
        this.f9471 = interfaceC4367;
        this.f9472 = c0857;
        this.f9470 = c4817;
    }
}
