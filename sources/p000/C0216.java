package p000;

/* JADX INFO: renamed from: ۥؑؗۛؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0216 {

    /* JADX INFO: renamed from: ۥؗ */
    public InterfaceC4434 f801;

    /* JADX INFO: renamed from: ۥَ */
    public long f802;

    /* JADX INFO: renamed from: ۥُ */
    public boolean f803;

    /* JADX INFO: renamed from: ۥّ */
    public int f804;

    /* JADX INFO: renamed from: ۥۗ */
    public C3564 f807;

    /* JADX INFO: renamed from: ۥۣ */
    public String f809;

    /* JADX INFO: renamed from: ۦؑ */
    public int f810;

    /* JADX INFO: renamed from: ۦٌ */
    public C4366 f812;

    /* JADX INFO: renamed from: ۦِ */
    public C4303 f813;

    /* JADX INFO: renamed from: ۦٛ */
    public InterfaceC2880 f814;

    /* JADX INFO: renamed from: ۦۗ */
    public boolean f815;

    /* JADX INFO: renamed from: ۦۙ */
    public int f816;

    /* JADX INFO: renamed from: ۦۚ */
    public InterfaceC4655 f817;

    /* JADX INFO: renamed from: ۦۨ */
    public EnumC2459 f819;

    /* JADX INFO: renamed from: ۥۜ */
    public long f808 = AbstractC1929.f6356;

    /* JADX INFO: renamed from: ۦؚ */
    public long f811 = 0;

    /* JADX INFO: renamed from: ۦ۟ */
    public long f818 = AbstractC0671.m1495(0, 0, 0, 0);

    /* JADX INFO: renamed from: ۥْ */
    public int f805 = -1;

    /* JADX INFO: renamed from: ۥٓ */
    public int f806 = -1;

    public C0216(String str, C3564 c3564, InterfaceC4434 interfaceC4434, int i, boolean z, int i2, int i3) {
        this.f809 = str;
        this.f807 = c3564;
        this.f801 = interfaceC4434;
        this.f810 = i;
        this.f803 = z;
        this.f804 = i2;
        this.f816 = i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.f813 != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) AbstractC1929.m3790(this.f808));
        sb.append(", history=");
        sb.append(this.f802);
        sb.append(", constraints=$)");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m469() {
        this.f813 = null;
        this.f817 = null;
        this.f819 = null;
        this.f805 = -1;
        this.f806 = -1;
        this.f818 = AbstractC0671.m1495(0, 0, 0, 0);
        this.f811 = 0L;
        this.f815 = false;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC4655 m470(EnumC2459 enumC2459) {
        InterfaceC4655 c5541 = this.f817;
        if (c5541 == null || enumC2459 != this.f819 || c5541.mo2997()) {
            this.f819 = enumC2459;
            String str = this.f809;
            C3564 c3564M9238 = AbstractC5537.m9238(this.f807, enumC2459);
            InterfaceC2880 interfaceC2880 = this.f814;
            InterfaceC4434 interfaceC4434 = this.f801;
            C2340 c2340 = C2340.f7777;
            c5541 = new C5541(str, c3564M9238, c2340, c2340, interfaceC4434, interfaceC2880);
        }
        this.f817 = c5541;
        return c5541;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m471(long j, EnumC2459 enumC2459) {
        long jM7673;
        InterfaceC4655 interfaceC4655;
        this.f802 = (this.f802 << 2) | 3;
        boolean z = true;
        if (this.f816 > 1) {
            C4366 c4366M3053 = AbstractC1434.m3053(this.f812, enumC2459, this.f807, this.f814, this.f801);
            this.f812 = c4366M3053;
            jM7673 = c4366M3053.m7673(j, this.f816);
        } else {
            jM7673 = j;
        }
        C4303 c4303 = this.f813;
        boolean z2 = false;
        if (c4303 != null && (interfaceC4655 = this.f817) != null && !interfaceC4655.mo2997() && enumC2459 == this.f819 && (C3693.m6547(jM7673, this.f818) || (C3693.m6556(jM7673) == C3693.m6556(this.f818) && C3693.m6557(jM7673) == C3693.m6557(this.f818) && C3693.m6551(jM7673) >= c4303.m7592() && !c4303.f14237.f2687))) {
            if (!C3693.m6547(jM7673, this.f818)) {
                C4303 c4304 = this.f813;
                long jM1497 = AbstractC0671.m1497(jM7673, (((long) AbstractC1434.m3058(Math.min(c4304.f14236.f18298.m9537(), c4304.m7594()))) << 32) | (((long) AbstractC1434.m3058(c4304.m7592())) & 4294967295L));
                this.f811 = jM1497;
                if (this.f810 == 3 || (((int) (jM1497 >> 32)) >= c4304.m7594() && ((int) (4294967295L & jM1497)) >= c4304.m7592())) {
                    z = false;
                }
                this.f815 = z;
                this.f818 = jM7673;
            }
            return false;
        }
        InterfaceC4655 interfaceC4655M470 = m470(enumC2459);
        long jM7816 = AbstractC4489.m7816(interfaceC4655M470.mo2987(), this.f810, jM7673, this.f803);
        boolean z3 = this.f803;
        int i = this.f810;
        int i2 = this.f804;
        C4303 c4305 = new C4303((C5541) interfaceC4655M470, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, jM7816);
        this.f818 = jM7673;
        long jM1498 = AbstractC0671.m1497(jM7673, (((long) AbstractC1434.m3058(c4305.m7592())) & 4294967295L) | (((long) AbstractC1434.m3058(c4305.m7594())) << 32));
        this.f811 = jM1498;
        if (this.f810 != 3 && (((int) (jM1498 >> 32)) < c4305.m7594() || ((int) (jM1498 & 4294967295L)) < c4305.m7592())) {
            z2 = true;
        }
        this.f815 = z2;
        this.f813 = c4305;
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m472(int i, EnumC2459 enumC2459) {
        int i2 = this.f805;
        int i3 = this.f806;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jM1496 = AbstractC0671.m1496(0, i, 0, Integer.MAX_VALUE);
        if (this.f816 > 1) {
            C4366 c4366M3053 = AbstractC1434.m3053(this.f812, enumC2459, this.f807, this.f814, this.f801);
            this.f812 = c4366M3053;
            jM1496 = c4366M3053.m7673(jM1496, this.f816);
        }
        InterfaceC4655 interfaceC4655M470 = m470(enumC2459);
        long jM7816 = AbstractC4489.m7816(interfaceC4655M470.mo2987(), this.f810, jM1496, this.f803);
        boolean z = this.f803;
        int i4 = this.f810;
        int i5 = this.f804;
        int iM3058 = AbstractC1434.m3058(new C4303((C5541) interfaceC4655M470, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jM7816).m7592());
        int iM6555 = C3693.m6555(jM1496);
        if (iM3058 < iM6555) {
            iM3058 = iM6555;
        }
        this.f805 = i;
        this.f806 = iM3058;
        return iM3058;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m473(InterfaceC2880 interfaceC2880) {
        long jM3791;
        InterfaceC2880 interfaceC2881 = this.f814;
        if (interfaceC2880 != null) {
            int i = AbstractC1929.f6355;
            jM3791 = AbstractC1929.m3791(interfaceC2880.mo746(), interfaceC2880.mo754());
        } else {
            jM3791 = AbstractC1929.f6356;
        }
        if (interfaceC2881 == null) {
            this.f814 = interfaceC2880;
            this.f808 = jM3791;
        } else if (interfaceC2880 == null || this.f808 != jM3791) {
            this.f814 = interfaceC2880;
            this.f808 = jM3791;
            this.f802 = (this.f802 << 2) | 1;
            m469();
        }
    }
}
