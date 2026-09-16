package p000;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۥؗؖۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0621 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final Pattern f2310 = Pattern.compile("(\\w+).*");

    /* JADX INFO: renamed from: ۥۣ */
    public static String m1387(C4645 c4645) {
        if (c4645.isEmpty()) {
            return null;
        }
        C5536 c5536 = new C5536(1, "+");
        C1868 c1868ListIterator = c4645.listIterator(0);
        StringBuilder sb = new StringBuilder();
        c5536.m9212(sb, c1868ListIterator);
        return "transform=".concat(sb.toString());
    }
}
