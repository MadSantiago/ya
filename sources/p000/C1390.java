package p000;

/* JADX INFO: renamed from: ۥٕؒۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1390 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f4748;

    /* JADX INFO: renamed from: ۥٖ */
    public int f4749;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C4589 f4750;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1390(C4589 c4589, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f4748 = i;
        this.f4750 = c4589;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f4748;
        C4589 c4589 = this.f4750;
        switch (i) {
            case 0:
                return new C1390(c4589, interfaceC0443, 0);
            default:
                return new C1390(c4589, interfaceC0443, 1);
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f4748;
        C4589 c4589 = this.f4750;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        switch (i) {
            case 0:
                int i2 = this.f4749;
                if (i2 == 0) {
                    AbstractC0186.m409(obj);
                    InterfaceC4707 interfaceC4707Mo2232 = c4589.f15140.mo2232();
                    C3661 c3661 = new C3661(c4589.f15139);
                    this.f4749 = 1;
                    if (interfaceC4707Mo2232.mo1575(c3661, this) == enumC2282) {
                        return enumC2282;
                    }
                } else {
                    if (i2 != 1) {
                        C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC0186.m409(obj);
                }
                return C2358.f7817;
            default:
                int i3 = this.f4749;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC0186.m409(obj);
                        return obj;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
                InterfaceC4707 interfaceC4707Mo2233 = c4589.f15140.mo2232();
                this.f4749 = 1;
                Object objM9059 = AbstractC5378.m9059(interfaceC4707Mo2233, this);
                return objM9059 == enumC2282 ? enumC2282 : objM9059;
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f4748;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((C1390) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
    }
}
