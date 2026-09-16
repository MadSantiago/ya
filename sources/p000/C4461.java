package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ۦٌ٘ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4461 extends C0796 implements Map {

    /* JADX INFO: renamed from: ۥَ */
    public C2163 f14711;

    /* JADX INFO: renamed from: ۥٓ */
    public C3839 f14712;

    /* JADX INFO: renamed from: ۥٖ */
    public C3300 f14713;

    @Override // java.util.Map
    public final Set entrySet() {
        C3839 c3839 = this.f14712;
        if (c3839 != null) {
            return c3839;
        }
        C3839 c38310 = new C3839(0, this);
        this.f14712 = c38310;
        return c38310;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2163 c2163 = this.f14711;
        if (c2163 != null) {
            return c2163;
        }
        C2163 c2164 = new C2163(this);
        this.f14711 = c2164;
        return c2164;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f2862;
        int i = this.f2862;
        int[] iArr = this.f2864;
        if (iArr.length < size) {
            this.f2864 = Arrays.copyOf(iArr, size);
            this.f2863 = Arrays.copyOf(this.f2863, size * 2);
        }
        if (this.f2862 != i) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C3300 c3300 = this.f14713;
        if (c3300 != null) {
            return c3300;
        }
        C3300 c3301 = new C3300(this);
        this.f14713 = c3301;
        return c3301;
    }

    /* JADX INFO: renamed from: ۦِ */
    public final boolean m7742(Collection collection) {
        int i = this.f2862;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f2862;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final boolean m7743(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }
}
