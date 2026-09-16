package p000;

/* JADX INFO: renamed from: ۥؚٕؕٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C0785 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC2609 f2832;

    public C0785(InterfaceC2609 interfaceC2609) {
        this.f2832 = interfaceC2609;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0785) {
            return this.f2832 == ((C0785) obj).f2832;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2832.hashCode();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        ((C1378) abstractC5381).f4724 = this.f2832;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C1378 c1378 = new C1378();
        c1378.f4724 = this.f2832;
        return c1378;
    }
}
