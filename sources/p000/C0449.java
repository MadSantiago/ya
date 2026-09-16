package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: ۥؕؓؐۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0449 implements Map, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥْ */
    public C0304 f1638;

    /* JADX INFO: renamed from: ۥٓ */
    public C3753 f1639;

    /* JADX INFO: renamed from: ۦ۟ */
    public C0304 f1640;

    /* JADX INFO: renamed from: ۦۨ */
    public final C3262 f1641;

    public C0449(C3262 c3262) {
        this.f1641 = c3262;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f1641.m6015(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f1641.m6021(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0304 c0304 = this.f1640;
        if (c0304 != null) {
            return c0304;
        }
        C0304 c0305 = new C0304(this.f1641, 0);
        this.f1640 = c0305;
        return c0305;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0449.class != obj.getClass()) {
            return false;
        }
        return this.f1641.equals(((C0449) obj).f1641);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f1641.m6027(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f1641.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f1641.m6025();
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0304 c0304 = this.f1638;
        if (c0304 != null) {
            return c0304;
        }
        C0304 c0305 = new C0304(this.f1641, 1);
        this.f1638 = c0305;
        return c0305;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f1641.f10945;
    }

    public final String toString() {
        return this.f1641.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        C3753 c3753 = this.f1639;
        if (c3753 != null) {
            return c3753;
        }
        C3753 c3754 = new C3753(this.f1641);
        this.f1639 = c3754;
        return c3754;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
