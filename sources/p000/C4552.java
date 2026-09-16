package p000;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦؙٕٚؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4552 extends AbstractC0095 {

    /* JADX INFO: renamed from: ۦۨ */
    public final C3598 f15034;

    public C4552(C3598 c3598) {
        this.f15034 = c3598;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f15034.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f15034.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f15034.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0893(this.f15034, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        C3598 c3598 = this.f15034;
        c3598.m6404();
        int i2 = c3598.f11971;
        while (true) {
            i = -1;
            i2--;
            if (i2 >= 0) {
                if (c3598.f11969[i2] >= 0 && AbstractC3831.m6874(c3598.f11977[i2], obj)) {
                    i = i2;
                    break;
                }
            } else {
                break;
            }
        }
        if (i < 0) {
            return false;
        }
        c3598.m6411(i);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        this.f15034.m6404();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        this.f15034.m6404();
        return super.retainAll(collection);
    }

    @Override // p000.AbstractC0095
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo220() {
        return this.f15034.f11973;
    }
}
