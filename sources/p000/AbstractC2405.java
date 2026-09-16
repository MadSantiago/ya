package p000;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ۥُۜؗ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2405 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final ConcurrentHashMap f8013 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ۥؗ */
    public static final Object m4527(Constructor constructor, Object[] objArr) {
        Object objNewInstance = constructor != null ? constructor.newInstance(Arrays.copyOf(objArr, objArr.length)) : null;
        if (objNewInstance == null) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            return objNewInstance;
        }
        String strM522 = AbstractC0246.m522(objArr, null, 63);
        if (AbstractC0684.m1534(strM522)) {
            strM522 = "(empty)";
        }
        throw new NoSuchMethodError("Could not find a suitable constructor for " + constructor + " with arguments: " + ((Object) strM522) + ".");
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final boolean m4528(ClassLoader classLoader, String str) {
        Object c4535;
        try {
            c4535 = classLoader.loadClass(str);
            if (c4535 == null) {
                c4535 = null;
            }
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        return ((Class) (c4535 instanceof C4535 ? null : c4535)) != null;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m4529(Class cls, Object[] objArr) {
        Constructor constructor;
        Object next;
        if (objArr.length != 0) {
            int length = objArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    C1078.m2270(cls, ".", "Not allowed to create an instance with all null arguments for ");
                    return;
                } else if (objArr[i] != null) {
                    break;
                } else {
                    i++;
                }
            }
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        int length2 = objArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            Object obj = objArr[i2];
            arrayList.add(obj != null ? new C2508(obj.getClass()) : C4116.f13720);
        }
        C3242 c3242 = new C3242(cls, arrayList);
        ConcurrentHashMap concurrentHashMap = f8013;
        Constructor constructor2 = (Constructor) concurrentHashMap.get(c3242);
        if (constructor2 != null) {
            m4527(constructor2, objArr);
            return;
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        int i3 = 7;
        C2448 c2448 = new C2448(new C5630(new C5630(declaredConstructors.length == 0 ? C4703.f15512 : new C3527(0, declaredConstructors), new C3018(i3), 0), new C0091(i3, objArr), 0));
        loop2: while (true) {
            constructor = null;
            if (!c2448.hasNext()) {
                next = null;
                break;
            }
            next = c2448.next();
            Class<?>[] parameterTypes = ((Constructor) next).getParameterTypes();
            int iMin = Math.min(parameterTypes.length, objArr.length);
            ArrayList arrayList2 = new ArrayList(iMin);
            for (int i4 = 0; i4 < iMin; i4++) {
                arrayList2.add(new C3869(parameterTypes[i4], objArr[i4]));
            }
            if (arrayList2.isEmpty()) {
                break;
            }
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break loop2;
                }
                C3869 c3869 = (C3869) it.next();
                Class cls2 = (Class) c3869.f12915;
                Object obj2 = c3869.f12914;
                if (obj2 != null || cls2.isPrimitive()) {
                    if (obj2 == null) {
                        break;
                    }
                    Class<?> cls3 = obj2.getClass();
                    if (AbstractC3831.m6874(cls2, Boolean.TYPE)) {
                        cls2 = Boolean.class;
                    } else if (AbstractC3831.m6874(cls2, Byte.TYPE)) {
                        cls2 = Byte.class;
                    } else if (AbstractC3831.m6874(cls2, Character.TYPE)) {
                        cls2 = Character.class;
                    } else if (AbstractC3831.m6874(cls2, Short.TYPE)) {
                        cls2 = Short.class;
                    } else if (AbstractC3831.m6874(cls2, Integer.TYPE)) {
                        cls2 = Integer.class;
                    } else if (AbstractC3831.m6874(cls2, Long.TYPE)) {
                        cls2 = Long.class;
                    } else if (AbstractC3831.m6874(cls2, Float.TYPE)) {
                        cls2 = Float.class;
                    } else if (AbstractC3831.m6874(cls2, Double.TYPE)) {
                        cls2 = Double.class;
                    } else if (AbstractC3831.m6874(cls2, Void.TYPE)) {
                        cls2 = Void.class;
                    }
                    if (!cls2.isAssignableFrom(cls3)) {
                        break;
                    }
                }
            }
        }
        Constructor constructor3 = (Constructor) next;
        if (constructor3 != null) {
            if (!AbstractC4266.m7562(constructor3)) {
                C2316.m4357(constructor3, "\" accessible. Please check if the constructor is accessible or if the security manager allows it.", "Failed to make the constructor \"");
                return;
            } else {
                concurrentHashMap.put(c3242, constructor3);
                constructor = constructor3;
            }
        }
        m4527(constructor, objArr);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final Class m4530(ClassLoader classLoader, String str) {
        if (classLoader == null) {
            classLoader = null;
        }
        Class<?> cls = classLoader != null ? Class.forName(str, false, classLoader) : Class.forName(str);
        if (cls != null) {
            return cls;
        }
        C5028.m8449(str, "JVM class not resolved: ");
        return null;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static Class m4531(String str, ClassLoader classLoader, int i) {
        Object c4535;
        if ((i & 1) != 0) {
            classLoader = null;
        }
        try {
            c4535 = m4530(classLoader, str);
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        return (Class) (c4535 instanceof C4535 ? null : c4535);
    }
}
