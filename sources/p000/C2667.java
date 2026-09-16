package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: ۥًۤؓؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2667 extends AbstractC1864 implements RandomAccess, InterfaceC3627, InterfaceC3215 {

    /* JADX INFO: renamed from: ۥَ */
    public static final C2667 f8831;

    /* JADX INFO: renamed from: ۥٓ */
    public static final int[] f8832;

    /* JADX INFO: renamed from: ۥْ */
    public int f8833;

    /* JADX INFO: renamed from: ۦ۟ */
    public int[] f8834;

    static {
        int[] iArr = new int[0];
        f8832 = iArr;
        f8831 = new C2667(iArr, 0, false);
    }

    public C2667(int[] iArr, int i, boolean z) {
        super(z);
        this.f8834 = iArr;
        this.f8833 = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m3714();
        if (i < 0 || i > (i2 = this.f8833)) {
            C1078.m2279(C0958.m1990(this.f8833, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        int[] iArr = this.f8834;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f8834, 0, iArr2, 0, i);
            System.arraycopy(this.f8834, i, iArr2, i3, this.f8833 - i);
            this.f8834 = iArr2;
        }
        this.f8834[i] = iIntValue;
        this.f8833++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC1864, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m3714();
        collection.getClass();
        if (!(collection instanceof C2667)) {
            return super.addAll(collection);
        }
        C2667 c2667 = (C2667) collection;
        int i = c2667.f8833;
        if (i == 0) {
            return false;
        }
        int i2 = this.f8833;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArrCopyOf = this.f8834;
        if (i3 > iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i3);
            this.f8834 = iArrCopyOf;
        }
        System.arraycopy(c2667.f8834, 0, iArrCopyOf, this.f8833, c2667.f8833);
        this.f8833 = i3;
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
        if (!(obj instanceof C2667)) {
            return super.equals(obj);
        }
        C2667 c2667 = (C2667) obj;
        if (this.f8833 == c2667.f8833) {
            int[] iArr = c2667.f8834;
            for (int i = 0; i < this.f8833; i++) {
                if (this.f8834[i] == iArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m4972(i);
        return Integer.valueOf(this.f8834[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f8833; i2++) {
            i = (i * 31) + this.f8834[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f8833;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f8834[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC1864, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m3714();
        m4972(i);
        int[] iArr = this.f8834;
        int i2 = iArr[i];
        int i3 = this.f8833;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f8833--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m3714();
        if (i2 < i) {
            C1078.m2279("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.f8834;
        System.arraycopy(iArr, i2, iArr, i, this.f8833 - i2);
        this.f8833 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m3714();
        m4972(i);
        int[] iArr = this.f8834;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8833;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final int m4968(int i) {
        m4972(i);
        return this.f8834[i];
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m4969(int i) {
        m3714();
        int i2 = this.f8833;
        int[] iArr = this.f8834;
        int length = iArr.length;
        if (i2 == length) {
            iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f8834, 0, iArr, 0, this.f8833);
            this.f8834 = iArr;
        }
        int i3 = this.f8833;
        this.f8833 = i3 + 1;
        iArr[i3] = i;
    }

    @Override // p000.InterfaceC5083
    /* JADX INFO: renamed from: ۦؑ, reason: merged with bridge method [inline-methods] */
    public final C2667 mo4971(int i) {
        if (i >= this.f8833) {
            return new C2667(i == 0 ? f8832 : Arrays.copyOf(this.f8834, i), this.f8833, true);
        }
        C0178.m393();
        return null;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m4972(int i) {
        if (i < 0 || i >= this.f8833) {
            C1078.m2279(C0958.m1990(this.f8833, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m4969(((Integer) obj).intValue());
        return true;
    }
}
