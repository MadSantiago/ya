package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ۦَۣؗؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3416 implements Comparable, Serializable {

    /* JADX INFO: renamed from: ۥْ */
    public static final C3416 f11373 = new C3416(-31557014167219200L, 0);

    /* JADX INFO: renamed from: ۥٓ */
    public static final C3416 f11374 = new C3416(31556889864403199L, 999999999);

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f11375;

    /* JADX INFO: renamed from: ۦۨ */
    public final long f11376;

    public C3416(long j, int i) {
        this.f11376 = j;
        this.f11375 = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            C1078.m2272("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3416 c3416 = (C3416) obj;
        int iM6844 = AbstractC3831.m6844(this.f11376, c3416.f11376);
        return iM6844 != 0 ? iM6844 : AbstractC3831.m6879(this.f11375, c3416.f11375);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3416)) {
            return false;
        }
        C3416 c3416 = (C3416) obj;
        return this.f11376 == c3416.f11376 && this.f11375 == c3416.f11375;
    }

    public final int hashCode() {
        return (this.f11375 * 51) + Long.hashCode(this.f11376);
    }

    public final String toString() {
        long j;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j2 = this.f11376;
        long j3 = j2 / 86400;
        if ((j2 ^ 86400) < 0 && j3 * 86400 != j2) {
            j3--;
        }
        long j4 = j2 % 86400;
        int i = (int) (j4 + (86400 & (((j4 ^ 86400) & ((-j4) | j4)) >> 63)));
        long j5 = 719468 + j3;
        if (j5 < 0) {
            long j6 = ((j3 + 719469) / 146097) - 1;
            j = j6 * 400;
            j5 += (-j6) * 146097;
        } else {
            j = 0;
        }
        long j7 = ((400 * j5) + 591) / 146097;
        long j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        if (j8 < 0) {
            j7--;
            j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        }
        int i2 = (int) j8;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        int i6 = (int) (j7 + j + ((long) (i3 / 10)));
        int i7 = i / 3600;
        int i8 = i - (i7 * 3600);
        int i9 = i8 / 60;
        int i10 = i8 - (i9 * 60);
        int i11 = 0;
        if (Math.abs(i6) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i6 >= 0) {
                sb2.append(i6 + 10000);
                sb2.deleteCharAt(0);
            } else {
                sb2.append(i6 - 10000);
                sb2.deleteCharAt(1);
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i6 >= 10000) {
                sb.append('+');
            }
            sb.append(i6);
        }
        sb.append('-');
        AbstractC3801.m6759(sb, sb, i4);
        sb.append('-');
        AbstractC3801.m6759(sb, sb, i5);
        sb.append('T');
        AbstractC3801.m6759(sb, sb, i7);
        sb.append(':');
        AbstractC3801.m6759(sb, sb, i9);
        sb.append(':');
        AbstractC3801.m6759(sb, sb, i10);
        int i12 = this.f11375;
        if (i12 != 0) {
            sb.append('.');
            while (true) {
                iArr = AbstractC3801.f12617;
                int i13 = i11 + 1;
                if (i12 % iArr[i13] != 0) {
                    break;
                }
                i11 = i13;
            }
            int i14 = i11 - (i11 % 3);
            sb.append(String.valueOf((i12 / iArr[i14]) + iArr[9 - i14]).substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }
}
