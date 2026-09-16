package p000;

/* JADX INFO: renamed from: ۥ۟ؓۖٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2443 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f8137;

    /* JADX INFO: renamed from: ۥُ */
    public final int f8138;

    /* JADX INFO: renamed from: ۥّ */
    public final C5002 f8139;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f8140;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f8141;

    /* JADX INFO: renamed from: ۦؑ */
    public final String f8142;

    public C2443(String str, String str2, String str3, String str4, int i, C5002 c5002) {
        if (str == null) {
            C0178.m387("Null appIdentifier");
            throw null;
        }
        this.f8141 = str;
        if (str2 == null) {
            C0178.m387("Null versionCode");
            throw null;
        }
        this.f8140 = str2;
        if (str3 == null) {
            C0178.m387("Null versionName");
            throw null;
        }
        this.f8137 = str3;
        if (str4 == null) {
            C0178.m387("Null installUuid");
            throw null;
        }
        this.f8142 = str4;
        this.f8138 = i;
        this.f8139 = c5002;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2443) {
            C2443 c2443 = (C2443) obj;
            return this.f8141.equals(c2443.f8141) && this.f8140.equals(c2443.f8140) && this.f8137.equals(c2443.f8137) && this.f8142.equals(c2443.f8142) && this.f8138 == c2443.f8138 && this.f8139 == c2443.f8139;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8139.hashCode() ^ ((((((((((this.f8141.hashCode() ^ 1000003) * 1000003) ^ this.f8140.hashCode()) * 1000003) ^ this.f8137.hashCode()) * 1000003) ^ this.f8142.hashCode()) * 1000003) ^ this.f8138) * 1000003);
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f8141 + ", versionCode=" + this.f8140 + ", versionName=" + this.f8137 + ", installUuid=" + this.f8142 + ", deliveryMechanism=" + this.f8138 + ", developmentPlatformProvider=" + this.f8139 + "}";
    }
}
