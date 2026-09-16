package p000;

/* JADX INFO: renamed from: ۥٜؖؓؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0528 {

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC4507 f1865;

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC1665 f1866;

    public C0528(InterfaceC4507 interfaceC4507, AbstractC1665 abstractC1665) {
        this.f1866 = abstractC1665;
        this.f1865 = interfaceC4507;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0528)) {
            return false;
        }
        C0528 c0528 = (C0528) obj;
        return AbstractC3831.m6874(this.f1866, c0528.f1866) && AbstractC3831.m6874(this.f1865, c0528.f1865);
    }

    public final int hashCode() {
        int iHashCode = this.f1866.hashCode() * 31;
        InterfaceC4507 interfaceC4507 = this.f1865;
        return iHashCode + (interfaceC4507 == null ? 0 : interfaceC4507.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f1866 + ", owner=" + this.f1865 + ')';
    }
}
