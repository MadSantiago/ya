package p000;

/* JADX INFO: renamed from: ۦٕٗؖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4376 extends AbstractC1243 {

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f14420;

    /* JADX INFO: renamed from: ۥُ */
    public final long f14421;

    /* JADX INFO: renamed from: ۥّ */
    public final long f14422;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f14423;

    /* JADX INFO: renamed from: ۥۣ */
    public final Double f14424;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f14425;

    public C4376(Double d, int i, boolean z, int i2, long j, long j2) {
        this.f14424 = d;
        this.f14423 = i;
        this.f14420 = z;
        this.f14425 = i2;
        this.f14421 = j;
        this.f14422 = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1243) {
            AbstractC1243 abstractC1243 = (AbstractC1243) obj;
            Double d = this.f14424;
            if (d != null ? d.equals(((C4376) abstractC1243).f14424) : ((C4376) abstractC1243).f14424 == null) {
                C4376 c4376 = (C4376) abstractC1243;
                if (this.f14423 == c4376.f14423 && this.f14420 == c4376.f14420 && this.f14425 == c4376.f14425 && this.f14421 == c4376.f14421 && this.f14422 == c4376.f14422) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d = this.f14424;
        int iHashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.f14423) * 1000003) ^ (this.f14420 ? 1231 : 1237)) * 1000003) ^ this.f14425) * 1000003;
        long j = this.f14421;
        long j2 = this.f14422;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "Device{batteryLevel=" + this.f14424 + ", batteryVelocity=" + this.f14423 + ", proximityOn=" + this.f14420 + ", orientation=" + this.f14425 + ", ramUsed=" + this.f14421 + ", diskUsed=" + this.f14422 + "}";
    }
}
