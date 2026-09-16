package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: ۦؙۘؗؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5055 {

    /* JADX INFO: renamed from: ۥُ */
    public static final C5055 f16780;

    /* JADX INFO: renamed from: ۥّ */
    public static final C5055 f16781;

    /* JADX INFO: renamed from: ۥؗ */
    public final String[] f16782;

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f16783;

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean f16784;

    /* JADX INFO: renamed from: ۦؑ */
    public final String[] f16785;

    static {
        C5700 c5700 = C5700.f18759;
        C5700 c5701 = C5700.f18755;
        C5700 c5702 = C5700.f18760;
        C5700 c5703 = C5700.f18764;
        C5700 c5704 = C5700.f18770;
        C5700 c5705 = C5700.f18765;
        C5700 c5706 = C5700.f18772;
        C5700 c5707 = C5700.f18758;
        C5700 c5708 = C5700.f18771;
        C5700[] c5700Arr = {c5700, c5701, c5702, c5703, c5704, c5705, c5706, c5707, c5708};
        C5700[] c5700Arr2 = {c5700, c5701, c5702, c5703, c5704, c5705, c5706, c5707, c5708, C5700.f18766, C5700.f18768, C5700.f18762, C5700.f18767, C5700.f18757, C5700.f18769, C5700.f18756};
        C1138 c1138 = new C1138();
        c1138.m2396((C5700[]) Arrays.copyOf(c5700Arr, 9));
        EnumC2044 enumC2044 = EnumC2044.f6742;
        EnumC2044 enumC2045 = EnumC2044.f6738;
        c1138.m2398(enumC2044, enumC2045);
        c1138.f3980 = true;
        c1138.m2397();
        C1138 c1139 = new C1138();
        c1139.m2396((C5700[]) Arrays.copyOf(c5700Arr2, 16));
        c1139.m2398(enumC2044, enumC2045);
        c1139.f3980 = true;
        f16780 = c1139.m2397();
        C1138 c11310 = new C1138();
        c11310.m2396((C5700[]) Arrays.copyOf(c5700Arr2, 16));
        c11310.m2398(enumC2044, enumC2045, EnumC2044.f6739, EnumC2044.f6737);
        c11310.f3980 = true;
        c11310.m2397();
        f16781 = new C5055(false, false, null, null);
    }

    public C5055(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f16784 = z;
        this.f16783 = z2;
        this.f16782 = strArr;
        this.f16785 = strArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5055)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C5055 c5055 = (C5055) obj;
        boolean z = c5055.f16784;
        boolean z2 = this.f16784;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.f16782, c5055.f16782) && Arrays.equals(this.f16785, c5055.f16785) && this.f16783 == c5055.f16783;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f16784) {
            return 17;
        }
        String[] strArr = this.f16782;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f16785;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f16783 ? 1 : 0);
    }

    public final String toString() {
        if (!this.f16784) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m8582(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m8580(), "[all enabled]") + ", supportsTlsExtensions=" + this.f16783 + ')';
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final List m8580() {
        String[] strArr = this.f16785;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(AbstractC2164.m4192(str));
        }
        return AbstractC0973.m2039(arrayList);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m8581(SSLSocket sSLSocket) {
        if (!this.f16784) {
            return false;
        }
        String[] strArr = this.f16785;
        if (strArr != null && !AbstractC4031.m7220(strArr, sSLSocket.getEnabledProtocols(), C0406.f1490)) {
            return false;
        }
        String[] strArr2 = this.f16782;
        return strArr2 == null || AbstractC4031.m7220(strArr2, sSLSocket.getEnabledCipherSuites(), C5700.f18754);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final List m8582() {
        String[] strArr = this.f16782;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C5700.f18761.m5946(str));
        }
        return AbstractC0973.m2039(arrayList);
    }
}
