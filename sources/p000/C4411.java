package p000;

/* JADX INFO: renamed from: ۦُ٘ؒؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C4411 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4745 f14523;

    public C4411(InterfaceC4745 interfaceC4745) {
        this.f14523 = interfaceC4745;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4411) {
            return this.f14523 == ((C4411) obj).f14523;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14523.hashCode();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        ((C4487) abstractC5381).f14827 = this.f14523;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C4487 c4487 = new C4487();
        c4487.f14827 = this.f14523;
        return c4487;
    }
}
