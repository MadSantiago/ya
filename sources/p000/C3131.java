package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ۦؙؒؗٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3131 implements InterfaceC2311 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final Map f10542;

    /* JADX INFO: renamed from: ۥۣ */
    public final Class f10543;

    static {
        List listM4188 = AbstractC2164.m4188(InterfaceC4448.class, InterfaceC4745.class, InterfaceC5731.class, InterfaceC2609.class, InterfaceC3275.class, InterfaceC4237.class, InterfaceC2051.class, InterfaceC3210.class, InterfaceC2425.class, InterfaceC0799.class, InterfaceC3460.class, InterfaceC3321.class, InterfaceC0987.class, InterfaceC1016.class, InterfaceC4213.class, InterfaceC0116.class, InterfaceC4394.class, InterfaceC5252.class, InterfaceC5400.class, InterfaceC1617.class, InterfaceC4352.class, InterfaceC4751.class, InterfaceC1793.class);
        ArrayList arrayList = new ArrayList(AbstractC5573.m9402(listM4188, 10));
        int i = 0;
        for (Object obj : listM4188) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC2164.m4180();
                throw null;
            }
            arrayList.add(new C3869((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f10542 = AbstractC4554.m7913(arrayList);
    }

    public C3131(Class cls) {
        this.f10543 = cls;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3131) && AbstractC5378.m9041(this).equals(AbstractC5378.m9041((C3131) obj));
    }

    public final int hashCode() {
        return AbstractC5378.m9041(this).hashCode();
    }

    public final String toString() {
        return this.f10543.toString() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean m5774(Object obj) {
        Map map = f10542;
        Class clsM9041 = this.f10543;
        Integer num = (Integer) map.get(clsM9041);
        if (num != null) {
            return AbstractC3801.m6780(num.intValue(), obj);
        }
        if (clsM9041.isPrimitive()) {
            clsM9041 = AbstractC5378.m9041(AbstractC5041.m8557(clsM9041));
        }
        return clsM9041.isInstance(obj);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final String m5775() {
        String strM8612;
        Class cls = this.f10543;
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strM8613 = C5063.m8612(cls.getName());
                return strM8613 == null ? cls.getSimpleName() : strM8613;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strM8612 = C5063.m8612(componentType.getName())) != null) {
                strConcat = strM8612.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC0684.m1533(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iM1521 = AbstractC0684.m1521('$', 0, 6, simpleName);
            return iM1521 == -1 ? simpleName : simpleName.substring(iM1521 + 1, simpleName.length());
        }
        return AbstractC0684.m1533(simpleName, enclosingConstructor.getName() + '$');
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final String m5776() {
        String strM8649;
        Class cls = this.f10543;
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strM86410 = C5063.m8649(cls.getName());
            return strM86410 == null ? cls.getCanonicalName() : strM86410;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strM8649 = C5063.m8649(componentType.getName())) != null) {
            strConcat = strM8649.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }
}
