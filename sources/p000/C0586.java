package p000;

/* JADX INFO: renamed from: ۥًؗؒؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0586 extends AbstractC5752 {

    /* JADX INFO: renamed from: ۥَ */
    public final C1574 f2189;

    public C0586(C1574 c1574) {
        this.f2189 = c1574;
    }

    @Override // p000.AbstractC5752
    /* JADX INFO: renamed from: ۦؚ */
    public final boolean mo922() {
        return false;
    }

    @Override // p000.AbstractC5752
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo923(Throwable th) {
        AbstractC0386 abstractC0386 = this.f18969;
        if (abstractC0386 == null) {
            abstractC0386 = null;
        }
        Object objM890 = abstractC0386.m890();
        boolean z = objM890 instanceof C5036;
        C1574 c1574 = this.f2189;
        if (z) {
            c1574.mo335(new C4535(((C5036) objM890).f16702));
        } else {
            c1574.mo335(AbstractC5378.m9033(objM890));
        }
    }
}
