package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.IBinder;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ۦٚؗؐۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4574 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final Method f15081;

    /* JADX INFO: renamed from: ۥۗ */
    public static final Method f15082;

    /* JADX INFO: renamed from: ۥۣ */
    public static final Method f15083;

    static {
        try {
            Class<?> cls = Class.forName("android.os.ServiceManager");
            int i = Build.VERSION.SDK_INT;
            Class<?> cls2 = Integer.TYPE;
            if (i >= 28) {
                try {
                    f15083 = cls.getDeclaredMethod("addService", String.class, IBinder.class, Boolean.TYPE, cls2);
                } catch (NoSuchMethodException unused) {
                }
            }
            if (f15083 == null) {
                f15083 = cls.getDeclaredMethod("addService", String.class, IBinder.class);
            }
            Method declaredMethod = ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class);
            f15082 = declaredMethod;
            declaredMethod.setAccessible(true);
            f15081 = Class.forName("android.ddm.DdmHandleAppName").getDeclaredMethod("setAppName", String.class, cls2);
        } catch (ReflectiveOperationException e) {
            AbstractC2774.m5205("IPC", e);
        }
    }
}
