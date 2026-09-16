package p000;

import java.util.ListIterator;

/* JADX INFO: renamed from: ۥٚ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0028 implements ListIterator, InterfaceC3984 {

    /* JADX INFO: renamed from: ۦ۟ */
    public int f5660;

    /* JADX INFO: renamed from: ۦۨ */
    public int f5661;

    public AbstractC0028(int i, int i2) {
        this.f5661 = i;
        this.f5660 = i2;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f5661 < this.f5660;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5661 > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5661;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5661 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
