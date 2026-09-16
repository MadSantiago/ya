package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: ۦٛۙٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4657 implements InterfaceC4953, Set, InterfaceC3984 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final C3639 f15353;

    /* JADX INFO: renamed from: ۦۨ */
    public final C3639 f15354;

    public C4657(C3639 c3639) {
        this.f15354 = c3639;
        this.f15353 = c3639;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f15353.m6495(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        C3639 c3639 = this.f15353;
        int i = c3639.f12176;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c3639.m6501(it.next());
        }
        return i != c3639.f12176;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f15353.m6493();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f15354.m6490(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f15354.m6490(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4657.class != obj.getClass()) {
            return false;
        }
        return this.f15354.equals(((C4657) obj).f15354);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f15354.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f15354.m6502();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0754(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f15353.m6497(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        C3639 c3639 = this.f15353;
        int i = c3639.f12176;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c3639.m6500(it.next());
        }
        return i != c3639.f12176;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0050 A[LOOP:0: B:5:0x0011->B:17:0x0050, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0053 A[EDGE_INSN: B:24:0x0053->B:18:0x0053 BREAK  A[LOOP:0: B:5:0x0011->B:17:0x0050], SYNTHETIC] */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C3639 c3639 = this.f15353;
        Object[] objArr = c3639.f12174;
        int i = c3639.f12176;
        long[] jArr = c3639.f12175;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!AbstractC0973.m2044(collection, objArr[i5])) {
                                c3639.m6498(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != c3639.f12176;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f15354.f12176;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC3925.m7047(this);
    }

    public final String toString() {
        return this.f15354.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC3925.m7045(this, objArr);
    }
}
