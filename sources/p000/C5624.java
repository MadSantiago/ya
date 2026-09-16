package p000;

/* JADX INFO: renamed from: ۦًۣٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5624 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C5356 f18540;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f18541;

    public /* synthetic */ C5624(C5356 c5356, int i) {
        this.f18541 = i;
        this.f18540 = c5356;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f18541;
        C2358 c2358 = C2358.f7817;
        C5356 c5356 = this.f18540;
        switch (i) {
            case 0:
                if (c5356.f17629 != null) {
                    return c2358;
                }
                AbstractC4690.m8037("Font resolution state is not set.");
                C1078.m2274();
                return null;
            default:
                if (c5356.f17629 != null) {
                    return c2358;
                }
                AbstractC4690.m8037("Font resolution state is not set.");
                C1078.m2274();
                return null;
        }
    }
}
