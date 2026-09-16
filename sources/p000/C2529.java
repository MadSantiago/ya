package p000;

/* JADX INFO: renamed from: ۥؘَ۠٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2529 {

    /* JADX INFO: renamed from: ۥۜ */
    public static final /* synthetic */ int f8371 = 0;

    /* JADX INFO: renamed from: ۥؗ */
    public final String f8372;

    /* JADX INFO: renamed from: ۥُ */
    public final long f8373;

    /* JADX INFO: renamed from: ۥّ */
    public final long f8374;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f8375;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f8376;

    /* JADX INFO: renamed from: ۦؑ */
    public final String f8377;

    /* JADX INFO: renamed from: ۦۙ */
    public final String f8378;

    static {
        byte b = (byte) (((byte) (0 | 2)) | 1);
        if (b == 3) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb));
    }

    public C2529(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.f8376 = str;
        this.f8375 = i;
        this.f8372 = str2;
        this.f8377 = str3;
        this.f8373 = j;
        this.f8374 = j2;
        this.f8378 = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2529)) {
            return false;
        }
        C2529 c2529 = (C2529) obj;
        String str = c2529.f8376;
        String str2 = this.f8376;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!AbstractC3761.m6625(this.f8375, c2529.f8375)) {
            return false;
        }
        String str3 = c2529.f8372;
        String str4 = this.f8372;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = c2529.f8377;
        String str6 = this.f8377;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        if (this.f8373 != c2529.f8373 || this.f8374 != c2529.f8374) {
            return false;
        }
        String str7 = c2529.f8378;
        String str8 = this.f8378;
        if (str8 == null) {
            return str7 == null;
        }
        return str8.equals(str7);
    }

    public final int hashCode() {
        String str = this.f8376;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ AbstractC3761.m6632(this.f8375)) * 1000003;
        String str2 = this.f8372;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f8377;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f8373;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f8374;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f8378;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f8376);
        sb.append(", registrationStatus=");
        int i = this.f8375;
        if (i == 1) {
            str = "ATTEMPT_MIGRATION";
        } else if (i == 2) {
            str = "NOT_GENERATED";
        } else if (i == 3) {
            str = "UNREGISTERED";
        } else if (i != 4) {
            str = i != 5 ? "null" : "REGISTER_ERROR";
        } else {
            str = "REGISTERED";
        }
        sb.append(str);
        sb.append(", authToken=");
        sb.append(this.f8372);
        sb.append(", refreshToken=");
        sb.append(this.f8377);
        sb.append(", expiresInSecs=");
        sb.append(this.f8373);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f8374);
        sb.append(", fisError=");
        return AbstractC3761.m6621(sb, this.f8378, "}");
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C2414 m4746() {
        C2414 c2414 = new C2414();
        c2414.f8039 = this.f8376;
        c2414.f8037 = this.f8375;
        c2414.f8034 = this.f8372;
        c2414.f8040 = this.f8377;
        c2414.f8035 = this.f8373;
        c2414.f8036 = this.f8374;
        c2414.f8041 = this.f8378;
        c2414.f8038 = (byte) 3;
        return c2414;
    }
}
