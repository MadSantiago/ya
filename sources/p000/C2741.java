package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۥۥؔٛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2741 {

    /* JADX INFO: renamed from: ۥۗ */
    public int f9072;

    /* JADX INFO: renamed from: ۥۣ */
    public long[] f9073;

    public C2741(int i) {
        this.f9073 = i == 0 ? AbstractC2118.f6959 : new long[i];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2741) {
            C2741 c2741 = (C2741) obj;
            int i = c2741.f9072;
            int i2 = this.f9072;
            if (i == i2) {
                long[] jArr = this.f9073;
                long[] jArr2 = c2741.f9073;
                C3046 c3046M7917 = AbstractC4554.m7917(0, i2);
                int i3 = c3046M7917.f6006;
                int i4 = c3046M7917.f6005;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f9073;
        int i = this.f9072;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Long.hashCode(jArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.f9073;
        int i = this.f9072;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m5092(long j) {
        int i = this.f9072 + 1;
        long[] jArrCopyOf = this.f9073;
        if (jArrCopyOf.length < i) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i, (jArrCopyOf.length * 3) / 2));
            this.f9073 = jArrCopyOf;
        }
        int i2 = this.f9072;
        jArrCopyOf[i2] = j;
        this.f9072 = i2 + 1;
    }

    public /* synthetic */ C2741() {
        this(16);
    }
}
