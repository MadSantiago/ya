package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦٕٙؔؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4485 extends AbstractC3019 implements InterfaceC2766, InterfaceC5119, InterfaceC4825, InterfaceC0124 {

    /* JADX INFO: renamed from: ۥؔ */
    public boolean f14808;

    /* JADX INFO: renamed from: ۥؚ */
    public C4293 f14810;

    /* JADX INFO: renamed from: ۥٕ */
    public EnumC1616 f14811;

    /* JADX INFO: renamed from: ۥ٘ */
    public C2270 f14812;

    /* JADX INFO: renamed from: ۥٛ */
    public C1231 f14813;

    /* JADX INFO: renamed from: ۥۙ */
    public InterfaceC4745 f14815;

    /* JADX INFO: renamed from: ۥ۟ */
    public C3250 f14816;

    /* JADX INFO: renamed from: ۥۤ */
    public AbstractC2774 f14817;

    /* JADX INFO: renamed from: ۥۦ */
    public C4774 f14818;

    /* JADX INFO: renamed from: ۦؒ */
    public C1039 f14819;

    /* JADX INFO: renamed from: ۦؖ */
    public C2243 f14820;

    /* JADX INFO: renamed from: ۦؗ */
    public C5559 f14821;

    /* JADX INFO: renamed from: ۦؙ */
    public boolean f14822;

    /* JADX INFO: renamed from: ۦُ */
    public C3082 f14823;

    /* JADX INFO: renamed from: ۦٖ */
    public boolean f14824;

    /* JADX INFO: renamed from: ۦۜ */
    public C5368 f14825;

    /* JADX INFO: renamed from: ۦۣ */
    public C2520 f14826;

    /* JADX INFO: renamed from: ۥٝ */
    public long f14814 = 9205357640488583168L;

    /* JADX INFO: renamed from: ۥؙ */
    public long f14809 = 0;

    public AbstractC4485(InterfaceC4745 interfaceC4745, boolean z, C2243 c2243, EnumC1616 enumC1616) {
        this.f14811 = enumC1616;
        this.f14815 = interfaceC4745;
        this.f14822 = z;
        this.f14820 = c2243;
    }

    /* JADX INFO: renamed from: ۦۘ */
    public static void m7765(AbstractC4485 abstractC4485, C3536 c3536, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        C2270 c2270 = abstractC4485.f14812;
        if (c2270 == null) {
            c2270 = new C2270();
            c2270.f7530 = null;
            c2270.f7531 = Long.MAX_VALUE;
            c2270.f7529 = false;
            abstractC4485.f14812 = c2270;
        }
        c2270.f7530 = c3536;
        c2270.f7531 = j;
        C3250 c3250 = abstractC4485.f14816;
        EnumC1616 enumC1616 = abstractC4485.f14811;
        if (c3250 == null) {
            abstractC4485.f14816 = new C3250(enumC1616);
        } else {
            c3250.f10915 = enumC1616;
            c3250.f10916 = j2;
        }
        c2270.f7529 = false;
        abstractC4485.f14817 = c2270;
    }

    /* JADX INFO: renamed from: ۥؐ */
    public final void m7766() {
        C3082 c3082 = this.f14823;
        if (c3082 != null) {
            C2243 c2243 = this.f14820;
            if (c2243 != null) {
                c2243.m4291(new C2671(c3082));
            }
            this.f14823 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥؐۦً, reason: contains not printable characters */
    public final Object m9881(AbstractC0772 abstractC0772) throws Throwable {
        C5522 c5522;
        if (abstractC0772 instanceof C5522) {
            c5522 = (C5522) abstractC0772;
            int i = c5522.f18234;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5522.f18234 = i - Integer.MIN_VALUE;
            } else {
                c5522 = new C5522(this, abstractC0772);
            }
        } else {
            c5522 = new C5522(this, abstractC0772);
        }
        Object obj = c5522.f18233;
        int i2 = c5522.f18234;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            C3082 c3082 = this.f14823;
            if (c3082 != null) {
                C2243 c2243 = this.f14820;
                if (c2243 != null) {
                    C2671 c2671 = new C2671(c3082);
                    c5522.f18234 = 1;
                    Object objM4292 = c2243.m4292(c2671, c5522);
                    EnumC2282 enumC2282 = EnumC2282.f7590;
                    if (objM4292 == enumC2282) {
                        return enumC2282;
                    }
                }
            }
            mo9875(new C0457(0L, false));
            return C2358.f7817;
        }
        if (i2 != 1) {
            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC0186.m409(obj);
        this.f14823 = null;
        mo9875(new C0457(0L, false));
        return C2358.f7817;
    }

    /* JADX INFO: renamed from: ۥٌٍۣؕ */
    public abstract void mo9875(C0457 c0457);

    @Override // p000.InterfaceC0124
    /* JADX INFO: renamed from: ۥّ */
    public final boolean mo224(C3536 c3536) {
        if (AbstractC3801.m6800(c3536)) {
            return this.f14822;
        }
        if (!AbstractC3801.m6754(c3536)) {
            if (this.f14816 == null) {
                this.f14816 = new C3250(this.f14811);
            }
            float fMo3257 = ((InterfaceC2509) AbstractC2552.m4807(this, AbstractC2853.f9541)).mo3257();
            long jM6747 = AbstractC3801.m6747(c3536, false);
            C3250 c3250 = this.f14816;
            if (c3250 == null) {
                C1078.m2272("Touch slop detector not initialized.");
                return false;
            }
            if (!C1553.m3306(c3250.m5969(fMo3257, jM6747, false), 9205357640488583168L)) {
                long jM3304 = C1553.m3304(c3250.f10916, jM6747);
                double dAtan2 = ((double) (((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (jM3304 & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (jM3304 >> 32))))) * 180.0f)) / 3.141592653589793d;
                EnumC1616 enumC1616 = (EnumC1616) c3250.f10915;
                int i = enumC1616 == null ? -1 : AbstractC0673.f2472[enumC1616.ordinal()];
                if (i == 1 ? dAtan2 < 30.0d : !(i != 2 || dAtan2 <= 30.0d)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥٔؗۢؐ, reason: contains not printable characters */
    public final Object m9882(C0457 c0457, AbstractC0772 abstractC0772) throws Throwable {
        C5729 c5729;
        if (abstractC0772 instanceof C5729) {
            c5729 = (C5729) abstractC0772;
            int i = c5729.f18885;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5729.f18885 = i - Integer.MIN_VALUE;
            } else {
                c5729 = new C5729(this, abstractC0772);
            }
        } else {
            c5729 = new C5729(this, abstractC0772);
        }
        Object obj = c5729.f18882;
        int i2 = c5729.f18885;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            C3082 c3082 = this.f14823;
            if (c3082 != null) {
                C2243 c2243 = this.f14820;
                if (c2243 != null) {
                    C1904 c1904 = new C1904(c3082);
                    c5729.f18883 = c0457;
                    c5729.f18885 = 1;
                    Object objM4292 = c2243.m4292(c1904, c5729);
                    EnumC2282 enumC2282 = EnumC2282.f7590;
                    if (objM4292 == enumC2282) {
                        return enumC2282;
                    }
                }
            }
            mo9875(c0457);
            return C2358.f7817;
        }
        if (i2 != 1) {
            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c0457 = c5729.f18883;
        AbstractC0186.m409(obj);
        this.f14823 = null;
        mo9875(c0457);
        return C2358.f7817;
    }

    /* JADX INFO: renamed from: ۥٟ */
    public final void m7767(C3536 c3536, long j, C3250 c3250) {
        C1231 c1231 = this.f14813;
        if (c1231 == null) {
            c1231 = new C1231();
            c1231.f4235 = null;
            c1231.f4236 = Long.MAX_VALUE;
            this.f14813 = c1231;
        }
        c1231.f4235 = c3536;
        c1231.f4236 = j;
        c3250.f10916 = 0L;
        this.f14817 = c1231;
    }

    @Override // p000.InterfaceC5119
    /* JADX INFO: renamed from: ۥۙ */
    public final void mo1265(C3510 c3510, EnumC3834 enumC3834) {
        Object obj;
        Object obj2;
        boolean z;
        Object obj3;
        Object obj4;
        Object obj5;
        C2062 c2062;
        int i = c3510.f11622;
        ArrayList arrayList = (ArrayList) c3510.f11621;
        if (this.f14818 == null) {
            C4774 c4774 = new C4774(this);
            m5603(c4774);
            this.f14818 = c4774;
        }
        if (this.f14822) {
            C4293 c4293 = this.f14810;
            if (c4293 == null) {
                c4293 = new C4293(this);
                this.f14810 = c4293;
            }
            C4293 c4294 = c4293;
            AbstractC4485 abstractC4485 = c4294.f14198;
            AbstractC1631 abstractC1631 = c4294.f14195;
            Object obj6 = abstractC1631;
            if (abstractC1631 == null) {
                C2062 c2063 = c4294.f14196;
                if (c2063 == null) {
                    c2062 = c2063;
                    C2062 c2064 = new C2062();
                    c2064.f6787 = 3;
                    c2064.f6788 = false;
                    c4294.f14196 = c2064;
                    c2062 = c2064;
                }
                c2062 = c2063;
                c4294.f14195 = c2062;
                obj6 = c2062;
            }
            boolean z2 = obj6 instanceof C2062;
            EnumC3834 enumC3835 = EnumC3834.f12725;
            EnumC3834 enumC3836 = EnumC3834.f12724;
            if (z2) {
                C2062 c2065 = (C2062) obj6;
                if (arrayList.isEmpty()) {
                    return;
                }
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (!AbstractC0487.m1060((C3410) arrayList.get(i2))) {
                        return;
                    }
                }
                C3410 c3410 = (C3410) AbstractC0973.m2045(arrayList);
                int i3 = AbstractC2250.f7466[AbstractC3761.m6632(c2065.f6787)] == 1 ? !abstractC4485.mo9876() ? 1 : 2 : c2065.f6787;
                c2065.f6787 = i3;
                if (enumC3834 == enumC3835 && i3 == 2) {
                    c3410.f11353 = true;
                    c2065.f6788 = true;
                }
                if (enumC3834 == enumC3836) {
                    if (i3 == 1) {
                        C4293.m7580(c4294, c3410, c3410.f11351, 0L, 12);
                        return;
                    }
                    if (c2065.f6788) {
                        c4294.m7582(c3410, c3410, new C1040(i), 0L);
                        c4294.m7581(c3410, new C1040(i), 0L);
                        long j = c3410.f11351;
                        C5213 c5213 = c4294.f14193;
                        if (c5213 == null) {
                            c5213 = new C5213();
                            c5213.f17221 = Long.MAX_VALUE;
                            c4294.f14193 = c5213;
                        }
                        c5213.f17221 = j;
                        c4294.f14195 = c5213;
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z3 = obj6 instanceof C4393;
            EnumC3834 enumC3837 = EnumC3834.f12722;
            if (!z3) {
                if (obj6 instanceof C3490) {
                    C3490 c3490 = (C3490) obj6;
                    if (enumC3834 != enumC3837) {
                        return;
                    }
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                            z = true;
                            break;
                        } else {
                            if (((C3410) arrayList.get(i4)).f11353) {
                                z = false;
                                break;
                            }
                            i4++;
                        }
                    }
                    int size3 = arrayList.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        if (((C3410) arrayList.get(i5)).f11352) {
                            if (arrayList.isEmpty()) {
                                break;
                            }
                            if (z) {
                                long jM3308 = C1553.m3308(AbstractC0487.m1095((C3410) AbstractC0973.m2045(arrayList), abstractC4485.f14811, new C1040(i)), AbstractC0487.m1095(c3490.f11587, abstractC4485.f14811, new C1040(i)));
                                C3410 c3411 = c3490.f11587;
                                if (c3411 != null) {
                                    C4293.m7580(c4294, c3411, c3490.f11588, jM3308, 8);
                                    return;
                                } else {
                                    C1078.m2272("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    c4294.m7584();
                    return;
                }
                if (!(obj6 instanceof C5213)) {
                    C1078.m2275();
                    return;
                }
                C5213 c5214 = (C5213) obj6;
                if (enumC3834 != enumC3836) {
                    return;
                }
                long j2 = c5214.f17221;
                int size4 = arrayList.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size4) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i6);
                    if (AbstractC5378.m9062(((C3410) obj).f11351, j2)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                C3410 c3412 = (C3410) obj;
                if (c3412 == null) {
                    return;
                }
                boolean zM1084 = AbstractC0487.m1084(c3412);
                C3858 c3858 = C3858.f12887;
                if (!zM1084) {
                    if (c3412.f11353) {
                        abstractC4485.m7769(c3858);
                        return;
                    } else {
                        if (C1553.m3303(AbstractC0487.m1092(c3412, abstractC4485.f14811, new C1040(i), true)) == 0.0f) {
                            return;
                        }
                        c4294.m7581(c3412, new C1040(i), AbstractC0487.m1092(c3412, abstractC4485.f14811, new C1040(i), false));
                        c3412.f11353 = true;
                        return;
                    }
                }
                int size5 = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size5) {
                        obj2 = null;
                        break;
                    }
                    obj2 = arrayList.get(i7);
                    if (((C3410) obj2).f11352) {
                        break;
                    } else {
                        i7++;
                    }
                }
                C3410 c3413 = (C3410) obj2;
                if (c3413 != null) {
                    c5214.f17221 = c3413.f11351;
                    return;
                }
                if (c3412.f11353 || !AbstractC0487.m1084(c3412)) {
                    abstractC4485.m7769(c3858);
                } else {
                    AbstractC0487.m1089(c4294.m7585(), c3412, abstractC4485.f14811, new C1040(i), c4294.f14201, c4294.f14200);
                    float fMo3256 = ((InterfaceC2509) AbstractC2552.m4807(abstractC4485, AbstractC2853.f9541)).mo3256();
                    long jM2245 = c4294.m7585().m2245(AbstractC3933.m7091(fMo3256, fMo3256));
                    C2394 c2394 = (C2394) c4294.m7585().f3672;
                    C5426 c5426 = (C5426) c2394.f7965;
                    AbstractC0246.m515(c5426.f17915, null);
                    c5426.f17910 = 0;
                    C5426 c5427 = (C5426) c2394.f7964;
                    AbstractC0246.m515(c5427.f17915, null);
                    c5427.f17910 = 0;
                    c2394.f7966 = 0L;
                    abstractC4485.m7769(new C0457(AbstractC2481.m4639(jM2245), true));
                }
                c4294.m7584();
                return;
            }
            C4393 c4393 = (C4393) obj6;
            if (enumC3834 == enumC3835) {
                return;
            }
            int size6 = arrayList.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size6) {
                    obj3 = null;
                    break;
                }
                obj3 = arrayList.get(i8);
                int i9 = i8;
                if (AbstractC5378.m9062(((C3410) obj3).f11351, c4393.f14481)) {
                    break;
                } else {
                    i8 = i9 + 1;
                }
            }
            C3410 c3414 = (C3410) obj3;
            if (c3414 == null) {
                int size7 = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size7) {
                        obj5 = null;
                        break;
                    }
                    obj5 = arrayList.get(i10);
                    if (((C3410) obj5).f11352) {
                        break;
                    } else {
                        i10++;
                    }
                }
                c3414 = (C3410) obj5;
                if (c3414 == null) {
                    c4294.m7584();
                    return;
                }
                c4393.f14481 = c3414.f11351;
            }
            C3410 c3415 = c3414;
            if (enumC3834 == enumC3836) {
                if (c3415.f11353) {
                    C3410 c3416 = c4393.f14479;
                    if (c3416 == null) {
                        C1078.m2272("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j3 = c4393.f14481;
                    C3250 c3250 = c4294.f14202;
                    if (c3250 == null) {
                        C1078.m2272("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                    c4294.m7583(c3416, j3, c3250);
                } else if (AbstractC0487.m1084(c3415)) {
                    int size8 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size8) {
                            obj4 = null;
                            break;
                        }
                        Object obj7 = arrayList.get(i11);
                        if (((C3410) obj7).f11352) {
                            obj4 = obj7;
                            break;
                        }
                        i11++;
                    }
                    C3410 c3417 = (C3410) obj4;
                    if (c3417 == null) {
                        c4294.m7584();
                    } else {
                        c4393.f14481 = c3417.f11351;
                    }
                } else {
                    InterfaceC2509 interfaceC2509 = (InterfaceC2509) AbstractC2552.m4807(abstractC4485, AbstractC2853.f9541);
                    float f = AbstractC0719.f2628;
                    float fMo3257 = interfaceC2509.mo3257();
                    C3250 c3251 = c4294.f14202;
                    if (c3251 == null) {
                        C1078.m2272("Touch slop detector not initialized.");
                        return;
                    }
                    long jM5969 = c3251.m5969(fMo3257, AbstractC0487.m1092(c3415, abstractC4485.f14811, new C1040(i), true), true);
                    if ((9223372034707292159L & jM5969) != 9205357640488583168L) {
                        c3415.f11353 = true;
                        c4294.m7582(c4393.f14479, c3415, new C1040(i), jM5969);
                        c4294.m7581(c3415, new C1040(i), jM5969);
                        long j4 = c3415.f11351;
                        C5213 c5215 = c4294.f14193;
                        if (c5215 == null) {
                            c5215 = new C5213();
                            c5215.f17221 = Long.MAX_VALUE;
                            c4294.f14193 = c5215;
                        }
                        c5215.f17221 = j4;
                        c4294.f14195 = c5215;
                    } else {
                        c4393.f14480 = true;
                    }
                }
            }
            if (enumC3834 == enumC3837 && c4393.f14480) {
                if (!c3415.f11353) {
                    c4393.f14480 = false;
                    return;
                }
                C3410 c3418 = c4393.f14479;
                if (c3418 == null) {
                    C1078.m2272("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long j5 = c4393.f14481;
                C3250 c3252 = c4294.f14202;
                if (c3252 != null) {
                    c4294.m7583(c3418, j5, c3252);
                } else {
                    C1078.m2272("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥؙۙؒٗ, reason: contains not printable characters */
    public final void m9883(long j, C3536 c3536) {
        long jMo2779 = AbstractC5537.m9247(this.f17791).mo2779(0L);
        if (!C1553.m3306(this.f14814, 9205357640488583168L) && !C1553.m3306(jMo2779, this.f14814)) {
            this.f14809 = C1553.m3304(this.f14809, C1553.m3308(jMo2779, this.f14814));
        }
        this.f14814 = jMo2779;
        AbstractC3831.m6837(m9887(), c3536, this.f14809);
        m9886().mo5597(new C4640(j, false));
    }

    @Override // p000.InterfaceC5119
    /* JADX INFO: renamed from: ۥۧ */
    public final void mo1266() {
        C4293 c4293 = this.f14810;
        if (c4293 != null) {
            c4293.m7584();
            AbstractC4485 abstractC4485 = c4293.f14198;
            if (abstractC4485.f14824) {
                abstractC4485.m7769(C3858.f12887);
            }
            c4293.f14204 = null;
            C0322 c0322 = c4293.f14203;
            c0322.f1179 = 0;
            ((C2741) c0322.f1178).f9072 = 0;
        }
    }

    @Override // p000.InterfaceC2766
    /* JADX INFO: renamed from: ۦؓ */
    public final void mo783() {
        if (this.f14808) {
            m7768();
            if (this.f14824) {
                m9886().mo5597(C3858.f12887);
            }
            this.f14819 = null;
        }
        this.f14808 = false;
    }

    /* JADX INFO: renamed from: ۦؕ */
    public abstract Object mo4983(C1614 c1614, C1614 c1615);

    /* JADX INFO: renamed from: ۦُْؕؓ */
    public abstract boolean mo9876();

    /* JADX INFO: renamed from: ۦؗ */
    public void mo785(C5639 c5639, EnumC3834 enumC3834, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        EnumC3834 enumC3835;
        Object obj4;
        Object obj5;
        Object obj6;
        C5368 c5368;
        boolean z = true;
        this.f14808 = true;
        if (this.f14818 == null) {
            C4774 c4774 = new C4774(this);
            m5603(c4774);
            this.f14818 = c4774;
        }
        if (this.f14822) {
            AbstractC2774 abstractC2774 = this.f14817;
            if (abstractC2774 == null) {
                C5368 c5369 = this.f14825;
                if (c5369 == null) {
                    obj = abstractC2774;
                    c5368 = c5369;
                    C5368 c53610 = new C5368();
                    c53610.f17701 = 3;
                    c53610.f17702 = false;
                    this.f14825 = c53610;
                    c5368 = c53610;
                }
                obj = abstractC2774;
                c5368 = c5369;
                this.f14817 = c5368;
                obj = c5368;
            }
            obj = abstractC2774;
            boolean z2 = obj instanceof C5368;
            EnumC3834 enumC3836 = EnumC3834.f12725;
            EnumC3834 enumC3837 = EnumC3834.f12724;
            if (z2) {
                C5368 c53611 = (C5368) obj;
                if (!c5639.f18583.isEmpty() && AbstractC3257.m6006(c5639, false)) {
                    C3536 c3536 = (C3536) AbstractC0973.m2045(c5639.f18583);
                    int i = AbstractC2576.f8604[AbstractC3761.m6632(c53611.f17701)] == 1 ? !mo9876() ? 1 : 2 : c53611.f17701;
                    c53611.f17701 = i;
                    if (enumC3834 == enumC3836 && i == 2) {
                        c3536.m6327();
                        c53611.f17702 = true;
                    }
                    if (enumC3834 == enumC3837) {
                        if (i == 1) {
                            m7765(this, c3536, c3536.f11732, 0L, 12);
                            return;
                        }
                        if (c53611.f17702) {
                            m9885(c3536, c3536, 0L);
                            m9883(0L, c3536);
                            long j2 = c3536.f11732;
                            C2520 c2520 = this.f14826;
                            if (c2520 == null) {
                                c2520 = new C2520();
                                c2520.f8355 = Long.MAX_VALUE;
                                this.f14826 = c2520;
                            }
                            c2520.f8355 = j2;
                            this.f14817 = c2520;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z3 = obj instanceof C2270;
            EnumC3834 enumC3838 = EnumC3834.f12722;
            if (!z3) {
                if (obj instanceof C1231) {
                    C1231 c1231 = (C1231) obj;
                    if (enumC3834 != enumC3838) {
                        return;
                    }
                    List list = c5639.f18583;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (((C3536) list.get(i2)).m6326()) {
                            z = false;
                            break;
                        }
                    }
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        if (((C3536) list.get(i3)).f11733) {
                            if (list.isEmpty()) {
                                break;
                            }
                            if (z) {
                                long jM3308 = C1553.m3308(((C3536) AbstractC0973.m2045(list)).f11726, c1231.f4235.f11726);
                                C3536 c3537 = c1231.f4235;
                                if (c3537 != null) {
                                    m7765(this, c3537, c1231.f4236, jM3308, 8);
                                    return;
                                } else {
                                    C1078.m2272("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    m7768();
                    return;
                }
                if (!(obj instanceof C2520)) {
                    C1078.m2275();
                    return;
                }
                C2520 c2521 = (C2520) obj;
                if (enumC3834 != enumC3837) {
                    return;
                }
                long j3 = c2521.f8355;
                List list2 = c5639.f18583;
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list2.get(i4);
                    if (AbstractC5378.m9062(((C3536) obj2).f11732, j3)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                C3536 c3538 = (C3536) obj2;
                if (c3538 == null) {
                    return;
                }
                boolean zM6754 = AbstractC3801.m6754(c3538);
                Object obj7 = C3858.f12887;
                if (!zM6754) {
                    if (c3538.m6326()) {
                        m9886().mo5597(obj7);
                        return;
                    } else {
                        if (C1553.m3303(AbstractC3801.m6747(c3538, true)) == 0.0f) {
                            return;
                        }
                        m9883(AbstractC3801.m6747(c3538, false), c3538);
                        c3538.m6327();
                        return;
                    }
                }
                List list3 = c5639.f18583;
                int size4 = list3.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list3.get(i5);
                    if (((C3536) obj3).f11733) {
                        break;
                    } else {
                        i5++;
                    }
                }
                C3536 c3539 = (C3536) obj3;
                if (c3539 != null) {
                    c2521.f8355 = c3539.f11732;
                    return;
                }
                if (c3538.m6326() || !AbstractC3801.m6754(c3538)) {
                    m9886().mo5597(obj7);
                } else {
                    AbstractC3831.m6837(m9887(), c3538, 0L);
                    float fMo3256 = ((InterfaceC2509) AbstractC2552.m4807(this, AbstractC2853.f9541)).mo3256();
                    long jM2245 = m9887().m2245(AbstractC3933.m7091(fMo3256, fMo3256));
                    C2394 c2394 = (C2394) m9887().f3672;
                    C5426 c5426 = (C5426) c2394.f7965;
                    AbstractC0246.m515(c5426.f17915, null);
                    c5426.f17910 = 0;
                    C5426 c5427 = (C5426) c2394.f7964;
                    AbstractC0246.m515(c5427.f17915, null);
                    c5427.f17910 = 0;
                    c2394.f7966 = 0L;
                    m9886().mo5597(new C0457(AbstractC2481.m4639(jM2245), false));
                    this.f14808 = false;
                }
                m7768();
                return;
            }
            C2270 c2270 = (C2270) obj;
            if (enumC3834 == enumC3836) {
                return;
            }
            List list4 = c5639.f18583;
            int size5 = list4.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    enumC3835 = enumC3838;
                    obj4 = null;
                    break;
                }
                obj4 = list4.get(i6);
                int i7 = size5;
                enumC3835 = enumC3838;
                if (AbstractC5378.m9062(((C3536) obj4).f11732, c2270.f7531)) {
                    break;
                }
                i6++;
                size5 = i7;
                enumC3838 = enumC3835;
            }
            C3536 c35310 = (C3536) obj4;
            if (c35310 == null) {
                int size6 = list4.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list4.get(i8);
                    if (((C3536) obj6).f11733) {
                        break;
                    } else {
                        i8++;
                    }
                }
                c35310 = (C3536) obj6;
                if (c35310 == null) {
                    m7768();
                    return;
                }
                c2270.f7531 = c35310.f11732;
            }
            if (enumC3834 == enumC3837) {
                if (c35310.m6326()) {
                    C3536 c35311 = c2270.f7530;
                    if (c35311 == null) {
                        C1078.m2272("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j4 = c2270.f7531;
                    C3250 c3250 = this.f14816;
                    if (c3250 == null) {
                        C1078.m2272("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                    m7767(c35311, j4, c3250);
                } else if (AbstractC3801.m6754(c35310)) {
                    int size7 = list4.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size7) {
                            obj5 = null;
                            break;
                        }
                        Object obj8 = list4.get(i9);
                        if (((C3536) obj8).f11733) {
                            obj5 = obj8;
                            break;
                        }
                        i9++;
                    }
                    C3536 c35312 = (C3536) obj5;
                    if (c35312 == null) {
                        m7768();
                    } else {
                        c2270.f7531 = c35312.f11732;
                    }
                } else {
                    float fM1589 = AbstractC0719.m1589((InterfaceC2509) AbstractC2552.m4807(this, AbstractC2853.f9541), c35310.f11737);
                    C3250 c3251 = this.f14816;
                    if (c3251 == null) {
                        C1078.m2272("Touch slop detector not initialized.");
                        return;
                    }
                    long jM5969 = c3251.m5969(fM1589, AbstractC3801.m6747(c35310, true), true);
                    if ((9223372034707292159L & jM5969) != 9205357640488583168L) {
                        boolean zMo224 = mo224(c35310);
                        InterfaceC0289 interfaceC0289M9068 = AbstractC5378.m9068(this, C4774.f15737);
                        C4774 c4775 = interfaceC0289M9068 instanceof C4774 ? (C4774) interfaceC0289M9068 : null;
                        InterfaceC0124 interfaceC0124 = c4775 != null ? c4775.f15738 : null;
                        boolean z4 = interfaceC0124 != null && interfaceC0124.mo224(c35310);
                        if (zMo224 || !z4) {
                            c35310.m6327();
                            m9885(c2270.f7530, c35310, jM5969);
                            m9883(jM5969, c35310);
                            long j5 = c35310.f11732;
                            C2520 c2522 = this.f14826;
                            if (c2522 == null) {
                                c2522 = new C2520();
                                c2522.f8355 = Long.MAX_VALUE;
                                this.f14826 = c2522;
                            }
                            c2522.f8355 = j5;
                            this.f14817 = c2522;
                        } else {
                            c2270.f7529 = true;
                        }
                    } else {
                        c2270.f7529 = true;
                    }
                }
            }
            if (enumC3834 == enumC3835 && c2270.f7529) {
                if (!c35310.m6326()) {
                    c2270.f7529 = false;
                    return;
                }
                C3536 c35313 = c2270.f7530;
                if (c35313 == null) {
                    C1078.m2272("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long j6 = c2270.f7531;
                C3250 c3252 = this.f14816;
                if (c3252 != null) {
                    m7767(c35313, j6, c3252);
                } else {
                    C1078.m2272("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۦٜؗؕٓ, reason: contains not printable characters */
    public final void m9884(InterfaceC4745 interfaceC4745, boolean z, C2243 c2243, EnumC1616 enumC1616, boolean z2) {
        this.f14815 = interfaceC4745;
        boolean z3 = true;
        if (this.f14822 != z) {
            this.f14822 = z;
            if (!z) {
                m7766();
                this.f14810 = null;
            }
            z2 = true;
        }
        if (!AbstractC3831.m6874(this.f14820, c2243)) {
            m7766();
            this.f14820 = c2243;
        }
        if (this.f14811 != enumC1616) {
            this.f14811 = enumC1616;
        } else {
            z3 = z2;
        }
        if (z3) {
            boolean z4 = this.f14808;
            C3858 c3858 = C3858.f12887;
            if (z4) {
                m7768();
                if (this.f14824) {
                    m9886().mo5597(c3858);
                }
                this.f14819 = null;
            }
            C4293 c4293 = this.f14810;
            if (c4293 != null) {
                c4293.m7584();
                AbstractC4485 abstractC4485 = c4293.f14198;
                if (abstractC4485.f14824) {
                    abstractC4485.m7769(c3858);
                }
                c4293.f14204 = null;
                C0322 c0322 = c4293.f14203;
                c0322.f1179 = 0;
                ((C2741) c0322.f1178).f9072 = 0;
            }
        }
    }

    /* JADX INFO: renamed from: ۦؙؔ۟ؔ, reason: contains not printable characters */
    public final void m9885(C3536 c3536, C3536 c3537, long j) {
        if (this.f14819 == null) {
            this.f14819 = new C1039(19);
        }
        AbstractC3831.m6837(m9887(), c3536, 0L);
        long jM3308 = C1553.m3308(c3537.f11726, j);
        this.f14809 = 0L;
        if (((Boolean) this.f14815.mo211(new C5407(c3536.f11737))).booleanValue()) {
            if (!this.f14824) {
                if (this.f14821 == null) {
                    this.f14821 = AbstractC1631.m3405(Integer.MAX_VALUE, 0, 6);
                }
                m9888();
            }
            this.f14814 = AbstractC5537.m9247(this).mo2779(0L);
            m9886().mo5597(new C1610(jM3308));
        }
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦٓ */
    public final void mo788() {
        this.f14824 = false;
        m7766();
        this.f14809 = 0L;
        C4774 c4774 = this.f14818;
        if (c4774 != null) {
            m5607(c4774);
        }
        this.f14818 = null;
    }

    /* JADX INFO: renamed from: ۦ٘ */
    public final void m7768() {
        C5368 c5368 = this.f14825;
        if (c5368 == null) {
            c5368 = new C5368();
            c5368.f17701 = 3;
            c5368.f17702 = false;
            this.f14825 = c5368;
        }
        c5368.f17701 = 3;
        c5368.f17702 = false;
        this.f14817 = c5368;
    }

    /* JADX INFO: renamed from: ۦۡؔ۟ؓ, reason: contains not printable characters */
    public final InterfaceC4541 m9886() {
        C5559 c5559 = this.f14821;
        if (c5559 != null) {
            return c5559;
        }
        C1078.m2272("Events channel not initialized.");
        return null;
    }

    /* JADX INFO: renamed from: ۦًۢؖۡ */
    public abstract void mo9878(long j);

    @Override // p000.InterfaceC0124
    /* JADX INFO: renamed from: ۦۣ */
    public final boolean mo225(C3410 c3410) {
        return AbstractC0487.m1060(c3410) && this.f14822;
    }

    /* JADX INFO: renamed from: ۦُۣؔۚ, reason: contains not printable characters */
    public final C1039 m9887() {
        C1039 c1039 = this.f14819;
        if (c1039 != null) {
            return c1039;
        }
        C1078.m2272("Velocity Tracker not initialized.");
        return null;
    }

    /* JADX INFO: renamed from: ۦۥ */
    public final void m7769(AbstractC1776 abstractC1776) {
        if ((abstractC1776 instanceof C1610) && !this.f14824) {
            this.f14824 = true;
            m9888();
        }
        m9886().mo5597(abstractC1776);
    }

    /* JADX INFO: renamed from: ۦۧؓۜؐ, reason: contains not printable characters */
    public final void m9888() {
        this.f14824 = true;
        if (this.f14821 == null) {
            this.f14821 = AbstractC1631.m3405(Integer.MAX_VALUE, 0, 6);
        }
        AbstractC2765.m5135(m9076(), null, 0, new C1614(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۦؘّۨؕ, reason: contains not printable characters */
    public final Object m9889(C1610 c1610, AbstractC0772 abstractC0772) {
        C5397 c5397;
        C2243 c2243;
        C3082 c3082;
        C1610 c1611;
        C3082 c3083;
        if (abstractC0772 instanceof C5397) {
            c5397 = (C5397) abstractC0772;
            int i = c5397.f17833;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5397.f17833 = i - Integer.MIN_VALUE;
            } else {
                c5397 = new C5397(this, abstractC0772);
            }
        } else {
            c5397 = new C5397(this, abstractC0772);
        }
        Object obj = c5397.f17831;
        int i2 = c5397.f17833;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            C3082 c3084 = this.f14823;
            if (c3084 != null && (c2243 = this.f14820) != null) {
                C2671 c2671 = new C2671(c3084);
                c5397.f17830 = c1610;
                c5397.f17833 = 1;
                if (c2243.m4292(c2671, c5397) != enumC2282) {
                }
                return enumC2282;
            }
            this.f14823 = c3082;
            mo9878(c1610.f5407);
            return C2358.f7817;
        }
        if (i2 == 1) {
            c1610 = c5397.f17830;
            AbstractC0186.m409(obj);
        } else {
            if (i2 != 2) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c3083 = c5397.f17829;
            c1611 = c5397.f17830;
            AbstractC0186.m409(obj);
        }
        c3082 = c3083;
        c1610 = c1611;
        this.f14823 = c3082;
        mo9878(c1610.f5407);
        return C2358.f7817;
        c3082 = new C3082();
        C2243 c2244 = this.f14820;
        if (c2244 != null) {
            c5397.f17830 = c1610;
            c5397.f17829 = c3082;
            c5397.f17833 = 2;
            if (c2244.m4292(c3082, c5397) != enumC2282) {
                c1611 = c1610;
                c3083 = c3082;
                c3082 = c3083;
                c1610 = c1611;
            }
            return enumC2282;
        }
        this.f14823 = c3082;
        mo9878(c1610.f5407);
        return C2358.f7817;
    }
}
