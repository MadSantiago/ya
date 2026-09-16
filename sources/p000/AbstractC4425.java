package p000;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ۦ٘ؔؔۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4425 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final List f14599 = AbstractC2164.m4188(Application.class, C1106.class);

    /* JADX INFO: renamed from: ۥۗ */
    public static final List f14598 = Collections.singletonList(C1106.class);

    /* JADX INFO: renamed from: ۥۗ */
    public static final AbstractC0941 m7720(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (AbstractC0941) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            C0178.m394("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final Constructor m7721(Class cls, List list) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            List listM509 = AbstractC0246.m509(constructor.getParameterTypes());
            if (list.equals(listM509)) {
                return constructor;
            }
            if (list.size() == listM509.size() && listM509.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }
}
