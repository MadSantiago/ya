package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۦۖؔۛۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4912 extends AbstractC5746 {

    /* JADX INFO: renamed from: ۥّ */
    public int f16210;

    public C4912(int i) {
        this.f18948 = AbstractC5064.f16815;
        this.f18947 = AbstractC5291.f17428;
        this.f18945 = AbstractC2164.f7137;
        if (i >= 0) {
            m8316(AbstractC5064.m8659(i));
        } else {
            AbstractC2552.m4814("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m8314() {
        this.f18946 = 0;
        long[] jArr = this.f18948;
        if (jArr != AbstractC5064.f16815) {
            AbstractC0246.m508(-9187201950435737472L, jArr);
            long[] jArr2 = this.f18948;
            int i = this.f18949;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        Arrays.fill(this.f18945, 0, this.f18949, (Object) null);
        this.f16210 = AbstractC5064.m8658(this.f18949) - this.f18946;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final int m8315(int i) {
        int i2 = this.f18949;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f18948;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m8316(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, AbstractC5064.m8656(i)) : 0;
        this.f18949 = iMax;
        if (iMax == 0) {
            jArr = AbstractC5064.f16815;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f18948 = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f16210 = AbstractC5064.m8658(this.f18949) - this.f18946;
        this.f18947 = new int[iMax];
        this.f18945 = new Object[iMax];
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final Object m8317(int i) {
        this.f18946--;
        long[] jArr = this.f18948;
        int i2 = this.f18949;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        Object[] objArr = this.f18945;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final int m8318(int i) {
        long j;
        long j2;
        int i2;
        long j3;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        int i3 = -862048943;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i4 = iHashCode ^ (iHashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.f18949;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr2 = this.f18948;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            int i12 = 1;
            long j4 = ((jArr2[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr2[i10] >>> i11);
            long j5 = i6;
            int i13 = i9;
            int i14 = 0;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j7) >> 3)) & i7;
                int i15 = i3;
                int i16 = i14;
                if (this.f18947[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i3 = i15;
                i14 = i16;
            }
            int i17 = i3;
            int i18 = i14;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iM8315 = m8315(i5);
                long j8 = 255;
                if (this.f16210 != 0 || ((this.f18948[iM8315 >> 3] >> ((iM8315 & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i19 = this.f18949;
                    if (i19 > 8) {
                        j3 = 128;
                        if (Long.compareUnsigned(((long) this.f18946) * 32, ((long) i19) * 25) <= 0) {
                            long[] jArr3 = this.f18948;
                            int i20 = this.f18949;
                            int[] iArr2 = this.f18947;
                            Object[] objArr2 = this.f18945;
                            int i21 = (i20 + 7) >> 3;
                            int i22 = i18;
                            while (i22 < i21) {
                                long j9 = j8;
                                long j10 = jArr3[i22] & (-9187201950435737472L);
                                jArr3[i22] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i22++;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int length = jArr3.length;
                            int i23 = length - 1;
                            int i24 = length - 2;
                            long j11 = 72057594037927935L;
                            jArr3[i24] = (jArr3[i24] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[i23] = jArr3[i18];
                            int i25 = i18;
                            while (i25 != i20) {
                                int i26 = i25 >> 3;
                                int i27 = (i25 & 7) << 3;
                                long j12 = (jArr3[i26] >> i27) & j;
                                if (j12 != 128 && j12 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i25]) * i17;
                                    int i28 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i29 = i28 >>> 7;
                                    int iM8316 = m8315(i29);
                                    int i30 = i29 & i20;
                                    if (((iM8316 - i30) & i20) / 8 == ((i25 - i30) & i20) / 8) {
                                        long j13 = j11;
                                        jArr3[i26] = (((long) (i28 & 127)) << i27) | ((~(j << i27)) & jArr3[i26]);
                                        jArr3[jArr3.length - i12] = (jArr3[i18] & j13) | Long.MIN_VALUE;
                                        i25++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i31 = iM8316 >> 3;
                                        long j15 = jArr3[i31];
                                        int i32 = (iM8316 & 7) << 3;
                                        if (((j15 >> i32) & j) == 128) {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr3[i31] = ((~(j << i32)) & j15) | (((long) (i28 & 127)) << i32);
                                            jArr3[i26] = (jArr3[i26] & (~(j << i27))) | (128 << i27);
                                            iArr[iM8316] = iArr[i25];
                                            iArr[i25] = i18;
                                            objArr[iM8316] = objArr[i25];
                                            objArr[i25] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr3[i31] = (((long) (i28 & 127)) << i32) | ((~(j << i32)) & j15);
                                            int i33 = iArr[iM8316];
                                            iArr[iM8316] = iArr[i25];
                                            iArr[i25] = i33;
                                            Object obj = objArr[iM8316];
                                            objArr[iM8316] = objArr[i25];
                                            objArr[i25] = obj;
                                            i25--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i18] & j14) | Long.MIN_VALUE;
                                        i25++;
                                        j11 = j14;
                                        i12 = i12;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i25++;
                                }
                            }
                            i2 = i12;
                            this.f16210 = AbstractC5064.m8658(this.f18949) - this.f18946;
                        }
                        iM8315 = m8315(i5);
                    } else {
                        j3 = 128;
                    }
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    int iM8657 = AbstractC5064.m8657(this.f18949);
                    long[] jArr4 = this.f18948;
                    int[] iArr3 = this.f18947;
                    Object[] objArr3 = this.f18945;
                    int i34 = this.f18949;
                    m8316(iM8657);
                    long[] jArr5 = this.f18948;
                    int[] iArr4 = this.f18947;
                    Object[] objArr4 = this.f18945;
                    int i35 = this.f18949;
                    int i36 = i18;
                    while (i36 < i34) {
                        if (((jArr4[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < j3) {
                            int i37 = iArr3[i36];
                            int iHashCode3 = Integer.hashCode(i37) * i17;
                            int i38 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM8317 = m8315(i38 >>> 7);
                            long j16 = i38 & 127;
                            int i39 = iM8317 >> 3;
                            int i40 = (iM8317 & 7) << 3;
                            jArr = jArr5;
                            long j17 = (jArr5[i39] & (~(255 << i40))) | (j16 << i40);
                            jArr[i39] = j17;
                            jArr[(((iM8317 - 7) & i35) + (i35 & 7)) >> 3] = j17;
                            iArr4[iM8317] = i37;
                            objArr4[iM8317] = objArr3[i36];
                        } else {
                            jArr = jArr5;
                        }
                        i36++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iM8315 = m8315(i5);
                }
                this.f18946++;
                int i41 = this.f16210;
                long[] jArr6 = this.f18948;
                int i42 = iM8315 >> 3;
                long j18 = jArr6[i42];
                int i43 = (iM8315 & 7) << 3;
                if (((j18 >> i43) & j) != j3) {
                    i2 = i18;
                }
                this.f16210 = i41 - i2;
                int i44 = this.f18949;
                long j19 = (j18 & (~(j << i43))) | (j2 << i43);
                jArr6[i42] = j19;
                jArr6[(((iM8315 - 7) & i44) + (i44 & 7)) >> 3] = j19;
                return iM8315;
            }
            i9 = i13 + 8;
            i8 = (i8 + i9) & i7;
            i3 = i17;
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m8319(int i, Object obj) {
        int iM8318 = m8318(i);
        this.f18947[iM8318] = i;
        this.f18945[iM8318] = obj;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final Object m8320(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f18949;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.f18948;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.f18947[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return m8317(iNumberOfTrailingZeros);
        }
        return null;
    }

    public /* synthetic */ C4912() {
        this(6);
    }
}
