package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ۥٌؓۥٖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0890 extends AbstractC0038 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final C3598 f3232;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f3233;

    public /* synthetic */ C0890(C3598 c3598, int i) {
        this.f3233 = i;
        this.f3232 = c3598;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f3233) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f3233) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f3233;
        C3598 c3598 = this.f3232;
        switch (i) {
            case 0:
                c3598.clear();
                break;
            default:
                c3598.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.f3233;
        C3598 c3598 = this.f3232;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int iM6406 = c3598.m6406(entry.getKey());
                if (iM6406 < 0) {
                    return false;
                }
                return AbstractC3831.m6874(c3598.f11977[iM6406], entry.getValue());
            default:
                return c3598.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f3233) {
            case 0:
                C3598 c3598 = this.f3232;
                for (Object obj : collection) {
                    if (obj == null) {
                        return false;
                    }
                    try {
                        Map.Entry entry = (Map.Entry) obj;
                        int iM6406 = c3598.m6406(entry.getKey());
                        if (!(iM6406 < 0 ? false : AbstractC3831.m6874(c3598.f11977[iM6406], entry.getValue()))) {
                            return false;
                        }
                    } catch (ClassCastException unused) {
                        return false;
                    }
                }
                return true;
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        int i = this.f3233;
        C3598 c3598 = this.f3232;
        switch (i) {
            case 0:
                break;
        }
        return c3598.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f3233;
        C3598 c3598 = this.f3232;
        switch (i) {
            case 0:
                return new C0893(c3598, 0);
            default:
                return new C0893(c3598, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.f3233;
        C3598 c3598 = this.f3232;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    c3598.m6404();
                    int iM6406 = c3598.m6406(entry.getKey());
                    if (iM6406 >= 0 && AbstractC3831.m6874(c3598.f11977[iM6406], entry.getValue())) {
                        c3598.m6411(iM6406);
                        return true;
                    }
                }
                return false;
            default:
                c3598.m6404();
                int iM6407 = c3598.m6406(obj);
                if (iM6407 < 0) {
                    return false;
                }
                c3598.m6411(iM6407);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.f3233;
        C3598 c3598 = this.f3232;
        switch (i) {
            case 0:
                c3598.m6404();
                break;
            default:
                c3598.m6404();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.f3233;
        C3598 c3598 = this.f3232;
        switch (i) {
            case 0:
                c3598.m6404();
                break;
            default:
                c3598.m6404();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // p000.AbstractC0038
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo496() {
        int i = this.f3233;
        C3598 c3598 = this.f3232;
        switch (i) {
            case 0:
                break;
        }
        return c3598.f11973;
    }
}
