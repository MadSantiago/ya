package p000;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۥؚؓۘۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0774 {

    /* JADX INFO: renamed from: ۦۗ */
    public static final char[] f2794 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: ۥؗ */
    public final String f2795;

    /* JADX INFO: renamed from: ۥُ */
    public final int f2796;

    /* JADX INFO: renamed from: ۥّ */
    public final ArrayList f2797;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f2798;

    /* JADX INFO: renamed from: ۥۜ */
    public final String f2799;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f2800;

    /* JADX INFO: renamed from: ۦؑ */
    public final String f2801;

    /* JADX INFO: renamed from: ۦِ */
    public final boolean f2802;

    /* JADX INFO: renamed from: ۦٛ */
    public final String f2803;

    /* JADX INFO: renamed from: ۦۙ */
    public final List f2804;

    public C0774(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f2800 = str;
        this.f2798 = str2;
        this.f2795 = str3;
        this.f2801 = str4;
        this.f2796 = i;
        this.f2797 = arrayList;
        this.f2804 = arrayList2;
        this.f2799 = str5;
        this.f2803 = str6;
        this.f2802 = str.equals("https");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0774) && ((C0774) obj).f2803.equals(this.f2803);
    }

    public final int hashCode() {
        return this.f2803.hashCode();
    }

    public final String toString() {
        return this.f2803;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final ArrayList m1663() {
        int length = this.f2800.length() + 3;
        String str = this.f2803;
        int iM1521 = AbstractC0684.m1521('/', length, 4, str);
        int iM7215 = AbstractC4031.m7215(str, iM1521, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iM1521 < iM7215) {
            int i = iM1521 + 1;
            int iM7214 = AbstractC4031.m7214(str, '/', i, iM7215);
            arrayList.add(str.substring(i, iM7214));
            iM1521 = iM7214;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final String m1664() {
        if (this.f2798.length() == 0) {
            return "";
        }
        int length = this.f2800.length() + 3;
        String str = this.f2803;
        return str.substring(length, AbstractC4031.m7215(str, length, str.length(), ":@"));
    }

    /* JADX INFO: renamed from: ۥّ */
    public final String m1665() {
        C3303 c3303;
        try {
            c3303 = new C3303();
            c3303.m6062(this, "/...");
        } catch (IllegalArgumentException unused) {
            c3303 = null;
        }
        c3303.getClass();
        c3303.f11061 = C3223.m5937(0, 0, 251, "", " \"':;<=>@[]^`{}|/\\?#");
        c3303.f11058 = C3223.m5937(0, 0, 251, "", " \"':;<=>@[]^`{}|/\\?#");
        return c3303.m6064().f2803;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final String m1666() {
        int length = this.f2800.length() + 3;
        String str = this.f2803;
        int iM1521 = AbstractC0684.m1521('/', length, 4, str);
        return str.substring(iM1521, AbstractC4031.m7215(str, iM1521, str.length(), "?#"));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final String m1667() {
        if (this.f2795.length() == 0) {
            return "";
        }
        int length = this.f2800.length() + 3;
        String str = this.f2803;
        return str.substring(AbstractC0684.m1521(':', length, 4, str) + 1, AbstractC0684.m1521('@', 0, 6, str));
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final String m1668() {
        if (this.f2804 == null) {
            return null;
        }
        String str = this.f2803;
        int iM1521 = AbstractC0684.m1521('?', 0, 6, str) + 1;
        return str.substring(iM1521, AbstractC4031.m7214(str, '#', iM1521, str.length()));
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final URI m1669() {
        String strSubstring;
        C3303 c3303 = new C3303();
        String str = this.f2800;
        c3303.f11063 = str;
        c3303.f11061 = m1664();
        c3303.f11058 = m1667();
        c3303.f11064 = this.f2801;
        int i = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i2 = this.f2796;
        c3303.f11059 = i2 != i ? i2 : -1;
        ArrayList arrayList = c3303.f11060;
        arrayList.clear();
        arrayList.addAll(m1663());
        String strM1668 = m1668();
        c3303.f11065 = strM1668 != null ? C3223.m5936(C3223.m5937(0, 0, 211, strM1668, " \"'<>#")) : null;
        if (this.f2799 == null) {
            strSubstring = null;
        } else {
            String str2 = this.f2803;
            strSubstring = str2.substring(AbstractC0684.m1521('#', 0, 6, str2) + 1);
        }
        c3303.f11062 = strSubstring;
        String str3 = c3303.f11064;
        c3303.f11064 = str3 != null ? Pattern.compile("[\"<>^`{|}]").matcher(str3).replaceAll("") : null;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, C3223.m5937(0, 0, 227, (String) arrayList.get(i3), "[]"));
        }
        ArrayList arrayList2 = c3303.f11065;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str4 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str4 != null ? C3223.m5937(0, 0, 195, str4, "\\^`{|}") : null);
            }
        }
        String str5 = c3303.f11062;
        c3303.f11062 = str5 != null ? C3223.m5937(0, 0, 163, str5, " \"#<>\\^`{|}") : null;
        String string = c3303.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                return URI.create(Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").matcher(string).replaceAll(""));
            } catch (Exception unused) {
                C5028.m8450(e);
                return null;
            }
        }
    }
}
