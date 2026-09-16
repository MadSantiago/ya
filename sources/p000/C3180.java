package p000;

/* JADX INFO: renamed from: ۦًؓؕؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3180 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f10681;

    /* JADX INFO: renamed from: ۥٖ */
    public int f10682;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ InterfaceC4367 f10683;

    /* JADX INFO: renamed from: ۦٗ */
    public /* synthetic */ Object f10684;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ InterfaceC5731 f10685;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3180(InterfaceC5731 interfaceC5731, InterfaceC4367 interfaceC4367, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f10681 = i;
        this.f10685 = interfaceC5731;
        this.f10683 = interfaceC4367;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        switch (this.f10681) {
            case 0:
                C3180 c3180 = new C3180(this.f10685, this.f10683, interfaceC0443, 0);
                c3180.f10684 = obj;
                return c3180;
            default:
                C3180 c3181 = new C3180(this.f10685, this.f10683, interfaceC0443, 1);
                c3181.f10684 = obj;
                return c3181;
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f10681;
        C2358 c2358 = C2358.f7817;
        InterfaceC4367 interfaceC4367 = this.f10683;
        InterfaceC5731 interfaceC5731 = this.f10685;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        switch (i) {
            case 0:
                int i2 = this.f10682;
                if (i2 == 0) {
                    AbstractC0186.m409(obj);
                    C5305 c5305 = new C5305(interfaceC4367, ((InterfaceC4643) this.f10684).mo1586());
                    this.f10682 = 1;
                    return interfaceC5731.mo219(c5305, this) == enumC2282 ? enumC2282 : c2358;
                }
                if (i2 == 1) {
                    AbstractC0186.m409(obj);
                    return c2358;
                }
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i3 = this.f10682;
                if (i3 == 0) {
                    AbstractC0186.m409(obj);
                    C5305 c5306 = new C5305(interfaceC4367, ((InterfaceC4643) this.f10684).mo1586());
                    this.f10682 = 1;
                    return interfaceC5731.mo219(c5306, this) == enumC2282 ? enumC2282 : c2358;
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
        int i = this.f10681;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((C3180) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
    }
}
