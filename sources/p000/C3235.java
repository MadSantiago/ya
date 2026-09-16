package p000;

/* JADX INFO: renamed from: ۦْؔؗٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3235 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f10871;

    /* JADX INFO: renamed from: ۥٖ */
    public int f10872;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C3821 f10873;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3235(C3821 c3821, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f10871 = i;
        this.f10873 = c3821;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f10871;
        C3821 c3821 = this.f10873;
        switch (i) {
            case 0:
                return new C3235(c3821, interfaceC0443, 0);
            default:
                return new C3235(c3821, interfaceC0443, 1);
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f10871;
        C2358 c2358 = C2358.f7817;
        C3821 c3821 = this.f10873;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        switch (i) {
            case 0:
                int i2 = this.f10872;
                if (i2 == 0) {
                    AbstractC0186.m409(obj);
                    this.f10872 = 1;
                    return c3821.m6816(this) == enumC2282 ? enumC2282 : c2358;
                }
                if (i2 == 1) {
                    AbstractC0186.m409(obj);
                    return c2358;
                }
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i3 = this.f10872;
                if (i3 == 0) {
                    AbstractC0186.m409(obj);
                    this.f10872 = 1;
                    return c3821.m6816(this) == enumC2282 ? enumC2282 : c2358;
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
        int i = this.f10871;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((C3235) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
    }
}
