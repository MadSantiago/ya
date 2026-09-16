package p000;

/* JADX INFO: renamed from: ۥؚۨؖٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2931 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f9853;

    /* JADX INFO: renamed from: ۥُ */
    public final int f9854;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f9855;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f9856;

    /* JADX INFO: renamed from: ۦؑ */
    public final C1969 f9857;

    public C2931(String str, String str2, String str3, C1969 c1969, int i) {
        this.f9856 = str;
        this.f9855 = str2;
        this.f9853 = str3;
        this.f9857 = c1969;
        this.f9854 = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2931)) {
            return false;
        }
        C2931 c2931 = (C2931) obj;
        String str = c2931.f9856;
        String str2 = this.f9856;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = c2931.f9855;
        String str4 = this.f9855;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = c2931.f9853;
        String str6 = this.f9853;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        C1969 c1969 = c2931.f9857;
        C1969 c19610 = this.f9857;
        if (c19610 == null) {
            if (c1969 != null) {
                return false;
            }
        } else if (!c19610.equals(c1969)) {
            return false;
        }
        int i = c2931.f9854;
        int i2 = this.f9854;
        if (i2 == 0) {
            return i == 0;
        }
        return AbstractC3761.m6625(i2, i);
    }

    public final int hashCode() {
        String str = this.f9856;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f9855;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f9853;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C1969 c1969 = this.f9857;
        int iHashCode4 = (iHashCode3 ^ (c1969 == null ? 0 : c1969.hashCode())) * 1000003;
        int i = this.f9854;
        return iHashCode4 ^ (i != 0 ? AbstractC3761.m6632(i) : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.f9856);
        sb.append(", fid=");
        sb.append(this.f9855);
        sb.append(", refreshToken=");
        sb.append(this.f9853);
        sb.append(", authToken=");
        sb.append(this.f9857);
        sb.append(", responseCode=");
        int i = this.f9854;
        if (i != 1) {
            str = i != 2 ? "null" : "BAD_CONFIG";
        } else {
            str = "OK";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
