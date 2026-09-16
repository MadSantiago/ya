package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: ۦؙؔ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3251 extends AbstractC0014 implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: ۥٓ */
    public static final C3251 f10917;

    /* JADX INFO: renamed from: ۥْ */
    public boolean f10918;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f10919;

    /* JADX INFO: renamed from: ۦۨ */
    public Object[] f10920;

    static {
        C3251 c3251 = new C3251(0);
        c3251.f10918 = true;
        f10917 = c3251;
    }

    public C3251(int i) {
        if (i >= 0) {
            this.f10920 = new Object[i];
        } else {
            C1078.m2272("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m5973();
        int i2 = this.f10919;
        if (i < 0 || i > i2) {
            C1078.m2279(AbstractC5078.m8679("index: ", i, i2, ", size: "));
            return;
        }
        ((AbstractList) this).modCount++;
        m5975(i, 1);
        this.f10920[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m5973();
        int i2 = this.f10919;
        if (i < 0 || i > i2) {
            C1078.m2279(AbstractC5078.m8679("index: ", i, i2, ", size: "));
            return false;
        }
        int size = collection.size();
        m5972(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m5973();
        m5976(0, this.f10919);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f10920;
            int i = this.f10919;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (AbstractC3831.m6874(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f10919;
        if (i >= 0 && i < i2) {
            return this.f10920[i];
        }
        C1078.m2279(AbstractC5078.m8679("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f10920;
        int i = this.f10919;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f10919; i++) {
            if (AbstractC3831.m6874(this.f10920[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f10919 == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f10919 - 1; i >= 0; i--) {
            if (AbstractC3831.m6874(this.f10920[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.f10919;
        if (i >= 0 && i <= i2) {
            return new C3740(this, i);
        }
        C1078.m2279(AbstractC5078.m8679("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m5973();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo1860(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        m5973();
        return m5978(0, this.f10919, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        m5973();
        return m5978(0, this.f10919, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m5973();
        int i2 = this.f10919;
        if (i < 0 || i >= i2) {
            C1078.m2279(AbstractC5078.m8679("index: ", i, i2, ", size: "));
            return null;
        }
        Object[] objArr = this.f10920;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        AbstractC3933.m7102(i, i2, this.f10919);
        return new C5223(this.f10920, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f10919;
        Object[] objArr2 = this.f10920;
        if (length < i) {
            return Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
        }
        AbstractC0246.m510(0, 0, i, objArr2, objArr);
        int i2 = this.f10919;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC1631.m3406(this.f10920, 0, this.f10919, this);
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m5972(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        m5975(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f10920[i + i3] = it.next();
        }
    }

    @Override // p000.AbstractC0014
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo1859() {
        return this.f10919;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m5973() {
        if (this.f10918) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // p000.AbstractC0014
    /* JADX INFO: renamed from: ۦؑ */
    public final Object mo1860(int i) {
        m5973();
        int i2 = this.f10919;
        if (i >= 0 && i < i2) {
            return m5974(i);
        }
        C1078.m2279(AbstractC5078.m8679("index: ", i, i2, ", size: "));
        return null;
    }

    /* JADX INFO: renamed from: ۦِ */
    public final Object m5974(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f10920;
        Object obj = objArr[i];
        AbstractC0246.m510(i, i + 1, this.f10919, objArr, objArr);
        Object[] objArr2 = this.f10920;
        int i2 = this.f10919;
        objArr2[i2 - 1] = null;
        this.f10919 = i2 - 1;
        return obj;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m5975(int i, int i2) {
        int i3 = this.f10919 + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArrCopyOf = this.f10920;
        if (i3 > objArrCopyOf.length) {
            int length = objArrCopyOf.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            this.f10920 = objArrCopyOf;
        }
        AbstractC0246.m510(i + i2, i, this.f10919, objArrCopyOf, objArrCopyOf);
        this.f10919 += i2;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m5976(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f10920;
        AbstractC0246.m510(i, i + i2, this.f10919, objArr, objArr);
        Object[] objArr2 = this.f10920;
        int i3 = this.f10919;
        AbstractC1631.m3403(objArr2, i3 - i2, i3);
        this.f10919 -= i2;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m5977(int i, Object obj) {
        ((AbstractList) this).modCount++;
        m5975(i, 1);
        this.f10920[i] = obj;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final int m5978(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.f10920;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.f10920;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        AbstractC0246.m510(i + i4, i2 + i, this.f10919, objArr, objArr);
        Object[] objArr3 = this.f10920;
        int i7 = this.f10919;
        AbstractC1631.m3403(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f10919 -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return AbstractC0246.m514(this.f10920, 0, this.f10919);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m5973();
        int size = collection.size();
        m5972(this.f10919, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m5973();
        int i = this.f10919;
        ((AbstractList) this).modCount++;
        m5975(i, 1);
        this.f10920[i] = obj;
        return true;
    }
}
