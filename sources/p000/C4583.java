package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۦؘؙٚ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4583 extends AbstractC4273 {

    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC4258 f15118;

    /* JADX INFO: renamed from: ۥُ */
    public final byte[] f15119;

    /* JADX INFO: renamed from: ۥّ */
    public final String f15120;

    /* JADX INFO: renamed from: ۥۗ */
    public final Integer f15121;

    /* JADX INFO: renamed from: ۥۜ */
    public final AbstractC2124 f15122;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f15123;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f15124;

    /* JADX INFO: renamed from: ۦٛ */
    public final AbstractC0134 f15125;

    /* JADX INFO: renamed from: ۦۙ */
    public final long f15126;

    public C4583(long j, Integer num, AbstractC4258 abstractC4258, long j2, byte[] bArr, String str, long j3, AbstractC2124 abstractC2124, AbstractC0134 abstractC0134) {
        this.f15123 = j;
        this.f15121 = num;
        this.f15118 = abstractC4258;
        this.f15124 = j2;
        this.f15119 = bArr;
        this.f15120 = str;
        this.f15126 = j3;
        this.f15122 = abstractC2124;
        this.f15125 = abstractC0134;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4273) {
            AbstractC4273 abstractC4273 = (AbstractC4273) obj;
            C4583 c4583 = (C4583) abstractC4273;
            if (this.f15123 == c4583.f15123) {
                Integer num = c4583.f15121;
                Integer num2 = this.f15121;
                if (num2 != null ? num2.equals(num) : num == null) {
                    AbstractC4258 abstractC4258 = c4583.f15118;
                    AbstractC4258 abstractC4259 = this.f15118;
                    if (abstractC4259 != null ? abstractC4259.equals(abstractC4258) : abstractC4258 == null) {
                        if (this.f15124 == c4583.f15124) {
                            if (Arrays.equals(this.f15119, abstractC4273 instanceof C4583 ? ((C4583) abstractC4273).f15119 : c4583.f15119)) {
                                String str = c4583.f15120;
                                String str2 = this.f15120;
                                if (str2 != null ? str2.equals(str) : str == null) {
                                    if (this.f15126 == c4583.f15126) {
                                        AbstractC2124 abstractC2124 = c4583.f15122;
                                        AbstractC2124 abstractC2125 = this.f15122;
                                        if (abstractC2125 != null ? abstractC2125.equals(abstractC2124) : abstractC2124 == null) {
                                            AbstractC0134 abstractC0134 = c4583.f15125;
                                            AbstractC0134 abstractC0135 = this.f15125;
                                            if (abstractC0135 != null ? abstractC0135.equals(abstractC0134) : abstractC0134 == null) {
                                                return true;
                                            }
                                        }
                                    }
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
        long j = this.f15123;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f15121;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        AbstractC4258 abstractC4258 = this.f15118;
        int iHashCode2 = (iHashCode ^ (abstractC4258 == null ? 0 : abstractC4258.hashCode())) * 1000003;
        long j2 = this.f15124;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f15119)) * 1000003;
        String str = this.f15120;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f15126;
        int i2 = (iHashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        AbstractC2124 abstractC2124 = this.f15122;
        int iHashCode5 = (i2 ^ (abstractC2124 == null ? 0 : abstractC2124.hashCode())) * 1000003;
        AbstractC0134 abstractC0134 = this.f15125;
        return iHashCode5 ^ (abstractC0134 != null ? abstractC0134.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f15123 + ", eventCode=" + this.f15121 + ", complianceData=" + this.f15118 + ", eventUptimeMs=" + this.f15124 + ", sourceExtension=" + Arrays.toString(this.f15119) + ", sourceExtensionJsonProto3=" + this.f15120 + ", timezoneOffsetSeconds=" + this.f15126 + ", networkConnectionInfo=" + this.f15122 + ", experimentIds=" + this.f15125 + "}";
    }
}
