package p000;

import java.util.HashMap;

/* JADX INFO: renamed from: ۥٌؗؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0606 {

    /* JADX INFO: renamed from: ۦؑ */
    public static final AbstractC4821 f2278 = AbstractC4821.m8196(3, "_syn", "_err", "_el");

    /* JADX INFO: renamed from: ۥؗ */
    public final HashMap f2279;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f2280;

    /* JADX INFO: renamed from: ۥۣ */
    public String f2281;

    public C0606(String str, long j, HashMap map) {
        this.f2281 = str;
        this.f2280 = j;
        HashMap map2 = new HashMap();
        this.f2279 = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static Object m1369(Object obj, Object obj2, String str) {
        if (f2278.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0606)) {
            return false;
        }
        C0606 c0606 = (C0606) obj;
        if (this.f2280 == c0606.f2280 && this.f2281.equals(c0606.f2281)) {
            return this.f2279.equals(c0606.f2279);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f2281.hashCode() * 31;
        long j = this.f2280;
        return this.f2279.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f2281;
        String string = this.f2279.toString();
        int length = String.valueOf(str).length();
        long j = this.f2280;
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(j).length() + 9 + string.length() + 1);
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j);
        sb.append(", params=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥۣ, reason: merged with bridge method [inline-methods] */
    public final C0606 clone() {
        return new C0606(this.f2281, this.f2280, new HashMap(this.f2279));
    }
}
