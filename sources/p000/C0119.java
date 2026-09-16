package p000;

/* JADX INFO: renamed from: ۥؙؐؓ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0119 {

    /* JADX INFO: renamed from: ۥۣ */
    public final int f471;

    public final boolean equals(Object obj) {
        if (obj instanceof C0119) {
            return this.f471 == ((C0119) obj).f471;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f471);
    }

    public final String toString() {
        int i = this.f471;
        if (i == 1) {
            return "Touch";
        }
        return i == 2 ? "Keyboard" : "Error";
    }
}
