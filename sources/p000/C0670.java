package p000;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۥؘؘؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0670 implements InterfaceC4161 {

    /* JADX INFO: renamed from: ۥْ */
    public final Object f2466;

    /* JADX INFO: renamed from: ۥٓ */
    public final Object f2467;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f2468;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f2469;

    public C0670(InterfaceC4161 interfaceC4161, InterfaceC3534 interfaceC3534) {
        this.f2469 = 5;
        this.f2468 = interfaceC3534;
        this.f2466 = interfaceC3534.mo875(AbstractC2765.f9179, 0);
        this.f2467 = new C5030(interfaceC4161, null, 22);
    }

    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x00df  */
    /* JADX WARN: Code duplicated, block: B:91:0x0191  */
    @Override // p000.InterfaceC4161
    /* JADX INFO: renamed from: ۦۚ */
    public final Object mo978(Object obj, InterfaceC0443 interfaceC0443) throws Throwable {
        C3664 c3664;
        C5634 c5634;
        C5640 c5640;
        InterfaceC4161 interfaceC4161;
        Object obj2 = obj;
        int i = this.f2469;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        InterfaceC0443 interfaceC0444 = null;
        C2358 c2358 = C2358.f7817;
        Object obj3 = this.f2467;
        Object obj4 = this.f2466;
        Object obj5 = this.f2468;
        switch (i) {
            case 0:
                C5450 c5450 = (C5450) obj5;
                if (interfaceC0443 instanceof C3664) {
                    c3664 = (C3664) interfaceC0443;
                    int i2 = c3664.f12258;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c3664.f12258 = i2 - Integer.MIN_VALUE;
                    } else {
                        c3664 = new C3664(this, interfaceC0443);
                    }
                } else {
                    c3664 = new C3664(this, interfaceC0443);
                }
                Object obj6 = c3664.f12255;
                int i3 = c3664.f12258;
                if (i3 == 0) {
                    AbstractC0186.m409(obj6);
                    InterfaceC3196 interfaceC3196 = (InterfaceC3196) c5450.f17965;
                    if (interfaceC3196 != null) {
                        interfaceC3196.mo871(new C3063());
                        c3664.f12256 = obj2;
                        c3664.f12258 = 1;
                        if (interfaceC3196.mo861(c3664) == enumC2282) {
                            return enumC2282;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = c3664.f12256;
                    AbstractC0186.m409(obj6);
                }
                InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj4;
                c5450.f17965 = AbstractC2765.m5135(interfaceC4643, null, 4, new C0061((InterfaceC5731) obj3, obj2, interfaceC4643, null, 1), 1);
                return c2358;
            case 1:
                C0777 c0777 = (C0777) obj4;
                ((C5305) obj5).setValue(Boolean.valueOf(((Boolean) obj2).booleanValue() ? ((Boolean) ((InterfaceC5731) ((InterfaceC4367) obj3).getValue()).mo219(c0777.m1671(), c0777.f2814.getValue())).booleanValue() : false));
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                InterfaceC2714 interfaceC2714 = (InterfaceC2714) obj2;
                ArrayList arrayList = (ArrayList) obj5;
                if (interfaceC2714 instanceof C0266) {
                    arrayList.add(interfaceC2714);
                } else if (interfaceC2714 instanceof C5116) {
                    arrayList.remove(((C5116) interfaceC2714).f16964);
                } else if (interfaceC2714 instanceof C3213) {
                    arrayList.add(interfaceC2714);
                } else if (interfaceC2714 instanceof C4315) {
                    arrayList.remove(((C4315) interfaceC2714).f14262);
                } else if (interfaceC2714 instanceof C3656) {
                    arrayList.add(interfaceC2714);
                } else if (interfaceC2714 instanceof C0694) {
                    arrayList.remove(((C0694) interfaceC2714).f2524);
                } else if (interfaceC2714 instanceof C0199) {
                    arrayList.remove(((C0199) interfaceC2714).f731);
                }
                AbstractC2765.m5135((InterfaceC4643) obj4, null, 0, new C0023((C1044) obj3, (InterfaceC2714) AbstractC0973.m2043(arrayList), interfaceC0444, 25), 3);
                return c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                InterfaceC4161 interfaceC4162 = (InterfaceC4161) obj4;
                C5662 c5662 = (C5662) obj5;
                if (interfaceC0443 instanceof C5634) {
                    c5634 = (C5634) interfaceC0443;
                    int i4 = c5634.f18567;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c5634.f18567 = i4 - Integer.MIN_VALUE;
                    } else {
                        c5634 = new C5634(this, interfaceC0443);
                    }
                } else {
                    c5634 = new C5634(this, interfaceC0443);
                }
                Object objMo219 = c5634.f18564;
                int i5 = c5634.f18567;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            obj2 = c5634.f18565;
                            AbstractC0186.m409(objMo219);
                            if (!((Boolean) objMo219).booleanValue()) {
                                c5662.f18631 = true;
                                c5634.f18565 = null;
                                c5634.f18567 = 3;
                                if (interfaceC4162.mo978(obj2, c5634) == enumC2282) {
                                    return enumC2282;
                                }
                            }
                        } else if (i5 != 3) {
                            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    AbstractC0186.m409(objMo219);
                } else {
                    AbstractC0186.m409(objMo219);
                    if (c5662.f18631) {
                        c5634.f18565 = null;
                        c5634.f18567 = 1;
                        if (interfaceC4162.mo978(obj2, c5634) == enumC2282) {
                            return enumC2282;
                        }
                    } else {
                        c5634.f18565 = obj2;
                        c5634.f18567 = 2;
                        objMo219 = ((InterfaceC5731) obj3).mo219(obj2, c5634);
                        if (objMo219 == enumC2282) {
                            return enumC2282;
                        }
                        if (!((Boolean) objMo219).booleanValue()) {
                            c5662.f18631 = true;
                            c5634.f18565 = null;
                            c5634.f18567 = 3;
                            if (interfaceC4162.mo978(obj2, c5634) == enumC2282) {
                                return enumC2282;
                            }
                        }
                    }
                }
                return c2358;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                if (interfaceC0443 instanceof C5640) {
                    c5640 = (C5640) interfaceC0443;
                    int i6 = c5640.f18585;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c5640.f18585 = i6 - Integer.MIN_VALUE;
                    } else {
                        c5640 = new C5640(this, interfaceC0443);
                    }
                } else {
                    c5640 = new C5640(this, interfaceC0443);
                }
                Object obj7 = c5640.f18586;
                int i7 = c5640.f18585;
                if (i7 != 0) {
                    if (i7 == 1) {
                        interfaceC4161 = c5640.f18587;
                        AbstractC0186.m409(obj7);
                    } else {
                        if (i7 != 2) {
                            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC0186.m409(obj7);
                    }
                    return c2358;
                }
                AbstractC0186.m409(obj7);
                InterfaceC4161 interfaceC4163 = (InterfaceC4161) obj5;
                c5640.f18587 = interfaceC4163;
                c5640.f18585 = 1;
                Object objM1078 = AbstractC0487.m1078((WorkDatabase) obj4, true, (C3875) obj3, c5640);
                if (objM1078 == enumC2282) {
                    return enumC2282;
                }
                interfaceC4161 = interfaceC4163;
                obj7 = objM1078;
                c5640.f18587 = null;
                c5640.f18585 = 2;
                if (interfaceC4161.mo978(obj7, c5640) == enumC2282) {
                    return enumC2282;
                }
                return c2358;
            default:
                Object objM1967 = AbstractC0949.m1967((InterfaceC3534) obj5, obj2, obj4, (C5030) obj3, interfaceC0443);
                return objM1967 == enumC2282 ? objM1967 : c2358;
        }
    }

    public /* synthetic */ C0670(Object obj, Object obj2, Object obj3, int i) {
        this.f2469 = i;
        this.f2468 = obj;
        this.f2466 = obj2;
        this.f2467 = obj3;
    }
}
