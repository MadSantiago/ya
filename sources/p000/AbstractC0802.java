package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ۥؚؗۧۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0802 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final AbstractC2266 f2868;

    static {
        Object c4535;
        try {
            Method method = InterfaceC3983.class.getClassLoader().loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof AbstractC2266) {
                        c4535 = (AbstractC2266) objInvoke;
                        break;
                    }
                } else if (!(annotations[i] instanceof InterfaceC5087)) {
                    i++;
                }
                c4535 = null;
                break;
            }
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        AbstractC2266 c4216 = (AbstractC2266) (c4535 instanceof C4535 ? null : c4535);
        if (c4216 == null) {
            c4216 = new C4216(1, new C0871(19));
        }
        f2868 = c4216;
    }
}
