package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۥًِٙؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1624 {

    /* JADX INFO: renamed from: ۥۗ */
    public int f5436;

    /* JADX INFO: renamed from: ۥۣ */
    public int[] f5437;

    public C1624() {
        this.f5437 = new int[10];
    }

    /* JADX INFO: renamed from: ۥؗ */
    public void m3395(int i) {
        int[] iArrCopyOf = this.f5437;
        if (this.f5436 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f5437 = iArrCopyOf;
        }
        int i2 = this.f5436;
        this.f5436 = i2 + 1;
        iArrCopyOf[i2] = i;
    }

    /* JADX INFO: renamed from: ۥُ */
    public void m3396(int i, int i2, int i3, int i4) {
        int i5 = this.f5436;
        int[] iArrCopyOf = this.f5437;
        int i6 = i5 + 4;
        if (i6 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f5437 = iArrCopyOf;
        }
        iArrCopyOf[i5] = i;
        iArrCopyOf[i5 + 1] = i2;
        iArrCopyOf[i5 + 2] = i3;
        iArrCopyOf[i5 + 3] = i4;
        this.f5436 = i6;
    }

    /* JADX INFO: renamed from: ۥّ */
    public void m3397(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.f5437;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    m3401(i3, i4);
                }
            }
            m3401(i3 + 3, i2);
            m3397(i, i3);
            m3397(i3 + 6, i2);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public int m3398() {
        int[] iArr = this.f5437;
        int i = this.f5436 - 1;
        this.f5436 = i;
        return iArr[i];
    }

    /* JADX INFO: renamed from: ۥۣ */
    public int m3399(int i) {
        int i2 = this.f5436 - 1;
        return i2 >= 0 ? this.f5437[i2] : i;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public void m3400(int i, int i2, int i3) {
        int i4 = this.f5436;
        int[] iArrCopyOf = this.f5437;
        int i5 = i4 + 3;
        if (i5 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f5437 = iArrCopyOf;
        }
        iArrCopyOf[i4] = i + i3;
        iArrCopyOf[i4 + 1] = i2 + i3;
        iArrCopyOf[i4 + 2] = i3;
        this.f5436 = i5;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public void m3401(int i, int i2) {
        int[] iArr = this.f5437;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }

    public C1624(int i) {
        this.f5437 = new int[i];
    }
}
