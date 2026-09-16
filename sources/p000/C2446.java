package p000;

/* JADX INFO: renamed from: ۥٕٟ۟ؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2446 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC5372 f8146;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f8147;

    public /* synthetic */ C2446(InterfaceC5372 interfaceC5372, int i) {
        this.f8147 = i;
        this.f8146 = interfaceC5372;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f8147;
        C2358 c2358 = C2358.f7817;
        InterfaceC5372 interfaceC5372 = this.f8146;
        switch (i) {
            case 0:
                InterfaceC2442 interfaceC2442 = (InterfaceC2442) obj;
                long j = ((C1327) interfaceC5372.getValue()).f4595;
                if (!C4462.m7744(j, C1327.f4591)) {
                    InterfaceC2442.m4561(interfaceC2442, j, 0L, 0.0f, 126);
                }
                break;
            default:
                InterfaceC2442.m4561((InterfaceC2442) obj, ((C1327) interfaceC5372.getValue()).f4595, 0L, 0.0f, 126);
                break;
        }
        return c2358;
    }
}
