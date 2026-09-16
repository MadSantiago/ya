package p000;

/* JADX INFO: renamed from: ۥٕٓؒۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1260 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public int f4326;

    /* JADX INFO: renamed from: ۥٖ */
    public /* synthetic */ Object f4327;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C3923 f4328;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ long f4329;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1260(C3923 c3923, long j, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f4328 = c3923;
        this.f4329 = j;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        C1260 c1260 = new C1260(this.f4328, this.f4329, interfaceC0443);
        c1260.f4327 = obj;
        return c1260;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f4326;
        if (i == 0) {
            AbstractC0186.m409(obj);
            InterfaceC4643 interfaceC4643 = (InterfaceC4643) this.f4327;
            InterfaceC2609 interfaceC2609 = this.f4328.f13077;
            C1553 c1553 = new C1553(this.f4329);
            this.f4326 = 1;
            Object objMo1173 = interfaceC2609.mo1173(interfaceC4643, c1553, this);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objMo1173 == enumC2282) {
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
        return ((C1260) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(C2358.f7817);
    }
}
