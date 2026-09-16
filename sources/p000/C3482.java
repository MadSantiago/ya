package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: ۦؘؓۡۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3482 implements List, InterfaceC3984 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f11560;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f11561;

    public /* synthetic */ C3482(int i, Object obj) {
        this.f11561 = i;
        this.f11560 = obj;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.f11561;
        Object obj2 = this.f11560;
        switch (i3) {
            case 0:
                C2730 c2730 = (C2730) obj2;
                if (i < 0 || i > (i2 = c2730.f9040)) {
                    StringBuilder sbM8680 = AbstractC5078.m8680(i, "Index ", " must be in 0..");
                    sbM8680.append(c2730.f9040);
                    AbstractC2552.m4812(sbM8680.toString());
                    throw null;
                }
                int i4 = i2 + 1;
                Object[] objArr = c2730.f9041;
                if (objArr.length < i4) {
                    c2730.m5082(i4, objArr);
                }
                Object[] objArr2 = c2730.f9041;
                int i5 = c2730.f9040;
                if (i != i5) {
                    AbstractC0246.m510(i + 1, i, i5, objArr2, objArr2);
                }
                objArr2[i] = obj;
                c2730.f9040++;
                return;
            default:
                ((C0863) obj2).m1845(i, obj);
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.f11561;
        Object obj = this.f11560;
        switch (i2) {
            case 0:
                C2730 c2730 = (C2730) obj;
                if (i < 0 || i > c2730.f9040) {
                    StringBuilder sbM8680 = AbstractC5078.m8680(i, "Index ", " must be in 0..");
                    sbM8680.append(c2730.f9040);
                    AbstractC2552.m4812(sbM8680.toString());
                    throw null;
                }
                int i3 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + c2730.f9040;
                Object[] objArr = c2730.f9041;
                if (objArr.length < size) {
                    c2730.m5082(size, objArr);
                }
                Object[] objArr2 = c2730.f9041;
                if (i != c2730.f9040) {
                    AbstractC0246.m510(collection.size() + i, i, c2730.f9040, objArr2, objArr2);
                }
                for (Object obj2 : collection) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        AbstractC2164.m4180();
                        throw null;
                    }
                    objArr2[i3 + i] = obj2;
                    i3 = i4;
                }
                c2730.f9040 = collection.size() + c2730.f9040;
                return true;
            default:
                return ((C0863) obj).m1841(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.f11561;
        Object obj = this.f11560;
        switch (i) {
            case 0:
                ((C2730) obj).m5080();
                break;
            default:
                ((C0863) obj).m1851();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f11561;
        Object obj2 = this.f11560;
        switch (i) {
            case 0:
                return ((C2730) obj2).m5086(obj) >= 0;
            default:
                return ((C0863) obj2).m1844(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.f11561;
        Object obj = this.f11560;
        switch (i) {
            case 0:
                C2730 c2730 = (C2730) obj;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (c2730.m5086(it.next()) < 0) {
                        return false;
                    }
                }
                return true;
            default:
                C0863 c0863 = (C0863) obj;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!c0863.m1844(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f11561;
        Object obj = this.f11560;
        switch (i2) {
            case 0:
                AbstractC3667.m6538(i, this);
                return ((C2730) obj).m5076(i);
            default:
                AbstractC4019.m7192(i, this);
                return ((C0863) obj).f3182[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.f11561;
        Object obj2 = this.f11560;
        switch (i) {
            case 0:
                return ((C2730) obj2).m5086(obj);
            default:
                return ((C0863) obj2).m1849(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        int i = this.f11561;
        Object obj = this.f11560;
        switch (i) {
            case 0:
                return ((C2730) obj).m5078();
            default:
                return ((C0863) obj).f3180 == 0;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f11561) {
            case 0:
                return new C2519(this, 0, 0);
            default:
                return new C2519(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        int i2 = this.f11561;
        Object obj2 = this.f11560;
        switch (i2) {
            case 0:
                C2730 c2730 = (C2730) obj2;
                Object[] objArr = c2730.f9041;
                int i3 = c2730.f9040;
                if (obj == null) {
                    i = i3 - 1;
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                i = i3 - 1;
                while (-1 < i) {
                    if (!obj.equals(objArr[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
            default:
                C0863 c0863 = (C0863) obj2;
                Object[] objArr2 = c0863.f3182;
                for (int i4 = c0863.f3180 - 1; i4 >= 0; i4--) {
                    if (AbstractC3831.m6874(obj, objArr2[i4])) {
                        return i4;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f11561) {
            case 0:
                return new C2519(this, 0, 0);
            default:
                return new C2519(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.f11561;
        Object obj = this.f11560;
        switch (i2) {
            case 0:
                AbstractC3667.m6538(i, this);
                return ((C2730) obj).m5085(i);
            default:
                AbstractC4019.m7192(i, this);
                return ((C0863) obj).m1850(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.f11561;
        Object obj = this.f11560;
        switch (i) {
            case 0:
                C2730 c2730 = (C2730) obj;
                int i2 = c2730.f9040;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c2730.m5083(it.next());
                }
                return i2 != c2730.f9040;
            default:
                C0863 c0863 = (C0863) obj;
                if (!collection.isEmpty()) {
                    int i3 = c0863.f3180;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        c0863.m1848(it2.next());
                    }
                    if (i3 != c0863.f3180) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.f11561;
        Object obj = this.f11560;
        switch (i) {
            case 0:
                C2730 c2730 = (C2730) obj;
                int i2 = c2730.f9040;
                Object[] objArr = c2730.f9041;
                for (int i3 = i2 - 1; -1 < i3; i3--) {
                    if (!collection.contains(objArr[i3])) {
                        c2730.m5085(i3);
                    }
                }
                return i2 != c2730.f9040;
            default:
                C0863 c0863 = (C0863) obj;
                int i4 = c0863.f3180;
                for (int i5 = i4 - 1; -1 < i5; i5--) {
                    if (!collection.contains(c0863.f3182[i5])) {
                        c0863.m1850(i5);
                    }
                }
                return i4 != c0863.f3180;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.f11561;
        Object obj2 = this.f11560;
        switch (i2) {
            case 0:
                AbstractC3667.m6538(i, this);
                return ((C2730) obj2).m5087(i, obj);
            default:
                AbstractC4019.m7192(i, this);
                Object[] objArr = ((C0863) obj2).f3182;
                Object obj3 = objArr[i];
                objArr[i] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i = this.f11561;
        Object obj = this.f11560;
        switch (i) {
            case 0:
                return ((C2730) obj).f9040;
            default:
                return ((C0863) obj).f3180;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.f11561) {
            case 0:
                AbstractC3667.m6537(this, i, i2);
                return new C3756(this, i, i2, 0);
            default:
                AbstractC4019.m7191(this, i, i2);
                return new C3756(this, i, i2, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f11561) {
            case 0:
                break;
        }
        return AbstractC3925.m7047(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f11561) {
            case 0:
                break;
        }
        return AbstractC3925.m7045(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f11561) {
            case 0:
                return new C2519(this, i, 0);
            default:
                return new C2519(this, i, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.f11561;
        Object obj2 = this.f11560;
        switch (i) {
            case 0:
                return ((C2730) obj2).m5083(obj);
            default:
                return ((C0863) obj2).m1848(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.f11561;
        Object obj2 = this.f11560;
        switch (i) {
            case 0:
                ((C2730) obj2).m5079(obj);
                break;
            default:
                ((C0863) obj2).m1843(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.f11561;
        Object obj = this.f11560;
        switch (i) {
            case 0:
                C2730 c2730 = (C2730) obj;
                int i2 = c2730.f9040;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c2730.m5079(it.next());
                }
                return i2 != c2730.f9040;
            default:
                C0863 c0863 = (C0863) obj;
                return c0863.m1841(c0863.f3180, collection);
        }
    }
}
