package p000;

/* JADX INFO: renamed from: ۥؘۜٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2414 {

    /* JADX INFO: renamed from: ۥؗ */
    public String f8034;

    /* JADX INFO: renamed from: ۥُ */
    public long f8035;

    /* JADX INFO: renamed from: ۥّ */
    public long f8036;

    /* JADX INFO: renamed from: ۥۗ */
    public int f8037;

    /* JADX INFO: renamed from: ۥۜ */
    public byte f8038;

    /* JADX INFO: renamed from: ۥۣ */
    public String f8039;

    /* JADX INFO: renamed from: ۦؑ */
    public String f8040;

    /* JADX INFO: renamed from: ۦۙ */
    public String f8041;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2529 m4533() {
        if (this.f8038 == 3 && this.f8037 != 0) {
            return new C2529(this.f8039, this.f8037, this.f8034, this.f8040, this.f8035, this.f8036, this.f8041);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f8037 == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.f8038 & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((this.f8038 & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb));
        return null;
    }
}
