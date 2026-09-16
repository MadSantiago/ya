package p000;

/* JADX INFO: renamed from: ۥؘؘؔٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0671 {
    /* JADX INFO: renamed from: ۥؗ */
    public static final int m1491(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final long m1492(long j, long j2) {
        int iM6557 = C3693.m6557(j);
        int iM6556 = C3693.m6556(j);
        int iM6555 = C3693.m6555(j);
        int iM6551 = C3693.m6551(j);
        int iM6558 = C3693.m6557(j2);
        if (iM6558 < iM6557) {
            iM6558 = iM6557;
        }
        if (iM6558 > iM6556) {
            iM6558 = iM6556;
        }
        int iM6559 = C3693.m6556(j2);
        if (iM6559 >= iM6557) {
            iM6557 = iM6559;
        }
        if (iM6557 <= iM6556) {
            iM6556 = iM6557;
        }
        int iM65510 = C3693.m6555(j2);
        if (iM65510 < iM6555) {
            iM65510 = iM6555;
        }
        if (iM65510 > iM6551) {
            iM65510 = iM6551;
        }
        int iM6552 = C3693.m6551(j2);
        if (iM6552 >= iM6555) {
            iM6555 = iM6552;
        }
        if (iM6555 <= iM6551) {
            iM6551 = iM6555;
        }
        return m1496(iM6558, iM6556, iM65510, iM6551);
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final int m1493(long j, int i) {
        int iM6555 = C3693.m6555(j);
        int iM6551 = C3693.m6551(j);
        if (i < iM6555) {
            i = iM6555;
        }
        return i > iM6551 ? iM6551 : i;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static /* synthetic */ long m1494(int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return m1496(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static final long m1495(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int iM1491 = m1491(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iM1492 = m1491(i6);
        if (iM1491 + iM1492 > 31) {
            m1501(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iM1492 - 13;
        return (((long) (i7 & (~(i7 >> 31)))) << 33) | ((long) ((i9 >> 1) + (i9 & 1))) | (((long) i) << 2) | (((long) i3) << (iM1492 + 2)) | (((long) (i8 & (~(i8 >> 31)))) << (iM1492 + 33));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final long m1496(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            AbstractC1236.m2609("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return m1495(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final long m1497(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iM6557 = C3693.m6557(j);
        int iM6556 = C3693.m6556(j);
        if (i < iM6557) {
            i = iM6557;
        }
        if (i <= iM6556) {
            iM6556 = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int iM6555 = C3693.m6555(j);
        int iM6551 = C3693.m6551(j);
        if (i2 < iM6555) {
            i2 = iM6555;
        }
        if (i2 <= iM6551) {
            iM6551 = i2;
        }
        return (((long) iM6556) << 32) | (((long) iM6551) & 4294967295L);
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static final Void m1498(int i) {
        throw new IllegalArgumentException(AbstractC5078.m8681(i, "Can't represent a size of ", " in Constraints"));
    }

    /* JADX INFO: renamed from: ۦِ */
    public static /* synthetic */ long m1499(int i, int i2, int i3, long j) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m1500(i, i2, j);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static final long m1500(int i, int i2, long j) {
        int iM6557 = C3693.m6557(j) + i;
        if (iM6557 < 0) {
            iM6557 = 0;
        }
        int iM6556 = C3693.m6556(j);
        if (iM6556 != Integer.MAX_VALUE && (iM6556 = iM6556 + i) < 0) {
            iM6556 = 0;
        }
        int iM6555 = C3693.m6555(j) + i2;
        if (iM6555 < 0) {
            iM6555 = 0;
        }
        int iM6551 = C3693.m6551(j);
        return m1496(iM6557, iM6556, iM6555, (iM6551 == Integer.MAX_VALUE || (iM6551 = iM6551 + i2) >= 0) ? iM6551 : 0);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static final void m1501(int i, int i2) {
        throw new IllegalArgumentException("Can't represent a width of " + i + " and height of " + i2 + " in Constraints");
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static final int m1502(long j, int i) {
        int iM6557 = C3693.m6557(j);
        int iM6556 = C3693.m6556(j);
        if (i < iM6557) {
            i = iM6557;
        }
        return i > iM6556 ? iM6556 : i;
    }
}
