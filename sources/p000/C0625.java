package p000;

/* JADX INFO: renamed from: ۥؗؖۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0625 extends AbstractC3019 implements InterfaceC4825, InterfaceC3320 {

    /* JADX INFO: renamed from: ۥٕ */
    public C0322 f2315;

    /* JADX INFO: renamed from: ۥۙ */
    public C4846 f2316;

    /* JADX INFO: renamed from: ۥۦ */
    public C2127 f2317;

    /* JADX INFO: renamed from: ۦؖ */
    public C3226 f2318;

    /* JADX INFO: renamed from: ۦؙ */
    public C3742 f2320;

    /* JADX INFO: renamed from: ۦؗ */
    public final C5704 f2319 = AbstractC3004.m5600(new C0463(10, this));

    /* JADX INFO: renamed from: ۦُ */
    public C2793 f2321 = C2793.f9340;

    public C0625(C0322 c0322, C4846 c4846, C3742 c3742, C3226 c3226) {
        this.f2315 = c0322;
        this.f2316 = c4846;
        this.f2320 = c3742;
        this.f2318 = c3226;
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۥ */
    public final void mo780() {
        C0322 c0322 = this.f2315;
        c0322.f1179 = 3;
        c0322.f1178 = this;
    }

    @Override // p000.InterfaceC3320
    /* JADX INFO: renamed from: ۦؐ */
    public final C1197 mo776() {
        return (C1197) this.f2319.getValue();
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦٓ */
    public final void mo788() {
        C0322 c0322 = this.f2315;
        c0322.f1179 = 2;
        c0322.f1178 = null;
    }

    @Override // p000.InterfaceC3320
    /* JADX INFO: renamed from: ۦٛ */
    public final long mo777(InterfaceC2015 interfaceC2015) {
        return mo778(interfaceC2015).m5322();
    }

    @Override // p000.InterfaceC3320
    /* JADX INFO: renamed from: ۦۨ */
    public final C2793 mo778(InterfaceC2015 interfaceC2015) {
        if (!this.f17786) {
            return this.f2321;
        }
        C2793 c2793 = (C2793) this.f2318.mo211(interfaceC2015);
        if (c2793 == null) {
            return this.f2321;
        }
        this.f2321 = c2793;
        return c2793;
    }
}
