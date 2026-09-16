package p000;

/* JADX INFO: renamed from: ۥؐؖۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0140 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public int f550;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ C2677 f551;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ float f552;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ float f553;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0140(C2677 c2677, float f, float f2, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f551 = c2677;
        this.f552 = f;
        this.f553 = f2;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        return new C0140(this.f551, this.f552, this.f553, interfaceC0443);
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f550;
        if (i == 0) {
            AbstractC0186.m409(obj);
            C4545 c4545 = this.f551.f8879;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f552)) << 32) | (((long) Float.floatToRawIntBits(this.f553)) & 4294967295L);
            this.f550 = 1;
            Object objM5514 = AbstractC2927.m5514(c4545, jFloatToRawIntBits, this);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objM5514 == enumC2282) {
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
        return ((C0140) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(C2358.f7817);
    }
}
