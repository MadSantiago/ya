package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: ۥۨؒۤۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2912 extends AbstractC1425 {

    /* JADX INFO: renamed from: ۦۛ */
    public static final C2912 f9705;

    /* JADX INFO: renamed from: ۦٗ */
    public final transient AbstractC4822 f9706;

    static {
        C1868 c1868 = AbstractC4822.f15887;
        f9705 = new C2912(C4645.f15320, C1160.f4027);
    }

    public C2912(AbstractC4822 abstractC4822, Comparator comparator) {
        super(comparator);
        this.f9706 = abstractC4822;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iM5486 = m5486(obj, true);
        AbstractC4822 abstractC4822 = this.f9706;
        if (iM5486 == abstractC4822.size()) {
            return null;
        }
        return abstractC4822.get(iM5486);
    }

    @Override // p000.AbstractC2857, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f9706, obj, this.f4899) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC3967) {
            collection = ((InterfaceC3967) collection).m7122();
        }
        Comparator comparator = this.f4899;
        if (!AbstractC1605.m3336(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        AbstractC0219 it = iterator();
        Iterator it2 = collection.iterator();
        C1868 c1868 = (C1868) it;
        if (!c1868.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = c1868.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!c1868.hasNext()) {
                        return false;
                    }
                    next2 = c1868.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f9706.mo2770().listIterator(0);
    }

    @Override // p000.AbstractC4821, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.f9706.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.f4899;
        if (!AbstractC1605.m3336(comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            AbstractC0219 it2 = iterator();
            do {
                C1868 c1868 = (C1868) it2;
                if (!c1868.hasNext()) {
                    return true;
                }
                next = c1868.next();
                next2 = it.next();
                if (next2 == null) {
                    return false;
                }
            } while (comparator.compare(next, next2) == 0);
            return false;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.f9706.get(0);
        }
        C0178.m381();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iM5488 = m5488(obj, true) - 1;
        if (iM5488 == -1) {
            return null;
        }
        return this.f9706.get(iM5488);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iM5486 = m5486(obj, false);
        AbstractC4822 abstractC4822 = this.f9706;
        if (iM5486 == abstractC4822.size()) {
            return null;
        }
        return abstractC4822.get(iM5486);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            C0178.m381();
            return null;
        }
        AbstractC4822 abstractC4822 = this.f9706;
        return abstractC4822.get(abstractC4822.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iM5488 = m5488(obj, false) - 1;
        if (iM5488 == -1) {
            return null;
        }
        return this.f9706.get(iM5488);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9706.size();
    }

    /* JADX INFO: renamed from: ۥَ */
    public final int m5486(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f9706, obj, this.f4899);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۥُ */
    public final Object[] mo3022() {
        return this.f9706.mo3022();
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۥّ */
    public final int mo3023() {
        return this.f9706.mo3023();
    }

    /* JADX INFO: renamed from: ۥْ */
    public final C2912 m5487(int i, int i2) {
        AbstractC4822 abstractC4822 = this.f9706;
        if (i == 0 && i2 == abstractC4822.size()) {
            return this;
        }
        Comparator comparator = this.f4899;
        return i < i2 ? new C2912(abstractC4822.subList(i, i2), comparator) : AbstractC1425.m3025(comparator);
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final int m5488(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f9706, obj, this.f4899);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    @Override // p000.AbstractC4821, p000.AbstractC2857
    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC4822 mo4834() {
        return this.f9706;
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۥۜ */
    public final boolean mo352() {
        return this.f9706.mo352();
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo1603(Object[] objArr) {
        return this.f9706.mo1603(objArr);
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۦٛ */
    public final AbstractC0219 iterator() {
        return this.f9706.listIterator(0);
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۦۙ */
    public final int mo3024() {
        return this.f9706.mo3024();
    }
}
