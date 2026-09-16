package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ۥؘّؑؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1181 implements AutoCloseable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final C1414 f4068;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f4069;

    public C1181(String str, C1414 c1414) {
        this.f4069 = str;
        this.f4068 = c1414;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C1489 c1489 = (C1489) this.f4068.f4869;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c1489.f5058;
        C2354 c2354 = (C2354) concurrentHashMap.get(this.f4069);
        if (c2354 != null) {
            AbstractC4766[] abstractC4766Arr = (AbstractC4766[]) ((ConcurrentHashMap) ((C2808) ((C1414) c1489.f5059).f4867).f9376).values().toArray(new AbstractC4766[0]);
            ArrayList arrayList = new ArrayList();
            for (AbstractC4766 abstractC4766 : abstractC4766Arr) {
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw AbstractC5078.m8675(it);
            }
            concurrentHashMap.remove(c2354.f7804);
        }
    }
}
