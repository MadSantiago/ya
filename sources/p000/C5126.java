package p000;

/* JADX INFO: renamed from: ۦؘۙؗؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5126 extends AbstractC1525 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f16988;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f16989;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f16990;

    /* JADX INFO: renamed from: ۦؑ */
    public final String f16991;

    public C5126(long j, long j2, String str, String str2) {
        this.f16990 = j;
        this.f16989 = j2;
        this.f16988 = str;
        this.f16991 = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1525) {
            C5126 c5126 = (C5126) ((AbstractC1525) obj);
            if (this.f16990 == c5126.f16990 && this.f16989 == c5126.f16989 && this.f16988.equals(c5126.f16988)) {
                String str = c5126.f16991;
                String str2 = this.f16991;
                if (str2 != null ? str2.equals(str) : str == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f16990;
        long j2 = this.f16989;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f16988.hashCode()) * 1000003;
        String str = this.f16991;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.f16990);
        sb.append(", size=");
        sb.append(this.f16989);
        sb.append(", name=");
        sb.append(this.f16988);
        sb.append(", uuid=");
        return AbstractC3761.m6621(sb, this.f16991, "}");
    }
}
