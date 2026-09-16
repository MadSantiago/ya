package p000;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: ۥؕٗٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0499 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C0841 f1808;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C0841 f1809;

    /* JADX INFO: renamed from: ۥۣ */
    public static final Class f1810;

    static {
        Class<?> cls;
        Class<?> cls2;
        C5734 c5734 = C5734.f18904;
        C0841 c0841 = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f1810 = cls;
        try {
            C5734 c5735 = C5734.f18904;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                c0841 = (C0841) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f1809 = c0841;
        f1808 = new C0841();
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static void m1117(int i, List list, C5086 c5086, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2100 c2100 = (C2100) c5086.f16877;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c2100.m4059(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
            return;
        }
        c2100.m4066(i, 2);
        int iM4048 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM4048 += C2100.m4048(((Long) list.get(i3)).longValue());
        }
        c2100.m4072(iM4048);
        while (i2 < list.size()) {
            c2100.m4064(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static int m1118(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C2100.m4047(i) + 8) * size;
    }

    /* JADX INFO: renamed from: ۥَ */
    public static void m1119(int i, List list, C5086 c5086, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2100 c2100 = (C2100) c5086.f16877;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c2100.m4075(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c2100.m4066(i, 2);
        int iM4048 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM4048 += C2100.m4048(((Integer) list.get(i3)).intValue());
        }
        c2100.m4072(iM4048);
        while (i2 < list.size()) {
            c2100.m4062(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public static int m1120(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM4048 = 0;
        for (int i = 0; i < size; i++) {
            iM4048 += C2100.m4048(((Long) list.get(i)).longValue());
        }
        return iM4048;
    }

    /* JADX INFO: renamed from: ۥّ */
    public static int m1121(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM4049 = 0;
        for (int i = 0; i < size; i++) {
            int iIntValue = ((Integer) list.get(i)).intValue();
            iM4049 += C2100.m4049((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iM4049;
    }

    /* JADX INFO: renamed from: ۥْ */
    public static void m1122(int i, List list, C5086 c5086, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2100 c2100 = (C2100) c5086.f16877;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c2100.m4060(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
            return;
        }
        c2100.m4066(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        c2100.m4072(i3);
        while (i2 < list.size()) {
            c2100.m4071(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static void m1123(int i, List list, C5086 c5086, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2100 c2100 = (C2100) c5086.f16877;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c2100.m4058(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        c2100.m4066(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        c2100.m4072(i3);
        while (i2 < list.size()) {
            c2100.m4055(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static void m1124(int i, List list, C5086 c5086, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2100 c2100 = (C2100) c5086.f16877;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c2100.m4059(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
            return;
        }
        c2100.m4066(i, 2);
        int iM4048 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM4048 += C2100.m4048(((Long) list.get(i3)).longValue());
        }
        c2100.m4072(iM4048);
        while (i2 < list.size()) {
            c2100.m4064(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static void m1125(int i, List list, C5086 c5086, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2100 c2100 = (C2100) c5086.f16877;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c2100.m4054(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c2100.m4066(i, 2);
        int iM4049 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM4049 += C2100.m4049(((Integer) list.get(i3)).intValue());
        }
        c2100.m4072(iM4049);
        while (i2 < list.size()) {
            c2100.m4072(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static void m1126(int i, List list, C5086 c5086, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2100 c2100 = (C2100) c5086.f16877;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c2100.m4054(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        c2100.m4066(i, 2);
        int iM4049 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iM4049 += C2100.m4049((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c2100.m4072(iM4049);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            c2100.m4072((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static int m1127(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C2100.m4047(i) + 4) * size;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static int m1128(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM4049 = 0;
        for (int i = 0; i < size; i++) {
            iM4049 += C2100.m4049(((Integer) list.get(i)).intValue());
        }
        return iM4049;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static int m1129(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM4048 = 0;
        for (int i = 0; i < size; i++) {
            iM4048 += C2100.m4048(((Integer) list.get(i)).intValue());
        }
        return iM4048;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static int m1130(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM4048 = 0;
        for (int i = 0; i < size; i++) {
            iM4048 += C2100.m4048(((Integer) list.get(i)).intValue());
        }
        return iM4048;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static boolean m1131(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static void m1132(int i, List list, C5086 c5086, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2100 c2100 = (C2100) c5086.f16877;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c2100.m4077(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        c2100.m4066(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        c2100.m4072(i3);
        while (i2 < list.size()) {
            c2100.m4069(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static void m1134(int i, List list, C5086 c5086, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2100 c2100 = (C2100) c5086.f16877;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                c2100.m4059((jLongValue >> 63) ^ (jLongValue << 1), i);
                i2++;
            }
            return;
        }
        c2100.m4066(i, 2);
        int iM4048 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iM4048 += C2100.m4048((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c2100.m4072(iM4048);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            c2100.m4064((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static void m1135(int i, List list, C5086 c5086, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2100 c2100 = (C2100) c5086.f16877;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c2100.m4058(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c2100.m4066(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        c2100.m4072(i3);
        while (i2 < list.size()) {
            c2100.m4055(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static int m1136(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM4048 = 0;
        for (int i = 0; i < size; i++) {
            iM4048 += C2100.m4048(((Long) list.get(i)).longValue());
        }
        return iM4048;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۦۗ */
    public static void m1137(C0841 c0841, Object obj, Object obj2) {
        c0841.getClass();
        AbstractC0318 abstractC0318 = (AbstractC0318) obj;
        C5708 c5708 = abstractC0318.unknownFields;
        C5708 c5709 = ((AbstractC0318) obj2).unknownFields;
        C5708 c57010 = C5708.f18791;
        if (!c57010.equals(c5709)) {
            if (c57010.equals(c5708)) {
                int i = c5708.f18795 + c5709.f18795;
                int[] iArrCopyOf = Arrays.copyOf(c5708.f18794, i);
                System.arraycopy(c5709.f18794, 0, iArrCopyOf, c5708.f18795, c5709.f18795);
                Object[] objArrCopyOf = Arrays.copyOf(c5708.f18792, i);
                System.arraycopy(c5709.f18792, 0, objArrCopyOf, c5708.f18795, c5709.f18795);
                c5708 = new C5708(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                c5708.getClass();
                if (!c5709.equals(c57010)) {
                    if (!c5708.f18793) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = c5708.f18795 + c5709.f18795;
                    c5708.m9526(i2);
                    System.arraycopy(c5709.f18794, 0, c5708.f18794, c5708.f18795, c5709.f18795);
                    System.arraycopy(c5709.f18792, 0, c5708.f18792, c5708.f18795, c5709.f18795);
                    c5708.f18795 = i2;
                }
            }
        }
        abstractC0318.unknownFields = c5708;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static int m1138(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM4048 = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iM4048 += C2100.m4048((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iM4048;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static void m1139(int i, List list, C5086 c5086, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2100 c2100 = (C2100) c5086.f16877;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c2100.m4060(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()), i);
                i2++;
            }
            return;
        }
        c2100.m4066(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        c2100.m4072(i3);
        while (i2 < list.size()) {
            c2100.m4071(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static void m1140(int i, List list, C5086 c5086, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2100 c2100 = (C2100) c5086.f16877;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c2100.m4060(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
            return;
        }
        c2100.m4066(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        c2100.m4072(i3);
        while (i2 < list.size()) {
            c2100.m4071(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static void m1141(int i, List list, C5086 c5086, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2100 c2100 = (C2100) c5086.f16877;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c2100.m4058(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c2100.m4066(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        c2100.m4072(i3);
        while (i2 < list.size()) {
            c2100.m4055(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static void m1142(int i, List list, C5086 c5086, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2100 c2100 = (C2100) c5086.f16877;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c2100.m4075(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c2100.m4066(i, 2);
        int iM4048 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM4048 += C2100.m4048(((Integer) list.get(i3)).intValue());
        }
        c2100.m4072(iM4048);
        while (i2 < list.size()) {
            c2100.m4062(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public static Object m1133(Object obj, int i, InterfaceC4997 interfaceC4997, Object obj2, C0841 c0841) {
        return obj2;
    }
}
