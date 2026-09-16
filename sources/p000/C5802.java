package p000;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: ۦُۧؑؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5802 {

    /* JADX INFO: renamed from: ۥۗ */
    public final Map f19118;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f19119;

    public C5802(String str, Map map) {
        this.f19119 = str;
        this.f19118 = map;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C5802 m9613(String str) {
        return new C5802(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5802)) {
            return false;
        }
        C5802 c5802 = (C5802) obj;
        return this.f19119.equals(c5802.f19119) && this.f19118.equals(c5802.f19118);
    }

    public final int hashCode() {
        return this.f19118.hashCode() + (this.f19119.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f19119 + ", properties=" + this.f19118.values() + "}";
    }
}
