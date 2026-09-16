package p000;

/* JADX INFO: renamed from: ۦۢؕٔٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5543 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C0857 f18312;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f18313;

    public /* synthetic */ C5543(int i, C0857 c0857) {
        this.f18313 = i;
        this.f18312 = c0857;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f18313;
        C4217 c4217 = C4217.f13994;
        C2358 c2358 = C2358.f7817;
        C0857 c0857 = this.f18312;
        int i2 = 0;
        switch (i) {
            case 0:
                C5362 c5362 = (C5362) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c5362.m8982();
                } else {
                    c5362.m8957(-1102039173);
                    c5362.m9009(false);
                    c0857.mo219(c5362, 0);
                }
                break;
            case 1:
                C5362 c5363 = (C5362) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!c5363.m9011(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c5363.m8982();
                } else {
                    C1393 c1393 = AbstractC4753.f15691;
                    AbstractC4753.m8079(AbstractC3925.m7034(-459506658, new C5543(i2, c0857), c5363), c5363, 438);
                }
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C5362 c5364 = (C5362) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!c5364.m9011(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c5364.m8982();
                } else {
                    InterfaceC0705 interfaceC0705M7705 = AbstractC4410.m7705(c4217, 56.0f, 56.0f);
                    InterfaceC3228 interfaceC3228M2297 = AbstractC1089.m2297(C1298.f4431, false);
                    int iM1958 = AbstractC0949.m1958(c5364);
                    C2103 c2103M8994 = c5364.m8994();
                    InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5364, interfaceC0705M7705);
                    InterfaceC4576.f15106.getClass();
                    C3709 c3709 = C0849.f3049;
                    c5364.m8983();
                    if (c5364.f17668) {
                        c5364.m9005(c3709);
                    } else {
                        c5364.m8972();
                    }
                    AbstractC0993.m2127(C0849.f3048, c5364, interfaceC3228M2297);
                    AbstractC0993.m2127(C0849.f3047, c5364, c2103M8994);
                    C3136 c3136 = C0849.f3053;
                    if (c5364.f17668 || !AbstractC3831.m6874(c5364.m8999(), Integer.valueOf(iM1958))) {
                        AbstractC3761.m6618(iM1958, c5364, iM1958, c3136);
                    }
                    AbstractC0993.m2127(C0849.f3052, c5364, interfaceC0705M2161);
                    c0857.mo219(c5364, 0);
                    c5364.m9009(true);
                }
                break;
            default:
                C5362 c5365 = (C5362) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!c5365.m9011(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    c5365.m8982();
                } else {
                    InterfaceC0705 interfaceC0705M1922 = AbstractC0949.m1922(c4217, "Container");
                    InterfaceC3228 interfaceC3228M2298 = AbstractC1089.m2297(C1298.f4456, true);
                    int iM1959 = AbstractC0949.m1958(c5365);
                    C2103 c2103M8995 = c5365.m8994();
                    InterfaceC0705 interfaceC0705M2162 = AbstractC0993.m2161(c5365, interfaceC0705M1922);
                    InterfaceC4576.f15106.getClass();
                    C3709 c37010 = C0849.f3049;
                    c5365.m8983();
                    if (c5365.f17668) {
                        c5365.m9005(c37010);
                    } else {
                        c5365.m8972();
                    }
                    AbstractC0993.m2127(C0849.f3048, c5365, interfaceC3228M2298);
                    AbstractC0993.m2127(C0849.f3047, c5365, c2103M8995);
                    C3136 c3137 = C0849.f3053;
                    if (c5365.f17668 || !AbstractC3831.m6874(c5365.m8999(), Integer.valueOf(iM1959))) {
                        AbstractC3761.m6618(iM1959, c5365, iM1959, c3137);
                    }
                    AbstractC0993.m2127(C0849.f3052, c5365, interfaceC0705M2162);
                    c0857.mo219(c5365, 0);
                    c5365.m9009(true);
                }
                break;
        }
        return c2358;
    }
}
