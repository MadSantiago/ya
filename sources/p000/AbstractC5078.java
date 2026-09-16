package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۦۙؑؒۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC5078 {
    /* JADX INFO: renamed from: ۥؗ */
    public static int m8668(C3564 c3564, int i, int i2) {
        return (c3564.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static String m8669(char c, String str, String str2) {
        return str + str2 + c;
    }

    /* JADX INFO: renamed from: ۥّ */
    public static String m8670(int i, String str) {
        return str + i;
    }

    /* JADX INFO: renamed from: ۥْ */
    public static /* synthetic */ String m8671(int i) {
        if (i == 1) {
            return "AUTOMATIC";
        }
        if (i != 2) {
            return i != 3 ? "null" : "WRITE_AHEAD_LOGGING";
        }
        return "TRUNCATE";
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static int m8672(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static String m8673(int i, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static int m8674(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static ClassCastException m8675(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static void m8676(int i, int i2, int i3, int i4, int i5) {
        AbstractC1631.m3422(i);
        AbstractC1631.m3422(i2);
        AbstractC1631.m3422(i3);
        AbstractC1631.m3422(i4);
        AbstractC1631.m3422(i5);
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static void m8677(long j, StringBuilder sb, String str) {
        sb.append((Object) C1327.m2827(j));
        sb.append(str);
    }

    /* JADX INFO: renamed from: ۦِ */
    public static String m8678(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static String m8679(String str, int i, int i2, String str2) {
        return str + i + str2 + i2;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static StringBuilder m8680(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static String m8681(int i, String str, String str2) {
        return str + i + str2;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static /* synthetic */ String m8682(int i) {
        if (i == 1) {
            return "Measuring";
        }
        if (i == 2) {
            return "LookaheadMeasuring";
        }
        if (i == 3) {
            return "LayingOut";
        }
        if (i != 4) {
            return i != 5 ? "null" : "Idle";
        }
        return "LookaheadLayingOut";
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static /* synthetic */ String m8683(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "Rtl";
        }
        return "Ltr";
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static /* synthetic */ String m8684(int i) {
        switch (i) {
            case 1:
                return "NOT_REQUIRED";
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return "CONNECTED";
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return "UNMETERED";
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return "NOT_ROAMING";
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return "METERED";
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }
}
