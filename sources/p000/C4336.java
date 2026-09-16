package p000;

/* JADX INFO: renamed from: ۦٖۦٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4336 extends C5038 {

    /* JADX INFO: renamed from: ۥَ */
    public InterfaceC4745 f14313;

    /* JADX INFO: renamed from: ۥْ */
    public final boolean f14314;

    /* JADX INFO: renamed from: ۥٓ */
    public InterfaceC4745 f14315;

    /* JADX INFO: renamed from: ۥٖ */
    public final long f14316;

    /* JADX INFO: renamed from: ۦ۟ */
    public final boolean f14317;

    /* JADX INFO: renamed from: ۦۨ */
    public final C5038 f14318;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4336(C5038 c5038, InterfaceC4745 interfaceC4745, InterfaceC4745 interfaceC4746, boolean z, boolean z2) {
        InterfaceC4745 interfaceC4745Mo4947;
        InterfaceC4745 interfaceC4745Mo4945;
        C4215 c4215 = AbstractC1538.f5208;
        super(0L, C5570.f18392, AbstractC1538.m3285(interfaceC4745, (c5038 == null || (interfaceC4745Mo4945 = c5038.mo4945()) == null) ? AbstractC1538.f5210.f16711 : interfaceC4745Mo4945, z), AbstractC1538.m3283(interfaceC4746, (c5038 == null || (interfaceC4745Mo4947 = c5038.mo4947()) == null) ? AbstractC1538.f5210.f16712 : interfaceC4745Mo4947));
        this.f14318 = c5038;
        this.f14317 = z;
        this.f14314 = z2;
        this.f14315 = this.f16711;
        this.f14313 = this.f16712;
        this.f14316 = AbstractC3831.m6841();
    }

    @Override // p000.C5038, p000.AbstractC3191
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo2657() {
        C5038 c5038;
        this.f10717 = true;
        if (!this.f14314 || (c5038 = this.f14318) == null) {
            return;
        }
        c5038.mo2657();
    }

    @Override // p000.C5038
    /* JADX INFO: renamed from: ۥً */
    public final C5038 mo4466(InterfaceC4745 interfaceC4745, InterfaceC4745 interfaceC4746) {
        InterfaceC4745 interfaceC4745M3285 = AbstractC1538.m3285(interfaceC4745, this.f14315, true);
        InterfaceC4745 interfaceC4745M3283 = AbstractC1538.m3283(interfaceC4746, this.f14313);
        return !this.f14317 ? new C4336(m7633().mo4466(null, interfaceC4745M3283), interfaceC4745M3285, interfaceC4745M3283, false, true) : m7633().mo4466(interfaceC4745M3285, interfaceC4745M3283);
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۥَ */
    public final void mo5877(long j) {
        AbstractC5378.m9072();
        throw null;
    }

    @Override // p000.C5038, p000.AbstractC3191
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC4745 mo4945() {
        return this.f14315;
    }

    @Override // p000.C5038, p000.AbstractC3191
    /* JADX INFO: renamed from: ۥّ */
    public final boolean mo4946() {
        return m7633().mo4946();
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۥٓ */
    public final void mo5878(C5570 c5570) {
        AbstractC5378.m9072();
        throw null;
    }

    @Override // p000.C5038, p000.AbstractC3191
    /* JADX INFO: renamed from: ۥٖ */
    public final void mo5879(int i) {
        m7633().mo5879(i);
    }

    @Override // p000.C5038
    /* JADX INFO: renamed from: ۥٙ */
    public final InterfaceC4745 mo4945() {
        return this.f14315;
    }

    @Override // p000.C5038
    /* JADX INFO: renamed from: ۥۖ */
    public final AbstractC5568 mo2658() {
        return m7633().mo2658();
    }

    @Override // p000.C5038, p000.AbstractC3191
    /* JADX INFO: renamed from: ۥۜ */
    public final int mo5881() {
        return m7633().mo5881();
    }

    @Override // p000.C5038
    /* JADX INFO: renamed from: ۥۧ */
    public final void mo7631(C3639 c3639) {
        AbstractC5378.m9072();
        throw null;
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۦؑ */
    public final C5570 mo5117() {
        return m7633().mo5117();
    }

    @Override // p000.C5038, p000.AbstractC3191
    /* JADX INFO: renamed from: ۦؚ */
    public final void mo4467() {
        AbstractC5378.m9072();
        throw null;
    }

    @Override // p000.C5038, p000.AbstractC3191
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo4468() {
        m7633().mo4468();
    }

    @Override // p000.C5038
    /* JADX INFO: renamed from: ۦٕ */
    public final C3639 mo7632() {
        return m7633().mo7632();
    }

    @Override // p000.C5038, p000.AbstractC3191
    /* JADX INFO: renamed from: ۦٗ */
    public final AbstractC3191 mo4469(InterfaceC4745 interfaceC4745) {
        InterfaceC4745 interfaceC4745M3285 = AbstractC1538.m3285(interfaceC4745, this.f14315, true);
        return !this.f14317 ? AbstractC1538.m3271(m7633().mo4469(null), interfaceC4745M3285, true) : m7633().mo4469(interfaceC4745M3285);
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final C5038 m7633() {
        C5038 c5038 = this.f14318;
        return c5038 == null ? AbstractC1538.f5210 : c5038;
    }

    @Override // p000.C5038, p000.AbstractC3191
    /* JADX INFO: renamed from: ۦٛ */
    public final InterfaceC4745 mo4947() {
        return this.f14313;
    }

    @Override // p000.C5038, p000.AbstractC3191
    /* JADX INFO: renamed from: ۦۗ */
    public final void mo4470() {
        AbstractC5378.m9072();
        throw null;
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۦۙ */
    public final long mo5118() {
        return m7633().mo5118();
    }

    @Override // p000.C5038, p000.AbstractC3191
    /* JADX INFO: renamed from: ۦۚ */
    public final void mo4948(InterfaceC0622 interfaceC0622) {
        m7633().mo4948(interfaceC0622);
    }
}
