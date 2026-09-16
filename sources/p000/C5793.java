package p000;

/* JADX INFO: renamed from: ۦۦٓۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5793 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C3245 f19085;

    /* JADX INFO: renamed from: ۥۗ */
    public final C1360 f19086;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f19087;

    public C5793(long j, C1360 c1360, C3245 c3245) {
        this.f19087 = j;
        this.f19086 = c1360;
        this.f19085 = c3245;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5793)) {
            return false;
        }
        C5793 c5793 = (C5793) obj;
        return this.f19087 == c5793.f19087 && this.f19086.equals(c5793.f19086) && this.f19085.equals(c5793.f19085);
    }

    public final int hashCode() {
        long j = this.f19087;
        return this.f19085.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f19086.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f19087 + ", transportContext=" + this.f19086 + ", event=" + this.f19085 + "}";
    }
}
