package p000;

/* JADX INFO: renamed from: ۥٜۜؑٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2362 extends AbstractC5381 implements InterfaceC0951 {

    /* JADX INFO: renamed from: ۥً */
    public final C2243 f7820;

    /* JADX INFO: renamed from: ۥٕ */
    public boolean f7821;

    /* JADX INFO: renamed from: ۥۙ */
    public boolean f7822;

    /* JADX INFO: renamed from: ۦٚ */
    public boolean f7823;

    public C2362(C2243 c2243) {
        this.f7820 = c2243;
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۥ */
    public final void mo780() {
        AbstractC2765.m5135(m9076(), null, 0, new C2718(this, (InterfaceC0443) null, 0), 3);
    }

    @Override // p000.InterfaceC0951
    /* JADX INFO: renamed from: ۥٛ */
    public final void mo1726(C2497 c2497) {
        c2497.m4644();
        C2004 c2004 = c2497.f8304;
        if (this.f7823) {
            InterfaceC2442.m4561(c2497, C1327.m2826(C1327.f4588, 0.3f, 14), c2004.mo4567(), 0.0f, 122);
        } else if (this.f7821 || this.f7822) {
            InterfaceC2442.m4561(c2497, C1327.m2826(C1327.f4588, 0.1f, 14), c2004.mo4567(), 0.0f, 122);
        }
    }
}
