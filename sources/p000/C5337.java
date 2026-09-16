package p000;

/* JADX INFO: renamed from: ۦ۟ؓۜؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5337 implements InterfaceC4686 {

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC4686 f17593;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4686 f17594;

    public C5337(InterfaceC4686 interfaceC4686, InterfaceC4686 interfaceC4687) {
        this.f17594 = interfaceC4686;
        this.f17593 = interfaceC4687;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5337)) {
            return false;
        }
        C5337 c5337 = (C5337) obj;
        return AbstractC3831.m6874(c5337.f17594, this.f17594) && AbstractC3831.m6874(c5337.f17593, this.f17593);
    }

    public final int hashCode() {
        return this.f17593.hashCode() + (this.f17594.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f17594 + " - " + this.f17593 + ')';
    }

    @Override // p000.InterfaceC4686
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo1865(InterfaceC2880 interfaceC2880, EnumC2459 enumC2459) {
        int iMo1865 = this.f17594.mo1865(interfaceC2880, enumC2459) - this.f17593.mo1865(interfaceC2880, enumC2459);
        if (iMo1865 < 0) {
            return 0;
        }
        return iMo1865;
    }

    @Override // p000.InterfaceC4686
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo1868(InterfaceC2880 interfaceC2880) {
        int iMo1868 = this.f17594.mo1868(interfaceC2880) - this.f17593.mo1868(interfaceC2880);
        if (iMo1868 < 0) {
            return 0;
        }
        return iMo1868;
    }

    @Override // p000.InterfaceC4686
    /* JADX INFO: renamed from: ۥۣ */
    public final int mo1869(InterfaceC2880 interfaceC2880) {
        int iMo1869 = this.f17594.mo1869(interfaceC2880) - this.f17593.mo1869(interfaceC2880);
        if (iMo1869 < 0) {
            return 0;
        }
        return iMo1869;
    }

    @Override // p000.InterfaceC4686
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo1870(InterfaceC2880 interfaceC2880, EnumC2459 enumC2459) {
        int iMo1870 = this.f17594.mo1870(interfaceC2880, enumC2459) - this.f17593.mo1870(interfaceC2880, enumC2459);
        if (iMo1870 < 0) {
            return 0;
        }
        return iMo1870;
    }
}
