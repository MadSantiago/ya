package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ۥُؗؒ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C0588 implements Map, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥْ */
    public static final C0588 f2191 = new C0588(C1205.f4146, 0);

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f2192;

    /* JADX INFO: renamed from: ۦۨ */
    public final C1205 f2193;

    public C0588(C1205 c1205, int i) {
        this.f2193 = c1205;
        this.f2192 = i;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f2193.m2541(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set setEntrySet = entrySet();
        if (setEntrySet.isEmpty()) {
            return false;
        }
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (AbstractC3831.m6874(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new C4869(this, 0);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.f2192 != map.size()) {
            return false;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : setEntrySet) {
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = get(key);
                if (AbstractC3831.m6874(value, obj2) && (obj2 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f2193.m2548(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f2192 == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new C4869(this, 1);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f2192;
    }

    public final String toString() {
        return AbstractC0973.m2056(entrySet(), ", ", "{", "}", new C0091(1, this), 24);
    }

    @Override // java.util.Map
    public final Collection values() {
        return new C5167(this);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C0588 m1299(Object obj, C0167 c0167) {
        C0322 c0322M2545 = this.f2193.m2545(obj != null ? obj.hashCode() : 0, 0, obj, c0167);
        return c0322M2545 == null ? this : new C0588((C1205) c0322M2545.f1178, this.f2192 + c0322M2545.f1179);
    }
}
