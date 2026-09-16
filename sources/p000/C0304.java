package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ۥؓؓؓ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0304 implements Set, InterfaceC3984 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final C3262 f1096;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f1097;

    public /* synthetic */ C0304(C3262 c3262, int i) {
        this.f1097 = i;
        this.f1096 = c3262;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f1097) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f1097) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f1097) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f1097;
        C3262 c3262 = this.f1096;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return AbstractC3831.m6874(c3262.m6027(entry.getKey()), entry.getValue());
            default:
                return c3262.m6015(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.f1097;
        C3262 c3262 = this.f1096;
        switch (i) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                if (!collection2.isEmpty()) {
                    for (Map.Entry entry : collection2) {
                        if (!AbstractC3831.m6874(c3262.m6027(entry.getKey()), entry.getValue())) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                Collection collection3 = collection;
                if (!collection3.isEmpty()) {
                    Iterator it = collection3.iterator();
                    while (it.hasNext()) {
                        if (!c3262.m6015(it.next())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        int i = this.f1097;
        C3262 c3262 = this.f1096;
        switch (i) {
            case 0:
                break;
        }
        return c3262.m6025();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC0443 interfaceC0443 = null;
        switch (this.f1097) {
            case 0:
                return AbstractC0949.m1924(new C0242(this, interfaceC0443, 0));
            default:
                return AbstractC0949.m1924(new C0242(this, interfaceC0443, 1));
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f1097) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f1097) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f1097) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        int i = this.f1097;
        C3262 c3262 = this.f1096;
        switch (i) {
            case 0:
                break;
        }
        return c3262.f10945;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f1097) {
            case 0:
                break;
        }
        return AbstractC3925.m7047(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f1097) {
            case 0:
                break;
        }
        return AbstractC3925.m7045(this, objArr);
    }
}
