package p000;

/* JADX INFO: renamed from: ۥؚۘؔؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2159 {

    /* JADX INFO: renamed from: ۥۗ */
    public final long f7123;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f7124;

    public C2159(long j, int i) {
        if (i == 0) {
            C0178.m387("Null status");
            throw null;
        }
        this.f7124 = i;
        this.f7123 = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2159)) {
            return false;
        }
        C2159 c2159 = (C2159) obj;
        return AbstractC3761.m6625(this.f7124, c2159.f7124) && this.f7123 == c2159.f7123;
    }

    public final int hashCode() {
        int iM6632 = (AbstractC3761.m6632(this.f7124) ^ 1000003) * 1000003;
        long j = this.f7123;
        return ((int) ((j >>> 32) ^ j)) ^ iM6632;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.f7124;
        if (i == 1) {
            str = "OK";
        } else if (i == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i != 3) {
            str = i != 4 ? "null" : "INVALID_PAYLOAD";
        } else {
            str = "FATAL_ERROR";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.f7123);
        sb.append("}");
        return sb.toString();
    }
}
