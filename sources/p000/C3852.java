package p000;

/* JADX INFO: renamed from: ۦَؕٞۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3852 extends AbstractC5381 implements InterfaceC0349, InterfaceC2086, InterfaceC0951 {

    /* JADX INFO: renamed from: ۥً */
    public final C5665 f12871;

    /* JADX INFO: renamed from: ۥٕ */
    public InterfaceC4745 f12872;

    /* JADX INFO: renamed from: ۦٚ */
    public boolean f12873;

    public C3852(C5665 c5665, InterfaceC4745 interfaceC4745) {
        this.f12871 = c5665;
        this.f12872 = interfaceC4745;
        c5665.f18635 = this;
    }

    @Override // p000.InterfaceC2086
    public final EnumC2459 getLayoutDirection() {
        return AbstractC5537.m9270(this).f2272;
    }

    /* JADX INFO: renamed from: ۥؑ */
    public final void m6890() {
        this.f12873 = false;
        this.f12871.f18634 = null;
        AbstractC5378.m9047(this);
    }

    @Override // p000.InterfaceC0951
    /* JADX INFO: renamed from: ۥٗ */
    public final void mo1969() {
        m6890();
    }

    @Override // p000.InterfaceC0951
    /* JADX INFO: renamed from: ۥٛ */
    public final void mo1726(C2497 c2497) {
        boolean z = this.f12873;
        C5665 c5665 = this.f12871;
        if (!z) {
            c5665.f18634 = null;
            AbstractC5568.m9359(this, new C5304(3, this, c5665));
            if (c5665.f18634 == null) {
                throw AbstractC3761.m6633("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f12873 = true;
        }
        c5665.f18634.f13729.mo211(c2497);
    }

    @Override // p000.InterfaceC2086
    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC2880 mo2763() {
        return AbstractC5537.m9270(this).f2236;
    }

    @Override // p000.InterfaceC3975
    /* JADX INFO: renamed from: ۥ۠ */
    public final void mo932() {
        m6890();
    }

    @Override // p000.InterfaceC3975
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo933() {
        m6890();
    }

    @Override // p000.InterfaceC2086
    /* JADX INFO: renamed from: ۦؑ */
    public final long mo2766() {
        return AbstractC5537.m9235(AbstractC5537.m9245(this, 4).f982);
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦً */
    public final void mo1267() {
        m6890();
    }

    @Override // p000.InterfaceC0349
    /* JADX INFO: renamed from: ۦٖ */
    public final void mo772() {
        m6890();
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦٓ */
    public final void mo788() {
    }
}
