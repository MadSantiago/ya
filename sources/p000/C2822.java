package p000;

/* JADX INFO: renamed from: ۥۦٍؗؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2822 extends AbstractC3677 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f9425;

    /* JADX INFO: renamed from: ۥُ */
    public final String f9426;

    /* JADX INFO: renamed from: ۥّ */
    public final String f9427;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f9428;

    /* JADX INFO: renamed from: ۥۜ */
    public final String f9429;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f9430;

    /* JADX INFO: renamed from: ۦؚ */
    public final AbstractC5843 f9431;

    /* JADX INFO: renamed from: ۦٌ */
    public final AbstractC5574 f9432;

    /* JADX INFO: renamed from: ۦِ */
    public final String f9433;

    /* JADX INFO: renamed from: ۦٛ */
    public final String f9434;

    /* JADX INFO: renamed from: ۦۗ */
    public final AbstractC1038 f9435;

    /* JADX INFO: renamed from: ۦۙ */
    public final String f9436;

    public C2822(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, AbstractC1038 abstractC1038, AbstractC5843 abstractC5843, AbstractC5574 abstractC5574) {
        this.f9428 = str;
        this.f9425 = str2;
        this.f9430 = i;
        this.f9426 = str3;
        this.f9427 = str4;
        this.f9436 = str5;
        this.f9429 = str6;
        this.f9434 = str7;
        this.f9433 = str8;
        this.f9435 = abstractC1038;
        this.f9431 = abstractC5843;
        this.f9432 = abstractC5574;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3677) {
            C2822 c2822 = (C2822) ((AbstractC3677) obj);
            if (this.f9428.equals(c2822.f9428) && this.f9425.equals(c2822.f9425) && this.f9430 == c2822.f9430 && this.f9426.equals(c2822.f9426)) {
                String str = c2822.f9427;
                String str2 = this.f9427;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = c2822.f9436;
                    String str4 = this.f9436;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = c2822.f9429;
                        String str6 = this.f9429;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.f9434.equals(c2822.f9434) && this.f9433.equals(c2822.f9433)) {
                                AbstractC1038 abstractC1038 = c2822.f9435;
                                AbstractC1038 abstractC1039 = this.f9435;
                                if (abstractC1039 != null ? abstractC1039.equals(abstractC1038) : abstractC1038 == null) {
                                    AbstractC5843 abstractC5843 = c2822.f9431;
                                    AbstractC5843 abstractC5844 = this.f9431;
                                    if (abstractC5844 != null ? abstractC5844.equals(abstractC5843) : abstractC5843 == null) {
                                        AbstractC5574 abstractC5574 = c2822.f9432;
                                        AbstractC5574 abstractC5575 = this.f9432;
                                        if (abstractC5575 != null ? abstractC5575.equals(abstractC5574) : abstractC5574 == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f9428.hashCode() ^ 1000003) * 1000003) ^ this.f9425.hashCode()) * 1000003) ^ this.f9430) * 1000003) ^ this.f9426.hashCode()) * 1000003;
        String str = this.f9427;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f9436;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f9429;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f9434.hashCode()) * 1000003) ^ this.f9433.hashCode()) * 1000003;
        AbstractC1038 abstractC1038 = this.f9435;
        int iHashCode5 = (iHashCode4 ^ (abstractC1038 == null ? 0 : abstractC1038.hashCode())) * 1000003;
        AbstractC5843 abstractC5843 = this.f9431;
        int iHashCode6 = (iHashCode5 ^ (abstractC5843 == null ? 0 : abstractC5843.hashCode())) * 1000003;
        AbstractC5574 abstractC5574 = this.f9432;
        return iHashCode6 ^ (abstractC5574 != null ? abstractC5574.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f9428 + ", gmpAppId=" + this.f9425 + ", platform=" + this.f9430 + ", installationUuid=" + this.f9426 + ", firebaseInstallationId=" + this.f9427 + ", firebaseAuthenticationToken=" + this.f9436 + ", appQualitySessionId=" + this.f9429 + ", buildVersion=" + this.f9434 + ", displayVersion=" + this.f9433 + ", session=" + this.f9435 + ", ndkPayload=" + this.f9431 + ", appExitInfo=" + this.f9432 + "}";
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C0541 m5389() {
        C0541 c0541 = new C0541();
        c0541.f1948 = this.f9428;
        c0541.f1946 = this.f9425;
        c0541.f1943 = this.f9430;
        c0541.f1949 = this.f9426;
        c0541.f1944 = this.f9427;
        c0541.f1945 = this.f9436;
        c0541.f1955 = this.f9429;
        c0541.f1947 = this.f9434;
        c0541.f1953 = this.f9433;
        c0541.f1952 = this.f9435;
        c0541.f1954 = this.f9431;
        c0541.f1950 = this.f9432;
        c0541.f1951 = (byte) 1;
        return c0541;
    }
}
