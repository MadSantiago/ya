package p000;

/* JADX INFO: renamed from: ۦًؘُۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5565 {

    /* JADX INFO: renamed from: ۥۗ */
    public final Integer f18371;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f18372;

    public C5565(int i, Integer num) {
        this.f18372 = i;
        this.f18371 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5565)) {
            return false;
        }
        C5565 c5565 = (C5565) obj;
        return this.f18372 == c5565.f18372 && AbstractC3831.m6874(this.f18371, c5565.f18371);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f18372) * 31;
        Integer num = this.f18371;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f18372 + ", dataOffset=" + this.f18371 + ')';
    }
}
