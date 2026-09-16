package p000;

/* JADX INFO: renamed from: ۦؕؕۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3285 {

    /* JADX INFO: renamed from: ۥۗ */
    public final Object f11005;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f11006;

    public C3285(int i, Object obj) {
        this.f11006 = i;
        this.f11005 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3285)) {
            return false;
        }
        C3285 c3285 = (C3285) obj;
        return this.f11006 == c3285.f11006 && AbstractC3831.m6874(this.f11005, c3285.f11005);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f11006) * 31;
        Object obj = this.f11005;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f11006 + ", value=" + this.f11005 + ')';
    }
}
