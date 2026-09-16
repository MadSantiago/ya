package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: ۥٌۖؑؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2037 implements List, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C0679 f6716;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f6717;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f6718;

    public C2037(C0679 c0679, int i, int i2) {
        this.f6716 = c0679;
        this.f6718 = i;
        this.f6717 = i2;
    }

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
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
        return (AbstractC5381) this.f6716.f2484.m5076(i + this.f6718);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC5381)) {
            return -1;
        }
        AbstractC5381 abstractC5381 = (AbstractC5381) obj;
        int i = this.f6718;
        int i2 = this.f6717;
        if (i > i2) {
            return -1;
        }
        int i3 = i;
        while (!AbstractC3831.m6874(this.f6716.f2484.m5076(i3), abstractC5381)) {
            if (i3 == i2) {
                return -1;
            }
            i3++;
        }
        return i3 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f6718;
        return new C3740(this.f6716, i, i, this.f6717);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC5381)) {
            return -1;
        }
        AbstractC5381 abstractC5381 = (AbstractC5381) obj;
        int i = this.f6717;
        int i2 = this.f6718;
        if (i2 > i) {
            return -1;
        }
        while (!AbstractC3831.m6874(this.f6716.f2484.m5076(i), abstractC5381)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.f6718;
        int i3 = this.f6717;
        return new C3740(this.f6716, i + i2, i2, i3);
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
        return this.f6717 - this.f6718;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        int i3 = this.f6718;
        return new C2037(this.f6716, i + i3, i3 + i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC3925.m7047(this);
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

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i = this.f6718;
        return new C3740(this.f6716, i, i, this.f6717);
    }
}
