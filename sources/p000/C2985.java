package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۦٌؐؕؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2985 implements Map.Entry {

    /* JADX INFO: renamed from: ۥْ */
    public C2985 f10037;

    /* JADX INFO: renamed from: ۥٓ */
    public C2985 f10038;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f10039;

    /* JADX INFO: renamed from: ۦۨ */
    public final Object f10040;

    public C2985(Object obj, Object obj2) {
        this.f10040 = obj;
        this.f10039 = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2985)) {
            return false;
        }
        C2985 c2985 = (C2985) obj;
        return this.f10040.equals(c2985.f10040) && this.f10039.equals(c2985.f10039);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f10040;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f10039;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f10039.hashCode() ^ this.f10040.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f10040 + "=" + this.f10039;
    }
}
