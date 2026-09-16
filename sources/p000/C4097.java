package p000;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: ۦْٜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4097 implements List, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥْ */
    public int f13664;

    /* JADX INFO: renamed from: ۥٓ */
    public int f13665;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f13666;

    /* JADX INFO: renamed from: ۦۨ */
    public final C1347 f13667;

    public C4097(C1347 c1347, int i, int i2) {
        this.f13667 = c1347;
        this.f13666 = i;
        this.f13664 = ((C5594) AbstractC1538.m3272(c1347.f4636)).f18436;
        this.f13665 = i2 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        m7282();
        int i = this.f13666 + this.f13665;
        C1347 c1347 = this.f13667;
        c1347.add(i, obj);
        this.f13665++;
        this.f13664 = ((C5594) AbstractC1538.m3272(c1347.f4636)).f18436;
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        m7282();
        int i2 = i + this.f13666;
        C1347 c1347 = this.f13667;
        boolean zAddAll = c1347.addAll(i2, collection);
        if (zAddAll) {
            this.f13665 = collection.size() + this.f13665;
            this.f13664 = ((C5594) AbstractC1538.m3272(c1347.f4636)).f18436;
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f13665 > 0) {
            m7282();
            int i = this.f13665;
            int i2 = this.f13666;
            C1347 c1347 = this.f13667;
            c1347.m2856(i2, i + i2);
            this.f13665 = 0;
            this.f13664 = ((C5594) AbstractC1538.m3272(c1347.f4636)).f18436;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        m7282();
        AbstractC3801.m6778(i, this.f13665);
        return this.f13667.get(this.f13666 + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iNextInt;
        m7282();
        int i = this.f13665;
        int i2 = this.f13666;
        Iterator it = AbstractC4554.m7917(i2, i + i2).iterator();
        do {
            C0274 c0274 = (C0274) it;
            if (!c0274.f977) {
                return -1;
            }
            iNextInt = c0274.nextInt();
        } while (!AbstractC3831.m6874(obj, this.f13667.get(iNextInt)));
        return iNextInt - i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f13665 == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m7282();
        int i = this.f13665;
        int i2 = this.f13666;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (AbstractC3831.m6874(obj, this.f13667.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        m7282();
        C4763 c4763 = new C4763();
        c4763.f15714 = i - 1;
        return new C2158(c4763, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        m7282();
        int i2 = this.f13666 + i;
        C1347 c1347 = this.f13667;
        Object objRemove = c1347.remove(i2);
        this.f13665--;
        this.f13664 = ((C5594) AbstractC1538.m3272(c1347.f4636)).f18436;
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        AbstractC0073 abstractC0073;
        AbstractC3191 abstractC3191M3278;
        boolean zM6791;
        m7282();
        C1347 c1347 = this.f13667;
        int i2 = this.f13666;
        int i3 = this.f13665 + i2;
        int size = c1347.size();
        do {
            synchronized (AbstractC3801.f12622) {
                C5594 c5594 = (C5594) AbstractC1538.m3272(c1347.f4636);
                i = c5594.f18437;
                abstractC0073 = c5594.f18435;
            }
            C4250 c4250Mo629 = abstractC0073.mo629();
            c4250Mo629.subList(i2, i3).retainAll(collection);
            AbstractC0073 abstractC0073M7514 = c4250Mo629.m7514();
            if (AbstractC3831.m6874(abstractC0073M7514, abstractC0073)) {
                break;
            }
            C5594 c5595 = c1347.f4636;
            synchronized (AbstractC1538.f5203) {
                abstractC3191M3278 = AbstractC1538.m3278();
                zM6791 = AbstractC3801.m6791((C5594) AbstractC1538.m3276(c5595, c1347, abstractC3191M3278), i, abstractC0073M7514, true);
            }
            AbstractC1538.m3281(abstractC3191M3278, c1347);
        } while (!zM6791);
        int size2 = size - c1347.size();
        if (size2 > 0) {
            this.f13664 = ((C5594) AbstractC1538.m3272(this.f13667.f4636)).f18436;
            this.f13665 -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        AbstractC3801.m6778(i, this.f13665);
        m7282();
        int i2 = i + this.f13666;
        C1347 c1347 = this.f13667;
        Object obj2 = c1347.set(i2, obj);
        this.f13664 = ((C5594) AbstractC1538.m3272(c1347.f4636)).f18436;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f13665;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.f13665) {
            AbstractC0371.m795("fromIndex or toIndex are out of bounds");
        }
        m7282();
        int i3 = this.f13666;
        return new C4097(this.f13667, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC3925.m7047(this);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m7282() {
        if (((C5594) AbstractC1538.m3272(this.f13667.f4636)).f18436 != this.f13664) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC3925.m7045(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        m7282();
        int i2 = this.f13666 + i;
        C1347 c1347 = this.f13667;
        c1347.add(i2, obj);
        this.f13665++;
        this.f13664 = ((C5594) AbstractC1538.m3272(c1347.f4636)).f18436;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f13665, collection);
    }
}
