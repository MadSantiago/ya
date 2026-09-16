package p000;

/* JADX INFO: renamed from: ۦٖۤؗؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5675 extends AbstractC0895 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f18656;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f18657;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f18658;

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean f18659;

    public C5675(String str, String str2, int i, boolean z) {
        this.f18658 = i;
        this.f18657 = str;
        this.f18656 = str2;
        this.f18659 = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0895) {
            C5675 c5675 = (C5675) ((AbstractC0895) obj);
            if (this.f18658 == c5675.f18658 && this.f18657.equals(c5675.f18657) && this.f18656.equals(c5675.f18656) && this.f18659 == c5675.f18659) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f18659 ? 1231 : 1237) ^ ((((((this.f18658 ^ 1000003) * 1000003) ^ this.f18657.hashCode()) * 1000003) ^ this.f18656.hashCode()) * 1000003);
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f18658 + ", version=" + this.f18657 + ", buildVersion=" + this.f18656 + ", jailbroken=" + this.f18659 + "}";
    }
}
