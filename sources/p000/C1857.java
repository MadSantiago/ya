package p000;

/* JADX INFO: renamed from: ۥُٝؑؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1857 {

    /* JADX INFO: renamed from: ۥۣ */
    public final int f6196;

    /* JADX INFO: renamed from: ۥۣ */
    public static String m3708(int i) {
        if (i == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i == 1) {
            return "EmojiSupportMatch.None";
        }
        if (i == 2) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1857) {
            return this.f6196 == ((C1857) obj).f6196;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6196);
    }

    public final String toString() {
        return m3708(this.f6196);
    }
}
