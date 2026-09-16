package p000;

/* JADX INFO: renamed from: ۦ۠ؖٔؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5407 {

    /* JADX INFO: renamed from: ۥۣ */
    public final int f17858;

    /* JADX INFO: renamed from: ۥۣ */
    public static String m9088(int i) {
        if (i == 1) {
            return "Touch";
        }
        if (i == 2) {
            return "Mouse";
        }
        if (i != 3) {
            return i != 4 ? "Unknown" : "Eraser";
        }
        return "Stylus";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5407) {
            return this.f17858 == ((C5407) obj).f17858;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17858);
    }

    public final String toString() {
        return m9088(this.f17858);
    }
}
