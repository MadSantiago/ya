package p000;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: ۥ۟ؖۜۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2464 extends AbstractC4650 {

    /* JADX INFO: renamed from: ۥّ */
    public int f8227;

    /* JADX INFO: renamed from: ۥۜ */
    public int f8228;

    /* JADX INFO: renamed from: ۦؑ */
    public final byte[] f8229;

    /* JADX INFO: renamed from: ۦٛ */
    public int f8230 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۥُ */
    public int f8226 = 0;

    /* JADX INFO: renamed from: ۦۙ */
    public int f8231 = 0;

    public /* synthetic */ C2464(byte[] bArr) {
        this.f8229 = bArr;
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥؓ */
    public final int mo4593() {
        return m4594();
    }

    /* JADX INFO: renamed from: ۥؔ */
    public final int m4594() {
        int i;
        int i2 = this.f8231;
        int i3 = this.f8226;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f8229;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f8231 = i4;
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
                this.f8231 = i5;
                return i;
            }
        }
        return (int) m4610();
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥؖ */
    public final byte[] mo4595() {
        return m4620(m4594());
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo4596() {
        int i = this.f8230;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.f8231;
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥً */
    public final int mo4597() {
        return m4614();
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥَ */
    public final int mo4598() {
        return m4594();
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥُ */
    public final int mo4599() {
        return this.f8231;
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥّ */
    public final int mo4600(byte[] bArr, int i, int i2) {
        if ((bArr.length - i) - i2 < 0 || (i | i2) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int iMin = Math.min(i2, this.f8226 - this.f8231);
        if (iMin == 0) {
            return -1;
        }
        System.arraycopy(this.f8229, this.f8231, bArr, i, iMin);
        this.f8231 += iMin;
        return iMin;
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥْ */
    public final long mo4601() {
        return mo4613();
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥٓ */
    public final long mo4602() {
        return mo4613();
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥٕ */
    public final int mo4603() {
        return AbstractC4650.m8026(m4594());
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥٖ */
    public final long mo4604() {
        return m4618();
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥٙ */
    public final C4585 mo4605() throws C5463 {
        int iM4594 = m4594();
        if (iM4594 > 0) {
            int i = this.f8226;
            int i2 = this.f8231;
            if (iM4594 <= i - i2) {
                C4585 c4585M7598 = AbstractC4314.m7598(this.f8229, i2, iM4594);
                this.f8231 += iM4594;
                return c4585M7598;
            }
        }
        if (iM4594 == 0) {
            return AbstractC4314.f14260;
        }
        byte[] bArrM4620 = m4620(iM4594);
        C4585 c4585 = AbstractC4314.f14260;
        return bArrM4620.length == 0 ? AbstractC4314.f14260 : new C4585(bArrM4620);
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥۖ */
    public final String mo4606() throws C5463 {
        int iM4594 = m4594();
        if (iM4594 > 0) {
            int i = this.f8226;
            int i2 = this.f8231;
            if (iM4594 <= i - i2) {
                String str = new String(this.f8229, i2, iM4594, StandardCharsets.UTF_8);
                this.f8231 += iM4594;
                return str;
            }
        }
        if (iM4594 == 0) {
            return "";
        }
        if (iM4594 < 0) {
            C2316.m4358("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        C2316.m4358("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo4607(int i) {
        this.f8230 = i;
        int i2 = this.f8226 + this.f8227;
        this.f8226 = i2;
        if (i2 <= i) {
            this.f8227 = 0;
            return;
        }
        int i3 = i2 - i;
        this.f8227 = i3;
        this.f8226 = i2 - i3;
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥۙ */
    public final long mo4608() {
        return AbstractC4650.m8027(mo4613());
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥۣ */
    public final int mo4609(int i) throws C5463 {
        if (i < 0) {
            C2316.m4358("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = i + this.f8231;
        if (i2 < 0) {
            C2316.m4358("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i3 = this.f8230;
        if (i2 > i3) {
            C2316.m4358("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.f8230 = i2;
        int i4 = this.f8226 + this.f8227;
        this.f8226 = i4;
        if (i4 <= i2) {
            this.f8227 = 0;
            return i3;
        }
        int i5 = i4 - i2;
        this.f8227 = i5;
        this.f8226 = i4 - i5;
        return i3;
    }

    /* JADX INFO: renamed from: ۥۦ */
    public final long m4610() throws C5463 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f8231;
            if (i2 == this.f8226) {
                C2316.m4358("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0L;
            }
            this.f8231 = i2 + 1;
            byte b = this.f8229[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        C2316.m4358("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥۧ */
    public final int mo4611() {
        return m4594();
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۦؑ */
    public final boolean mo4612() {
        return this.f8231 == this.f8226;
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۦؖ */
    public final long mo4613() {
        long j;
        long j2;
        long j3;
        int i = this.f8231;
        int i2 = this.f8226;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f8229;
            byte b = bArr[i];
            if (b >= 0) {
                this.f8231 = i3;
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
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j4;
                        } else {
                            i6 = i + 5;
                            long j5 = ((long) i9) ^ (((long) bArr[i8]) << 28);
                            if (j5 >= 0) {
                                j2 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j6 = j5 ^ (((long) bArr[i6]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i6 = i + 7;
                                    j5 = j6 ^ (((long) bArr[i10]) << 42);
                                    if (j5 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j6 = j5 ^ (((long) bArr[i6]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i6 = i + 9;
                                            j5 = j6 ^ (((long) bArr[i10]) << 56);
                                            if (j5 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                int i11 = i + 10;
                                                long j7 = j5 ^ (((long) bArr[i6]) << 63);
                                                if (j7 >= 0) {
                                                    j = j7 ^ (-9151873028817141888L);
                                                    i4 = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j6 ^ j3;
                                i4 = i10;
                            }
                            j = j5 ^ j2;
                        }
                    }
                    i4 = i6;
                }
                this.f8231 = i4;
                return j;
            }
        }
        return m4610();
    }

    /* JADX INFO: renamed from: ۦؗ */
    public final int m4614() throws C5463 {
        int i = this.f8231;
        if (this.f8226 - i < 4) {
            C2316.m4358("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.f8231 = i + 4;
        byte[] bArr = this.f8229;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۦؙ */
    public final int mo4615() {
        return m4594();
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۦؚ */
    public final int mo4616() throws C5463 {
        if (mo4612()) {
            this.f8228 = 0;
            return 0;
        }
        int iM4594 = m4594();
        this.f8228 = iM4594;
        if ((iM4594 >>> 3) != 0) {
            return iM4594;
        }
        C2316.m4358("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo4617(int i) throws C5463 {
        if (this.f8228 == i) {
            return;
        }
        C2316.m4358("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: renamed from: ۦُ */
    public final long m4618() throws C5463 {
        int i = this.f8231;
        if (this.f8226 - i < 8) {
            C2316.m4358("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0L;
        }
        this.f8231 = i + 8;
        byte[] bArr = this.f8229;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        return ((((long) bArr[i + 7]) & 255) << 56) | j2 | (j & 255) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۦٕ */
    public final String mo4619() throws C5463 {
        int iM4594 = m4594();
        if (iM4594 > 0) {
            int i = this.f8226;
            int i2 = this.f8231;
            if (iM4594 <= i - i2) {
                String strM8428 = AbstractC5011.m8428(this.f8229, i2, iM4594);
                this.f8231 += iM4594;
                return strM8428;
            }
        }
        if (iM4594 == 0) {
            return "";
        }
        if (iM4594 <= 0) {
            C2316.m4358("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        C2316.m4358("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    /* JADX INFO: renamed from: ۦٖ */
    public final byte[] m4620(int i) throws C5463 {
        if (i > 0) {
            int i2 = this.f8226;
            int i3 = this.f8231;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.f8231 = i4;
                return Arrays.copyOfRange(this.f8229, i3, i4);
            }
        }
        if (i > 0) {
            C2316.m4358("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        if (i == 0) {
            return AbstractC1963.f6474;
        }
        C2316.m4358("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return null;
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۦٗ */
    public final int mo4621() {
        return m4614();
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۦٚ */
    public final long mo4622() {
        return m4618();
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo4623(int i) throws C5463 {
        if (i >= 0) {
            int i2 = this.f8226;
            int i3 = this.f8231;
            if (i <= i2 - i3) {
                this.f8231 = i3 + i;
                return;
            }
        }
        if (i < 0) {
            C2316.m4358("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            C2316.m4358("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۦۚ */
    public final boolean mo4624(int i) throws C5463 {
        int i2 = i & 7;
        if (i2 != 0) {
            if (i2 == 1) {
                mo4623(8);
                return true;
            }
            if (i2 == 2) {
                mo4623(m4594());
                return true;
            }
            if (i2 == 3) {
                m8028();
                mo4617(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                if (this.f15338 == 0) {
                    mo4617(0);
                }
                return false;
            }
            if (i2 == 5) {
                mo4623(4);
                return true;
            }
            C2316.m4361();
            return false;
        }
        int i3 = this.f8226 - this.f8231;
        byte[] bArr = this.f8229;
        if (i3 >= 10) {
            for (int i4 = 0; i4 < 10; i4++) {
                int i5 = this.f8231;
                this.f8231 = i5 + 1;
                if (bArr[i5] < 0) {
                }
            }
            C2316.m4358("CodedInputStream encountered a malformed varint.");
            return false;
        }
        for (int i6 = 0; i6 < 10; i6++) {
            int i7 = this.f8231;
            if (i7 == this.f8226) {
                C2316.m4358("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return false;
            }
            this.f8231 = i7 + 1;
            if (bArr[i7] < 0) {
            }
        }
        C2316.m4358("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۦۛ */
    public final boolean mo4625() {
        return mo4613() != 0;
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۦ۟ */
    public final float mo4626() {
        return Float.intBitsToFloat(m4614());
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۦۨ */
    public final double mo4627() {
        return Double.longBitsToDouble(m4618());
    }
}
