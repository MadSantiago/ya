package p000;

/* JADX INFO: renamed from: ۦَٙؓؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4476 extends AbstractC5381 implements InterfaceC0951, InterfaceC0349, InterfaceC5671 {

    /* JADX INFO: renamed from: ۥً */
    public long f14776;

    /* JADX INFO: renamed from: ۥٕ */
    public long f14777;

    /* JADX INFO: renamed from: ۥۙ */
    public EnumC2459 f14778;

    /* JADX INFO: renamed from: ۥۦ */
    public AbstractC3925 f14779;

    /* JADX INFO: renamed from: ۦؖ */
    public InterfaceC2864 f14780;

    /* JADX INFO: renamed from: ۦؙ */
    public AbstractC3925 f14781;

    /* JADX INFO: renamed from: ۦٚ */
    public InterfaceC2864 f14782;

    @Override // p000.InterfaceC0951
    /* JADX INFO: renamed from: ۥٛ */
    public final void mo1726(C2497 c2497) {
        C2497 c2498;
        AbstractC3925 abstractC3925;
        C2004 c2004 = c2497.f8304;
        if (this.f14782 != AbstractC2552.f8518) {
            c2498 = c2497;
            if (C3291.m6053(c2004.mo4567(), this.f14777) && c2498.getLayoutDirection() == this.f14778 && AbstractC3831.m6874(this.f14780, this.f14782)) {
                abstractC3925 = this.f14781;
            } else {
                AbstractC5568.m9359(this, new C1225(2, this, c2498));
                abstractC3925 = this.f14779;
                this.f14779 = null;
            }
            this.f14781 = abstractC3925;
            this.f14777 = c2004.mo4567();
            this.f14778 = c2498.getLayoutDirection();
            this.f14780 = this.f14782;
            if (!C4462.m7744(this.f14776, C1327.f4591)) {
                AbstractC0949.m1927(c2498, abstractC3925, this.f14776);
            }
        } else if (C4462.m7744(this.f14776, C1327.f4591)) {
            c2498 = c2497;
        } else {
            c2498 = c2497;
            InterfaceC2442.m4561(c2498, this.f14776, 0L, 0.0f, 126);
        }
        c2498.m4644();
    }

    @Override // p000.InterfaceC5671
    /* JADX INFO: renamed from: ۦِ */
    public final boolean mo4044() {
        return false;
    }

    @Override // p000.InterfaceC0349
    /* JADX INFO: renamed from: ۦٖ */
    public final void mo772() {
        this.f14777 = 9205357640488583168L;
        this.f14778 = null;
        this.f14781 = null;
        this.f14780 = null;
        AbstractC5378.m9047(this);
    }

    @Override // p000.InterfaceC5671
    /* JADX INFO: renamed from: ۦٟ */
    public final void mo790(InterfaceC1066 interfaceC1066) {
        AbstractC3992.m7131(interfaceC1066, this.f14782);
    }
}
