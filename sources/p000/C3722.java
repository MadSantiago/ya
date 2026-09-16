package p000;

/* JADX INFO: renamed from: ۦٌٌؔٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C3722 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4448 f12397;

    public C3722(InterfaceC4448 interfaceC4448) {
        this.f12397 = interfaceC4448;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3722) {
            return this.f12397 == ((C3722) obj).f12397;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12397.hashCode();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        ((C1135) abstractC5381).f3969 = this.f12397;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        return new C1135(this.f12397);
    }
}
