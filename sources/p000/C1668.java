package p000;

/* JADX INFO: renamed from: ۥٙؕ۟ٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1668 extends AbstractC3554 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f5560;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f5561;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f5562;

    public C1668(long j, String str, String str2) {
        this.f5562 = str;
        this.f5561 = str2;
        this.f5560 = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3554) {
            C1668 c1668 = (C1668) ((AbstractC3554) obj);
            if (this.f5562.equals(c1668.f5562) && this.f5561.equals(c1668.f5561) && this.f5560 == c1668.f5560) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f5562.hashCode() ^ 1000003) * 1000003) ^ this.f5561.hashCode()) * 1000003;
        long j = this.f5560;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        return "Signal{name=" + this.f5562 + ", code=" + this.f5561 + ", address=" + this.f5560 + "}";
    }
}
