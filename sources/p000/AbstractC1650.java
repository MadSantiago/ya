package p000;

import java.lang.reflect.Method;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ۥٙؔؖؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1650 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final LinkedHashMap f5502;

    /* JADX INFO: renamed from: ۥۣ */
    public static final LinkedHashMap f5503;

    static {
        C3869[] c3869Arr = {new C3869("boolean", "Z"), new C3869("byte", "B"), new C3869("char", "C"), new C3869("short", "S"), new C3869("int", "I"), new C3869("float", "F"), new C3869("long", "J"), new C3869("double", "D"), new C3869("void", "V")};
        int iM7911 = AbstractC4554.m7911(9);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM7911);
        AbstractC4554.m7936(linkedHashMap, c3869Arr);
        f5503 = linkedHashMap;
        C3869[] c3869Arr2 = {new C3869("Z", "boolean"), new C3869("B", "byte"), new C3869("C", "char"), new C3869("S", "short"), new C3869("I", "int"), new C3869("F", "float"), new C3869("J", "long"), new C3869("D", "double"), new C3869("V", "void")};
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM7911);
        AbstractC4554.m7936(linkedHashMap2, c3869Arr2);
        f5502 = linkedHashMap2;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final String m3460(String str) {
        if (str.charAt(0) == '[') {
            return m3460(str.substring(1)).concat("[]");
        }
        if (str.length() == 1) {
            String str2 = (String) f5502.get(str);
            if (str2 != null) {
                return str2;
            }
            C1078.m2272("Unknown primitive typeSign: ".concat(str));
            return null;
        }
        if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
            return str.substring(1, str.length() - 1).replace('/', '.');
        }
        C1078.m2276("Unknown class sign: ".concat(str));
        return null;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final String m3461(String str) {
        if (str.endsWith("[]")) {
            return "[".concat(m3461(str.substring(0, str.length() - 2)));
        }
        String str2 = (String) f5503.get(str);
        return str2 == null ? AbstractC3761.m6629("L", str.replace('.', '/'), ";") : str2;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final String m3462(Class cls) {
        if (cls.isArray()) {
            return m3462(cls.getComponentType()) + "[]";
        }
        if (!cls.isPrimitive()) {
            return cls.getName();
        }
        if (cls.equals(Boolean.TYPE)) {
            return "boolean";
        }
        if (cls.equals(Byte.TYPE)) {
            return "byte";
        }
        if (cls.equals(Character.TYPE)) {
            return "char";
        }
        if (cls.equals(Short.TYPE)) {
            return "short";
        }
        if (cls.equals(Integer.TYPE)) {
            return "int";
        }
        if (cls.equals(Float.TYPE)) {
            return "float";
        }
        if (cls.equals(Long.TYPE)) {
            return "long";
        }
        if (cls.equals(Double.TYPE)) {
            return "double";
        }
        if (cls.equals(Void.TYPE)) {
            return "void";
        }
        C0178.m390(cls, "Unknown primitive type: ");
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final String m3463(Method method) {
        return "(" + AbstractC0246.m522(method.getParameterTypes(), new C3018(15), 30) + ")" + m3464(method.getReturnType());
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final String m3464(Class cls) {
        if (!cls.isPrimitive()) {
            return cls.isArray() ? "[".concat(m3464(cls.getComponentType())) : AbstractC3761.m6629("L", cls.getName().replace('.', '/'), ";");
        }
        if (cls.equals(Boolean.TYPE)) {
            return "Z";
        }
        if (cls.equals(Byte.TYPE)) {
            return "B";
        }
        if (cls.equals(Character.TYPE)) {
            return "C";
        }
        if (cls.equals(Short.TYPE)) {
            return "S";
        }
        if (cls.equals(Integer.TYPE)) {
            return "I";
        }
        if (cls.equals(Float.TYPE)) {
            return "F";
        }
        if (cls.equals(Long.TYPE)) {
            return "J";
        }
        if (cls.equals(Double.TYPE)) {
            return "D";
        }
        if (cls.equals(Void.TYPE)) {
            return "V";
        }
        C0178.m390(cls, "Unknown primitive type: ");
        return null;
    }
}
