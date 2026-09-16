package p000;

/* JADX INFO: renamed from: ۥٛؗؔ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1787 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public InterfaceC4367 f5973;

    /* JADX INFO: renamed from: ۥٖ */
    public int f5974;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ C2243 f5975;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ InterfaceC4367 f5976;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ boolean f5977;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1787(InterfaceC4367 interfaceC4367, boolean z, C2243 c2243, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f5976 = interfaceC4367;
        this.f5977 = z;
        this.f5975 = c2243;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        return new C1787(this.f5976, this.f5977, this.f5975, interfaceC0443);
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) throws Throwable {
        InterfaceC4367 interfaceC4367;
        InterfaceC4367 interfaceC4368;
        int i = this.f5974;
        if (i == 0) {
            AbstractC0186.m409(obj);
            interfaceC4367 = this.f5976;
            C3656 c3656 = (C3656) interfaceC4367.getValue();
            if (c3656 != null) {
                InterfaceC2714 c0694 = this.f5977 ? new C0694(c3656) : new C0199(c3656);
                C2243 c2243 = this.f5975;
                if (c2243 != null) {
                    this.f5973 = interfaceC4367;
                    this.f5974 = 1;
                    Object objM4292 = c2243.m4292(c0694, this);
                    EnumC2282 enumC2282 = EnumC2282.f7590;
                    if (objM4292 == enumC2282) {
                        return enumC2282;
                    }
                    interfaceC4368 = interfaceC4367;
                }
                interfaceC4367.setValue(null);
            }
            return C2358.f7817;
        }
        if (i != 1) {
            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        interfaceC4368 = this.f5973;
        AbstractC0186.m409(obj);
        interfaceC4367 = interfaceC4368;
        interfaceC4367.setValue(null);
        return C2358.f7817;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        return ((C1787) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(C2358.f7817);
    }
}
