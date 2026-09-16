package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۦٌۡؒٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5447 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C1332 f17962;

    /* JADX INFO: renamed from: ۦ۟ */
    public Object f17963;

    /* JADX INFO: renamed from: ۦۨ */
    public final Comparable f17964;

    public C5447(C1332 c1332, Comparable comparable, Object obj) {
        this.f17962 = c1332;
        this.f17964 = comparable;
        this.f17963 = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f17964.compareTo(((C5447) obj).f17964);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f17964;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f17963;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f17964;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f17963;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f17964;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f17963;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f17962.m2843();
        Object obj2 = this.f17963;
        this.f17963 = obj;
        return obj2;
    }

    public final String toString() {
        return this.f17964 + "=" + this.f17963;
    }
}
