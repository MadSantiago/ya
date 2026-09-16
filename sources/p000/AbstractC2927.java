package p000;

/* JADX INFO: renamed from: ۥۨؖؔؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2927 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4215 f9843 = new C4215(9);

    /* JADX INFO: renamed from: ۥۗ */
    public static final C0429 f9842 = new C0429();

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5294 f9841 = new C5294(1);

    /* JADX INFO: renamed from: ۦؑ */
    public static final C3843 f9844 = new C3843(1);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥۗ */
    public static final Object m5514(C4545 c4545, long j, AbstractC0772 abstractC0772) {
        C5715 c5715;
        C1916 c1916;
        C4545 c4546;
        if (abstractC0772 instanceof C5715) {
            c5715 = (C5715) abstractC0772;
            int i = c5715.f18810;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5715.f18810 = i - Integer.MIN_VALUE;
            } else {
                c5715 = new C5715(abstractC0772);
            }
        } else {
            c5715 = new C5715(abstractC0772);
        }
        Object obj = c5715.f18809;
        int i2 = c5715.f18810;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            c1916 = new C1916();
            C0058 c0058 = new C0058(c4545, j, c1916, (InterfaceC0443) null, 2);
            c5715.f18808 = c4545;
            c5715.f18807 = c1916;
            c5715.f18810 = 1;
            Object objM7868 = c4545.m7868(EnumC4386.f14455, c0058, c5715);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objM7868 == enumC2282) {
                return enumC2282;
            }
            c4546 = c4545;
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C1916 c1917 = c5715.f18807;
            C4545 c4547 = c5715.f18808;
            AbstractC0186.m409(obj);
            c1916 = c1917;
            c4546 = c4547;
        }
        return new C1553(c4546.m7870(c1916.f6312));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static InterfaceC0705 m5515(C4553 c4553, EnumC1616 enumC1616, boolean z, boolean z2, C2243 c2243) {
        return new C5415(c4553, enumC1616, z, z2, c2243);
    }
}
