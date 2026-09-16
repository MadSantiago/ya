package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: ۥۣٔؔۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1347 implements Parcelable, InterfaceC0622, List, RandomAccess, InterfaceC3984 {
    public static final Parcelable.Creator<C1347> CREATOR = new C2834(0);

    /* JADX INFO: renamed from: ۦۨ */
    public C5594 f4636;

    public C1347(AbstractC0073 abstractC0073) {
        AbstractC3191 abstractC3191M3278 = AbstractC1538.m3278();
        C5594 c5594 = new C5594(abstractC3191M3278.mo5118(), abstractC0073);
        if (!(abstractC3191M3278 instanceof C2388)) {
            c5594.f16355 = new C5594(1L, abstractC0073);
        }
        this.f4636 = c5594;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        AbstractC0073 abstractC0073;
        AbstractC3191 abstractC3191M3278;
        boolean zM6791;
        do {
            synchronized (AbstractC3801.f12622) {
                C5594 c5594 = (C5594) AbstractC1538.m3272(this.f4636);
                i = c5594.f18437;
                abstractC0073 = c5594.f18435;
            }
            AbstractC0073 abstractC0073Mo622 = abstractC0073.mo622(obj);
            if (abstractC0073Mo622.equals(abstractC0073)) {
                return false;
            }
            C5594 c5595 = this.f4636;
            synchronized (AbstractC1538.f5203) {
                abstractC3191M3278 = AbstractC1538.m3278();
                zM6791 = AbstractC3801.m6791((C5594) AbstractC1538.m3276(c5595, this, abstractC3191M3278), i, abstractC0073Mo622, true);
            }
            AbstractC1538.m3281(abstractC3191M3278, this);
        } while (!zM6791);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        AbstractC0073 abstractC0073;
        AbstractC3191 abstractC3191M3278;
        boolean zM6791;
        do {
            synchronized (AbstractC3801.f12622) {
                C5594 c5594 = (C5594) AbstractC1538.m3272(this.f4636);
                i = c5594.f18437;
                abstractC0073 = c5594.f18435;
            }
            AbstractC0073 abstractC0073Mo623 = abstractC0073.mo623(collection);
            if (AbstractC3831.m6874(abstractC0073Mo623, abstractC0073)) {
                return false;
            }
            C5594 c5595 = this.f4636;
            synchronized (AbstractC1538.f5203) {
                abstractC3191M3278 = AbstractC1538.m3278();
                zM6791 = AbstractC3801.m6791((C5594) AbstractC1538.m3276(c5595, this, abstractC3191M3278), i, abstractC0073Mo623, true);
            }
            AbstractC1538.m3281(abstractC3191M3278, this);
        } while (!zM6791);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        AbstractC3191 abstractC3191M3278;
        C5594 c5594 = this.f4636;
        synchronized (AbstractC1538.f5203) {
            abstractC3191M3278 = AbstractC1538.m3278();
            C5594 c5595 = (C5594) AbstractC1538.m3276(c5594, this, abstractC3191M3278);
            synchronized (AbstractC3801.f12622) {
                c5595.f18435 = C0295.f1084;
                c5595.f18437++;
                c5595.f18436++;
            }
        }
        AbstractC1538.m3281(abstractC3191M3278, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return ((C5594) AbstractC1538.m3270(this.f4636, this)).f18435.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return ((C5594) AbstractC1538.m3270(this.f4636, this)).f18435.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return ((C5594) AbstractC1538.m3270(this.f4636, this)).f18435.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return ((C5594) AbstractC1538.m3270(this.f4636, this)).f18435.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return ((C5594) AbstractC1538.m3270(this.f4636, this)).f18435.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return ((C5594) AbstractC1538.m3270(this.f4636, this)).f18435.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C3740(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        AbstractC0073 abstractC0073;
        AbstractC3191 abstractC3191M3278;
        boolean zM6791;
        do {
            synchronized (AbstractC3801.f12622) {
                C5594 c5594 = (C5594) AbstractC1538.m3272(this.f4636);
                i = c5594.f18437;
                abstractC0073 = c5594.f18435;
            }
            int iIndexOf = abstractC0073.indexOf(obj);
            AbstractC0073 abstractC0073Mo628 = iIndexOf != -1 ? abstractC0073.mo628(iIndexOf) : abstractC0073;
            if (abstractC0073Mo628.equals(abstractC0073)) {
                return false;
            }
            C5594 c5595 = this.f4636;
            synchronized (AbstractC1538.f5203) {
                abstractC3191M3278 = AbstractC1538.m3278();
                zM6791 = AbstractC3801.m6791((C5594) AbstractC1538.m3276(c5595, this, abstractC3191M3278), i, abstractC0073Mo628, true);
            }
            AbstractC1538.m3281(abstractC3191M3278, this);
        } while (!zM6791);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        AbstractC0073 abstractC0073;
        AbstractC3191 abstractC3191M3278;
        boolean zM6791;
        do {
            synchronized (AbstractC3801.f12622) {
                C5594 c5594 = (C5594) AbstractC1538.m3272(this.f4636);
                i = c5594.f18437;
                abstractC0073 = c5594.f18435;
            }
            abstractC0073.getClass();
            AbstractC0073 abstractC0073Mo625 = abstractC0073.mo625(new C0025(0, collection));
            if (AbstractC3831.m6874(abstractC0073Mo625, abstractC0073)) {
                return false;
            }
            C5594 c5595 = this.f4636;
            synchronized (AbstractC1538.f5203) {
                abstractC3191M3278 = AbstractC1538.m3278();
                zM6791 = AbstractC3801.m6791((C5594) AbstractC1538.m3276(c5595, this, abstractC3191M3278), i, abstractC0073Mo625, true);
            }
            AbstractC1538.m3281(abstractC3191M3278, this);
        } while (!zM6791);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return AbstractC3801.m6771(this, new C0025(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        AbstractC0073 abstractC0073;
        AbstractC3191 abstractC3191M3278;
        boolean zM6791;
        Object obj2 = get(i);
        do {
            synchronized (AbstractC3801.f12622) {
                C5594 c5594 = (C5594) AbstractC1538.m3272(this.f4636);
                i2 = c5594.f18437;
                abstractC0073 = c5594.f18435;
            }
            AbstractC0073 abstractC0073Mo627 = abstractC0073.mo627(i, obj);
            if (abstractC0073Mo627.equals(abstractC0073)) {
                break;
            }
            C5594 c5595 = this.f4636;
            synchronized (AbstractC1538.f5203) {
                abstractC3191M3278 = AbstractC1538.m3278();
                zM6791 = AbstractC3801.m6791((C5594) AbstractC1538.m3276(c5595, this, abstractC3191M3278), i2, abstractC0073Mo627, false);
            }
            AbstractC1538.m3281(abstractC3191M3278, this);
        } while (!zM6791);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return ((C5594) AbstractC1538.m3270(this.f4636, this)).f18435.mo624();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            AbstractC0371.m795("fromIndex or toIndex are out of bounds");
        }
        return new C4097(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC3925.m7047(this);
    }

    public final String toString() {
        return "SnapshotStateList(value=" + ((C5594) AbstractC1538.m3272(this.f4636)).f18435 + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC0073 abstractC0073 = ((C5594) AbstractC1538.m3270(this.f4636, this)).f18435;
        int iMo624 = abstractC0073.mo624();
        parcel.writeInt(iMo624);
        for (int i2 = 0; i2 < iMo624; i2++) {
            parcel.writeValue(abstractC0073.get(i2));
        }
    }

    @Override // p000.InterfaceC0622
    /* JADX INFO: renamed from: ۥُ */
    public final void mo354(AbstractC4937 abstractC4937) {
        abstractC4937.f16355 = this.f4636;
        this.f4636 = (C5594) abstractC4937;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m2856(int i, int i2) {
        int i3;
        AbstractC0073 abstractC0073;
        AbstractC3191 abstractC3191M3278;
        boolean zM6791;
        do {
            synchronized (AbstractC3801.f12622) {
                C5594 c5594 = (C5594) AbstractC1538.m3272(this.f4636);
                i3 = c5594.f18437;
                abstractC0073 = c5594.f18435;
            }
            C4250 c4250Mo629 = abstractC0073.mo629();
            c4250Mo629.subList(i, i2).clear();
            AbstractC0073 abstractC0073M7514 = c4250Mo629.m7514();
            if (AbstractC3831.m6874(abstractC0073M7514, abstractC0073)) {
                return;
            }
            C5594 c5595 = this.f4636;
            synchronized (AbstractC1538.f5203) {
                abstractC3191M3278 = AbstractC1538.m3278();
                zM6791 = AbstractC3801.m6791((C5594) AbstractC1538.m3276(c5595, this, abstractC3191M3278), i3, abstractC0073M7514, true);
            }
            AbstractC1538.m3281(abstractC3191M3278, this);
        } while (!zM6791);
    }

    @Override // p000.InterfaceC0622
    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC4937 mo356() {
        return this.f4636;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC3925.m7045(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new C3740(this, i);
    }

    public C1347() {
        this(C0295.f1084);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        AbstractC0073 abstractC0073;
        AbstractC3191 abstractC3191M3278;
        boolean zM6791;
        do {
            synchronized (AbstractC3801.f12622) {
                C5594 c5594 = (C5594) AbstractC1538.m3272(this.f4636);
                i2 = c5594.f18437;
                abstractC0073 = c5594.f18435;
            }
            AbstractC0073 abstractC0073Mo626 = abstractC0073.mo626(i, obj);
            if (abstractC0073Mo626.equals(abstractC0073)) {
                return;
            }
            C5594 c5595 = this.f4636;
            synchronized (AbstractC1538.f5203) {
                abstractC3191M3278 = AbstractC1538.m3278();
                zM6791 = AbstractC3801.m6791((C5594) AbstractC1538.m3276(c5595, this, abstractC3191M3278), i2, abstractC0073Mo626, true);
            }
            AbstractC1538.m3281(abstractC3191M3278, this);
        } while (!zM6791);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return AbstractC3801.m6771(this, new C2224(i, 3, collection));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        AbstractC0073 abstractC0073;
        AbstractC3191 abstractC3191M3278;
        boolean zM6791;
        Object obj = get(i);
        do {
            synchronized (AbstractC3801.f12622) {
                C5594 c5594 = (C5594) AbstractC1538.m3272(this.f4636);
                i2 = c5594.f18437;
                abstractC0073 = c5594.f18435;
            }
            AbstractC0073 abstractC0073Mo628 = abstractC0073.mo628(i);
            if (abstractC0073Mo628.equals(abstractC0073)) {
                break;
            }
            C5594 c5595 = this.f4636;
            synchronized (AbstractC1538.f5203) {
                abstractC3191M3278 = AbstractC1538.m3278();
                zM6791 = AbstractC3801.m6791((C5594) AbstractC1538.m3276(c5595, this, abstractC3191M3278), i2, abstractC0073Mo628, true);
            }
            AbstractC1538.m3281(abstractC3191M3278, this);
        } while (!zM6791);
        return obj;
    }
}
