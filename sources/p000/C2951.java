package p000;

/* JADX INFO: renamed from: ۥًؘۨؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2951 extends AbstractC5381 implements InterfaceC4933 {

    /* JADX INFO: renamed from: ۥؔ */
    public final C4191 f9896;

    /* JADX INFO: renamed from: ۥً */
    public C0777 f9897;

    /* JADX INFO: renamed from: ۥٕ */
    public C5627 f9898;

    /* JADX INFO: renamed from: ۥۙ */
    public C5627 f9899;

    /* JADX INFO: renamed from: ۥۦ */
    public InterfaceC4448 f9900;

    /* JADX INFO: renamed from: ۦؖ */
    public C5521 f9901;

    /* JADX INFO: renamed from: ۦؗ */
    public C3106 f9902;

    /* JADX INFO: renamed from: ۦؙ */
    public C1808 f9903;

    /* JADX INFO: renamed from: ۦُ */
    public long f9904 = -9223372034707292160L;

    /* JADX INFO: renamed from: ۦٖ */
    public InterfaceC5807 f9905;

    /* JADX INFO: renamed from: ۦٚ */
    public C5627 f9906;

    /* JADX INFO: renamed from: ۦۜ */
    public final C4191 f9907;

    public C2951(C0777 c0777, C5627 c5627, C5627 c5628, C5627 c5629, C1808 c1808, C5521 c5521, InterfaceC4448 interfaceC4448, C3106 c3106) {
        this.f9897 = c0777;
        this.f9906 = c5627;
        this.f9898 = c5628;
        this.f9899 = c5629;
        this.f9903 = c1808;
        this.f9901 = c5521;
        this.f9900 = interfaceC4448;
        this.f9902 = c3106;
        AbstractC0671.m1494(0, 0, 0, 0, 15);
        this.f9896 = new C4191(this, 0);
        this.f9907 = new C4191(this, 1);
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۥ */
    public final void mo780() {
        this.f9904 = -9223372034707292160L;
    }

    /* JADX INFO: renamed from: ۥؑ */
    public final InterfaceC5807 m5518() {
        InterfaceC5807 interfaceC5807;
        InterfaceC5807 interfaceC5808;
        if (this.f9897.m1673().m4575(EnumC0211.f796, EnumC0211.f795)) {
            C5388 c5388 = this.f9903.f6021.f12209;
            if (c5388 != null && (interfaceC5808 = c5388.f17809) != null) {
                return interfaceC5808;
            }
            C5388 c5389 = this.f9901.f18231.f12209;
            if (c5389 != null) {
                return c5389.f17809;
            }
            return null;
        }
        C5388 c53810 = this.f9901.f18231.f12209;
        if (c53810 != null && (interfaceC5807 = c53810.f17809) != null) {
            return interfaceC5807;
        }
        C5388 c53811 = this.f9903.f6021.f12209;
        if (c53811 != null) {
            return c53811.f17809;
        }
        return null;
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥً */
    public final int mo1554(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        return interfaceC1827.mo3596(i);
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5370 mo931(InterfaceC2427 interfaceC2427, InterfaceC1827 interfaceC1827, long j) {
        C5290 c5290M9474;
        long j2;
        if (this.f9897.m1671() == this.f9897.f2814.getValue()) {
            this.f9905 = null;
        } else if (this.f9905 == null) {
            InterfaceC5807 interfaceC5807M5518 = m5518();
            if (interfaceC5807M5518 == null) {
                interfaceC5807M5518 = C1298.f4456;
            }
            this.f9905 = interfaceC5807M5518;
        }
        boolean zMo323 = interfaceC2427.mo323();
        C0204 c0204 = C0204.f751;
        if (zMo323) {
            AbstractC0275 abstractC0275Mo3597 = interfaceC1827.mo3597(j);
            long j3 = (((long) abstractC0275Mo3597.f985) << 32) | (((long) abstractC0275Mo3597.f984) & 4294967295L);
            this.f9904 = j3;
            return interfaceC2427.mo755((int) (j3 >> 32), (int) (j3 & 4294967295L), c0204, new C0778(abstractC0275Mo3597, 3));
        }
        if (!((Boolean) this.f9900.mo449()).booleanValue()) {
            AbstractC0275 abstractC0275Mo3598 = interfaceC1827.mo3597(j);
            return interfaceC2427.mo755(abstractC0275Mo3598.f985, abstractC0275Mo3598.f984, c0204, new C0778(abstractC0275Mo3598, 4));
        }
        C3106 c3106 = this.f9902;
        C5627 c5627 = c3106.f10416;
        C0777 c0777 = c3106.f10415;
        C1808 c1808 = c3106.f10414;
        C5521 c5521 = c3106.f10417;
        C5290 c5290M9475 = c5627 != null ? c5627.m9474(new C1885(c1808, c5521, 0), new C1885(c1808, c5521, 1)) : null;
        c0777.m1671();
        C5583 c5583 = new C5583(c5290M9475, null, null, 2);
        AbstractC0275 abstractC0275Mo3599 = interfaceC1827.mo3597(j);
        long j4 = (((long) abstractC0275Mo3599.f985) << 32) | (((long) abstractC0275Mo3599.f984) & 4294967295L);
        long j5 = !C4207.m7431(this.f9904, -9223372034707292160L) ? this.f9904 : j4;
        C5627 c5628 = this.f9906;
        if (c5628 != null) {
            c5290M9474 = c5628.m9474(this.f9896, new C1210(this, j5, 0));
        } else {
            c5290M9474 = null;
        }
        if (c5290M9474 != null) {
            j4 = ((C4207) c5290M9474.getValue()).f13969;
        }
        long jM1497 = AbstractC0671.m1497(j, j4);
        C5627 c5629 = this.f9898;
        long jMo608 = 0;
        long j6 = c5629 != null ? ((C0873) c5629.m9474(C1931.f6386, new C1210(this, j5, 1)).getValue()).f3199 : 0L;
        C5627 c56210 = this.f9899;
        if (c56210 != null) {
            j2 = ((C0873) c56210.m9474(this.f9907, new C1210(this, j5, 2)).getValue()).f3199;
        } else {
            j2 = 0;
        }
        InterfaceC5807 interfaceC5807 = this.f9905;
        if (interfaceC5807 != null) {
            jMo608 = interfaceC5807.mo608(j5, jM1497, EnumC2459.f8215);
        }
        return interfaceC2427.mo755((int) (jM1497 >> 32), (int) (jM1497 & 4294967295L), c0204, new C2564(abstractC0275Mo3599, C0873.m1861(jMo608, j2), j6, c5583));
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥ۟ */
    public final int mo1555(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        return interfaceC1827.mo3600(i);
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۦۙ */
    public final int mo1556(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        return interfaceC1827.mo3599(i);
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۦ۟ */
    public final int mo1557(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        return interfaceC1827.mo3598(i);
    }
}
