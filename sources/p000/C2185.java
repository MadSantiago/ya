package p000;

/* JADX INFO: renamed from: ۥۣۘؗۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2185 {

    /* JADX INFO: renamed from: ۥؗ */
    public String f7241;

    /* JADX INFO: renamed from: ۥُ */
    public byte f7242;

    /* JADX INFO: renamed from: ۥۗ */
    public String f7243;

    /* JADX INFO: renamed from: ۥۣ */
    public int f7244;

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f7245;

    /* JADX INFO: renamed from: ۥۣ */
    public final C5675 m4238() {
        String str;
        String str2;
        if (this.f7242 == 3 && (str = this.f7243) != null && (str2 = this.f7241) != null) {
            return new C5675(str, str2, this.f7244, this.f7245);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f7242 & 1) == 0) {
            sb.append(" platform");
        }
        if (this.f7243 == null) {
            sb.append(" version");
        }
        if (this.f7241 == null) {
            sb.append(" buildVersion");
        }
        if ((this.f7242 & 2) == 0) {
            sb.append(" jailbroken");
        }
        C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb));
        return null;
    }
}
