package p000;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦۦؗؑ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5778 extends AbstractC2758 {

    /* JADX INFO: renamed from: ۥَ */
    public int f19037;

    /* JADX INFO: renamed from: ۥْ */
    public final FileInputStream f19038;

    /* JADX INFO: renamed from: ۥٓ */
    public final byte[] f19039;

    /* JADX INFO: renamed from: ۥٖ */
    public int f19040;

    /* JADX INFO: renamed from: ۥۖ */
    public int f19041;

    /* JADX INFO: renamed from: ۦٕ */
    public int f19042 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۦٗ */
    public int f19043;

    /* JADX INFO: renamed from: ۦۛ */
    public int f19044;

    public C5778(FileInputStream fileInputStream) {
        Charset charset = AbstractC3576.f11899;
        this.f19038 = fileInputStream;
        this.f19039 = new byte[4096];
        this.f19037 = 0;
        this.f19043 = 0;
        this.f19041 = 0;
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥؓ */
    public final int mo5038() {
        return m9591();
    }

    /* JADX INFO: renamed from: ۥؔ */
    public final long m9583() throws C3406 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f19043 == this.f19037) {
                m9594(1);
            }
            int i2 = this.f19043;
            this.f19043 = i2 + 1;
            byte b = this.f19039[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw C3406.m6168();
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥؖ */
    public final int mo5039() throws C3406 {
        if (mo5040()) {
            this.f19044 = 0;
            return 0;
        }
        int iM9591 = m9591();
        this.f19044 = iM9591;
        if ((iM9591 >>> 3) != 0) {
            return iM9591;
        }
        throw new C3406("Protocol message contained an invalid tag (zero).");
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo5040() {
        return this.f19043 == this.f19037 && !m9585(1);
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥً */
    public final boolean mo5041(int i) throws C3406 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                m9584(8);
                return true;
            }
            if (i2 == 2) {
                m9584(m9591());
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
            m9584(4);
            return true;
        }
        int i4 = this.f19037 - this.f19043;
        byte[] bArr = this.f19039;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.f19043;
                this.f19043 = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw C3406.m6168();
        }
        while (i3 < 10) {
            if (this.f19043 == this.f19037) {
                m9594(1);
            }
            int i6 = this.f19043;
            this.f19043 = i6 + 1;
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
        return m9592();
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥْ */
    public final float mo5043() {
        return Float.intBitsToFloat(m9587());
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥٓ */
    public final int mo5044() {
        return m9591();
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥٖ */
    public final int mo5045() {
        return m9587();
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public final void m9584(int i) throws C3406 {
        int i2 = this.f19037;
        int i3 = this.f19043;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f19043 = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.f19038;
        if (i < 0) {
            throw C3406.m6172();
        }
        int i5 = this.f19041;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.f19042;
        if (i7 > i8) {
            m9584((i8 - i5) - i3);
            throw C3406.m6169();
        }
        this.f19041 = i6;
        this.f19037 = 0;
        this.f19043 = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = fileInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (C3406 e) {
                    e.f11336 = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.f19041 += i4;
                m9593();
                throw th;
            }
        }
        this.f19041 += i4;
        m9593();
        if (i4 >= i) {
            return;
        }
        int i9 = this.f19037;
        int i10 = i9 - this.f19043;
        this.f19043 = i9;
        m9594(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f19037;
            if (i11 <= i12) {
                this.f19043 = i11;
                return;
            } else {
                i10 += i12;
                this.f19043 = i12;
                m9594(1);
            }
        }
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥٙ */
    public final String mo5046() throws IOException {
        int iM9591 = m9591();
        int i = this.f19043;
        int i2 = this.f19037;
        int i3 = i2 - i;
        byte[] bArrM9586 = this.f19039;
        if (iM9591 <= i3 && iM9591 > 0) {
            this.f19043 = i + iM9591;
        } else {
            if (iM9591 == 0) {
                return "";
            }
            if (iM9591 < 0) {
                throw C3406.m6172();
            }
            i = 0;
            if (iM9591 <= i2) {
                m9594(iM9591);
                this.f19043 = iM9591;
            } else {
                bArrM9586 = m9586(iM9591);
            }
        }
        return AbstractC0298.f1087.m8654(bArrM9586, i, iM9591);
    }

    /* JADX INFO: renamed from: ۥٛ */
    public final boolean m9585(int i) throws IOException {
        FileInputStream fileInputStream = this.f19038;
        int i2 = this.f19043;
        int i3 = i2 + i;
        int i4 = this.f19037;
        if (i3 <= i4) {
            C1078.m2276(AbstractC5078.m8681(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.f19041;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.f19042) {
            byte[] bArr = this.f19039;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i5 = this.f19041 + i2;
                this.f19041 = i5;
                i4 = this.f19037 - i2;
                this.f19037 = i4;
                this.f19043 = 0;
            }
            try {
                int i6 = fileInputStream.read(bArr, i4, Math.min(bArr.length - i4, (Integer.MAX_VALUE - i5) - i4));
                if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i6 + "\nThe InputStream implementation is buggy.");
                }
                if (i6 > 0) {
                    this.f19037 += i6;
                    m9593();
                    if (this.f19037 >= i) {
                        return true;
                    }
                    return m9585(i);
                }
            } catch (C3406 e) {
                e.f11336 = true;
                throw e;
            }
        }
        return false;
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥۖ */
    public final long mo5047() {
        long jM9592 = m9592();
        return (-(jM9592 & 1)) ^ (jM9592 >>> 1);
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo5048() {
        return this.f19041 + this.f19043;
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final byte[] m9586(int i) throws IOException {
        byte[] bArrM9590 = m9590(i);
        if (bArrM9590 != null) {
            return bArrM9590;
        }
        int i2 = this.f19043;
        int i3 = this.f19037;
        int length = i3 - i2;
        this.f19041 += i3;
        this.f19043 = 0;
        this.f19037 = 0;
        ArrayList<byte[]> arrayListM9588 = m9588(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f19039, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListM9588) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo5050(int i) throws C3406 {
        if (this.f19044 != i) {
            throw new C3406("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* JADX INFO: renamed from: ۥۦ */
    public final int m9587() throws C3406 {
        int i = this.f19043;
        if (this.f19037 - i < 4) {
            m9594(4);
            i = this.f19043;
        }
        this.f19043 = i + 4;
        byte[] bArr = this.f19039;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥۧ */
    public final long mo5052() {
        return m9592();
    }

    /* JADX INFO: renamed from: ۦؖ */
    public final ArrayList m9588(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f19038.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw C3406.m6169();
                }
                this.f19041 += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۦؗ */
    public final long m9589() throws C3406 {
        int i = this.f19043;
        if (this.f19037 - i < 8) {
            m9594(8);
            i = this.f19043;
        }
        this.f19043 = i + 8;
        byte[] bArr = this.f19039;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final byte[] m9590(int i) throws IOException {
        if (i == 0) {
            return AbstractC3576.f11898;
        }
        if (i < 0) {
            throw C3406.m6172();
        }
        int i2 = this.f19041;
        int i3 = this.f19043;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new C3406("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.f19042;
        if (i4 > i5) {
            m9584((i5 - i2) - i3);
            throw C3406.m6169();
        }
        int i6 = this.f19037 - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.f19038;
        if (i7 >= 4096) {
            try {
                if (i7 > fileInputStream.available()) {
                    return null;
                }
            } catch (C3406 e) {
                e.f11336 = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f19039, this.f19043, bArr, 0, i6);
        this.f19041 += this.f19037;
        this.f19043 = 0;
        this.f19037 = 0;
        while (i6 < i) {
            try {
                int i8 = fileInputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw C3406.m6169();
                }
                this.f19041 += i8;
                i6 += i8;
            } catch (C3406 e2) {
                e2.f11336 = true;
                throw e2;
            }
        }
        return bArr;
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۦؚ */
    public final C0533 mo5056() throws IOException {
        int iM9591 = m9591();
        int i = this.f19037;
        int i2 = this.f19043;
        int i3 = i - i2;
        byte[] bArr = this.f19039;
        if (iM9591 <= i3 && iM9591 > 0) {
            C0533 c0533M1185 = C0533.m1185(bArr, i2, iM9591);
            this.f19043 += iM9591;
            return c0533M1185;
        }
        if (iM9591 == 0) {
            return C0533.f1874;
        }
        if (iM9591 < 0) {
            throw C3406.m6172();
        }
        byte[] bArrM9590 = m9590(iM9591);
        if (bArrM9590 != null) {
            return C0533.m1185(bArrM9590, 0, bArrM9590.length);
        }
        int i4 = this.f19043;
        int i5 = this.f19037;
        int length = i5 - i4;
        this.f19041 += i5;
        this.f19043 = 0;
        this.f19037 = 0;
        ArrayList<byte[]> arrayListM9588 = m9588(iM9591 - length);
        byte[] bArr2 = new byte[iM9591];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListM9588) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C0533 c0533 = C0533.f1874;
        return new C0533(bArr2);
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۦٌ */
    public final double mo5057() {
        return Double.longBitsToDouble(m9589());
    }

    /* JADX INFO: renamed from: ۦُ */
    public final int m9591() {
        int i;
        int i2 = this.f19043;
        int i3 = this.f19037;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f19039;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f19043 = i4;
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
                this.f19043 = i5;
                return i;
            }
        }
        return (int) m9583();
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۦِ */
    public final int mo5059(int i) throws C3406 {
        if (i < 0) {
            throw C3406.m6172();
        }
        int i2 = this.f19041 + this.f19043 + i;
        if (i2 < 0) {
            throw new C3406("Failed to parse the message.");
        }
        int i3 = this.f19042;
        if (i2 > i3) {
            throw C3406.m6169();
        }
        this.f19042 = i2;
        m9593();
        return i3;
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۦٕ */
    public final String mo5060() throws C3406 {
        int iM9591 = m9591();
        byte[] bArr = this.f19039;
        if (iM9591 > 0) {
            int i = this.f19037;
            int i2 = this.f19043;
            if (iM9591 <= i - i2) {
                String str = new String(bArr, i2, iM9591, AbstractC3576.f11899);
                this.f19043 += iM9591;
                return str;
            }
        }
        if (iM9591 == 0) {
            return "";
        }
        if (iM9591 < 0) {
            throw C3406.m6172();
        }
        if (iM9591 > this.f19037) {
            return new String(m9586(iM9591), AbstractC3576.f11899);
        }
        m9594(iM9591);
        String str2 = new String(bArr, this.f19043, iM9591, AbstractC3576.f11899);
        this.f19043 += iM9591;
        return str2;
    }

    /* JADX INFO: renamed from: ۦٖ */
    public final long m9592() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f19043;
        int i2 = this.f19037;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f19039;
            byte b = bArr[i];
            if (b >= 0) {
                this.f19043 = i3;
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
                this.f19043 = i4;
                return j;
            }
        }
        return m9583();
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۦٗ */
    public final long mo5062() {
        return m9589();
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo5063(int i) {
        this.f19042 = i;
        m9593();
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۦۗ */
    public final boolean mo5064() {
        return m9592() != 0;
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۦۚ */
    public final int mo5065() {
        return m9591();
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۦۛ */
    public final int mo5066() {
        int iM9591 = m9591();
        return (-(iM9591 & 1)) ^ (iM9591 >>> 1);
    }

    /* JADX INFO: renamed from: ۦۜ */
    public final void m9593() {
        int i = this.f19037 + this.f19040;
        this.f19037 = i;
        int i2 = this.f19041 + i;
        int i3 = this.f19042;
        if (i2 <= i3) {
            this.f19040 = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f19040 = i4;
        this.f19037 = i - i4;
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۦ۟ */
    public final long mo5067() {
        return m9589();
    }

    /* JADX INFO: renamed from: ۦۣ */
    public final void m9594(int i) throws C3406 {
        if (m9585(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.f19041) - this.f19043) {
            throw C3406.m6169();
        }
        throw new C3406("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۦۨ */
    public final int mo5068() {
        return m9587();
    }
}
