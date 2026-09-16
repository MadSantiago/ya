package p000;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: ۦ۠ؖ٘ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5408 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final HashSet f17859 = new HashSet(Arrays.asList(Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class));

    /* JADX INFO: renamed from: ۥۗ */
    public boolean f17860 = false;

    /* JADX INFO: renamed from: ۥۣ */
    public final StringBuilder f17861;

    public C5408(StringBuilder sb) {
        this.f17861 = sb;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static int m9089(int i, String str) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt < ' ' || cCharAt == '\"' || cCharAt == '\\') {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m9090(Object obj, String str) {
        boolean z = this.f17860;
        StringBuilder sb = this.f17861;
        if (z) {
            sb.append(' ');
        } else {
            if (sb.length() > 0) {
                sb.append((sb.length() > 1000 || sb.indexOf("\n") != -1) ? '\n' : ' ');
            }
            sb.append("[CONTEXT ");
            this.f17860 = true;
        }
        sb.append(str);
        sb.append('=');
        if (obj == null) {
            sb.append(true);
            return;
        }
        if (f17859.contains(obj.getClass())) {
            sb.append(obj);
            return;
        }
        sb.append('\"');
        String string = obj.toString();
        int i = 0;
        while (true) {
            int iM9089 = m9089(i, string);
            if (iM9089 == -1) {
                sb.append((CharSequence) string, i, string.length());
                sb.append('\"');
                return;
            }
            sb.append((CharSequence) string, i, iM9089);
            i = iM9089 + 1;
            char cCharAt = string.charAt(iM9089);
            if (cCharAt == '\t') {
                cCharAt = 't';
            } else if (cCharAt == '\n') {
                cCharAt = 'n';
            } else if (cCharAt == '\r') {
                cCharAt = 'r';
            } else if (cCharAt != '\"' && cCharAt != '\\') {
                sb.append((char) 65533);
            }
            sb.append("\\");
            sb.append(cCharAt);
        }
    }
}
