package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۥۥؙؑٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2712 extends AbstractC2758 {

    /* JADX INFO: renamed from: ۥَ */
    public int f8986;

    /* JADX INFO: renamed from: ۥْ */
    public final byte[] f8987;

    /* JADX INFO: renamed from: ۥٓ */
    public int f8988;

    /* JADX INFO: renamed from: ۥٖ */
    public int f8989;

    /* JADX INFO: renamed from: ۥۖ */
    public int f8990 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۦٗ */
    public final int f8991;

    /* JADX INFO: renamed from: ۦۛ */
    public int f8992;

    public C2712(byte[] bArr, int i, int i2, boolean z) {
        this.f8987 = bArr;
        this.f8988 = i2 + i;
        this.f8989 = i;
        this.f8991 = i;
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥؓ */
    public final int mo5038() {
        return m5053();
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥؖ */
    public final int mo5039() throws C3406 {
        if (mo5040()) {
            this.f8992 = 0;
            return 0;
        }
        int iM5053 = m5053();
        this.f8992 = iM5053;
        if ((iM5053 >>> 3) != 0) {
            return iM5053;
        }
        throw new C3406("Protocol message contained an invalid tag (zero).");
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo5040() {
        return this.f8989 == this.f8988;
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥً */
    public final boolean mo5041(int i) throws C3406 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                m5061(8);
                return true;
            }
            if (i2 == 2) {
                m5061(m5053());
                return true;
            }
            if (i2 == 3) {
                m5113();
                mo5050(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw C3406.m6170();
            }
            m5061(4);
            return true;
        }
        int i4 = this.f8988 - this.f8989;
        byte[] bArr = this.f8987;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.f8989;
                this.f8989 = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw C3406.m6168();
        }
        while (i3 < 10) {
            int i6 = this.f8989;
            if (i6 == this.f8988) {
                throw C3406.m6169();
            }
            this.f8989 = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw C3406.m6168();
        return true;
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥَ */
    public final long mo5042() {
        return m5051();
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥْ */
    public final float mo5043() {
        return Float.intBitsToFloat(m5049());
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥٓ */
    public final int mo5044() {
        return m5053();
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥٖ */
    public final int mo5045() {
        return m5049();
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥٙ */
    public final String mo5046() throws C3406 {
        int iM5053 = m5053();
        if (iM5053 > 0) {
            int i = this.f8988;
            int i2 = this.f8989;
            if (iM5053 <= i - i2) {
                String strM8654 = AbstractC0298.f1087.m8654(this.f8987, i2, iM5053);
                this.f8989 += iM5053;
                return strM8654;
            }
        }
        if (iM5053 == 0) {
            return "";
        }
        if (iM5053 <= 0) {
            throw C3406.m6172();
        }
        throw C3406.m6169();
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥۖ */
    public final long mo5047() {
        long jM5051 = m5051();
        return (-(jM5051 & 1)) ^ (jM5051 >>> 1);
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo5048() {
        return this.f8989 - this.f8991;
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final int m5049() throws C3406 {
        int i = this.f8989;
        if (this.f8988 - i < 4) {
            throw C3406.m6169();
        }
        this.f8989 = i + 4;
        byte[] bArr = this.f8987;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo5050(int i) throws C3406 {
        if (this.f8992 != i) {
            throw new C3406("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* JADX INFO: renamed from: ۥۦ */
    public final long m5051() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f8989;
        int i2 = this.f8988;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f8987;
            byte b = bArr[i];
            if (b >= 0) {
                this.f8989 = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.f8989 = i4;
                return j;
            }
        }
        return m5054();
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥۧ */
    public final long mo5052() {
        return m5051();
    }

    /* JADX INFO: renamed from: ۦؖ */
    public final int m5053() {
        int i;
        int i2 = this.f8989;
        int i3 = this.f8988;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f8987;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f8989 = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f8989 = i5;
                return i;
            }
        }
        return (int) m5054();
    }

    /* JADX INFO: renamed from: ۦؗ */
    public final long m5054() throws C3406 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f8989;
            if (i2 == this.f8988) {
                throw C3406.m6169();
            }
            this.f8989 = i2 + 1;
            byte b = this.f8987[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw C3406.m6168();
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final long m5055() throws C3406 {
        int i = this.f8989;
        if (this.f8988 - i < 8) {
            throw C3406.m6169();
        }
        this.f8989 = i + 8;
        byte[] bArr = this.f8987;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۦؚ */
    public final C0533 mo5056() throws C3406 {
        byte[] bArrCopyOfRange;
        int iM5053 = m5053();
        byte[] bArr = this.f8987;
        if (iM5053 > 0) {
            int i = this.f8988;
            int i2 = this.f8989;
            if (iM5053 <= i - i2) {
                C0533 c0533M1185 = C0533.m1185(bArr, i2, iM5053);
                this.f8989 += iM5053;
                return c0533M1185;
            }
        }
        if (iM5053 == 0) {
            return C0533.f1874;
        }
        if (iM5053 > 0) {
            int i3 = this.f8988;
            int i4 = this.f8989;
            if (iM5053 <= i3 - i4) {
                int i5 = iM5053 + i4;
                this.f8989 = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iM5053 <= 0) {
                    throw C3406.m6169();
                }
                if (iM5053 == 0) {
                    throw C3406.m6172();
                }
                bArrCopyOfRange = AbstractC3576.f11898;
            }
        } else {
            if (iM5053 <= 0) {
                throw C3406.m6169();
            }
            if (iM5053 == 0) {
                throw C3406.m6172();
            }
            bArrCopyOfRange = AbstractC3576.f11898;
        }
        C0533 c0533 = C0533.f1874;
        return new C0533(bArrCopyOfRange);
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۦٌ */
    public final double mo5057() {
        return Double.longBitsToDouble(m5055());
    }

    /* JADX INFO: renamed from: ۦُ */
    public final void m5058() {
        int i = this.f8988 + this.f8986;
        this.f8988 = i;
        int i2 = i - this.f8991;
        int i3 = this.f8990;
        if (i2 <= i3) {
            this.f8986 = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f8986 = i4;
        this.f8988 = i - i4;
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۦِ */
    public final int mo5059(int i) {
        if (i < 0) {
            throw C3406.m6172();
        }
        int iMo5048 = mo5048() + i;
        if (iMo5048 < 0) {
            throw new C3406("Failed to parse the message.");
        }
        int i2 = this.f8990;
        if (iMo5048 > i2) {
            throw C3406.m6169();
        }
        this.f8990 = iMo5048;
        m5058();
        return i2;
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۦٕ */
    public final String mo5060() throws C3406 {
        int iM5053 = m5053();
        if (iM5053 > 0) {
            int i = this.f8988;
            int i2 = this.f8989;
            if (iM5053 <= i - i2) {
                String str = new String(this.f8987, i2, iM5053, AbstractC3576.f11899);
                this.f8989 += iM5053;
                return str;
            }
        }
        if (iM5053 == 0) {
            return "";
        }
        if (iM5053 < 0) {
            throw C3406.m6172();
        }
        throw C3406.m6169();
    }

    /* JADX INFO: renamed from: ۦٖ */
    public final void m5061(int i) throws C3406 {
        if (i >= 0) {
            int i2 = this.f8988;
            int i3 = this.f8989;
            if (i <= i2 - i3) {
                this.f8989 = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw C3406.m6169();
        }
        throw C3406.m6172();
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۦٗ */
    public final long mo5062() {
        return m5055();
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo5063(int i) {
        this.f8990 = i;
        m5058();
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۦۗ */
    public final boolean mo5064() {
        return m5051() != 0;
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۦۚ */
    public final int mo5065() {
        return m5053();
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۦۛ */
    public final int mo5066() {
        int iM5053 = m5053();
        return (-(iM5053 & 1)) ^ (iM5053 >>> 1);
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۦ۟ */
    public final long mo5067() {
        return m5055();
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۦۨ */
    public final int mo5068() {
        return m5049();
    }
}
