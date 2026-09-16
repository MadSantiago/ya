package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: ۦۦٟؒؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5736 extends AbstractC0014 {

    /* JADX INFO: renamed from: ۦۨ */
    public final ArrayList f18916;

    public C5736(ArrayList arrayList) {
        this.f18916 = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f18916.add(AbstractC0973.m2054(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f18916.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f18916.get(AbstractC0973.m2053(i, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C2158(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new C2158(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.f18916.set(AbstractC0973.m2053(i, this), obj);
    }

    @Override // p000.AbstractC0014
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo1859() {
        return this.f18916.size();
    }

    @Override // p000.AbstractC0014
    /* JADX INFO: renamed from: ۦؑ */
    public final Object mo1860(int i) {
        return this.f18916.remove(AbstractC0973.m2053(i, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C2158(this, i);
    }
}
