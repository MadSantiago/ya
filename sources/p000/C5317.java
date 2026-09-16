package p000;

/* JADX INFO: renamed from: ۦَ۟ؑۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5317 {

    /* JADX INFO: renamed from: ۥۣ */
    public final int f17504;

    public final boolean equals(Object obj) {
        if (obj instanceof C5317) {
            return this.f17504 == ((C5317) obj).f17504;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17504);
    }

    public final String toString() {
        int i = this.f17504;
        if (i == 1) {
            return "LineHeightStyle.Trim.FirstLineTop";
        }
        if (i == 16) {
            return "LineHeightStyle.Trim.LastLineBottom";
        }
        if (i == 17) {
            return "LineHeightStyle.Trim.Both";
        }
        return i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
