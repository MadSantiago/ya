package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: ۥؘؒؑ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0232 extends AbstractC0038 implements Serializable {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C0232 f873;

    /* JADX INFO: renamed from: ۦۨ */
    public final C3598 f874;

    static {
        C3598 c3598 = C3598.f11965;
        f873 = new C0232(C3598.f11965);
    }

    public C0232() {
        this(new C3598());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f874.m6409(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        this.f874.m6404();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f874.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f874.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f874.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C3598 c3598 = this.f874;
        c3598.getClass();
        return new C0893(c3598, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C3598 c3598 = this.f874;
        c3598.m6404();
        int iM6406 = c3598.m6406(obj);
        if (iM6406 < 0) {
            return false;
        }
        c3598.m6411(iM6406);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        this.f874.m6404();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        this.f874.m6404();
        return super.retainAll(collection);
    }

    @Override // p000.AbstractC0038
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo496() {
        return this.f874.f11973;
    }

    public C0232(C3598 c3598) {
        this.f874 = c3598;
    }
}
