package p000;

/* JADX INFO: renamed from: ۦؕؓۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C3274 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4745 f10987;

    public C3274(InterfaceC4745 interfaceC4745) {
        this.f10987 = interfaceC4745;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3274) {
            return this.f10987 == ((C3274) obj).f10987;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10987.hashCode();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        ((C3505) abstractC5381).f11616 = this.f10987;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C3505 c3505 = new C3505();
        c3505.f11616 = this.f10987;
        return c3505;
    }
}
