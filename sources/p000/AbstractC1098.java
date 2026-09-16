package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ۥِؓۛ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1098 extends AbstractC2765 {
    /* JADX INFO: renamed from: ۥٗ */
    public static String m2323(String str) {
        int length;
        Comparable comparable;
        String strSubstring;
        List listM1523 = AbstractC0684.m1523(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM1523) {
            if (!AbstractC0684.m1534((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5573.m9402(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!AbstractC2133.m4120(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listM1523.size();
        int iM4181 = AbstractC2164.m4181(listM1523);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM1523) {
            int i = length + 1;
            if (length < 0) {
                AbstractC2164.m4180();
                throw null;
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == iM4181) && AbstractC0684.m1534(str3)) {
                strSubstring = null;
            } else {
                if (iIntValue < 0) {
                    C1078.m2273(AbstractC5078.m8681(iIntValue, "Requested character count ", " is less than zero."));
                    return null;
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
            }
            if (strSubstring != null) {
                arrayList3.add(strSubstring);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        AbstractC0973.m2048(arrayList3, sb, "\n", null, 124);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥۚ */
    public static String m2324(String str) {
        return AbstractC1961.m3844(new C5630(new C3527(3, str), new C3203(7, "    "), 1), "\n");
    }

    /* JADX INFO: renamed from: ۦٔ */
    public static String m2325(String str) {
        if (AbstractC0684.m1534("|")) {
            C1078.m2272("marginPrefix must be non-blank string.");
            return null;
        }
        List listM1523 = AbstractC0684.m1523(str);
        int length = str.length();
        listM1523.size();
        int iM4181 = AbstractC2164.m4181(listM1523);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listM1523) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC2164.m4180();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == iM4181) && AbstractC0684.m1534(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!AbstractC2133.m4120(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 != -1 && str2.startsWith("|", i3)) ? str2.substring("|".length() + i3) : null;
                if (strSubstring != null) {
                    str2 = strSubstring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        AbstractC0973.m2048(arrayList, sb, "\n", null, 124);
        return sb.toString();
    }
}
