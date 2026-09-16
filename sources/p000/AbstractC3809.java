package p000;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: ۦٍٍؘؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3809 {
    /* JADX INFO: renamed from: ۥؗ */
    public static final int m6808(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((C4356) arrayList.get(i4)).f14359;
            if (i5 < 0) {
                i5 += i2;
            }
            int iM6879 = AbstractC3831.m6879(i5, i);
            if (iM6879 < 0) {
                i3 = i4 + 1;
            } else {
                if (iM6879 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final void m6809() {
        throw new ConcurrentModificationException();
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final void m6810(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final int m6811(ArrayList arrayList, int i, int i2) {
        int iM6808 = m6808(arrayList, i, i2);
        return iM6808 >= 0 ? iM6808 : -(iM6808 + 1);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final C2575 m6812(C2575 c2575) {
        if (!(c2575 instanceof C2575)) {
            c2575 = null;
        }
        if (c2575 != null) {
            return c2575;
        }
        AbstractC5508.m9200("Inconsistent composition");
        C1078.m2274();
        return null;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final int m6813(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }
}
