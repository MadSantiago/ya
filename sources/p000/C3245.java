package p000;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: ۦِؔٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3245 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C1273 f10888;

    /* JADX INFO: renamed from: ۥُ */
    public final long f10889;

    /* JADX INFO: renamed from: ۥّ */
    public final Map f10890;

    /* JADX INFO: renamed from: ۥۗ */
    public final Integer f10891;

    /* JADX INFO: renamed from: ۥۜ */
    public final String f10892;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f10893;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f10894;

    /* JADX INFO: renamed from: ۦِ */
    public final byte[] f10895;

    /* JADX INFO: renamed from: ۦٛ */
    public final byte[] f10896;

    /* JADX INFO: renamed from: ۦۙ */
    public final Integer f10897;

    public C3245(String str, Integer num, C1273 c1273, long j, long j2, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f10893 = str;
        this.f10891 = num;
        this.f10888 = c1273;
        this.f10894 = j;
        this.f10889 = j2;
        this.f10890 = map;
        this.f10897 = num2;
        this.f10892 = str2;
        this.f10896 = bArr;
        this.f10895 = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3245) {
            C3245 c3245 = (C3245) obj;
            if (this.f10893.equals(c3245.f10893)) {
                Integer num = c3245.f10891;
                Integer num2 = this.f10891;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.f10888.equals(c3245.f10888) && this.f10894 == c3245.f10894 && this.f10889 == c3245.f10889 && this.f10890.equals(c3245.f10890)) {
                        Integer num3 = c3245.f10897;
                        Integer num4 = this.f10897;
                        if (num4 != null ? num4.equals(num3) : num3 == null) {
                            String str = c3245.f10892;
                            String str2 = this.f10892;
                            if (str2 != null ? str2.equals(str) : str == null) {
                                if (Arrays.equals(this.f10896, c3245.f10896) && Arrays.equals(this.f10895, c3245.f10895)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f10893.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f10891;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f10888.hashCode()) * 1000003;
        long j = this.f10894;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f10889;
        int iHashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f10890.hashCode()) * 1000003;
        Integer num2 = this.f10897;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f10892;
        return Arrays.hashCode(this.f10895) ^ ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f10896)) * 1000003);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f10893 + ", code=" + this.f10891 + ", encodedPayload=" + this.f10888 + ", eventMillis=" + this.f10894 + ", uptimeMillis=" + this.f10889 + ", autoMetadata=" + this.f10890 + ", productId=" + this.f10897 + ", pseudonymousId=" + this.f10892 + ", experimentIdsClear=" + Arrays.toString(this.f10896) + ", experimentIdsEncrypted=" + Arrays.toString(this.f10895) + "}";
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final C2457 m5958() {
        C2457 c2457 = new C2457();
        String str = this.f10893;
        if (str == null) {
            C0178.m387("Null transportName");
            return null;
        }
        c2457.f8203 = str;
        c2457.f8206 = this.f10891;
        c2457.f8201 = this.f10897;
        c2457.f8200 = this.f10892;
        c2457.f8207 = this.f10896;
        c2457.f8209 = this.f10895;
        C1273 c1273 = this.f10888;
        if (c1273 == null) {
            C0178.m387("Null encodedPayload");
            return null;
        }
        c2457.f8202 = c1273;
        c2457.f8210 = Long.valueOf(this.f10894);
        c2457.f8204 = Long.valueOf(this.f10889);
        c2457.f8208 = new HashMap(this.f10890);
        return c2457;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final int m5959(String str) {
        String str2 = (String) this.f10890.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final String m5960(String str) {
        String str2 = (String) this.f10890.get(str);
        return str2 == null ? "" : str2;
    }
}
