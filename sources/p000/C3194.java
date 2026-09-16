package p000;

/* JADX INFO: renamed from: ۦؓؗٝؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3194 implements InterfaceC0930 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C4852 f10730 = AbstractC2774.m5183(Boolean.FALSE);

    /* JADX INFO: renamed from: ۥۗ */
    public C4852 f10731;

    /* JADX INFO: renamed from: ۥۣ */
    public InterfaceC4448 f10732;

    /* JADX INFO: renamed from: ۥۣ */
    public final long m5891() {
        C2934 c2934;
        C4852 c4852M5183 = this.f10731;
        if (c4852M5183 == null) {
            InterfaceC4448 interfaceC4448 = this.f10732;
            if (interfaceC4448 == null || (c2934 = (C2934) interfaceC4448.mo449()) == null) {
                c2934 = C2934.f9860;
            }
            c4852M5183 = AbstractC2774.m5183(c2934);
            this.f10731 = c4852M5183;
            this.f10732 = null;
        }
        return ((C2934) c4852M5183.getValue()).f9862;
    }
}
