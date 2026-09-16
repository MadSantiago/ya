package p000;

/* JADX INFO: renamed from: ۥؗؓؔٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0591 {

    /* JADX INFO: renamed from: ۥۣ */
    public final int f2198;

    /* JADX INFO: renamed from: ۥۣ */
    public static String m1301(int i) {
        if (i == 0) {
            return "Unspecified";
        }
        if (i == 1) {
            return "Text";
        }
        if (i == 2) {
            return "Ascii";
        }
        if (i == 3) {
            return "Number";
        }
        if (i == 4) {
            return "Phone";
        }
        if (i == 5) {
            return "Uri";
        }
        if (i == 6) {
            return "Email";
        }
        if (i == 7) {
            return "Password";
        }
        if (i == 8) {
            return "NumberPassword";
        }
        return i == 9 ? "Decimal" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0591) {
            return this.f2198 == ((C0591) obj).f2198;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2198);
    }

    public final String toString() {
        return m1301(this.f2198);
    }
}
