package p000;

/* JADX INFO: renamed from: ۦٍؔؗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3238 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f10875;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f10876;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f10877;

    public C3238(String str, String str2, String str3) {
        if (str == null) {
            C0178.m387("Null crashlyticsInstallId");
            throw null;
        }
        this.f10877 = str;
        this.f10876 = str2;
        this.f10875 = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3238) {
            C3238 c3238 = (C3238) obj;
            if (this.f10877.equals(c3238.f10877)) {
                String str = c3238.f10876;
                String str2 = this.f10876;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = c3238.f10875;
                    String str4 = this.f10875;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f10877.hashCode() ^ 1000003) * 1000003;
        String str = this.f10876;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f10875;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.f10877);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f10876);
        sb.append(", firebaseAuthenticationToken=");
        return AbstractC3761.m6621(sb, this.f10875, "}");
    }
}
