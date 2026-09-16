package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: ۥٜۡؔٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2560 implements Collection, InterfaceC3984 {

    /* JADX INFO: renamed from: ۦۨ */
    public final short[] f8537;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x001d A[RETURN] */
    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C2866)) {
            return false;
        }
        short s = ((C2866) obj).f9577;
        short[] sArr = this.f8537;
        int length = sArr.length;
        int i = 0;
        while (i < length) {
            if (s == sArr[i]) {
                if (i >= 0) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (obj instanceof C2866) {
                short s = ((C2866) obj).f9577;
                short[] sArr = this.f8537;
                int length = sArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    }
                    if (s == sArr[i]) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof C2560) {
            return this.f8537.equals(((C2560) obj).f8537);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f8537);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f8537.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0084(7, this.f8537);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f8537.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC3925.m7047(this);
    }

    public final String toString() {
        return "UShortArray(storage=" + Arrays.toString(this.f8537) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC3925.m7045(this, objArr);
    }
}
