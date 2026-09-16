package p000;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: ۥٌؔؔۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0892 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C0892 f3234 = new C0892();

    /* JADX INFO: renamed from: ۥۣ */
    public final HashMap f3236 = new HashMap();

    /* JADX INFO: renamed from: ۥۗ */
    public final HashMap f3235 = new HashMap();

    /* JADX INFO: renamed from: ۥۗ */
    public static void m1883(HashMap map, C3539 c3539, EnumC1924 enumC1924, Class cls) {
        EnumC1924 enumC1925 = (EnumC1924) map.get(c3539);
        if (enumC1925 == null || enumC1924 == enumC1925) {
            if (enumC1925 == null) {
                map.put(c3539, enumC1924);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c3539.f11744.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC1925 + ", new value " + enumC1924);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C2966 m1884(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f3236;
        if (superclass != null) {
            C2966 c2966M1884 = (C2966) map2.get(superclass);
            if (c2966M1884 == null) {
                c2966M1884 = m1884(superclass, null);
            }
            map.putAll(c2966M1884.f9949);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C2966 c2966M1885 = (C2966) map2.get(cls2);
            if (c2966M1885 == null) {
                c2966M1885 = m1884(cls2, null);
            }
            for (Map.Entry entry : c2966M1885.f9949.entrySet()) {
                m1883(map, (C3539) entry.getKey(), (EnumC1924) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC3778 interfaceC3778 = (InterfaceC3778) method.getAnnotation(InterfaceC3778.class);
            if (interfaceC3778 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC4507.class.isAssignableFrom(parameterTypes[0])) {
                        C1078.m2272("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                EnumC1924 enumC1924Value = interfaceC3778.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC1924.class.isAssignableFrom(parameterTypes[1])) {
                        C1078.m2272("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (enumC1924Value != EnumC1924.ON_ANY) {
                        C1078.m2272("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    C1078.m2272("cannot have more than 2 params");
                    return null;
                }
                m1883(map, new C3539(method, i), enumC1924Value, cls);
                z = true;
            }
        }
        C2966 c2966 = new C2966(map);
        map2.put(cls, c2966);
        this.f3235.put(cls, Boolean.valueOf(z));
        return c2966;
    }
}
