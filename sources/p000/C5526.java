package p000;

import java.util.Set;

/* JADX INFO: renamed from: ۦۢؓۨؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5526 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Set f18243;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f18244;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f18245;

    public C5526(long j, long j2, Set set) {
        this.f18245 = j;
        this.f18244 = j2;
        this.f18243 = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5526) {
            C5526 c5526 = (C5526) obj;
            if (this.f18245 == c5526.f18245 && this.f18244 == c5526.f18244 && this.f18243.equals(c5526.f18243)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f18245;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.f18244;
        return this.f18243.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f18245 + ", maxAllowedDelay=" + this.f18244 + ", flags=" + this.f18243 + "}";
    }
}
