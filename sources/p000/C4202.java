package p000;

/* JADX INFO: renamed from: ۦؘٔؗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4202 {

    /* JADX INFO: renamed from: ۥۣ */
    public final int f13960;

    /* JADX INFO: renamed from: ۥۣ */
    public static String m7425(int i) {
        if (i == 1) {
            return "Left";
        }
        if (i == 2) {
            return "Right";
        }
        if (i == 3) {
            return "Center";
        }
        if (i == 4) {
            return "Justify";
        }
        if (i == 5) {
            return "Start";
        }
        if (i == 6) {
            return "End";
        }
        return i == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4202) {
            return this.f13960 == ((C4202) obj).f13960;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13960);
    }

    public final String toString() {
        return m7425(this.f13960);
    }
}
