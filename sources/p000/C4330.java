package p000;

/* JADX INFO: renamed from: ۦؚٖٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4330 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f14301;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f14302;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f14303;

    public C4330(long j, String str, long j2) {
        this.f14303 = str;
        this.f14302 = j;
        this.f14301 = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4330) {
            C4330 c4330 = (C4330) obj;
            if (this.f14303.equals(c4330.f14303) && this.f14302 == c4330.f14302 && this.f14301 == c4330.f14301) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f14303.hashCode() ^ 1000003) * 1000003;
        long j = this.f14302;
        long j2 = this.f14301;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f14303 + ", tokenExpirationTimestamp=" + this.f14302 + ", tokenCreationTimestamp=" + this.f14301 + "}";
    }
}
