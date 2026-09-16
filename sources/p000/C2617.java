package p000;

/* JADX INFO: renamed from: ۥۢؔۧٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2617 extends AbstractC3191 {

    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC4745 f8718;

    /* JADX INFO: renamed from: ۥّ */
    public int f8719;

    public C2617(long j, C5570 c5570, InterfaceC4745 interfaceC4745) {
        super(j, c5570);
        this.f8718 = interfaceC4745;
        this.f8719 = 1;
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo2657() {
        if (this.f10717) {
            return;
        }
        mo4467();
        this.f10717 = true;
        synchronized (AbstractC1538.f5203) {
            m5885();
        }
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC4745 mo4945() {
        return this.f8718;
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۥّ */
    public final boolean mo4946() {
        return true;
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۦؚ */
    public final void mo4467() {
        int i = this.f8719 - 1;
        this.f8719 = i;
        if (i == 0) {
            m5882();
        }
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۦٗ */
    public final AbstractC3191 mo4469(InterfaceC4745 interfaceC4745) {
        AbstractC1538.m3289(this);
        return new C4679(this.f10718, this.f10719, AbstractC1538.m3285(interfaceC4745, this.f8718, true), this);
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۦٛ */
    public final InterfaceC4745 mo4947() {
        return null;
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۦۗ */
    public final void mo4470() {
        this.f8719++;
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
