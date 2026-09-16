package p000;

/* JADX INFO: renamed from: ۦٍۛؒۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C5222 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C0474 f17243;

    public C5222(C0474 c0474) {
        this.f17243 = c0474;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5222) && this.f17243 == ((C5222) obj).f17243;
    }

    public final int hashCode() {
        return this.f17243.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.f17243 + ')';
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C1825 c1825 = (C1825) abstractC5381;
        C0474 c0474 = c1825.f6060;
        C0474 c0475 = this.f17243;
        if (AbstractC3831.m6874(c0474, c0475) || !c1825.f17791.f17786) {
            return;
        }
        C0474 c0476 = c1825.f6060;
        c0476.m1025();
        c0476.f1725 = null;
        c1825.f6060 = c0475;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C1825 c1825 = new C1825();
        c1825.f6060 = this.f17243;
        return c1825;
    }
}
