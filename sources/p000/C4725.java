package p000;

/* JADX INFO: renamed from: ۦٝؑۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4725 {

    /* JADX INFO: renamed from: ۥؗ */
    public AbstractC5497 f15596;

    /* JADX INFO: renamed from: ۥُ */
    public AbstractC5912 f15597;

    /* JADX INFO: renamed from: ۥّ */
    public AbstractC5137 f15598;

    /* JADX INFO: renamed from: ۥۗ */
    public String f15599;

    /* JADX INFO: renamed from: ۥۣ */
    public long f15600;

    /* JADX INFO: renamed from: ۦؑ */
    public AbstractC1243 f15601;

    /* JADX INFO: renamed from: ۦۙ */
    public byte f15602;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3302 m8054() {
        String str;
        AbstractC5497 abstractC5497;
        AbstractC1243 abstractC1243;
        if (this.f15602 == 1 && (str = this.f15599) != null && (abstractC5497 = this.f15596) != null && (abstractC1243 = this.f15601) != null) {
            return new C3302(this.f15600, str, abstractC5497, abstractC1243, this.f15597, this.f15598);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.f15602) == 0) {
            sb.append(" timestamp");
        }
        if (this.f15599 == null) {
            sb.append(" type");
        }
        if (this.f15596 == null) {
            sb.append(" app");
        }
        if (this.f15601 == null) {
            sb.append(" device");
        }
        C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb));
        return null;
    }
}
