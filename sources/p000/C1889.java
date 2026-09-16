package p000;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ۥؙٝؕۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1889 extends C3247 {
    @Override // p000.C3247
    /* JADX INFO: renamed from: ۥؙ */
    public final Method mo3742(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p000.C3247
    /* JADX INFO: renamed from: ۦؒ */
    public final Typeface mo3743(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f10903, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f10905.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            C5028.m8450(e);
            return null;
        }
    }
}
