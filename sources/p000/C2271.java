package p000;

/* JADX INFO: renamed from: ۥۚؓۨۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2271 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f7532;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f7533;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f7534;

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean f7535;

    public C2271(int i, int i2, String str, boolean z) {
        this.f7534 = str;
        this.f7533 = i;
        this.f7532 = i2;
        this.f7535 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2271)) {
            return false;
        }
        C2271 c2271 = (C2271) obj;
        return this.f7534.equals(c2271.f7534) && this.f7533 == c2271.f7533 && this.f7532 == c2271.f7532 && this.f7535 == c2271.f7535;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7535) + AbstractC2049.m3999(this.f7532, AbstractC2049.m3999(this.f7533, this.f7534.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f7534 + ", pid=" + this.f7533 + ", importance=" + this.f7532 + ", isDefaultProcess=" + this.f7535 + ')';
    }
}
