package p000;

/* JADX INFO: renamed from: ۥۣۤؔۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C2676 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C5627 f8861;

    /* JADX INFO: renamed from: ۥُ */
    public final C1808 f8862;

    /* JADX INFO: renamed from: ۥّ */
    public final C5521 f8863;

    /* JADX INFO: renamed from: ۥۗ */
    public final C5627 f8864;

    /* JADX INFO: renamed from: ۥۜ */
    public final C3106 f8865;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0777 f8866;

    /* JADX INFO: renamed from: ۦؑ */
    public final C5627 f8867;

    /* JADX INFO: renamed from: ۦۙ */
    public final InterfaceC4448 f8868;

    public C2676(C0777 c0777, C5627 c5627, C5627 c5628, C5627 c5629, C1808 c1808, C5521 c5521, InterfaceC4448 interfaceC4448, C3106 c3106) {
        this.f8866 = c0777;
        this.f8864 = c5627;
        this.f8861 = c5628;
        this.f8867 = c5629;
        this.f8862 = c1808;
        this.f8863 = c5521;
        this.f8868 = interfaceC4448;
        this.f8865 = c3106;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2676)) {
            return false;
        }
        C2676 c2676 = (C2676) obj;
        return c2676.f8866 == this.f8866 && AbstractC3831.m6874(c2676.f8864, this.f8864) && AbstractC3831.m6874(c2676.f8861, this.f8861) && AbstractC3831.m6874(c2676.f8867, this.f8867) && c2676.f8862.equals(this.f8862) && c2676.f8863.equals(this.f8863) && c2676.f8868 == this.f8868 && AbstractC3831.m6874(c2676.f8865, this.f8865);
    }

    public final int hashCode() {
        int iHashCode = this.f8866.hashCode() * 31;
        C5627 c5627 = this.f8864;
        int iHashCode2 = (iHashCode + (c5627 != null ? c5627.hashCode() : 0)) * 31;
        C5627 c5628 = this.f8861;
        int iHashCode3 = (iHashCode2 + (c5628 != null ? c5628.hashCode() : 0)) * 31;
        C5627 c5629 = this.f8867;
        return this.f8865.hashCode() + ((this.f8868.hashCode() + ((this.f8863.f18231.hashCode() + ((this.f8862.f6021.hashCode() + ((iHashCode3 + (c5629 != null ? c5629.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C2951 c2951 = (C2951) abstractC5381;
        c2951.f9897 = this.f8866;
        c2951.f9906 = this.f8864;
        c2951.f9898 = this.f8861;
        c2951.f9899 = this.f8867;
        c2951.f9903 = this.f8862;
        c2951.f9901 = this.f8863;
        c2951.f9900 = this.f8868;
        c2951.f9902 = this.f8865;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        return new C2951(this.f8866, this.f8864, this.f8861, this.f8867, this.f8862, this.f8863, this.f8868, this.f8865);
    }
}
