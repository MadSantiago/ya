package p000;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: ۥٓؓۘؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1270 implements InterfaceC4473, InterfaceC2674, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: ۦ۟ */
    public long f4340;

    /* JADX INFO: renamed from: ۦۨ */
    public C3341 f4341;

    public final Object clone() {
        C1270 c1270 = new C1270();
        if (this.f4340 == 0) {
            return c1270;
        }
        C3341 c3341 = this.f4341;
        C3341 c3341M6101 = c3341.m6101();
        c1270.f4341 = c3341M6101;
        c3341M6101.f11180 = c3341M6101;
        c3341M6101.f11176 = c3341M6101;
        for (C3341 c3342 = c3341.f11176; c3342 != c3341; c3342 = c3342.f11176) {
            c3341M6101.f11180.m6102(c3342.m6101());
        }
        c1270.f4340 = this.f4340;
        return c1270;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1270)) {
            return false;
        }
        long j = this.f4340;
        C1270 c1270 = (C1270) obj;
        if (j != c1270.f4340) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        C3341 c3341 = this.f4341;
        C3341 c3342 = c1270.f4341;
        int i = c3341.f11177;
        int i2 = c3342.f11177;
        long j2 = 0;
        while (j2 < this.f4340) {
            long jMin = Math.min(c3341.f11174 - i, c3342.f11174 - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (c3341.f11178[i] != c3342.f11178[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == c3341.f11174) {
                c3341 = c3341.f11176;
                i = c3341.f11177;
            }
            if (i2 == c3342.f11174) {
                c3342 = c3342.f11176;
                i2 = c3342.f11177;
            }
            j2 += jMin;
        }
        return true;
    }

    public final int hashCode() {
        C3341 c3341 = this.f4341;
        if (c3341 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c3341.f11174;
            for (int i3 = c3341.f11177; i3 < i2; i3++) {
                i = (i * 31) + c3341.f11178[i3];
            }
            c3341 = c3341.f11176;
        } while (c3341 != this.f4341);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final int read(byte[] bArr, int i, int i2) {
        C5063.m8614(bArr.length, i, i2);
        C3341 c3341 = this.f4341;
        if (c3341 == null) {
            return -1;
        }
        int iMin = Math.min(i2, c3341.f11174 - c3341.f11177);
        byte[] bArr2 = c3341.f11178;
        int i3 = c3341.f11177;
        System.arraycopy(bArr2, i3, bArr, i, (i3 + iMin) - i3);
        int i4 = c3341.f11177 + iMin;
        c3341.f11177 = i4;
        this.f4340 -= (long) iMin;
        if (i4 == c3341.f11174) {
            this.f4341 = c3341.m6103();
            AbstractC3701.m6565(c3341);
        }
        return iMin;
    }

    @Override // p000.InterfaceC4473
    public final byte readByte() {
        long j = this.f4340;
        if (j == 0) {
            throw new EOFException();
        }
        C3341 c3341 = this.f4341;
        int i = c3341.f11177;
        int i2 = c3341.f11174;
        int i3 = i + 1;
        byte b = c3341.f11178[i];
        this.f4340 = j - 1;
        if (i3 != i2) {
            c3341.f11177 = i3;
            return b;
        }
        this.f4341 = c3341.m6103();
        AbstractC3701.m6565(c3341);
        return b;
    }

    @Override // p000.InterfaceC4473
    public final int readInt() throws EOFException {
        long j = this.f4340;
        if (j < 4) {
            throw new EOFException();
        }
        C3341 c3341 = this.f4341;
        int i = c3341.f11177;
        int i2 = c3341.f11174;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = c3341.f11178;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.f4340 = j - 4;
        if (i5 != i2) {
            c3341.f11177 = i5;
            return i6;
        }
        this.f4341 = c3341.m6103();
        AbstractC3701.m6565(c3341);
        return i6;
    }

    @Override // p000.InterfaceC4473
    public final short readShort() throws EOFException {
        long j = this.f4340;
        if (j < 2) {
            throw new EOFException();
        }
        C3341 c3341 = this.f4341;
        int i = c3341.f11177;
        int i2 = c3341.f11174;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = c3341.f11178;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f4340 = j - 2;
        if (i5 == i2) {
            this.f4341 = c3341.m6103();
            AbstractC3701.m6565(c3341);
        } else {
            c3341.f11177 = i5;
        }
        return (short) i6;
    }

    @Override // p000.InterfaceC4473
    public final void skip(long j) {
        while (j > 0) {
            C3341 c3341 = this.f4341;
            if (c3341 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, c3341.f11174 - c3341.f11177);
            long j2 = iMin;
            this.f4340 -= j2;
            j -= j2;
            int i = c3341.f11177 + iMin;
            c3341.f11177 = i;
            if (i == c3341.f11174) {
                this.f4341 = c3341.m6103();
                AbstractC3701.m6565(c3341);
            }
        }
    }

    public final String toString() {
        long j = this.f4340;
        if (j <= 2147483647L) {
            return m2686((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f4340).toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            C3341 c3341M2662 = m2662(1);
            int iMin = Math.min(i, 8192 - c3341M2662.f11174);
            byteBuffer.get(c3341M2662.f11178, c3341M2662.f11174, iMin);
            i -= iMin;
            c3341M2662.f11174 += iMin;
        }
        this.f4340 += (long) iRemaining;
        return iRemaining;
    }

    @Override // p000.InterfaceC2674
    public final /* bridge */ /* synthetic */ InterfaceC2674 writeByte(int i) {
        m2680(i);
        return this;
    }

    @Override // p000.InterfaceC2674
    public final /* bridge */ /* synthetic */ InterfaceC2674 writeInt(int i) {
        m2664(i);
        return this;
    }

    @Override // p000.InterfaceC2674
    public final /* bridge */ /* synthetic */ InterfaceC2674 writeShort(int i) {
        m2673(i);
        return this;
    }

    @Override // p000.InterfaceC2674
    /* JADX INFO: renamed from: ۥؔ */
    public final /* bridge */ /* synthetic */ InterfaceC2674 mo2660(String str) {
        m2677(str);
        return this;
    }

    @Override // p000.InterfaceC4598
    /* JADX INFO: renamed from: ۥؖ */
    public final long mo406(C1270 c1270, long j) {
        if (j < 0) {
            C1078.m2273(AbstractC3761.m6634(j, "byteCount < 0: "));
            return 0L;
        }
        long j2 = this.f4340;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c1270.mo962(this, j);
        return j;
    }

    /* JADX INFO: renamed from: ۥؙ */
    public final void m2661(int i, byte[] bArr) {
        long j = i;
        C5063.m8614(bArr.length, 0L, j);
        int i2 = 0;
        while (i2 < i) {
            C3341 c3341M2662 = m2662(1);
            int iMin = Math.min(i - i2, 8192 - c3341M2662.f11174);
            int i3 = i2 + iMin;
            System.arraycopy(bArr, i2, c3341M2662.f11178, c3341M2662.f11174, i3 - i2);
            c3341M2662.f11174 += iMin;
            i2 = i3;
        }
        this.f4340 += j;
    }

    /* JADX INFO: renamed from: ۥؚ */
    public final C3341 m2662(int i) {
        if (i < 1 || i > 8192) {
            C1078.m2272("unexpected capacity");
            return null;
        }
        C3341 c3341 = this.f4341;
        if (c3341 == null) {
            C3341 c3341M6564 = AbstractC3701.m6564();
            this.f4341 = c3341M6564;
            c3341M6564.f11180 = c3341M6564;
            c3341M6564.f11176 = c3341M6564;
            return c3341M6564;
        }
        C3341 c3342 = c3341.f11180;
        if (c3342.f11174 + i <= 8192 && c3342.f11175) {
            return c3342;
        }
        C3341 c3341M6565 = AbstractC3701.m6564();
        c3342.m6102(c3341M6565);
        return c3341M6565;
    }

    @Override // p000.InterfaceC4473
    /* JADX INFO: renamed from: ۥً */
    public final String mo2663(long j) throws EOFException {
        if (j < 0) {
            C1078.m2273(AbstractC3761.m6634(j, "limit < 0: "));
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jM2682 = m2682((byte) 10, 0L, j2);
        if (jM2682 != -1) {
            return AbstractC0009.m1283(this, jM2682);
        }
        if (j2 < this.f4340 && m2670(j2 - 1) == 13 && m2670(j2) == 10) {
            return AbstractC0009.m1283(this, j2);
        }
        C1270 c1270 = new C1270();
        m2672(c1270, 0L, Math.min(32L, this.f4340));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f4340, j) + " content=" + c1270.mo2690(c1270.f4340).mo2203() + (char) 8230);
    }

    /* JADX INFO: renamed from: ۥِ */
    public final void m2664(int i) {
        C3341 c3341M2662 = m2662(4);
        byte[] bArr = c3341M2662.f11178;
        int i2 = c3341M2662.f11174;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        c3341M2662.f11174 = i2 + 4;
        this.f4340 += 4;
    }

    @Override // p000.InterfaceC4598, p000.InterfaceC3832
    /* JADX INFO: renamed from: ۥّ */
    public final C2014 mo961() {
        return C2014.f6633;
    }

    @Override // p000.InterfaceC4473
    /* JADX INFO: renamed from: ۥْ */
    public final String mo2665() {
        return mo2663(Long.MAX_VALUE);
    }

    @Override // p000.InterfaceC4473
    /* JADX INFO: renamed from: ۥٓ */
    public final byte[] mo2666() {
        return m2667(this.f4340);
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final byte[] m2667(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            C1078.m2273(AbstractC3761.m6634(j, "byteCount: "));
            return null;
        }
        if (this.f4340 < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final long m2668() {
        long j = this.f4340;
        if (j == 0) {
            return 0L;
        }
        C3341 c3341 = this.f4341.f11180;
        int i = c3341.f11174;
        return (i >= 8192 || !c3341.f11175) ? j : j - ((long) (i - c3341.f11177));
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public final String m2669() {
        return m2688(this.f4340, AbstractC4637.f15306);
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final byte m2670(long j) {
        C5063.m8614(this.f4340, j, 1L);
        C3341 c3341 = this.f4341;
        c3341.getClass();
        long j2 = this.f4340;
        if (j2 - j < j) {
            while (j2 > j) {
                c3341 = c3341.f11180;
                j2 -= (long) (c3341.f11174 - c3341.f11177);
            }
            return c3341.f11178[(int) ((((long) c3341.f11177) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = c3341.f11174;
            int i2 = c3341.f11177;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return c3341.f11178[(int) ((((long) i2) + j) - j3)];
            }
            c3341 = c3341.f11176;
            j3 = j4;
        }
    }

    @Override // p000.InterfaceC4473
    /* JADX INFO: renamed from: ۥٛ */
    public final long mo2671() throws EOFException {
        int i;
        if (this.f4340 == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            C3341 c3341 = this.f4341;
            byte[] bArr = c3341.f11178;
            int i3 = c3341.f11177;
            int i4 = c3341.f11174;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        z = true;
                        if (i2 != 0) {
                            break;
                        }
                        char[] cArr = AbstractC2133.f6997;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    C1270 c1270 = new C1270();
                    c1270.m2700(j);
                    c1270.m2680(b);
                    throw new NumberFormatException("Number too large: ".concat(c1270.m2669()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.f4341 = c3341.m6103();
                AbstractC3701.m6565(c3341);
            } else {
                c3341.f11177 = i3;
            }
            if (z) {
                break;
            }
        } while (this.f4341 != null);
        this.f4340 -= (long) i2;
        return j;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final void m2672(C1270 c1270, long j, long j2) {
        long j3 = j;
        C5063.m8614(this.f4340, j3, j2);
        if (j2 == 0) {
            return;
        }
        c1270.f4340 += j2;
        C3341 c3341 = this.f4341;
        while (true) {
            long j4 = c3341.f11174 - c3341.f11177;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            c3341 = c3341.f11176;
        }
        long j5 = j2;
        while (j5 > 0) {
            C3341 c3341M6101 = c3341.m6101();
            int i = c3341M6101.f11177 + ((int) j3);
            c3341M6101.f11177 = i;
            c3341M6101.f11174 = Math.min(i + ((int) j5), c3341M6101.f11174);
            C3341 c3342 = c1270.f4341;
            if (c3342 == null) {
                c3341M6101.f11180 = c3341M6101;
                c3341M6101.f11176 = c3341M6101;
                c1270.f4341 = c3341M6101;
            } else {
                c3342.f11180.m6102(c3341M6101);
            }
            j5 -= (long) (c3341M6101.f11174 - c3341M6101.f11177);
            c3341 = c3341.f11176;
            j3 = 0;
        }
    }

    /* JADX INFO: renamed from: ۥۘ */
    public final void m2673(int i) {
        C3341 c3341M2662 = m2662(2);
        byte[] bArr = c3341M2662.f11178;
        int i2 = c3341M2662.f11174;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        c3341M2662.f11174 = i2 + 2;
        this.f4340 += 2;
    }

    @Override // p000.InterfaceC4473
    /* JADX INFO: renamed from: ۥۙ */
    public final long mo2674(InterfaceC2674 interfaceC2674) {
        long j = this.f4340;
        if (j > 0) {
            interfaceC2674.mo962(this, j);
        }
        return j;
    }

    @Override // p000.InterfaceC3832
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo962(C1270 c1270, long j) {
        C3341 c3341M6564;
        if (c1270 == this) {
            C1078.m2272("source == this");
            return;
        }
        C5063.m8614(c1270.f4340, 0L, j);
        while (j > 0) {
            C3341 c3341 = c1270.f4341;
            int i = c3341.f11174 - c3341.f11177;
            if (j < i) {
                C3341 c3342 = this.f4341;
                C3341 c3343 = c3342 != null ? c3342.f11180 : null;
                if (c3343 != null && c3343.f11175) {
                    if ((((long) c3343.f11174) + j) - ((long) (c3343.f11179 ? 0 : c3343.f11177)) <= 8192) {
                        c3341.m6104(c3343, (int) j);
                        c1270.f4340 -= j;
                        this.f4340 += j;
                        return;
                    }
                }
                int i2 = (int) j;
                if (i2 <= 0 || i2 > i) {
                    C1078.m2272("byteCount out of range");
                    return;
                }
                if (i2 >= 1024) {
                    c3341M6564 = c3341.m6101();
                } else {
                    c3341M6564 = AbstractC3701.m6564();
                    byte[] bArr = c3341.f11178;
                    byte[] bArr2 = c3341M6564.f11178;
                    int i3 = c3341.f11177;
                    AbstractC0246.m512(bArr, bArr2, i3, i3 + i2);
                }
                c3341M6564.f11174 = c3341M6564.f11177 + i2;
                c3341.f11177 += i2;
                c3341.f11180.m6102(c3341M6564);
                c1270.f4341 = c3341M6564;
                c3341 = c3341M6564;
            }
            long j2 = c3341.f11174 - c3341.f11177;
            c1270.f4341 = c3341.m6103();
            C3341 c3344 = this.f4341;
            if (c3344 == null) {
                this.f4341 = c3341;
                c3341.f11180 = c3341;
                c3341.f11176 = c3341;
            } else {
                c3344.f11180.m6102(c3341);
                C3341 c3345 = c3341.f11180;
                if (c3345 == c3341) {
                    C1078.m2276("cannot compact");
                    return;
                } else if (c3345.f11175) {
                    int i4 = c3341.f11174 - c3341.f11177;
                    if (i4 <= (8192 - c3345.f11174) + (c3345.f11179 ? 0 : c3345.f11177)) {
                        c3341.m6104(c3345, i4);
                        c3341.m6103();
                        AbstractC3701.m6565(c3341);
                    }
                }
            }
            c1270.f4340 -= j2;
            this.f4340 += j2;
            j -= j2;
        }
    }

    @Override // p000.InterfaceC4473
    /* JADX INFO: renamed from: ۥ۟ */
    public final InputStream mo2675() {
        return new C4809(this, 0);
    }

    /* JADX INFO: renamed from: ۥۡ */
    public final void m2676(C1007 c1007) {
        c1007.mo2215(this, c1007.mo2205());
    }

    /* JADX INFO: renamed from: ۥۢ */
    public final void m2677(String str) {
        m2687(0, str.length(), str);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m2678() {
        skip(this.f4340);
    }

    @Override // p000.InterfaceC4473
    /* JADX INFO: renamed from: ۥۤ */
    public final String mo2679(Charset charset) {
        return m2688(this.f4340, charset);
    }

    /* JADX INFO: renamed from: ۥۥ */
    public final void m2680(int i) {
        C3341 c3341M2662 = m2662(1);
        byte[] bArr = c3341M2662.f11178;
        int i2 = c3341M2662.f11174;
        c3341M2662.f11174 = i2 + 1;
        bArr[i2] = (byte) i;
        this.f4340++;
    }

    @Override // p000.InterfaceC2674
    /* JADX INFO: renamed from: ۥۦ */
    public final /* bridge */ /* synthetic */ InterfaceC2674 mo2681(int i, byte[] bArr) {
        m2661(i, bArr);
        return this;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final long m2682(byte b, long j, long j2) {
        C3341 c3341;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 > j3 || j3 > j4) {
            throw new IllegalArgumentException(("size=" + this.f4340 + " fromIndex=" + j3 + " toIndex=" + j4).toString());
        }
        long j6 = this.f4340;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 == j4 || (c3341 = this.f4341) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                c3341 = c3341.f11180;
                j6 -= (long) (c3341.f11174 - c3341.f11177);
            }
            while (j6 < j4) {
                byte[] bArr = c3341.f11178;
                long j8 = j7;
                int iMin = (int) Math.min(c3341.f11174, (((long) c3341.f11177) + j4) - j6);
                for (int i = (int) ((((long) c3341.f11177) + j3) - j6); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - c3341.f11177)) + j6;
                    }
                }
                j6 += (long) (c3341.f11174 - c3341.f11177);
                c3341 = c3341.f11176;
                j7 = j8;
                j3 = j6;
            }
            return j7;
        }
        while (true) {
            long j9 = ((long) (c3341.f11174 - c3341.f11177)) + j5;
            if (j9 > j3) {
                break;
            }
            c3341 = c3341.f11176;
            j5 = j9;
        }
        while (j5 < j4) {
            byte[] bArr2 = c3341.f11178;
            int iMin2 = (int) Math.min(c3341.f11174, (((long) c3341.f11177) + j4) - j5);
            for (int i2 = (int) ((((long) c3341.f11177) + j3) - j5); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - c3341.f11177)) + j5;
                }
            }
            j5 += (long) (c3341.f11174 - c3341.f11177);
            c3341 = c3341.f11176;
            j3 = j5;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ۥۨ */
    public final void m2683(long j) {
        boolean z;
        if (j == 0) {
            m2680(48);
            return;
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                m2677("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j >= 100) {
                    i = j < 1000 ? 3 : 4;
                } else if (j >= 10) {
                    i = 2;
                }
            } else if (j < 1000000) {
                i = j < 100000 ? 5 : 6;
            } else {
                i = j < 10000000 ? 7 : 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                i = j < 1000000000 ? 9 : 10;
            } else {
                i = j < 100000000000L ? 11 : 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i = 13;
            } else {
                i = j < 100000000000000L ? 14 : 15;
            }
        } else if (j < 100000000000000000L) {
            i = j < 10000000000000000L ? 16 : 17;
        } else {
            i = j < 1000000000000000000L ? 18 : 19;
        }
        if (z) {
            i++;
        }
        C3341 c3341M2662 = m2662(i);
        byte[] bArr = c3341M2662.f11178;
        int i2 = c3341M2662.f11174 + i;
        while (j != 0) {
            i2--;
            bArr[i2] = AbstractC0009.f2059[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        c3341M2662.f11174 += i;
        this.f4340 += (long) i;
    }

    /* JADX INFO: renamed from: ۦ */
    public final void m2684(int i) {
        String str;
        if (i < 128) {
            m2680(i);
            return;
        }
        if (i < 2048) {
            C3341 c3341M2662 = m2662(2);
            byte[] bArr = c3341M2662.f11178;
            int i2 = c3341M2662.f11174;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            c3341M2662.f11174 = i2 + 2;
            this.f4340 += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            m2680(63);
            return;
        }
        if (i < 65536) {
            C3341 c3341M2663 = m2662(3);
            byte[] bArr2 = c3341M2663.f11178;
            int i3 = c3341M2663.f11174;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            c3341M2663.f11174 = i3 + 3;
            this.f4340 += 3;
            return;
        }
        if (i <= 1114111) {
            C3341 c3341M2664 = m2662(4);
            byte[] bArr3 = c3341M2664.f11178;
            int i4 = c3341M2664.f11174;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            c3341M2664.f11174 = i4 + 4;
            this.f4340 += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = AbstractC2133.f6997;
            int i5 = 0;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i5 < 8 && cArr2[i5] == '0') {
                i5++;
            }
            if (i5 < 0) {
                C1078.m2279(AbstractC5078.m8681(i5, "startIndex: ", ", endIndex: 8, size: 8"));
                return;
            } else {
                if (i5 > 8) {
                    C1078.m2272(AbstractC5078.m8681(i5, "startIndex: ", " > endIndex: 8"));
                    return;
                }
                str = new String(cArr2, i5, 8 - i5);
            }
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: ۦؒ */
    public final C1007 m2686(int i) {
        if (i == 0) {
            return C1007.f3595;
        }
        C5063.m8614(this.f4340, 0L, i);
        C3341 c3341 = this.f4341;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = c3341.f11174;
            int i6 = c3341.f11177;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            c3341 = c3341.f11176;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        C3341 c3342 = this.f4341;
        int i7 = 0;
        while (i2 < i) {
            bArr[i7] = c3342.f11178;
            i2 += c3342.f11174 - c3342.f11177;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = c3342.f11177;
            c3342.f11179 = true;
            i7++;
            c3342 = c3342.f11176;
        }
        return new C5074(bArr, iArr);
    }

    /* JADX INFO: renamed from: ۦؔ */
    public final void m2687(int i, int i2, String str) {
        char cCharAt;
        if (i < 0) {
            C1078.m2273(AbstractC5078.m8670(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            C1078.m2273(AbstractC5078.m8679("endIndex < beginIndex: ", i2, i, " < "));
            return;
        }
        if (i2 > str.length()) {
            StringBuilder sbM8680 = AbstractC5078.m8680(i2, "endIndex > string.length: ", " > ");
            sbM8680.append(str.length());
            throw new IllegalArgumentException(sbM8680.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                C3341 c3341M2662 = m2662(1);
                byte[] bArr = c3341M2662.f11178;
                int i3 = c3341M2662.f11174 - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = c3341M2662.f11174;
                int i6 = (i3 + i) - i5;
                c3341M2662.f11174 = i5 + i6;
                this.f4340 += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    C3341 c3341M2663 = m2662(2);
                    byte[] bArr2 = c3341M2663.f11178;
                    int i7 = c3341M2663.f11174;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c3341M2663.f11174 = i7 + 2;
                    this.f4340 += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C3341 c3341M2664 = m2662(3);
                    byte[] bArr3 = c3341M2664.f11178;
                    int i8 = c3341M2664.f11174;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c3341M2664.f11174 = i8 + 3;
                    this.f4340 += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        m2680(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C3341 c3341M2665 = m2662(4);
                        byte[] bArr4 = c3341M2665.f11178;
                        int i11 = c3341M2665.f11174;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        c3341M2665.f11174 = i11 + 4;
                        this.f4340 += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ۦؖ */
    public final String m2688(long j, Charset charset) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            C1078.m2273(AbstractC3761.m6634(j, "byteCount: "));
            return null;
        }
        if (this.f4340 < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        C3341 c3341 = this.f4341;
        int i = c3341.f11177;
        if (((long) i) + j > c3341.f11174) {
            return new String(m2667(j), charset);
        }
        int i2 = (int) j;
        String str = new String(c3341.f11178, i, i2, charset);
        int i3 = c3341.f11177 + i2;
        c3341.f11177 = i3;
        this.f4340 -= j;
        if (i3 == c3341.f11174) {
            this.f4341 = c3341.m6103();
            AbstractC3701.m6565(c3341);
        }
        return str;
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final short m2689() throws EOFException {
        short s = readShort();
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    @Override // p000.InterfaceC4473
    /* JADX INFO: renamed from: ۦؚ */
    public final C1007 mo2690(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            C1078.m2273(AbstractC3761.m6634(j, "byteCount: "));
            return null;
        }
        if (this.f4340 < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new C1007(m2667(j));
        }
        C1007 c1007M2686 = m2686((int) j);
        skip(j);
        return c1007M2686;
    }

    @Override // p000.InterfaceC4473
    /* JADX INFO: renamed from: ۦُ */
    public final void mo2691(long j) throws EOFException {
        if (this.f4340 < j) {
            throw new EOFException();
        }
    }

    @Override // p000.InterfaceC2674
    /* JADX INFO: renamed from: ۦِ */
    public final /* bridge */ /* synthetic */ InterfaceC2674 mo2692(long j) {
        m2700(j);
        return this;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final boolean m2693() {
        return this.f4340 == 0;
    }

    @Override // p000.InterfaceC4473
    /* JADX INFO: renamed from: ۦٖ */
    public final boolean mo2694(long j, C1007 c1007) {
        int iMo2205 = c1007.mo2205();
        if (j >= 0 && iMo2205 >= 0 && this.f4340 - j >= iMo2205 && c1007.mo2205() >= iMo2205) {
            for (int i = 0; i < iMo2205; i++) {
                if (m2670(((long) i) + j) == c1007.mo2213(i)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final long m2695(C1007 c1007) {
        int i;
        int i2;
        C3341 c3341 = this.f4341;
        if (c3341 == null) {
            return -1L;
        }
        long j = this.f4340;
        long j2 = 0;
        if (j < 0) {
            while (j > 0) {
                c3341 = c3341.f11180;
                j -= (long) (c3341.f11174 - c3341.f11177);
            }
            if (c1007.mo2205() == 2) {
                byte bMo2213 = c1007.mo2213(0);
                byte bMo2214 = c1007.mo2213(1);
                while (j < this.f4340) {
                    byte[] bArr = c3341.f11178;
                    i = (int) ((((long) c3341.f11177) + j2) - j);
                    int i3 = c3341.f11174;
                    while (true) {
                        if (i >= i3) {
                            j2 = ((long) (c3341.f11174 - c3341.f11177)) + j;
                            c3341 = c3341.f11176;
                            j = j2;
                        } else {
                            byte b = bArr[i];
                            if (b == bMo2213 || b == bMo2214) {
                                i2 = c3341.f11177;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                return -1L;
            }
            byte[] bArrMo2204 = c1007.mo2204();
            while (j < this.f4340) {
                byte[] bArr2 = c3341.f11178;
                i = (int) ((((long) c3341.f11177) + j2) - j);
                int i4 = c3341.f11174;
                while (true) {
                    if (i < i4) {
                        byte b2 = bArr2[i];
                        int length = bArrMo2204.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                i++;
                            } else if (b2 == bArrMo2204[i5]) {
                                i2 = c3341.f11177;
                            } else {
                                i5++;
                            }
                        }
                    } else {
                        j2 = ((long) (c3341.f11174 - c3341.f11177)) + j;
                        c3341 = c3341.f11176;
                        j = j2;
                    }
                }
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j3 = ((long) (c3341.f11174 - c3341.f11177)) + j;
            if (j3 > 0) {
                break;
            }
            c3341 = c3341.f11176;
            j = j3;
        }
        if (c1007.mo2205() == 2) {
            byte bMo2215 = c1007.mo2213(0);
            byte bMo2216 = c1007.mo2213(1);
            while (j < this.f4340) {
                byte[] bArr3 = c3341.f11178;
                i = (int) ((((long) c3341.f11177) + j2) - j);
                int i6 = c3341.f11174;
                while (true) {
                    if (i >= i6) {
                        j2 = ((long) (c3341.f11174 - c3341.f11177)) + j;
                        c3341 = c3341.f11176;
                        j = j2;
                    } else {
                        byte b3 = bArr3[i];
                        if (b3 == bMo2215 || b3 == bMo2216) {
                            i2 = c3341.f11177;
                        } else {
                            i++;
                        }
                    }
                }
            }
            return -1L;
        }
        byte[] bArrMo2205 = c1007.mo2204();
        while (j < this.f4340) {
            byte[] bArr4 = c3341.f11178;
            i = (int) ((((long) c3341.f11177) + j2) - j);
            int i7 = c3341.f11174;
            while (true) {
                if (i < i7) {
                    byte b4 = bArr4[i];
                    int length2 = bArrMo2205.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length2) {
                            i++;
                        } else if (b4 == bArrMo2205[i8]) {
                            i2 = c3341.f11177;
                        } else {
                            i8++;
                        }
                    }
                } else {
                    j2 = ((long) (c3341.f11174 - c3341.f11177)) + j;
                    c3341 = c3341.f11176;
                    j = j2;
                }
            }
        }
        return -1L;
        return ((long) (i - i2)) + j;
    }

    @Override // p000.InterfaceC2674
    /* JADX INFO: renamed from: ۦٛ */
    public final /* bridge */ /* synthetic */ InterfaceC2674 mo2696(C1007 c1007) {
        m2676(c1007);
        return this;
    }

    @Override // p000.InterfaceC4473
    /* JADX INFO: renamed from: ۦۚ */
    public final boolean mo2697(long j) {
        return this.f4340 >= j;
    }

    @Override // p000.InterfaceC4473
    /* JADX INFO: renamed from: ۦۛ */
    public final int mo2698(C2800 c2800) {
        int iM1282 = AbstractC0009.m1282(this, c2800, false);
        if (iM1282 == -1) {
            return -1;
        }
        skip(c2800.f9355[iM1282].mo2205());
        return iM1282;
    }

    @Override // p000.InterfaceC2674
    /* JADX INFO: renamed from: ۦۜ */
    public final /* bridge */ /* synthetic */ InterfaceC2674 mo2699(long j) {
        m2683(j);
        return this;
    }

    /* JADX INFO: renamed from: ۦ۠ */
    public final void m2700(long j) {
        if (j == 0) {
            m2680(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        C3341 c3341M2662 = m2662(i);
        byte[] bArr = c3341M2662.f11178;
        int i2 = c3341M2662.f11174;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = AbstractC0009.f2059[(int) (15 & j)];
            j >>>= 4;
        }
        c3341M2662.f11174 += i;
        this.f4340 += (long) i;
    }

    /* JADX INFO: renamed from: ۦۧ */
    public final long m2701(InterfaceC4598 interfaceC4598) {
        long j = 0;
        while (true) {
            long jMo406 = interfaceC4598.mo406(this, 8192L);
            if (jMo406 == -1) {
                return j;
            }
            j += jMo406;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p000.InterfaceC3832
    public final void close() {
    }

    @Override // p000.InterfaceC2674, p000.InterfaceC3832, java.io.Flushable
    public final void flush() {
    }

    @Override // p000.InterfaceC4473, p000.InterfaceC2674
    /* JADX INFO: renamed from: ۦؑ */
    public final C1270 mo2685() {
        return this;
    }

    @Override // p000.InterfaceC2674
    public final InterfaceC2674 write(byte[] bArr) {
        m2661(bArr.length, bArr);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C3341 c3341 = this.f4341;
        if (c3341 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c3341.f11174 - c3341.f11177);
        byteBuffer.put(c3341.f11178, c3341.f11177, iMin);
        int i = c3341.f11177 + iMin;
        c3341.f11177 = i;
        this.f4340 -= (long) iMin;
        if (i == c3341.f11174) {
            this.f4341 = c3341.m6103();
            AbstractC3701.m6565(c3341);
        }
        return iMin;
    }
}
