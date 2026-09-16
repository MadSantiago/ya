package p000;

/* JADX INFO: renamed from: ۦُٖؓۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4287 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C0832 f14176;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f14177;

    public /* synthetic */ C4287(C0832 c0832, int i) {
        this.f14177 = i;
        this.f14176 = c0832;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f14177;
        C0832 c0832 = this.f14176;
        switch (i) {
            case 0:
                c0832.m1725();
                return C2358.f7817;
            case 1:
                return new C1553(c0832.f2940);
            default:
                InterfaceC2015 interfaceC2015 = (InterfaceC2015) c0832.f2952.getValue();
                return new C1553(interfaceC2015 != null ? interfaceC2015.mo2808(0L) : 9205357640488583168L);
        }
    }
}
