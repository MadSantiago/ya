package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: ۥؙۙؑؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2198 {
    /* JADX INFO: renamed from: ۥۣ */
    public static String m4262(Object obj) {
        if (obj instanceof AbstractC2198) {
            return "VagueType";
        }
        Class<AbstractC2198> cls = AbstractC2198.class;
        if (obj instanceof Class) {
            Class<AbstractC2198> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(cls));
            return !obj.equals(clsM9037 != null ? clsM9037 : AbstractC2198.class) ? ((Class) obj).toString() : "VagueType";
        }
        if (obj instanceof C3131) {
            return !obj.equals(AbstractC5041.m8557(cls)) ? obj.toString() : "VagueType";
        }
        if (!(obj instanceof Collection)) {
            return obj.toString();
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(AbstractC5573.m9402(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            arrayList.add(next != null ? m4262(next) : null);
        }
        return arrayList.toString();
    }
}
