package p000;

/* JADX INFO: renamed from: ۥؗؕٝٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0610 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f2285;

    /* JADX INFO: renamed from: ۥٖ */
    public int f2286;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ InterfaceC4038 f2287;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ InterfaceC1126 f2288;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0610(InterfaceC4038 interfaceC4038, InterfaceC1126 interfaceC1126, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f2285 = i;
        this.f2287 = interfaceC4038;
        this.f2288 = interfaceC1126;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        switch (this.f2285) {
            case 0:
                return new C0610(this.f2287, this.f2288, interfaceC0443, 0);
            case 1:
                return new C0610(this.f2287, this.f2288, interfaceC0443, 1);
            default:
                return new C0610(this.f2287, this.f2288, interfaceC0443, 2);
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f2285;
        InterfaceC1126 interfaceC1126 = this.f2288;
        InterfaceC4038 interfaceC4038 = this.f2287;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        C2358 c2358 = C2358.f7817;
        InterfaceC0443 interfaceC0443 = null;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.f2286;
                if (i3 == 0) {
                    AbstractC0186.m409(obj);
                    this.f2286 = 1;
                    Object objM7173 = AbstractC4009.m7173(new C5486(interfaceC4038, interfaceC1126, null), this);
                    if (objM7173 != enumC2282) {
                        objM7173 = c2358;
                    }
                    if (objM7173 == enumC2282) {
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
                int i4 = this.f2286;
                if (i4 == 0) {
                    AbstractC0186.m409(obj);
                    this.f2286 = 1;
                    Object objM4126 = AbstractC2133.m4126(interfaceC4038, new C1294(interfaceC1126, interfaceC0443, i2), this);
                    if (objM4126 != enumC2282) {
                        objM4126 = c2358;
                    }
                    if (objM4126 == enumC2282) {
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
                int i5 = this.f2286;
                if (i5 == 0) {
                    AbstractC0186.m409(obj);
                    this.f2286 = 1;
                    C4859 c4859 = new C4859(interfaceC1126, 0);
                    C1374 c1374 = new C1374(interfaceC1126, 0);
                    C1374 c1375 = new C1374(interfaceC1126, 1);
                    C4164 c4164 = new C4164(7, interfaceC1126);
                    float f = AbstractC0719.f2628;
                    Object objM4127 = AbstractC2133.m4126(interfaceC4038, new C5542(new C0062(25), new C3032(2, c4859), c4164, c1375, new C0091(9, c1374), null), this);
                    if (objM4127 != enumC2282) {
                        objM4127 = c2358;
                    }
                    if (objM4127 != enumC2282) {
                        objM4127 = c2358;
                    }
                    if (objM4127 != enumC2282) {
                        objM4127 = c2358;
                    }
                    if (objM4127 == enumC2282) {
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
        int i = this.f2285;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C0610) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
    }
}
