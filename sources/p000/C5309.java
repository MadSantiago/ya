package p000;

/* JADX INFO: renamed from: ۦًؘۜ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C5309 extends AbstractC4702 implements InterfaceC4933 {

    /* JADX INFO: renamed from: ۥٕ */
    public InterfaceC4686 f17485;

    public C5309(InterfaceC4686 interfaceC4686) {
        this.f17485 = interfaceC4686;
    }

    @Override // p000.AbstractC4702
    /* JADX INFO: renamed from: ۥؑ */
    public final InterfaceC4686 mo2269(InterfaceC4686 interfaceC4686) {
        return new C3080(interfaceC4686, this.f17485);
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5370 mo931(InterfaceC2427 interfaceC2427, InterfaceC1827 interfaceC1827, long j) {
        int iMo1870 = this.f15511.mo1870(interfaceC2427, interfaceC2427.getLayoutDirection()) - this.f15510.mo1870(interfaceC2427, interfaceC2427.getLayoutDirection());
        int iMo1868 = this.f15511.mo1868(interfaceC2427) - this.f15510.mo1868(interfaceC2427);
        int iMo1865 = (this.f15511.mo1865(interfaceC2427, interfaceC2427.getLayoutDirection()) - this.f15510.mo1865(interfaceC2427, interfaceC2427.getLayoutDirection())) + iMo1870;
        int iMo1869 = (this.f15511.mo1869(interfaceC2427) - this.f15510.mo1869(interfaceC2427)) + iMo1868;
        AbstractC0275 abstractC0275Mo3597 = interfaceC1827.mo3597(AbstractC0671.m1500(-iMo1865, -iMo1869, j));
        return interfaceC2427.mo755(AbstractC0671.m1502(j, abstractC0275Mo3597.f985 + iMo1865), AbstractC0671.m1493(j, abstractC0275Mo3597.f984 + iMo1869), C0204.f751, new C2514(abstractC0275Mo3597, iMo1870, iMo1868, 0));
    }

    @Override // p000.AbstractC4702
    /* JADX INFO: renamed from: ۥٜ */
    public final void mo8045() {
        super.mo8045();
        C5063.m8642(this);
    }
}
