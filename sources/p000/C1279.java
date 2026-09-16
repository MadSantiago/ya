package p000;

/* JADX INFO: renamed from: ۥٓؔ۟ٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1279 {

    /* JADX INFO: renamed from: ۥۗ */
    public final Object f4356;

    /* JADX INFO: renamed from: ۥۣ */
    public final Integer f4357;

    public C1279(Integer num, Object obj) {
        this.f4357 = num;
        this.f4356 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1279)) {
            return false;
        }
        C1279 c1279 = (C1279) obj;
        return this.f4357.equals(c1279.f4357) && AbstractC3831.m6874(this.f4356, c1279.f4356);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f4357.hashCode() * 31;
        Object obj = this.f4356;
        if (obj instanceof Enum) {
            iHashCode = ((Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        return iHashCode + iHashCode2;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f4357 + ", right=" + this.f4356 + ')';
    }
}
