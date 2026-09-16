package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: ۥِٟؗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2024 {

    /* JADX INFO: renamed from: ۥؗ */
    public int f6663;

    /* JADX INFO: renamed from: ۥُ */
    public boolean f6664;

    /* JADX INFO: renamed from: ۥّ */
    public int f6665;

    /* JADX INFO: renamed from: ۥۗ */
    public int f6666;

    /* JADX INFO: renamed from: ۥۜ */
    public int f6667;

    /* JADX INFO: renamed from: ۥۣ */
    public int f6668;

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f6669;

    /* JADX INFO: renamed from: ۦؚ */
    public final Object f6670;

    /* JADX INFO: renamed from: ۦِ */
    public Object f6671;

    /* JADX INFO: renamed from: ۦٛ */
    public Object f6672;

    /* JADX INFO: renamed from: ۦۗ */
    public Object f6673;

    /* JADX INFO: renamed from: ۦۙ */
    public int f6674;

    public C2024() {
        C4452 c4452 = C4452.f14674;
        if (c4452 == null) {
            c4452 = new C4452(3);
            C4452.f14674 = c4452;
        }
        this.f6666 = 1;
        this.f6671 = null;
        this.f6663 = 0;
        this.f6669 = false;
        this.f6664 = false;
        this.f6673 = new int[16];
        this.f6674 = 0;
        this.f6667 = 0;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN);
        this.f6672 = byteBufferOrder;
        this.f6670 = c4452;
        this.f6668 = byteBufferOrder.capacity();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public void m3943(int i) {
        m3954(4, 0);
        int iM3953 = (m3953() - i) + 4;
        ByteBuffer byteBuffer = (ByteBuffer) this.f6672;
        int i2 = this.f6668 - 4;
        this.f6668 = i2;
        byteBuffer.putInt(i2, iM3953);
    }

    /* JADX INFO: renamed from: ۥَ */
    public void m3944(int i, int i2, int i3) {
        if (this.f6669) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        this.f6667 = i2;
        int i4 = i * i2;
        m3954(4, i4);
        m3954(i3, i4);
        this.f6669 = true;
    }

    /* JADX INFO: renamed from: ۥُ */
    public void m3945(short s) {
        m3954(2, 0);
        ByteBuffer byteBuffer = (ByteBuffer) this.f6672;
        int i = this.f6668 - 2;
        this.f6668 = i;
        byteBuffer.putShort(i, s);
    }

    /* JADX INFO: renamed from: ۥّ */
    public int m3946(CharSequence charSequence) {
        char c;
        char c2;
        boolean z;
        int i;
        int i2;
        int i3;
        char cCharAt;
        C4452 c4452 = (C4452) this.f6670;
        c4452.getClass();
        int length = charSequence.length();
        int i4 = 0;
        int i5 = 0;
        while (i5 < length && charSequence.charAt(i5) < 128) {
            i5++;
        }
        int i6 = length;
        while (true) {
            c = 55296;
            c2 = 2048;
            z = true;
            if (i5 < length) {
                char cCharAt2 = charSequence.charAt(i5);
                if (cCharAt2 >= 2048) {
                    int length2 = charSequence.length();
                    int i7 = 0;
                    while (i5 < length2) {
                        char cCharAt3 = charSequence.charAt(i5);
                        if (cCharAt3 < 2048) {
                            i7 += (127 - cCharAt3) >>> 31;
                        } else {
                            i7 += 2;
                            if (55296 <= cCharAt3 && cCharAt3 <= 57343) {
                                if (Character.codePointAt(charSequence, i5) < 65536) {
                                    throw new C0869(i5, length2);
                                }
                                i5++;
                            }
                        }
                        i5++;
                    }
                    i6 += i7;
                    break;
                }
                i6 += (127 - cCharAt2) >>> 31;
                i5++;
            } else {
                break;
            }
        }
        if (i6 < length) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i6) + 4294967296L));
        }
        m3951((byte) 0);
        m3944(1, i6, 1);
        ByteBuffer byteBuffer = (ByteBuffer) this.f6672;
        int i8 = this.f6668 - i6;
        this.f6668 = i8;
        byteBuffer.position(i8);
        ByteBuffer byteBuffer2 = (ByteBuffer) this.f6672;
        c4452.getClass();
        if (byteBuffer2.hasArray()) {
            int iArrayOffset = byteBuffer2.arrayOffset();
            byte[] bArrArray = byteBuffer2.array();
            int iPosition = byteBuffer2.position() + iArrayOffset;
            int iRemaining = byteBuffer2.remaining();
            int length3 = charSequence.length();
            int i9 = iRemaining + iPosition;
            while (true) {
                boolean z2 = z;
                if (i4 >= length3 || (i3 = i4 + iPosition) >= i9 || (cCharAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                bArrArray[i3] = (byte) cCharAt;
                i4++;
                z = z2;
            }
            if (i4 == length3) {
                i = iPosition + length3;
            } else {
                i = iPosition + i4;
                while (i4 < length3) {
                    char cCharAt4 = charSequence.charAt(i4);
                    if (cCharAt4 < 128 && i < i9) {
                        bArrArray[i] = (byte) cCharAt4;
                        i++;
                    } else if (cCharAt4 < c2 && i <= i9 - 2) {
                        int i10 = i + 1;
                        bArrArray[i] = (byte) ((cCharAt4 >>> 6) | 960);
                        i += 2;
                        bArrArray[i10] = (byte) ((cCharAt4 & '?') | 128);
                    } else {
                        if ((cCharAt4 >= c && 57343 >= cCharAt4) || i > i9 - 3) {
                            if (i > i9 - 4) {
                                if (55296 <= cCharAt4 && cCharAt4 <= 57343 && ((i2 = i4 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt4, charSequence.charAt(i2)))) {
                                    throw new C0869(i4, length3);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt4 + " at index " + i);
                            }
                            int i11 = i4 + 1;
                            if (i11 != charSequence.length()) {
                                char cCharAt5 = charSequence.charAt(i11);
                                if (Character.isSurrogatePair(cCharAt4, cCharAt5)) {
                                    int codePoint = Character.toCodePoint(cCharAt4, cCharAt5);
                                    bArrArray[i] = (byte) ((codePoint >>> 18) | 240);
                                    bArrArray[i + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i12 = i + 3;
                                    bArrArray[i + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i += 4;
                                    bArrArray[i12] = (byte) ((codePoint & 63) | 128);
                                    i4 = i11;
                                } else {
                                    i4 = i11;
                                }
                            }
                            throw new C0869(i4 - 1, length3);
                        }
                        bArrArray[i] = (byte) ((cCharAt4 >>> '\f') | 480);
                        int i13 = i + 2;
                        bArrArray[i + 1] = (byte) (((cCharAt4 >>> 6) & 63) | 128);
                        i += 3;
                        bArrArray[i13] = (byte) ((cCharAt4 & '?') | 128);
                    }
                    i4++;
                    c = 55296;
                    c2 = 2048;
                }
            }
            byteBuffer2.position(i - iArrayOffset);
        } else {
            int length4 = charSequence.length();
            int iPosition2 = byteBuffer2.position();
            while (i4 < length4) {
                try {
                    char cCharAt6 = charSequence.charAt(i4);
                    if (cCharAt6 >= 128) {
                        break;
                    }
                    byteBuffer2.put(iPosition2 + i4, (byte) cCharAt6);
                    i4++;
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (i4 == length4) {
                byteBuffer2.position(iPosition2 + i4);
            } else {
                iPosition2 += i4;
                while (i4 < length4) {
                    char cCharAt7 = charSequence.charAt(i4);
                    if (cCharAt7 >= 128) {
                        if (cCharAt7 < 2048) {
                            int i14 = iPosition2 + 1;
                            try {
                                byteBuffer2.put(iPosition2, (byte) ((cCharAt7 >>> 6) | 192));
                                byteBuffer2.put(i14, (byte) ((cCharAt7 & '?') | 128));
                                iPosition2 = i14;
                            } catch (IndexOutOfBoundsException unused2) {
                                iPosition2 = i14;
                            }
                        } else {
                            if (cCharAt7 >= 55296 && 57343 >= cCharAt7) {
                                int i15 = i4 + 1;
                                if (i15 != length4) {
                                    try {
                                        char cCharAt8 = charSequence.charAt(i15);
                                        if (Character.isSurrogatePair(cCharAt7, cCharAt8)) {
                                            int codePoint2 = Character.toCodePoint(cCharAt7, cCharAt8);
                                            int i16 = iPosition2 + 1;
                                            try {
                                                byteBuffer2.put(iPosition2, (byte) ((codePoint2 >>> 18) | 240));
                                                int i17 = iPosition2 + 2;
                                                try {
                                                    byteBuffer2.put(i16, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                                    iPosition2 += 3;
                                                    byteBuffer2.put(i17, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                                    byteBuffer2.put(iPosition2, (byte) ((codePoint2 & 63) | 128));
                                                    i4 = i15;
                                                    i4++;
                                                    iPosition2++;
                                                } catch (IndexOutOfBoundsException unused3) {
                                                    i4 = i15;
                                                    iPosition2 = i17;
                                                }
                                            } catch (IndexOutOfBoundsException unused4) {
                                                iPosition2 = i16;
                                                i4 = i15;
                                            }
                                        } else {
                                            i4 = i15;
                                        }
                                    } catch (IndexOutOfBoundsException unused5) {
                                    }
                                    i4 = i15;
                                }
                                throw new C0869(i4, length4);
                            }
                            int i18 = iPosition2 + 1;
                            try {
                                byteBuffer2.put(iPosition2, (byte) ((cCharAt7 >>> '\f') | 224));
                                iPosition2 += 2;
                                byteBuffer2.put(i18, (byte) (((cCharAt7 >>> 6) & 63) | 128));
                                byteBuffer2.put(iPosition2, (byte) ((cCharAt7 & '?') | 128));
                                i4++;
                                iPosition2++;
                            } catch (IndexOutOfBoundsException unused6) {
                                iPosition2 = i18;
                            }
                        }
                        int iMax = Math.max(i4, (iPosition2 - byteBuffer2.position()) + 1) + byteBuffer2.position();
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i4) + " at index " + iMax);
                    }
                    byteBuffer2.put(iPosition2, (byte) cCharAt7);
                    i4++;
                    iPosition2++;
                }
                byteBuffer2.position(iPosition2);
            }
        }
        return m3956();
    }

    /* JADX INFO: renamed from: ۥْ */
    public void m3947(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                AbstractC5508.m9201("Invalid remove index " + i);
            }
            if (this.f6663 == i) {
                this.f6667 += i2;
                return;
            }
            m3961();
            this.f6663 = i;
            this.f6667 = i2;
        }
    }

    /* JADX INFO: renamed from: ۥٓ */
    public void m3948(int i) {
        if (this.f6669) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        int[] iArr = (int[]) this.f6671;
        if (iArr == null || iArr.length < i) {
            iArr = new int[i];
            this.f6671 = iArr;
        }
        this.f6663 = i;
        Arrays.fill(iArr, 0, i, 0);
        this.f6669 = true;
        this.f6665 = m3953();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public void m3949(byte b) {
        if (b != 0) {
            m3951(b);
            ((int[]) this.f6671)[1] = m3953();
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public int m3950() {
        int i;
        if (((int[]) this.f6671) == null || !this.f6669) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        m3954(4, 0);
        ByteBuffer byteBuffer = (ByteBuffer) this.f6672;
        int i2 = this.f6668 - 4;
        this.f6668 = i2;
        byteBuffer.putInt(i2, 0);
        int iM3953 = m3953();
        int i3 = this.f6663 - 1;
        while (i3 >= 0 && ((int[]) this.f6671)[i3] == 0) {
            i3--;
        }
        for (int i4 = i3; i4 >= 0; i4--) {
            int i5 = ((int[]) this.f6671)[i4];
            m3945((short) (i5 != 0 ? iM3953 - i5 : 0));
        }
        m3945((short) (iM3953 - this.f6665));
        m3945((short) ((i3 + 3) * 2));
        int i6 = 0;
        loop2: while (true) {
            if (i6 >= this.f6674) {
                i = 0;
                break;
            }
            int iCapacity = ((ByteBuffer) this.f6672).capacity() - ((int[]) this.f6673)[i6];
            int i7 = this.f6668;
            short s = ((ByteBuffer) this.f6672).getShort(iCapacity);
            if (s == ((ByteBuffer) this.f6672).getShort(i7)) {
                int i8 = 2;
                while (true) {
                    if (i8 >= s) {
                        i = ((int[]) this.f6673)[i6];
                        break loop2;
                    }
                    if (((ByteBuffer) this.f6672).getShort(iCapacity + i8) != ((ByteBuffer) this.f6672).getShort(i7 + i8)) {
                        break;
                    }
                    i8 += 2;
                }
            }
            i6++;
        }
        if (i != 0) {
            int iCapacity2 = ((ByteBuffer) this.f6672).capacity() - iM3953;
            this.f6668 = iCapacity2;
            ((ByteBuffer) this.f6672).putInt(iCapacity2, i - iM3953);
        } else {
            int i9 = this.f6674;
            int[] iArrCopyOf = (int[]) this.f6673;
            if (i9 == iArrCopyOf.length) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i9 * 2);
                this.f6673 = iArrCopyOf;
            }
            int i10 = this.f6674;
            this.f6674 = i10 + 1;
            iArrCopyOf[i10] = m3953();
            ByteBuffer byteBuffer2 = (ByteBuffer) this.f6672;
            byteBuffer2.putInt(byteBuffer2.capacity() - iM3953, m3953() - iM3953);
        }
        this.f6669 = false;
        return iM3953;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m3951(byte b) {
        m3954(1, 0);
        ByteBuffer byteBuffer = (ByteBuffer) this.f6672;
        int i = this.f6668 - 1;
        this.f6668 = i;
        byteBuffer.put(i, b);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public void m3952(int i, int i2) {
        if (i2 != 0) {
            m3943(i2);
            ((int[]) this.f6671)[i] = m3953();
        }
    }

    /* JADX INFO: renamed from: ۦؚ */
    public int m3953() {
        return ((ByteBuffer) this.f6672).capacity() - this.f6668;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public void m3954(int i, int i2) {
        int i3;
        if (i > this.f6666) {
            this.f6666 = i;
        }
        int i4 = ((~((((ByteBuffer) this.f6672).capacity() - this.f6668) + i2)) + 1) & (i - 1);
        while (this.f6668 < i4 + i + i2) {
            int iCapacity = ((ByteBuffer) this.f6672).capacity();
            ByteBuffer byteBuffer = (ByteBuffer) this.f6672;
            int iCapacity2 = byteBuffer.capacity();
            if (iCapacity2 == 0) {
                i3 = 1024;
            } else {
                i3 = 2147483639;
                if (iCapacity2 == 2147483639) {
                    throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
                }
                if (((-1073741824) & iCapacity2) == 0) {
                    i3 = iCapacity2 << 1;
                }
            }
            byteBuffer.position(0);
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i3).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.position(byteBufferOrder.clear().capacity() - iCapacity2);
            byteBufferOrder.put(byteBuffer);
            this.f6672 = byteBufferOrder;
            this.f6668 = (byteBufferOrder.capacity() - iCapacity) + this.f6668;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            ByteBuffer byteBuffer2 = (ByteBuffer) this.f6672;
            int i6 = this.f6668 - 1;
            this.f6668 = i6;
            byteBuffer2.put(i6, (byte) 0);
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public void m3955(int i) {
        m3954(this.f6666, 4);
        m3943(i);
        ((ByteBuffer) this.f6672).position(this.f6668);
        this.f6664 = true;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public int m3956() {
        if (!this.f6669) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f6669 = false;
        int i = this.f6667;
        ByteBuffer byteBuffer = (ByteBuffer) this.f6672;
        int i2 = this.f6668 - 4;
        this.f6668 = i2;
        byteBuffer.putInt(i2, i);
        return m3953();
    }

    /* JADX INFO: renamed from: ۦۗ */
    public void m3957() {
        m3961();
        ArrayList arrayList = (ArrayList) this.f6670;
        if (arrayList.isEmpty()) {
            this.f6666++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public int m3958(int[] iArr) {
        if (this.f6669) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        m3944(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            m3943(iArr[length]);
        }
        return m3956();
    }

    /* JADX INFO: renamed from: ۦۚ */
    public void m3959() {
        ArrayList arrayList = (ArrayList) this.f6670;
        int i = this.f6666;
        if (i > 0) {
            C0188 c0188 = ((C4773) this.f6671).f15736;
            c0188.m452(C2088.f6875);
            c0188.f699[c0188.f701 - c0188.f700[c0188.f698 - 1].f18679] = i;
            this.f6666 = 0;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C4773 c4773 = (C4773) this.f6671;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        c4773.getClass();
        if (size != 0) {
            C0188 c0189 = c4773.f15736;
            c0189.m452(C3311.f11085);
            AbstractC1605.m3355(c0189, 0, objArr);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public void m3960(boolean z) {
        C3222 c3222 = ((C5362) this.f6672).f17671;
        int i = z ? c3222.f10831 : c3222.f10833;
        int i2 = i - this.f6668;
        if (i2 < 0) {
            AbstractC5508.m9201("Tried to seek backward");
        }
        if (i2 > 0) {
            C0188 c0188 = ((C4773) this.f6671).f15736;
            c0188.m452(C5907.f19490);
            c0188.f699[c0188.f701 - c0188.f700[c0188.f698 - 1].f18679] = i2;
            this.f6668 = i;
        }
    }

    /* JADX INFO: renamed from: ۦۨ */
    public void m3961() {
        int i = this.f6667;
        if (i > 0) {
            int i2 = this.f6663;
            if (i2 >= 0) {
                m3959();
                C0188 c0188 = ((C4773) this.f6671).f15736;
                c0188.m452(C4676.f15409);
                int i3 = c0188.f701 - c0188.f700[c0188.f698 - 1].f18679;
                int[] iArr = c0188.f699;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.f6663 = -1;
            } else {
                int i4 = this.f6674;
                int i5 = this.f6665;
                m3959();
                C0188 c0189 = ((C4773) this.f6671).f15736;
                c0189.m452(C2349.f7789);
                int i6 = c0189.f701 - c0189.f700[c0189.f698 - 1].f18679;
                int[] iArr2 = c0189.f699;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.f6665 = -1;
                this.f6674 = -1;
            }
            this.f6667 = 0;
        }
    }

    public C2024(C5362 c5362, C4773 c4773) {
        this.f6672 = c5362;
        this.f6671 = c4773;
        this.f6673 = new C1624();
        this.f6664 = true;
        this.f6670 = new ArrayList();
        this.f6663 = -1;
        this.f6665 = -1;
        this.f6674 = -1;
    }
}
