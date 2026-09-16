package p000;

/* JADX INFO: renamed from: ۦۦٌؖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C5776 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4745 f19032;

    public C5776(InterfaceC4745 interfaceC4745) {
        this.f19032 = interfaceC4745;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5776) {
            return this.f19032 == ((C5776) obj).f19032;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19032.hashCode();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        ((C3056) abstractC5381).f10290 = this.f19032;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C3056 c3056 = new C3056();
        c3056.f10290 = this.f19032;
        return c3056;
    }
}
