package p000;

/* JADX INFO: renamed from: ۥۤؗۚۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2695 extends AbstractC2426 implements InterfaceC2609 {

    /* JADX INFO: renamed from: ۥَ */
    public int f8938;

    /* JADX INFO: renamed from: ۥٖ */
    public /* synthetic */ C3821 f8939;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ InterfaceC4367 f8940;

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ C2243 f8941;

    /* JADX INFO: renamed from: ۦٗ */
    public /* synthetic */ long f8942;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ InterfaceC4643 f8943;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2695(InterfaceC4643 interfaceC4643, InterfaceC4367 interfaceC4367, C2243 c2243, InterfaceC0443 interfaceC0443) {
        super(3, interfaceC0443);
        this.f8943 = interfaceC4643;
        this.f8940 = interfaceC4367;
        this.f8941 = c2243;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f8938;
        InterfaceC4643 interfaceC4643 = this.f8943;
        if (i == 0) {
            AbstractC0186.m409(obj);
            C3821 c3821 = this.f8939;
            AbstractC2765.m5135(interfaceC4643, null, 0, new C0058(this.f8940, this.f8942, this.f8941, (InterfaceC0443) null, 4), 3);
            this.f8938 = 1;
            obj = c3821.m6817(this);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (obj == enumC2282) {
                return enumC2282;
            }
        } else {
            if (i != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC0186.m409(obj);
        }
        AbstractC2765.m5135(interfaceC4643, null, 0, new C1787(this.f8940, ((Boolean) obj).booleanValue(), this.f8941, null), 3);
        return C2358.f7817;
    }

    @Override // p000.InterfaceC2609
    /* JADX INFO: renamed from: ۦۙ */
    public final Object mo1173(Object obj, Object obj2, Object obj3) {
        long j = ((C1553) obj2).f5241;
        InterfaceC4367 interfaceC4367 = this.f8940;
        C2243 c2243 = this.f8941;
        C2695 c2695 = new C2695(this.f8943, interfaceC4367, c2243, (InterfaceC0443) obj3);
        c2695.f8939 = (C3821) obj;
        c2695.f8942 = j;
        return c2695.mo218(C2358.f7817);
    }
}
