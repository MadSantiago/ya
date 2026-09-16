package p000;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: ۦؖؒۤۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3339 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final Map f11170;

    /* JADX INFO: renamed from: ۥۣ */
    public static final CopyOnWriteArraySet f11171 = new CopyOnWriteArraySet();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = C2561.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(C2561.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(AbstractC2678.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C2680.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f11170 = AbstractC4554.m7938(linkedHashMap);
    }
}
