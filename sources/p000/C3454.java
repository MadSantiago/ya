package p000;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: renamed from: ۦًَؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3454 extends AbstractC0073 {

    /* JADX INFO: renamed from: ۥْ */
    public final int f11465;

    /* JADX INFO: renamed from: ۥٓ */
    public final int f11466;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object[] f11467;

    /* JADX INFO: renamed from: ۦۨ */
    public final Object[] f11468;

    public C3454(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.f11468 = objArr;
        this.f11467 = objArr2;
        this.f11465 = i;
        this.f11466 = i2;
        if (!(mo624() > 32)) {
            AbstractC0371.m795("Trie-based persistent vector should have at least 33 elements, got " + mo624());
        }
        int length = objArr2.length;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static Object[] m6230(Object[] objArr, int i, int i2, Object obj) {
        int iM5139 = AbstractC2765.m5139(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iM5139] = obj;
            return objArrCopyOf;
        }
        objArrCopyOf[iM5139] = m6230((Object[]) objArrCopyOf[iM5139], i - 5, i2, obj);
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static Object[] m6231(Object[] objArr, int i, int i2, Object obj, C0334 c0334) {
        int iM5139 = AbstractC2765.m5139(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iM5139 == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            AbstractC0246.m510(iM5139 + 1, iM5139, 31, objArr, objArrCopyOf);
            c0334.f1250 = objArr[31];
            objArrCopyOf[iM5139] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        objArrCopyOf2[iM5139] = m6231((Object[]) objArr[iM5139], i3, i2, obj, c0334);
        while (true) {
            iM5139++;
            if (iM5139 >= 32 || objArrCopyOf2[iM5139] == null) {
                break;
            }
            objArrCopyOf2[iM5139] = m6231((Object[]) objArr[iM5139], i3, 0, c0334.f1250, c0334);
        }
        return objArrCopyOf2;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static Object[] m6232(Object[] objArr, int i, int i2, C0334 c0334) {
        Object[] objArrM6232;
        int iM5139 = AbstractC2765.m5139(i2, i);
        if (i == 5) {
            c0334.f1250 = objArr[iM5139];
            objArrM6232 = null;
        } else {
            objArrM6232 = m6232((Object[]) objArr[iM5139], i - 5, i2, c0334);
        }
        if (objArrM6232 == null && iM5139 == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iM5139] = objArrM6232;
        return objArrCopyOf;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        AbstractC0487.m1076(i, mo624());
        if (m6236() <= i) {
            objArr = this.f11467;
        } else {
            Object[] objArr2 = this.f11468;
            for (int i2 = this.f11466; i2 > 0; i2 -= 5) {
                objArr2 = objArr2[AbstractC2765.m5139(i, i2)];
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // p000.AbstractC0015, java.util.List
    public final ListIterator listIterator(int i) {
        AbstractC0487.m1043(i, this.f11465);
        return new C1691(i, this.f11465, (this.f11466 / 5) + 1, this.f11468, this.f11467);
    }

    /* JADX INFO: renamed from: ۥَ */
    public final AbstractC0073 m6233(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.f11465 - i;
        if (i4 != 1) {
            Object[] objArr2 = this.f11467;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                AbstractC0246.m510(i3, i3 + 1, i4, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i5] = null;
            return new C3454(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new C0295(objArr);
        }
        C0334 c0334 = new C0334(null);
        Object[] objArrM6232 = m6232(objArr, i2, i - 1, c0334);
        Object[] objArr3 = (Object[]) c0334.f1250;
        return objArrM6232[1] == null ? new C3454((Object[]) objArrM6232[0], objArr3, i, i2 - 5) : new C3454(objArrM6232, objArr3, i, i2);
    }

    @Override // p000.AbstractC0073
    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC0073 mo622(Object obj) {
        int iM6236 = m6236();
        int i = this.f11465;
        int i2 = i - iM6236;
        Object[] objArr = this.f11468;
        Object[] objArr2 = this.f11467;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = obj;
            return new C3454(objArr, objArrCopyOf, i + 1, this.f11466);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return m6238(objArr, objArr2, objArr3);
    }

    /* JADX INFO: renamed from: ۥْ */
    public final Object[] m6234(int i, Object[] objArr, Object[] objArr2) {
        int iM5139 = AbstractC2765.m5139(mo624() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iM5139] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iM5139] = m6234(i - 5, (Object[]) objArrCopyOf[iM5139], objArr2);
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final Object[] m6235(Object[] objArr, int i, int i2, C0334 c0334) {
        int iM5139 = AbstractC2765.m5139(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iM5139 == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            AbstractC0246.m510(iM5139, iM5139 + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = c0334.f1250;
            c0334.f1250 = objArr[iM5139];
            return objArrCopyOf;
        }
        int iM51310 = objArr[31] == null ? AbstractC2765.m5139(m6236() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iM5139 + 1;
        if (i4 <= iM51310) {
            while (true) {
                objArrCopyOf2[iM51310] = m6235((Object[]) objArrCopyOf2[iM51310], i3, 0, c0334);
                if (iM51310 == i4) {
                    break;
                }
                iM51310--;
            }
        }
        objArrCopyOf2[iM5139] = m6235((Object[]) objArrCopyOf2[iM5139], i3, i2, c0334);
        return objArrCopyOf2;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final int m6236() {
        return (this.f11465 - 1) & (-32);
    }

    @Override // p000.AbstractC0096
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo624() {
        return this.f11465;
    }

    @Override // p000.AbstractC0073
    /* JADX INFO: renamed from: ۥۜ */
    public final AbstractC0073 mo625(C0025 c0025) {
        C4250 c4250 = new C4250(this, this.f11468, this.f11467, this.f11466);
        c4250.m7523(c0025);
        return c4250.m7514();
    }

    @Override // p000.AbstractC0073
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC0073 mo626(int i, Object obj) {
        int i2 = this.f11465;
        AbstractC0487.m1043(i, i2);
        if (i == i2) {
            return mo622(obj);
        }
        int iM6236 = m6236();
        Object[] objArr = this.f11468;
        if (i >= iM6236) {
            return m6237(i - iM6236, obj, objArr);
        }
        C0334 c0334 = new C0334(null);
        return m6237(0, c0334.f1250, m6231(objArr, this.f11466, i, obj, c0334));
    }

    @Override // p000.AbstractC0073
    /* JADX INFO: renamed from: ۦِ */
    public final AbstractC0073 mo627(int i, Object obj) {
        int i2 = this.f11465;
        AbstractC0487.m1076(i, i2);
        int iM6236 = m6236();
        Object[] objArr = this.f11468;
        Object[] objArr2 = this.f11467;
        int i3 = this.f11466;
        if (iM6236 > i) {
            return new C3454(m6230(objArr, i3, i, obj), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new C3454(objArr, objArrCopyOf, i2, i3);
    }

    @Override // p000.AbstractC0073
    /* JADX INFO: renamed from: ۦٛ */
    public final AbstractC0073 mo628(int i) {
        AbstractC0487.m1076(i, mo624());
        int iM6236 = m6236();
        int i2 = this.f11466;
        Object[] objArr = this.f11468;
        return i >= iM6236 ? m6233(objArr, iM6236, i2, i - iM6236) : m6233(m6235(objArr, i2, i, new C0334(this.f11467[0])), iM6236, i2, 0);
    }

    @Override // p000.AbstractC0073
    /* JADX INFO: renamed from: ۦۙ */
    public final C4250 mo629() {
        return new C4250(this, this.f11468, this.f11467, this.f11466);
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final C3454 m6237(int i, Object obj, Object[] objArr) {
        int iM6236 = m6236();
        int i2 = this.f11465;
        int i3 = i2 - iM6236;
        Object[] objArr2 = this.f11467;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            AbstractC0246.m510(i + 1, i, i3, objArr2, objArrCopyOf);
            objArrCopyOf[i] = obj;
            return new C3454(objArr, objArrCopyOf, i2 + 1, this.f11466);
        }
        Object obj2 = objArr2[31];
        AbstractC0246.m510(i + 1, i, i3 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return m6238(objArr, objArrCopyOf, objArr3);
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final C3454 m6238(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f11465;
        int i2 = i >> 5;
        int i3 = this.f11466;
        if (i2 <= (1 << i3)) {
            return new C3454(m6234(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new C3454(m6234(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }
}
