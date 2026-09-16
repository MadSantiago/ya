package p000;

/* JADX INFO: renamed from: ۦؘؕؑٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3302 extends AbstractC4841 {

    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC5497 f11052;

    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC5912 f11053;

    /* JADX INFO: renamed from: ۥّ */
    public final AbstractC5137 f11054;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f11055;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f11056;

    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC1243 f11057;

    public C3302(long j, String str, AbstractC5497 abstractC5497, AbstractC1243 abstractC1243, AbstractC5912 abstractC5912, AbstractC5137 abstractC5137) {
        this.f11056 = j;
        this.f11055 = str;
        this.f11052 = abstractC5497;
        this.f11057 = abstractC1243;
        this.f11053 = abstractC5912;
        this.f11054 = abstractC5137;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4841) {
            C3302 c3302 = (C3302) ((AbstractC4841) obj);
            if (this.f11056 == c3302.f11056 && this.f11055.equals(c3302.f11055) && this.f11052.equals(c3302.f11052) && this.f11057.equals(c3302.f11057)) {
                AbstractC5912 abstractC5912 = c3302.f11053;
                AbstractC5912 abstractC5913 = this.f11053;
                if (abstractC5913 != null ? abstractC5913.equals(abstractC5912) : abstractC5912 == null) {
                    AbstractC5137 abstractC5137 = c3302.f11054;
                    AbstractC5137 abstractC5138 = this.f11054;
                    if (abstractC5138 != null ? abstractC5138.equals(abstractC5137) : abstractC5137 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f11056;
        int iHashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f11055.hashCode()) * 1000003) ^ this.f11052.hashCode()) * 1000003) ^ this.f11057.hashCode()) * 1000003;
        AbstractC5912 abstractC5912 = this.f11053;
        int iHashCode2 = (iHashCode ^ (abstractC5912 == null ? 0 : abstractC5912.hashCode())) * 1000003;
        AbstractC5137 abstractC5137 = this.f11054;
        return iHashCode2 ^ (abstractC5137 != null ? abstractC5137.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f11056 + ", type=" + this.f11055 + ", app=" + this.f11052 + ", device=" + this.f11057 + ", log=" + this.f11053 + ", rollouts=" + this.f11054 + "}";
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C4725 m6061() {
        C4725 c4725 = new C4725();
        c4725.f15600 = this.f11056;
        c4725.f15599 = this.f11055;
        c4725.f15596 = this.f11052;
        c4725.f15601 = this.f11057;
        c4725.f15597 = this.f11053;
        c4725.f15598 = this.f11054;
        c4725.f15602 = (byte) 1;
        return c4725;
    }
}
