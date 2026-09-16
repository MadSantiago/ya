package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: ۥۣ٘ؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1566 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final char[] f5282;

    static {
        char[] cArr = new char[80];
        f5282 = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static void m3316(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f5282, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:67:0x0180  */
    /* JADX INFO: renamed from: ۥۗ */
    public static void m3317(AbstractC5212 abstractC5212, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC5212.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    m3318(sb, i, strSubstring.substring(0, strSubstring.length() - 4), AbstractC5212.m8821(method2, abstractC5212, new Object[0]));
                }
                i2 = i3;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m3318(sb, i, strSubstring.substring(0, strSubstring.length() - 3), AbstractC5212.m8821(method, abstractC5212, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM8821 = AbstractC5212.m8821(method4, abstractC5212, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) AbstractC5212.m8821(method5, abstractC5212, new Object[0])).booleanValue();
                    } else if (objM8821 instanceof Boolean) {
                        if (((Boolean) objM8821).booleanValue()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                    } else if (objM8821 instanceof Integer) {
                        if (((Integer) objM8821).intValue() == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (objM8821 instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) objM8821).floatValue()) == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (!(objM8821 instanceof Double)) {
                        if (objM8821 instanceof String) {
                            zEquals = objM8821.equals("");
                        } else if (objM8821 instanceof AbstractC4314) {
                            zEquals = objM8821.equals(AbstractC4314.f14260);
                        } else if (!(objM8821 instanceof AbstractC3127) ? !((objM8821 instanceof Enum) && ((Enum) objM8821).ordinal() == 0) : objM8821 != ((AbstractC5212) ((AbstractC5212) ((AbstractC3127) objM8821)).mo554(6))) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (Double.doubleToRawLongBits(((Double) objM8821).doubleValue()) == 0) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = true;
                    }
                    if (zBooleanValue) {
                        m3318(sb, i, strSubstring, objM8821);
                    }
                }
            }
            i2 = i3;
        }
        C3192 c3192 = abstractC5212.zzc;
        if (c3192 != null) {
            for (int i5 = 0; i5 < c3192.f10725; i5++) {
                m3318(sb, i, String.valueOf(c3192.f10724[i5] >>> 3), c3192.f10722[i5]);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m3318(StringBuilder sb, int i, String str, Object obj) {
        String strReplace;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m3318(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m3318(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m3316(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (!(obj instanceof String)) {
            if (obj instanceof AbstractC4314) {
                sb.append(": \"");
                sb.append(AbstractC2776.m5215(((AbstractC4314) obj).m7608()));
                sb.append('\"');
                return;
            }
            if (obj instanceof AbstractC5212) {
                sb.append(" {");
                m3317((AbstractC5212) obj, sb, i + 2);
                sb.append("\n");
                m3316(i, sb);
                sb.append("}");
                return;
            }
            if (!(obj instanceof Map.Entry)) {
                sb.append(": ");
                sb.append(obj);
                return;
            }
            int i3 = i + 2;
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            m3318(sb, i3, "key", entry.getKey());
            m3318(sb, i3, "value", entry.getValue());
            sb.append("\n");
            m3316(i, sb);
            sb.append("}");
            return;
        }
        sb.append(": \"");
        String strReplace2 = (String) obj;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < strReplace2.length(); i4++) {
            char cCharAt2 = strReplace2.charAt(i4);
            if (cCharAt2 < ' ' || cCharAt2 > '~') {
                strReplace = AbstractC2776.m5215(strReplace2.getBytes(StandardCharsets.UTF_8));
                sb.append(strReplace);
                sb.append('\"');
            } else {
                if (cCharAt2 == '\"') {
                    z3 = true;
                } else if (cCharAt2 == '\'') {
                    z2 = true;
                } else if (cCharAt2 == '\\') {
                    z = true;
                }
            }
        }
        if (z) {
            strReplace2 = strReplace2.replace("\\", "\\\\");
        }
        strReplace = z2 ? strReplace2.replace("'", "\\'") : strReplace2;
        if (z3) {
            strReplace = strReplace.replace("\"", "\\\"");
        }
        sb.append(strReplace);
        sb.append('\"');
    }
}
