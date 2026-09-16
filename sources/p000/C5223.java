package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: ۦۛؒۨٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5223 extends AbstractC0014 implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: ۥَ */
    public final C3251 f17244;

    /* JADX INFO: renamed from: ۥْ */
    public int f17245;

    /* JADX INFO: renamed from: ۥٓ */
    public final C5223 f17246;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f17247;

    /* JADX INFO: renamed from: ۦۨ */
    public Object[] f17248;

    public C5223(Object[] objArr, int i, int i2, C5223 c5223, C3251 c3251) {
        this.f17248 = objArr;
        this.f17247 = i;
        this.f17245 = i2;
        this.f17246 = c5223;
        this.f17244 = c3251;
        ((AbstractList) this).modCount = ((AbstractList) c3251).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m8853();
        m8851();
        int i2 = this.f17245;
        if (i < 0 || i > i2) {
            C1078.m2279(AbstractC5078.m8679("index: ", i, i2, ", size: "));
        } else {
            m8855(this.f17247 + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m8853();
        m8851();
        int i2 = this.f17245;
        if (i < 0 || i > i2) {
            C1078.m2279(AbstractC5078.m8679("index: ", i, i2, ", size: "));
            return false;
        }
        int size = collection.size();
        m8850(this.f17247 + i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m8853();
        m8851();
        m8854(this.f17247, this.f17245);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m8851();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f17248;
            int i = this.f17245;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (AbstractC3831.m6874(objArr[this.f17247 + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m8851();
        int i2 = this.f17245;
        if (i >= 0 && i < i2) {
            return this.f17248[this.f17247 + i];
        }
        C1078.m2279(AbstractC5078.m8679("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m8851();
        Object[] objArr = this.f17248;
        int i = this.f17245;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.f17247 + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m8851();
        for (int i = 0; i < this.f17245; i++) {
            if (AbstractC3831.m6874(this.f17248[this.f17247 + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m8851();
        return this.f17245 == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m8851();
        for (int i = this.f17245 - 1; i >= 0; i--) {
            if (AbstractC3831.m6874(this.f17248[this.f17247 + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        m8851();
        int i2 = this.f17245;
        if (i >= 0 && i <= i2) {
            return new C3740(this, i);
        }
        C1078.m2279(AbstractC5078.m8679("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m8853();
        m8851();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo1860(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        m8853();
        m8851();
        return m8856(this.f17247, this.f17245, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        m8853();
        m8851();
        return m8856(this.f17247, this.f17245, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m8853();
        m8851();
        int i2 = this.f17245;
        if (i < 0 || i >= i2) {
            C1078.m2279(AbstractC5078.m8679("index: ", i, i2, ", size: "));
            return null;
        }
        Object[] objArr = this.f17248;
        int i3 = this.f17247;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        AbstractC3933.m7102(i, i2, this.f17245);
        return new C5223(this.f17248, this.f17247 + i, i2 - i, this, this.f17244);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        m8851();
        int length = objArr.length;
        int i = this.f17245;
        Object[] objArr2 = this.f17248;
        int i2 = this.f17247;
        if (length < i) {
            return Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
        }
        AbstractC0246.m510(0, i2, i + i2, objArr2, objArr);
        int i3 = this.f17245;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m8851();
        return AbstractC1631.m3406(this.f17248, this.f17247, this.f17245, this);
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m8850(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        C3251 c3251 = this.f17244;
        C5223 c5223 = this.f17246;
        if (c5223 != null) {
            c5223.m8850(i, collection, i2);
        } else {
            C3251 c3252 = C3251.f10917;
            c3251.m5972(i, collection, i2);
        }
        this.f17248 = c3251.f10920;
        this.f17245 += i2;
    }

    @Override // p000.AbstractC0014
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo1859() {
        m8851();
        return this.f17245;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m8851() {
        if (((AbstractList) this.f17244).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // p000.AbstractC0014
    /* JADX INFO: renamed from: ۦؑ */
    public final Object mo1860(int i) {
        m8853();
        m8851();
        int i2 = this.f17245;
        if (i >= 0 && i < i2) {
            return m8852(this.f17247 + i);
        }
        C1078.m2279(AbstractC5078.m8679("index: ", i, i2, ", size: "));
        return null;
    }

    /* JADX INFO: renamed from: ۦِ */
    public final Object m8852(int i) {
        Object objM5974;
        ((AbstractList) this).modCount++;
        C5223 c5223 = this.f17246;
        if (c5223 != null) {
            objM5974 = c5223.m8852(i);
        } else {
            C3251 c3251 = C3251.f10917;
            objM5974 = this.f17244.m5974(i);
        }
        this.f17245--;
        return objM5974;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m8853() {
        if (this.f17244.f10918) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m8854(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        C5223 c5223 = this.f17246;
        if (c5223 != null) {
            c5223.m8854(i, i2);
        } else {
            C3251 c3251 = C3251.f10917;
            this.f17244.m5976(i, i2);
        }
        this.f17245 -= i2;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m8855(int i, Object obj) {
        ((AbstractList) this).modCount++;
        C3251 c3251 = this.f17244;
        C5223 c5223 = this.f17246;
        if (c5223 != null) {
            c5223.m8855(i, obj);
        } else {
            C3251 c3252 = C3251.f10917;
            c3251.m5977(i, obj);
        }
        this.f17248 = c3251.f10920;
        this.f17245++;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final int m8856(int i, int i2, Collection collection, boolean z) {
        int iM5978;
        C5223 c5223 = this.f17246;
        if (c5223 != null) {
            iM5978 = c5223.m8856(i, i2, collection, z);
        } else {
            C3251 c3251 = C3251.f10917;
            iM5978 = this.f17244.m5978(i, i2, collection, z);
        }
        if (iM5978 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f17245 -= iM5978;
        return iM5978;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m8853();
        m8851();
        m8855(this.f17247 + this.f17245, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m8851();
        Object[] objArr = this.f17248;
        int i = this.f17245;
        int i2 = this.f17247;
        return AbstractC0246.m514(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m8853();
        m8851();
        int size = collection.size();
        m8850(this.f17247 + this.f17245, collection, size);
        return size > 0;
    }
}
