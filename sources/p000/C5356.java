package p000;

/* JADX INFO: renamed from: ۦؚ۟ؖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5356 extends AbstractC5381 implements InterfaceC4825, InterfaceC4933, InterfaceC0349 {

    /* JADX INFO: renamed from: ۥً */
    public C3564 f17624;

    /* JADX INFO: renamed from: ۥٕ */
    public int f17625;

    /* JADX INFO: renamed from: ۥۙ */
    public boolean f17626;

    /* JADX INFO: renamed from: ۥۦ */
    public C3564 f17627;

    /* JADX INFO: renamed from: ۦؖ */
    public int f17628;

    /* JADX INFO: renamed from: ۦؗ */
    public C4879 f17629;

    /* JADX INFO: renamed from: ۦؙ */
    public int f17630;

    /* JADX INFO: renamed from: ۦٚ */
    public int f17631;

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۥ */
    public final void mo780() {
        InterfaceC4434 interfaceC4434 = (InterfaceC4434) AbstractC2552.m4807(this, AbstractC2853.f9553);
        this.f17627 = AbstractC5537.m9238(this.f17624, AbstractC5537.m9270(this).f2272);
        AbstractC0903 abstractC0903 = m8949().f11803.f1986;
        C1626 c1626 = m8949().f11803.f1984;
        if (c1626 == null) {
            c1626 = C1626.f5439;
        }
        C5827 c5827 = m8949().f11803.f1990;
        int i = c5827 != null ? c5827.f19197 : 0;
        C2848 c2848 = m8949().f11803.f1985;
        this.f17629 = ((C1226) interfaceC4434).m2590(abstractC0903, c1626, i, c2848 != null ? c2848.f9512 : 65535);
        AbstractC5568.m9359(this, new C5624(this, 0));
        this.f17626 = true;
    }

    /* JADX INFO: renamed from: ۥؑ */
    public final C3564 m8949() {
        C3564 c3564 = this.f17627;
        if (c3564 != null) {
            return c3564;
        }
        AbstractC4690.m8037("Resolved style is not set.");
        C1078.m2274();
        return null;
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5370 mo931(InterfaceC2427 interfaceC2427, InterfaceC1827 interfaceC1827, long j) {
        if (this.f17626) {
            C3564 c3564M8949 = m8949();
            InterfaceC4434 interfaceC4434 = (InterfaceC4434) AbstractC2552.m4807(this, AbstractC2853.f9553);
            String str = AbstractC1287.f4393;
            int iM2716 = (int) (AbstractC1287.m2716(c3564M8949, interfaceC2427, interfaceC4434, str, 1) & 4294967295L);
            int iM2717 = ((int) (AbstractC1287.m2716(c3564M8949, interfaceC2427, interfaceC4434, str + '\n' + str, 2) & 4294967295L)) - iM2716;
            int i = this.f17631;
            this.f17630 = i == 1 ? -1 : ((i - 1) * iM2717) + iM2716;
            int i2 = this.f17625;
            this.f17628 = i2 == Integer.MAX_VALUE ? -1 : ((i2 - 1) * iM2717) + iM2716;
            this.f17626 = false;
        }
        int i3 = this.f17630;
        int iM7934 = i3 != -1 ? AbstractC4554.m7934(i3, C3693.m6555(j), C3693.m6551(j)) : C3693.m6555(j);
        int i4 = this.f17628;
        AbstractC0275 abstractC0275Mo3597 = interfaceC1827.mo3597(C3693.m6550(j, 0, 0, iM7934, i4 != -1 ? AbstractC4554.m7934(i4, C3693.m6555(j), C3693.m6551(j)) : C3693.m6551(j), 3));
        return interfaceC2427.mo755(abstractC0275Mo3597.f985, abstractC0275Mo3597.f984, C0204.f751, new C2785(abstractC0275Mo3597, 2));
    }

    @Override // p000.InterfaceC3975
    /* JADX INFO: renamed from: ۥ۠ */
    public final void mo932() {
        this.f17627 = AbstractC5537.m9238(this.f17624, AbstractC5537.m9270(this).f2272);
        this.f17626 = true;
        C5063.m8642(this);
    }

    @Override // p000.InterfaceC3975
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo933() {
        this.f17626 = true;
        C5063.m8642(this);
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦؘ */
    public final boolean mo786() {
        return false;
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦٓ */
    public final void mo788() {
        this.f17627 = null;
        this.f17629 = null;
        this.f17626 = false;
    }

    @Override // p000.InterfaceC0349
    /* JADX INFO: renamed from: ۦٖ */
    public final void mo772() {
        if (this.f17629 != null) {
            AbstractC5568.m9359(this, new C5624(this, 1));
        }
        this.f17626 = true;
        C5063.m8642(this);
    }
}
