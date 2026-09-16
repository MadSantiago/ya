package p000;

import java.util.ListIterator;

/* JADX INFO: renamed from: ۥؕ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0007 extends C0084 implements ListIterator {

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ AbstractC0015 f1549;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0007(AbstractC0015 abstractC0015, int i) {
        super(0, abstractC0015);
        this.f1549 = abstractC0015;
        int iMo624 = abstractC0015.mo624();
        if (i < 0 || i > iMo624) {
            C1078.m2279(AbstractC5078.m8679("index: ", i, iMo624, ", size: "));
            throw null;
        }
        this.f15891 = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f15891 > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15891;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C0178.m381();
            return null;
        }
        int i = this.f15891 - 1;
        this.f15891 = i;
        return this.f1549.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15891 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
