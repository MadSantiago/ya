package p000;

/* JADX INFO: renamed from: ۦٖؑؒۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4276 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C4891 f14159;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f14160;

    public /* synthetic */ C4276(C4891 c4891, int i) {
        this.f14160 = i;
        this.f14159 = c4891;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f14160;
        C4891 c4891 = this.f14159;
        switch (i) {
            case 0:
                return Float.valueOf(c4891.f16111.mo7878());
            case 1:
                return Float.valueOf(c4891.f16111.mo7877());
            default:
                return Float.valueOf(c4891.f16111.mo7879() - c4891.f16111.mo7876());
        }
    }
}
