package p000;

/* JADX INFO: renamed from: ۦَْؖؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C3350 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final String f11201;

    public C3350(String str) {
        this.f11201 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3350) && this.f11201.equals(((C3350) obj).f11201);
    }

    public final int hashCode() {
        return this.f11201.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.f11201) + ')';
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        ((C3363) abstractC5381).f11239 = this.f11201;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C3363 c3363 = new C3363();
        c3363.f11239 = this.f11201;
        return c3363;
    }
}
