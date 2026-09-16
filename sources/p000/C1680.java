package p000;

/* JADX INFO: renamed from: ۥٍٙؖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C1680 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f5593;

    /* JADX INFO: renamed from: ۥُ */
    public final String f5594;

    /* JADX INFO: renamed from: ۥّ */
    public final C2155 f5595;

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC3016 f5596;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2243 f5597;

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean f5598;

    /* JADX INFO: renamed from: ۦۙ */
    public final InterfaceC4448 f5599;

    public C1680(C2243 c2243, InterfaceC3016 interfaceC3016, boolean z, boolean z2, String str, C2155 c2155, InterfaceC4448 interfaceC4448) {
        this.f5597 = c2243;
        this.f5596 = interfaceC3016;
        this.f5593 = z;
        this.f5598 = z2;
        this.f5594 = str;
        this.f5595 = c2155;
        this.f5599 = interfaceC4448;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1680.class != obj.getClass()) {
            return false;
        }
        C1680 c1680 = (C1680) obj;
        return AbstractC3831.m6874(this.f5597, c1680.f5597) && AbstractC3831.m6874(this.f5596, c1680.f5596) && this.f5593 == c1680.f5593 && this.f5598 == c1680.f5598 && AbstractC3831.m6874(this.f5594, c1680.f5594) && AbstractC3831.m6874(this.f5595, c1680.f5595) && this.f5599 == c1680.f5599;
    }

    public final int hashCode() {
        C2243 c2243 = this.f5597;
        int iHashCode = (c2243 != null ? c2243.hashCode() : 0) * 31;
        InterfaceC3016 interfaceC3016 = this.f5596;
        int iM8672 = AbstractC5078.m8672(AbstractC5078.m8672((iHashCode + (interfaceC3016 != null ? interfaceC3016.hashCode() : 0)) * 31, 31, this.f5593), 31, this.f5598);
        String str = this.f5594;
        int iHashCode2 = (iM8672 + (str != null ? str.hashCode() : 0)) * 31;
        C2155 c2155 = this.f5595;
        return this.f5599.hashCode() + ((iHashCode2 + (c2155 != null ? Integer.hashCode(c2155.f7116) : 0)) * 31);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        ((C2019) abstractC5381).m9754(this.f5597, this.f5596, this.f5593, this.f5598, this.f5594, this.f5595, this.f5599);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        return new C2019(this.f5597, this.f5596, this.f5593, this.f5598, this.f5594, this.f5595, this.f5599);
    }
}
