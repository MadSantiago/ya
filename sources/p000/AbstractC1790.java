package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: ۥؘٛؗ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1790 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final char[] f5989;

    static {
        char[] cArr = new char[80];
        f5989 = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0194  */
    /* JADX WARN: Code duplicated, block: B:76:0x0196  */
    /* JADX INFO: renamed from: ۥؗ */
    public static void m3578(AbstractC0318 abstractC0318, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC0318.getClass().getDeclaredMethods();
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
                    m3579(sb, i, strSubstring.substring(0, strSubstring.length() - 4), AbstractC0318.m670(method2, abstractC0318, new Object[0]));
                }
                i2 = i3;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m3579(sb, i, strSubstring.substring(0, strSubstring.length() - 3), AbstractC0318.m670(method, abstractC0318, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM670 = AbstractC0318.m670(method4, abstractC0318, new Object[0]);
                    if (method5 == null) {
                        zBooleanValue = true;
                        if (objM670 instanceof Boolean) {
                            zEquals = !((Boolean) objM670).booleanValue();
                        } else if (objM670 instanceof Integer) {
                            if (((Integer) objM670).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM670 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objM670).floatValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM670 instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) objM670).doubleValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM670 instanceof String) {
                            zEquals = objM670.equals("");
                        } else if (objM670 instanceof C0533) {
                            zEquals = objM670.equals(C0533.f1874);
                        } else if (!(objM670 instanceof AbstractC0066) ? !((objM670 instanceof Enum) && ((Enum) objM670).ordinal() == 0) : objM670 != ((AbstractC0318) ((AbstractC0318) ((AbstractC0066) objM670)).mo674(6))) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) AbstractC0318.m670(method5, abstractC0318, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        m3579(sb, i, strSubstring, objM670);
                    }
                }
            }
            i2 = i3;
        }
        C5708 c5708 = abstractC0318.unknownFields;
        if (c5708 != null) {
            for (int i5 = 0; i5 < c5708.f18795; i5++) {
                m3579(sb, i, String.valueOf(c5708.f18794[i5] >>> 3), c5708.f18792[i5]);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m3579(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m3579(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m3579(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m3580(i, sb);
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
        if (obj instanceof String) {
            sb.append(": \"");
            C0533 c0533 = C0533.f1874;
            sb.append(C3133.m5808(new C0533(((String) obj).getBytes(AbstractC3576.f11899))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0533) {
            sb.append(": \"");
            sb.append(C3133.m5808((C0533) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0318) {
            sb.append(" {");
            m3578((AbstractC0318) obj, sb, i + 2);
            sb.append("\n");
            m3580(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        m3579(sb, i3, "key", entry.getKey());
        m3579(sb, i3, "value", entry.getValue());
        sb.append("\n");
        m3580(i, sb);
        sb.append("}");
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m3580(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f5989, 0, i2);
            i -= i2;
        }
    }
}
