package p000;

/* JADX INFO: renamed from: ۥٌۡۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2591 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final int f8653 = 66305;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f8654;

    /* JADX INFO: renamed from: ۥۣ */
    public static String m4891(int i) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int i2 = i & 255;
        String str3 = "Invalid";
        if (i2 == 1) {
            str = "Strategy.Simple";
        } else if (i2 == 2) {
            str = "Strategy.HighQuality";
        } else if (i2 == 3) {
            str = "Strategy.Balanced";
        } else {
            str = i2 == 0 ? "Strategy.Unspecified" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", strictness=");
        int i3 = (i >> 8) & 255;
        if (i3 == 1) {
            str2 = "Strictness.None";
        } else if (i3 == 2) {
            str2 = "Strictness.Loose";
        } else if (i3 == 3) {
            str2 = "Strictness.Normal";
        } else if (i3 == 4) {
            str2 = "Strictness.Strict";
        } else {
            str2 = i3 == 0 ? "Strictness.Unspecified" : "Invalid";
        }
        sb.append((Object) str2);
        sb.append(", wordBreak=");
        int i4 = (i >> 16) & 255;
        if (i4 == 1) {
            str3 = "WordBreak.None";
        } else if (i4 == 2) {
            str3 = "WordBreak.Phrase";
        } else if (i4 == 0) {
            str3 = "WordBreak.Unspecified";
        }
        sb.append((Object) str3);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2591) {
            return this.f8654 == ((C2591) obj).f8654;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8654);
    }

    public final String toString() {
        return m4891(this.f8654);
    }
}
