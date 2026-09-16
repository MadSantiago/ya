package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: ۥۢٔٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2645 extends AbstractList implements RandomAccess, InterfaceC4997 {

    /* JADX INFO: renamed from: ۥٓ */
    public static final C2645 f8788 = new C2645(new Object[0], 0, false);

    /* JADX INFO: renamed from: ۥْ */
    public int f8789;

    /* JADX INFO: renamed from: ۦ۟ */
    public Object[] f8790;

    /* JADX INFO: renamed from: ۦۨ */
    public boolean f8791;

    public C2645(Object[] objArr, int i, boolean z) {
        this.f8791 = z;
        this.f8790 = objArr;
        this.f8789 = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m4960();
        if (i < 0 || i > (i2 = this.f8789)) {
            C5028.m8444(this.f8789, AbstractC5078.m8680(i, "Index:", ", Size:"));
            return;
        }
        Object[] objArr = this.f8790;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f8790, i, objArr2, i + 1, this.f8789 - i);
            this.f8790 = objArr2;
        }
        this.f8790[i] = obj;
        this.f8789++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m4960();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m4960();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m4959(i);
        return this.f8790[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m4960();
        m4959(i);
        Object[] objArr = this.f8790;
        Object obj = objArr[i];
        int i2 = this.f8789;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f8789--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        m4960();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        m4960();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m4960();
        m4959(i);
        Object[] objArr = this.f8790;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8789;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final C2645 m4958(int i) {
        if (i >= this.f8789) {
            return new C2645(Arrays.copyOf(this.f8790, i), this.f8789, true);
        }
        C0178.m393();
        return null;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m4959(int i) {
        if (i < 0 || i >= this.f8789) {
            C5028.m8444(this.f8789, AbstractC5078.m8680(i, "Index:", ", Size:"));
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m4960() {
        if (!this.f8791) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m4960();
        return super.addAll(i, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m4960();
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m4960();
        int i = this.f8789;
        Object[] objArrCopyOf = this.f8790;
        if (i == objArrCopyOf.length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, ((i * 3) / 2) + 1);
            this.f8790 = objArrCopyOf;
        }
        int i2 = this.f8789;
        this.f8789 = i2 + 1;
        objArrCopyOf[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
