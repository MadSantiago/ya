package p000;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: ۥًؗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0863 implements RandomAccess {

    /* JADX INFO: renamed from: ۥْ */
    public int f3180 = 0;

    /* JADX INFO: renamed from: ۦ۟ */
    public C3482 f3181;

    /* JADX INFO: renamed from: ۦۨ */
    public Object[] f3182;

    public C0863(Object[] objArr) {
        this.f3182 = objArr;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m1840(int i, C0863 c0863) {
        int i2 = c0863.f3180;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f3180 + i2;
        if (this.f3182.length < i3) {
            m1852(i3);
        }
        Object[] objArr = this.f3182;
        int i4 = this.f3180;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(c0863.f3182, 0, objArr, i, i2);
        this.f3180 += i2;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final boolean m1841(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.f3180 + size;
        if (this.f3182.length < i3) {
            m1852(i3);
        }
        Object[] objArr = this.f3182;
        int i4 = this.f3180;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                AbstractC2164.m4180();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.f3180 += size;
        return true;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final List m1842() {
        C3482 c3482 = this.f3181;
        if (c3482 != null) {
            return c3482;
        }
        C3482 c3483 = new C3482(1, this);
        this.f3181 = c3483;
        return c3483;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m1843(Object obj) {
        int i = this.f3180 + 1;
        if (this.f3182.length < i) {
            m1852(i);
        }
        Object[] objArr = this.f3182;
        int i2 = this.f3180;
        objArr[i2] = obj;
        this.f3180 = i2 + 1;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final boolean m1844(Object obj) {
        int i = this.f3180 - 1;
        if (i >= 0) {
            for (int i2 = 0; !AbstractC3831.m6874(this.f3182[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m1845(int i, Object obj) {
        int i2 = this.f3180 + 1;
        if (this.f3182.length < i2) {
            m1852(i2);
        }
        Object[] objArr = this.f3182;
        int i3 = this.f3180;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.f3180++;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m1846(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.f3180 + size;
        if (this.f3182.length < i2) {
            m1852(i2);
        }
        Object[] objArr = this.f3182;
        int i3 = this.f3180;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.f3180 += size;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final void m1847(int i, int i2) {
        if (i2 > i) {
            int i3 = this.f3180;
            if (i2 < i3) {
                Object[] objArr = this.f3182;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.f3180;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.f3182[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.f3180 = i5;
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public final boolean m1848(Object obj) {
        int iM1849 = m1849(obj);
        if (iM1849 < 0) {
            return false;
        }
        m1850(iM1849);
        return true;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final int m1849(Object obj) {
        Object[] objArr = this.f3182;
        int i = this.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            if (AbstractC3831.m6874(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final Object m1850(int i) {
        Object[] objArr = this.f3182;
        Object obj = objArr[i];
        int i2 = this.f3180;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.f3180 - 1;
        this.f3180 = i4;
        objArr[i4] = null;
        return obj;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m1851() {
        Object[] objArr = this.f3182;
        int i = this.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f3180 = 0;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final void m1852(int i) {
        Object[] objArr = this.f3182;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f3182 = objArr2;
    }
}
