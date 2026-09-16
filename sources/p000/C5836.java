package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import org.luckypray.dexkit.util.NativeReflect;

/* JADX INFO: renamed from: ۦۧؖۜۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5836 {

    /* JADX INFO: renamed from: ۥؗ */
    public final ArrayList f19214;

    /* JADX INFO: renamed from: ۥُ */
    public final C2432 f19215 = new C2432(new C0101(13, this));

    /* JADX INFO: renamed from: ۥۗ */
    public final String f19216;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f19217;

    /* JADX INFO: renamed from: ۦؑ */
    public final String f19218;

    public C5836(String str) {
        int i;
        int iM1521 = 0;
        int iM1532 = AbstractC0684.m1532(str, "->", 0, false, 6);
        int iM1533 = AbstractC0684.m1532(str, "(", iM1532 + 1, false, 4);
        int i2 = iM1533 + 1;
        int iM1534 = AbstractC0684.m1532(str, ")", i2, false, 4);
        if (iM1532 == -1 || iM1533 == -1 || iM1534 == -1) {
            throw new IllegalAccessError("not method descriptor: ".concat(str));
        }
        this.f19217 = AbstractC1650.m3460(str.substring(0, iM1532));
        this.f19216 = str.substring(iM1532 + 2, iM1533);
        String strSubstring = str.substring(i2, iM1534);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            i = iM1521;
            while (true) {
                if (iM1521 >= strSubstring.length()) {
                    break loop0;
                }
                char cCharAt = strSubstring.charAt(iM1521);
                if (cCharAt == 'L') {
                    iM1521 = AbstractC0684.m1521(';', iM1521, 4, strSubstring);
                    break;
                } else if (cCharAt != '[') {
                    break;
                } else {
                    iM1521++;
                }
            }
            iM1521++;
            arrayList.add(AbstractC1650.m3460(strSubstring.substring(i, iM1521)));
        }
        if (i != iM1521) {
            C1078.m2276("Unknown signString: ".concat(strSubstring));
            throw null;
        }
        this.f19214 = arrayList;
        this.f19218 = AbstractC1650.m3460(str.substring(iM1534 + 1));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static Method m9641(C5836 c5836, ClassLoader classLoader) throws NoSuchMethodException {
        Object c4535;
        Object c4536;
        c5836.getClass();
        C2432 c2432 = c5836.f19215;
        C1489 c1489 = AbstractC0408.f1493;
        String str = c5836.f19216;
        if (AbstractC3831.m6874(str, "<clinit>") || AbstractC3831.m6874(str, "<init>")) {
            C5028.m8447(c5836, " not a method");
            return null;
        }
        Class clsM919 = AbstractC0408.m919(classLoader, c5836.f19217);
        Object objM918 = AbstractC0408.m918(classLoader, c5836.f19214);
        Throwable thM405 = AbstractC0183.m405(objM918);
        if (thM405 != null) {
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("Method " + c5836 + " not available: parameter type(s) missing");
            noSuchMethodException.initCause(thM405);
            throw noSuchMethodException;
        }
        Class[] clsArr = (Class[]) objM918;
        try {
            c4535 = AbstractC0408.m919(classLoader, c5836.f19218);
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        Throwable thM406 = AbstractC0183.m405(c4535);
        if (thM406 != null) {
            NoSuchMethodException noSuchMethodException2 = new NoSuchMethodException("Method " + c5836 + " not available: return type missing");
            noSuchMethodException2.initCause(thM406);
            throw noSuchMethodException2;
        }
        Class cls = (Class) c4535;
        for (Class superclass = clsM919; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                declaredMethod.setAccessible(true);
                c4536 = declaredMethod;
            } catch (Throwable th2) {
                c4536 = new C4535(th2);
            }
            boolean z = c4536 instanceof C4535;
            Object obj = c4536;
            if (z) {
                obj = null;
            }
            Method method = (Method) obj;
            if (method != null && AbstractC3831.m6874(method.getReturnType(), cls)) {
                return method;
            }
        }
        for (Class superclass2 = clsM919; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
            try {
                for (Method method2 : superclass2.getDeclaredMethods()) {
                    if (AbstractC3831.m6874(method2.getName(), str) && AbstractC3831.m6874((String) c2432.getValue(), AbstractC1650.m3463(method2))) {
                        method2.setAccessible(true);
                        return method2;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        Member reflectedMethod = NativeReflect.getReflectedMethod(clsM919, str, (String) c2432.getValue(), null);
        if (reflectedMethod != null) {
            Method method3 = (Method) reflectedMethod;
            method3.setAccessible(true);
            return method3;
        }
        throw new NoSuchMethodException("Method " + c5836 + " not found");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5836)) {
            return false;
        }
        C5836 c5836 = (C5836) obj;
        return AbstractC3831.m6874(this.f19217, c5836.f19217) && AbstractC3831.m6874(this.f19216, c5836.f19216) && AbstractC3831.m6874(this.f19214, c5836.f19214) && AbstractC3831.m6874(this.f19218, c5836.f19218);
    }

    public final int hashCode() {
        return this.f19218.hashCode() + (this.f19214.hashCode() * 31) + (this.f19216.hashCode() * 31) + (this.f19217.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC1650.m3461(this.f19217) + "->" + this.f19216 + ((String) this.f19215.getValue());
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final Constructor m9642(ClassLoader classLoader) throws NoSuchMethodException {
        Object c4535;
        C2432 c2432 = this.f19215;
        C1489 c1489 = AbstractC0408.f1493;
        String str = this.f19216;
        if (!AbstractC3831.m6874(str, "<init>")) {
            C5028.m8447(this, " not a constructor");
            return null;
        }
        Class clsM919 = AbstractC0408.m919(classLoader, this.f19217);
        Object objM918 = AbstractC0408.m918(classLoader, this.f19214);
        Throwable thM405 = AbstractC0183.m405(objM918);
        if (thM405 != null) {
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("Constructor " + this + " not available: parameter type(s) missing");
            noSuchMethodException.initCause(thM405);
            throw noSuchMethodException;
        }
        Class[] clsArr = (Class[]) objM918;
        try {
            Constructor declaredConstructor = clsM919.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            declaredConstructor.setAccessible(true);
            c4535 = declaredConstructor;
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        Constructor constructor = (Constructor) (c4535 instanceof C4535 ? null : c4535);
        if (constructor != null) {
            return constructor;
        }
        try {
            for (Constructor<?> constructor2 : clsM919.getDeclaredConstructors()) {
                String str2 = (String) c2432.getValue();
                LinkedHashMap linkedHashMap = AbstractC1650.f5503;
                if (AbstractC3831.m6874(str2, "(" + AbstractC0246.m522(constructor2.getParameterTypes(), new C3018(16), 30) + ")V")) {
                    constructor2.setAccessible(true);
                    return constructor2;
                }
            }
        } catch (Throwable unused) {
        }
        Member reflectedMethod = NativeReflect.getReflectedMethod(clsM919, str, (String) c2432.getValue(), Boolean.FALSE);
        if (reflectedMethod != null) {
            Constructor constructor3 = (Constructor) reflectedMethod;
            constructor3.setAccessible(true);
            return constructor3;
        }
        throw new NoSuchMethodException("Constructor " + this + " not found");
    }
}
