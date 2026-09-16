package p000;

/* JADX INFO: renamed from: ۦْٝؓۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4740 {

    /* JADX INFO: renamed from: ۥۣ */
    public final int f15639;

    /* JADX INFO: renamed from: ۥۣ */
    public static String m8061(int i) {
        if (i == 1) {
            return "Ltr";
        }
        if (i == 2) {
            return "Rtl";
        }
        if (i == 3) {
            return "Content";
        }
        if (i == 4) {
            return "ContentOrLtr";
        }
        if (i == 5) {
            return "ContentOrRtl";
        }
        return i == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4740) {
            return this.f15639 == ((C4740) obj).f15639;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15639);
    }

    public final String toString() {
        return m8061(this.f15639);
    }
}
