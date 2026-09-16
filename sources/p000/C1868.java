package p000;

import java.util.ListIterator;

/* JADX INFO: renamed from: ۥّٝؓؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1868 extends AbstractC0219 implements ListIterator {

    /* JADX INFO: renamed from: ۥْ */
    public int f6211;

    /* JADX INFO: renamed from: ۥٓ */
    public final AbstractC4822 f6212;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f6213;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1868(AbstractC4822 abstractC4822, int i) {
        super(0);
        int size = abstractC4822.size();
        AbstractC0949.m1963(i, size);
        this.f6213 = size;
        this.f6211 = i;
        this.f6212 = abstractC4822;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f6211 < this.f6213;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f6211 > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            C0178.m381();
            return null;
        }
        int i = this.f6211;
        this.f6211 = i + 1;
        return m3721(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6211;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C0178.m381();
            return null;
        }
        int i = this.f6211 - 1;
        this.f6211 = i;
        return m3721(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6211 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final Object m3721(int i) {
        return this.f6212.get(i);
    }
}
