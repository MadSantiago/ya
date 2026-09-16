package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ۥٌؘؖۖ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0684 extends AbstractC4981 {
    /* JADX INFO: renamed from: ۥ */
    public static boolean m1517(CharSequence charSequence, String str) {
        return charSequence instanceof String ? ((String) charSequence).endsWith(str) : m1520(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    /* JADX INFO: renamed from: ۥؐ */
    public static String m1518(String str, String str2) {
        return str.startsWith(str2) ? str.substring(str2.length()) : str;
    }

    /* JADX INFO: renamed from: ۥؐۦً, reason: contains not printable characters */
    public static CharSequence m9760(String str) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM4120 = AbstractC2133.m4120(str.charAt(!z ? i : length));
            if (z) {
                if (!zM4120) {
                    break;
                }
                length--;
            } else if (zM4120) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }

    /* JADX INFO: renamed from: ۥؑ */
    public static int m1519(int i, String str, String str2) {
        return str.lastIndexOf(str2, (i & 2) != 0 ? m1529(str) : 0);
    }

    /* JADX INFO: renamed from: ۥؒ */
    public static final boolean m1520(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!AbstractC2133.m4157(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥؘ */
    public static int m1521(char c, int i, int i2, CharSequence charSequence) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return !(charSequence instanceof String) ? m1522(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    /* JADX INFO: renamed from: ۥٌٍۣؕ, reason: contains not printable characters */
    public static String m9761(int i, String str) {
        if (i < 0) {
            C1078.m2273(AbstractC5078.m8681(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    /* JADX INFO: renamed from: ۥٔ */
    public static final int m1522(CharSequence charSequence, char[] cArr, int i, boolean z) {
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                C0178.m384("Array is empty.");
                return 0;
            }
            if (length == 1) {
                return ((String) charSequence).indexOf(cArr[0], i);
            }
            C1078.m2272("Array has more than one element.");
            return 0;
        }
        if (i < 0) {
            i = 0;
        }
        int iM1529 = m1529(charSequence);
        if (i > iM1529) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (AbstractC2133.m4157(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == iM1529) {
                return -1;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۥٜ */
    public static List m1523(CharSequence charSequence) {
        C5019 c5019 = new C5019(charSequence);
        if (!c5019.hasNext()) {
            return C2340.f7777;
        }
        Object next = c5019.next();
        if (!c5019.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (c5019.hasNext()) {
            arrayList.add(c5019.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥٟ */
    public static List m1524(CharSequence charSequence, String[] strArr) {
        int i = 0;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() > 0) {
                return m1530(charSequence, str);
            }
        }
        C2222 c2222 = new C2222(2, new C3306(charSequence, new C4164(23, Arrays.asList(strArr)), i));
        ArrayList arrayList = new ArrayList(AbstractC5573.m9402(c2222, 10));
        Iterator it = c2222.iterator();
        while (true) {
            C2960 c2960 = (C2960) it;
            if (!c2960.hasNext()) {
                return arrayList;
            }
            C3046 c3046 = (C3046) c2960.next();
            arrayList.add(charSequence.subSequence(c3046.f6006, c3046.f6005 + 1).toString());
        }
    }

    /* JADX INFO: renamed from: ۦؕ */
    public static StringBuilder m1525(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        if (i2 < i) {
            C0178.m391(i2, i, ") is less than start index (", "End index (");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    /* JADX INFO: renamed from: ۦً */
    public static final int m1526(CharSequence charSequence, String str, int i, boolean z) {
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        int i2 = i < 0 ? 0 : i;
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        C3046 c3046 = new C3046(i2, length, 1);
        boolean z2 = charSequence instanceof String;
        int i3 = c3046.f6004;
        int i4 = c3046.f6005;
        int i5 = c3046.f6006;
        if (z2) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                int i6 = i5;
                while (true) {
                    String str2 = (String) charSequence;
                    int length3 = str.length();
                    if (!z ? str.regionMatches(0, str2, i6, length3) : str.regionMatches(z, 0, str2, i6, length3)) {
                        return i6;
                    }
                    if (i6 != i4) {
                        i6 += i3;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            while (!m1520(str, 0, charSequence, i5, str.length(), z)) {
                if (i5 != i4) {
                    i5 += i3;
                }
            }
            return i5;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۦٍ */
    public static boolean m1527(CharSequence charSequence, String str, boolean z) {
        return m1532(charSequence, str, 0, z, 2) >= 0;
    }

    /* JADX INFO: renamed from: ۦْ */
    public static boolean m1528(CharSequence charSequence, char c) {
        return m1521(c, 0, 2, charSequence) >= 0;
    }

    /* JADX INFO: renamed from: ۦٓ */
    public static int m1529(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: ۦ٘ */
    public static final List m1530(CharSequence charSequence, String str) {
        int iM1526 = m1526(charSequence, str, 0, false);
        if (iM1526 == -1) {
            return Collections.singletonList(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iM1526).toString());
            length = str.length() + iM1526;
            iM1526 = m1526(charSequence, str, length, false);
        } while (iM1526 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX INFO: renamed from: ۦٙ */
    public static int m1531(char c, int i, int i2, CharSequence charSequence) {
        if ((i2 & 2) != 0) {
            i = m1529(charSequence);
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(cArr[0], i);
        }
        int iM1529 = m1529(charSequence);
        if (i > iM1529) {
            i = iM1529;
        }
        while (-1 < i) {
            if (AbstractC2133.m4157(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۦٜ */
    public static /* synthetic */ int m1532(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m1526(charSequence, str, i, z);
    }

    /* JADX INFO: renamed from: ۦۘ */
    public static String m1533(String str, String str2) {
        int iM1532 = m1532(str, str2, 0, false, 6);
        return iM1532 == -1 ? str : str.substring(str2.length() + iM1532, str.length());
    }

    /* JADX INFO: renamed from: ۦۡ */
    public static boolean m1534(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (!AbstractC2133.m4120(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۦًۢؖۡ, reason: contains not printable characters */
    public static String m9762(String str, char c) {
        int iM1531 = m1531(c, 0, 6, str);
        return iM1531 == -1 ? str : str.substring(0, iM1531);
    }

    /* JADX INFO: renamed from: ۦۥ */
    public static String m1535(char c, String str, String str2) {
        int iM1531 = m1531(c, 0, 6, str);
        return iM1531 == -1 ? str2 : str.substring(iM1531 + 1, str.length());
    }
}
