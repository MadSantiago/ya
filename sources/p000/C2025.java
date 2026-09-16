package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: ۥٟٖؗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2025 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C4162 f6675;

    /* JADX INFO: renamed from: ۥّ */
    public int f6677;

    /* JADX INFO: renamed from: ۦۙ */
    public int f6681;

    /* JADX INFO: renamed from: ۥۣ */
    public int f6679 = 4096;

    /* JADX INFO: renamed from: ۥۗ */
    public final ArrayList f6678 = new ArrayList();

    /* JADX INFO: renamed from: ۦؑ */
    public C4123[] f6680 = new C4123[8];

    /* JADX INFO: renamed from: ۥُ */
    public int f6676 = 7;

    public C2025(C1925 c1925) {
        this.f6675 = new C4162(c1925);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m3962(C4123 c4123) {
        this.f6678.add(c4123);
        int i = c4123.f13736;
        int i2 = this.f6679;
        if (i > i2) {
            C4123[] c4123Arr = this.f6680;
            Arrays.fill(c4123Arr, 0, c4123Arr.length, (Object) null);
            this.f6676 = this.f6680.length - 1;
            this.f6677 = 0;
            this.f6681 = 0;
            return;
        }
        m3965((this.f6681 + i) - i2);
        int i3 = this.f6677 + 1;
        C4123[] c4123Arr2 = this.f6680;
        if (i3 > c4123Arr2.length) {
            C4123[] c4123Arr3 = new C4123[c4123Arr2.length * 2];
            System.arraycopy(c4123Arr2, 0, c4123Arr3, c4123Arr2.length, c4123Arr2.length);
            this.f6676 = this.f6680.length - 1;
            this.f6680 = c4123Arr3;
            c4123Arr2 = c4123Arr3;
        }
        int i4 = this.f6676;
        this.f6676 = i4 - 1;
        c4123Arr2[i4] = c4123;
        this.f6677++;
        this.f6681 += i;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final int m3963(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.f6675.readByte();
            byte[] bArr = AbstractC4031.f13451;
            int i5 = b & 255;
            if ((b & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & 127) << i4;
            i4 += 7;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C1007 m3964(int i) throws IOException {
        if (i >= 0) {
            C4123[] c4123Arr = AbstractC2953.f9909;
            if (i <= c4123Arr.length - 1) {
                return c4123Arr[i].f13738;
            }
        }
        int length = this.f6676 + 1 + (i - AbstractC2953.f9909.length);
        if (length >= 0) {
            C4123[] c4123Arr2 = this.f6680;
            if (length < c4123Arr2.length) {
                return c4123Arr2[length].f13738;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m3965(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.f6680.length;
            while (true) {
                length--;
                i2 = this.f6676;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f6680[length].f13736;
                i -= i4;
                this.f6681 -= i4;
                this.f6677--;
                i3++;
            }
            C4123[] c4123Arr = this.f6680;
            int i5 = i2 + 1;
            System.arraycopy(c4123Arr, i5, c4123Arr, i5 + i3, this.f6677);
            this.f6676 += i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final C1007 m3966() {
        C4162 c4162 = this.f6675;
        byte b = c4162.readByte();
        byte[] bArr = AbstractC4031.f13451;
        int i = b & 255;
        int i2 = 0;
        boolean z = (b & 128) == 128;
        long jM3963 = m3963(i, 127);
        if (!z) {
            return c4162.mo2690(jM3963);
        }
        C1270 c1270 = new C1270();
        C4360 c4360 = AbstractC5234.f17264;
        C4360 c4361 = c4360;
        int i3 = 0;
        for (long j = 0; j < jM3963; j++) {
            byte b2 = c4162.readByte();
            byte[] bArr2 = AbstractC4031.f13451;
            i2 = (i2 << 8) | (b2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                c4361 = ((C4360[]) c4361.f14360)[(i2 >>> (i3 - 8)) & 255];
                if (((C4360[]) c4361.f14360) == null) {
                    c1270.m2680(c4361.f14362);
                    i3 -= c4361.f14361;
                    c4361 = c4360;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            C4360 c4362 = ((C4360[]) c4361.f14360)[(i2 << (8 - i3)) & 255];
            C4360[] c4360Arr = (C4360[]) c4362.f14360;
            int i4 = c4362.f14361;
            if (c4360Arr != null || i4 > i3) {
                break;
            }
            c1270.m2680(c4362.f14362);
            i3 -= i4;
            c4361 = c4360;
        }
        return c1270.mo2690(c1270.f4340);
    }
}
