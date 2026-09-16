package p000;

/* JADX INFO: renamed from: ۦٛؓؑۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4610 extends AbstractC5381 implements InterfaceC4933 {

    /* JADX INFO: renamed from: ۥً */
    public int f15222;

    /* JADX INFO: renamed from: ۦٚ */
    public boolean f15223;

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥً */
    public final int mo1554(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        return interfaceC1827.mo3596(i);
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5370 mo931(InterfaceC2427 interfaceC2427, InterfaceC1827 interfaceC1827, long j) {
        int iMo3600 = this.f15222 == 1 ? interfaceC1827.mo3600(C3693.m6551(j)) : interfaceC1827.mo3599(C3693.m6551(j));
        if (iMo3600 < 0) {
            iMo3600 = 0;
        }
        if (iMo3600 < 0) {
            AbstractC1236.m2609("width must be >= 0");
        }
        long jM1495 = AbstractC0671.m1495(iMo3600, iMo3600, 0, Integer.MAX_VALUE);
        if (this.f15223) {
            jM1495 = AbstractC0671.m1492(j, jM1495);
        }
        AbstractC0275 abstractC0275Mo3597 = interfaceC1827.mo3597(jM1495);
        return interfaceC2427.mo755(abstractC0275Mo3597.f985, abstractC0275Mo3597.f984, C0204.f751, new C2785(abstractC0275Mo3597, 3));
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥ۟ */
    public final int mo1555(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        return this.f15222 == 1 ? interfaceC1827.mo3600(i) : interfaceC1827.mo3599(i);
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۦۙ */
    public final int mo1556(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        return this.f15222 == 1 ? interfaceC1827.mo3600(i) : interfaceC1827.mo3599(i);
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۦ۟ */
    public final int mo1557(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        return interfaceC1827.mo3598(i);
    }
}
