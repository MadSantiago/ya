package p000;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ۥۗؒۙۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2100 {

    /* JADX INFO: renamed from: ۥّ */
    public static final Logger f6914 = Logger.getLogger(C2100.class.getName());

    /* JADX INFO: renamed from: ۦۙ */
    public static final boolean f6915 = AbstractC1194.f4117;

    /* JADX INFO: renamed from: ۥؗ */
    public final int f6916;

    /* JADX INFO: renamed from: ۥُ */
    public final C0781 f6917;

    /* JADX INFO: renamed from: ۥۗ */
    public final byte[] f6918;

    /* JADX INFO: renamed from: ۥۣ */
    public C5086 f6919;

    /* JADX INFO: renamed from: ۦؑ */
    public int f6920;

    public C2100(C0781 c0781, int i) {
        if (i < 0) {
            C1078.m2272("bufferSize must be >= 0");
            throw null;
        }
        int iMax = Math.max(i, 20);
        this.f6918 = new byte[iMax];
        this.f6916 = iMax;
        this.f6917 = c0781;
    }

    /* JADX INFO: renamed from: ۥّ */
    public static int m4046(int i, C0533 c0533) {
        int iM4047 = m4047(i);
        int size = c0533.size();
        return m4049(size) + size + iM4047;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static int m4047(int i) {
        return m4049(i << 3);
    }

    /* JADX INFO: renamed from: ۦِ */
    public static int m4048(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static int m4049(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static int m4050(String str) {
        int length;
        try {
            length = AbstractC0298.m630(str);
        } catch (C5699 unused) {
            length = str.getBytes(AbstractC3576.f11899).length;
        }
        return m4049(length) + length;
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final void m4051(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iM4049 = m4049(length);
            int i = iM4049 + length;
            int i2 = this.f6916;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iM8655 = AbstractC0298.f1087.m8655(str, bArr, 0, length);
                m4072(iM8655);
                m4074(bArr, 0, iM8655);
                return;
            }
            if (i > i2 - this.f6920) {
                m4073();
            }
            int iM40410 = m4049(str.length());
            int i3 = this.f6920;
            byte[] bArr2 = this.f6918;
            try {
                try {
                    if (iM40410 == iM4049) {
                        int i4 = i3 + iM40410;
                        this.f6920 = i4;
                        int iM8656 = AbstractC0298.f1087.m8655(str, bArr2, i4, i2 - i4);
                        this.f6920 = i3;
                        m4067((iM8656 - i3) - iM40410);
                        this.f6920 = iM8656;
                    } else {
                        int iM630 = AbstractC0298.m630(str);
                        m4067(iM630);
                        this.f6920 = AbstractC0298.f1087.m8655(str, bArr2, this.f6920, iM630);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new C2943(e);
                }
            } catch (C5699 e2) {
                this.f6920 = i3;
                throw e2;
            }
        } catch (C5699 e3) {
            f6914.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(AbstractC3576.f11899);
            try {
                m4072(bytes.length);
                m4070(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e4) {
                throw new C2943(e4);
            }
        }
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final void m4052(int i, String str) throws IOException {
        m4066(i, 2);
        m4051(str);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m4053(int i, int i2) {
        m4067((i << 3) | i2);
    }

    /* JADX INFO: renamed from: ۥً */
    public final void m4054(int i, int i2) {
        m4068(20);
        m4053(i, 0);
        m4067(i2);
    }

    /* JADX INFO: renamed from: ۥَ */
    public final void m4055(int i) {
        m4068(4);
        m4065(i);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m4056(long j) {
        boolean z = f6915;
        byte[] bArr = this.f6918;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.f6920;
                if (j2 == 0) {
                    this.f6920 = i + 1;
                    AbstractC1194.m2520(bArr, i, (byte) j);
                    return;
                } else {
                    this.f6920 = i + 1;
                    AbstractC1194.m2520(bArr, i, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.f6920;
                if (j3 == 0) {
                    this.f6920 = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.f6920 = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥْ */
    public final void m4057(C0533 c0533) throws IOException {
        m4072(c0533.size());
        m4070(c0533.f1876, c0533.mo1190(), c0533.size());
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final void m4058(int i, int i2) {
        m4068(14);
        m4053(i, 5);
        m4065(i2);
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final void m4059(long j, int i) {
        m4068(20);
        m4053(i, 0);
        m4056(j);
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final void m4060(long j, int i) {
        m4068(18);
        m4053(i, 1);
        m4063(j);
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final void m4061(int i, AbstractC0066 abstractC0066, InterfaceC1622 interfaceC1622) {
        m4066(i, 2);
        m4072(abstractC0066.mo677(interfaceC1622));
        interfaceC1622.mo3389(abstractC0066, this.f6919);
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final void m4062(int i) {
        if (i >= 0) {
            m4072(i);
        } else {
            m4064(i);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m4063(long j) {
        int i = this.f6920;
        int i2 = i + 1;
        this.f6920 = i2;
        byte[] bArr = this.f6918;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.f6920 = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.f6920 = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.f6920 = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.f6920 = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.f6920 = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.f6920 = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f6920 = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final void m4064(long j) {
        m4068(10);
        m4056(j);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4065(int i) {
        int i2 = this.f6920;
        int i3 = i2 + 1;
        this.f6920 = i3;
        byte[] bArr = this.f6918;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.f6920 = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.f6920 = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f6920 = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final void m4066(int i, int i2) {
        m4072((i << 3) | i2);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m4067(int i) {
        boolean z = f6915;
        byte[] bArr = this.f6918;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.f6920;
                if (i2 == 0) {
                    this.f6920 = i3 + 1;
                    AbstractC1194.m2520(bArr, i3, (byte) i);
                    return;
                } else {
                    this.f6920 = i3 + 1;
                    AbstractC1194.m2520(bArr, i3, (byte) ((i | 128) & 255));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.f6920;
                if (i4 == 0) {
                    this.f6920 = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.f6920 = i5 + 1;
                    bArr[i5] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final void m4068(int i) {
        if (this.f6916 - this.f6920 < i) {
            m4073();
        }
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final void m4069(byte b) {
        if (this.f6920 == this.f6916) {
            m4073();
        }
        int i = this.f6920;
        this.f6920 = i + 1;
        this.f6918[i] = b;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final void m4070(byte[] bArr, int i, int i2) throws IOException {
        m4074(bArr, i, i2);
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final void m4071(long j) {
        m4068(8);
        m4063(j);
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final void m4072(int i) {
        m4068(5);
        m4067(i);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m4073() {
        this.f6917.write(this.f6918, 0, this.f6920);
        this.f6920 = 0;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final void m4074(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f6920;
        int i4 = this.f6916;
        int i5 = i4 - i3;
        byte[] bArr2 = this.f6918;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f6920 += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f6920 = i4;
        m4073();
        if (i7 > i4) {
            this.f6917.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f6920 = i7;
        }
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final void m4075(int i, int i2) {
        m4068(20);
        m4053(i, 0);
        if (i2 >= 0) {
            m4067(i2);
        } else {
            m4056(i2);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final void m4076(int i, C0533 c0533) throws IOException {
        m4066(i, 2);
        m4057(c0533);
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final void m4077(int i, boolean z) {
        m4068(11);
        m4053(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.f6920;
        this.f6920 = i2 + 1;
        this.f6918[i2] = b;
    }
}
