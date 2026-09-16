package p000;

/* JADX INFO: renamed from: ۥٜؓٚ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1824 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C0165 f6058;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f6059;

    public /* synthetic */ C1824(C0165 c0165, int i) {
        this.f6059 = i;
        this.f6058 = c0165;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        C2537 c2537;
        int i = this.f6059;
        int i2 = 2;
        C0165 c0165 = this.f6058;
        switch (i) {
            case 0:
                return Boolean.valueOf(c0165 != null ? ((Boolean) new C1824(c0165, i2).mo449()).booleanValue() : false);
            case 1:
                return Boolean.valueOf(c0165 != null ? ((Boolean) new C1824(c0165, i2).mo449()).booleanValue() : false);
            default:
                C1249 c1249 = c0165.f621;
                C3828 c3828 = (C3828) c0165.f622.getValue();
                return Boolean.valueOf(AbstractC3831.m6874(c1249, (c3828 == null || (c2537 = c3828.f12697) == null) ? null : c2537.f8430));
        }
    }
}
