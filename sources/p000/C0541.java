package p000;

/* JADX INFO: renamed from: ۥؖؕۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0541 {

    /* JADX INFO: renamed from: ۥؗ */
    public int f1943;

    /* JADX INFO: renamed from: ۥُ */
    public String f1944;

    /* JADX INFO: renamed from: ۥّ */
    public String f1945;

    /* JADX INFO: renamed from: ۥۗ */
    public String f1946;

    /* JADX INFO: renamed from: ۥۜ */
    public String f1947;

    /* JADX INFO: renamed from: ۥۣ */
    public String f1948;

    /* JADX INFO: renamed from: ۦؑ */
    public String f1949;

    /* JADX INFO: renamed from: ۦؚ */
    public AbstractC5574 f1950;

    /* JADX INFO: renamed from: ۦٌ */
    public byte f1951;

    /* JADX INFO: renamed from: ۦِ */
    public AbstractC1038 f1952;

    /* JADX INFO: renamed from: ۦٛ */
    public String f1953;

    /* JADX INFO: renamed from: ۦۗ */
    public AbstractC5843 f1954;

    /* JADX INFO: renamed from: ۦۙ */
    public String f1955;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2822 m1237() {
        if (this.f1951 == 1 && this.f1948 != null && this.f1946 != null && this.f1949 != null && this.f1947 != null && this.f1953 != null) {
            return new C2822(this.f1948, this.f1946, this.f1943, this.f1949, this.f1944, this.f1945, this.f1955, this.f1947, this.f1953, this.f1952, this.f1954, this.f1950);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f1948 == null) {
            sb.append(" sdkVersion");
        }
        if (this.f1946 == null) {
            sb.append(" gmpAppId");
        }
        if ((1 & this.f1951) == 0) {
            sb.append(" platform");
        }
        if (this.f1949 == null) {
            sb.append(" installationUuid");
        }
        if (this.f1947 == null) {
            sb.append(" buildVersion");
        }
        if (this.f1953 == null) {
            sb.append(" displayVersion");
        }
        C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb));
        return null;
    }
}
