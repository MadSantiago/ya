package p000;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: ۥۙؗ۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2239 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C4228 f7412;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f7413;

    public C2239(Set set, C4228 c4228) {
        this.f7413 = m4288(set);
        this.f7412 = c4228;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static String m4288(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C4550 c4550 = (C4550) it.next();
            sb.append(c4550.f15031);
            sb.append('/');
            sb.append(c4550.f15030);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
