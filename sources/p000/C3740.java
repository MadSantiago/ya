package p000;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: renamed from: ۦٌؗٔ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3740 implements ListIterator, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥَ */
    public final Object f12458;

    /* JADX INFO: renamed from: ۥْ */
    public int f12459;

    /* JADX INFO: renamed from: ۥٓ */
    public int f12460;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f12461;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f12462;

    public C3740(C1347 c1347, int i) {
        this.f12462 = 3;
        this.f12458 = c1347;
        this.f12461 = i - 1;
        this.f12459 = -1;
        this.f12460 = ((C5594) AbstractC1538.m3272(c1347.f4636)).f18436;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f12462;
        Object obj2 = this.f12458;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                m6579();
                C5223 c5223 = (C5223) obj2;
                int i2 = this.f12461;
                this.f12461 = i2 + 1;
                c5223.add(i2, obj);
                this.f12459 = -1;
                this.f12460 = ((AbstractList) c5223).modCount;
                return;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                m6578();
                C3251 c3251 = (C3251) obj2;
                int i3 = this.f12461;
                this.f12461 = i3 + 1;
                c3251.add(i3, obj);
                this.f12459 = -1;
                this.f12460 = ((AbstractList) c3251).modCount;
                return;
            default:
                m6577();
                C1347 c1347 = (C1347) obj2;
                c1347.add(this.f12461 + 1, obj);
                this.f12459 = -1;
                this.f12461++;
                this.f12460 = ((C5594) AbstractC1538.m3272(c1347.f4636)).f18436;
                return;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f12462;
        Object obj = this.f12458;
        switch (i) {
            case 0:
                return this.f12461 < this.f12460;
            case 1:
                return this.f12461 < ((C5223) obj).f17245;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return this.f12461 < ((C3251) obj).f10919;
            default:
                return this.f12461 < ((C1347) obj).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f12462) {
            case 0:
                return this.f12461 > this.f12459;
            case 1:
                return this.f12461 > 0;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return this.f12461 > 0;
            default:
                return this.f12461 >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f12462;
        Object obj = this.f12458;
        switch (i) {
            case 0:
                C2730 c2730 = ((C0679) obj).f2484;
                int i2 = this.f12461;
                this.f12461 = i2 + 1;
                return (AbstractC5381) c2730.m5076(i2);
            case 1:
                m6579();
                int i3 = this.f12461;
                C5223 c5223 = (C5223) obj;
                if (i3 >= c5223.f17245) {
                    C0178.m381();
                    return null;
                }
                this.f12461 = i3 + 1;
                this.f12459 = i3;
                return c5223.f17248[c5223.f17247 + i3];
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                m6578();
                int i4 = this.f12461;
                C3251 c3251 = (C3251) obj;
                if (i4 >= c3251.f10919) {
                    C0178.m381();
                    return null;
                }
                this.f12461 = i4 + 1;
                this.f12459 = i4;
                return c3251.f10920[i4];
            default:
                m6577();
                int i5 = this.f12461 + 1;
                this.f12459 = i5;
                C1347 c1347 = (C1347) obj;
                AbstractC3801.m6778(i5, c1347.size());
                Object obj2 = c1347.get(i5);
                this.f12461 = i5;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f12462) {
            case 0:
                return this.f12461 - this.f12459;
            case 1:
                return this.f12461;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return this.f12461;
            default:
                return this.f12461 + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f12462;
        Object obj = this.f12458;
        switch (i) {
            case 0:
                C2730 c2730 = ((C0679) obj).f2484;
                int i2 = this.f12461 - 1;
                this.f12461 = i2;
                return (AbstractC5381) c2730.m5076(i2);
            case 1:
                m6579();
                int i3 = this.f12461;
                if (i3 <= 0) {
                    C0178.m381();
                    return null;
                }
                int i4 = i3 - 1;
                this.f12461 = i4;
                this.f12459 = i4;
                C5223 c5223 = (C5223) obj;
                return c5223.f17248[c5223.f17247 + i4];
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                m6578();
                int i5 = this.f12461;
                if (i5 <= 0) {
                    C0178.m381();
                    return null;
                }
                int i6 = i5 - 1;
                this.f12461 = i6;
                this.f12459 = i6;
                return ((C3251) obj).f10920[i6];
            default:
                m6577();
                C1347 c1347 = (C1347) obj;
                AbstractC3801.m6778(this.f12461, c1347.size());
                int i7 = this.f12461;
                this.f12459 = i7;
                Object obj2 = c1347.get(i7);
                this.f12461--;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f12462) {
            case 0:
                return (this.f12461 - this.f12459) - 1;
            case 1:
                i = this.f12461;
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                i = this.f12461;
                break;
            default:
                return this.f12461;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f12462;
        Object obj = this.f12458;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                C5223 c5223 = (C5223) obj;
                m6579();
                int i2 = this.f12459;
                if (i2 == -1) {
                    C1078.m2276("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                c5223.mo1860(i2);
                this.f12461 = this.f12459;
                this.f12459 = -1;
                this.f12460 = ((AbstractList) c5223).modCount;
                return;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C3251 c3251 = (C3251) obj;
                m6578();
                int i3 = this.f12459;
                if (i3 == -1) {
                    C1078.m2276("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                c3251.mo1860(i3);
                this.f12461 = this.f12459;
                this.f12459 = -1;
                this.f12460 = ((AbstractList) c3251).modCount;
                return;
            default:
                m6577();
                C1347 c1347 = (C1347) obj;
                c1347.remove(this.f12459);
                this.f12461--;
                this.f12459 = -1;
                this.f12460 = ((C5594) AbstractC1538.m3272(c1347.f4636)).f18436;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f12462;
        Object obj2 = this.f12458;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                m6579();
                int i2 = this.f12459;
                if (i2 != -1) {
                    ((C5223) obj2).set(i2, obj);
                    return;
                } else {
                    C1078.m2276("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                m6578();
                int i3 = this.f12459;
                if (i3 != -1) {
                    ((C3251) obj2).set(i3, obj);
                    return;
                } else {
                    C1078.m2276("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                C1347 c1347 = (C1347) obj2;
                m6577();
                int i4 = this.f12459;
                if (i4 < 0) {
                    C1078.m2276("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    c1347.set(i4, obj);
                    this.f12460 = ((C5594) AbstractC1538.m3272(c1347.f4636)).f18436;
                    return;
                }
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public void m6577() {
        if (((C5594) AbstractC1538.m3272(((C1347) this.f12458).f4636)).f18436 != this.f12460) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public void m6578() {
        if (((AbstractList) ((C3251) this.f12458)).modCount != this.f12460) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m6579() {
        if (((AbstractList) ((C5223) this.f12458).f17244).modCount != this.f12460) {
            throw new ConcurrentModificationException();
        }
    }

    public C3740(C3251 c3251, int i) {
        this.f12462 = 2;
        this.f12458 = c3251;
        this.f12461 = i;
        this.f12459 = -1;
        this.f12460 = ((AbstractList) c3251).modCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3740(C0679 c0679, int i, int i2) {
        this(c0679, (i2 & 1) != 0 ? 0 : i, 0, c0679.f2484.f9040);
        this.f12462 = 0;
    }

    public C3740(C0679 c0679, int i, int i2, int i3) {
        this.f12462 = 0;
        this.f12458 = c0679;
        this.f12461 = i;
        this.f12459 = i2;
        this.f12460 = i3;
    }

    public C3740(C5223 c5223, int i) {
        this.f12462 = 1;
        this.f12458 = c5223;
        this.f12461 = i;
        this.f12459 = -1;
        this.f12460 = ((AbstractList) c5223).modCount;
    }
}
