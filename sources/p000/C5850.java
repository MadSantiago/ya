package p000;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: ۦْۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5850 {

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f19276;

    /* JADX INFO: renamed from: ۥۜ */
    public int f19280;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1270 f19281;

    /* JADX INFO: renamed from: ۦۙ */
    public int f19283;

    /* JADX INFO: renamed from: ۥۗ */
    public int f19279 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۦؑ */
    public int f19282 = 4096;

    /* JADX INFO: renamed from: ۥُ */
    public C4123[] f19277 = new C4123[8];

    /* JADX INFO: renamed from: ۥّ */
    public int f19278 = 7;

    public C5850(C1270 c1270) {
        this.f19281 = c1270;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m9670(C1007 c1007) throws EOFException {
        int[] iArr = AbstractC5234.f17266;
        int iMo2205 = c1007.mo2205();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iMo2205; i++) {
            byte bMo2213 = c1007.mo2213(i);
            byte[] bArr = AbstractC4031.f13451;
            j2 += (long) AbstractC5234.f17265[bMo2213 & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int iMo2206 = c1007.mo2205();
        C1270 c1270 = this.f19281;
        if (i2 >= iMo2206) {
            m9671(c1007.mo2205(), 127, 0);
            c1270.m2676(c1007);
            return;
        }
        C1270 c1271 = new C1270();
        int[] iArr2 = AbstractC5234.f17266;
        int iMo2207 = c1007.mo2205();
        int i3 = 0;
        for (int i4 = 0; i4 < iMo2207; i4++) {
            byte bMo2214 = c1007.mo2213(i4);
            byte[] bArr2 = AbstractC4031.f13451;
            int i5 = bMo2214 & 255;
            int i6 = AbstractC5234.f17266[i5];
            byte b = AbstractC5234.f17265[i5];
            j = (j << b) | ((long) i6);
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                c1271.m2680((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            c1271.m2680((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        C1007 c1007Mo2690 = c1271.mo2690(c1271.f4340);
        m9671(c1007Mo2690.mo2205(), 127, 128);
        c1270.m2676(c1007Mo2690);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m9671(int i, int i2, int i3) {
        C1270 c1270 = this.f19281;
        if (i < i2) {
            c1270.m2680(i | i3);
            return;
        }
        c1270.m2680(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            c1270.m2680(128 | (i4 & 127));
            i4 >>>= 7;
        }
        c1270.m2680(i4);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m9672(C4123 c4123) {
        int i = c4123.f13736;
        int i2 = this.f19282;
        if (i > i2) {
            C4123[] c4123Arr = this.f19277;
            Arrays.fill(c4123Arr, 0, c4123Arr.length, (Object) null);
            this.f19278 = this.f19277.length - 1;
            this.f19283 = 0;
            this.f19280 = 0;
            return;
        }
        m9673((this.f19280 + i) - i2);
        int i3 = this.f19283 + 1;
        C4123[] c4123Arr2 = this.f19277;
        if (i3 > c4123Arr2.length) {
            C4123[] c4123Arr3 = new C4123[c4123Arr2.length * 2];
            System.arraycopy(c4123Arr2, 0, c4123Arr3, c4123Arr2.length, c4123Arr2.length);
            this.f19278 = this.f19277.length - 1;
            this.f19277 = c4123Arr3;
            c4123Arr2 = c4123Arr3;
        }
        int i4 = this.f19278;
        this.f19278 = i4 - 1;
        c4123Arr2[i4] = c4123;
        this.f19283++;
        this.f19280 += i;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m9673(int i) {
        int i2;
        if (i > 0) {
            int length = this.f19277.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f19278;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f19277[length].f13736;
                i -= i4;
                this.f19280 -= i4;
                this.f19283--;
                i3++;
                length--;
            }
            C4123[] c4123Arr = this.f19277;
            int i5 = i2 + 1;
            System.arraycopy(c4123Arr, i5, c4123Arr, i5 + i3, this.f19283);
            C4123[] c4123Arr2 = this.f19277;
            int i6 = this.f19278 + 1;
            Arrays.fill(c4123Arr2, i6, i6 + i3, (Object) null);
            this.f19278 += i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX INFO: renamed from: ۦؑ */
    public final void m9674(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.f19276) {
            int i = this.f19279;
            if (i < this.f19282) {
                m9671(i, 31, 32);
            }
            this.f19276 = false;
            this.f19279 = Integer.MAX_VALUE;
            m9671(this.f19282, 31, 32);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C4123 c4123 = (C4123) arrayList.get(i2);
            C1007 c1007Mo2209 = c4123.f13738.mo2209();
            C1007 c1007 = c4123.f13737;
            Integer num = (Integer) AbstractC2953.f9908.get(c1007Mo2209);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    C4123[] c4123Arr = AbstractC2953.f9909;
                    if (AbstractC3831.m6874(c4123Arr[iIntValue].f13737, c1007)) {
                        length = length2;
                    } else if (AbstractC3831.m6874(c4123Arr[length2].f13737, c1007)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int length3 = this.f19277.length;
                for (int i3 = this.f19278 + 1; i3 < length3; i3++) {
                    if (AbstractC3831.m6874(this.f19277[i3].f13738, c1007Mo2209)) {
                        if (AbstractC3831.m6874(this.f19277[i3].f13737, c1007)) {
                            length2 = AbstractC2953.f9909.length + (i3 - this.f19278);
                            break;
                        } else if (length == -1) {
                            length = (i3 - this.f19278) + AbstractC2953.f9909.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                m9671(length2, 127, 128);
            } else if (length == -1) {
                this.f19281.m2680(64);
                m9670(c1007Mo2209);
                m9670(c1007);
                m9672(c4123);
            } else {
                C1007 c1008 = C4123.f13733;
                c1007Mo2209.getClass();
                if (!c1007Mo2209.mo2211(0, c1008, c1008.mo2205()) || AbstractC3831.m6874(C4123.f13734, c1007Mo2209)) {
                    m9671(length, 63, 64);
                    m9670(c1007);
                    m9672(c4123);
                } else {
                    m9671(length, 15, 0);
                    m9670(c1007);
                }
            }
        }
    }
}
