package p000;

/* JADX INFO: renamed from: ۦْٗؔؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4360 implements InterfaceC4790 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Object f14360;

    /* JADX INFO: renamed from: ۥۗ */
    public int f14361;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f14362;

    public C4360(int i, int i2) {
        this.f14360 = null;
        this.f14362 = i;
        int i3 = i2 & 7;
        this.f14361 = i3 == 0 ? 8 : i3;
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۥؗ */
    public void mo2813() {
        ((InterfaceC4790) this.f14360).mo2813();
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۥّ */
    public void mo2815(int i, int i2, int i3) {
        int i4 = this.f14361 == 0 ? this.f14362 : 0;
        ((InterfaceC4790) this.f14360).mo2815(i + i4, i2 + i4, i3);
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۥۗ */
    public void mo2816(Object obj) {
        this.f14361++;
        ((InterfaceC4790) this.f14360).mo2816(obj);
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۥۜ */
    public void mo2817(int i, int i2) {
        ((InterfaceC4790) this.f14360).mo2817(i + (this.f14361 == 0 ? this.f14362 : 0), i2);
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۥۣ */
    public void mo2818(int i, Object obj) {
        ((InterfaceC4790) this.f14360).mo2818(i + (this.f14361 == 0 ? this.f14362 : 0), obj);
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۦؑ */
    public void mo2819(int i, Object obj) {
        ((InterfaceC4790) this.f14360).mo2819(i + (this.f14361 == 0 ? this.f14362 : 0), obj);
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۦِ */
    public void mo2820() {
        if (this.f14361 <= 0) {
            AbstractC5508.m9201("OffsetApplier up called with no corresponding down");
        }
        this.f14361--;
        ((InterfaceC4790) this.f14360).mo2820();
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۦٛ */
    public void mo7664(InterfaceC5731 interfaceC5731, Object obj) {
        ((InterfaceC4790) this.f14360).mo7664(interfaceC5731, obj);
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۦۙ */
    public Object mo2822() {
        return ((InterfaceC4790) this.f14360).mo2822();
    }

    public C4360() {
        this.f14360 = new C4360[256];
        this.f14362 = 0;
        this.f14361 = 0;
    }

    public C4360(InterfaceC4790 interfaceC4790, int i) {
        this.f14360 = interfaceC4790;
        this.f14362 = i;
    }

    public C4360(int i, int i2, InterfaceC4448 interfaceC4448) {
        this.f14362 = i;
        this.f14361 = i2;
        this.f14360 = interfaceC4448;
    }
}
