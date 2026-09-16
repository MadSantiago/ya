package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦؚٙؔؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4482 implements InterfaceC1015 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC4643 f14792;

    /* JADX INFO: renamed from: ۥّ */
    public int f14794;

    /* JADX INFO: renamed from: ۥۗ */
    public final C4122 f14795;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0365 f14797;

    /* JADX INFO: renamed from: ۦؑ */
    public final C0710 f14798;

    /* JADX INFO: renamed from: ۦؚ */
    public final C1489 f14799;

    /* JADX INFO: renamed from: ۦِ */
    public final C2432 f14800;

    /* JADX INFO: renamed from: ۦٛ */
    public final C1489 f14801;

    /* JADX INFO: renamed from: ۦۙ */
    public C2127 f14803;

    /* JADX INFO: renamed from: ۥُ */
    public final C1387 f14793 = new C1387();

    /* JADX INFO: renamed from: ۥۜ */
    public final C5086 f14796 = new C5086(17);

    /* JADX INFO: renamed from: ۦۗ */
    public final C2432 f14802 = new C2432(new C4915(this, 0));

    public C4482(C0365 c0365, List list, C4122 c4122, InterfaceC4643 interfaceC4643) {
        this.f14797 = c0365;
        this.f14795 = c4122;
        this.f14792 = interfaceC4643;
        InterfaceC0443 interfaceC0443 = null;
        int i = 1;
        this.f14798 = new C0710(i, new C0061(this, interfaceC0443, 11));
        this.f14801 = new C1489(this, list);
        this.f14800 = new C2432(new C4915(this, i));
        this.f14799 = new C1489(interfaceC4643, new C2932(13, this), new C0023(this, interfaceC0443, 21));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥؗ */
    public final Object m7757(AbstractC0772 abstractC0772) {
        C2556 c2556;
        C1387 c1387;
        if (abstractC0772 instanceof C2556) {
            c2556 = (C2556) abstractC0772;
            int i = c2556.f8528;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2556.f8528 = i - Integer.MIN_VALUE;
            } else {
                c2556 = new C2556(this, abstractC0772);
            }
        } else {
            c2556 = new C2556(this, abstractC0772);
        }
        Object obj = c2556.f8526;
        int i2 = c2556.f8528;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            c2556.f8525 = this;
            c1387 = this.f14793;
            c2556.f8524 = c1387;
            c2556.f8528 = 1;
            Object objMo2949 = c1387.mo2949(c2556);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objMo2949 == enumC2282) {
                return enumC2282;
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C1387 c1388 = c2556.f8524;
            C4482 c4482 = c2556.f8525;
            AbstractC0186.m409(obj);
            c1387 = c1388;
            this = c4482;
        }
        try {
            int i3 = this.f14794 - 1;
            this.f14794 = i3;
            if (i3 == 0) {
                C2127 c2127 = this.f14803;
                if (c2127 != null) {
                    c2127.mo871(null);
                }
                this.f14803 = null;
            }
            return C2358.f7817;
        } finally {
            c1387.mo2950(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (r9 == r6) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b3, code lost:
    
        if (r9 == r6) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [ۦؚٙؔؐ] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, ۥؔؒۨۢ] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6, types: [ۦؚٙؔؐ] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: ۥُ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m7758(p000.C1429 r10, p000.AbstractC0772 r11) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4482.m7758(ۥؘٕؓۥ, ۥؚؒۥؔ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥّ */
    public final Object m7759(AbstractC0772 abstractC0772) {
        C5593 c5593;
        C1387 c1387;
        if (abstractC0772 instanceof C5593) {
            c5593 = (C5593) abstractC0772;
            int i = c5593.f18434;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5593.f18434 = i - Integer.MIN_VALUE;
            } else {
                c5593 = new C5593(this, abstractC0772);
            }
        } else {
            c5593 = new C5593(this, abstractC0772);
        }
        Object obj = c5593.f18432;
        int i2 = c5593.f18434;
        int i3 = 1;
        InterfaceC0443 interfaceC0443 = null;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            c5593.f18431 = this;
            c1387 = this.f14793;
            c5593.f18430 = c1387;
            c5593.f18434 = 1;
            Object objMo2949 = c1387.mo2949(c5593);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objMo2949 == enumC2282) {
                return enumC2282;
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C1387 c1388 = c5593.f18430;
            C4482 c4482 = c5593.f18431;
            AbstractC0186.m409(obj);
            c1387 = c1388;
            this = c4482;
        }
        try {
            int i4 = this.f14794 + 1;
            this.f14794 = i4;
            if (i4 == 1) {
                this.f14803 = AbstractC2765.m5135(this.f14792, null, 0, new C4371(this, interfaceC0443, i3), 3);
            }
            return C2358.f7817;
        } finally {
            c1387.mo2950(null);
        }
    }

    @Override // p000.InterfaceC1015
    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC4707 mo2232() {
        return this.f14798;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥۜ */
    public final Object m7760(boolean z, InterfaceC0443 interfaceC0443) {
        C3868 c3868;
        C4482 c4482;
        AbstractC1996 abstractC1996;
        C4482 c4483;
        C3869 c3869;
        AbstractC1996 abstractC1997;
        if (interfaceC0443 instanceof C3868) {
            c3868 = (C3868) interfaceC0443;
            int i = c3868.f12911;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3868.f12911 = i - Integer.MIN_VALUE;
            } else {
                c3868 = new C3868(this, interfaceC0443);
            }
        } else {
            c3868 = new C3868(this, interfaceC0443);
        }
        Object objMo5827 = c3868.f12912;
        int i2 = c3868.f12911;
        InterfaceC0443 interfaceC0444 = null;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        if (i2 == 0) {
            AbstractC0186.m409(objMo5827);
            AbstractC1996 abstractC1996M8693 = this.f14796.m8693();
            if (abstractC1996M8693 instanceof C2469) {
                C1078.m2276("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                return null;
            }
            InterfaceC5823 interfaceC5823M7761 = m7761();
            c3868.f12909 = this;
            c3868.f12908 = abstractC1996M8693;
            c3868.f12910 = z;
            c3868.f12911 = 1;
            Object objMo5825 = interfaceC5823M7761.mo5825(c3868);
            if (objMo5825 != enumC2282) {
                c4482 = this;
                abstractC1996 = abstractC1996M8693;
                objMo5827 = objMo5825;
            }
            return enumC2282;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                c4483 = c3868.f12909;
                AbstractC0186.m409(objMo5827);
                c3869 = (C3869) objMo5827;
                abstractC1997 = (AbstractC1996) c3869.f12915;
                if (((Boolean) c3869.f12914).booleanValue()) {
                    c4483.f14796.m8698(abstractC1997);
                }
                return abstractC1997;
            }
            if (i2 != 3) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c4483 = c3868.f12909;
            AbstractC0186.m409(objMo5827);
            c3869 = (C3869) objMo5827;
            abstractC1997 = (AbstractC1996) c3869.f12915;
            if (((Boolean) c3869.f12914).booleanValue()) {
                c4483.f14796.m8698(abstractC1997);
            }
            return abstractC1997;
        }
        z = c3868.f12910;
        abstractC1996 = c3868.f12908;
        c4482 = c3868.f12909;
        AbstractC0186.m409(objMo5827);
        int iIntValue = ((Number) objMo5827).intValue();
        boolean z2 = abstractC1996 instanceof C4127;
        int i3 = z2 ? abstractC1996.f6579 : -1;
        if (z2 && iIntValue == i3) {
            return abstractC1996;
        }
        if (z) {
            InterfaceC5823 interfaceC5823M7762 = c4482.m7761();
            C4117 c4117 = new C4117(c4482, null);
            c3868.f12909 = c4482;
            c3868.f12908 = null;
            c3868.f12911 = 2;
            objMo5827 = interfaceC5823M7762.mo5826(c4117, c3868);
            if (objMo5827 != enumC2282) {
                c4483 = c4482;
                c3869 = (C3869) objMo5827;
                abstractC1997 = (AbstractC1996) c3869.f12915;
                if (((Boolean) c3869.f12914).booleanValue()) {
                    c4483.f14796.m8698(abstractC1997);
                }
                return abstractC1997;
            }
        } else {
            InterfaceC5823 interfaceC5823M7763 = c4482.m7761();
            C5044 c5044 = new C5044(c4482, i3, interfaceC0444, 0);
            c3868.f12909 = c4482;
            c3868.f12908 = null;
            c3868.f12911 = 3;
            objMo5827 = interfaceC5823M7763.mo5827(c5044, c3868);
            if (objMo5827 != enumC2282) {
                c4483 = c4482;
                c3869 = (C3869) objMo5827;
                abstractC1997 = (AbstractC1996) c3869.f12915;
                if (((Boolean) c3869.f12914).booleanValue()) {
                    c4483.f14796.m8698(abstractC1997);
                }
                return abstractC1997;
            }
        }
        return enumC2282;
    }

    @Override // p000.InterfaceC1015
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo2233(InterfaceC5731 interfaceC5731, AbstractC0772 abstractC0772) {
        C3772 c3772 = (C3772) abstractC0772.mo334().mo865(C0373.f1384);
        if (c3772 != null) {
            c3772.m6675(this);
        }
        return AbstractC2765.m5144(new C3772(c3772, this), new C0061(this, interfaceC5731, null, 12), abstractC0772);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC5823 m7761() {
        return (InterfaceC5823) this.f14802.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۦِ */
    public final Object m7762(Object obj, boolean z, AbstractC0772 abstractC0772) {
        C0248 c0248;
        C4763 c4763;
        if (abstractC0772 instanceof C0248) {
            c0248 = (C0248) abstractC0772;
            int i = c0248.f920;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0248.f920 = i - Integer.MIN_VALUE;
            } else {
                c0248 = new C0248(this, abstractC0772);
            }
        } else {
            c0248 = new C0248(this, abstractC0772);
        }
        Object obj2 = c0248.f917;
        int i2 = c0248.f920;
        if (i2 == 0) {
            AbstractC0186.m409(obj2);
            C4763 c4764 = new C4763();
            C1988 c1988 = (C1988) this.f14800.getValue();
            C3540 c3540 = new C3540(c4764, this, obj, z, null);
            c0248.f918 = c4764;
            c0248.f920 = 1;
            Object objM3890 = c1988.m3890(c3540, c0248);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objM3890 == enumC2282) {
                return enumC2282;
            }
            c4763 = c4764;
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c4763 = c0248.f918;
            AbstractC0186.m409(obj2);
        }
        return new Integer(c4763.f15714);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ab A[Catch: ۥًُؓؒ -> 0x005e, TryCatch #2 {ۥًُؓؒ -> 0x005e, blocks: (B:19:0x0059, B:54:0x0108, B:24:0x0067, B:51:0x00eb, B:32:0x0084, B:40:0x00ab, B:42:0x00b1, B:36:0x008e, B:48:0x00d9), top: B:81:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:53:0x0107  */
    /* JADX WARN: Code duplicated, block: B:63:0x0147 A[Catch: all -> 0x0173, TryCatch #1 {all -> 0x0173, blocks: (B:61:0x0135, B:63:0x0147, B:64:0x014f), top: B:80:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x014f A[Catch: all -> 0x0173, TRY_LEAVE, TryCatch #1 {all -> 0x0173, blocks: (B:61:0x0135, B:63:0x0147, B:64:0x014f), top: B:80:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x015f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0167  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۦٛ */
    public final Object m7763(boolean z, AbstractC0772 abstractC0772) {
        C3731 c3731;
        C5450 c5450;
        C1042 c1042;
        C4482 c4482;
        boolean z2;
        C5450 c5451;
        C4763 c4763;
        C1042 c1043;
        C1807 c1807;
        Object objMo5826;
        C4763 c4764;
        C5450 c5452;
        int iHashCode;
        Object objMo5825;
        C4482 c4483;
        int i;
        Object obj;
        if (abstractC0772 instanceof C3731) {
            c3731 = (C3731) abstractC0772;
            int i2 = c3731.f12419;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3731.f12419 = i2 - Integer.MIN_VALUE;
            } else {
                c3731 = new C3731(this, abstractC0772);
            }
        } else {
            c3731 = new C3731(this, abstractC0772);
        }
        Object objMo5827 = c3731.f12425;
        int i3 = c3731.f12419;
        int i4 = 1;
        InterfaceC0443 interfaceC0443 = null;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        try {
            switch (i3) {
                case 0:
                    AbstractC0186.m409(objMo5827);
                    int i5 = 3;
                    if (z) {
                        c3731.f12421 = this;
                        c3731.f12427 = z;
                        c3731.f12419 = 1;
                        objMo5827 = ((C1988) this.f14800.getValue()).m3891(new C2476(i5, interfaceC0443), c3731);
                        if (objMo5827 != enumC2282) {
                            if (objMo5827 != null) {
                                iHashCode = objMo5827.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            InterfaceC5823 interfaceC5823M7761 = this.m7761();
                            c3731.f12421 = this;
                            c3731.f12420 = objMo5827;
                            c3731.f12427 = z;
                            c3731.f12424 = iHashCode;
                            c3731.f12419 = 2;
                            objMo5825 = interfaceC5823M7761.mo5825(c3731);
                            if (objMo5825 != enumC2282) {
                                c4483 = this;
                                i = iHashCode;
                                obj = objMo5827;
                                objMo5827 = objMo5825;
                                return new C4127(i, ((Number) objMo5827).intValue(), obj);
                            }
                        }
                    } else {
                        InterfaceC5823 interfaceC5823M7762 = m7761();
                        c3731.f12421 = this;
                        c3731.f12427 = z;
                        c3731.f12419 = 3;
                        objMo5827 = interfaceC5823M7762.mo5825(c3731);
                        if (objMo5827 != enumC2282) {
                            int iIntValue = ((Number) objMo5827).intValue();
                            InterfaceC5823 interfaceC5823M7763 = this.m7761();
                            C5044 c5044 = new C5044(this, iIntValue, interfaceC0443, i4);
                            c3731.f12421 = this;
                            c3731.f12427 = z;
                            c3731.f12419 = 4;
                            objMo5827 = interfaceC5823M7763.mo5827(c5044, c3731);
                            if (objMo5827 == enumC2282) {
                            }
                            return (C4127) objMo5827;
                        }
                    }
                    return enumC2282;
                case 1:
                    z = c3731.f12427;
                    this = (C4482) c3731.f12421;
                    AbstractC0186.m409(objMo5827);
                    if (objMo5827 != null) {
                        iHashCode = objMo5827.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    InterfaceC5823 interfaceC5823M7764 = this.m7761();
                    c3731.f12421 = this;
                    c3731.f12420 = objMo5827;
                    c3731.f12427 = z;
                    c3731.f12424 = iHashCode;
                    c3731.f12419 = 2;
                    objMo5825 = interfaceC5823M7764.mo5825(c3731);
                    if (objMo5825 != enumC2282) {
                        c4483 = this;
                        i = iHashCode;
                        obj = objMo5827;
                        objMo5827 = objMo5825;
                        return new C4127(i, ((Number) objMo5827).intValue(), obj);
                    }
                    return enumC2282;
                case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                    i = c3731.f12424;
                    z = c3731.f12427;
                    obj = c3731.f12420;
                    c4483 = (C4482) c3731.f12421;
                    try {
                        AbstractC0186.m409(objMo5827);
                        return new C4127(i, ((Number) objMo5827).intValue(), obj);
                    } catch (C1042 e) {
                        e = e;
                        this = c4483;
                        c5450 = new C5450();
                        C4122 c4122 = this.f14795;
                        c3731.f12421 = this;
                        c3731.f12420 = e;
                        c3731.f12422 = c5450;
                        c3731.f12426 = c5450;
                        c3731.f12427 = z;
                        c3731.f12419 = 5;
                        Object objMo211 = c4122.f13729.mo211(e);
                        if (objMo211 != enumC2282) {
                            c1042 = e;
                            objMo5827 = objMo211;
                            c4482 = this;
                            z2 = z;
                            c5451 = c5450;
                            c5451.f17965 = objMo5827;
                            c4763 = new C4763();
                            try {
                                c1807 = new C1807(c5450, c4482, c4763, (InterfaceC0443) null);
                                c3731.f12421 = c1042;
                                c3731.f12420 = c5450;
                                c3731.f12422 = c4763;
                                c3731.f12426 = null;
                                c3731.f12419 = 6;
                                if (z2) {
                                    c4482.getClass();
                                    objMo5826 = c1807.mo211(c3731);
                                } else {
                                    objMo5826 = c4482.m7761().mo5826(new C4846(c1807, interfaceC0443, i4), c3731);
                                }
                                if (objMo5826 != enumC2282) {
                                    c4764 = c4763;
                                    c5452 = c5450;
                                    Object obj2 = c5452.f17965;
                                    return new C4127(obj2 != null ? obj2.hashCode() : 0, c4764.f15714, obj2);
                                }
                            } catch (Throwable th) {
                                th = th;
                                c1043 = c1042;
                                AbstractC5537.m9223(c1043, th);
                                throw c1043;
                            }
                        }
                        return enumC2282;
                    }
                case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                    z = c3731.f12427;
                    this = (C4482) c3731.f12421;
                    AbstractC0186.m409(objMo5827);
                    int iIntValue2 = ((Number) objMo5827).intValue();
                    InterfaceC5823 interfaceC5823M7765 = this.m7761();
                    C5044 c5045 = new C5044(this, iIntValue2, interfaceC0443, i4);
                    c3731.f12421 = this;
                    c3731.f12427 = z;
                    c3731.f12419 = 4;
                    objMo5827 = interfaceC5823M7765.mo5827(c5045, c3731);
                    if (objMo5827 == enumC2282) {
                        return enumC2282;
                    }
                    return (C4127) objMo5827;
                case C4261.LONG_FIELD_NUMBER /* 4 */:
                    boolean z3 = c3731.f12427;
                    AbstractC0186.m409(objMo5827);
                    return (C4127) objMo5827;
                case C4261.STRING_FIELD_NUMBER /* 5 */:
                    z2 = c3731.f12427;
                    c5451 = c3731.f12426;
                    c5450 = (C5450) c3731.f12422;
                    c1042 = (C1042) c3731.f12420;
                    c4482 = (C4482) c3731.f12421;
                    AbstractC0186.m409(objMo5827);
                    c5451.f17965 = objMo5827;
                    c4763 = new C4763();
                    c1807 = new C1807(c5450, c4482, c4763, (InterfaceC0443) null);
                    c3731.f12421 = c1042;
                    c3731.f12420 = c5450;
                    c3731.f12422 = c4763;
                    c3731.f12426 = null;
                    c3731.f12419 = 6;
                    if (z2) {
                        c4482.getClass();
                        objMo5826 = c1807.mo211(c3731);
                    } else {
                        objMo5826 = c4482.m7761().mo5826(new C4846(c1807, interfaceC0443, i4), c3731);
                    }
                    if (objMo5826 != enumC2282) {
                        c4764 = c4763;
                        c5452 = c5450;
                        Object obj3 = c5452.f17965;
                        return new C4127(obj3 != null ? obj3.hashCode() : 0, c4764.f15714, obj3);
                    }
                    return enumC2282;
                case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                    c4764 = (C4763) c3731.f12422;
                    c5452 = (C5450) c3731.f12420;
                    c1043 = (C1042) c3731.f12421;
                    try {
                        AbstractC0186.m409(objMo5827);
                        Object obj4 = c5452.f17965;
                        return new C4127(obj4 != null ? obj4.hashCode() : 0, c4764.f15714, obj4);
                    } catch (Throwable th2) {
                        th = th2;
                        AbstractC5537.m9223(c1043, th);
                        throw c1043;
                    }
                default:
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (C1042 e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r1.m3109(r0) == r4) goto L26;
     */
    /* JADX INFO: renamed from: ۦۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m7764(p000.AbstractC0772 r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p000.C5325
            if (r0 == 0) goto L13
            r0 = r7
            ۦؚْ۟ؒ r0 = (p000.C5325) r0
            int r1 = r0.f17575
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17575 = r1
            goto L18
        L13:
            ۦؚْ۟ؒ r0 = new ۦؚْ۟ؒ
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f17573
            int r1 = r0.f17575
            r2 = 2
            r3 = 1
            ۥٟۚؕۨ r4 = p000.EnumC2282.f7590
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L37
            if (r1 != r2) goto L30
            int r6 = r0.f17571
            ۦؚٙؔؐ r0 = r0.f17572
            p000.AbstractC0186.m409(r7)     // Catch: java.lang.Throwable -> L2e
            goto L64
        L2e:
            r7 = move-exception
            goto L6c
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r6)
            r6 = 0
            return r6
        L37:
            ۦؚٙؔؐ r6 = r0.f17572
            p000.AbstractC0186.m409(r7)
            goto L4f
        L3d:
            p000.AbstractC0186.m409(r7)
            ۦؚۧؕؖ r7 = r6.m7761()
            r0.f17572 = r6
            r0.f17575 = r3
            java.lang.Object r7 = r7.mo5825(r0)
            if (r7 != r4) goto L4f
            goto L63
        L4f:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            ۥؚٖٗ r1 = r6.f14801     // Catch: java.lang.Throwable -> L67
            r0.f17572 = r6     // Catch: java.lang.Throwable -> L67
            r0.f17571 = r7     // Catch: java.lang.Throwable -> L67
            r0.f17575 = r2     // Catch: java.lang.Throwable -> L67
            java.lang.Object r6 = r1.m3109(r0)     // Catch: java.lang.Throwable -> L67
            if (r6 != r4) goto L64
        L63:
            return r4
        L64:
            ۥۜؑؒؑ r6 = p000.C2358.f7817
            return r6
        L67:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L6c:
            ۦۙؑۙؑ r0 = r0.f14796
            ۥٍٕؑٚ r1 = new ۥٍٕؑٚ
            r1.<init>(r6, r7)
            r0.m8698(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4482.m7764(ۥؚؒۥؔ):java.lang.Object");
    }
}
