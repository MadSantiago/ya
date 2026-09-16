package p000;

/* JADX INFO: renamed from: ۦًٛؔۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4619 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Object[] f15242;

    /* JADX INFO: renamed from: ۥۗ */
    public final long[] f15243;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f15244;

    public C4619(int i, long[] jArr, Object[] objArr) {
        this.f15244 = i;
        this.f15243 = jArr;
        this.f15242 = objArr;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C4619 m8010(long j, Object obj) {
        long[] jArr;
        int i;
        Object[] objArr = this.f15242;
        int i2 = 0;
        int i3 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i3++;
            }
        }
        int i4 = i3 + 1;
        long[] jArr2 = new long[i4];
        Object[] objArr2 = new Object[i4];
        if (i4 > 1) {
            int i5 = 0;
            while (true) {
                jArr = this.f15243;
                i = this.f15244;
                if (i2 >= i4 || i5 >= i) {
                    break;
                }
                long j2 = jArr[i5];
                Object obj3 = objArr[i5];
                if (j2 > j) {
                    jArr2[i2] = j;
                    objArr2[i2] = obj;
                    i2++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i2] = j2;
                    objArr2[i2] = obj3;
                    i2++;
                }
                i5++;
            }
            if (i5 == i) {
                jArr2[i3] = j;
                objArr2[i3] = obj;
            } else {
                while (i2 < i4) {
                    long j3 = jArr[i5];
                    Object obj4 = objArr[i5];
                    if (obj4 != null) {
                        jArr2[i2] = j3;
                        objArr2[i2] = obj4;
                        i2++;
                    }
                    i5++;
                }
            }
        } else {
            jArr2[0] = j;
            objArr2[0] = obj;
        }
        return new C4619(i4, jArr2, objArr2);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m8011(long j) {
        int i = this.f15244 - 1;
        if (i != -1) {
            long[] jArr = this.f15243;
            int i2 = 0;
            if (i != 0) {
                while (i2 <= i) {
                    int i3 = (i2 + i) >>> 1;
                    long j2 = jArr[i3] - j;
                    if (j2 < 0) {
                        i2 = i3 + 1;
                    } else {
                        if (j2 <= 0) {
                            return i3;
                        }
                        i = i3 - 1;
                    }
                }
                return -(i2 + 1);
            }
            long j3 = jArr[0];
            if (j3 == j) {
                return 0;
            }
            if (j3 > j) {
                return -2;
            }
        }
        return -1;
    }
}
