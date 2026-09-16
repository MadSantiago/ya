package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: ۦٞؖٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4812 extends AbstractC4650 {

    /* JADX INFO: renamed from: ۥُ */
    public final byte[] f15863;

    /* JADX INFO: renamed from: ۥّ */
    public int f15864;

    /* JADX INFO: renamed from: ۥۜ */
    public int f15865;

    /* JADX INFO: renamed from: ۦؑ */
    public final InputStream f15866;

    /* JADX INFO: renamed from: ۦِ */
    public int f15867;

    /* JADX INFO: renamed from: ۦٛ */
    public int f15868;

    /* JADX INFO: renamed from: ۦۗ */
    public int f15869 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۦۙ */
    public int f15870;

    public /* synthetic */ C4812(InputStream inputStream, int i) {
        this.f15866 = inputStream;
        this.f15863 = new byte[i < 8 ? 8 : i];
        this.f15864 = 0;
        this.f15865 = 0;
        this.f15867 = 0;
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥؓ */
    public final int mo4593() {
        return mo4615();
    }

    /* JADX INFO: renamed from: ۥؔ */
    public final byte[] m8184(int i) throws IOException {
        if (i == 0) {
            return AbstractC1963.f6474;
        }
        int i2 = this.f15867;
        int i3 = this.f15865;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 > 0) {
            C2316.m4358("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return null;
        }
        int i5 = this.f15869;
        if (i4 > i5) {
            mo4623((i5 - i2) - i3);
            C2316.m4358("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        int i6 = this.f15864 - i3;
        int i7 = i - i6;
        InputStream inputStream = this.f15866;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (C5463 e) {
                e.f18014 = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f15863, this.f15865, bArr, 0, i6);
        this.f15867 += this.f15864;
        this.f15865 = 0;
        this.f15864 = 0;
        while (i6 < i) {
            try {
                int i8 = inputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    C2316.m4358("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return null;
                }
                this.f15867 += i8;
                i6 += i8;
            } catch (C5463 e2) {
                e2.f18014 = true;
                throw e2;
            }
        }
        return bArr;
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥؖ */
    public final byte[] mo4595() throws C5463 {
        int iMo4615 = mo4615();
        int i = this.f15864;
        int i2 = this.f15865;
        if (iMo4615 <= i - i2 && iMo4615 > 0) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f15863, i2, i2 + iMo4615);
            this.f15865 += iMo4615;
            return bArrCopyOfRange;
        }
        if (iMo4615 >= 0) {
            return m8190(iMo4615);
        }
        C2316.m4358("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return null;
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo4596() {
        int i = this.f15869;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f15867 + this.f15865);
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥً */
    public final int mo4597() {
        return m8185();
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥَ */
    public final int mo4598() {
        return mo4615();
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥُ */
    public final int mo4599() {
        return this.f15867 + this.f15865;
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥّ */
    public final int mo4600(byte[] bArr, int i, int i2) throws IOException {
        if ((bArr.length - i) - i2 < 0 || (i | i2) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f15864;
        int i4 = this.f15865;
        int i5 = i3 - i4;
        if (i5 > 0) {
            int iMin = Math.min(i2, i5);
            System.arraycopy(this.f15863, this.f15865, bArr, i, iMin);
            this.f15865 += iMin;
            return iMin;
        }
        int iMin2 = Math.min(i2, (this.f15869 - this.f15867) - i4);
        if (iMin2 <= 0) {
            return -1;
        }
        try {
            int i6 = this.f15866.read(bArr, i, iMin2);
            if (i6 != -1) {
                this.f15867 += i6;
            }
            return i6;
        } catch (C5463 e) {
            e.f18014 = true;
            throw e;
        }
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
        return AbstractC4650.m8026(mo4615());
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥٖ */
    public final long mo4604() {
        return m8186();
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public final int m8185() throws C5463 {
        int i = this.f15865;
        if (this.f15864 - i < 4) {
            m8188(4);
            i = this.f15865;
        }
        this.f15865 = i + 4;
        byte[] bArr = this.f15863;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥٙ */
    public final C4585 mo4605() throws IOException {
        int iMo4615 = mo4615();
        int i = this.f15864;
        int i2 = this.f15865;
        int i3 = i - i2;
        byte[] bArr = this.f15863;
        if (iMo4615 <= i3 && iMo4615 > 0) {
            C4585 c4585M7598 = AbstractC4314.m7598(bArr, i2, iMo4615);
            this.f15865 += iMo4615;
            return c4585M7598;
        }
        if (iMo4615 == 0) {
            return AbstractC4314.f14260;
        }
        if (iMo4615 < 0) {
            C2316.m4358("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        byte[] bArrM8184 = m8184(iMo4615);
        if (bArrM8184 != null) {
            return AbstractC4314.m7598(bArrM8184, 0, bArrM8184.length);
        }
        int i4 = this.f15865;
        int i5 = this.f15864;
        int i6 = i5 - i4;
        this.f15867 += i5;
        this.f15865 = 0;
        this.f15864 = 0;
        ArrayList<byte[]> arrayListM8191 = m8191(iMo4615 - i6);
        byte[] bArr2 = new byte[iMo4615];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        for (byte[] bArr3 : arrayListM8191) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i6, length);
            i6 += length;
        }
        try {
            C4585 c4585 = AbstractC4314.f14260;
            return iMo4615 == 0 ? AbstractC4314.f14260 : new C4585(bArr2);
        } catch (C5463 e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    /* JADX INFO: renamed from: ۥٛ */
    public final long m8186() throws C5463 {
        int i = this.f15865;
        if (this.f15864 - i < 8) {
            m8188(8);
            i = this.f15865;
        }
        this.f15865 = i + 8;
        byte[] bArr = this.f15863;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        return ((((long) bArr[i + 7]) & 255) << 56) | j2 | (j & 255) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥۖ */
    public final String mo4606() throws C5463 {
        int iMo4615 = mo4615();
        byte[] bArr = this.f15863;
        if (iMo4615 > 0) {
            int i = this.f15864;
            int i2 = this.f15865;
            if (iMo4615 <= i - i2) {
                String str = new String(bArr, i2, iMo4615, StandardCharsets.UTF_8);
                this.f15865 += iMo4615;
                return str;
            }
        }
        if (iMo4615 == 0) {
            return "";
        }
        if (iMo4615 < 0) {
            C2316.m4358("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        if (iMo4615 > this.f15864) {
            return new String(m8190(iMo4615), StandardCharsets.UTF_8);
        }
        m8188(iMo4615);
        String str2 = new String(bArr, this.f15865, iMo4615, StandardCharsets.UTF_8);
        this.f15865 += iMo4615;
        return str2;
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo4607(int i) {
        this.f15869 = i;
        m8187();
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
        int i2 = this.f15867 + this.f15865 + i;
        if (i2 < 0) {
            C2316.m4358("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i3 = this.f15869;
        if (i2 > i3) {
            C2316.m4358("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.f15869 = i2;
        m8187();
        return i3;
    }

    /* JADX INFO: renamed from: ۥۦ */
    public final void m8187() {
        int i = this.f15864 + this.f15870;
        this.f15864 = i;
        int i2 = this.f15867 + i;
        int i3 = this.f15869;
        if (i2 <= i3) {
            this.f15870 = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f15870 = i4;
        this.f15864 = i - i4;
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۥۧ */
    public final int mo4611() {
        return mo4615();
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۦؑ */
    public final boolean mo4612() {
        return this.f15865 == this.f15864 && !m8189(1);
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۦؖ */
    public final long mo4613() {
        long j;
        long j2;
        long j3;
        int i = this.f15865;
        int i2 = this.f15864;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f15863;
            byte b = bArr[i];
            if (b >= 0) {
                this.f15865 = i3;
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
                this.f15865 = i4;
                return j;
            }
        }
        return m8192();
    }

    /* JADX INFO: renamed from: ۦؗ */
    public final void m8188(int i) throws C5463 {
        if (m8189(i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - this.f15867) - this.f15865) {
            C2316.m4358("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        } else {
            C2316.m4358("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۦؙ */
    public final int mo4615() {
        int i;
        int i2 = this.f15865;
        int i3 = this.f15864;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f15863;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f15865 = i4;
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
                this.f15865 = i5;
                return i;
            }
        }
        return (int) m8192();
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۦؚ */
    public final int mo4616() throws C5463 {
        if (mo4612()) {
            this.f15868 = 0;
            return 0;
        }
        int iMo4615 = mo4615();
        this.f15868 = iMo4615;
        if ((iMo4615 >>> 3) != 0) {
            return iMo4615;
        }
        C2316.m4358("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo4617(int i) throws C5463 {
        if (this.f15868 == i) {
            return;
        }
        C2316.m4358("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: renamed from: ۦُ */
    public final boolean m8189(int i) throws IOException {
        InputStream inputStream = this.f15866;
        int i2 = this.f15865;
        int i3 = i2 + i;
        int i4 = this.f15864;
        if (i3 <= i4) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 66);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        int i5 = this.f15867;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.f15869) {
            byte[] bArr = this.f15863;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i5 = this.f15867 + i2;
                this.f15867 = i5;
                i4 = this.f15864 - i2;
                this.f15864 = i4;
                this.f15865 = 0;
            }
            try {
                int i6 = inputStream.read(bArr, i4, Math.min(bArr.length - i4, (Integer.MAX_VALUE - i5) - i4));
                if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                    String strValueOf = String.valueOf(inputStream.getClass());
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i6).length() + strValueOf.length() + 39 + 41);
                    sb2.append(strValueOf);
                    sb2.append("#read(byte[]) returned invalid result: ");
                    sb2.append(i6);
                    sb2.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb2.toString());
                }
                if (i6 > 0) {
                    this.f15864 += i6;
                    m8187();
                    if (this.f15864 >= i || m8189(i)) {
                        return true;
                    }
                }
            } catch (C5463 e) {
                e.f18014 = true;
                throw e;
            }
        }
        return false;
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۦٕ */
    public final String mo4619() throws IOException {
        int iMo4615 = mo4615();
        int i = this.f15865;
        int i2 = this.f15864;
        int i3 = i2 - i;
        byte[] bArrM8190 = this.f15863;
        if (iMo4615 <= i3 && iMo4615 > 0) {
            this.f15865 = i + iMo4615;
        } else {
            if (iMo4615 == 0) {
                return "";
            }
            if (iMo4615 < 0) {
                C2316.m4358("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return null;
            }
            i = 0;
            if (iMo4615 <= i2) {
                m8188(iMo4615);
                this.f15865 = iMo4615;
            } else {
                bArrM8190 = m8190(iMo4615);
            }
        }
        return AbstractC5011.m8428(bArrM8190, i, iMo4615);
    }

    /* JADX INFO: renamed from: ۦٖ */
    public final byte[] m8190(int i) throws IOException {
        byte[] bArrM8184 = m8184(i);
        if (bArrM8184 != null) {
            return bArrM8184;
        }
        int i2 = this.f15865;
        int i3 = this.f15864;
        int i4 = i3 - i2;
        this.f15867 += i3;
        this.f15865 = 0;
        this.f15864 = 0;
        ArrayList<byte[]> arrayListM8191 = m8191(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f15863, i2, bArr, 0, i4);
        for (byte[] bArr2 : arrayListM8191) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۦٗ */
    public final int mo4621() {
        return m8185();
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۦٚ */
    public final long mo4622() {
        return m8186();
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo4623(int i) throws C5463 {
        InputStream inputStream = this.f15866;
        int i2 = this.f15864;
        int i3 = this.f15865;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f15865 = i3 + i;
            return;
        }
        if (i < 0) {
            C2316.m4358("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return;
        }
        int i5 = this.f15867;
        int i6 = i5 + i3;
        int i7 = this.f15869;
        if (i6 + i > i7) {
            mo4623((i7 - i5) - i3);
            C2316.m4358("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return;
        }
        this.f15867 = i6;
        this.f15864 = 0;
        this.f15865 = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        String strValueOf = String.valueOf(inputStream.getClass());
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb.append(strValueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(jSkip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (C5463 e) {
                    e.f18014 = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.f15867 += i4;
                m8187();
                throw th;
            }
        }
        this.f15867 += i4;
        m8187();
        if (i4 >= i) {
            return;
        }
        int i8 = this.f15864;
        int i9 = i8 - this.f15865;
        this.f15865 = i8;
        m8188(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.f15864;
            if (i10 <= i11) {
                this.f15865 = i10;
                return;
            } else {
                i9 += i11;
                this.f15865 = i11;
                m8188(1);
            }
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
                mo4623(mo4615());
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
        int i3 = this.f15864 - this.f15865;
        byte[] bArr = this.f15863;
        if (i3 >= 10) {
            for (int i4 = 0; i4 < 10; i4++) {
                int i5 = this.f15865;
                this.f15865 = i5 + 1;
                if (bArr[i5] < 0) {
                }
            }
            C2316.m4358("CodedInputStream encountered a malformed varint.");
            return false;
        }
        for (int i6 = 0; i6 < 10; i6++) {
            if (this.f15865 == this.f15864) {
                m8188(1);
            }
            int i7 = this.f15865;
            this.f15865 = i7 + 1;
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

    /* JADX INFO: renamed from: ۦۜ */
    public final ArrayList m8191(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                try {
                    int i3 = this.f15866.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        C2316.m4358("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        return null;
                    }
                    this.f15867 += i3;
                    i2 += i3;
                } catch (C5463 e) {
                    e.f18014 = true;
                    throw e;
                }
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۦ۟ */
    public final float mo4626() {
        return Float.intBitsToFloat(m8185());
    }

    /* JADX INFO: renamed from: ۦۣ */
    public final long m8192() throws C5463 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f15865 == this.f15864) {
                m8188(1);
            }
            int i2 = this.f15865;
            this.f15865 = i2 + 1;
            byte b = this.f15863[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        C2316.m4358("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    @Override // p000.AbstractC4650
    /* JADX INFO: renamed from: ۦۨ */
    public final double mo4627() {
        return Double.longBitsToDouble(m8186());
    }
}
