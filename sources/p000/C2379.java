package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥۜؔۜٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2379 {

    /* JADX INFO: renamed from: ۥؗ */
    public int f7869;

    /* JADX INFO: renamed from: ۥُ */
    public int f7870;

    /* JADX INFO: renamed from: ۥّ */
    public int f7871;

    /* JADX INFO: renamed from: ۥْ */
    public long f7872;

    /* JADX INFO: renamed from: ۥۗ */
    public InterfaceC4434 f7873;

    /* JADX INFO: renamed from: ۥۜ */
    public C4366 f7874;

    /* JADX INFO: renamed from: ۥۣ */
    public C1249 f7875;

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f7876;

    /* JADX INFO: renamed from: ۦؚ */
    public C1414 f7877;

    /* JADX INFO: renamed from: ۦٌ */
    public EnumC2459 f7878;

    /* JADX INFO: renamed from: ۦِ */
    public InterfaceC2880 f7879;

    /* JADX INFO: renamed from: ۦۗ */
    public C3564 f7881;

    /* JADX INFO: renamed from: ۦۙ */
    public List f7882;

    /* JADX INFO: renamed from: ۦۚ */
    public C3828 f7883;

    /* JADX INFO: renamed from: ۦٛ */
    public long f7880 = AbstractC1929.f6356;

    /* JADX INFO: renamed from: ۦۨ */
    public int f7885 = -1;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f7884 = -1;

    public C2379(C1249 c1249, C3564 c3564, InterfaceC4434 interfaceC4434, int i, boolean z, int i2, int i3, List list) {
        this.f7875 = c1249;
        this.f7873 = interfaceC4434;
        this.f7869 = i;
        this.f7876 = z;
        this.f7870 = i2;
        this.f7871 = i3;
        this.f7882 = list;
        this.f7881 = c3564;
    }

    public final String toString() {
        C2537 c2537;
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        Object c3693 = "null";
        sb.append(this.f7883 != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) AbstractC1929.m3790(this.f7880));
        sb.append(", history=");
        sb.append(this.f7872);
        sb.append(", constraints=");
        C3828 c3828 = this.f7883;
        if (c3828 != null && (c2537 = c3828.f12697) != null) {
            c3693 = new C3693(c2537.f8432);
        }
        sb.append(c3693);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean m4451(long j, EnumC2459 enumC2459) {
        this.f7872 = (this.f7872 << 2) | 3;
        if (this.f7871 > 1) {
            C4366 c4366M3053 = AbstractC1434.m3053(this.f7874, enumC2459, this.f7881, this.f7879, this.f7873);
            this.f7874 = c4366M3053;
            j = c4366M3053.m7673(j, this.f7871);
        }
        C3828 c3828 = this.f7883;
        if (c3828 != null) {
            C2276 c2276 = c3828.f12696;
            C2537 c2537 = c3828.f12697;
            if (!c2276.f7563.mo2997()) {
                EnumC2459 enumC24510 = c2537.f8429;
                long j2 = c2537.f8432;
                if (enumC2459 == enumC24510 && (C3693.m6547(j, j2) || (C3693.m6556(j) == C3693.m6556(j2) && C3693.m6557(j) == C3693.m6557(j2) && C3693.m6551(j) >= c2276.f7559 && !c2276.f7558))) {
                    if (C3693.m6547(j, this.f7883.f12697.f8432)) {
                        return false;
                    }
                    this.f7883 = m4453(enumC2459, j, this.f7883.f12696);
                    return true;
                }
            }
        }
        this.f7883 = m4453(enumC2459, j, m4454(j, enumC2459));
        return true;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final C1414 m4452(EnumC2459 enumC2459) {
        C1414 c1414 = this.f7877;
        if (c1414 == null || enumC2459 != this.f7878 || c1414.mo2997()) {
            this.f7878 = enumC2459;
            C1249 c1249 = this.f7875;
            C3564 c3564M9238 = AbstractC5537.m9238(this.f7881, enumC2459);
            InterfaceC2880 interfaceC2880 = this.f7879;
            InterfaceC4434 interfaceC4434 = this.f7873;
            List list = this.f7882;
            if (list == null) {
                list = C2340.f7777;
            }
            c1414 = new C1414(c1249, c3564M9238, list, interfaceC2880, interfaceC4434);
        }
        this.f7877 = c1414;
        return c1414;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final C3828 m4453(EnumC2459 enumC2459, long j, C2276 c2276) {
        float fMin = Math.min(c2276.f7563.mo2987(), c2276.f7564);
        C1249 c1249 = this.f7875;
        C3564 c3564 = this.f7881;
        List list = this.f7882;
        if (list == null) {
            list = C2340.f7777;
        }
        return new C3828(new C2537(c1249, c3564, list, this.f7870, this.f7876, this.f7869, this.f7879, enumC2459, this.f7873, j), c2276, AbstractC0671.m1497(j, (((long) AbstractC1434.m3058(fMin)) << 32) | (((long) AbstractC1434.m3058(c2276.f7559)) & 4294967295L)));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C2276 m4454(long j, EnumC2459 enumC2459) {
        C1414 c1414M4452 = m4452(enumC2459);
        long jM7816 = AbstractC4489.m7816(c1414M4452.mo2987(), this.f7869, j, this.f7876);
        boolean z = this.f7876;
        int i = this.f7869;
        int i2 = this.f7870;
        return new C2276(c1414M4452, jM7816, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m4455(int i, EnumC2459 enumC2459) {
        int i2 = this.f7885;
        int i3 = this.f7884;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jM1496 = AbstractC0671.m1496(0, i, 0, Integer.MAX_VALUE);
        if (this.f7871 > 1) {
            C4366 c4366M3053 = AbstractC1434.m3053(this.f7874, enumC2459, this.f7881, this.f7879, this.f7873);
            this.f7874 = c4366M3053;
            jM1496 = c4366M3053.m7673(jM1496, this.f7871);
        }
        int iM3058 = AbstractC1434.m3058(m4454(jM1496, enumC2459).f7559);
        int iM6555 = C3693.m6555(jM1496);
        if (iM3058 < iM6555) {
            iM3058 = iM6555;
        }
        this.f7885 = i;
        this.f7884 = iM3058;
        return iM3058;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m4456(InterfaceC2880 interfaceC2880) {
        long jM3791;
        InterfaceC2880 interfaceC2881 = this.f7879;
        if (interfaceC2880 != null) {
            int i = AbstractC1929.f6355;
            jM3791 = AbstractC1929.m3791(interfaceC2880.mo746(), interfaceC2880.mo754());
        } else {
            jM3791 = AbstractC1929.f6356;
        }
        if (interfaceC2881 == null) {
            this.f7879 = interfaceC2880;
            this.f7880 = jM3791;
        } else if (interfaceC2880 == null || this.f7880 != jM3791) {
            this.f7879 = interfaceC2880;
            this.f7880 = jM3791;
            this.f7872 = (this.f7872 << 2) | 1;
            this.f7877 = null;
            this.f7883 = null;
            this.f7884 = -1;
            this.f7885 = -1;
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m4457(C1249 c1249, C3564 c3564, InterfaceC4434 interfaceC4434, int i, boolean z, int i2, int i3, List list) {
        this.f7875 = c1249;
        boolean zM6358 = c3564.m6358(this.f7881);
        this.f7881 = c3564;
        if (!zM6358) {
            this.f7872 <<= 2;
            this.f7877 = null;
            this.f7883 = null;
            this.f7884 = -1;
            this.f7885 = -1;
        }
        this.f7873 = interfaceC4434;
        this.f7869 = i;
        this.f7876 = z;
        this.f7870 = i2;
        this.f7871 = i3;
        this.f7882 = list;
        this.f7872 = (this.f7872 << 2) | 2;
        this.f7877 = null;
        this.f7883 = null;
        this.f7884 = -1;
        this.f7885 = -1;
    }
}
