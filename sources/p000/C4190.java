package p000;

import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦًٔؖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4190 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f13935;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f13936;

    public /* synthetic */ C4190(int i, Object obj) {
        this.f13936 = i;
        this.f13935 = obj;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f13936;
        C4036 c4036 = C2850.f9517;
        C4217 c4217 = C4217.f13994;
        C2358 c2358 = C2358.f7817;
        Object obj3 = this.f13935;
        int i2 = 1;
        switch (i) {
            case 0:
                C5362 c5362 = (C5362) obj;
                int iIntValue = ((Number) obj2).intValue();
                C1489 c1489 = (C1489) obj3;
                if (!c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c5362.m8982();
                } else {
                    String strM9268 = AbstractC5537.m9268(R.string.m3c_dialog, c5362);
                    InterfaceC0705 interfaceC0705 = (InterfaceC0705) c1489.f5057;
                    C1393 c1393 = AbstractC4753.f15691;
                    InterfaceC0705 interfaceC0705M7710 = AbstractC4410.m7710(interfaceC0705, 280.0f, 560.0f, 10);
                    boolean zM8963 = c5362.m8963(strM9268);
                    Object objM8999 = c5362.m8999();
                    if (zM8963 || objM8999 == c4036) {
                        objM8999 = new C3203(i2, strM9268);
                        c5362.m8987(objM8999);
                    }
                    InterfaceC0705 interfaceC0705Mo1571 = interfaceC0705M7710.mo1571(AbstractC1697.m3510(c4217, false, (InterfaceC4745) objM8999));
                    InterfaceC3228 interfaceC3228M2297 = AbstractC1089.m2297(C1298.f4456, true);
                    int iM1958 = AbstractC0949.m1958(c5362);
                    C2103 c2103M8994 = c5362.m8994();
                    InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705Mo1571);
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
                    C3136 c3136 = C0849.f3053;
                    if (c5362.f17668 || !AbstractC3831.m6874(c5362.m8999(), Integer.valueOf(iM1958))) {
                        AbstractC3761.m6618(iM1958, c5362, iM1958, c3136);
                    }
                    AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
                    ((C0857) c1489.f5056).mo219(c5362, 0);
                    c5362.m9009(true);
                }
                break;
            case 1:
                C5362 c5363 = (C5362) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!c5363.m9011(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c5363.m8982();
                } else {
                    C3033 c3033 = AbstractC4225.f14012;
                    C4274 c4274 = C1298.f4423;
                    InterfaceC2609 interfaceC2609 = ((C4741) obj3).f15642;
                    C3668 c3668M6047 = AbstractC3287.m6047(c3033, c4274, c5363, 54);
                    int iM1959 = AbstractC0949.m1958(c5363);
                    C2103 c2103M8995 = c5363.m8994();
                    InterfaceC0705 interfaceC0705M2162 = AbstractC0993.m2161(c5363, c4217);
                    InterfaceC4576.f15106.getClass();
                    C3709 c37010 = C0849.f3049;
                    c5363.m8983();
                    if (c5363.f17668) {
                        c5363.m9005(c37010);
                    } else {
                        c5363.m8972();
                    }
                    AbstractC0993.m2127(C0849.f3048, c5363, c3668M6047);
                    AbstractC0993.m2127(C0849.f3047, c5363, c2103M8995);
                    C3136 c3137 = C0849.f3053;
                    if (c5363.f17668 || !AbstractC3831.m6874(c5363.m8999(), Integer.valueOf(iM1959))) {
                        AbstractC3761.m6618(iM1959, c5363, iM1959, c3137);
                    }
                    AbstractC0993.m2127(C0849.f3052, c5363, interfaceC0705M2162);
                    interfaceC2609.mo1173(C0196.f724, c5363, 6);
                    c5363.m9009(true);
                }
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C5362 c5364 = (C5362) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                new C4441(new long[]{-5168859309818124268L, 1413344454123230954L, -6360420840338798769L, 428015856864605524L, 3001309281787086672L}).toString();
                if (!c5364.m9011(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c5364.m8982();
                } else {
                    AbstractC0495.m1105((String) ((C3869) obj3).f12915, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c5364, 0, 0, 262142);
                }
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C5362 c5365 = (C5362) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!c5365.m9011(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    c5365.m8982();
                } else {
                    Object objM89910 = c5365.m8999();
                    if (objM89910 == c4036) {
                        objM89910 = new C4618(23);
                        c5365.m8987(objM89910);
                    }
                    InterfaceC0705 interfaceC0705M3510 = AbstractC1697.m3510(c4217, false, (InterfaceC4745) objM89910);
                    InterfaceC4367 interfaceC4367 = (InterfaceC4367) obj3;
                    InterfaceC3228 interfaceC3228M2298 = AbstractC1089.m2297(C1298.f4456, false);
                    int iM19510 = AbstractC0949.m1958(c5365);
                    C2103 c2103M8996 = c5365.m8994();
                    InterfaceC0705 interfaceC0705M2163 = AbstractC0993.m2161(c5365, interfaceC0705M3510);
                    InterfaceC4576.f15106.getClass();
                    C3709 c37011 = C0849.f3049;
                    c5365.m8983();
                    if (c5365.f17668) {
                        c5365.m9005(c37011);
                    } else {
                        c5365.m8972();
                    }
                    AbstractC0993.m2127(C0849.f3048, c5365, interfaceC3228M2298);
                    AbstractC0993.m2127(C0849.f3047, c5365, c2103M8996);
                    C3136 c3138 = C0849.f3053;
                    if (c5365.f17668 || !AbstractC3831.m6874(c5365.m8999(), Integer.valueOf(iM19510))) {
                        AbstractC3761.m6618(iM19510, c5365, iM19510, c3138);
                    }
                    AbstractC0993.m2127(C0849.f3052, c5365, interfaceC0705M2163);
                    ((InterfaceC5731) interfaceC4367.getValue()).mo219(c5365, 0);
                    c5365.m9009(true);
                }
                break;
            default:
                C5362 c5366 = (C5362) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (!c5366.m9011(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    c5366.m8982();
                } else {
                    AbstractC0495.m1105((String) obj3, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c5366, 0, 0, 262142);
                }
                break;
        }
        return c2358;
    }
}
