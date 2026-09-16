package p000;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: renamed from: ۥؓؑۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0299 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final Method f1088;

    /* JADX INFO: renamed from: ۥۣ */
    public static final HashMap f1089 = new HashMap();

    static {
        new HashMap();
        try {
            f1088 = Class.forName("android.os.ServiceManager").getMethod("getService", String.class);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.w("SystemServiceHelper", Log.getStackTraceString(e));
        }
    }
}
