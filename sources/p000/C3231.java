package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۦٕؔؖؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3231 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C1789 f10851;

    /* JADX INFO: renamed from: ۦ۟ */
    public Object f10852;

    /* JADX INFO: renamed from: ۦۨ */
    public final Comparable f10853;

    public C3231(C1789 c1789, Comparable comparable, Object obj) {
        this.f10851 = c1789;
        this.f10853 = comparable;
        this.f10852 = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f10853.compareTo(((C3231) obj).f10853);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f10853;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f10852;
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
    public final /* synthetic */ Object getKey() {
        return this.f10853;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f10852;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f10853;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f10852;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f10851.m3573();
        Object obj2 = this.f10852;
        this.f10852 = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f10853);
        String strValueOf2 = String.valueOf(this.f10852);
        return AbstractC3761.m6622(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}
