package p000;

/* JADX INFO: renamed from: ۥِؖؑٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0511 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C5765 f1833;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f1834;

    public /* synthetic */ C0511(C5765 c5765, int i) {
        this.f1834 = i;
        this.f1833 = c5765;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f1834;
        C2358 c2358 = C2358.f7817;
        C5765 c5765 = this.f1833;
        switch (i) {
            case 0:
                c5765.f19007 = -(((int) (((C4207) obj).f13969 & 4294967295L)) - c5765.f19005.m1711());
                break;
            default:
                c5765.m9576(((Number) ((C5535) obj).f18269.getValue()).floatValue());
                break;
        }
        return c2358;
    }
}
