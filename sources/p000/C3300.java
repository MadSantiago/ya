package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦؕؗۤؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3300 implements Collection {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ C4461 f11043;

    public C3300(C4461 c4461) {
        this.f11043 = c4461;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f11043.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f11043.m1698(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f11043.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1102(this.f11043, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C4461 c4461 = this.f11043;
        int iM1698 = c4461.m1698(obj);
        if (iM1698 < 0) {
            return false;
        }
        c4461.m1695(iM1698);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C4461 c4461 = this.f11043;
        int i = c4461.f2862;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(c4461.m1697(i2))) {
                c4461.m1695(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C4461 c4461 = this.f11043;
        int i = c4461.f2862;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(c4461.m1697(i2))) {
                c4461.m1695(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f11043.f2862;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C4461 c4461 = this.f11043;
        int i = c4461.f2862;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c4461.m1697(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C4461 c4461 = this.f11043;
        int i = c4461.f2862;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c4461.m1697(i2);
        }
        return objArr;
    }
}
