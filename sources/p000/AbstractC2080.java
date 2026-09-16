package p000;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ۥۖؗ۟ٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2080 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final String f6862 = C1984.m3875("DiagnosticsWrkr");

    /* JADX INFO: renamed from: ۥۣ */
    public static final String m4024(C1076 c1076, C5301 c5301, C3551 c3551, List list) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4142 c4142 = (C4142) it.next();
            C1860 c1860M2155 = AbstractC0993.m2155(c4142);
            String str = c4142.f13787;
            C3193 c3193 = (C3193) AbstractC0487.m1075(c3551.f11784, true, false, new C2224(c1860M2155.f6201, 0, c1860M2155.f6202));
            Integer numValueOf = c3193 != null ? Integer.valueOf(c3193.f10727) : null;
            sb.append("\n" + str + "\t " + c4142.f13776 + "\t " + numValueOf + "\t " + c4142.f13785.name() + "\t " + AbstractC0973.m2056((List) AbstractC0487.m1075(c1076.f3763, true, false, new C3203(9, str)), ",", null, null, null, 62) + "\t " + AbstractC0973.m2056((List) AbstractC0487.m1075(c5301.f17460, true, false, new C3203(21, str)), ",", null, null, null, 62) + '\t');
        }
        return sb.toString();
    }
}
