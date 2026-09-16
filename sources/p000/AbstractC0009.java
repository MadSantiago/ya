package p000;

import java.io.EOFException;

/* JADX INFO: renamed from: ۥؗ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0009 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final byte[] f2059 = "0123456789abcdef".getBytes(AbstractC4637.f15306);

    /* JADX WARN: Code duplicated, block: B:49:0x0095 A[LOOP:0: B:8:0x0019->B:49:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0094 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۥۗ */
    public static final int m1282(C1270 c1270, C2800 c2800, boolean z) {
        int i;
        int i2;
        int i3;
        C3341 c3341;
        int i4;
        C3341 c3342 = c1270.f4341;
        if (c3342 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = c3342.f11178;
        int i5 = c3342.f11177;
        int i6 = c3342.f11174;
        int[] iArr = c2800.f9354;
        C3341 c3343 = c3342;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (c3343 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            c3343 = c3343.f11176;
                            int i16 = c3343.f11177;
                            byte[] bArr2 = c3343.f11178;
                            i2 = c3343.f11174;
                            if (c3343 == c3342) {
                                i3 = i16;
                                bArr = bArr2;
                                c3343 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i17 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i17;
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i18 = (i10 * (-1)) + i11;
            while (true) {
                int i19 = i5 + 1;
                int i20 = i11 + 1;
                if ((bArr[i5] & 255) == iArr[i11]) {
                    boolean z2 = i20 == i18;
                    if (i19 == i6) {
                        C3341 c3344 = c3343.f11176;
                        i3 = c3344.f11177;
                        byte[] bArr3 = c3344.f11178;
                        i4 = c3344.f11174;
                        if (c3344 != c3342) {
                            c3341 = c3344;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            c3341 = null;
                        }
                    } else {
                        c3341 = c3343;
                        i4 = i6;
                        i3 = i19;
                    }
                    if (z2) {
                        i = iArr[i20];
                        int i21 = i4;
                        c3343 = c3341;
                        i2 = i21;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    c3343 = c3341;
                    i11 = i20;
                }
                return i7;
            }
            if (i >= 0) {
                return i;
            }
            int i110 = i2;
            i8 = -i;
            i5 = i3;
            i6 = i110;
        }
        if (z) {
            return -2;
        }
        return i7;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final String m1283(C1270 c1270, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (c1270.m2670(j2) == 13) {
                String strM2688 = c1270.m2688(j2, AbstractC4637.f15306);
                c1270.skip(2L);
                return strM2688;
            }
        }
        String strM2689 = c1270.m2688(j, AbstractC4637.f15306);
        c1270.skip(1L);
        return strM2689;
    }
}
