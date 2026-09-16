package p000;

/* JADX INFO: renamed from: ۥؘْؕۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1222 implements InterfaceC4464 {

    /* JADX INFO: renamed from: ۥۗ */
    public final int f4215;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2384 f4216;

    public C1222(C2384 c2384, int i) {
        this.f4216 = c2384;
        this.f4215 = i;
    }

    @Override // p000.InterfaceC4464
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo2585() {
        return !this.f4216.m1402().f7492.isEmpty();
    }

    @Override // p000.InterfaceC4464
    /* JADX INFO: renamed from: ۥُ */
    public final int mo2586() {
        return Math.max(0, this.f4216.f2337 - this.f4215);
    }

    @Override // p000.InterfaceC4464
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo2587() {
        C2384 c2384 = this.f4216;
        return Math.min(c2384.mo1406() - 1, ((C3000) AbstractC0973.m2040(c2384.m1402().f7492)).f10086 + this.f4215);
    }

    @Override // p000.InterfaceC4464
    /* JADX INFO: renamed from: ۥۣ */
    public final int mo2588() {
        return this.f4216.mo1406();
    }

    @Override // p000.InterfaceC4464
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo2589() {
        int i;
        C2384 c2384 = this.f4216;
        if (c2384.m1402().f7492.size() == 0) {
            return 0;
        }
        int iM2143 = AbstractC0993.m2143(c2384.m1402());
        int i2 = c2384.m1402().f7490 + c2384.m1402().f7483;
        if (i2 != 0 && (i = iM2143 / i2) >= 1) {
            return i;
        }
        return 1;
    }
}
