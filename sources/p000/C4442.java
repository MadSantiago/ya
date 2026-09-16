package p000;

/* JADX INFO: renamed from: ۦٌ٘ؖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4442 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f14643;

    /* JADX INFO: renamed from: ۥٖ */
    public int f14644;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C5013 f14645;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ C0948 f14646;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4442(C5013 c5013, C0948 c0948, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f14643 = i;
        this.f14645 = c5013;
        this.f14646 = c0948;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f14643;
        C0948 c0948 = this.f14646;
        C5013 c5013 = this.f14645;
        switch (i) {
            case 0:
                return new C4442(c5013, c0948, interfaceC0443, 0);
            default:
                return new C4442(c5013, c0948, interfaceC0443, 1);
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f14643;
        C2358 c2358 = C2358.f7817;
        C0948 c0948 = this.f14646;
        C5013 c5013 = this.f14645;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        switch (i) {
            case 0:
                int i2 = this.f14644;
                if (i2 != 0) {
                    if (i2 == 1) {
                        AbstractC0186.m409(obj);
                        return c2358;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
                C5825 c5825 = c5013.f16587;
                Float f = new Float(AbstractC1099.f3869.mo1642(c0948.f3355));
                this.f14644 = 1;
                return c5825.m9636(this, f) == enumC2282 ? enumC2282 : c2358;
            default:
                int i3 = this.f14644;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC0186.m409(obj);
                        return c2358;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
                C5825 c5826 = c5013.f16587;
                Float f2 = new Float(AbstractC1099.f3869.mo1642(c0948.f3355));
                this.f14644 = 1;
                return c5826.m9636(this, f2) == enumC2282 ? enumC2282 : c2358;
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f14643;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((C4442) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
    }
}
