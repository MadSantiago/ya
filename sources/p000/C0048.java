package p000;

/* JADX INFO: renamed from: ۥۦ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0048 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f9190;

    /* JADX INFO: renamed from: ۥٖ */
    public int f9191;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C2243 f9192;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ C3656 f9193;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0048(C3656 c3656, C2243 c2243, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f9190 = 0;
        this.f9193 = c3656;
        this.f9192 = c2243;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f9190;
        C3656 c3656 = this.f9193;
        C2243 c2243 = this.f9192;
        switch (i) {
            case 0:
                return new C0048(c3656, c2243, interfaceC0443);
            case 1:
                return new C0048(c2243, c3656, interfaceC0443, 1);
            default:
                return new C0048(c2243, c3656, interfaceC0443, 2);
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f9190;
        C2358 c2358 = C2358.f7817;
        C3656 c3656 = this.f9193;
        C2243 c2243 = this.f9192;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        switch (i) {
            case 0:
                int i2 = this.f9191;
                if (i2 == 0) {
                    AbstractC0186.m409(obj);
                    C0694 c0694 = new C0694(c3656);
                    this.f9191 = 1;
                    return c2243.m4292(c0694, this) == enumC2282 ? enumC2282 : c2358;
                }
                if (i2 == 1) {
                    AbstractC0186.m409(obj);
                    return c2358;
                }
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i3 = this.f9191;
                if (i3 == 0) {
                    AbstractC0186.m409(obj);
                    this.f9191 = 1;
                    return c2243.m4292(c3656, this) == enumC2282 ? enumC2282 : c2358;
                }
                if (i3 == 1) {
                    AbstractC0186.m409(obj);
                    return c2358;
                }
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i4 = this.f9191;
                if (i4 == 0) {
                    AbstractC0186.m409(obj);
                    this.f9191 = 1;
                    return c2243.m4292(c3656, this) == enumC2282 ? enumC2282 : c2358;
                }
                if (i4 == 1) {
                    AbstractC0186.m409(obj);
                    return c2358;
                }
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f9190;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C0048) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0048(C2243 c2243, C3656 c3656, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f9190 = i;
        this.f9192 = c2243;
        this.f9193 = c3656;
    }
}
