package p000;

/* JADX INFO: renamed from: ۥؘ٘ؕۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1576 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f5314;

    /* JADX INFO: renamed from: ۥٖ */
    public int f5315;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ C2374 f5316;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C5825 f5317;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ float f5318;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1576(C5825 c5825, float f, C2374 c2374, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f5314 = i;
        this.f5317 = c5825;
        this.f5318 = f;
        this.f5316 = c2374;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        switch (this.f5314) {
            case 0:
                return new C1576(this.f5317, this.f5318, this.f5316, interfaceC0443, 0);
            default:
                return new C1576(this.f5317, this.f5318, this.f5316, interfaceC0443, 1);
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f5314;
        C2358 c2358 = C2358.f7817;
        C2374 c2374 = this.f5316;
        float f = this.f5318;
        C5825 c5825 = this.f5317;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        switch (i) {
            case 0:
                int i2 = this.f5315;
                if (i2 != 0) {
                    if (i2 == 1) {
                        AbstractC0186.m409(obj);
                        return c2358;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
                C4497 c4497 = new C4497(f);
                InterfaceC0215 interfaceC0215 = c2374.f7859;
                this.f5315 = 1;
                return C5825.m9634(c5825, c4497, interfaceC0215, this, 12) == enumC2282 ? enumC2282 : c2358;
            default:
                int i3 = this.f5315;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC0186.m409(obj);
                        return c2358;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
                C4497 c4498 = new C4497(f);
                InterfaceC0215 interfaceC0216 = c2374.f7859;
                this.f5315 = 1;
                return C5825.m9634(c5825, c4498, interfaceC0216, this, 12) == enumC2282 ? enumC2282 : c2358;
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f5314;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((C1576) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
    }
}
