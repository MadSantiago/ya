package p000;

/* JADX INFO: renamed from: ۦَٝؑؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C4721 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f15583;

    /* JADX INFO: renamed from: ۥُ */
    public final C2243 f15584;

    /* JADX INFO: renamed from: ۥّ */
    public final InterfaceC3762 f15585;

    /* JADX INFO: renamed from: ۥۗ */
    public final EnumC1616 f15586;

    /* JADX INFO: renamed from: ۥۜ */
    public final C2851 f15587;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC3096 f15588;

    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC0738 f15589;

    /* JADX INFO: renamed from: ۦۙ */
    public final boolean f15590;

    public C4721(C2851 c2851, InterfaceC3762 interfaceC3762, InterfaceC0738 interfaceC0738, C2243 c2243, EnumC1616 enumC1616, InterfaceC3096 interfaceC3096, boolean z, boolean z2) {
        this.f15588 = interfaceC3096;
        this.f15586 = enumC1616;
        this.f15583 = z;
        this.f15589 = interfaceC0738;
        this.f15584 = c2243;
        this.f15585 = interfaceC3762;
        this.f15590 = z2;
        this.f15587 = c2851;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4721.class != obj.getClass()) {
            return false;
        }
        C4721 c4721 = (C4721) obj;
        return this.f15588.equals(c4721.f15588) && this.f15586 == c4721.f15586 && this.f15583 == c4721.f15583 && AbstractC3831.m6874(this.f15589, c4721.f15589) && AbstractC3831.m6874(this.f15584, c4721.f15584) && AbstractC3831.m6874(this.f15585, c4721.f15585) && this.f15590 == c4721.f15590 && AbstractC3831.m6874(this.f15587, c4721.f15587);
    }

    public final int hashCode() {
        int iM8672 = AbstractC5078.m8672(AbstractC5078.m8672((this.f15586.hashCode() + (this.f15588.hashCode() * 31)) * 31, 31, this.f15583), 31, false);
        InterfaceC0738 interfaceC0738 = this.f15589;
        int iHashCode = (iM8672 + (interfaceC0738 != null ? interfaceC0738.hashCode() : 0)) * 31;
        C2243 c2243 = this.f15584;
        int iHashCode2 = (iHashCode + (c2243 != null ? c2243.hashCode() : 0)) * 31;
        InterfaceC3762 interfaceC3762 = this.f15585;
        int iM8673 = AbstractC5078.m8672((iHashCode2 + (interfaceC3762 != null ? interfaceC3762.hashCode() : 0)) * 31, 31, this.f15590);
        C2851 c2851 = this.f15587;
        return iM8673 + (c2851 != null ? c2851.hashCode() : 0);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C2243 c2243 = this.f15584;
        ((C4830) abstractC5381).m8202(this.f15587, this.f15585, this.f15589, c2243, this.f15586, this.f15588, this.f15590, this.f15583);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C4830 c4830 = new C4830();
        c4830.f15907 = this.f15588;
        c4830.f15910 = this.f15586;
        c4830.f15914 = this.f15583;
        c4830.f15912 = this.f15589;
        c4830.f15911 = this.f15584;
        c4830.f15913 = this.f15585;
        c4830.f15915 = this.f15590;
        c4830.f15916 = this.f15587;
        return c4830;
    }
}
