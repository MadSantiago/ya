package p000;

/* JADX INFO: renamed from: ۥٖؒٛٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1445 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C0636 f4948;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f4949;

    public /* synthetic */ C1445(C0636 c0636, int i) {
        this.f4949 = i;
        this.f4948 = c0636;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f4949;
        C0636 c0636 = this.f4948;
        switch (i) {
            case 0:
                C1122 c1122 = (C1122) AbstractC2552.m4807(c0636, AbstractC4670.f15391);
                C2756 c2756 = c0636.f2373;
                if (c1122 == null) {
                    if (c2756 != null) {
                        c0636.m5607(c2756);
                    }
                    c0636.f2373 = null;
                } else if (c2756 == null) {
                    C3877 c3877 = new C3877(c0636);
                    C1445 c1445 = new C1445(c0636, 1);
                    C2243 c2243 = c0636.f2371;
                    boolean z = c0636.f2372;
                    float f = c0636.f2375;
                    C0380 c0380 = AbstractC2123.f6975;
                    C2756 c2757 = new C2756(c2243, z, f, c3877, c1445);
                    c0636.m5603(c2757);
                    c0636.f2373 = c2757;
                }
                return C2358.f7817;
            default:
                return C3133.f10548;
        }
    }
}
