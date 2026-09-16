package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ۦۣۣۚؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5153 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f17066;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f17067;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f17068;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f17069;

    public /* synthetic */ C5153(int i, C5678 c5678, C5662 c5662) {
        this.f17069 = 2;
        this.f17068 = i;
        this.f17066 = c5678;
        this.f17067 = c5662;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        InterfaceC5601 interfaceC5601;
        long[] jArr;
        InterfaceC5601 interfaceC5602;
        long[] jArr2;
        int i;
        Integer numM3484;
        Integer numM3491;
        Integer numM3492;
        Integer numM3485;
        C3828 c3828;
        C3828 c3829;
        C2449 c2449;
        C2449 c24410;
        C3828 c38210;
        C3828 c38211;
        C2449 c24411;
        C2449 c24412;
        Integer numM3493;
        Integer numM3486;
        Integer numM3487;
        Integer numM3494;
        C2346 c2346;
        int i2 = this.f17069;
        Object obj2 = null;
        C2358 c2358 = C2358.f7817;
        int i3 = 0;
        int i4 = this.f17068;
        Object obj3 = this.f17067;
        Object obj4 = this.f17066;
        switch (i2) {
            case 0:
                C5863 c5863 = (C5863) obj4;
                C1254 c1254 = (C1254) obj3;
                InterfaceC5601 interfaceC5603 = (InterfaceC5601) obj;
                if (c5863.f19361 == i4 && AbstractC3831.m6874(c1254, c5863.f19362) && (interfaceC5603 instanceof C1946)) {
                    long[] jArr3 = c1254.f4319;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr3[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = i3;
                                while (i8 < i7) {
                                    if ((255 & j) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        Object obj5 = c1254.f4318[i9];
                                        boolean z = c1254.f4315[i9] != i4;
                                        if (z) {
                                            i = i6;
                                            C1946 c1946 = (C1946) interfaceC5603;
                                            interfaceC5602 = interfaceC5603;
                                            C3262 c3262 = c1946.f6433;
                                            AbstractC4225.m7459(c3262, obj5, c5863);
                                            jArr2 = jArr3;
                                            if (obj5 instanceof C5704) {
                                                C5704 c5704 = (C5704) obj5;
                                                if (!c3262.m6015(c5704)) {
                                                    AbstractC4225.m7492(c1946.f6432, c5704);
                                                }
                                                C3262 c3263 = c5863.f19366;
                                                if (c3263 != null) {
                                                    c3263.m6026(obj5);
                                                }
                                            }
                                        } else {
                                            interfaceC5602 = interfaceC5603;
                                            jArr2 = jArr3;
                                            i = i6;
                                        }
                                        if (z) {
                                            c1254.m2651(i9);
                                        }
                                    } else {
                                        interfaceC5602 = interfaceC5603;
                                        jArr2 = jArr3;
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                    interfaceC5603 = interfaceC5602;
                                    jArr3 = jArr2;
                                }
                                interfaceC5601 = interfaceC5603;
                                jArr = jArr3;
                                if (i7 == i6) {
                                }
                            } else {
                                interfaceC5601 = interfaceC5603;
                                jArr = jArr3;
                            }
                            if (i5 != length) {
                                i5++;
                                interfaceC5603 = interfaceC5601;
                                jArr3 = jArr;
                                i3 = 0;
                            }
                        }
                    }
                }
                return c2358;
            case 1:
                C0699 c0699 = (C0699) obj4;
                AbstractC0275 abstractC0275 = (AbstractC0275) obj3;
                AbstractC1842 abstractC1842 = (AbstractC1842) obj;
                int iM360 = c0699.f2539.f13176.m360();
                if (iM360 < 0) {
                    iM360 = 0;
                }
                if (iM360 <= i4) {
                    i4 = iM360;
                }
                int i10 = -i4;
                boolean z2 = c0699.f2540;
                int i11 = z2 ? 0 : i10;
                if (!z2) {
                    i10 = 0;
                }
                abstractC1842.f6113 = true;
                AbstractC1842.m3625(abstractC1842, abstractC0275, i11, i10);
                abstractC1842.f6113 = false;
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C5678 c5678 = (C5678) obj4;
                C5662 c5662 = (C5662) obj3;
                C1667 c1667 = (C1667) obj;
                int i12 = 14;
                switch (AbstractC3761.m6632(i4)) {
                    case 0:
                        c1667.f5552.f5666 = null;
                        if (c1667.f5559.f4307.length() > 0) {
                            if (!C3346.m6107(c1667.f5553)) {
                                boolean zM3485 = c1667.m3485();
                                long j2 = c1667.f5553;
                                if (!zM3485) {
                                    int iM6108 = C3346.m6108(j2);
                                    c1667.m3486(iM6108, iM6108);
                                } else {
                                    int iM6109 = C3346.m6109(j2);
                                    c1667.m3486(iM6109, iM6109);
                                }
                            } else {
                                c1667.m3495();
                            }
                        }
                        break;
                    case 1:
                        c1667.f5552.f5666 = null;
                        if (c1667.f5559.f4307.length() > 0) {
                            if (!C3346.m6107(c1667.f5553)) {
                                boolean zM3486 = c1667.m3485();
                                long j3 = c1667.f5553;
                                if (!zM3486) {
                                    int iM61010 = C3346.m6109(j3);
                                    c1667.m3486(iM61010, iM61010);
                                } else {
                                    int iM61011 = C3346.m6108(j3);
                                    c1667.m3486(iM61011, iM61011);
                                }
                            } else {
                                c1667.m3493();
                            }
                        }
                        break;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        C1701 c1701 = c1667.f5552;
                        c1701.f5666 = null;
                        C1249 c1249 = c1667.f5559;
                        String str = c1249.f4307;
                        String str2 = c1249.f4307;
                        if (str.length() > 0) {
                            if (!c1667.m3485()) {
                                c1701.f5666 = null;
                                if (str2.length() > 0 && (numM3484 = c1667.m3484()) != null) {
                                    int iIntValue = numM3484.intValue();
                                    c1667.m3486(iIntValue, iIntValue);
                                }
                            } else {
                                c1701.f5666 = null;
                                if (str2.length() > 0 && (numM3491 = c1667.m3491()) != null) {
                                    int iIntValue2 = numM3491.intValue();
                                    c1667.m3486(iIntValue2, iIntValue2);
                                }
                            }
                        }
                        break;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        C1701 c1702 = c1667.f5552;
                        c1702.f5666 = null;
                        C1249 c12410 = c1667.f5559;
                        String str3 = c12410.f4307;
                        String str4 = c12410.f4307;
                        if (str3.length() > 0) {
                            if (!c1667.m3485()) {
                                c1702.f5666 = null;
                                if (str4.length() > 0 && (numM3492 = c1667.m3491()) != null) {
                                    int iIntValue3 = numM3492.intValue();
                                    c1667.m3486(iIntValue3, iIntValue3);
                                }
                            } else {
                                c1702.f5666 = null;
                                if (str4.length() > 0 && (numM3485 = c1667.m3484()) != null) {
                                    int iIntValue4 = numM3485.intValue();
                                    c1667.m3486(iIntValue4, iIntValue4);
                                }
                            }
                        }
                        break;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        c1667.m3494();
                        break;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        c1667.m3492();
                        break;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        c1667.m3500();
                        break;
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        c1667.m3498();
                        break;
                    case 8:
                        c1667.f5552.f5666 = null;
                        if (c1667.f5559.f4307.length() > 0) {
                            if (!c1667.m3485()) {
                                c1667.m3498();
                            } else {
                                c1667.m3500();
                            }
                        }
                        break;
                    case 9:
                        c1667.f5552.f5666 = null;
                        if (c1667.f5559.f4307.length() > 0) {
                            if (!c1667.m3485()) {
                                c1667.m3500();
                            } else {
                                c1667.m3498();
                            }
                        }
                        break;
                    case 10:
                        if (c1667.f5559.f4307.length() > 0 && (c3828 = c1667.f5551) != null) {
                            int iM3497 = c1667.m3497(c3828, -1);
                            c1667.m3486(iM3497, iM3497);
                        }
                        break;
                    case 11:
                        if (c1667.f5559.f4307.length() > 0 && (c3829 = c1667.f5551) != null) {
                            int iM3498 = c1667.m3497(c3829, 1);
                            c1667.m3486(iM3498, iM3498);
                        }
                        break;
                    case 12:
                    case 48:
                        break;
                    case 13:
                        if (c1667.f5559.f4307.length() > 0 && (c2449 = c1667.f5558) != null) {
                            int iM3489 = c1667.m3489(c2449, -1);
                            c1667.m3486(iM3489, iM3489);
                        }
                        break;
                    case 14:
                        if (c1667.f5559.f4307.length() > 0 && (c24410 = c1667.f5558) != null) {
                            int iM34810 = c1667.m3489(c24410, 1);
                            c1667.m3486(iM34810, iM34810);
                        }
                        break;
                    case 15:
                        c1667.f5552.f5666 = null;
                        if (c1667.f5559.f4307.length() > 0) {
                            c1667.m3486(0, 0);
                        }
                        break;
                    case 16:
                        c1667.f5552.f5666 = null;
                        C1249 c12411 = c1667.f5559;
                        if (c12411.f4307.length() > 0) {
                            int length2 = c12411.f4307.length();
                            c1667.m3486(length2, length2);
                        }
                        break;
                    case 17:
                        c5678.f18669.m6477(false);
                        break;
                    case 18:
                        c5678.f18669.m6489();
                        break;
                    case 19:
                        c5678.f18669.m6469();
                        break;
                    case 20:
                        List listM3490 = c1667.m3490(new C1657(15));
                        if (listM3490 != null) {
                            c5678.m9497(listM3490);
                        }
                        break;
                    case 21:
                        List listM3491 = c1667.m3490(new C1657(16));
                        if (listM3491 != null) {
                            c5678.m9497(listM3491);
                        }
                        break;
                    case 22:
                        List listM3492 = c1667.m3490(new C1657(17));
                        if (listM3492 != null) {
                            c5678.m9497(listM3492);
                        }
                        break;
                    case 23:
                        List listM3493 = c1667.m3490(new C1657(18));
                        if (listM3493 != null) {
                            c5678.m9497(listM3493);
                        }
                        break;
                    case 24:
                        List listM3494 = c1667.m3490(new C1657(19));
                        if (listM3494 != null) {
                            c5678.m9497(listM3494);
                        }
                        break;
                    case 25:
                        List listM3495 = c1667.m3490(new C1657(20));
                        if (listM3495 != null) {
                            c5678.m9497(listM3495);
                        }
                        break;
                    case 26:
                        c1667.f5552.f5666 = null;
                        C1249 c12412 = c1667.f5559;
                        if (c12412.f4307.length() > 0) {
                            c1667.m3486(0, c12412.f4307.length());
                        }
                        break;
                    case 27:
                        c1667.m3495();
                        c1667.m3499();
                        break;
                    case 28:
                        c1667.m3493();
                        c1667.m3499();
                        break;
                    case 29:
                        if (c1667.f5559.f4307.length() > 0 && (c38210 = c1667.f5551) != null) {
                            int iM3499 = c1667.m3497(c38210, -1);
                            c1667.m3486(iM3499, iM3499);
                        }
                        c1667.m3499();
                        break;
                    case 30:
                        if (c1667.f5559.f4307.length() > 0 && (c38211 = c1667.f5551) != null) {
                            int iM34910 = c1667.m3497(c38211, 1);
                            c1667.m3486(iM34910, iM34910);
                        }
                        c1667.m3499();
                        break;
                    case 31:
                        if (c1667.f5559.f4307.length() > 0 && (c24411 = c1667.f5558) != null) {
                            int iM34811 = c1667.m3489(c24411, -1);
                            c1667.m3486(iM34811, iM34811);
                        }
                        c1667.m3499();
                        break;
                    case 32:
                        if (c1667.f5559.f4307.length() > 0 && (c24412 = c1667.f5558) != null) {
                            int iM34812 = c1667.m3489(c24412, 1);
                            c1667.m3486(iM34812, iM34812);
                        }
                        c1667.m3499();
                        break;
                    case 33:
                        c1667.f5552.f5666 = null;
                        if (c1667.f5559.f4307.length() > 0) {
                            c1667.m3486(0, 0);
                        }
                        c1667.m3499();
                        break;
                    case 34:
                        c1667.f5552.f5666 = null;
                        C1249 c12413 = c1667.f5559;
                        if (c12413.f4307.length() > 0) {
                            int length3 = c12413.f4307.length();
                            c1667.m3486(length3, length3);
                        }
                        c1667.m3499();
                        break;
                    case 35:
                        C1701 c1703 = c1667.f5552;
                        c1703.f5666 = null;
                        C1249 c12414 = c1667.f5559;
                        String str5 = c12414.f4307;
                        String str6 = c12414.f4307;
                        if (str5.length() > 0) {
                            if (c1667.m3485()) {
                                c1703.f5666 = null;
                                if (str6.length() > 0 && (numM3486 = c1667.m3484()) != null) {
                                    int iIntValue5 = numM3486.intValue();
                                    c1667.m3486(iIntValue5, iIntValue5);
                                }
                            } else {
                                c1703.f5666 = null;
                                if (str6.length() > 0 && (numM3493 = c1667.m3491()) != null) {
                                    int iIntValue6 = numM3493.intValue();
                                    c1667.m3486(iIntValue6, iIntValue6);
                                }
                            }
                        }
                        c1667.m3499();
                        break;
                    case 36:
                        C1701 c1704 = c1667.f5552;
                        c1704.f5666 = null;
                        C1249 c12415 = c1667.f5559;
                        String str7 = c12415.f4307;
                        String str8 = c12415.f4307;
                        if (str7.length() > 0) {
                            if (c1667.m3485()) {
                                c1704.f5666 = null;
                                if (str8.length() > 0 && (numM3494 = c1667.m3491()) != null) {
                                    int iIntValue7 = numM3494.intValue();
                                    c1667.m3486(iIntValue7, iIntValue7);
                                }
                            } else {
                                c1704.f5666 = null;
                                if (str8.length() > 0 && (numM3487 = c1667.m3484()) != null) {
                                    int iIntValue8 = numM3487.intValue();
                                    c1667.m3486(iIntValue8, iIntValue8);
                                }
                            }
                        }
                        c1667.m3499();
                        break;
                    case 37:
                        c1667.m3494();
                        c1667.m3499();
                        break;
                    case 38:
                        c1667.m3492();
                        c1667.m3499();
                        break;
                    case 39:
                        c1667.m3500();
                        c1667.m3499();
                        break;
                    case 40:
                        c1667.m3498();
                        c1667.m3499();
                        break;
                    case 41:
                        c1667.f5552.f5666 = null;
                        if (c1667.f5559.f4307.length() > 0) {
                            if (c1667.m3485()) {
                                c1667.m3500();
                            } else {
                                c1667.m3498();
                            }
                        }
                        c1667.m3499();
                        break;
                    case 42:
                        c1667.f5552.f5666 = null;
                        if (c1667.f5559.f4307.length() > 0) {
                            if (c1667.m3485()) {
                                c1667.m3498();
                            } else {
                                c1667.m3500();
                            }
                        }
                        c1667.m3499();
                        break;
                    case 43:
                        c1667.f5552.f5666 = null;
                        if (c1667.f5559.f4307.length() > 0) {
                            long j4 = c1667.f5553;
                            int i13 = C3346.f11195;
                            int i14 = (int) (j4 & 4294967295L);
                            c1667.m3486(i14, i14);
                        }
                        break;
                    case 44:
                        if (!c5678.f18667) {
                            c5678.m9497(Collections.singletonList(new C1472(1, "\n")));
                        } else {
                            c5662.f18631 = c5678.f18671.f19238.f17059.f19226.m9678(c5678.f18675);
                        }
                        break;
                    case 45:
                        if (!c5678.f18667) {
                            c5678.m9497(Collections.singletonList(new C1472(1, "\t")));
                        } else {
                            c5662.f18631 = false;
                        }
                        break;
                    case 46:
                        c5678.f18670.m6014(C5745.m9570(c1667.f5555, c1667.f5559, c1667.f5553, 4));
                        C3260 c3260 = c5678.f18670;
                        C2346 c2347 = c3260.f10940;
                        if (c2347 != null && (c2346 = (C2346) c2347.f7786) != null) {
                            c3260.f10940 = c2346;
                            c3260.f10937 -= ((C5745) c2347.f7785).f18944.f4307.length();
                            c3260.f10939 = new C2346(i12, c3260.f10939, (C5745) c2347.f7785);
                            obj2 = (C5745) c2346.f7785;
                        }
                        if (obj2 != null) {
                            c5678.f18673.mo211(obj2);
                        }
                        break;
                    case 47:
                        C3260 c3261 = c5678.f18670;
                        C2346 c2348 = c3261.f10939;
                        if (c2348 != null) {
                            c3261.f10939 = (C2346) c2348.f7786;
                            C5745 c5745 = (C5745) c2348.f7785;
                            c3261.f10940 = new C2346(i12, c3261.f10940, c5745);
                            c3261.f10937 = c5745.f18944.f4307.length() + c3261.f10937;
                            obj2 = (C5745) c2348.f7785;
                        }
                        if (obj2 != null) {
                            c5678.f18673.mo211(obj2);
                        }
                        break;
                    default:
                        C1078.m2275();
                        return null;
                }
                return c2358;
            default:
                C5047 c5047 = (C5047) obj4;
                AbstractC0275 abstractC0276 = (AbstractC0275) obj3;
                AbstractC1842 abstractC1843 = (AbstractC1842) obj;
                int i15 = c5047.f16737;
                C4950 c4950 = c5047.f16738;
                C3263 c3264 = c5047.f16736;
                C2449 c24413 = (C2449) c5047.f16739.mo449();
                c4950.m8332(EnumC1616.f5425, AbstractC0993.m2139(abstractC1843, i15, c3264, c24413 != null ? c24413.f8158 : null, false, abstractC0276.f985), i4, abstractC0276.f984);
                AbstractC1842.m3623(abstractC1843, abstractC0276, 0, Math.round(-c4950.f16381.m1711()));
                return c2358;
        }
    }

    public /* synthetic */ C5153(int i, int i2, Object obj, Object obj2) {
        this.f17069 = i2;
        this.f17066 = obj;
        this.f17068 = i;
        this.f17067 = obj2;
    }

    public /* synthetic */ C5153(C5047 c5047, AbstractC0275 abstractC0275, int i) {
        this.f17069 = 3;
        this.f17066 = c5047;
        this.f17067 = abstractC0275;
        this.f17068 = i;
    }
}
