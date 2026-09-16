package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: ۥۨؗۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1172(with = C1382.class)
public final class C2945 extends AbstractC0695 implements Map<String, AbstractC0695>, InterfaceC3984 {
    public static final C2846 Companion = new C2846();

    /* JADX INFO: renamed from: ۦۨ */
    public final Map f9885;

    public C2945(Map map) {
        this.f9885 = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC0695 compute(String str, BiFunction<? super String, ? super AbstractC0695, ? extends AbstractC0695> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC0695 computeIfAbsent(String str, Function<? super String, ? extends AbstractC0695> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC0695 computeIfPresent(String str, BiFunction<? super String, ? super AbstractC0695, ? extends AbstractC0695> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f9885.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof AbstractC0695)) {
            return false;
        }
        return this.f9885.containsValue((AbstractC0695) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, AbstractC0695>> entrySet() {
        return this.f9885.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC3831.m6874(this.f9885, obj);
    }

    @Override // java.util.Map
    public final AbstractC0695 get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (AbstractC0695) this.f9885.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f9885.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f9885.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f9885.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC0695 merge(String str, AbstractC0695 abstractC0695, BiFunction<? super AbstractC0695, ? super AbstractC0695, ? extends AbstractC0695> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC0695 put(String str, AbstractC0695 abstractC0695) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends AbstractC0695> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC0695 putIfAbsent(String str, AbstractC0695 abstractC0695) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final AbstractC0695 remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC0695 replace(String str, AbstractC0695 abstractC0695) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super AbstractC0695, ? extends AbstractC0695> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f9885.size();
    }

    public final String toString() {
        return AbstractC0973.m2056(this.f9885.entrySet(), ",", "{", "}", new C4618(4), 24);
    }

    @Override // java.util.Map
    public final Collection<AbstractC0695> values() {
        return this.f9885.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, AbstractC0695 abstractC0695, AbstractC0695 abstractC0696) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
