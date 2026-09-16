package p000;

/* JADX INFO: renamed from: ۦ۠ؔۥٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5401 extends AbstractC5381 implements InterfaceC4933 {

    /* JADX INFO: renamed from: ۥً */
    public int f17842;

    /* JADX INFO: renamed from: ۦٚ */
    public float f17843;

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5370 mo931(InterfaceC2427 interfaceC2427, InterfaceC1827 interfaceC1827, long j) {
        int iM6557;
        int iM6556;
        int iM6551;
        int i;
        if (!C3693.m6548(j) || this.f17842 == 1) {
            iM6557 = C3693.m6557(j);
            iM6556 = C3693.m6556(j);
        } else {
            int iRound = Math.round(C3693.m6556(j) * this.f17843);
            int iM6558 = C3693.m6557(j);
            iM6557 = C3693.m6556(j);
            if (iRound < iM6558) {
                iRound = iM6558;
            }
            if (iRound <= iM6557) {
                iM6557 = iRound;
            }
            iM6556 = iM6557;
        }
        if (!C3693.m6553(j) || this.f17842 == 2) {
            int iM6555 = C3693.m6555(j);
            int iM6552 = C3693.m6551(j);
            iM6551 = iM6555;
            i = iM6552;
        } else {
            int iRound2 = Math.round(C3693.m6551(j) * this.f17843);
            int iM6559 = C3693.m6555(j);
            iM6551 = C3693.m6551(j);
            if (iRound2 < iM6559) {
                iRound2 = iM6559;
            }
            if (iRound2 <= iM6551) {
                iM6551 = iRound2;
            }
            i = iM6551;
        }
        AbstractC0275 abstractC0275Mo3597 = interfaceC1827.mo3597(AbstractC0671.m1496(iM6557, iM6556, iM6551, i));
        return interfaceC2427.mo755(abstractC0275Mo3597.f985, abstractC0275Mo3597.f984, C0204.f751, new C2785(abstractC0275Mo3597, 1));
    }
}
