package p000;

import android.os.Build;

/* JADX INFO: renamed from: ۥَٖٛؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1757 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f5850;

    /* JADX INFO: renamed from: ۥُ */
    public final boolean f5851;

    /* JADX INFO: renamed from: ۥّ */
    public final int f5852;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f5853;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f5854;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f5855;

    public C1757(int i, int i2, long j, long j2, boolean z, int i3) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f5854 = i;
        if (str == null) {
            C0178.m387("Null model");
            throw null;
        }
        this.f5853 = i2;
        this.f5850 = j;
        this.f5855 = j2;
        this.f5851 = z;
        this.f5852 = i3;
        if (str2 == null) {
            C0178.m387("Null manufacturer");
            throw null;
        }
        if (str3 != null) {
            return;
        }
        C0178.m387("Null modelClass");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1757)) {
            return false;
        }
        C1757 c1757 = (C1757) obj;
        if (this.f5854 != c1757.f5854) {
            return false;
        }
        String str = Build.MODEL;
        if (!str.equals(str) || this.f5853 != c1757.f5853 || this.f5850 != c1757.f5850 || this.f5855 != c1757.f5855 || this.f5851 != c1757.f5851 || this.f5852 != c1757.f5852) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!str2.equals(str2)) {
            return false;
        }
        String str3 = Build.PRODUCT;
        return str3.equals(str3);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f5854 ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f5853) * 1000003;
        long j = this.f5850;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f5855;
        return ((((this.f5852 ^ ((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f5851 ? 1231 : 1237)) * 1000003)) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.f5854);
        sb.append(", model=");
        sb.append(Build.MODEL);
        sb.append(", availableProcessors=");
        sb.append(this.f5853);
        sb.append(", totalRam=");
        sb.append(this.f5850);
        sb.append(", diskSpace=");
        sb.append(this.f5855);
        sb.append(", isEmulator=");
        sb.append(this.f5851);
        sb.append(", state=");
        sb.append(this.f5852);
        sb.append(", manufacturer=");
        sb.append(Build.MANUFACTURER);
        sb.append(", modelClass=");
        return AbstractC3761.m6621(sb, Build.PRODUCT, "}");
    }
}
