package p000;

/* JADX INFO: renamed from: ۦؓؓٗؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3169 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C0777 f10658;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f10659;

    public /* synthetic */ C3169(C0777 c0777, int i) {
        this.f10659 = i;
        this.f10658 = c0777;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f10659;
        C0777 c0777 = this.f10658;
        switch (i) {
            case 0:
                return Boolean.valueOf((AbstractC3831.m6874(c0777.f2814.getValue(), c0777.m1671()) && c0777.f2818.m1901() == Long.MIN_VALUE && !((Boolean) c0777.f2812.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(c0777.m1674());
        }
    }
}
