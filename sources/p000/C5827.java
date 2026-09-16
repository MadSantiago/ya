package p000;

/* JADX INFO: renamed from: ۦٟۧؕٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5827 {

    /* JADX INFO: renamed from: ۥۣ */
    public final int f19197;

    public final boolean equals(Object obj) {
        if (obj instanceof C5827) {
            return this.f19197 == ((C5827) obj).f19197;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19197);
    }

    public final String toString() {
        int i = this.f19197;
        if (i == 0) {
            return "Normal";
        }
        return i == 1 ? "Italic" : "Invalid";
    }
}
