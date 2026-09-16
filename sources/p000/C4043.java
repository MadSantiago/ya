package p000;

/* JADX INFO: renamed from: ۦّٜٖؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4043 {

    /* JADX INFO: renamed from: ۥۣ */
    public final int f13484;

    public final boolean equals(Object obj) {
        if (obj instanceof C4043) {
            return this.f13484 == ((C4043) obj).f13484;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13484);
    }

    public final String toString() {
        int i = this.f13484;
        if (i == 1) {
            return "Linearity.Linear";
        }
        if (i == 2) {
            return "Linearity.FontHinting";
        }
        return i == 3 ? "Linearity.None" : "Invalid";
    }
}
