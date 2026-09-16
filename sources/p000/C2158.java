package p000;

import java.util.ListIterator;

/* JADX INFO: renamed from: ۥؘۘؔۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2158 implements ListIterator, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f7120;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f7121;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f7122 = 2;

    public C2158(C5076 c5076, int i) {
        this.f7120 = c5076;
        this.f7121 = c5076.f16833.listIterator(AbstractC0973.m2054(i, c5076));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f7122) {
            case 0:
                ListIterator listIterator = (ListIterator) this.f7121;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f7122;
        Object obj = this.f7121;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasPrevious();
            case 1:
                return ((ListIterator) obj).hasPrevious();
            default:
                return ((C4763) obj).f15714 < ((C4097) this.f7120).f13665 - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.f7122;
        Object obj = this.f7121;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasNext();
            case 1:
                return ((ListIterator) obj).hasNext();
            default:
                return ((C4763) obj).f15714 >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f7122;
        Object obj = this.f7121;
        switch (i) {
            case 0:
                return ((ListIterator) obj).previous();
            case 1:
                return ((ListIterator) obj).previous();
            default:
                C4763 c4763 = (C4763) obj;
                int i2 = c4763.f15714 + 1;
                C4097 c4097 = (C4097) this.f7120;
                AbstractC3801.m6778(i2, c4097.f13665);
                c4763.f15714 = i2;
                return c4097.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int iPreviousIndex;
        int iM4181;
        int i = this.f7122;
        Object obj = this.f7120;
        Object obj2 = this.f7121;
        switch (i) {
            case 0:
                iPreviousIndex = ((ListIterator) obj2).previousIndex();
                iM4181 = AbstractC2164.m4181((C5736) obj);
                break;
            case 1:
                iPreviousIndex = ((ListIterator) obj2).previousIndex();
                iM4181 = AbstractC2164.m4181((C5076) obj);
                break;
            default:
                return ((C4763) obj2).f15714 + 1;
        }
        return iM4181 - iPreviousIndex;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f7122;
        Object obj = this.f7121;
        switch (i) {
            case 0:
                return ((ListIterator) obj).next();
            case 1:
                return ((ListIterator) obj).next();
            default:
                C4763 c4763 = (C4763) obj;
                int i2 = c4763.f15714;
                C4097 c4097 = (C4097) this.f7120;
                AbstractC3801.m6778(i2, c4097.f13665);
                c4763.f15714 = i2 - 1;
                return c4097.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int iNextIndex;
        int iM4181;
        int i = this.f7122;
        Object obj = this.f7120;
        Object obj2 = this.f7121;
        switch (i) {
            case 0:
                iNextIndex = ((ListIterator) obj2).nextIndex();
                iM4181 = AbstractC2164.m4181((C5736) obj);
                break;
            case 1:
                iNextIndex = ((ListIterator) obj2).nextIndex();
                iM4181 = AbstractC2164.m4181((C5076) obj);
                break;
            default:
                return ((C4763) obj2).f15714;
        }
        return iM4181 - iNextIndex;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f7122) {
            case 0:
                ((ListIterator) this.f7121).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f7122) {
            case 0:
                ((ListIterator) this.f7121).set(obj);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public C2158(C5736 c5736, int i) {
        this.f7120 = c5736;
        this.f7121 = c5736.f18916.listIterator(AbstractC0973.m2054(i, c5736));
    }

    public C2158(C4763 c4763, C4097 c4097) {
        this.f7121 = c4763;
        this.f7120 = c4097;
    }
}
