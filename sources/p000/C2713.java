package p000;

/* JADX INFO: renamed from: ۥۥؙؑٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2713 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f8993;

    /* JADX INFO: renamed from: ۥٖ */
    public int f8994;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C4153 f8995;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2713(C4153 c4153, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f8993 = i;
        this.f8995 = c4153;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        switch (this.f8993) {
            case 0:
                return new C2713(this.f8995, interfaceC0443, 0);
            default:
                return new C2713(this.f8995, interfaceC0443, 1);
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f8993;
        C2358 c2358 = C2358.f7817;
        C4153 c4153 = this.f8995;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        switch (i) {
            case 0:
                int i2 = this.f8994;
                if (i2 == 0) {
                    AbstractC0186.m409(obj);
                    this.f8994 = 1;
                    return c4153.m7346(EnumC4386.f14455, this) == enumC2282 ? enumC2282 : c2358;
                }
                if (i2 == 1) {
                    AbstractC0186.m409(obj);
                    return c2358;
                }
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i3 = this.f8994;
                if (i3 == 0) {
                    AbstractC0186.m409(obj);
                    this.f8994 = 1;
                    return c4153.m7346(EnumC4386.f14454, this) == enumC2282 ? enumC2282 : c2358;
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
        int i = this.f8993;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((C2713) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
    }
}
