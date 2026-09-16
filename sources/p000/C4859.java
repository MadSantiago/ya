package p000;

/* JADX INFO: renamed from: ۦٟؔۨۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4859 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC1126 f15986;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f15987;

    public /* synthetic */ C4859(InterfaceC1126 interfaceC1126, int i) {
        this.f15987 = i;
        this.f15986 = interfaceC1126;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f15987;
        C2358 c2358 = C2358.f7817;
        InterfaceC1126 interfaceC1126 = this.f15986;
        switch (i) {
            case 0:
                interfaceC1126.mo2356(((C1553) obj).f5241, C0373.f1375);
                break;
            case 1:
                C3536 c3536 = (C3536) obj;
                interfaceC1126.mo2353(AbstractC3801.m6747(c3536, false));
                c3536.m6327();
                break;
            default:
                C3536 c3537 = (C3536) obj;
                interfaceC1126.mo2353(AbstractC3801.m6747(c3537, false));
                c3537.m6327();
                break;
        }
        return c2358;
    }
}
