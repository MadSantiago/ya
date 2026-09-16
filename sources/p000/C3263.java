package p000;

/* JADX INFO: renamed from: ۦؕؒۜؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3263 {

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC4120 f10950;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1249 f10951;

    public C3263(C1249 c1249, InterfaceC4120 interfaceC4120) {
        this.f10951 = c1249;
        this.f10950 = interfaceC4120;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3263)) {
            return false;
        }
        C3263 c3263 = (C3263) obj;
        return AbstractC3831.m6874(this.f10951, c3263.f10951) && this.f10950.equals(c3263.f10950);
    }

    public final int hashCode() {
        return this.f10950.hashCode() + (this.f10951.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f10951) + ", offsetMapping=" + this.f10950 + ')';
    }
}
