package p000;

/* JADX INFO: renamed from: ۦۦٖؔۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5761 extends AbstractC2426 implements InterfaceC3275 {

    /* JADX INFO: renamed from: ۥَ */
    public int f18984;

    /* JADX INFO: renamed from: ۥٖ */
    public /* synthetic */ C2099 f18985;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ C4536 f18986;

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ float f18987;

    /* JADX INFO: renamed from: ۦٗ */
    public /* synthetic */ C3402 f18988;

    /* JADX INFO: renamed from: ۦۛ */
    public /* synthetic */ Object f18989;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5761(C4536 c4536, float f, InterfaceC0443 interfaceC0443) {
        super(4, interfaceC0443);
        this.f18986 = c4536;
        this.f18987 = f;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f18984;
        if (i == 0) {
            AbstractC0186.m409(obj);
            C2099 c2099 = this.f18985;
            float fM6157 = this.f18988.m6157(this.f18989);
            if (!Float.isNaN(fM6157)) {
                C1916 c1916 = new C1916();
                C4536 c4536 = this.f18986;
                float fM1711 = Float.isNaN(c4536.f14997.m1711()) ? 0.0f : c4536.f14997.m1711();
                c1916.f6312 = fM1711;
                InterfaceC0215 interfaceC0215 = ((C1705) c4536.f14987.f1679).f5670;
                C1043 c1043 = new C1043(c2099, c1916, 0);
                this.f18985 = null;
                this.f18988 = null;
                this.f18984 = 1;
                Object objM6863 = AbstractC3831.m6863(fM1711, fM6157, this.f18987, interfaceC0215, c1043, this);
                EnumC2282 enumC2282 = EnumC2282.f7590;
                if (objM6863 == enumC2282) {
                    return enumC2282;
                }
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

    @Override // p000.InterfaceC3275
    /* JADX INFO: renamed from: ۦ۟ */
    public final Object mo1822(Object obj, Object obj2, Object obj3, Object obj4) {
        C5761 c5761 = new C5761(this.f18986, this.f18987, (InterfaceC0443) obj4);
        c5761.f18985 = (C2099) obj;
        c5761.f18988 = (C3402) obj2;
        c5761.f18989 = obj3;
        return c5761.mo218(C2358.f7817);
    }
}
