package p000;

/* JADX INFO: renamed from: ۦٜؕؕؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3280 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f10994;

    /* JADX INFO: renamed from: ۥٖ */
    public int f10995;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ C3536 f10996;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ InterfaceC2609 f10997;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ C3821 f10998;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3280(InterfaceC2609 interfaceC2609, C3821 c3821, C3536 c3536, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f10994 = i;
        this.f10997 = interfaceC2609;
        this.f10998 = c3821;
        this.f10996 = c3536;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        switch (this.f10994) {
            case 0:
                return new C3280(this.f10997, this.f10998, this.f10996, interfaceC0443, 0);
            default:
                return new C3280(this.f10997, this.f10998, this.f10996, interfaceC0443, 1);
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f10994;
        C2358 c2358 = C2358.f7817;
        C3536 c3536 = this.f10996;
        C3821 c3821 = this.f10998;
        InterfaceC2609 interfaceC2609 = this.f10997;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        switch (i) {
            case 0:
                int i2 = this.f10995;
                if (i2 == 0) {
                    AbstractC0186.m409(obj);
                    C1553 c1553 = new C1553(c3536.f11726);
                    this.f10995 = 1;
                    return interfaceC2609.mo1173(c3821, c1553, this) == enumC2282 ? enumC2282 : c2358;
                }
                if (i2 == 1) {
                    AbstractC0186.m409(obj);
                    return c2358;
                }
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i3 = this.f10995;
                if (i3 == 0) {
                    AbstractC0186.m409(obj);
                    C1553 c1554 = new C1553(c3536.f11726);
                    this.f10995 = 1;
                    return interfaceC2609.mo1173(c3821, c1554, this) == enumC2282 ? enumC2282 : c2358;
                }
                if (i3 == 1) {
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
        int i = this.f10994;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((C3280) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
    }
}
