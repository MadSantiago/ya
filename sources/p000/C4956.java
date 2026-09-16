package p000;

/* JADX INFO: renamed from: ۦۗؓٞ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4956 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥؖ */
    public final /* synthetic */ long f16391;

    /* JADX INFO: renamed from: ۥَ */
    public C4545 f16392;

    /* JADX INFO: renamed from: ۥٖ */
    public C1314 f16393;

    /* JADX INFO: renamed from: ۥٙ */
    public final /* synthetic */ C1314 f16394;

    /* JADX INFO: renamed from: ۥۖ */
    public /* synthetic */ Object f16395;

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ C4545 f16396;

    /* JADX INFO: renamed from: ۦٗ */
    public long f16397;

    /* JADX INFO: renamed from: ۦۛ */
    public int f16398;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4956(C4545 c4545, C1314 c1314, long j, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f16396 = c4545;
        this.f16394 = c1314;
        this.f16391 = j;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        C4956 c4956 = new C4956(this.f16396, this.f16394, this.f16391, interfaceC0443);
        c4956.f16395 = obj;
        return c4956;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        C4545 c4545;
        C1314 c1314;
        C4545 c4546;
        long j;
        int i = this.f16398;
        EnumC1616 enumC1616 = EnumC1616.f5424;
        if (i == 0) {
            AbstractC0186.m409(obj);
            C3594 c3594 = (C3594) this.f16395;
            c4545 = this.f16396;
            C5113 c5113 = new C5113(c4545, c3594);
            InterfaceC0738 interfaceC0738 = c4545.f15010;
            C1314 c1315 = this.f16394;
            long j2 = c1315.f4535;
            EnumC1616 enumC1617 = c4545.f15016;
            long j3 = this.f16391;
            float fM7872 = c4545.m7872(enumC1617 == enumC1616 ? C0963.m1998(j3) : C0963.m1995(j3));
            this.f16395 = c4545;
            this.f16392 = c4545;
            this.f16393 = c1315;
            this.f16397 = j2;
            this.f16398 = 1;
            obj = interfaceC0738.mo1625(c5113, fM7872, this);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (obj == enumC2282) {
                return enumC2282;
            }
            c1314 = c1315;
            c4546 = c4545;
            j = j2;
        } else {
            if (i != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.f16397;
            c1314 = this.f16393;
            c4545 = this.f16392;
            c4546 = (C4545) this.f16395;
            AbstractC0186.m409(obj);
        }
        float fM7873 = c4546.m7872(((Number) obj).floatValue());
        c1314.f4535 = c4545.f15016 == enumC1616 ? C0963.m1999(j, fM7873, 0.0f, 2) : C0963.m1999(j, 0.0f, fM7873, 1);
        return C2358.f7817;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        return ((C4956) mo217((InterfaceC0443) obj2, (C3594) obj)).mo218(C2358.f7817);
    }
}
