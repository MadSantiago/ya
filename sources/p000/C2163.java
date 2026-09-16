package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: ۥۘؔۥ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2163 implements Set {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ C4461 f7135;

    public C2163(C4461 c4461) {
        this.f7135 = c4461;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f7135.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7135.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f7135.m7743(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C4461 c4461 = this.f7135;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return c4461.f2862 == set.size() && c4461.m7743(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C4461 c4461 = this.f7135;
        int iHashCode = 0;
        for (int i = c4461.f2862 - 1; i >= 0; i--) {
            Object objM1694 = c4461.m1694(i);
            iHashCode += objM1694 == null ? 0 : objM1694.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f7135.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1102(this.f7135, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C4461 c4461 = this.f7135;
        int iM1693 = c4461.m1693(obj);
        if (iM1693 < 0) {
            return false;
        }
        c4461.m1695(iM1693);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f7135.m7742(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C4461 c4461 = this.f7135;
        int i = c4461.f2862;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(c4461.m1694(i2))) {
                c4461.m1695(i2);
            }
        }
        return i != c4461.f2862;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f7135.f2862;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C4461 c4461 = this.f7135;
        int i = c4461.f2862;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c4461.m1694(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C4461 c4461 = this.f7135;
        int i = c4461.f2862;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c4461.m1694(i2);
        }
        return objArr;
    }
}
