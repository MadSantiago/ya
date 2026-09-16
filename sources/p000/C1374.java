package p000;

/* JADX INFO: renamed from: ۥِٔۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1374 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC1126 f4702;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f4703;

    public /* synthetic */ C1374(InterfaceC1126 interfaceC1126, int i) {
        this.f4703 = i;
        this.f4702 = interfaceC1126;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f4703;
        C2358 c2358 = C2358.f7817;
        InterfaceC1126 interfaceC1126 = this.f4702;
        switch (i) {
            case 0:
                interfaceC1126.mo2355();
                break;
            default:
                interfaceC1126.onCancel();
                break;
        }
        return c2358;
    }
}
