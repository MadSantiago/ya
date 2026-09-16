package p000;

/* JADX INFO: renamed from: ۦٔؕ٘ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C4182 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final int f13915;

    public C4182(int i) {
        this.f13915 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4182) {
            return this.f13915 == ((C4182) obj).f13915;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + (AbstractC3761.m6632(this.f13915) * 31);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C5401 c5401 = (C5401) abstractC5381;
        c5401.f17842 = this.f13915;
        c5401.f17843 = 1.0f;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C5401 c5401 = new C5401();
        c5401.f17842 = this.f13915;
        c5401.f17843 = 1.0f;
        return c5401;
    }
}
