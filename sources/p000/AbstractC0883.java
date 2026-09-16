package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۥٌؒۛؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0883 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final Pattern f3217;

    /* JADX INFO: renamed from: ۦؑ */
    public static final C4036 f3220;

    /* JADX INFO: renamed from: ۥۣ */
    public static final Pattern f3219 = Pattern.compile("[\\\\&]");

    /* JADX INFO: renamed from: ۥۗ */
    public static final Pattern f3218 = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        f3217 = Pattern.compile("[ \t\r\n]+");
        f3220 = new C4036(8);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static String m1877(String str) {
        if (!f3219.matcher(str).find()) {
            return str;
        }
        Matcher matcher = f3218.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 16);
        int iEnd = 0;
        do {
            sb.append((CharSequence) str, iEnd, matcher.start());
            String strGroup = matcher.group();
            f3220.getClass();
            if (strGroup.charAt(0) == '\\') {
                sb.append((CharSequence) strGroup, 1, strGroup.length());
            } else {
                sb.append(AbstractC3362.m6122(strGroup));
            }
            iEnd = matcher.end();
        } while (matcher.find());
        if (iEnd != str.length()) {
            sb.append((CharSequence) str, iEnd, str.length());
        }
        return sb.toString();
    }
}
