package p000;

/* JADX INFO: renamed from: ۥۥؖٛ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2760 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f9139;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f9140;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f9141;

    public C2760(long j, long j2, long j3) {
        this.f9141 = j;
        this.f9140 = j2;
        this.f9139 = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2760) {
            C2760 c2760 = (C2760) obj;
            if (this.f9141 == c2760.f9141 && this.f9140 == c2760.f9140 && this.f9139 == c2760.f9139) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f9141;
        long j2 = this.f9140;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f9139;
        return ((int) ((j3 >>> 32) ^ j3)) ^ i;
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.f9141 + ", elapsedRealtime=" + this.f9140 + ", uptimeMillis=" + this.f9139 + "}";
    }
}
