package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: ۦۧؖٔٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1172(with = C3252.class)
public final class C5832 extends AbstractC0695 implements List<AbstractC0695>, InterfaceC3984 {
    public static final C4175 Companion = new C4175();

    /* JADX INFO: renamed from: ۦۨ */
    public final List f19213;

    public C5832(List list) {
        this.f19213 = list;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, AbstractC0695 abstractC0695) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends AbstractC0695> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof AbstractC0695)) {
            return false;
        }
        return this.f19213.contains((AbstractC0695) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f19213.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return AbstractC3831.m6874(this.f19213, obj);
    }

    @Override // java.util.List
    public final AbstractC0695 get(int i) {
        return (AbstractC0695) this.f19213.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f19213.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC0695)) {
            return -1;
        }
        return this.f19213.indexOf((AbstractC0695) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f19213.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f19213.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC0695)) {
            return -1;
        }
        return this.f19213.lastIndexOf((AbstractC0695) obj);
    }

    @Override // java.util.List
    public final ListIterator<AbstractC0695> listIterator() {
        return this.f19213.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC0695 remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<AbstractC0695> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC0695 set(int i, AbstractC0695 abstractC0695) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f19213.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super AbstractC0695> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<AbstractC0695> subList(int i, int i2) {
        return this.f19213.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC3925.m7047(this);
    }

    public final String toString() {
        return AbstractC0973.m2056(this.f19213, ",", "[", "]", null, 56);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC3925.m7045(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator<AbstractC0695> listIterator(int i) {
        return this.f19213.listIterator(i);
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
}
