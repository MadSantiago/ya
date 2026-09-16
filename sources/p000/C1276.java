package p000;

/* JADX INFO: renamed from: ۥٓؔٙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1276 {

    /* JADX INFO: renamed from: ۥّ */
    public static final C1276 f4349 = new C1276(10485760, 200, 10000, 604800000, 81920);

    /* JADX INFO: renamed from: ۥؗ */
    public final int f4350;

    /* JADX INFO: renamed from: ۥُ */
    public final int f4351;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f4352;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f4353;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f4354;

    public C1276(long j, int i, int i2, long j2, int i3) {
        this.f4353 = j;
        this.f4352 = i;
        this.f4350 = i2;
        this.f4354 = j2;
        this.f4351 = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1276) {
            C1276 c1276 = (C1276) obj;
            if (this.f4353 == c1276.f4353 && this.f4352 == c1276.f4352 && this.f4350 == c1276.f4350 && this.f4354 == c1276.f4354 && this.f4351 == c1276.f4351) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f4353;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f4352) * 1000003) ^ this.f4350) * 1000003;
        long j2 = this.f4354;
        return this.f4351 ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f4353);
        sb.append(", loadBatchSize=");
        sb.append(this.f4352);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f4350);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f4354);
        sb.append(", maxBlobByteSizePerRow=");
        return AbstractC3761.m6630(this.f4351, "}", sb);
    }
}
