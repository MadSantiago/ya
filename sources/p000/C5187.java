package p000;

/* JADX INFO: renamed from: ۦْۚؕۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5187 extends AbstractC0868 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public long[] f17162;

    /* JADX INFO: renamed from: ۥْ */
    public C0754 f17163;

    /* JADX INFO: renamed from: ۥٓ */
    public C5901 f17164;

    /* JADX INFO: renamed from: ۥٖ */
    public int f17165;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ C5901 f17166;

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ C0754 f17167;

    /* JADX INFO: renamed from: ۦٗ */
    public int f17168;

    /* JADX INFO: renamed from: ۦۛ */
    public /* synthetic */ Object f17169;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5187(C5901 c5901, C0754 c0754, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f17166 = c5901;
        this.f17167 = c0754;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        C5187 c5187 = new C5187(this.f17166, this.f17167, interfaceC0443);
        c5187.f17169 = obj;
        return c5187;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        C0156 c0156;
        C5901 c5901;
        long[] jArr;
        int i;
        C0754 c0754;
        int i2 = this.f17168;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            c0156 = (C0156) this.f17169;
            c5901 = this.f17166;
            C1165 c1165 = c5901.f19454;
            jArr = c1165.f4040;
            i = c1165.f4041;
            c0754 = this.f17167;
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.f17165;
            jArr = this.f17162;
            c5901 = this.f17164;
            c0754 = this.f17163;
            c0156 = (C0156) this.f17169;
            AbstractC0186.m409(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return C2358.f7817;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        c0754.f2739 = i;
        Object obj2 = c5901.f19454.f4043[i];
        this.f17169 = c0156;
        this.f17163 = c0754;
        this.f17164 = c5901;
        this.f17162 = jArr;
        this.f17165 = i3;
        this.f17168 = 1;
        c0156.m336(this, obj2);
        return EnumC2282.f7590;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        return ((C5187) mo217((InterfaceC0443) obj2, (C0156) obj)).mo218(C2358.f7817);
    }
}
