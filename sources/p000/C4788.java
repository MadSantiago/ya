package p000;

/* JADX INFO: renamed from: ۦؙٞؒۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4788 extends AbstractC5381 implements InterfaceC4933 {

    /* JADX INFO: renamed from: ۥً */
    public float f15794;

    /* JADX INFO: renamed from: ۥٕ */
    public float f15795;

    /* JADX INFO: renamed from: ۥۙ */
    public float f15796;

    /* JADX INFO: renamed from: ۦؙ */
    public boolean f15797;

    /* JADX INFO: renamed from: ۦٚ */
    public float f15798;

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX INFO: renamed from: ۥؑ */
    public final long m8173(InterfaceC2427 interfaceC2427) {
        int iMo743;
        int iMo744;
        int iMo745;
        int i = 0;
        if (Float.isNaN(this.f15795)) {
            iMo743 = Integer.MAX_VALUE;
        } else {
            iMo743 = interfaceC2427.mo743(this.f15795);
            if (iMo743 < 0) {
                iMo743 = 0;
            }
        }
        if (Float.isNaN(this.f15796)) {
            iMo744 = Integer.MAX_VALUE;
        } else {
            iMo744 = interfaceC2427.mo743(this.f15796);
            if (iMo744 < 0) {
                iMo744 = 0;
            }
        }
        if (Float.isNaN(this.f15794)) {
            iMo745 = 0;
        } else {
            iMo745 = interfaceC2427.mo743(this.f15794);
            if (iMo745 < 0) {
                iMo745 = 0;
            }
            if (iMo745 > iMo743) {
                iMo745 = iMo743;
            }
            if (iMo745 == Integer.MAX_VALUE) {
                iMo745 = 0;
            }
        }
        if (!Float.isNaN(this.f15798)) {
            int iMo746 = interfaceC2427.mo743(this.f15798);
            if (iMo746 < 0) {
                iMo746 = 0;
            }
            if (iMo746 > iMo744) {
                iMo746 = iMo744;
            }
            if (iMo746 != Integer.MAX_VALUE) {
                i = iMo746;
            }
        }
        return AbstractC0671.m1496(iMo745, iMo743, i, iMo744);
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥً */
    public final int mo1554(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        long jM8173 = m8173(abstractC3625);
        if (C3693.m6549(jM8173)) {
            return C3693.m6551(jM8173);
        }
        if (!this.f15797) {
            i = AbstractC0671.m1502(jM8173, i);
        }
        return AbstractC0671.m1493(jM8173, interfaceC1827.mo3596(i));
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5370 mo931(InterfaceC2427 interfaceC2427, InterfaceC1827 interfaceC1827, long j) {
        int iM6557;
        int iM6556;
        int iM6555;
        int iM6551;
        long jM1496;
        long jM8173 = m8173(interfaceC2427);
        if (this.f15797) {
            jM1496 = AbstractC0671.m1492(j, jM8173);
        } else {
            if (Float.isNaN(this.f15794)) {
                iM6557 = C3693.m6557(j);
                int iM6558 = C3693.m6556(jM8173);
                if (iM6557 > iM6558) {
                    iM6557 = iM6558;
                }
            } else {
                iM6557 = C3693.m6557(jM8173);
            }
            if (Float.isNaN(this.f15795)) {
                iM6556 = C3693.m6556(j);
                int iM6559 = C3693.m6557(jM8173);
                if (iM6556 < iM6559) {
                    iM6556 = iM6559;
                }
            } else {
                iM6556 = C3693.m6556(jM8173);
            }
            if (Float.isNaN(this.f15798)) {
                iM6555 = C3693.m6555(j);
                int iM6552 = C3693.m6551(jM8173);
                if (iM6555 > iM6552) {
                    iM6555 = iM6552;
                }
            } else {
                iM6555 = C3693.m6555(jM8173);
            }
            if (Float.isNaN(this.f15796)) {
                iM6551 = C3693.m6551(j);
                int iM65510 = C3693.m6555(jM8173);
                if (iM6551 < iM65510) {
                    iM6551 = iM65510;
                }
            } else {
                iM6551 = C3693.m6551(jM8173);
            }
            jM1496 = AbstractC0671.m1496(iM6557, iM6556, iM6555, iM6551);
        }
        AbstractC0275 abstractC0275Mo3597 = interfaceC1827.mo3597(jM1496);
        return interfaceC2427.mo755(abstractC0275Mo3597.f985, abstractC0275Mo3597.f984, C0204.f751, new C2785(abstractC0275Mo3597, 5));
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥ۟ */
    public final int mo1555(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        long jM8173 = m8173(abstractC3625);
        if (C3693.m6558(jM8173)) {
            return C3693.m6556(jM8173);
        }
        if (!this.f15797) {
            i = AbstractC0671.m1493(jM8173, i);
        }
        return AbstractC0671.m1502(jM8173, interfaceC1827.mo3600(i));
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۦۙ */
    public final int mo1556(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        long jM8173 = m8173(abstractC3625);
        if (C3693.m6558(jM8173)) {
            return C3693.m6556(jM8173);
        }
        if (!this.f15797) {
            i = AbstractC0671.m1493(jM8173, i);
        }
        return AbstractC0671.m1502(jM8173, interfaceC1827.mo3599(i));
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۦ۟ */
    public final int mo1557(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        long jM8173 = m8173(abstractC3625);
        if (C3693.m6549(jM8173)) {
            return C3693.m6551(jM8173);
        }
        if (!this.f15797) {
            i = AbstractC0671.m1502(jM8173, i);
        }
        return AbstractC0671.m1493(jM8173, interfaceC1827.mo3598(i));
    }
}
