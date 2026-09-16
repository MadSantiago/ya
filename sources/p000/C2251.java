package p000;

/* JADX INFO: renamed from: ۥۚؑۘۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C2251 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC4745 f7467;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4745 f7468;

    public C2251(InterfaceC4745 interfaceC4745, InterfaceC4745 interfaceC4746) {
        this.f7468 = interfaceC4745;
        this.f7467 = interfaceC4746;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2251)) {
            return false;
        }
        C2251 c2251 = (C2251) obj;
        return this.f7468 == c2251.f7468 && this.f7467 == c2251.f7467;
    }

    public final int hashCode() {
        InterfaceC4745 interfaceC4745 = this.f7468;
        int iHashCode = (interfaceC4745 != null ? interfaceC4745.hashCode() : 0) * 31;
        InterfaceC4745 interfaceC4746 = this.f7467;
        return iHashCode + (interfaceC4746 != null ? interfaceC4746.hashCode() : 0);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C1014 c1014 = (C1014) abstractC5381;
        c1014.f3601 = this.f7468;
        c1014.f3602 = this.f7467;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C1014 c1014 = new C1014();
        c1014.f3601 = this.f7468;
        c1014.f3602 = this.f7467;
        return c1014;
    }
}
