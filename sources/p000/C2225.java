package p000;

/* JADX INFO: renamed from: ۥؚٕۙؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C2225 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C3985 f7366;

    public C2225(C3985 c3985) {
        this.f7366 = c3985;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2225) && AbstractC3831.m6874(this.f7366, ((C2225) obj).f7366);
    }

    public final int hashCode() {
        return this.f7366.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f7366 + ')';
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C2008 c2008 = (C2008) abstractC5381;
        c2008.f6623.f13308.m1848(c2008);
        C3985 c3985 = this.f7366;
        c2008.f6623 = c3985;
        c3985.f13308.m1843(c2008);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C2008 c2008 = new C2008();
        c2008.f6623 = this.f7366;
        return c2008;
    }
}
