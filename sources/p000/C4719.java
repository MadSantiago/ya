package p000;

/* JADX INFO: renamed from: ۦٝؑؑٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4719 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC4448 f15580;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f15581;

    public /* synthetic */ C4719(int i, InterfaceC4448 interfaceC4448) {
        this.f15581 = i;
        this.f15580 = interfaceC4448;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f15581;
        C2358 c2358 = C2358.f7817;
        InterfaceC4448 interfaceC4448 = this.f15580;
        switch (i) {
            case 0:
                interfaceC4448.mo449();
                return c2358;
            case 1:
                interfaceC4448.mo449();
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                interfaceC4448.mo449();
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                interfaceC4448.mo449();
                return c2358;
            default:
                return new C2384(0, 0.0f, interfaceC4448);
        }
        return Boolean.TRUE;
    }
}
