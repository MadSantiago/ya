package p000;

/* JADX INFO: renamed from: ۦٕٔؗٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4201 extends AbstractC5381 implements InterfaceC4933, InterfaceC5671 {

    /* JADX INFO: renamed from: ۥً */
    public InterfaceC4745 f13959;

    public C4201(InterfaceC4745 interfaceC4745) {
        this.f13959 = interfaceC4745;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f13959 + ')';
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5370 mo931(InterfaceC2427 interfaceC2427, InterfaceC1827 interfaceC1827, long j) {
        AbstractC0275 abstractC0275Mo3597 = interfaceC1827.mo3597(j);
        return interfaceC2427.mo755(abstractC0275Mo3597.f985, abstractC0275Mo3597.f984, C0204.f751, new C5544(6, abstractC0275Mo3597, this));
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦؘ */
    public final boolean mo786() {
        return false;
    }

    @Override // p000.InterfaceC5671
    /* JADX INFO: renamed from: ۦِ */
    public final boolean mo4044() {
        return false;
    }

    @Override // p000.InterfaceC5671
    /* JADX INFO: renamed from: ۦٟ */
    public final void mo790(InterfaceC1066 interfaceC1066) {
        InterfaceC2864 interfaceC2864;
        boolean z;
        AbstractC1311 abstractC1311M9245 = AbstractC5537.m9245(this, 2);
        if (abstractC1311M9245.f4517) {
            interfaceC2864 = abstractC1311M9245.f4521;
            z = abstractC1311M9245.f4524;
        } else {
            C1117 c1117 = AbstractC4554.f15047;
            if (c1117 == null) {
                AbstractC4554.f15047 = new C1117();
            } else {
                c1117.m2341();
            }
            C1117 c1118 = AbstractC4554.f15047;
            c1118.f3915 = abstractC1311M9245.f4513.f2236;
            c1118.f3916 = AbstractC5537.m9235(abstractC1311M9245.f982);
            AbstractC3191 abstractC3191M7473 = AbstractC4225.m7473();
            InterfaceC4745 interfaceC4745Mo4945 = abstractC3191M7473 != null ? abstractC3191M7473.mo4945() : null;
            AbstractC3191 abstractC3191M7452 = AbstractC4225.m7452(abstractC3191M7473);
            try {
                this.f13959.mo211(c1118);
                AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
                interfaceC2864 = c1118.f3925;
                z = c1118.f3922;
            } catch (Throwable th) {
                AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
                throw th;
            }
        }
        if (z) {
            AbstractC3992.m7131(interfaceC1066, interfaceC2864);
        }
    }
}
