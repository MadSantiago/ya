package p000;

import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: renamed from: ۥۣٔؖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1360 {

    /* JADX INFO: renamed from: ۥؗ */
    public final EnumC4021 f4674;

    /* JADX INFO: renamed from: ۥۗ */
    public final byte[] f4675;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f4676;

    public C1360(String str, byte[] bArr, EnumC4021 enumC4021) {
        this.f4676 = str;
        this.f4675 = bArr;
        this.f4674 = enumC4021;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C2808 m2865() {
        C2808 c2808 = new C2808(3, false);
        c2808.f9377 = EnumC4021.f13412;
        return c2808;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1360) {
            C1360 c1360 = (C1360) obj;
            if (this.f4676.equals(c1360.f4676) && Arrays.equals(this.f4675, c1360.f4675) && this.f4674.equals(c1360.f4674)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4674.hashCode() ^ ((((this.f4676.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f4675)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.f4675;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.f4676);
        sb.append(", ");
        sb.append(this.f4674);
        sb.append(", ");
        return AbstractC3761.m6621(sb, strEncodeToString, ")");
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C1360 m2866(EnumC4021 enumC4021) {
        C2808 c2808M2865 = m2865();
        c2808M2865.m5335(this.f4676);
        if (enumC4021 == null) {
            C0178.m387("Null priority");
            return null;
        }
        c2808M2865.f9377 = enumC4021;
        c2808M2865.f9378 = this.f4675;
        return c2808M2865.m5345();
    }
}
