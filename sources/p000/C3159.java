package p000;

/* JADX INFO: renamed from: ۦٕؓؒؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3159 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f10638;

    /* JADX INFO: renamed from: ۥٖ */
    public int f10639;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C2384 f10640;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3159(C2384 c2384, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f10638 = i;
        this.f10640 = c2384;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f10638;
        C2384 c2384 = this.f10640;
        switch (i) {
            case 0:
                return new C3159(c2384, interfaceC0443, 0);
            case 1:
                return new C3159(c2384, interfaceC0443, 1);
            default:
                return new C3159(c2384, interfaceC0443, 2);
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        Object objM1393;
        Object objM1394;
        int i = this.f10638;
        C2384 c2384 = this.f10640;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        C2358 c2358 = C2358.f7817;
        InterfaceC0443 interfaceC0443 = null;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.f10639;
                if (i3 == 0) {
                    AbstractC0186.m409(obj);
                    this.f10639 = 1;
                    C3843 c3843 = AbstractC0630.f2331;
                    if (c2384.m1405() - 1 < 0 || (objM1393 = c2384.m1393(c2384.m1405() - 1, AbstractC4489.m7811(0.0f, 0.0f, null, 7), this)) != enumC2282) {
                        objM1393 = c2358;
                    }
                    if (objM1393 == enumC2282) {
                        return enumC2282;
                    }
                } else {
                    if (i3 != 1) {
                        C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC0186.m409(obj);
                }
                return c2358;
            case 1:
                int i4 = this.f10639;
                if (i4 == 0) {
                    AbstractC0186.m409(obj);
                    this.f10639 = 1;
                    C3843 c3844 = AbstractC0630.f2331;
                    if (c2384.m1405() + 1 >= c2384.mo1406() || (objM1394 = c2384.m1393(c2384.m1405() + 1, AbstractC4489.m7811(0.0f, 0.0f, null, 7), this)) != enumC2282) {
                        objM1394 = c2358;
                    }
                    if (objM1394 == enumC2282) {
                        return enumC2282;
                    }
                } else {
                    if (i4 != 1) {
                        C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC0186.m409(obj);
                }
                return c2358;
            default:
                int i5 = this.f10639;
                if (i5 == 0) {
                    AbstractC0186.m409(obj);
                    this.f10639 = 1;
                    Object objM1389 = AbstractC0631.m1389(c2384, EnumC4386.f14455, new C2499(2, interfaceC0443, i2), this);
                    if (objM1389 != enumC2282) {
                        objM1389 = c2358;
                    }
                    if (objM1389 == enumC2282) {
                        return enumC2282;
                    }
                } else {
                    if (i5 != 1) {
                        C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC0186.m409(obj);
                }
                return c2358;
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f10638;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C3159) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
    }
}
