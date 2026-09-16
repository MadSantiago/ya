package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ۥٌٌۢؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2605 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final Map f8697 = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ۥۣ */
    public static void m4915(BinderC0972 binderC0972) {
        ArrayList arrayList = new ArrayList();
        Map map = f8697;
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == binderC0972) {
                arrayList.add((String) entry.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.remove((String) it.next());
        }
    }
}
