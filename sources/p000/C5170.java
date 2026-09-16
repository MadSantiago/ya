package p000;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: renamed from: ۦَۚؔٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5170 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f17112;

    /* JADX INFO: renamed from: ۥُ */
    public final int f17113;

    /* JADX INFO: renamed from: ۥّ */
    public final int f17114;

    /* JADX INFO: renamed from: ۥۗ */
    public final char[] f17115;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f17116;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f17117;

    /* JADX INFO: renamed from: ۦۙ */
    public final byte[] f17118;

    public C5170(String str, char[] cArr) {
        this.f17116 = str;
        cArr.getClass();
        this.f17115 = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int iM5803 = C3133.m5803(length);
            this.f17117 = iM5803;
            int iMin = Math.min(8, Integer.lowestOneBit(iM5803));
            try {
                this.f17113 = 8 / iMin;
                this.f17114 = iM5803 / iMin;
                this.f17112 = cArr.length - 1;
                byte[] bArr = new byte[128];
                Arrays.fill(bArr, (byte) -1);
                for (int i = 0; i < cArr.length; i++) {
                    char c = cArr[i];
                    if (!(c < 128)) {
                        C1078.m2272(C5063.m8650("Non-ASCII character: %s", Character.valueOf(c)));
                        throw null;
                    }
                    if (!(bArr[c] == -1)) {
                        C1078.m2272(C5063.m8650("Duplicate character: %s", Character.valueOf(c)));
                        throw null;
                    }
                    bArr[c] = (byte) i;
                }
                this.f17118 = bArr;
                boolean[] zArr = new boolean[this.f17113];
                for (int i2 = 0; i2 < this.f17114; i2++) {
                    int i3 = this.f17117;
                    RoundingMode roundingMode2 = RoundingMode.CEILING;
                    zArr[C3133.m5802(i2 * 8, i3)] = true;
                }
            } catch (ArithmeticException e) {
                String str2 = new String(cArr);
                throw new IllegalArgumentException(str2.length() != 0 ? "Illegal alphabet ".concat(str2) : new String("Illegal alphabet "), e);
            }
        } catch (ArithmeticException e2) {
            int length2 = cArr.length;
            StringBuilder sb = new StringBuilder(35);
            sb.append("Illegal alphabet length ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString(), e2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5170) {
            return Arrays.equals(this.f17115, ((C5170) obj).f17115);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17115);
    }

    public final String toString() {
        return this.f17116;
    }
}
