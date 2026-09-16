package p000;

/* JADX INFO: renamed from: ۥّؑ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0221 {

    /* JADX INFO: renamed from: ۥۣ */
    public final int f824;

    /* JADX INFO: renamed from: ۥۣ */
    public static String m478(int i) {
        if (i == -1) {
            return "Unspecified";
        }
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Default";
        }
        if (i == 2) {
            return "Go";
        }
        if (i == 3) {
            return "Search";
        }
        if (i == 4) {
            return "Send";
        }
        if (i == 5) {
            return "Previous";
        }
        if (i == 6) {
            return "Next";
        }
        return i == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0221) {
            return this.f824 == ((C0221) obj).f824;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f824);
    }

    public final String toString() {
        return m478(this.f824);
    }
}
