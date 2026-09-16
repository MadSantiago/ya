package p000;

/* JADX INFO: renamed from: ۥۥِؗٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2764 extends AbstractC3191 {

    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC3191 f9149;

    /* JADX INFO: renamed from: ۥّ */
    public final boolean f9150;

    /* JADX INFO: renamed from: ۥۜ */
    public InterfaceC4745 f9151;

    /* JADX INFO: renamed from: ۦٛ */
    public final long f9152;

    /* JADX INFO: renamed from: ۦۙ */
    public final boolean f9153;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2764(AbstractC3191 abstractC3191, InterfaceC4745 interfaceC4745, boolean z, boolean z2) {
        InterfaceC4745 interfaceC4745Mo4945;
        super(0L, C5570.f18392);
        C4215 c4215 = AbstractC1538.f5208;
        this.f9149 = abstractC3191;
        this.f9150 = z;
        this.f9153 = z2;
        this.f9151 = AbstractC1538.m3285(interfaceC4745, (abstractC3191 == null || (interfaceC4745Mo4945 = abstractC3191.mo4945()) == null) ? AbstractC1538.f5210.f16711 : interfaceC4745Mo4945, z);
        this.f9152 = AbstractC3831.m6841();
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo2657() {
        AbstractC3191 abstractC3191;
        this.f10717 = true;
        if (!this.f9153 || (abstractC3191 = this.f9149) == null) {
            return;
        }
        abstractC3191.mo2657();
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC4745 mo4945() {
        return this.f9151;
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۥّ */
    public final boolean mo4946() {
        return m5119().mo4946();
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۦؑ */
    public final C5570 mo5117() {
        return m5119().mo5117();
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۦؚ */
    public final void mo4467() {
        AbstractC5378.m9072();
        throw null;
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo4468() {
        m5119().mo4468();
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۦٗ */
    public final AbstractC3191 mo4469(InterfaceC4745 interfaceC4745) {
        InterfaceC4745 interfaceC4745M3285 = AbstractC1538.m3285(interfaceC4745, this.f9151, true);
        return !this.f9150 ? AbstractC1538.m3271(m5119().mo4469(null), interfaceC4745M3285, true) : m5119().mo4469(interfaceC4745M3285);
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۦٛ */
    public final InterfaceC4745 mo4947() {
        return null;
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۦۗ */
    public final void mo4470() {
        AbstractC5378.m9072();
        throw null;
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۦۙ */
    public final long mo5118() {
        return m5119().mo5118();
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۦۚ */
    public final void mo4948(InterfaceC0622 interfaceC0622) {
        m5119().mo4948(interfaceC0622);
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final AbstractC3191 m5119() {
        AbstractC3191 abstractC3191 = this.f9149;
        return abstractC3191 == null ? AbstractC1538.f5210 : abstractC3191;
    }
}
