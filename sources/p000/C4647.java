package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۦٛؗ۠ؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4647 implements Map.Entry, InterfaceC3984 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f15329;

    /* JADX INFO: renamed from: ۦۨ */
    public final Object f15330;

    public C4647(Object obj, Object obj2) {
        this.f15330 = obj;
        this.f15329 = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4647)) {
            return false;
        }
        C4647 c4647 = (C4647) obj;
        return AbstractC3831.m6874(this.f15330, c4647.f15330) && AbstractC3831.m6874(this.f15329, c4647.f15329);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f15330;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15329;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f15330;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f15329;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f15330 + ", value=" + this.f15329 + ')';
    }
}
