package p000;

/* JADX INFO: renamed from: ۦًؙۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3693 {

    /* JADX INFO: renamed from: ۥۣ */
    public final long f12325;

    public /* synthetic */ C3693(long j) {
        this.f12325 = j;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final boolean m6547(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final boolean m6548(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final boolean m6549(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static /* synthetic */ long m6550(long j, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = m6557(j);
        }
        if ((i5 & 2) != 0) {
            i2 = m6556(j);
        }
        if ((i5 & 4) != 0) {
            i3 = m6555(j);
        }
        if ((i5 & 8) != 0) {
            i4 = m6551(j);
        }
        return m6552(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static final int m6551(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final long m6552(int i, int i2, int i3, int i4) {
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            AbstractC1236.m2609("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return AbstractC0671.m1495(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final boolean m6553(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static String m6554(long j) {
        int iM6556 = m6556(j);
        String strValueOf = iM6556 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM6556);
        int iM6551 = m6551(j);
        String strValueOf2 = iM6551 != Integer.MAX_VALUE ? String.valueOf(iM6551) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(m6557(j));
        sb.append(", maxWidth = ");
        sb.append(strValueOf);
        sb.append(", minHeight = ");
        sb.append(m6555(j));
        sb.append(", maxHeight = ");
        return AbstractC5078.m8678(sb, strValueOf2, ')');
    }

    /* JADX INFO: renamed from: ۦِ */
    public static final int m6555(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static final int m6556(long j) {
        int i = (int) (3 & j);
        int i2 = (int) (j >> 33);
        int i3 = i2 & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static final int m6557(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static final boolean m6558(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1;
        int i3 = ((int) (j >> 2)) & i2;
        int i4 = ((int) (j >> 33)) & i2;
        return i3 == (i4 == 0 ? Integer.MAX_VALUE : i4 - 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3693) {
            return this.f12325 == ((C3693) obj).f12325;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12325);
    }

    public final String toString() {
        return m6554(this.f12325);
    }
}
