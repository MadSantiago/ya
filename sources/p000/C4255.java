package p000;

/* JADX INFO: renamed from: ۦٌٕۣؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4255 {

    /* JADX INFO: renamed from: ۥۣ */
    public final int f14099;

    public final boolean equals(Object obj) {
        if (obj instanceof C4255) {
            return this.f14099 == ((C4255) obj).f14099;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14099);
    }

    public final String toString() {
        int i = this.f14099;
        if (i == 16) {
            return "Confirm";
        }
        if (i == 6) {
            return "ContextClick";
        }
        if (i == 13) {
            return "GestureEnd";
        }
        if (i == 23) {
            return "GestureThresholdActivate";
        }
        if (i == 3) {
            return "KeyboardTap";
        }
        if (i == 0) {
            return "LongPress";
        }
        if (i == 17) {
            return "Reject";
        }
        if (i == 27) {
            return "SegmentFrequentTick";
        }
        if (i == 26) {
            return "SegmentTick";
        }
        if (i == 9) {
            return "TextHandleMove";
        }
        if (i == 22) {
            return "ToggleOff";
        }
        if (i == 21) {
            return "ToggleOn";
        }
        return i == 1 ? "VirtualKey" : "Invalid";
    }
}
