package p000;

/* JADX INFO: renamed from: ۦٟٖٕؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4830 extends AbstractC3019 implements InterfaceC4825, InterfaceC0349 {

    /* JADX INFO: renamed from: ۥؔ */
    public C2677 f15906;

    /* JADX INFO: renamed from: ۥٕ */
    public InterfaceC3096 f15907;

    /* JADX INFO: renamed from: ۥ٘ */
    public C2851 f15908;

    /* JADX INFO: renamed from: ۥٛ */
    public boolean f15909;

    /* JADX INFO: renamed from: ۥۙ */
    public EnumC1616 f15910;

    /* JADX INFO: renamed from: ۥۦ */
    public C2243 f15911;

    /* JADX INFO: renamed from: ۦؖ */
    public InterfaceC0738 f15912;

    /* JADX INFO: renamed from: ۦؗ */
    public InterfaceC3762 f15913;

    /* JADX INFO: renamed from: ۦؙ */
    public boolean f15914;

    /* JADX INFO: renamed from: ۦُ */
    public boolean f15915;

    /* JADX INFO: renamed from: ۦٖ */
    public C2851 f15916;

    /* JADX INFO: renamed from: ۦۜ */
    public InterfaceC3975 f15917;

    /* JADX INFO: renamed from: ۦۣ */
    public C3376 f15918;

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۥ */
    public final void mo780() {
        this.f15909 = m8201();
        m8200();
        if (this.f15906 == null) {
            InterfaceC3096 interfaceC3096 = this.f15907;
            C2851 c2851 = this.f15915 ? this.f15908 : this.f15916;
            C2677 c2677 = new C2677(c2851, this.f15913, this.f15912, this.f15911, this.f15910, interfaceC3096, this.f15914, this.f15909);
            m5603(c2677);
            this.f15906 = c2677;
        }
    }

    /* JADX INFO: renamed from: ۥؐ */
    public final void m8200() {
        InterfaceC3975 interfaceC3975 = this.f15917;
        if (interfaceC3975 != null) {
            if (((AbstractC5381) interfaceC3975).f17791.f17786) {
                return;
            }
            m5603(interfaceC3975);
            return;
        }
        if (this.f15915) {
            AbstractC5568.m9359(this, new C0463(1, this));
        }
        C2851 c2851 = this.f15915 ? this.f15908 : this.f15916;
        if (c2851 != null) {
            AbstractC3019 abstractC3019 = c2851.f9525;
            if (abstractC3019.f17791.f17786) {
                return;
            }
            m5603(abstractC3019);
            this.f15917 = abstractC3019;
        }
    }

    @Override // p000.InterfaceC3975
    /* JADX INFO: renamed from: ۥ۠ */
    public final void mo932() {
        boolean zM8201 = m8201();
        if (this.f15909 != zM8201) {
            this.f15909 = zM8201;
            InterfaceC3096 interfaceC3096 = this.f15907;
            EnumC1616 enumC1616 = this.f15910;
            boolean z = this.f15915;
            C2851 c2851 = z ? this.f15908 : this.f15916;
            m8202(c2851, this.f15913, this.f15912, this.f15911, enumC1616, interfaceC3096, z, this.f15914);
        }
    }

    /* JADX INFO: renamed from: ۦؕ */
    public final boolean m8201() {
        return (this.f17786 ? AbstractC5537.m9270(this).f2272 : EnumC2459.f8215) != EnumC2459.f8214 || this.f15910 == EnumC1616.f5425;
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦؘ */
    public final boolean mo786() {
        return false;
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦٓ */
    public final void mo788() {
        InterfaceC3975 interfaceC3975 = this.f15917;
        if (interfaceC3975 != null) {
            m5607(interfaceC3975);
        }
    }

    @Override // p000.InterfaceC0349
    /* JADX INFO: renamed from: ۦٖ */
    public final void mo772() {
        C3376 c3376 = (C3376) AbstractC2552.m4807(this, AbstractC4834.f15922);
        if (AbstractC3831.m6874(c3376, this.f15918)) {
            return;
        }
        this.f15918 = c3376;
        this.f15908 = null;
        InterfaceC3975 interfaceC3975 = this.f15917;
        if (interfaceC3975 != null) {
            m5607(interfaceC3975);
        }
        this.f15917 = null;
        m8200();
        C2677 c2677 = this.f15906;
        if (c2677 != null) {
            InterfaceC3096 interfaceC3096 = this.f15907;
            EnumC1616 enumC1616 = this.f15910;
            C2851 c2851 = this.f15915 ? this.f15908 : this.f15916;
            c2677.m9877(c2851, this.f15913, this.f15912, this.f15911, enumC1616, interfaceC3096, this.f15914, this.f15909);
        }
    }

    /* JADX INFO: renamed from: ۦ٘ */
    public final void m8202(C2851 c2851, InterfaceC3762 interfaceC3762, InterfaceC0738 interfaceC0738, C2243 c2243, EnumC1616 enumC1616, InterfaceC3096 interfaceC3096, boolean z, boolean z2) {
        boolean z3;
        this.f15907 = interfaceC3096;
        this.f15910 = enumC1616;
        boolean z4 = true;
        if (this.f15915 != z) {
            this.f15915 = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (AbstractC3831.m6874(this.f15916, c2851)) {
            z4 = false;
        } else {
            this.f15916 = c2851;
        }
        if (z3 || (z4 && !z)) {
            InterfaceC3975 interfaceC3975 = this.f15917;
            if (interfaceC3975 != null) {
                m5607(interfaceC3975);
            }
            this.f15917 = null;
            m8200();
        }
        this.f15914 = z2;
        this.f15912 = interfaceC0738;
        this.f15911 = c2243;
        this.f15913 = interfaceC3762;
        boolean zM8201 = m8201();
        this.f15909 = zM8201;
        C2677 c2677 = this.f15906;
        if (c2677 != null) {
            c2677.m9877(this.f15915 ? this.f15908 : this.f15916, interfaceC3762, interfaceC0738, c2243, enumC1616, interfaceC3096, z2, zM8201);
        }
    }
}
