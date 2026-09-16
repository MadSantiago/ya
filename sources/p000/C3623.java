package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: ۦؚّؗٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3623 extends AbstractC1864 implements RandomAccess {

    /* JADX INFO: renamed from: ۥَ */
    public static final C3623 f12075;

    /* JADX INFO: renamed from: ۥٓ */
    public static final Object[] f12076;

    /* JADX INFO: renamed from: ۥْ */
    public int f12077;

    /* JADX INFO: renamed from: ۦ۟ */
    public Object[] f12078;

    static {
        Object[] objArr = new Object[0];
        f12076 = objArr;
        f12075 = new C3623(objArr, 0, false);
    }

    public C3623(Object[] objArr, int i, boolean z) {
        super(z);
        this.f12078 = objArr;
        this.f12077 = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m3714();
        if (i < 0 || i > (i2 = this.f12077)) {
            C1078.m2279(C0958.m1990(this.f12077, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.f12078;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f12078, 0, objArr2, 0, i);
            System.arraycopy(this.f12078, i, objArr2, i3, this.f12077 - i);
            this.f12078 = objArr2;
        }
        this.f12078[i] = obj;
        this.f12077++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC1864, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (!(obj instanceof RandomAccess)) {
                return super.equals(obj);
            }
            List list = (List) obj;
            int i = this.f12077;
            if (i == list.size()) {
                if (!(obj instanceof C3623)) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (this.f12078[i2].equals(list.get(i2))) {
                        }
                    }
                    return true;
                }
                C3623 c3623 = (C3623) obj;
                for (int i3 = 0; i3 < i; i3++) {
                    if (this.f12078[i3].equals(c3623.f12078[i3])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m6451(i);
        return this.f12078[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.f12077;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + this.f12078[i2].hashCode();
        }
        return iHashCode;
    }

    @Override // p000.AbstractC1864, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m3714();
        m6451(i);
        Object[] objArr = this.f12078;
        Object obj = objArr[i];
        int i2 = this.f12077;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f12077--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m3714();
        m6451(i);
        Object[] objArr = this.f12078;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12077;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m6451(int i) {
        if (i < 0 || i >= this.f12077) {
            C1078.m2279(C0958.m1990(this.f12077, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // p000.InterfaceC5083
    /* JADX INFO: renamed from: ۦؚ */
    public final /* bridge */ /* synthetic */ InterfaceC5083 mo4971(int i) {
        if (i >= this.f12077) {
            return new C3623(i == 0 ? f12076 : Arrays.copyOf(this.f12078, i), this.f12077, true);
        }
        C0178.m393();
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3714();
        int i = this.f12077;
        Object[] objArrCopyOf = this.f12078;
        int length = objArrCopyOf.length;
        if (i == length) {
            objArrCopyOf = Arrays.copyOf(this.f12078, Math.max(((length * 3) / 2) + 1, 10));
            this.f12078 = objArrCopyOf;
        }
        int i2 = this.f12077;
        this.f12077 = i2 + 1;
        objArrCopyOf[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
