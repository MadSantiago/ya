package p000;

/* JADX INFO: renamed from: ۥۘؓٛؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2155 {

    /* JADX INFO: renamed from: ۥۣ */
    public final int f7116;

    public /* synthetic */ C2155(int i) {
        this.f7116 = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2155) {
            return this.f7116 == ((C2155) obj).f7116;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7116);
    }

    public final String toString() {
        int i = this.f7116;
        if (i == 0) {
            return "Button";
        }
        if (i == 1) {
            return "Checkbox";
        }
        if (i == 2) {
            return "Switch";
        }
        if (i == 3) {
            return "RadioButton";
        }
        if (i == 4) {
            return "Tab";
        }
        if (i == 5) {
            return "Image";
        }
        if (i == 6) {
            return "DropdownList";
        }
        if (i == 7) {
            return "Picker";
        }
        return i == 8 ? "Carousel" : "Unknown";
    }
}
