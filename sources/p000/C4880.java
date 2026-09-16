package p000;

/* JADX INFO: renamed from: ۦٟٖٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4880 extends AbstractC2952 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f16043;

    /* JADX INFO: renamed from: ۥُ */
    public final String f16044;

    /* JADX INFO: renamed from: ۥّ */
    public final String f16045;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f16046;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f16047;

    /* JADX INFO: renamed from: ۦؑ */
    public final String f16048;

    public C4880(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f16047 = str;
        this.f16046 = str2;
        this.f16043 = str3;
        this.f16048 = str4;
        this.f16044 = str5;
        this.f16045 = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2952) {
            C4880 c4880 = (C4880) ((AbstractC2952) obj);
            if (this.f16047.equals(c4880.f16047) && this.f16046.equals(c4880.f16046)) {
                String str = c4880.f16043;
                String str2 = this.f16043;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = c4880.f16048;
                    String str4 = this.f16048;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = c4880.f16044;
                        String str6 = this.f16044;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            String str7 = c4880.f16045;
                            String str8 = this.f16045;
                            if (str8 != null ? str8.equals(str7) : str7 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f16047.hashCode() ^ 1000003) * 1000003) ^ this.f16046.hashCode()) * 1000003;
        String str = this.f16043;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f16048;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f16044;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f16045;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.f16047);
        sb.append(", version=");
        sb.append(this.f16046);
        sb.append(", displayVersion=");
        sb.append(this.f16043);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.f16048);
        sb.append(", developmentPlatform=");
        sb.append(this.f16044);
        sb.append(", developmentPlatformVersion=");
        return AbstractC3761.m6621(sb, this.f16045, "}");
    }
}
