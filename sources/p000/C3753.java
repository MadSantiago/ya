package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: ۦٌۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3753 implements Collection, InterfaceC3984 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f12486;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f12487 = 0;

    public C3753() {
        int i = AbstractC1954.f6451;
        this.f12486 = new C1165(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f12487) {
            case 0:
                return ((C1165) this.f12486).m2480(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f12487) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f12487) {
            case 0:
                ((C1165) this.f12486).m2478();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f12487;
        Object obj2 = this.f12486;
        switch (i) {
            case 0:
                return ((C1165) obj2).m2475(obj);
            default:
                return ((C3262) obj2).m6021(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.f12487;
        Object obj = this.f12486;
        switch (i) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((C1165) obj).m2475(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((C3262) obj).m6021(it2.next())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        int i = this.f12487;
        Object obj = this.f12486;
        switch (i) {
            case 0:
                return ((C1165) obj).f4047 == 0;
            default:
                return ((C3262) obj).m6025();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f12487) {
            case 0:
                return new C0754(new C5901((C1165) this.f12486));
            default:
                return AbstractC0949.m1924(new C0242(this, null, 3));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f12487) {
            case 0:
                return ((C1165) this.f12486).m2483(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f12487) {
            case 0:
                return ((C1165) this.f12486).m2483(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f12487) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f12487) {
            case 0:
                return ((C1165) this.f12486).m2482(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        int i = this.f12487;
        Object obj = this.f12486;
        switch (i) {
            case 0:
                return ((C1165) obj).f4047;
            default:
                return ((C3262) obj).f10945;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f12487) {
            case 0:
                break;
        }
        return AbstractC3925.m7047(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f12487) {
            case 0:
                break;
        }
        return AbstractC3925.m7045(this, objArr);
    }

    public C3753(C3262 c3262) {
        this.f12486 = c3262;
    }
}
