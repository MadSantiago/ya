package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: ۥ٘ؒؓۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1555 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final HashMap f5243 = new HashMap();

    /* JADX INFO: renamed from: ۥۗ */
    public static final HashMap f5242 = new HashMap();

    /* JADX WARN: Code duplicated, block: B:58:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:70:0x0113  */
    /* JADX INFO: renamed from: ۥۗ */
    public static int m3310(Class cls) {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        HashMap map = f5243;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                if (name.length() != 0) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String strConcat = AbstractC4981.m8362(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e) {
                C5028.m8450(e);
                return 0;
            }
            HashMap map2 = f5242;
            if (declaredConstructor != null) {
                map2.put(cls, Collections.singletonList(declaredConstructor));
            } else {
                C0892 c0892 = C0892.f3234;
                HashMap map3 = c0892.f3235;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((InterfaceC3778) declaredMethods[i2].getAnnotation(InterfaceC3778.class)) != null) {
                                c0892.m1884(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i2++;
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass == null || !InterfaceC0335.class.isAssignableFrom(superclass)) {
                        for (Class<?> cls2 : cls.getInterfaces()) {
                            if (cls2 == null && InterfaceC0335.class.isAssignableFrom(cls2)) {
                                if (m3310(cls2) != 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.addAll((Collection) map2.get(cls2));
                                }
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    } else if (m3310(superclass) != 1) {
                        arrayList = new ArrayList((Collection) map2.get(superclass));
                        while (i < r8) {
                            if (cls2 == null) {
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                }
            }
            i = 2;
        }
        map.put(cls, Integer.valueOf(i));
        return i;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m3311(Constructor constructor, InterfaceC0335 interfaceC0335) {
        try {
            if (constructor.newInstance(interfaceC0335) == null) {
            } else {
                throw new ClassCastException();
            }
        } catch (IllegalAccessException e) {
            C5028.m8450(e);
        } catch (InstantiationException e2) {
            C5028.m8450(e2);
        } catch (InvocationTargetException e3) {
            C5028.m8450(e3);
        }
    }
}
