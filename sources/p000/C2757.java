package p000;

/* JADX INFO: renamed from: ۥۥٍّؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2757 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f9132;

    /* JADX INFO: renamed from: ۥٖ */
    public int f9133;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C2074 f9134;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2757(C2074 c2074, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f9132 = i;
        this.f9134 = c2074;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f9132;
        C2074 c2074 = this.f9134;
        switch (i) {
            case 0:
                return new C2757(c2074, interfaceC0443, 0);
            default:
                return new C2757(c2074, interfaceC0443, 1);
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f9132;
        C2074 c2074 = this.f9134;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                int i2 = this.f9133;
                if (i2 == 0) {
                    AbstractC0186.m409(obj);
                    ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = c2074.f6848;
                    this.f9133 = 1;
                    Object objM4509 = viewTreeObserverOnGlobalLayoutListenerC0850.f3129.m4509(this);
                    if (objM4509 != enumC2282) {
                        objM4509 = c2358;
                    }
                    if (objM4509 == enumC2282) {
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
                int i3 = this.f9133;
                if (i3 == 0) {
                    AbstractC0186.m409(obj);
                    ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0851 = c2074.f6848;
                    this.f9133 = 1;
                    Object objM7609 = viewTreeObserverOnGlobalLayoutListenerC0851.f3134.m7609(this);
                    if (objM7609 != enumC2282) {
                        objM7609 = c2358;
                    }
                    if (objM7609 == enumC2282) {
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
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f9132;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((C2757) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
    }
}
