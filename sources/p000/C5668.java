package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: ۦٜۤؖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5668 implements Collection, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥْ */
    public static final C5668 f18644 = new C5668(C2340.f7777);

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f18645;

    /* JADX INFO: renamed from: ۦۨ */
    public final List f18646;

    public C5668(List list) {
        this.f18646 = list;
        this.f18645 = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C0620)) {
            return false;
        }
        return this.f18646.contains((C0620) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f18646.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5668) {
            return this.f18646.equals(((C5668) obj).f18646);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f18646.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f18646.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f18646.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f18645;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC3925.m7047(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.f18646 + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC3925.m7045(this, objArr);
    }
}
