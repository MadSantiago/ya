package p000;

/* JADX INFO: renamed from: ۥٍؚؗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0981 extends AbstractC0868 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ InterfaceC4643 f3465;

    /* JADX INFO: renamed from: ۥْ */
    public int f3466;

    /* JADX INFO: renamed from: ۥٓ */
    public /* synthetic */ Object f3467;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ C3821 f3468;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ InterfaceC2609 f3469;

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ InterfaceC4745 f3470;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ InterfaceC4745 f3471;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ InterfaceC4745 f3472;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0981(InterfaceC4643 interfaceC4643, C3821 c3821, InterfaceC4745 interfaceC4745, InterfaceC4745 interfaceC4746, InterfaceC2609 interfaceC2609, InterfaceC4745 interfaceC4747, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f3465 = interfaceC4643;
        this.f3468 = c3821;
        this.f3471 = interfaceC4745;
        this.f3472 = interfaceC4746;
        this.f3469 = interfaceC2609;
        this.f3470 = interfaceC4747;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        C0981 c0981 = new C0981(this.f3465, this.f3468, this.f3471, this.f3472, this.f3469, this.f3470, interfaceC0443);
        c0981.f3467 = obj;
        return c0981;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f3466;
        if (i == 0) {
            AbstractC0186.m409(obj);
            C5475 c5475 = (C5475) this.f3467;
            this.f3466 = 1;
            Object objM6013 = AbstractC3257.m6013(c5475, this.f3465, this.f3468, this.f3471, this.f3472, this.f3469, this.f3470, this);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objM6013 == enumC2282) {
                return enumC2282;
            }
        } else {
            if (i != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC0186.m409(obj);
        }
        return C2358.f7817;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        return ((C0981) mo217((InterfaceC0443) obj2, (C5475) obj)).mo218(C2358.f7817);
    }
}
