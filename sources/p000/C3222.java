package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۦٍؙؔؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3222 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f10821;

    /* JADX INFO: renamed from: ۥُ */
    public final int f10822;

    /* JADX INFO: renamed from: ۥّ */
    public boolean f10823;

    /* JADX INFO: renamed from: ۥۗ */
    public final int[] f10824;

    /* JADX INFO: renamed from: ۥۜ */
    public int f10825;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2575 f10826;

    /* JADX INFO: renamed from: ۦؑ */
    public Object[] f10827;

    /* JADX INFO: renamed from: ۦؚ */
    public int f10828;

    /* JADX INFO: renamed from: ۦٌ */
    public int f10829;

    /* JADX INFO: renamed from: ۦِ */
    public final C1624 f10830;

    /* JADX INFO: renamed from: ۦٛ */
    public int f10831;

    /* JADX INFO: renamed from: ۦۗ */
    public int f10832;

    /* JADX INFO: renamed from: ۦۙ */
    public int f10833;

    /* JADX INFO: renamed from: ۦۚ */
    public boolean f10834;

    public C3222(C2575 c2575) {
        this.f10826 = c2575;
        this.f10824 = c2575.f8603;
        int i = c2575.f8602;
        this.f10821 = i;
        this.f10827 = c2575.f8594;
        this.f10822 = c2575.f8595;
        this.f10825 = i;
        this.f10831 = -1;
        this.f10830 = new C1624();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f10833);
        sb.append(", key=");
        sb.append(m5929());
        sb.append(", parent=");
        sb.append(this.f10831);
        sb.append(", end=");
        return AbstractC3761.m6638(sb, this.f10825, ')');
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m5912() {
        this.f10823 = true;
        C2575 c2575 = this.f10826;
        if (c2575.f8593 <= 0) {
            AbstractC5508.m9201("Unexpected reader close()");
        }
        c2575.f8593--;
        this.f10827 = new Object[0];
    }

    /* JADX INFO: renamed from: ۥَ */
    public final int m5913() {
        if (this.f10832 != 0) {
            AbstractC5508.m9201("Cannot skip while in an empty region");
        }
        int i = this.f10833;
        int i2 = i * 5;
        int[] iArr = this.f10824;
        int i3 = iArr[i2 + 1];
        int i4 = (1073741824 & i3) != 0 ? 1 : i3 & 67108863;
        this.f10833 = iArr[i2 + 3] + i;
        return i4;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m5914() {
        if (this.f10832 == 0) {
            if (this.f10833 != this.f10825) {
                AbstractC5508.m9201("endGroup() not called at the end of a group");
            }
            int i = (this.f10831 * 5) + 2;
            int[] iArr = this.f10824;
            int i2 = iArr[i];
            this.f10831 = i2;
            int i3 = this.f10821;
            this.f10825 = i2 < 0 ? i3 : iArr[(i2 * 5) + 3] + i2;
            int iM3398 = this.f10830.m3398();
            if (iM3398 < 0) {
                this.f10828 = 0;
                this.f10829 = 0;
            } else {
                this.f10828 = iM3398;
                this.f10829 = i2 >= i3 + (-1) ? this.f10822 : iArr[((i2 + 1) * 5) + 4];
            }
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public final Object m5915() {
        int i = this.f10833;
        if (i < this.f10825) {
            return m5919(this.f10824, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥْ */
    public final int m5916(int i) {
        return this.f10824[(i * 5) + 2];
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final void m5917(int i) {
        if (this.f10832 != 0) {
            AbstractC5508.m9201("Cannot reposition while in an empty region");
        }
        this.f10833 = i;
        int[] iArr = this.f10824;
        int i2 = this.f10821;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        if (i3 != this.f10831) {
            this.f10831 = i3;
            if (i3 < 0) {
                this.f10825 = i2;
            } else {
                this.f10825 = iArr[(i3 * 5) + 3] + i3;
            }
            this.f10828 = 0;
            this.f10829 = 0;
        }
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final void m5918() {
        if (!(this.f10832 == 0)) {
            AbstractC5508.m9201("Cannot skip the enclosing group while in an empty region");
        }
        this.f10833 = this.f10825;
        this.f10828 = 0;
        this.f10829 = 0;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final Object m5919(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            return this.f10827[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(i3 >> 29)];
        }
        return C2850.f9517;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final Object m5920(int i, int i2) {
        int[] iArr = this.f10824;
        int iM6813 = AbstractC3809.m6813(iArr, i);
        int i3 = i + 1;
        int i4 = iM6813 + i2;
        return i4 < (i3 < this.f10821 ? iArr[(i3 * 5) + 4] : this.f10822) ? this.f10827[i4] : C2850.f9517;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C4356 m5921(int i) {
        ArrayList arrayList = this.f10826.f8598;
        int iM6808 = AbstractC3809.m6808(arrayList, i, this.f10821);
        if (iM6808 >= 0) {
            return (C4356) arrayList.get(iM6808);
        }
        C4356 c4356 = new C4356(i);
        arrayList.add(-(iM6808 + 1), c4356);
        return c4356;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean m5922(int i) {
        return (this.f10824[(i * 5) + 1] & 67108864) != 0;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final boolean m5923(int i) {
        return (this.f10824[(i * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final Object m5924() {
        int i;
        if (this.f10832 > 0 || (i = this.f10828) >= this.f10829) {
            this.f10834 = false;
            return C2850.f9517;
        }
        this.f10834 = true;
        Object[] objArr = this.f10827;
        this.f10828 = i + 1;
        return objArr[i];
    }

    /* JADX INFO: renamed from: ۦِ */
    public final boolean m5925(int i) {
        return (this.f10824[(i * 5) + 1] & 134217728) != 0;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final void m5926() {
        if (this.f10832 <= 0) {
            int i = this.f10831;
            int i2 = this.f10833;
            int i3 = i2 * 5;
            int[] iArr = this.f10824;
            if (iArr[i3 + 2] != i) {
                AbstractC0371.m795("Invalid slot table detected");
            }
            int i4 = this.f10828;
            int i5 = this.f10829;
            C1624 c1624 = this.f10830;
            if (i4 == 0 && i5 == 0) {
                c1624.m3395(-1);
            } else {
                c1624.m3395(i4);
            }
            this.f10831 = i2;
            this.f10825 = iArr[i3 + 3] + i2;
            int i6 = i2 + 1;
            this.f10833 = i6;
            this.f10828 = AbstractC3809.m6813(iArr, i2);
            this.f10829 = i2 >= this.f10821 + (-1) ? this.f10822 : iArr[(i6 * 5) + 4];
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final int m5927(int i) {
        return this.f10824[i * 5];
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final boolean m5928(int i) {
        return (this.f10824[(i * 5) + 1] & 536870912) != 0;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final int m5929() {
        int i = this.f10833;
        if (i >= this.f10825) {
            return 0;
        }
        return this.f10824[i * 5];
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final Object m5930(int i) {
        int i2 = i * 5;
        int[] iArr = this.f10824;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 != 0) {
            return i3 != 0 ? this.f10827[iArr[i2 + 4]] : C2850.f9517;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object m5931(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.f10827[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final int m5932(int i) {
        return this.f10824[(i * 5) + 1] & 67108863;
    }
}
