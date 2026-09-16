package p000;

/* JADX INFO: renamed from: ۥٞؗٗٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1969 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f6519;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f6520;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f6521;

    public C1969(long j, String str, int i) {
        this.f6521 = str;
        this.f6520 = j;
        this.f6519 = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1969)) {
            return false;
        }
        C1969 c1969 = (C1969) obj;
        String str = c1969.f6521;
        String str2 = this.f6521;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f6520 != c1969.f6520) {
            return false;
        }
        int i = c1969.f6519;
        int i2 = this.f6519;
        if (i2 == 0) {
            return i == 0;
        }
        return AbstractC3761.m6625(i2, i);
    }

    public final int hashCode() {
        String str = this.f6521;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.f6520;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i2 = this.f6519;
        return i ^ (i2 != 0 ? AbstractC3761.m6632(i2) : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f6521);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f6520);
        sb.append(", responseCode=");
        int i = this.f6519;
        if (i == 1) {
            str = "OK";
        } else if (i != 2) {
            str = i != 3 ? "null" : "AUTH_ERROR";
        } else {
            str = "BAD_CONFIG";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
