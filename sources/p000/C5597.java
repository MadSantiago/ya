package p000;

/* JADX INFO: renamed from: ۦۣؔؔ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5597 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C1705 f18446;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ InterfaceC4367 f18447;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC4643 f18448;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f18449;

    public /* synthetic */ C5597(InterfaceC4643 interfaceC4643, C1705 c1705, InterfaceC4367 interfaceC4367, int i) {
        this.f18449 = i;
        this.f18448 = interfaceC4643;
        this.f18446 = c1705;
        this.f18447 = interfaceC4367;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f18449;
        C2358 c2358 = C2358.f7817;
        InterfaceC0443 interfaceC0443 = null;
        InterfaceC4367 interfaceC4367 = this.f18447;
        C1705 c1705 = this.f18446;
        InterfaceC4643 interfaceC4643 = this.f18448;
        switch (i) {
            case 0:
                AbstractC2765.m5135(interfaceC4643, null, 0, new C5697(c1705, interfaceC0443, 2), 3).mo859(new C1859(c1705, interfaceC4367, 2));
                break;
            default:
                AbstractC2765.m5135(interfaceC4643, null, 0, new C5697(c1705, interfaceC0443, 1), 3).mo859(new C1859(c1705, interfaceC4367, 1));
                break;
        }
        return c2358;
    }
}
