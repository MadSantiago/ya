package p000;

/* JADX INFO: renamed from: ۦٜؓٙٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4679 extends AbstractC3191 {

    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC4745 f15418;

    /* JADX INFO: renamed from: ۥّ */
    public final AbstractC3191 f15419;

    public C4679(long j, C5570 c5570, InterfaceC4745 interfaceC4745, AbstractC3191 abstractC3191) {
        super(j, c5570);
        this.f15418 = interfaceC4745;
        this.f15419 = abstractC3191;
        abstractC3191.mo4470();
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo2657() {
        AbstractC3191 abstractC3191 = this.f15419;
        if (this.f10717) {
            return;
        }
        if (this.f10718 != abstractC3191.mo5118()) {
            m5882();
        }
        abstractC3191.mo4467();
        this.f10717 = true;
        synchronized (AbstractC1538.f5203) {
            m5885();
        }
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC4745 mo4945() {
        return this.f15418;
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۥّ */
    public final boolean mo4946() {
        return true;
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۦؚ */
    public final void mo4467() {
        AbstractC5378.m9072();
        throw null;
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۦٗ */
    public final AbstractC3191 mo4469(InterfaceC4745 interfaceC4745) {
        return new C4679(this.f10718, this.f10719, AbstractC1538.m3285(interfaceC4745, this.f15418, true), this.f15419);
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
    /* JADX INFO: renamed from: ۦۚ */
    public final void mo4948(InterfaceC0622 interfaceC0622) {
        C4215 c4215 = AbstractC1538.f5208;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo4468() {
    }
}
