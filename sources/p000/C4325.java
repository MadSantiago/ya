package p000;

/* JADX INFO: renamed from: ۦٍؘٖٜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4325 {

    /* JADX INFO: renamed from: ۥؗ */
    public String f14291;

    /* JADX INFO: renamed from: ۥُ */
    public int f14292;

    /* JADX INFO: renamed from: ۥّ */
    public byte f14293;

    /* JADX INFO: renamed from: ۥۗ */
    public String f14294;

    /* JADX INFO: renamed from: ۥۣ */
    public long f14295;

    /* JADX INFO: renamed from: ۦؑ */
    public long f14296;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3723 m7627() {
        String str;
        if (this.f14293 == 7 && (str = this.f14294) != null) {
            return new C3723(this.f14295, str, this.f14291, this.f14296, this.f14292);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f14293 & 1) == 0) {
            sb.append(" pc");
        }
        if (this.f14294 == null) {
            sb.append(" symbol");
        }
        if ((this.f14293 & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f14293 & 4) == 0) {
            sb.append(" importance");
        }
        C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb));
        return null;
    }
}
