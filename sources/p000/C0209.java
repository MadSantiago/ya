package p000;

/* JADX INFO: renamed from: ۥؑؖٛٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0209 extends AbstractC4176 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f789;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f790;

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC1742 f791;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f792;

    public C0209(C1403 c1403, String str, String str2, long j) {
        this.f791 = c1403;
        this.f790 = str;
        this.f789 = str2;
        this.f792 = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4176) {
            C0209 c0209 = (C0209) ((AbstractC4176) obj);
            if (this.f791.equals(c0209.f791) && this.f790.equals(c0209.f790) && this.f789.equals(c0209.f789) && this.f792 == c0209.f792) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f791.hashCode() ^ 1000003) * 1000003) ^ this.f790.hashCode()) * 1000003) ^ this.f789.hashCode()) * 1000003;
        long j = this.f792;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f791 + ", parameterKey=" + this.f790 + ", parameterValue=" + this.f789 + ", templateVersion=" + this.f792 + "}";
    }
}
