package p000;

/* JADX INFO: renamed from: ۦُ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0068 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f12962;

    /* JADX INFO: renamed from: ۥٖ */
    public int f12963;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ AbstractC0006 f12964;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ C3656 f12965;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0068(AbstractC0006 abstractC0006, C3656 c3656, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f12962 = i;
        this.f12964 = abstractC0006;
        this.f12965 = c3656;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f12962;
        C3656 c3656 = this.f12965;
        AbstractC0006 abstractC0006 = this.f12964;
        switch (i) {
            case 0:
                return new C0068(abstractC0006, c3656, interfaceC0443, 0);
            case 1:
                return new C0068(abstractC0006, c3656, interfaceC0443, 1);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0068(abstractC0006, c3656, interfaceC0443, 2);
            default:
                return new C0068(abstractC0006, c3656, interfaceC0443, 3);
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f12962;
        C2358 c2358 = C2358.f7817;
        C3656 c3656 = this.f12965;
        AbstractC0006 abstractC0006 = this.f12964;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        switch (i) {
            case 0:
                int i2 = this.f12963;
                if (i2 != 0) {
                    if (i2 == 1) {
                        AbstractC0186.m409(obj);
                        return c2358;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
                C2243 c2243 = abstractC0006.f1324;
                if (c2243 == null) {
                    return c2358;
                }
                C0199 c0199 = new C0199(c3656);
                this.f12963 = 1;
                return c2243.m4292(c0199, this) == enumC2282 ? enumC2282 : c2358;
            case 1:
                int i3 = this.f12963;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC0186.m409(obj);
                        return c2358;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
                C2243 c2244 = abstractC0006.f1324;
                if (c2244 == null) {
                    return c2358;
                }
                C0199 c01910 = new C0199(c3656);
                this.f12963 = 1;
                return c2244.m4292(c01910, this) == enumC2282 ? enumC2282 : c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                int i4 = this.f12963;
                if (i4 != 0) {
                    if (i4 == 1) {
                        AbstractC0186.m409(obj);
                        return c2358;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
                C2243 c2245 = abstractC0006.f1324;
                if (c2245 == null) {
                    return c2358;
                }
                this.f12963 = 1;
                return c2245.m4292(c3656, this) == enumC2282 ? enumC2282 : c2358;
            default:
                int i5 = this.f12963;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC0186.m409(obj);
                        return c2358;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
                C2243 c2246 = abstractC0006.f1324;
                if (c2246 == null) {
                    return c2358;
                }
                C0694 c0694 = new C0694(c3656);
                this.f12963 = 1;
                return c2246.m4292(c0694, this) == enumC2282 ? enumC2282 : c2358;
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f12962;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                break;
        }
        return ((C0068) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
    }
}
