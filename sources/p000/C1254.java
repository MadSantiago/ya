package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۥٓؒٓۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1254 {

    /* JADX INFO: renamed from: ۥؗ */
    public int[] f4315;

    /* JADX INFO: renamed from: ۥُ */
    public int f4316;

    /* JADX INFO: renamed from: ۥّ */
    public int f4317;

    /* JADX INFO: renamed from: ۥۗ */
    public Object[] f4318;

    /* JADX INFO: renamed from: ۥۣ */
    public long[] f4319;

    /* JADX INFO: renamed from: ۦؑ */
    public int f4320;

    public C1254(int i) {
        this.f4319 = AbstractC5064.f16815;
        this.f4318 = AbstractC2164.f7137;
        this.f4315 = AbstractC5291.f17428;
        if (i >= 0) {
            m2650(AbstractC5064.m8659(i));
        } else {
            AbstractC2552.m4814("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064 A[LOOP:0: B:14:0x0023->B:28:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0067 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1254)) {
            return false;
        }
        C1254 c1254 = (C1254) obj;
        if (c1254.f4316 != this.f4316) {
            return false;
        }
        Object[] objArr = this.f4318;
        int[] iArr = this.f4315;
        long[] jArr = this.f4319;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            int i5 = iArr[i4];
                            int iM2654 = c1254.m2654(obj2);
                            if (iM2654 < 0 || i5 != c1254.f4315[iM2654]) {
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = this.f4318;
        int[] iArr = this.f4315;
        long[] jArr = this.f4319;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        iHashCode += Integer.hashCode(iArr[i4]) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT, PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:9:0x001e->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:25:0x006f BREAK  A[LOOP:0: B:9:0x001e->B:24:0x006c], SYNTHETIC] */
    public final String toString() {
        if (this.f4316 == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f4318;
        int[] iArr = this.f4315;
        long[] jArr = this.f4319;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            int i6 = iArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i6);
                            i2++;
                            if (i2 < this.f4316) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final int m2649(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        Object[] objArr;
        int i = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.f4320;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr2 = this.f4319;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j4 = ((jArr2[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr2[i8] >>> i9);
            long j5 = i4;
            int i10 = i4;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i6 + (Long.numberOfTrailingZeros(j7) >> 3)) & i5;
                int i11 = i;
                if (AbstractC3831.m6874(this.f4318[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i = i11;
            }
            int i12 = i;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iM2652 = m2652(i3);
                long j8 = 255;
                if (this.f4317 != 0 || ((this.f4319[iM2652 >> 3] >> ((iM2652 & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i13 = this.f4320;
                    if (i13 > 8) {
                        int i14 = 8;
                        if (Long.compareUnsigned(((long) this.f4316) * 32, ((long) i13) * 25) <= 0) {
                            long[] jArr3 = this.f4319;
                            int i15 = this.f4320;
                            Object[] objArr2 = this.f4318;
                            int[] iArr = this.f4315;
                            j3 = 128;
                            int i16 = (i15 + 7) >> 3;
                            int i17 = 0;
                            while (i17 < i16) {
                                long j9 = j8;
                                long j10 = jArr3[i17] & (-9187201950435737472L);
                                jArr3[i17] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i17++;
                                i14 = i14;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i18 = i14;
                            int length = jArr3.length;
                            int i19 = length - 1;
                            int i20 = length - 2;
                            long j11 = 72057594037927935L;
                            jArr3[i20] = (jArr3[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[i19] = jArr3[0];
                            int i21 = 0;
                            while (i21 != i15) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j12 = (jArr3[i22] >> i23) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj2 = objArr2[i21];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i12;
                                    int i24 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i25 = i24 >>> 7;
                                    int iM2653 = m2652(i25);
                                    int i26 = i25 & i15;
                                    long j13 = j11;
                                    if (((iM2653 - i26) & i15) / 8 == ((i21 - i26) & i15) / i18) {
                                        jArr3[i22] = (((long) (i24 & 127)) << i23) | (jArr3[i22] & (~(j << i23)));
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        i18 = i18;
                                        j11 = j13;
                                    } else {
                                        int i27 = i18;
                                        int i28 = iM2653 >> 3;
                                        long j14 = jArr3[i28];
                                        int i29 = (iM2653 & 7) << 3;
                                        if (((j14 >> i29) & j) == 128) {
                                            objArr = objArr2;
                                            jArr3[i28] = ((~(j << i29)) & j14) | (((long) (i24 & 127)) << i29);
                                            jArr3[i22] = (jArr3[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[iM2653] = objArr[i21];
                                            objArr[i21] = null;
                                            iArr[iM2653] = iArr[i21];
                                            iArr[i21] = 0;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i28] = (((long) (i24 & 127)) << i29) | ((~(j << i29)) & j14);
                                            Object obj3 = objArr[iM2653];
                                            objArr[iM2653] = objArr[i21];
                                            objArr[i21] = obj3;
                                            int i30 = iArr[iM2653];
                                            iArr[iM2653] = iArr[i21];
                                            iArr[i21] = i30;
                                            i21--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        i15 = i15;
                                        i18 = i27;
                                        j11 = j13;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.f4317 = AbstractC5064.m8658(this.f4320) - this.f4316;
                        }
                        iM2652 = m2652(i3);
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int iM8657 = AbstractC5064.m8657(this.f4320);
                    long[] jArr4 = this.f4319;
                    Object[] objArr3 = this.f4318;
                    int[] iArr2 = this.f4315;
                    int i31 = this.f4320;
                    m2650(iM8657);
                    long[] jArr5 = this.f4319;
                    Object[] objArr4 = this.f4318;
                    int[] iArr3 = this.f4315;
                    int i32 = this.f4320;
                    int i33 = 0;
                    while (i33 < i31) {
                        if (((jArr4[i33 >> 3] >> ((i33 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i33];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i12;
                            int i34 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM2654 = m2652(i34 >>> 7);
                            jArr = jArr5;
                            long j15 = i34 & 127;
                            int i35 = iM2654 >> 3;
                            int i36 = (iM2654 & 7) << 3;
                            long j16 = (jArr[i35] & (~(255 << i36))) | (j15 << i36);
                            jArr[i35] = j16;
                            jArr[(((iM2654 - 7) & i32) + (i32 & 7)) >> 3] = j16;
                            objArr4[iM2654] = obj4;
                            iArr3[iM2654] = iArr2[i33];
                        } else {
                            jArr = jArr5;
                        }
                        i33++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iM2652 = m2652(i3);
                }
                this.f4316++;
                int i37 = this.f4317;
                long[] jArr6 = this.f4319;
                int i38 = iM2652 >> 3;
                long j17 = jArr6[i38];
                int i39 = (iM2652 & 7) << 3;
                this.f4317 = i37 - (((j17 >> i39) & j) == j3 ? 1 : 0);
                int i40 = this.f4320;
                long j18 = (j17 & (~(j << i39))) | (j2 << i39);
                jArr6[i38] = j18;
                jArr6[(((iM2652 - 7) & i40) + (i40 & 7)) >> 3] = j18;
                return ~iM2652;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i4 = i10;
            i = i12;
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m2650(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, AbstractC5064.m8656(i)) : 0;
        this.f4320 = iMax;
        if (iMax == 0) {
            jArr = AbstractC5064.f16815;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f4319 = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f4317 = AbstractC5064.m8658(this.f4320) - this.f4316;
        this.f4318 = new Object[iMax];
        this.f4315 = new int[iMax];
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m2651(int i) {
        this.f4316--;
        long[] jArr = this.f4319;
        int i2 = this.f4320;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.f4318[i] = null;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final int m2652(int i) {
        int i2 = this.f4320;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f4319;
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

    /* JADX INFO: renamed from: ۥۣ */
    public final void m2653() {
        this.f4316 = 0;
        long[] jArr = this.f4319;
        if (jArr != AbstractC5064.f16815) {
            AbstractC0246.m508(-9187201950435737472L, jArr);
            long[] jArr2 = this.f4319;
            int i = this.f4320;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        Arrays.fill(this.f4318, 0, this.f4320, (Object) null);
        this.f4317 = AbstractC5064.m8658(this.f4320) - this.f4316;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final int m2654(Object obj) {
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f4320;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.f4319;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (AbstractC3831.m6874(this.f4318[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m2655(int i, Object obj) {
        int iM2649 = m2649(obj);
        if (iM2649 < 0) {
            iM2649 = ~iM2649;
        }
        this.f4318[iM2649] = obj;
        this.f4315[iM2649] = i;
    }

    public /* synthetic */ C1254() {
        this(6);
    }
}
