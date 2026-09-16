package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ۦْٕؓؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3160 {

    /* JADX INFO: renamed from: ۥۣ */
    public final LinkedHashMap f10641 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۥۣ */
    public final void m5839() {
        LinkedHashMap linkedHashMap = this.f10641;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((AbstractC0941) it.next()).m1915();
        }
        linkedHashMap.clear();
    }
}
