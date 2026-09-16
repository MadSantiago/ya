package p000;

/* JADX INFO: renamed from: ۦَٚؑۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4530 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ InterfaceC4448 f14969;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ InterfaceC4643 f14970;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C1705 f14971;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f14972 = 1;

    public /* synthetic */ C4530(C1705 c1705, InterfaceC4643 interfaceC4643, InterfaceC4448 interfaceC4448) {
        this.f14971 = c1705;
        this.f14970 = interfaceC4643;
        this.f14969 = interfaceC4448;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f14972;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = this.f14970;
        InterfaceC4448 interfaceC4448 = this.f14969;
        C1705 c1705 = this.f14971;
        switch (i) {
            case 0:
                if (((Boolean) c1705.f5675.f14993.mo211(EnumC0845.f3016)).booleanValue()) {
                    AbstractC2765.m5135(interfaceC4643, null, 0, new C5697(c1705, null, 6), 3).mo859(new C5688(c1705, interfaceC4448, 0));
                }
                break;
            default:
                int iOrdinal = ((EnumC0845) c1705.f5675.f14999.getValue()).ordinal();
                if (iOrdinal == 1) {
                    interfaceC4448.mo449();
                } else if (iOrdinal == 2) {
                    AbstractC2765.m5135(interfaceC4643, null, 0, new C5697(c1705, null, 7), 3);
                } else {
                    AbstractC2765.m5135(interfaceC4643, null, 0, new C5697(c1705, null, 8), 3);
                }
                break;
        }
        return c2358;
    }

    public /* synthetic */ C4530(C1705 c1705, InterfaceC4448 interfaceC4448, InterfaceC4643 interfaceC4643) {
        this.f14971 = c1705;
        this.f14969 = interfaceC4448;
        this.f14970 = interfaceC4643;
    }
}
