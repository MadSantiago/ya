package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: ۦٞؗۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4822 extends AbstractC2857 implements List, RandomAccess {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C1868 f15887 = new C1868(C4645.f15320, 0);

    /* JADX INFO: renamed from: ۦِ */
    public static C4645 m8197(int i, Object[] objArr) {
        return i == 0 ? C4645.f15320 : new C4645(i, objArr);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static AbstractC4822 m8198(Collection collection) {
        if (!(collection instanceof AbstractC2857)) {
            Object[] array = collection.toArray();
            AbstractC3831.m6883(array.length, array);
            return m8197(array.length, array);
        }
        AbstractC4822 abstractC4822Mo4834 = ((AbstractC2857) collection).mo4834();
        if (!abstractC4822Mo4834.mo352()) {
            return abstractC4822Mo4834;
        }
        Object[] array2 = abstractC4822Mo4834.toArray(AbstractC2857.f9563);
        return m8197(array2.length, array2);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.AbstractC2857, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && AbstractC2776.m5240(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (AbstractC2776.m5240(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC2857, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۦؑ */
    public int mo1603(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۦٛ */
    public final AbstractC0219 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: ۦۚ, reason: merged with bridge method [inline-methods] */
    public final C1868 listIterator(int i) {
        AbstractC0949.m1963(i, size());
        return isEmpty() ? f15887 : new C1868(this, i);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: ۦ۟, reason: merged with bridge method [inline-methods] */
    public AbstractC4822 subList(int i, int i2) {
        AbstractC0949.m1968(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? C4645.f15320 : new C1421(this, i, i3);
    }

    /* JADX INFO: renamed from: ۦۨ */
    public AbstractC4822 mo2770() {
        return size() <= 1 ? this : new C1299(this);
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC4822 mo4834() {
        return this;
    }
}
