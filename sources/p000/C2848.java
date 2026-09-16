package p000;

/* JADX INFO: renamed from: ۥۧؑۛٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2848 {

    /* JADX INFO: renamed from: ۥۣ */
    public final int f9512;

    public final boolean equals(Object obj) {
        if (obj instanceof C2848) {
            return this.f9512 == ((C2848) obj).f9512;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9512);
    }

    public final String toString() {
        int i = this.f9512;
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Weight";
        }
        if (i == 2) {
            return "Style";
        }
        return i == 65535 ? "All" : "Invalid";
    }
}
