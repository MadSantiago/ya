package p000;

/* JADX INFO: renamed from: ۥؐؖٔٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0136 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥؖ */
    public final /* synthetic */ Object f539;

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f540 = 1;

    /* JADX INFO: renamed from: ۥٖ */
    public int f541;

    /* JADX INFO: renamed from: ۥٙ */
    public final /* synthetic */ Object f542;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ Object f543;

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ Object f544;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ long f545;

    /* JADX INFO: renamed from: ۦۛ */
    public /* synthetic */ Object f546;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0136(InterfaceC2007 interfaceC2007, String str, long j, C3346 c3346, C3635 c3635, InterfaceC4120 interfaceC4120, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f546 = interfaceC2007;
        this.f543 = str;
        this.f545 = j;
        this.f544 = c3346;
        this.f542 = c3635;
        this.f539 = interfaceC4120;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f540;
        Object obj2 = this.f539;
        Object obj3 = this.f542;
        Object obj4 = this.f544;
        Object obj5 = this.f543;
        switch (i) {
            case 0:
                C0136 c0136 = new C0136((C4174) obj5, (C2567) obj4, (InterfaceC3762) obj3, this.f545, (InterfaceC3196) obj2, interfaceC0443);
                c0136.f546 = obj;
                return c0136;
            default:
                return new C0136((InterfaceC2007) this.f546, (String) obj5, this.f545, (C3346) obj4, (C3635) obj3, (InterfaceC4120) obj2, interfaceC0443);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0051  */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        Object objM5144;
        int i = this.f540;
        Object obj2 = this.f544;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        Object obj3 = this.f542;
        Object obj4 = this.f543;
        Object obj5 = this.f539;
        C2358 c2358 = C2358.f7817;
        InterfaceC0443 interfaceC0443 = null;
        switch (i) {
            case 0:
                InterfaceC3762 interfaceC3762 = (InterfaceC3762) obj3;
                C2567 c2567 = (C2567) obj2;
                C4174 c4174 = (C4174) obj4;
                int i2 = this.f541;
                if (i2 == 0) {
                    AbstractC0186.m409(obj);
                    C3594 c3594 = (C3594) this.f546;
                    c4174.f13904 = c2567.m4842(interfaceC3762, this.f545);
                    C3464 c3464 = new C3464(c2567, c4174, (InterfaceC3196) obj5, c3594);
                    C1597 c1597 = new C1597(c2567, c4174, interfaceC3762, 4);
                    this.f541 = 1;
                    if (c4174.m7372(c3464, c1597, this) == enumC2282) {
                        return enumC2282;
                    }
                } else {
                    if (i2 != 1) {
                        C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC0186.m409(obj);
                }
                return c2358;
            default:
                InterfaceC4120 interfaceC4120 = (InterfaceC4120) obj5;
                String str = (String) obj4;
                C3635 c3635 = (C3635) obj3;
                int i3 = this.f541;
                if (i3 == 0) {
                    AbstractC0186.m409(obj);
                    InterfaceC2007 interfaceC2007 = (InterfaceC2007) this.f546;
                    this.f541 = 1;
                    C0385 c0385 = (C0385) interfaceC2007;
                    c0385.getClass();
                    if (str.length() == 0) {
                        objM5144 = null;
                    } else {
                        long j = this.f545;
                        if (C3346.m6107(j)) {
                            objM5144 = null;
                        } else {
                            objM5144 = AbstractC2765.m5144(c0385.f1439, new C1734(c0385, new C5730(j, null, c0385, str), interfaceC0443, 6), this);
                        }
                    }
                    if (objM5144 == enumC2282) {
                        return enumC2282;
                    }
                } else {
                    if (i3 != 1) {
                        C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC0186.m409(obj);
                    objM5144 = obj;
                    str = str;
                }
                C3346 c3346 = (C3346) objM5144;
                if (c3346 != null) {
                    long j2 = c3346.f11197;
                    long jM5145 = AbstractC2765.m5145(interfaceC4120.mo4318((int) (j2 >> 32)), interfaceC4120.mo4318((int) (j2 & 4294967295L)));
                    if (!C3346.m6112(jM5145, (C3346) obj2) && AbstractC3831.m6874(c3635.m6479().f18944.f4307, str) && interfaceC4120 == c3635.f12147) {
                        c3635.f12138.mo211(C3635.m6468(c3635.m6479().f18944, jM5145));
                        c3635.f12160 = new C3346(jM5145);
                    }
                }
                return c2358;
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f540;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                return ((C0136) mo217((InterfaceC0443) obj2, (C3594) obj)).mo218(c2358);
            default:
                return ((C0136) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0136(C4174 c4174, C2567 c2567, InterfaceC3762 interfaceC3762, long j, InterfaceC3196 interfaceC3196, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f543 = c4174;
        this.f544 = c2567;
        this.f542 = interfaceC3762;
        this.f545 = j;
        this.f539 = interfaceC3196;
    }
}
