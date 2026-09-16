package p000;

/* JADX INFO: renamed from: ۥٍّٚؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1723 {

    /* JADX INFO: renamed from: ۥۣ */
    public final int f5745;

    /* JADX INFO: renamed from: ۥۣ */
    public static String m3542(int i) {
        if (i == 1) {
            return "Hyphens.None";
        }
        if (i == 2) {
            return "Hyphens.Auto";
        }
        return i == 0 ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1723) {
            return this.f5745 == ((C1723) obj).f5745;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5745);
    }

    public final String toString() {
        return m3542(this.f5745);
    }
}
