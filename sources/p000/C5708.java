package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۦۥّؔ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5708 {

    /* JADX INFO: renamed from: ۥّ */
    public static final C5708 f18791 = new C5708(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: ۥؗ */
    public Object[] f18792;

    /* JADX INFO: renamed from: ۥُ */
    public boolean f18793;

    /* JADX INFO: renamed from: ۥۗ */
    public int[] f18794;

    /* JADX INFO: renamed from: ۥۣ */
    public int f18795;

    /* JADX INFO: renamed from: ۦؑ */
    public int f18796 = -1;

    public C5708(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f18795 = i;
        this.f18794 = iArr;
        this.f18792 = objArr;
        this.f18793 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5708)) {
            return false;
        }
        C5708 c5708 = (C5708) obj;
        int i = this.f18795;
        if (i == c5708.f18795) {
            int[] iArr = this.f18794;
            int[] iArr2 = c5708.f18794;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f18792;
            Object[] objArr2 = c5708.f18792;
            int i3 = this.f18795;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f18795;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f18794;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f18792;
        int i6 = this.f18795;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m9524(int i, Object obj) {
        if (!this.f18793) {
            throw new UnsupportedOperationException();
        }
        m9526(this.f18795 + 1);
        int[] iArr = this.f18794;
        int i2 = this.f18795;
        iArr[i2] = i;
        this.f18792[i2] = obj;
        this.f18795 = i2 + 1;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final int m9525() {
        int iM4047;
        int iM4048;
        int iM4049;
        int i = this.f18796;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f18795; i3++) {
            int i4 = this.f18794[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.f18792[i3]).getClass();
                    iM4049 = C2100.m4047(i5) + 8;
                } else if (i6 == 2) {
                    iM4049 = C2100.m4046(i5, (C0533) this.f18792[i3]);
                } else if (i6 == 3) {
                    iM4047 = C2100.m4047(i5) * 2;
                    iM4048 = ((C5708) this.f18792[i3]).m9525();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(C3406.m6170());
                    }
                    ((Integer) this.f18792[i3]).getClass();
                    iM4049 = C2100.m4047(i5) + 4;
                }
                i2 = iM4049 + i2;
            } else {
                long jLongValue = ((Long) this.f18792[i3]).longValue();
                iM4047 = C2100.m4047(i5);
                iM4048 = C2100.m4048(jLongValue);
            }
            i2 = iM4048 + iM4047 + i2;
        }
        this.f18796 = i2;
        return i2;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m9526(int i) {
        int[] iArr = this.f18794;
        if (i > iArr.length) {
            int i2 = this.f18795;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f18794 = Arrays.copyOf(iArr, i);
            this.f18792 = Arrays.copyOf(this.f18792, i);
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m9527(C5086 c5086) {
        if (this.f18795 == 0) {
            return;
        }
        c5086.getClass();
        C2100 c2100 = (C2100) c5086.f16877;
        for (int i = 0; i < this.f18795; i++) {
            int i2 = this.f18794[i];
            Object obj = this.f18792[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c2100.m4059(((Long) obj).longValue(), i3);
            } else if (i4 == 1) {
                c2100.m4060(((Long) obj).longValue(), i3);
            } else if (i4 == 2) {
                c2100.m4076(i3, (C0533) obj);
            } else if (i4 == 3) {
                c2100.m4066(i3, 3);
                ((C5708) obj).m9527(c5086);
                c2100.m4066(i3, 4);
            } else {
                if (i4 != 5) {
                    C5028.m8450(C3406.m6170());
                    return;
                }
                c2100.m4058(i3, ((Integer) obj).intValue());
            }
        }
    }
}
