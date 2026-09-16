package p000;

/* JADX INFO: renamed from: ۦٖؕٗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4306 extends AbstractC5381 implements InterfaceC4825, InterfaceC0882 {

    /* JADX INFO: renamed from: ۥً */
    public C3969 f14242;

    /* JADX INFO: renamed from: ۥٕ */
    public C3635 f14243;

    /* JADX INFO: renamed from: ۥۙ */
    public final C4852 f14244 = AbstractC2774.m5183(null);

    /* JADX INFO: renamed from: ۦٚ */
    public C5837 f14245;

    public C4306(C3969 c3969, C5837 c5837, C3635 c3635) {
        this.f14242 = c3969;
        this.f14245 = c5837;
        this.f14243 = c3635;
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۥ */
    public final void mo780() {
        C3969 c3969 = this.f14242;
        if (c3969.f13271 != null) {
            AbstractC4690.m8035("Expected textInputModifierNode to be null");
        }
        c3969.f13271 = this;
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦٓ */
    public final void mo788() {
        this.f14242.m7126(this);
    }

    @Override // p000.InterfaceC0882
    /* JADX INFO: renamed from: ۦۛ */
    public final void mo1728(AbstractC1311 abstractC1311) {
        this.f14244.setValue(abstractC1311);
    }
}
