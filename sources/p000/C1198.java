package p000;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: ۥْٜؒؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C1198 extends AbstractList {

    /* JADX INFO: renamed from: ۦۨ */
    public final List f4127;

    public C1198(List list) {
        list.getClass();
        this.f4127 = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f4127.add(m2526(i), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f4127.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.f4127;
        int size = list.size();
        AbstractC0949.m1955(i, size);
        return list.get((size - 1) - i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C0358(this, this.f4127.listIterator(m2526(i)));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        List list = this.f4127;
        int size = list.size();
        AbstractC0949.m1955(i, size);
        return list.remove((size - 1) - i);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        List list = this.f4127;
        int size = list.size();
        AbstractC0949.m1955(i, size);
        return list.set((size - 1) - i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4127.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        List list = this.f4127;
        AbstractC0949.m1968(i, i2, list.size());
        return C4773.m8143(list.subList(m2526(i2), m2526(i)));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final int m2526(int i) {
        int size = this.f4127.size();
        AbstractC0949.m1963(i, size);
        return size - i;
    }
}
