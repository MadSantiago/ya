package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ۥۖؔۢ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2067 {

    /* JADX INFO: renamed from: ۥُ */
    public boolean f6812;

    /* JADX INFO: renamed from: ۥۣ */
    public final C4992 f6814;

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f6815;

    /* JADX INFO: renamed from: ۥّ */
    public static final Set f6808 = Collections.unmodifiableSet(new HashSet(Arrays.asList("a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "i", "img", "input", "kbd", "label", "map", "object", "q", "samp", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt", "var")));

    /* JADX INFO: renamed from: ۦۙ */
    public static final Set f6810 = Collections.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));

    /* JADX INFO: renamed from: ۥۜ */
    public static final Set f6809 = Collections.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", "p", "pre", "section", "table", "tfoot", "ul", "video")));

    /* JADX INFO: renamed from: ۥۗ */
    public final ArrayList f6813 = new ArrayList(0);

    /* JADX INFO: renamed from: ۥؗ */
    public C0446 f6811 = new C0446("", 0, Collections.EMPTY_MAP, null);

    public C2067(C4992 c4992, C4452 c4452) {
        this.f6814 = c4992;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static Map m4012(C5891 c5891) {
        C3108 c3108 = c5891.f14621;
        int i = c3108.f10423;
        if (i <= 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(i);
        int i2 = 0;
        while (true) {
            if (!(i2 < c3108.f10423)) {
                return Collections.unmodifiableMap(map);
            }
            String str = c3108.f10421[i2];
            String str2 = c3108.f10422[i2];
            if (str == null) {
                str = "";
            }
            C0212 c0212 = new C0212();
            if (str2 == null) {
                C1078.m2272("Object must not be null");
                return null;
            }
            c0212.f799 = str2.trim();
            if (str2.length() == 0) {
                C1078.m2272("String must not be empty");
                return null;
            }
            c0212.f798 = str;
            c0212.f797 = c3108;
            i2++;
            map.put(c0212.f799.toLowerCase(Locale.US), c0212.f798);
        }
    }
}
