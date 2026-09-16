package p000;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: ۦَٝؑؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4720 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final Map f15582;

    static {
        Map map;
        try {
            Field declaredField = AbstractC3362.class.getDeclaredField("ۥۣ");
            declaredField.setAccessible(true);
            map = (Map) declaredField.get(null);
        } catch (Throwable th) {
            Map map2 = Collections.EMPTY_MAP;
            th.printStackTrace();
            map = map2;
        }
        f15582 = map;
    }
}
