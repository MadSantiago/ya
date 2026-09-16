package p000;

/* JADX INFO: renamed from: ۥِۜٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C1136 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C4762 f3972;

    public C1136(C4762 c4762) {
        this.f3972 = c4762;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1136) {
            return this.f3972 == ((C1136) obj).f3972;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3972.hashCode();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        ((C2179) abstractC5381).f7205 = this.f3972;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C2179 c2179 = new C2179();
        c2179.f7205 = this.f3972;
        C0091 c0091 = new C0091(2, c2179);
        C2333 c2333 = new C2333();
        c2333.f7722 = c0091;
        c2179.m5603(c2333);
        return c2179;
    }
}
