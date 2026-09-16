package p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: ۦّّۧؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5803 implements InterfaceC4161 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f19120;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f19121;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f19122;

    public /* synthetic */ C5803(int i, Object obj, Object obj2) {
        this.f19122 = i;
        this.f19121 = obj;
        this.f19120 = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:175:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:196:0x034d  */
    /* JADX WARN: Code duplicated, block: B:216:0x039a  */
    @Override // p000.InterfaceC4161
    /* JADX INFO: renamed from: ۦۚ */
    public final Object mo978(Object obj, InterfaceC0443 interfaceC0443) {
        C1401 c1401;
        C1557 c1557;
        C2904 c2904;
        InterfaceC4161 interfaceC4161;
        C1447 c1447;
        Object obj2 = obj;
        int i = this.f19122;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        int i2 = 0;
        int i3 = 0;
        byte b = 0;
        C2358 c2358 = C2358.f7817;
        Object obj3 = this.f19120;
        Object obj4 = this.f19121;
        switch (i) {
            case 0:
                if (interfaceC0443 instanceof C1401) {
                    c1401 = (C1401) interfaceC0443;
                    int i4 = c1401.f4823;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c1401.f4823 = i4 - Integer.MIN_VALUE;
                    } else {
                        c1401 = new C1401(this, interfaceC0443);
                    }
                } else {
                    c1401 = new C1401(this, interfaceC0443);
                }
                Object objMo219 = c1401.f4824;
                int i5 = c1401.f4823;
                if (i5 != 0) {
                    if (i5 == 1) {
                        i2 = c1401.f4827;
                        obj2 = c1401.f4826;
                        AbstractC0186.m409(objMo219);
                    } else {
                        if (i5 != 2) {
                            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC0186.m409(objMo219);
                    }
                    return c2358;
                }
                AbstractC0186.m409(objMo219);
                c1401.f4826 = obj2;
                c1401.f4827 = 0;
                c1401.f4823 = 1;
                objMo219 = ((C5215) obj4).mo219(obj2, c1401);
                if (objMo219 == enumC2282) {
                    return enumC2282;
                }
                if (!((Boolean) objMo219).booleanValue()) {
                    throw new C0069(this);
                }
                c1401.f4826 = null;
                c1401.f4827 = i2;
                c1401.f4823 = 2;
                if (((InterfaceC4161) obj3).mo978(obj2, c1401) == enumC2282) {
                    return enumC2282;
                }
                return c2358;
            case 1:
                if (interfaceC0443 instanceof C1557) {
                    c1557 = (C1557) interfaceC0443;
                    int i6 = c1557.f5247;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c1557.f5247 = i6 - Integer.MIN_VALUE;
                    } else {
                        c1557 = new C1557(this, interfaceC0443);
                    }
                } else {
                    c1557 = new C1557(this, interfaceC0443);
                }
                Object objMo2110 = c1557.f5248;
                int i7 = c1557.f5247;
                if (i7 == 0) {
                    AbstractC0186.m409(objMo2110);
                    c1557.f5250 = obj2;
                    c1557.f5247 = 1;
                    objMo2110 = ((InterfaceC5731) obj4).mo219(obj2, c1557);
                    if (objMo2110 == enumC2282) {
                        return enumC2282;
                    }
                } else {
                    if (i7 != 1) {
                        C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = c1557.f5250;
                    AbstractC0186.m409(objMo2110);
                }
                if (!((Boolean) objMo2110).booleanValue()) {
                    return c2358;
                }
                ((C5450) obj3).f17965 = obj2;
                throw new C0069(this);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                if (interfaceC0443 instanceof C2904) {
                    c2904 = (C2904) interfaceC0443;
                    int i8 = c2904.f9667;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c2904.f9667 = i8 - Integer.MIN_VALUE;
                    } else {
                        c2904 = new C2904(this, interfaceC0443);
                    }
                } else {
                    c2904 = new C2904(this, interfaceC0443);
                }
                Object obj5 = c2904.f9668;
                int i9 = c2904.f9667;
                if (i9 != 0) {
                    if (i9 == 1) {
                        i3 = c2904.f9670;
                        InterfaceC4161 interfaceC4162 = c2904.f9672;
                        Object obj6 = c2904.f9671;
                        AbstractC0186.m409(obj5);
                        interfaceC4161 = interfaceC4162;
                        obj2 = obj6;
                    } else {
                        if (i9 != 2) {
                            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC0186.m409(obj5);
                    }
                    return c2358;
                }
                AbstractC0186.m409(obj5);
                interfaceC4161 = (InterfaceC4161) obj3;
                c2904.f9671 = obj2;
                c2904.f9672 = interfaceC4161;
                c2904.f9670 = 0;
                c2904.f9667 = 1;
                ((C0952) obj4).mo219(obj2, c2904);
                if (c2358 == enumC2282) {
                    return enumC2282;
                }
                c2904.f9671 = null;
                c2904.f9672 = null;
                c2904.f9670 = i3;
                c2904.f9667 = 2;
                if (interfaceC4161.mo978(obj2, c2904) == enumC2282) {
                    return enumC2282;
                }
                return c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                InterfaceC2714 interfaceC2714 = (InterfaceC2714) obj2;
                ArrayList arrayList = (ArrayList) obj4;
                if (interfaceC2714 instanceof C3213) {
                    arrayList.add(interfaceC2714);
                } else if (interfaceC2714 instanceof C4315) {
                    arrayList.remove(((C4315) interfaceC2714).f14262);
                }
                ((InterfaceC4367) obj3).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return c2358;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                InterfaceC2714 interfaceC2715 = (InterfaceC2714) obj2;
                C0801 c0801 = (C0801) obj3;
                C2730 c2730 = (C2730) obj4;
                if ((interfaceC2715 instanceof C0266) || (interfaceC2715 instanceof C3213) || (interfaceC2715 instanceof C3656)) {
                    c2730.m5079(interfaceC2715);
                } else if (interfaceC2715 instanceof C5116) {
                    c2730.m5083(((C5116) interfaceC2715).f16964);
                } else if (interfaceC2715 instanceof C4315) {
                    c2730.m5083(((C4315) interfaceC2715).f14262);
                } else if (interfaceC2715 instanceof C0694) {
                    c2730.m5083(((C0694) interfaceC2715).f2524);
                } else if (interfaceC2715 instanceof C0199) {
                    c2730.m5083(((C0199) interfaceC2715).f731);
                }
                Object[] objArr = c2730.f9041;
                int i10 = c2730.f9040;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    InterfaceC2714 interfaceC2716 = (InterfaceC2714) objArr[i12];
                    if (interfaceC2716 instanceof C0266) {
                        c0801.getClass();
                        i11 |= 2;
                    } else if (interfaceC2716 instanceof C3213) {
                        c0801.getClass();
                        i11 |= 1;
                    } else if (interfaceC2716 instanceof C3656) {
                        c0801.getClass();
                        i11 |= 4;
                    }
                }
                c0801.f2866.m359(i11);
                return c2358;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                if (interfaceC0443 instanceof C1447) {
                    c1447 = (C1447) interfaceC0443;
                    int i13 = c1447.f4954;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1447.f4954 = i13 - Integer.MIN_VALUE;
                    } else {
                        c1447 = new C1447(this, interfaceC0443);
                    }
                } else {
                    c1447 = new C1447(this, interfaceC0443);
                }
                Object obj7 = c1447.f4955;
                int i14 = c1447.f4954;
                if (i14 == 0) {
                    AbstractC0186.m409(obj7);
                    InterfaceC4161 interfaceC4163 = (InterfaceC4161) obj3;
                    Set set = (Set) obj2;
                    C0232 c0232 = new C0232();
                    for (String str : (String[]) obj4) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            if (AbstractC4981.m8360(str, (String) it.next())) {
                                c0232.add(str);
                            }
                        }
                    }
                    C0232 c0232M8152 = C4773.m8152(c0232);
                    C0232 c0233 = c0232M8152.f874.isEmpty() ? null : c0232M8152;
                    if (c0233 != null) {
                        c1447.f4954 = 1;
                        if (interfaceC4163.mo978(c0233, c1447) == enumC2282) {
                            return enumC2282;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC0186.m409(obj7);
                }
                return c2358;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC2714 interfaceC2717 = (InterfaceC2714) obj2;
                C2756 c2756 = (C2756) obj4;
                if (!(interfaceC2717 instanceof InterfaceC0166)) {
                    InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj3;
                    C4752 c4752 = c2756.f9125;
                    float f = 0.0f;
                    if (c4752 == null) {
                        boolean z = c2756.f9130;
                        C1445 c1445 = c2756.f9127;
                        c4752 = new C4752();
                        c4752.f15687 = z;
                        c4752.f15686 = c1445;
                        c4752.f15684 = AbstractC4554.m7908(0.0f);
                        c4752.f15688 = new ArrayList();
                        AbstractC5378.m9047(c2756);
                        c2756.f9125 = c4752;
                    }
                    ArrayList arrayList2 = (ArrayList) c4752.f15688;
                    if (interfaceC2717 instanceof C0266) {
                        arrayList2.add(interfaceC2717);
                    } else if (interfaceC2717 instanceof C5116) {
                        arrayList2.remove(((C5116) interfaceC2717).f16964);
                    } else if (interfaceC2717 instanceof C3213) {
                        arrayList2.add(interfaceC2717);
                    } else if (interfaceC2717 instanceof C4315) {
                        arrayList2.remove(((C4315) interfaceC2717).f14262);
                    } else if (interfaceC2717 instanceof C3082) {
                        arrayList2.add(interfaceC2717);
                    } else if (interfaceC2717 instanceof C1904) {
                        arrayList2.remove(((C1904) interfaceC2717).f6287);
                    } else if (interfaceC2717 instanceof C2671) {
                        arrayList2.remove(((C2671) interfaceC2717).f8850);
                    }
                    InterfaceC2714 interfaceC2718 = (InterfaceC2714) AbstractC0973.m2043(arrayList2);
                    if (!AbstractC3831.m6874((InterfaceC2714) c4752.f15685, interfaceC2718)) {
                        if (interfaceC2718 != null) {
                            ((C1445) c4752.f15686).mo449();
                            boolean z2 = interfaceC2718 instanceof C0266;
                            if (z2) {
                                f = 0.08f;
                            } else if (interfaceC2718 instanceof C3213) {
                                f = 0.1f;
                            } else if (interfaceC2718 instanceof C3082) {
                                f = 0.16f;
                            }
                            C0380 c0380 = AbstractC2123.f6975;
                            if (!z2 && ((interfaceC2718 instanceof C3213) || (interfaceC2718 instanceof C3082))) {
                                c0380 = new C0380(45, AbstractC1074.f3759);
                            }
                            AbstractC2765.m5135(interfaceC4643, null, 0, new C0404(c4752, f, c0380, null), 3);
                        } else {
                            InterfaceC2714 interfaceC2719 = (InterfaceC2714) c4752.f15685;
                            C0380 c0381 = AbstractC2123.f6975;
                            if (!(interfaceC2719 instanceof C0266) && !(interfaceC2719 instanceof C3213) && (interfaceC2719 instanceof C3082)) {
                                c0381 = new C0380(150, AbstractC1074.f3759);
                            }
                            AbstractC2765.m5135(interfaceC4643, null, 0, new C5030(c4752, c0381, b == true ? 1 : 0, 19), 3);
                        }
                        c4752.f15685 = interfaceC2718;
                    }
                } else if (c2756.f9128) {
                    c2756.m5112((InterfaceC0166) interfaceC2717);
                } else {
                    c2756.f9129.m5079(interfaceC2717);
                }
                return c2358;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                C1553 c1553 = (C1553) obj2;
                long j = c1553.f5241;
                C5825 c5825 = (C5825) obj4;
                if ((((C1553) c5825.m9638()).f5241 & 9223372034707292159L) == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((C1553) c5825.m9638()).f5241 & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
                    Object objM9636 = c5825.m9636(interfaceC0443, c1553);
                    return objM9636 == enumC2282 ? objM9636 : c2358;
                }
                AbstractC2765.m5135((InterfaceC4643) obj3, null, 0, new C2079(c5825, j, (InterfaceC0443) null, 2), 3);
                return c2358;
            case 8:
                InterfaceC2714 interfaceC27110 = (InterfaceC2714) obj2;
                C4763 c4763 = (C4763) obj4;
                if (interfaceC27110 instanceof C3656) {
                    c4763.f15714++;
                } else if ((interfaceC27110 instanceof C0694) || (interfaceC27110 instanceof C0199)) {
                    c4763.f15714--;
                }
                boolean z3 = c4763.f15714 > 0;
                C2424 c2424 = (C2424) obj3;
                if (c2424.f8080 != z3) {
                    c2424.f8080 = z3;
                    C5063.m8642(c2424);
                }
                return c2358;
            default:
                ((InterfaceC3116) obj4).mo5696((C4142) obj3, (AbstractC3750) obj2);
                return c2358;
        }
    }

    public /* synthetic */ C5803(InterfaceC4161 interfaceC4161, Serializable serializable, int i) {
        this.f19122 = i;
        this.f19120 = interfaceC4161;
        this.f19121 = serializable;
    }
}
