package p000;

/* JADX INFO: renamed from: ۥؑۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0224 {

    /* JADX INFO: renamed from: ۥؗ */
    public int f834;

    /* JADX INFO: renamed from: ۥُ */
    public long f835;

    /* JADX INFO: renamed from: ۥّ */
    public boolean f836;

    /* JADX INFO: renamed from: ۥۗ */
    public String f837;

    /* JADX INFO: renamed from: ۥۜ */
    public String f838;

    /* JADX INFO: renamed from: ۥۣ */
    public int f839;

    /* JADX INFO: renamed from: ۦؑ */
    public long f840;

    /* JADX INFO: renamed from: ۦِ */
    public byte f841;

    /* JADX INFO: renamed from: ۦٛ */
    public String f842;

    /* JADX INFO: renamed from: ۦۙ */
    public int f843;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2033 m480() {
        String str;
        String str2;
        String str3;
        if (this.f841 == 63 && (str = this.f837) != null && (str2 = this.f838) != null && (str3 = this.f842) != null) {
            return new C2033(this.f839, str, this.f834, this.f840, this.f835, this.f836, this.f843, str2, str3);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f841 & 1) == 0) {
            sb.append(" arch");
        }
        if (this.f837 == null) {
            sb.append(" model");
        }
        if ((this.f841 & 2) == 0) {
            sb.append(" cores");
        }
        if ((this.f841 & 4) == 0) {
            sb.append(" ram");
        }
        if ((this.f841 & 8) == 0) {
            sb.append(" diskSpace");
        }
        if ((this.f841 & 16) == 0) {
            sb.append(" simulator");
        }
        if ((this.f841 & 32) == 0) {
            sb.append(" state");
        }
        if (this.f838 == null) {
            sb.append(" manufacturer");
        }
        if (this.f842 == null) {
            sb.append(" modelClass");
        }
        C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb));
        return null;
    }
}
