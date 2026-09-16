package p000;

/* JADX INFO: renamed from: ۦ۠ؖۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C5414 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C3039 f17870;

    public C5414(C3039 c3039) {
        this.f17870 = c3039;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C5414 c5414 = obj instanceof C5414 ? (C5414) obj : null;
        return c5414 != null && this.f17870.equals(c5414.f17870);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f17870.hashCode() * 31);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        ((C1465) abstractC5381).f4980 = this.f17870;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C1465 c1465 = new C1465();
        c1465.f4980 = this.f17870;
        return c1465;
    }
}
