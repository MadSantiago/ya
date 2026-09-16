package p000;

/* JADX INFO: renamed from: ۦٙ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0078 {

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC0400 f14720;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f14721;

    public C0078(String str, InterfaceC0400 interfaceC0400) {
        this.f14721 = str;
        this.f14720 = interfaceC0400;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0078)) {
            return false;
        }
        C0078 c0078 = (C0078) obj;
        return AbstractC3831.m6874(this.f14721, c0078.f14721) && AbstractC3831.m6874(this.f14720, c0078.f14720);
    }

    public final int hashCode() {
        String str = this.f14721;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC0400 interfaceC0400 = this.f14720;
        return iHashCode + (interfaceC0400 != null ? interfaceC0400.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f14721 + ", action=" + this.f14720 + ')';
    }
}
