package p000;

/* JADX INFO: renamed from: ۦِؔۨٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3973 {

    /* JADX INFO: renamed from: ۥۗ */
    public final int f13282;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f13283;

    public C3973(int i, String str) {
        this.f13283 = str;
        this.f13282 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3973)) {
            return false;
        }
        C3973 c3973 = (C3973) obj;
        return this.f13283.equals(c3973.f13283) && this.f13282 == c3973.f13282;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13282) + (this.f13283.hashCode() * 31);
    }

    public final String toString() {
        return "CheckBoxBottomData(id=" + this.f13283 + ", label=" + this.f13282 + ")";
    }
}
