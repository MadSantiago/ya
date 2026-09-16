package p000;

/* JADX INFO: renamed from: ۥّۢؑ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2595 extends AbstractC5381 implements InterfaceC4933 {

    /* JADX INFO: renamed from: ۥً */
    public float f8675;

    /* JADX INFO: renamed from: ۦٚ */
    public float f8676;

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥً */
    public final int mo1554(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        int iMo3596 = interfaceC1827.mo3596(i);
        int iMo743 = !Float.isNaN(this.f8676) ? abstractC3625.mo743(this.f8676) : 0;
        return iMo3596 < iMo743 ? iMo743 : iMo3596;
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5370 mo931(InterfaceC2427 interfaceC2427, InterfaceC1827 interfaceC1827, long j) {
        int iM6557;
        int iM6555;
        if (Float.isNaN(this.f8675) || C3693.m6557(j) != 0) {
            iM6557 = C3693.m6557(j);
        } else {
            int iMo743 = interfaceC2427.mo743(this.f8675);
            iM6557 = C3693.m6556(j);
            if (iMo743 < 0) {
                iMo743 = 0;
            }
            if (iMo743 <= iM6557) {
                iM6557 = iMo743;
            }
        }
        int iM6556 = C3693.m6556(j);
        if (Float.isNaN(this.f8676) || C3693.m6555(j) != 0) {
            iM6555 = C3693.m6555(j);
        } else {
            int iMo744 = interfaceC2427.mo743(this.f8676);
            iM6555 = C3693.m6551(j);
            int i = iMo744 >= 0 ? iMo744 : 0;
            if (i <= iM6555) {
                iM6555 = i;
            }
        }
        AbstractC0275 abstractC0275Mo3597 = interfaceC1827.mo3597(AbstractC0671.m1496(iM6557, iM6556, iM6555, C3693.m6551(j)));
        return interfaceC2427.mo755(abstractC0275Mo3597.f985, abstractC0275Mo3597.f984, C0204.f751, new C2785(abstractC0275Mo3597, 10));
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥ۟ */
    public final int mo1555(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        int iMo3600 = interfaceC1827.mo3600(i);
        int iMo743 = !Float.isNaN(this.f8675) ? abstractC3625.mo743(this.f8675) : 0;
        return iMo3600 < iMo743 ? iMo743 : iMo3600;
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۦۙ */
    public final int mo1556(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        int iMo3599 = interfaceC1827.mo3599(i);
        int iMo743 = !Float.isNaN(this.f8675) ? abstractC3625.mo743(this.f8675) : 0;
        return iMo3599 < iMo743 ? iMo743 : iMo3599;
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۦ۟ */
    public final int mo1557(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        int iMo3598 = interfaceC1827.mo3598(i);
        int iMo743 = !Float.isNaN(this.f8676) ? abstractC3625.mo743(this.f8676) : 0;
        return iMo3598 < iMo743 ? iMo743 : iMo3598;
    }
}
