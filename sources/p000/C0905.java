package p000;

/* JADX INFO: renamed from: ۥٌؖؑٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0905 extends AbstractC3146 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f3249;

    /* JADX INFO: renamed from: ۥُ */
    public final String f3250;

    /* JADX INFO: renamed from: ۥّ */
    public final long f3251;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f3252;

    /* JADX INFO: renamed from: ۦؑ */
    public final String f3253;

    public C0905(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            C0178.m387("Null rolloutId");
            throw null;
        }
        this.f3252 = str;
        if (str2 == null) {
            C0178.m387("Null parameterKey");
            throw null;
        }
        this.f3249 = str2;
        this.f3253 = str3;
        if (str4 == null) {
            C0178.m387("Null variantId");
            throw null;
        }
        this.f3250 = str4;
        this.f3251 = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3146)) {
            return false;
        }
        C0905 c0905 = (C0905) ((AbstractC3146) obj);
        return this.f3252.equals(c0905.f3252) && this.f3249.equals(c0905.f3249) && this.f3253.equals(c0905.f3253) && this.f3250.equals(c0905.f3250) && this.f3251 == c0905.f3251;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f3252.hashCode() ^ 1000003) * 1000003) ^ this.f3249.hashCode()) * 1000003) ^ this.f3253.hashCode()) * 1000003) ^ this.f3250.hashCode()) * 1000003;
        long j = this.f3251;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        return "RolloutAssignment{rolloutId=" + this.f3252 + ", parameterKey=" + this.f3249 + ", parameterValue=" + this.f3253 + ", variantId=" + this.f3250 + ", templateVersion=" + this.f3251 + "}";
    }
}
