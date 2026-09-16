package p000;

import java.util.ListIterator;

/* JADX INFO: renamed from: ۥٖٝؖؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1903 extends AbstractC0219 implements ListIterator {

    /* JADX INFO: renamed from: ۥْ */
    public int f6284;

    /* JADX INFO: renamed from: ۥٓ */
    public final AbstractC1958 f6285;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f6286;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1903(AbstractC1958 abstractC1958, int i) {
        super(1);
        int size = abstractC1958.size();
        if (i < 0 || i > size) {
            C1078.m2279(AbstractC0487.m1037(i, size, "index"));
            throw null;
        }
        this.f6286 = size;
        this.f6284 = i;
        this.f6285 = abstractC1958;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f6284 < this.f6286;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f6284 > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            C0178.m381();
            return null;
        }
        int i = this.f6284;
        this.f6284 = i + 1;
        return m3747(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6284;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C0178.m381();
            return null;
        }
        int i = this.f6284 - 1;
        this.f6284 = i;
        return m3747(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6284 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final Object m3747(int i) {
        return this.f6285.get(i);
    }
}
