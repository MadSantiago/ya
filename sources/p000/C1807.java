package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ۥٜؑۚٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1807 extends AbstractC2426 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f6014 = 1;

    /* JADX INFO: renamed from: ۥٖ */
    public int f6015;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ Object f6016;

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ Object f6017;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C4482 f6018;

    /* JADX INFO: renamed from: ۦۛ */
    public Object f6019;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1807(C5450 c5450, C4482 c4482, C4763 c4763, InterfaceC0443 interfaceC0443) {
        super(1, interfaceC0443);
        this.f6016 = c5450;
        this.f6018 = c4482;
        this.f6017 = c4763;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) throws Throwable {
        C5450 c5450;
        C4763 c4763;
        C4127 c4127;
        Object obj2;
        int iHashCode;
        int i = this.f6014;
        Object obj3 = this.f6017;
        Object obj4 = this.f6016;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        C4482 c4482 = this.f6018;
        InterfaceC0443 interfaceC0443 = null;
        switch (i) {
            case 0:
                C4763 c4764 = (C4763) obj3;
                C5450 c5451 = (C5450) obj4;
                int i2 = this.f6015;
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            c5450 = (C5450) ((Serializable) this.f6019);
                            AbstractC0186.m409(obj);
                        } else {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                c4764 = (C4763) ((Serializable) this.f6019);
                                AbstractC0186.m409(obj);
                                c4764.f15714 = ((Number) obj).intValue();
                                return C2358.f7817;
                            }
                            c4763 = (C4763) ((Serializable) this.f6019);
                            AbstractC0186.m409(obj);
                        }
                        c4763.f15714 = ((Number) obj).intValue();
                        return C2358.f7817;
                    }
                    AbstractC0186.m409(obj);
                    this.f6019 = c5451;
                    this.f6015 = 1;
                    obj = ((C1988) c4482.f14800.getValue()).m3891(new C2476(3, (InterfaceC0443) null), this);
                    if (obj == enumC2282) {
                        return enumC2282;
                    }
                    c5450 = c5451;
                    c5450.f17965 = obj;
                    InterfaceC5823 interfaceC5823M7761 = c4482.m7761();
                    this.f6019 = c4764;
                    this.f6015 = 2;
                    obj = interfaceC5823M7761.mo5825(this);
                    if (obj == enumC2282) {
                        return enumC2282;
                    }
                    c4763 = c4764;
                    c4763.f15714 = ((Number) obj).intValue();
                    return C2358.f7817;
                } catch (C1042 unused) {
                    Object obj5 = c5451.f17965;
                    this.f6019 = c4764;
                    this.f6015 = 3;
                    obj = c4482.m7762(obj5, true, this);
                    if (obj == enumC2282) {
                        return enumC2282;
                    }
                }
            default:
                int i3 = this.f6015;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC0186.m409(obj);
                    } else if (i3 == 2) {
                        c4127 = (C4127) this.f6019;
                        AbstractC0186.m409(obj);
                        obj2 = c4127.f13747;
                        if (obj2 != null) {
                            iHashCode = obj2.hashCode();
                        } else {
                            iHashCode = 0;
                        }
                        if (iHashCode != c4127.f13746) {
                            if (!AbstractC3831.m6874(c4127.f13747, obj)) {
                                this.f6019 = obj;
                                this.f6015 = 3;
                                if (c4482.m7762(obj, true, this) == enumC2282) {
                                    return enumC2282;
                                }
                            }
                            return obj;
                        }
                        C1078.m2276("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    } else {
                        if (i3 == 3) {
                            Object obj6 = this.f6019;
                            AbstractC0186.m409(obj);
                            return obj6;
                        }
                        C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC0186.m409(obj);
                this.f6015 = 1;
                obj = c4482.m7763(true, this);
                if (obj == enumC2282) {
                    return enumC2282;
                }
                c4127 = (C4127) obj;
                C0023 c0023 = new C0023((InterfaceC5731) obj3, c4127, interfaceC0443, 20);
                this.f6019 = c4127;
                this.f6015 = 2;
                obj = AbstractC2765.m5144((InterfaceC3534) obj4, c0023, this);
                if (obj == enumC2282) {
                    return enumC2282;
                }
                obj2 = c4127.f13747;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                if (iHashCode != c4127.f13746) {
                    C1078.m2276("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    return null;
                }
                if (!AbstractC3831.m6874(c4127.f13747, obj)) {
                    this.f6019 = obj;
                    this.f6015 = 3;
                    if (c4482.m7762(obj, true, this) == enumC2282) {
                        return enumC2282;
                    }
                }
                return obj;
        }
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f6014;
        C2358 c2358 = C2358.f7817;
        Object obj2 = this.f6017;
        Object obj3 = this.f6016;
        C4482 c4482 = this.f6018;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj;
        switch (i) {
            case 0:
                return new C1807((C5450) obj3, c4482, (C4763) obj2, interfaceC0443).mo218(c2358);
            default:
                return new C1807(c4482, (InterfaceC3534) obj3, (InterfaceC5731) obj2, interfaceC0443).mo218(c2358);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1807(C4482 c4482, InterfaceC3534 interfaceC3534, InterfaceC5731 interfaceC5731, InterfaceC0443 interfaceC0443) {
        super(1, interfaceC0443);
        this.f6018 = c4482;
        this.f6016 = interfaceC3534;
        this.f6017 = interfaceC5731;
    }
}
