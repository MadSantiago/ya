package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: ۦ٘ؒۖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4416 extends AbstractC1864 implements RandomAccess, InterfaceC1269, InterfaceC3215 {

    /* JADX INFO: renamed from: ۥَ */
    public static final C4416 f14557;

    /* JADX INFO: renamed from: ۥٓ */
    public static final long[] f14558;

    /* JADX INFO: renamed from: ۥْ */
    public int f14559;

    /* JADX INFO: renamed from: ۦ۟ */
    public long[] f14560;

    static {
        long[] jArr = new long[0];
        f14558 = jArr;
        f14557 = new C4416(jArr, 0, false);
    }

    public C4416(long[] jArr, int i, boolean z) {
        super(z);
        this.f14560 = jArr;
        this.f14559 = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m3714();
        if (i < 0 || i > (i2 = this.f14559)) {
            C1078.m2279(C0958.m1990(this.f14559, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        long[] jArr = this.f14560;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f14560, 0, jArr2, 0, i);
            System.arraycopy(this.f14560, i, jArr2, i3, this.f14559 - i);
            this.f14560 = jArr2;
        }
        this.f14560[i] = jLongValue;
        this.f14559++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC1864, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m3714();
        collection.getClass();
        if (!(collection instanceof C4416)) {
            return super.addAll(collection);
        }
        C4416 c4416 = (C4416) collection;
        int i = c4416.f14559;
        if (i == 0) {
            return false;
        }
        int i2 = this.f14559;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArrCopyOf = this.f14560;
        if (i3 > jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
            this.f14560 = jArrCopyOf;
        }
        System.arraycopy(c4416.f14560, 0, jArrCopyOf, this.f14559, c4416.f14559);
        this.f14559 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.AbstractC1864, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4416)) {
            return super.equals(obj);
        }
        C4416 c4416 = (C4416) obj;
        if (this.f14559 == c4416.f14559) {
            long[] jArr = c4416.f14560;
            for (int i = 0; i < this.f14559; i++) {
                if (this.f14560[i] == jArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m7716(i);
        return Long.valueOf(this.f14560[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f14559; i2++) {
            long j = this.f14560[i2];
            byte[] bArr = AbstractC1963.f6474;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f14559;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f14560[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC1864, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m3714();
        m7716(i);
        long[] jArr = this.f14560;
        long j = jArr[i];
        int i2 = this.f14559;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f14559--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m3714();
        if (i2 < i) {
            C1078.m2279("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.f14560;
        System.arraycopy(jArr, i2, jArr, i, this.f14559 - i2);
        this.f14559 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m3714();
        m7716(i);
        long[] jArr = this.f14560;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14559;
    }

    @Override // p000.InterfaceC5083
    /* JADX INFO: renamed from: ۥُ, reason: merged with bridge method [inline-methods] */
    public final C4416 mo4971(int i) {
        if (i >= this.f14559) {
            return new C4416(i == 0 ? f14558 : Arrays.copyOf(this.f14560, i), this.f14559, true);
        }
        C0178.m393();
        return null;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m7714(long j) {
        m3714();
        int i = this.f14559;
        long[] jArr = this.f14560;
        int length = jArr.length;
        if (i == length) {
            jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f14560, 0, jArr, 0, this.f14559);
            this.f14560 = jArr;
        }
        int i2 = this.f14559;
        this.f14559 = i2 + 1;
        jArr[i2] = j;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final long m7715(int i) {
        m7716(i);
        return this.f14560[i];
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m7716(int i) {
        if (i < 0 || i >= this.f14559) {
            C1078.m2279(C0958.m1990(this.f14559, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m7714(((Long) obj).longValue());
        return true;
    }
}
