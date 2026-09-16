package p000;

/* JADX INFO: renamed from: ۦؗؕٛٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C3427 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C2750 f11391;

    public C3427(C2750 c2750) {
        this.f11391 = c2750;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3427) && AbstractC3831.m6874(this.f11391, ((C3427) obj).f11391);
    }

    public final int hashCode() {
        return this.f11391.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f11391 + ')';
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        ((C3890) abstractC5381).f13004 = this.f11391;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C3890 c3890 = new C3890();
        c3890.f13004 = this.f11391;
        return c3890;
    }
}
