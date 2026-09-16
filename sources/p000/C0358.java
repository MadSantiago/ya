package p000;

import java.util.ListIterator;

/* JADX INFO: renamed from: ۥٟؓۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0358 implements ListIterator {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C1198 f1297;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ ListIterator f1298;

    /* JADX INFO: renamed from: ۦۨ */
    public boolean f1299;

    public C0358(C1198 c1198, ListIterator listIterator) {
        this.f1297 = c1198;
        this.f1298 = listIterator;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.f1298;
        listIterator.add(obj);
        listIterator.previous();
        this.f1299 = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f1298.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1298.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.f1298;
        if (listIterator.hasPrevious()) {
            this.f1299 = true;
            return listIterator.previous();
        }
        C0178.m381();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1297.m2526(this.f1298.nextIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.f1298;
        if (listIterator.hasNext()) {
            this.f1299 = true;
            return listIterator.next();
        }
        C0178.m381();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        AbstractC0949.m1966("no calls to next() since the last call to remove()", this.f1299);
        this.f1298.remove();
        this.f1299 = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        if (!this.f1299) {
            throw new IllegalStateException();
        }
        this.f1298.set(obj);
    }
}
