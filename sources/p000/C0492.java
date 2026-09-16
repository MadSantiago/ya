package p000;

/* JADX INFO: renamed from: ۥًؕۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0492 implements InterfaceC1291 {

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC2880 f1785;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4686 f1786;

    public C0492(InterfaceC4686 interfaceC4686, InterfaceC2880 interfaceC2880) {
        this.f1786 = interfaceC4686;
        this.f1785 = interfaceC2880;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0492)) {
            return false;
        }
        C0492 c0492 = (C0492) obj;
        return AbstractC3831.m6874(this.f1786, c0492.f1786) && AbstractC3831.m6874(this.f1785, c0492.f1785);
    }

    public final int hashCode() {
        return this.f1785.hashCode() + (this.f1786.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f1786 + ", density=" + this.f1785 + ')';
    }

    @Override // p000.InterfaceC1291
    /* JADX INFO: renamed from: ۥؗ */
    public final float mo1100() {
        InterfaceC4686 interfaceC4686 = this.f1786;
        InterfaceC2880 interfaceC2880 = this.f1785;
        return interfaceC2880.mo756(interfaceC4686.mo1869(interfaceC2880));
    }

    @Override // p000.InterfaceC1291
    /* JADX INFO: renamed from: ۥۗ */
    public final float mo1101(EnumC2459 enumC2459) {
        InterfaceC4686 interfaceC4686 = this.f1786;
        InterfaceC2880 interfaceC2880 = this.f1785;
        return interfaceC2880.mo756(interfaceC4686.mo1865(interfaceC2880, enumC2459));
    }

    @Override // p000.InterfaceC1291
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo1102(EnumC2459 enumC2459) {
        InterfaceC4686 interfaceC4686 = this.f1786;
        InterfaceC2880 interfaceC2880 = this.f1785;
        return interfaceC2880.mo756(interfaceC4686.mo1870(interfaceC2880, enumC2459));
    }

    @Override // p000.InterfaceC1291
    /* JADX INFO: renamed from: ۦؑ */
    public final float mo1103() {
        InterfaceC4686 interfaceC4686 = this.f1786;
        InterfaceC2880 interfaceC2880 = this.f1785;
        return interfaceC2880.mo756(interfaceC4686.mo1868(interfaceC2880));
    }
}
