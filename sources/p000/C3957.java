package p000;

/* JADX INFO: renamed from: ۦِؓٚٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3957 extends AbstractC5381 implements InterfaceC2269, InterfaceC3126 {

    /* JADX INFO: renamed from: ۥً */
    public C2567 f13229;

    /* JADX INFO: renamed from: ۦٚ */
    public boolean f13230;

    /* JADX INFO: renamed from: ۥؑ */
    public static final C2793 m7111(C3957 c3957, AbstractC1311 abstractC1311, C5304 c5304) {
        C2793 c2793;
        if (c3957.f17786 && c3957.f13230) {
            AbstractC1311 abstractC1311M9247 = AbstractC5537.m9247(c3957);
            if (!abstractC1311.mo2787().f17786) {
                abstractC1311 = null;
            }
            if (abstractC1311 != null && (c2793 = (C2793) c5304.mo449()) != null) {
                return c2793.m5323(abstractC1311M9247.mo2794(abstractC1311, false).m5322());
            }
        }
        return null;
    }

    @Override // p000.InterfaceC3126
    /* JADX INFO: renamed from: ۥْ */
    public final void mo5752(InterfaceC2015 interfaceC2015) {
        this.f13230 = true;
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦؘ */
    public final boolean mo786() {
        return false;
    }

    @Override // p000.InterfaceC2269
    /* JADX INFO: renamed from: ۦٞ */
    public final Object mo4320(AbstractC1311 abstractC1311, C5304 c5304, AbstractC0772 abstractC0772) {
        Object objM7173 = AbstractC4009.m7173(new C0120(this, abstractC1311, c5304, new C1597(this, abstractC1311, c5304, 3), null), abstractC0772);
        return objM7173 == EnumC2282.f7590 ? objM7173 : C2358.f7817;
    }
}
