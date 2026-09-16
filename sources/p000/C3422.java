package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ۦؗؕؐۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3422 extends AbstractC0038 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final C3881 f11383;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f11384;

    public /* synthetic */ C3422(int i, C3881 c3881) {
        this.f11384 = i;
        this.f11383 = c3881;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f11384) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f11384;
        C3881 c3881 = this.f11383;
        switch (i) {
            case 0:
                c3881.clear();
                break;
            default:
                c3881.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f11384) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    C3881 c3881 = this.f11383;
                    Object obj2 = c3881.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && c3881.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f11383.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f11384;
        C3881 c3881 = this.f11383;
        switch (i) {
            case 0:
                return new C3894(c3881);
            default:
                AbstractC5848[] abstractC5848Arr = new AbstractC5848[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    abstractC5848Arr[i2] = new C2939(1);
                }
                return new C2881(c3881, abstractC5848Arr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f11384) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f11383.remove(entry.getKey(), entry.getValue());
            default:
                C3881 c3881 = this.f11383;
                if (!c3881.containsKey(obj)) {
                    return false;
                }
                c3881.remove(obj);
                return true;
        }
    }

    @Override // p000.AbstractC0038
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo496() {
        int i = this.f11384;
        C3881 c3881 = this.f11383;
        switch (i) {
            case 0:
                break;
        }
        return c3881.f12966;
    }
}
