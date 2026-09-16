package p000;

/* JADX INFO: renamed from: ۥًَؑٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0989 {

    /* JADX INFO: renamed from: ۥۣ */
    public final int f3489;

    public final boolean equals(Object obj) {
        if (obj instanceof C0989) {
            return this.f3489 == ((C0989) obj).f3489;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3489);
    }

    public final String toString() {
        int i = this.f3489;
        if (i == 0) {
            return "Argb8888";
        }
        if (i == 1) {
            return "Alpha8";
        }
        if (i == 2) {
            return "Rgb565";
        }
        if (i == 3) {
            return "F16";
        }
        return i == 4 ? "Gpu" : "Unknown";
    }
}
