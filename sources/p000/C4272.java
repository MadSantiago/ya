package p000;

/* JADX INFO: renamed from: ۦْٕۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C4272 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4745 f14154;

    public C4272(InterfaceC4745 interfaceC4745) {
        this.f14154 = interfaceC4745;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4272) {
            return this.f14154 == ((C4272) obj).f14154;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14154.hashCode();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C3852 c3852 = (C3852) abstractC5381;
        c3852.f12872 = this.f14154;
        c3852.m6890();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        return new C3852(new C5665(), this.f14154);
    }
}
