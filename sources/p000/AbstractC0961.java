package p000;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: ۥٍؘٟؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0961 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final Method f3404;

    /* JADX INFO: renamed from: ۥۣ */
    public static final Method f3405;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i];
            if (AbstractC3831.m6874(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (AbstractC3831.m6874(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i++;
        }
        f3405 = method2;
        for (Method method3 : methods) {
            if (AbstractC3831.m6874(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
        }
        f3404 = method;
    }
}
