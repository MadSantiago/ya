package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ۥّٞؖۙ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1961 extends AbstractC0949 {
    /* JADX INFO: renamed from: ۥؙ */
    public static List m3843(InterfaceC0806 interfaceC0806) {
        Iterator it = interfaceC0806.iterator();
        if (!it.hasNext()) {
            return C2340.f7777;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥؚ */
    public static String m3844(InterfaceC0806 interfaceC0806, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : interfaceC0806) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            AbstractC2765.m5146(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }
}
