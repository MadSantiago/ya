package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: ۥؘٜؓ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1821 implements Collection, Set, InterfaceC3984, InterfaceC4953 {

    /* JADX INFO: renamed from: ۥْ */
    public int f6049;

    /* JADX INFO: renamed from: ۦ۟ */
    public Object[] f6050;

    /* JADX INFO: renamed from: ۦۨ */
    public int[] f6051;

    public C1821(int i) {
        this.f6051 = AbstractC2164.f7136;
        this.f6050 = AbstractC2164.f7137;
        if (i > 0) {
            this.f6051 = new int[i];
            this.f6050 = new Object[i];
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iM6789;
        int i2 = this.f6049;
        if (obj == null) {
            iM6789 = AbstractC3801.m6789(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM6789 = AbstractC3801.m6789(this, obj, iHashCode);
        }
        if (iM6789 >= 0) {
            return false;
        }
        int i3 = ~iM6789;
        int[] iArr = this.f6051;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f6050;
            int[] iArr2 = new int[i4];
            this.f6051 = iArr2;
            this.f6050 = new Object[i4];
            if (i2 != this.f6049) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                AbstractC0246.m516(0, iArr.length, 6, iArr, iArr2);
                AbstractC0246.m519(0, objArr.length, 6, objArr, this.f6050);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f6051;
            int i5 = i3 + 1;
            AbstractC0246.m523(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.f6050;
            AbstractC0246.m510(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.f6049;
        if (i2 == i6) {
            int[] iArr4 = this.f6051;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f6050[i3] = obj;
                this.f6049 = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f6049;
        int i = this.f6049;
        int[] iArr = this.f6051;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f6050;
            int[] iArr2 = new int[size];
            this.f6051 = iArr2;
            this.f6050 = new Object[size];
            if (i > 0) {
                AbstractC0246.m516(0, i, 6, iArr, iArr2);
                AbstractC0246.m519(0, this.f6049, 6, objArr, this.f6050);
            }
        }
        if (this.f6049 != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f6049;
        if (i != 0) {
            this.f6051 = AbstractC2164.f7136;
            this.f6050 = AbstractC2164.f7137;
            i = 0;
            this.f6049 = 0;
        }
        if (i != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC3801.m6789(this, null, 0) : AbstractC3801.m6789(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f6049 != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f6049;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.f6050[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f6051;
        int i = this.f6049;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f6049 <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1102(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM6789 = obj == null ? AbstractC3801.m6789(this, null, 0) : AbstractC3801.m6789(this, obj, obj.hashCode());
        if (iM6789 < 0) {
            return false;
        }
        m3594(iM6789);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.f6049 - 1; -1 < i; i--) {
            if (!AbstractC0973.m2044(collection, this.f6050[i])) {
                m3594(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f6049;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        int i = this.f6049;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        AbstractC0246.m510(0, 0, this.f6049, this.f6050, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6049 * 14);
        sb.append('{');
        int i = this.f6049;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f6050[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final Object m3594(int i) {
        int i2 = this.f6049;
        Object[] objArr = this.f6050;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f6051;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                AbstractC0246.m523(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.f6050;
                AbstractC0246.m510(i, i4, i2, objArr2, objArr2);
            }
            this.f6050[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.f6051 = iArr2;
            this.f6050 = new Object[i5];
            if (i > 0) {
                AbstractC0246.m516(0, i, 6, iArr, iArr2);
                AbstractC0246.m519(0, i, 6, objArr, this.f6050);
            }
            if (i < i3) {
                int i6 = i + 1;
                AbstractC0246.m523(i, i6, i2, iArr, this.f6051);
                AbstractC0246.m510(i, i6, i2, objArr, this.f6050);
            }
        }
        if (i2 != this.f6049) {
            throw new ConcurrentModificationException();
        }
        this.f6049 = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC0246.m514(this.f6050, 0, this.f6049);
    }
}
