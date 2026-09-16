package p000;

/* JADX INFO: renamed from: ۦّٟ۟ؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5328 extends AbstractC5381 implements InterfaceC4933 {

    /* JADX INFO: renamed from: ۥً */
    public InterfaceC1291 f17588;

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5370 mo931(InterfaceC2427 interfaceC2427, InterfaceC1827 interfaceC1827, long j) {
        float fMo1102 = this.f17588.mo1102(interfaceC2427.getLayoutDirection());
        float fMo1103 = this.f17588.mo1103();
        float fMo1101 = this.f17588.mo1101(interfaceC2427.getLayoutDirection());
        float fMo1100 = this.f17588.mo1100();
        if (!((C4497.m7827(fMo1102, 0.0f) >= 0) & (C4497.m7827(fMo1103, 0.0f) >= 0) & (C4497.m7827(fMo1101, 0.0f) >= 0) & (C4497.m7827(fMo1100, 0.0f) >= 0))) {
            AbstractC5233.m8862("Padding must be non-negative");
        }
        int iMo743 = interfaceC2427.mo743(fMo1102);
        int iMo744 = interfaceC2427.mo743(fMo1101) + iMo743;
        int iMo745 = interfaceC2427.mo743(fMo1103);
        int iMo746 = interfaceC2427.mo743(fMo1100) + iMo745;
        AbstractC0275 abstractC0275Mo3597 = interfaceC1827.mo3597(AbstractC0671.m1500(-iMo744, -iMo746, j));
        return interfaceC2427.mo755(AbstractC0671.m1502(j, abstractC0275Mo3597.f985 + iMo744), AbstractC0671.m1493(j, abstractC0275Mo3597.f984 + iMo746), C0204.f751, new C2514(abstractC0275Mo3597, iMo743, iMo745, 2));
    }
}
