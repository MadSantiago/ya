package p000;

/* JADX INFO: renamed from: ۥُؕٝۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1057 {

    /* JADX INFO: renamed from: ۥۣ */
    public final int f3729;

    /* JADX INFO: renamed from: ۥۣ */
    public static String m2263(int i) {
        if (i == 1) {
            return "Next";
        }
        if (i == 2) {
            return "Previous";
        }
        if (i == 3) {
            return "Left";
        }
        if (i == 4) {
            return "Right";
        }
        if (i == 5) {
            return "Up";
        }
        if (i == 6) {
            return "Down";
        }
        if (i == 7) {
            return "Enter";
        }
        return i == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1057) {
            return this.f3729 == ((C1057) obj).f3729;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3729);
    }

    public final String toString() {
        return m2263(this.f3729);
    }
}
