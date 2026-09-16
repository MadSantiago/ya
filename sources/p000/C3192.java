package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۦؘؚؓؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3192 {

    /* JADX INFO: renamed from: ۥّ */
    public static final C3192 f10721 = new C3192(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: ۥؗ */
    public Object[] f10722;

    /* JADX INFO: renamed from: ۥُ */
    public boolean f10723;

    /* JADX INFO: renamed from: ۥۗ */
    public int[] f10724;

    /* JADX INFO: renamed from: ۥۣ */
    public int f10725;

    /* JADX INFO: renamed from: ۦؑ */
    public int f10726 = -1;

    public C3192(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f10725 = i;
        this.f10724 = iArr;
        this.f10722 = objArr;
        this.f10723 = z;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C3192 m5886() {
        return new C3192(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C3192)) {
            C3192 c3192 = (C3192) obj;
            int i = this.f10725;
            if (i == c3192.f10725) {
                int[] iArr = this.f10724;
                int[] iArr2 = c3192.f10724;
                for (int i2 = 0; i2 < i; i2++) {
                    if (iArr[i2] == iArr2[i2]) {
                    }
                }
                Object[] objArr = this.f10722;
                Object[] objArr2 = c3192.f10722;
                int i3 = this.f10725;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (objArr[i4].equals(objArr2[i4])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f10725;
        int i2 = i + 527;
        int[] iArr = this.f10724;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.f10722;
        int i6 = this.f10725;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final int m5887() {
        int iM935;
        int iM934;
        int iM936;
        int i = this.f10726;
        if (i != -1) {
            return i;
        }
        int iM3994 = 0;
        for (int i2 = 0; i2 < this.f10725; i2++) {
            int i3 = this.f10724[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        int i6 = i4 << 3;
                        AbstractC4314 abstractC4314 = (AbstractC4314) this.f10722[i2];
                        int iM937 = AbstractC0438.m935(i6);
                        int iMo7605 = abstractC4314.mo7605();
                        iM3994 = AbstractC2049.m3994(iMo7605, iMo7605, iM937, iM3994);
                    } else if (i5 == 3) {
                        int iM938 = AbstractC0438.m935(i4 << 3);
                        iM935 = iM938 + iM938;
                        iM934 = ((C3192) this.f10722[i2]).m5887();
                    } else {
                        if (i5 != 5) {
                            throw new IllegalStateException(new C1306());
                        }
                        ((Integer) this.f10722[i2]).getClass();
                        iM936 = AbstractC0438.m935(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.f10722[i2]).getClass();
                    iM936 = AbstractC0438.m935(i4 << 3) + 8;
                }
                iM3994 = iM936 + iM3994;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.f10722[i2]).longValue();
                iM935 = AbstractC0438.m935(i7);
                iM934 = AbstractC0438.m934(jLongValue);
            }
            iM3994 = iM934 + iM935 + iM3994;
        }
        this.f10726 = iM3994;
        return iM3994;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m5888(int i) {
        int[] iArr = this.f10724;
        if (i > iArr.length) {
            int i2 = this.f10725;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f10724 = Arrays.copyOf(iArr, i);
            this.f10722 = Arrays.copyOf(this.f10722, i);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m5889(C2391 c2391) {
        AbstractC0438 abstractC0438 = (AbstractC0438) c2391.f7924;
        if (this.f10725 != 0) {
            for (int i = 0; i < this.f10725; i++) {
                int i2 = this.f10724[i];
                Object obj = this.f10722[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    abstractC0438.mo943(((Long) obj).longValue(), i4);
                } else if (i3 == 1) {
                    abstractC0438.mo949(((Long) obj).longValue(), i4);
                } else if (i3 == 2) {
                    abstractC0438.mo945(i4, (AbstractC4314) obj);
                } else if (i3 == 3) {
                    abstractC0438.mo944(i4, 3);
                    ((C3192) obj).m5889(c2391);
                    abstractC0438.mo944(i4, 4);
                } else {
                    if (i3 != 5) {
                        C5028.m8450(new C1306());
                        return;
                    }
                    abstractC0438.mo951(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m5890(int i, Object obj) {
        if (!this.f10723) {
            throw new UnsupportedOperationException();
        }
        m5888(this.f10725 + 1);
        int[] iArr = this.f10724;
        int i2 = this.f10725;
        iArr[i2] = i;
        this.f10722[i2] = obj;
        this.f10725 = i2 + 1;
    }
}
