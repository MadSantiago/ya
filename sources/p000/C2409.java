package p000;

/* JADX INFO: renamed from: ۥۣۜؗۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2409 extends AbstractC2426 implements InterfaceC3275 {

    /* JADX INFO: renamed from: ۥَ */
    public int f8021;

    /* JADX INFO: renamed from: ۥٖ */
    public /* synthetic */ C2099 f8022;

    /* JADX INFO: renamed from: ۥٙ */
    public final /* synthetic */ InterfaceC0215 f8023;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ C1705 f8024;

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ float f8025;

    /* JADX INFO: renamed from: ۦٗ */
    public /* synthetic */ C3402 f8026;

    /* JADX INFO: renamed from: ۦۛ */
    public /* synthetic */ EnumC0845 f8027;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2409(C1705 c1705, float f, InterfaceC0215 interfaceC0215, InterfaceC0443 interfaceC0443) {
        super(4, interfaceC0443);
        this.f8024 = c1705;
        this.f8025 = f;
        this.f8023 = interfaceC0215;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f8021;
        int i2 = 1;
        if (i == 0) {
            AbstractC0186.m409(obj);
            C2099 c2099 = this.f8022;
            float fM6157 = this.f8026.m6157(this.f8027);
            if (!Float.isNaN(fM6157)) {
                C1916 c1916 = new C1916();
                C1705 c1705 = this.f8024;
                float fM1711 = Float.isNaN(c1705.f5675.f14997.m1711()) ? 0.0f : c1705.f5675.f14997.m1711();
                c1916.f6312 = fM1711;
                C1043 c1043 = new C1043(c2099, c1916, i2);
                this.f8022 = null;
                this.f8026 = null;
                this.f8021 = 1;
                Object objM6863 = AbstractC3831.m6863(fM1711, fM6157, this.f8025, this.f8023, c1043, this);
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
        float f = this.f8025;
        InterfaceC0215 interfaceC0215 = this.f8023;
        C2409 c2409 = new C2409(this.f8024, f, interfaceC0215, (InterfaceC0443) obj4);
        c2409.f8022 = (C2099) obj;
        c2409.f8026 = (C3402) obj2;
        c2409.f8027 = (EnumC0845) obj3;
        return c2409.mo218(C2358.f7817);
    }
}
