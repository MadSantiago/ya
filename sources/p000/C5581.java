package p000;

/* JADX INFO: renamed from: ۦۣؒؓۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C5581 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C3592 f18408;

    public C5581(C3592 c3592) {
        this.f18408 = c3592;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5581) {
            return this.f18408 == ((C5581) obj).f18408;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18408.hashCode();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        ((C5097) abstractC5381).f16892 = this.f18408;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        return new C5097(this.f18408);
    }
}
