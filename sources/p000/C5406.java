package p000;

/* JADX INFO: renamed from: ۦؚ۠ؖٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5406 {

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f17851;

    /* JADX INFO: renamed from: ۥُ */
    public long f17852;

    /* JADX INFO: renamed from: ۥّ */
    public long f17853;

    /* JADX INFO: renamed from: ۥۗ */
    public int f17854;

    /* JADX INFO: renamed from: ۥۣ */
    public Double f17855;

    /* JADX INFO: renamed from: ۦؑ */
    public int f17856;

    /* JADX INFO: renamed from: ۦۙ */
    public byte f17857;

    /* JADX INFO: renamed from: ۥۣ */
    public final C4376 m9087() {
        if (this.f17857 == 31) {
            return new C4376(this.f17855, this.f17854, this.f17851, this.f17856, this.f17852, this.f17853);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f17857 & 1) == 0) {
            sb.append(" batteryVelocity");
        }
        if ((this.f17857 & 2) == 0) {
            sb.append(" proximityOn");
        }
        if ((this.f17857 & 4) == 0) {
            sb.append(" orientation");
        }
        if ((this.f17857 & 8) == 0) {
            sb.append(" ramUsed");
        }
        if ((this.f17857 & 16) == 0) {
            sb.append(" diskUsed");
        }
        C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb));
        return null;
    }
}
