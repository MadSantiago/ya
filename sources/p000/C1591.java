package p000;

/* JADX INFO: renamed from: ۥ٘ؖؖؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1591 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C3018 f5347;

    public C1591(C3018 c3018) {
        this.f5347 = c3018;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1591) {
            return this.f5347 == ((C1591) obj).f5347;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5347.hashCode();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C4591 c4591 = (C4591) abstractC5381;
        c4591.f15148 = this.f5347;
        AbstractC0186.m412(c4591);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C4591 c4591 = new C4591();
        c4591.f15148 = this.f5347;
        return c4591;
    }
}
