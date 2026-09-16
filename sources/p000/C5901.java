package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: ۦُۨؗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5901 implements InterfaceC4953, Set, InterfaceC3984 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final C1165 f19454;

    /* JADX INFO: renamed from: ۦۨ */
    public final C1165 f19455;

    public C5901(C1165 c1165) {
        this.f19455 = c1165;
        this.f19454 = c1165;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f19454.m2480(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        C1165 c1165 = this.f19454;
        int i = c1165.f4047;
        for (Object obj : collection) {
            int iM2481 = c1165.m2481(obj);
            c1165.f4043[iM2481] = obj;
            long[] jArr = c1165.f4040;
            int i2 = c1165.f4046;
            jArr[iM2481] = (((long) i2) & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((((long) iM2481) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            c1165.f4046 = iM2481;
            if (c1165.f4041 == Integer.MAX_VALUE) {
                c1165.f4041 = iM2481;
            }
        }
        return i != c1165.f4047;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f19454.m2478();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f19455.m2475(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f19455.m2475(it.next())) {
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
        if (obj == null || C5901.class != obj.getClass()) {
            return false;
        }
        return this.f19455.equals(((C5901) obj).f19455);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f19455.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f19455.f4047 == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0754(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f19454.m2483(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int iNumberOfTrailingZeros;
        C1165 c1165 = this.f19454;
        int i = c1165.f4047;
        Iterator it = collection.iterator();
        while (true) {
            int i2 = 1;
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i4 = iHashCode ^ (iHashCode << 16);
            int i5 = i4 & 127;
            int i6 = c1165.f4042;
            int i7 = (i4 >>> 7) & i6;
            while (true) {
                long[] jArr = c1165.f4045;
                int i8 = i7 >> 3;
                int i9 = (i7 & 7) << 3;
                long j = ((jArr[i8 + i2] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
                long j2 = (((long) i5) * 72340172838076673L) ^ j;
                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (j3 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i6;
                    int i10 = i2;
                    if (AbstractC3831.m6874(c1165.f4043[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j3 &= j3 - 1;
                    i2 = i10;
                }
                int i11 = i2;
                if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i3 += 8;
                i7 = (i7 + i3) & i6;
                i2 = i11;
            }
            if (iNumberOfTrailingZeros >= 0) {
                c1165.m2479(iNumberOfTrailingZeros);
            }
        }
        return i != c1165.f4047;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f19454.m2482(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f19455.f4047;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC3925.m7047(this);
    }

    public final String toString() {
        return this.f19455.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC3925.m7045(this, objArr);
    }
}
