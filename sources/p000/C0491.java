package p000;

/* JADX INFO: renamed from: ۥؙُؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0491 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f1782;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f1783;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f1784;

    public /* synthetic */ C0491(int i, Object obj, Object obj2) {
        this.f1784 = i;
        this.f1783 = obj;
        this.f1782 = obj2;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        Object obj3;
        int i = this.f1784;
        C4036 c4036 = C2850.f9517;
        C4217 c4217 = C4217.f13994;
        C2358 c2358 = C2358.f7817;
        Object obj4 = this.f1782;
        Object obj5 = this.f1783;
        switch (i) {
            case 0:
                C5362 c5362 = (C5362) obj;
                int iIntValue = ((Number) obj2).intValue();
                String str = (String) obj5;
                if (!c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c5362.m8982();
                } else {
                    boolean zM8963 = c5362.m8963(str);
                    Object objM8999 = c5362.m8999();
                    if (zM8963 || objM8999 == c4036) {
                        obj3 = objM8999;
                        C3203 c3203 = new C3203(false ? 1 : 0, str);
                        c5362.m8987(c3203);
                        obj3 = c3203;
                    }
                    InterfaceC0705 interfaceC0705M3510 = AbstractC1697.m3510(c4217, false, (InterfaceC4745) obj3);
                    C0857 c0857 = (C0857) obj4;
                    InterfaceC3228 interfaceC3228M2297 = AbstractC1089.m2297(C1298.f4456, false);
                    int iM1958 = AbstractC0949.m1958(c5362);
                    C2103 c2103M8994 = c5362.m8994();
                    InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705M3510);
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
                    c0857.mo219(c5362, 0);
                    c5362.m9009(true);
                }
                break;
            case 1:
                C5362 c5363 = (C5362) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!c5363.m9011(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c5363.m8982();
                } else {
                    InterfaceC0705 interfaceC0705M9378 = AbstractC5568.m9378(AbstractC4410.m7705(c4217, AbstractC3017.f10161, AbstractC3017.f10164), (InterfaceC1291) obj5);
                    InterfaceC2609 interfaceC2609 = (InterfaceC2609) obj4;
                    C3668 c3668M6047 = AbstractC3287.m6047(AbstractC4225.f14015, C1298.f4423, c5363, 54);
                    int iM1959 = AbstractC0949.m1958(c5363);
                    C2103 c2103M8995 = c5363.m8994();
                    InterfaceC0705 interfaceC0705M2162 = AbstractC0993.m2161(c5363, interfaceC0705M9378);
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
                if (!c5364.m9011(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c5364.m8982();
                } else {
                    AbstractC0993.m2132(((C2415) obj5).f8045, 1, (C0857) obj4, c5364, 48);
                }
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C5362 c5365 = (C5362) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!c5365.m9011(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    c5365.m8982();
                } else {
                    AbstractC0993.m2132(((C2415) obj5).f8043, 2, (InterfaceC5731) obj4, c5365, 48);
                }
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C5362 c5366 = (C5362) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (!c5366.m9011(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    c5366.m8982();
                } else {
                    AbstractC0495.m1106(((C4413) obj5).f14545, (C0857) obj4, c5366, 0);
                }
                break;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C5362 c5367 = (C5362) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (!c5367.m9011(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    c5367.m8982();
                } else {
                    C0857 c0858 = (C0857) obj4;
                    C5512 c5512 = (C5512) obj5;
                    InterfaceC3228 interfaceC3228M2298 = AbstractC1089.m2297(C1298.f4456, false);
                    int iM19510 = AbstractC0949.m1958(c5367);
                    C2103 c2103M8996 = c5367.m8994();
                    InterfaceC0705 interfaceC0705M2163 = AbstractC0993.m2161(c5367, c4217);
                    InterfaceC4576.f15106.getClass();
                    C3709 c37011 = C0849.f3049;
                    c5367.m8983();
                    if (c5367.f17668) {
                        c5367.m9005(c37011);
                    } else {
                        c5367.m8972();
                    }
                    AbstractC0993.m2127(C0849.f3048, c5367, interfaceC3228M2298);
                    AbstractC0993.m2127(C0849.f3047, c5367, c2103M8996);
                    C3136 c3138 = C0849.f3053;
                    if (c5367.f17668 || !AbstractC3831.m6874(c5367.m8999(), Integer.valueOf(iM19510))) {
                        AbstractC3761.m6618(iM19510, c5367, iM19510, c3138);
                    }
                    AbstractC0993.m2127(C0849.f3052, c5367, interfaceC0705M2163);
                    c0858.mo1173(c5512, c5367, 6);
                    c5367.m9009(true);
                }
                break;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                C5362 c5368 = (C5362) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (!c5368.m9011(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    c5368.m8982();
                } else {
                    ((C0857) obj4).mo1173((C4960) obj5, c5368, 6);
                }
                break;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                C5362 c5369 = (C5362) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (!c5369.m9011(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    c5369.m8982();
                } else {
                    ((InterfaceC2609) obj5).mo1173((C1873) obj4, c5369, 6);
                }
                break;
            default:
                C5362 c53610 = (C5362) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (!c53610.m9011(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    c53610.m8982();
                } else {
                    InterfaceC4367 interfaceC4367 = (InterfaceC4367) obj5;
                    Object objM89910 = c53610.m8999();
                    if (objM89910 == c4036) {
                        objM89910 = new C2136(interfaceC4367, 9);
                        c53610.m8987(objM89910);
                    }
                    InterfaceC0705 interfaceC0705M4198 = AbstractC2164.m4198(c4217, (InterfaceC4745) objM89910);
                    C0857 c0859 = (C0857) obj4;
                    InterfaceC3228 interfaceC3228M2299 = AbstractC1089.m2297(C1298.f4456, false);
                    int iM19511 = AbstractC0949.m1958(c53610);
                    C2103 c2103M8997 = c53610.m8994();
                    InterfaceC0705 interfaceC0705M2164 = AbstractC0993.m2161(c53610, interfaceC0705M4198);
                    InterfaceC4576.f15106.getClass();
                    C3709 c37012 = C0849.f3049;
                    c53610.m8983();
                    if (c53610.f17668) {
                        c53610.m9005(c37012);
                    } else {
                        c53610.m8972();
                    }
                    AbstractC0993.m2127(C0849.f3048, c53610, interfaceC3228M2299);
                    AbstractC0993.m2127(C0849.f3047, c53610, c2103M8997);
                    C3136 c3139 = C0849.f3053;
                    if (c53610.f17668 || !AbstractC3831.m6874(c53610.m8999(), Integer.valueOf(iM19511))) {
                        AbstractC3761.m6618(iM19511, c53610, iM19511, c3139);
                    }
                    AbstractC0993.m2127(C0849.f3052, c53610, interfaceC0705M2164);
                    c0859.mo219(c53610, 0);
                    c53610.m9009(true);
                }
                break;
        }
        return c2358;
    }

    public /* synthetic */ C0491(C0857 c0857, Object obj, int i) {
        this.f1784 = i;
        this.f1782 = c0857;
        this.f1783 = obj;
    }
}
