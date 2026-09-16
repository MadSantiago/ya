package p000;

/* JADX INFO: renamed from: ۦۖؒؑٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4890 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public int f16101;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ boolean f16102;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ AbstractC2535 f16103;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ long f16104;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4890(boolean z, AbstractC2535 abstractC2535, long j, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f16102 = z;
        this.f16103 = abstractC2535;
        this.f16104 = j;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        return new C4890(this.f16102, this.f16103, this.f16104, interfaceC0443);
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f16101;
        if (i == 0) {
            AbstractC0186.m409(obj);
            C3323 c3323 = this.f16103.f8417;
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (this.f16102) {
                this.f16101 = 2;
                Object objM6099 = c3323.m6099(this.f16104, 0L, this);
                if (objM6099 != enumC2282) {
                    obj = objM6099;
                    long j = ((C0963) obj).f3407;
                }
            } else {
                this.f16101 = 1;
                Object objM60910 = c3323.m6099(0L, this.f16104, this);
                if (objM60910 != enumC2282) {
                    obj = objM60910;
                    long j2 = ((C0963) obj).f3407;
                }
            }
            return enumC2282;
        }
        if (i == 1) {
            AbstractC0186.m409(obj);
            long j3 = ((C0963) obj).f3407;
        } else {
            if (i != 2) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC0186.m409(obj);
            long j4 = ((C0963) obj).f3407;
        }
        return C2358.f7817;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        return ((C4890) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(C2358.f7817);
    }
}
