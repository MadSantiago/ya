package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦؘِؕؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3303 {

    /* JADX INFO: renamed from: ۥّ */
    public final ArrayList f11060;

    /* JADX INFO: renamed from: ۥۜ */
    public String f11062;

    /* JADX INFO: renamed from: ۥۣ */
    public String f11063;

    /* JADX INFO: renamed from: ۦؑ */
    public String f11064;

    /* JADX INFO: renamed from: ۦۙ */
    public ArrayList f11065;

    /* JADX INFO: renamed from: ۥۗ */
    public String f11061 = "";

    /* JADX INFO: renamed from: ۥؗ */
    public String f11058 = "";

    /* JADX INFO: renamed from: ۥُ */
    public int f11059 = -1;

    public C3303() {
        ArrayList arrayList = new ArrayList();
        this.f11060 = arrayList;
        arrayList.add("");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f11063;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.f11061.length() > 0 || this.f11058.length() > 0) {
            sb.append(this.f11061);
            if (this.f11058.length() > 0) {
                sb.append(':');
                sb.append(this.f11058);
            }
            sb.append('@');
        }
        String str2 = this.f11064;
        if (str2 != null) {
            if (AbstractC0684.m1528(str2, ':')) {
                sb.append('[');
                sb.append(this.f11064);
                sb.append(']');
            } else {
                sb.append(this.f11064);
            }
        }
        int i = -1;
        if (this.f11059 != -1 || this.f11063 != null) {
            int iM6063 = m6063();
            String str3 = this.f11063;
            if (str3 == null) {
                sb.append(':');
                sb.append(iM6063);
            } else {
                if (str3.equals("http")) {
                    i = 80;
                } else if (str3.equals("https")) {
                    i = 443;
                }
                if (iM6063 != i) {
                    sb.append(':');
                    sb.append(iM6063);
                }
            }
        }
        ArrayList arrayList = this.f11060;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append((String) arrayList.get(i2));
        }
        if (this.f11065 != null) {
            sb.append('?');
            C3223.m5939(this.f11065, sb);
        }
        if (this.f11062 != null) {
            sb.append('#');
            sb.append(this.f11062);
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX INFO: renamed from: ۥؗ */
    public final void m6062(C0774 c0774, String str) {
        int i;
        int i2;
        String str2;
        int i3;
        int iM7215;
        int i4;
        int i5;
        char cCharAt;
        String str3 = str;
        byte[] bArr = AbstractC4031.f13451;
        int length = str3.length();
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                i6 = length;
                break;
            }
            char cCharAt2 = str3.charAt(i6);
            if (cCharAt2 != '\t' && cCharAt2 != '\n' && cCharAt2 != '\f' && cCharAt2 != '\r' && cCharAt2 != ' ') {
                break;
            } else {
                i6++;
            }
        }
        int length2 = str3.length() - 1;
        if (i6 > length2) {
            i = i6;
            break;
        }
        while (true) {
            char cCharAt3 = str3.charAt(length2);
            if (cCharAt3 != '\t' && cCharAt3 != '\n' && cCharAt3 != '\f' && cCharAt3 != '\r' && cCharAt3 != ' ') {
                i = length2 + 1;
                break;
            } else {
                if (length2 == i6) {
                    i = i6;
                    break;
                }
                length2--;
            }
        }
        byte b = -1;
        if (i - i6 >= 2) {
            char cCharAt4 = str3.charAt(i6);
            if ((AbstractC3831.m6879(cCharAt4, 97) >= 0 && AbstractC3831.m6879(cCharAt4, 122) <= 0) || (AbstractC3831.m6879(cCharAt4, 65) >= 0 && AbstractC3831.m6879(cCharAt4, 90) <= 0)) {
                int i7 = i6 + 1;
                while (true) {
                    if (i7 < i) {
                        char cCharAt5 = str3.charAt(i7);
                        if (('a' <= cCharAt5 && cCharAt5 < '{') || (('A' <= cCharAt5 && cCharAt5 < '[') || (('0' <= cCharAt5 && cCharAt5 < ':') || cCharAt5 == '+' || cCharAt5 == '-' || cCharAt5 == '.'))) {
                            i7++;
                        } else if (cCharAt5 == ':') {
                            i2 = i7;
                            break;
                        }
                    }
                    i2 = -1;
                    break;
                }
            } else {
                i2 = -1;
                break;
            }
        } else {
            i2 = -1;
            break;
        }
        int i8 = 1;
        if (i2 != -1) {
            str2 = "https";
            if (str3.regionMatches(true, i6, "https:", 0, 6)) {
                this.f11063 = str2;
                i6 += 6;
                str3 = str;
            } else {
                str3 = str;
                if (!str3.regionMatches(true, i6, "http:", 0, 5)) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str3.substring(0, i2) + '\'');
                }
                this.f11063 = "http";
                i6 += 5;
            }
        } else {
            str2 = "https";
            if (c0774 == null) {
                C1078.m2272("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str3.length() > 6 ? AbstractC0684.m9761(6, str3).concat("...") : str3));
                return;
            }
            this.f11063 = c0774.f2800;
        }
        int i9 = i6;
        int i10 = 0;
        while (true) {
            i3 = i8;
            if (i9 >= i || !((cCharAt = str3.charAt(i9)) == '\\' || cCharAt == '/')) {
                break;
            }
            i10++;
            i9++;
            i8 = i3;
        }
        ArrayList arrayList = this.f11060;
        byte b2 = 35;
        if (i10 >= 2 || c0774 == null || !AbstractC3831.m6874(c0774.f2800, this.f11063)) {
            int i11 = i6 + i10;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                iM7215 = AbstractC4031.m7215(str3, i11, i, "@/\\?#");
                byte bCharAt = iM7215 != i ? str3.charAt(iM7215) : b;
                if (bCharAt == b || bCharAt == b2 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (i12 == 0) {
                        int iM7214 = AbstractC4031.m7214(str3, ':', i11, iM7215);
                        String strM5937 = C3223.m5937(i11, iM7214, 240, str3, " \"':;<=>@[]^`{}|/\\?#");
                        if (i13 != 0) {
                            strM5937 = AbstractC3761.m6621(new StringBuilder(this.f11061), "%40", strM5937);
                        }
                        this.f11061 = strM5937;
                        if (iM7214 != iM7215) {
                            this.f11058 = C3223.m5937(iM7214 + 1, iM7215, 240, str3, " \"':;<=>@[]^`{}|/\\?#");
                            i12 = i3;
                        }
                        i13 = i3;
                    } else {
                        this.f11058 += "%40" + C3223.m5937(i11, iM7215, 240, str3, " \"':;<=>@[]^`{}|/\\?#");
                    }
                    i11 = iM7215 + 1;
                    b = -1;
                    b2 = 35;
                }
            }
            int i14 = i11;
            while (true) {
                if (i14 >= iM7215) {
                    i14 = iM7215;
                    break;
                }
                char cCharAt6 = str3.charAt(i14);
                if (cCharAt6 == '[') {
                    do {
                        i14++;
                        if (i14 >= iM7215) {
                            break;
                        }
                    } while (str3.charAt(i14) != ']');
                } else if (cCharAt6 == ':') {
                    break;
                }
                i14++;
            }
            int i15 = i14 + 1;
            if (i15 < iM7215) {
                this.f11064 = AbstractC2774.m5186(C3223.m5940(str3, i11, i14, 4));
                try {
                    i5 = Integer.parseInt(C3223.m5937(i15, iM7215, 248, str3, ""));
                    if (i3 > i5 || i5 >= 65536) {
                        i5 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.f11059 = i5;
                if (i5 == -1) {
                    throw new IllegalArgumentException(("Invalid URL port: \"" + str3.substring(i15, iM7215) + '\"').toString());
                }
            } else {
                this.f11064 = AbstractC2774.m5186(C3223.m5940(str3, i11, i14, 4));
                String str4 = this.f11063;
                if (str4.equals("http")) {
                    i4 = 80;
                } else {
                    i4 = str4.equals(str2) ? 443 : -1;
                }
                this.f11059 = i4;
            }
            if (this.f11064 == null) {
                throw new IllegalArgumentException(("Invalid URL host: \"" + str3.substring(i11, i14) + '\"').toString());
            }
            i6 = iM7215;
        } else {
            this.f11061 = c0774.m1664();
            this.f11058 = c0774.m1667();
            this.f11064 = c0774.f2801;
            this.f11059 = c0774.f2796;
            arrayList.clear();
            arrayList.addAll(c0774.m1663());
            if (i6 == i || str3.charAt(i6) == '#') {
                String strM1668 = c0774.m1668();
                this.f11065 = strM1668 != null ? C3223.m5936(C3223.m5937(0, 0, 211, strM1668, " \"'<>#")) : null;
            }
        }
        int iM7216 = AbstractC4031.m7215(str3, i6, i, "?#");
        if (i6 != iM7216) {
            char cCharAt7 = str3.charAt(i6);
            if (cCharAt7 == '/' || cCharAt7 == '\\') {
                arrayList.clear();
                arrayList.add("");
                i6++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (i6 < iM7216) {
                int iM7217 = AbstractC4031.m7215(str3, i6, iM7216, "/\\");
                boolean z = iM7217 < iM7216;
                String strM5938 = C3223.m5937(i6, iM7217, 240, str3, " \"<>^`{}|/\\?#");
                if (!strM5938.equals(".") && !strM5938.equalsIgnoreCase("%2e")) {
                    if (!strM5938.equals("..") && !strM5938.equalsIgnoreCase("%2e.") && !strM5938.equalsIgnoreCase(".%2e") && !strM5938.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strM5938);
                        } else {
                            arrayList.add(strM5938);
                        }
                        if (z) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                i6 = z ? iM7217 + 1 : iM7217;
            }
        }
        if (iM7216 < i && str3.charAt(iM7216) == '?') {
            int iM7218 = AbstractC4031.m7214(str3, '#', iM7216, i);
            this.f11065 = C3223.m5936(C3223.m5937(iM7216 + 1, iM7218, 208, str3, " \"'<>#"));
            iM7216 = iM7218;
        }
        if (iM7216 >= i || str3.charAt(iM7216) != '#') {
            return;
        }
        this.f11062 = C3223.m5937(iM7216 + 1, i, 176, str3, "");
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final int m6063() {
        int i = this.f11059;
        if (i != -1) {
            return i;
        }
        String str = this.f11063;
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C0774 m6064() {
        ArrayList arrayList;
        String str = this.f11063;
        if (str == null) {
            C1078.m2276("scheme == null");
            return null;
        }
        String strM5940 = C3223.m5940(this.f11061, 0, 0, 7);
        String strM5941 = C3223.m5940(this.f11058, 0, 0, 7);
        String str2 = this.f11064;
        if (str2 == null) {
            C1078.m2276("host == null");
            return null;
        }
        int iM6063 = m6063();
        ArrayList arrayList2 = this.f11060;
        ArrayList arrayList3 = new ArrayList(AbstractC5573.m9402(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(C3223.m5940((String) it.next(), 0, 0, 7));
        }
        ArrayList<String> arrayList4 = this.f11065;
        if (arrayList4 != null) {
            arrayList = new ArrayList(AbstractC5573.m9402(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? C3223.m5940(str3, 0, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.f11062;
        return new C0774(str, strM5940, strM5941, str2, iM6063, arrayList3, arrayList, str4 != null ? C3223.m5940(str4, 0, 0, 7) : null, toString());
    }
}
