package p000;

/* JADX INFO: renamed from: ۥٝ۟ٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1920 extends AbstractC4134 {

    /* JADX INFO: renamed from: ۥّ */
    public static final C1920 f6329 = new C1920(2);

    /* JADX INFO: renamed from: ۥۜ */
    public static final String f6330;

    /* JADX INFO: renamed from: ۦٛ */
    public static final int f6331;

    /* JADX INFO: renamed from: ۦۙ */
    public static final String f6332;

    static {
        C5883 c5883 = EnumC3573.f11848;
        f6332 = c5883.f11896;
        f6330 = c5883.f11895;
        f6331 = c5883.f11893;
    }

    @Override // p000.AbstractC4134
    /* JADX INFO: renamed from: ۥٖ */
    public final void mo482() {
        m7322(new C1657(1));
    }

    @Override // p000.AbstractC4134
    /* JADX INFO: renamed from: ۥۖ */
    public final C2351 mo483() {
        C2351 c2351 = new C2351(1);
        C0637 c0637 = new C0637();
        Class<Boolean> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(Boolean.class));
        c0637.m1445(clsM9037 != null ? clsM9037 : Boolean.class);
        c2351.f7798 = c0637;
        return c2351;
    }

    @Override // p000.AbstractC4134, p000.AbstractC3003
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo221() {
        C4524.f14953.getClass();
        C1443 c1443M7845 = C4524.m7845();
        C1542 c1542 = AbstractC2539.f8446;
        Object obj = c1542.f5218;
        String str = c1542.f5219;
        boolean z = C1443.f4940;
        if (((Boolean) c1443M7845.m3068(obj, str)).booleanValue()) {
            m7321();
        }
    }

    @Override // p000.AbstractC1985
    /* JADX INFO: renamed from: ۦؚ */
    public final String mo484() {
        return f6332;
    }

    @Override // p000.AbstractC1985
    /* JADX INFO: renamed from: ۦِ */
    public final int mo222() {
        return f6331;
    }

    @Override // p000.AbstractC4134
    /* JADX INFO: renamed from: ۦٗ */
    public final C2351 mo485() {
        C2351 c2351 = new C2351(0);
        C2672 c2672 = new C2672();
        C1657 c1657 = new C1657(2);
        C3098 c3098 = new C3098();
        c1657.mo211(c3098);
        C4243 c4243 = c2672.f8853;
        if (c4243 == null) {
            c4243 = new C4243();
        }
        c2672.f8853 = c4243;
        c4243.m7503(c3098);
        C0637 c0637 = new C0637();
        C1657 c1658 = new C1657(3);
        C0637 c0638 = new C0637();
        c1658.mo211(c0638);
        C0672 c0672 = c0637.f2379;
        if (c0672 == null) {
            c0672 = new C0672();
        }
        c0637.f2379 = c0672;
        c0672.m1503(c0638);
        c2672.m4981(c0637);
        c2351.f7798 = c2672;
        return c2351;
    }

    @Override // p000.AbstractC1985
    /* JADX INFO: renamed from: ۦۗ */
    public final String mo223() {
        return f6330;
    }
}
