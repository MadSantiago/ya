package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ۥۨؓۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2919 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final ConcurrentHashMap f9789 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ۥۣ */
    public static final String m5505(C3131 c3131) {
        ConcurrentHashMap concurrentHashMap = f9789;
        String str = (String) concurrentHashMap.get(c3131);
        if (str != null) {
            return str;
        }
        String name = c3131.f10543.getName();
        concurrentHashMap.put(c3131, name);
        return name;
    }
}
