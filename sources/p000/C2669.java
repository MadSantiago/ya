package p000;

/* JADX INFO: renamed from: ۥۤؓٝؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2669 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f8842;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ boolean f8843;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f8844;

    public /* synthetic */ C2669(InterfaceC4745 interfaceC4745, boolean z) {
        this.f8844 = 2;
        this.f8842 = interfaceC4745;
        this.f8843 = z;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        InterfaceC4005 interfaceC4005M7125;
        int i = this.f8844;
        C2358 c2358 = C2358.f7817;
        boolean z = this.f8843;
        Object obj = this.f8842;
        switch (i) {
            case 0:
                InterfaceC4448 interfaceC4448 = (InterfaceC4448) obj;
                if (z) {
                    interfaceC4448.mo449();
                }
                break;
            case 1:
                C3969 c3969 = (C3969) obj;
                if (z && (interfaceC4005M7125 = c3969.m7125()) != null) {
                    ((C5845) interfaceC4005M7125).m9665(c2358);
                }
                break;
            default:
                ((InterfaceC4745) obj).mo211(Boolean.valueOf(!z));
                break;
        }
        return c2358;
    }

    public /* synthetic */ C2669(int i, Object obj, boolean z) {
        this.f8844 = i;
        this.f8843 = z;
        this.f8842 = obj;
    }
}
