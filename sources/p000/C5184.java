package p000;

/* JADX INFO: renamed from: ۦۚؕ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5184 implements InterfaceC2119 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C2332 f17143;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2761 f17144;

    public C5184(C2761 c2761, C2332 c2332) {
        this.f17144 = c2761;
        this.f17143 = c2332;
    }

    @Override // p000.InterfaceC2119
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo4100(C2529 c2529) {
        if (c2529.f8375 == 4 && !this.f17144.m5114(c2529)) {
            String str = c2529.f8372;
            if (str != null) {
                this.f17143.f7721.m6395(new C4330(c2529.f8373, str, c2529.f8374));
                return true;
            }
            C0178.m387("Null token");
        }
        return false;
    }

    @Override // p000.InterfaceC2119
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo4101(Exception exc) {
        this.f17143.m4375(exc);
        return true;
    }
}
