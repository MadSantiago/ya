package p000;

/* JADX INFO: renamed from: ۥُٕٖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C1433 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4745 f4913;

    public C1433(InterfaceC4745 interfaceC4745) {
        this.f4913 = interfaceC4745;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1433) {
            return this.f4913 == ((C1433) obj).f4913;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4913.hashCode();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        ((C1305) abstractC5381).f4487 = this.f4913;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C1305 c1305 = new C1305();
        c1305.f4487 = this.f4913;
        return c1305;
    }
}
