package p000;

/* JADX INFO: renamed from: ۦٕؖۢٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4254 implements InterfaceC4944 {

    /* JADX INFO: renamed from: ۥؗ */
    public C5802 f14095;

    /* JADX INFO: renamed from: ۦؑ */
    public final C4780 f14098;

    /* JADX INFO: renamed from: ۥۣ */
    public boolean f14097 = false;

    /* JADX INFO: renamed from: ۥۗ */
    public boolean f14096 = false;

    public C4254(C4780 c4780) {
        this.f14098 = c4780;
    }

    @Override // p000.InterfaceC4944
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC4944 mo6175(boolean z) {
        if (this.f14097) {
            throw new C5465("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f14097 = true;
        this.f14098.m8165(this.f14095, z ? 1 : 0, this.f14096);
        return this;
    }

    @Override // p000.InterfaceC4944
    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC4944 mo6178(String str) {
        if (this.f14097) {
            throw new C5465("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f14097 = true;
        this.f14098.m8171(this.f14095, str, this.f14096);
        return this;
    }
}
