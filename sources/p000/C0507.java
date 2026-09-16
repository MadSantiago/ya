package p000;

/* JADX INFO: renamed from: ۥٌؖؑؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0507 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C0823 f1827;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2393 f1828;

    public C0507() {
        this(null, new C0823());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0507)) {
            return false;
        }
        C0507 c0507 = (C0507) obj;
        return AbstractC3831.m6874(this.f1827, c0507.f1827) && AbstractC3831.m6874(this.f1828, c0507.f1828);
    }

    public final int hashCode() {
        C2393 c2393 = this.f1828;
        int iHashCode = (c2393 != null ? c2393.hashCode() : 0) * 31;
        C0823 c0823 = this.f1827;
        return iHashCode + (c0823 != null ? c0823.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f1828 + ", paragraphSyle=" + this.f1827 + ')';
    }

    public C0507(C2393 c2393, C0823 c0823) {
        this.f1828 = c2393;
        this.f1827 = c0823;
    }
}
