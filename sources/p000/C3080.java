package p000;

/* JADX INFO: renamed from: ۦؚؒؑؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3080 implements InterfaceC4686 {

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC4686 f10340;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4686 f10341;

    public C3080(InterfaceC4686 interfaceC4686, InterfaceC4686 interfaceC4687) {
        this.f10341 = interfaceC4686;
        this.f10340 = interfaceC4687;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3080)) {
            return false;
        }
        C3080 c3080 = (C3080) obj;
        return AbstractC3831.m6874(c3080.f10341, this.f10341) && AbstractC3831.m6874(c3080.f10340, this.f10340);
    }

    public final int hashCode() {
        return (this.f10340.hashCode() * 31) + this.f10341.hashCode();
    }

    public final String toString() {
        return "(" + this.f10341 + " ∪ " + this.f10340 + ')';
    }

    @Override // p000.InterfaceC4686
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo1865(InterfaceC2880 interfaceC2880, EnumC2459 enumC2459) {
        return Math.max(this.f10341.mo1865(interfaceC2880, enumC2459), this.f10340.mo1865(interfaceC2880, enumC2459));
    }

    @Override // p000.InterfaceC4686
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo1868(InterfaceC2880 interfaceC2880) {
        return Math.max(this.f10341.mo1868(interfaceC2880), this.f10340.mo1868(interfaceC2880));
    }

    @Override // p000.InterfaceC4686
    /* JADX INFO: renamed from: ۥۣ */
    public final int mo1869(InterfaceC2880 interfaceC2880) {
        return Math.max(this.f10341.mo1869(interfaceC2880), this.f10340.mo1869(interfaceC2880));
    }

    @Override // p000.InterfaceC4686
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo1870(InterfaceC2880 interfaceC2880, EnumC2459 enumC2459) {
        return Math.max(this.f10341.mo1870(interfaceC2880, enumC2459), this.f10340.mo1870(interfaceC2880, enumC2459));
    }
}
