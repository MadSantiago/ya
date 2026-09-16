package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: ۥٌؘؕۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0679 implements List, InterfaceC3984 {

    /* JADX INFO: renamed from: ۦۨ */
    public final C2730 f2484 = new C2730(16);

    /* JADX INFO: renamed from: ۦ۟ */
    public final C2741 f2483 = new C2741(16);

    /* JADX INFO: renamed from: ۥْ */
    public int f2482 = -1;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f2482 = -1;
        this.f2484.m5080();
        this.f2483.f9072 = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof AbstractC5381) && indexOf((AbstractC5381) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((AbstractC5381) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return (AbstractC5381) this.f2484.m5076(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC5381)) {
            return -1;
        }
        AbstractC5381 abstractC5381 = (AbstractC5381) obj;
        int iM4181 = AbstractC2164.m4181(this);
        if (iM4181 < 0) {
            return -1;
        }
        int i = 0;
        while (!AbstractC3831.m6874(this.f2484.m5076(i), abstractC5381)) {
            if (i == iM4181) {
                return -1;
            }
            i++;
        }
        return i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f2484.m5078();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C3740(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof AbstractC5381) {
            AbstractC5381 abstractC5381 = (AbstractC5381) obj;
            for (int iM4181 = AbstractC2164.m4181(this); -1 < iM4181; iM4181--) {
                if (AbstractC3831.m6874(this.f2484.m5076(iM4181), abstractC5381)) {
                    return iM4181;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C3740(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f2484.f9040;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new C2037(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC3925.m7047(this);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final long m1510() {
        long jM7976 = AbstractC4593.m7976(Float.POSITIVE_INFINITY, false, false);
        int i = this.f2482 + 1;
        int iM4181 = AbstractC2164.m4181(this);
        if (i > iM4181) {
            return jM7976;
        }
        while (i >= 0) {
            C2741 c2741 = this.f2483;
            if (i >= c2741.f9072) {
                break;
            }
            long j = c2741.f9073[i];
            if (AbstractC4225.m7478(j, jM7976) < 0) {
                jM7976 = j;
            }
            if ((AbstractC4225.m7471(jM7976) < 0.0f && AbstractC4225.m7491(jM7976)) || i == iM4181) {
                return jM7976;
            }
            i++;
        }
        AbstractC2552.m4812("Index must be between 0 and size");
        throw null;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m1511(int i, int i2) {
        C2741 c2741;
        int i3;
        if (i >= i2) {
            return;
        }
        this.f2484.m5081(i, i2);
        if (i < 0 || i > (i3 = (c2741 = this.f2483).f9072) || i2 < 0 || i2 > i3) {
            AbstractC2552.m4812("Index must be between 0 and size");
            throw null;
        }
        if (i2 < i) {
            AbstractC2552.m4814("The end index must be < start index");
            throw null;
        }
        if (i2 != i) {
            if (i2 < i3) {
                long[] jArr = c2741.f9073;
                AbstractC0246.m511(jArr, jArr, i, i2, i3);
            }
            c2741.f9072 -= i2 - i;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC3925.m7045(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new C3740(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
