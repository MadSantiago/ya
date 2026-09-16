package p000;

/* JADX INFO: renamed from: ۥؘٛؒٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1763 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f5870;

    /* JADX INFO: renamed from: ۥٖ */
    public int f5871;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C2424 f5872;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ float f5873;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1763(C2424 c2424, float f, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f5870 = i;
        this.f5872 = c2424;
        this.f5873 = f;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f5870;
        float f = this.f5873;
        C2424 c2424 = this.f5872;
        switch (i) {
            case 0:
                return new C1763(c2424, f, interfaceC0443, 0);
            default:
                return new C1763(c2424, f, interfaceC0443, 1);
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f5870;
        C2358 c2358 = C2358.f7817;
        float f = this.f5873;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        C2424 c2424 = this.f5872;
        switch (i) {
            case 0:
                int i2 = this.f5871;
                if (i2 == 0) {
                    AbstractC0186.m409(obj);
                    C5825 c5825 = c2424.f8082;
                    if (c5825 == null) {
                        return c2358;
                    }
                    Float f2 = new Float(f);
                    InterfaceC3347 interfaceC3347 = c2424.f8080 ? AbstractC3925.f13097 : c2424.f8079;
                    this.f5871 = 1;
                    obj = C5825.m9634(c5825, f2, interfaceC3347, this, 12);
                    if (obj == enumC2282) {
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
                int i3 = this.f5871;
                if (i3 == 0) {
                    AbstractC0186.m409(obj);
                    C5825 c5826 = c2424.f8084;
                    if (c5826 == null) {
                        return c2358;
                    }
                    Float f3 = new Float(f);
                    InterfaceC3347 interfaceC3348 = c2424.f8080 ? AbstractC3925.f13097 : c2424.f8079;
                    this.f5871 = 1;
                    obj = C5825.m9634(c5826, f3, interfaceC3348, this, 12);
                    if (obj == enumC2282) {
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
        int i = this.f5870;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((C1763) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
    }
}
