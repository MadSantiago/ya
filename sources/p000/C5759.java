package p000;

/* JADX INFO: renamed from: ۦۦَٕؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5759 {

    /* JADX INFO: renamed from: ۥؗ */
    public String f18978;

    /* JADX INFO: renamed from: ۥُ */
    public byte f18979;

    /* JADX INFO: renamed from: ۥۗ */
    public String f18980;

    /* JADX INFO: renamed from: ۥۣ */
    public C1403 f18981;

    /* JADX INFO: renamed from: ۦؑ */
    public long f18982;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0209 m9575() {
        C1403 c1403;
        String str;
        String str2;
        if (this.f18979 == 1 && (c1403 = this.f18981) != null && (str = this.f18980) != null && (str2 = this.f18978) != null) {
            return new C0209(c1403, str, str2, this.f18982);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f18981 == null) {
            sb.append(" rolloutVariant");
        }
        if (this.f18980 == null) {
            sb.append(" parameterKey");
        }
        if (this.f18978 == null) {
            sb.append(" parameterValue");
        }
        if ((this.f18979 & 1) == 0) {
            sb.append(" templateVersion");
        }
        C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb));
        return null;
    }
}
