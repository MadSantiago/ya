package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ۥۡؕٞٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2569 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C1397 f8579;

    static {
        int i = AbstractC5529.f18251;
        f8579 = new C1397(24);
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static int m4845(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0438.m935(i << 3) + 8) * size;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static Object m4846(Object obj, int i, InterfaceC5083 interfaceC5083, C2068 c2068, Object obj2, C1397 c1397) {
        if (c2068 == null) {
            return obj2;
        }
        if (interfaceC5083 == null) {
            Iterator it = interfaceC5083.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!c2068.m4013(iIntValue)) {
                    if (obj2 == null) {
                        c1397.getClass();
                        obj2 = C1397.m2959(obj);
                    }
                    c1397.getClass();
                    ((C3192) obj2).m5890(i << 3, Long.valueOf(iIntValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = interfaceC5083.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) interfaceC5083.get(i3);
            int iIntValue2 = num.intValue();
            if (c2068.m4013(iIntValue2)) {
                if (i3 != i2) {
                    interfaceC5083.set(i2, num);
                }
                i2++;
            } else {
                if (obj2 == null) {
                    c1397.getClass();
                    obj2 = C1397.m2959(obj);
                }
                c1397.getClass();
                ((C3192) obj2).m5890(i << 3, Long.valueOf(iIntValue2));
            }
        }
        if (i2 != size) {
            interfaceC5083.subList(i2, size).clear();
        }
        return obj2;
    }

    /* JADX INFO: renamed from: ۥَ */
    public static int m4847(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4416)) {
            int iM934 = 0;
            while (i < size) {
                iM934 += AbstractC0438.m934(((Long) list.get(i)).longValue());
                i++;
            }
            return iM934;
        }
        C4416 c4416 = (C4416) list;
        int iM935 = 0;
        while (i < size) {
            iM935 += AbstractC0438.m934(c4416.m7715(i));
            i++;
        }
        return iM935;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static void m4848(int i, List list, C2391 c2391, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0438 abstractC0438 = (AbstractC0438) c2391.f7924;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC0438.mo951(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        abstractC0438.mo944(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        abstractC0438.mo941(i3);
        while (i2 < list.size()) {
            abstractC0438.mo937(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public static void m4849(int i, List list, C2391 c2391, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0438 abstractC0438 = (AbstractC0438) c2391.f7924;
        int i2 = 0;
        if (!(list instanceof C4416)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC0438.mo943(((Long) list.get(i2)).longValue(), i);
                    i2++;
                }
                return;
            }
            abstractC0438.mo944(i, 2);
            int iM934 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM934 += AbstractC0438.m934(((Long) list.get(i3)).longValue());
            }
            abstractC0438.mo941(iM934);
            while (i2 < list.size()) {
                abstractC0438.mo942(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C4416 c4416 = (C4416) list;
        if (!z) {
            while (i2 < c4416.f14559) {
                abstractC0438.mo943(c4416.m7715(i2), i);
                i2++;
            }
            return;
        }
        abstractC0438.mo944(i, 2);
        int iM935 = 0;
        for (int i4 = 0; i4 < c4416.f14559; i4++) {
            iM935 += AbstractC0438.m934(c4416.m7715(i4));
        }
        abstractC0438.mo941(iM935);
        while (i2 < c4416.f14559) {
            abstractC0438.mo942(c4416.m7715(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۥْ */
    public static void m4850(int i, List list, C2391 c2391, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0438 abstractC0438 = (AbstractC0438) c2391.f7924;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC0438.mo947(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        abstractC0438.mo944(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        abstractC0438.mo941(i3);
        while (i2 < list.size()) {
            abstractC0438.mo954(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static int m4851(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4416)) {
            int iM934 = 0;
            while (i < size) {
                iM934 += AbstractC0438.m934(((Long) list.get(i)).longValue());
                i++;
            }
            return iM934;
        }
        C4416 c4416 = (C4416) list;
        int iM935 = 0;
        while (i < size) {
            iM935 += AbstractC0438.m934(c4416.m7715(i));
            i++;
        }
        return iM935;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static int m4852(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4416)) {
            int iM934 = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iM934 += AbstractC0438.m934((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iM934;
        }
        C4416 c4416 = (C4416) list;
        int iM935 = 0;
        while (i < size) {
            long jM7715 = c4416.m7715(i);
            iM935 += AbstractC0438.m934((jM7715 >> 63) ^ (jM7715 + jM7715));
            i++;
        }
        return iM935;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static int m4853(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0438.m935(i << 3) + 4) * size;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static int m4854(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2667)) {
            int iM935 = 0;
            while (i < size) {
                iM935 += AbstractC0438.m935(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM935;
        }
        C2667 c2667 = (C2667) list;
        int iM936 = 0;
        while (i < size) {
            iM936 += AbstractC0438.m935(c2667.m4968(i));
            i++;
        }
        return iM936;
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
    /* JADX INFO: renamed from: ۥۗ */
    public static void m4855(Object obj, Object obj2) {
        AbstractC5212 abstractC5212 = (AbstractC5212) obj;
        C3192 c3192 = abstractC5212.zzc;
        C3192 c3193 = ((AbstractC5212) obj2).zzc;
        C3192 c3194 = C3192.f10721;
        if (!c3194.equals(c3193)) {
            if (c3194.equals(c3192)) {
                int i = c3192.f10725 + c3193.f10725;
                int[] iArrCopyOf = Arrays.copyOf(c3192.f10724, i);
                System.arraycopy(c3193.f10724, 0, iArrCopyOf, c3192.f10725, c3193.f10725);
                Object[] objArrCopyOf = Arrays.copyOf(c3192.f10722, i);
                System.arraycopy(c3193.f10722, 0, objArrCopyOf, c3192.f10725, c3193.f10725);
                c3192 = new C3192(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                c3192.getClass();
                if (!c3193.equals(c3194)) {
                    if (!c3192.f10723) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = c3192.f10725 + c3193.f10725;
                    c3192.m5888(i2);
                    System.arraycopy(c3193.f10724, 0, c3192.f10724, c3192.f10725, c3193.f10725);
                    System.arraycopy(c3193.f10722, 0, c3192.f10722, c3192.f10725, c3193.f10725);
                    c3192.f10725 = i2;
                }
            }
        }
        abstractC5212.zzc = c3192;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static void m4856(int i, List list, C2391 c2391, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0438 abstractC0438 = (AbstractC0438) c2391.f7924;
        int i2 = 0;
        if (!(list instanceof C4416)) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    abstractC0438.mo943((jLongValue >> 63) ^ (jLongValue + jLongValue), i);
                    i2++;
                }
                return;
            }
            abstractC0438.mo944(i, 2);
            int iM934 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iM934 += AbstractC0438.m934((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            abstractC0438.mo941(iM934);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                abstractC0438.mo942((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        C4416 c4416 = (C4416) list;
        if (!z) {
            while (i2 < c4416.f14559) {
                long jM7715 = c4416.m7715(i2);
                abstractC0438.mo943((jM7715 >> 63) ^ (jM7715 + jM7715), i);
                i2++;
            }
            return;
        }
        abstractC0438.mo944(i, 2);
        int iM935 = 0;
        for (int i4 = 0; i4 < c4416.f14559; i4++) {
            long jM7716 = c4416.m7715(i4);
            iM935 += AbstractC0438.m934((jM7716 >> 63) ^ (jM7716 + jM7716));
        }
        abstractC0438.mo941(iM935);
        while (i2 < c4416.f14559) {
            long jM7717 = c4416.m7715(i2);
            abstractC0438.mo942((jM7717 >> 63) ^ (jM7717 + jM7717));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static boolean m4857(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static void m4858(int i, List list, C2391 c2391, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0438 abstractC0438 = (AbstractC0438) c2391.f7924;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC0438.mo949(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()), i);
                i2++;
            }
            return;
        }
        abstractC0438.mo944(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        abstractC0438.mo941(i3);
        while (i2 < list.size()) {
            abstractC0438.mo948(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static void m4859(int i, List list, C2391 c2391, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0438 abstractC0438 = (AbstractC0438) c2391.f7924;
        int i2 = 0;
        if (!(list instanceof C2667)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC0438.mo939(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC0438.mo944(i, 2);
            int iM935 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM935 += AbstractC0438.m935(((Integer) list.get(i3)).intValue());
            }
            abstractC0438.mo941(iM935);
            while (i2 < list.size()) {
                abstractC0438.mo941(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C2667 c2667 = (C2667) list;
        if (!z) {
            while (i2 < c2667.f8833) {
                abstractC0438.mo939(i, c2667.m4968(i2));
                i2++;
            }
            return;
        }
        abstractC0438.mo944(i, 2);
        int iM936 = 0;
        for (int i4 = 0; i4 < c2667.f8833; i4++) {
            iM936 += AbstractC0438.m935(c2667.m4968(i4));
        }
        abstractC0438.mo941(iM936);
        while (i2 < c2667.f8833) {
            abstractC0438.mo941(c2667.m4968(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static void m4860(int i, List list, C2391 c2391, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0438 abstractC0438 = (AbstractC0438) c2391.f7924;
        int i2 = 0;
        if (!(list instanceof C2667)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    abstractC0438.mo939(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            abstractC0438.mo944(i, 2);
            int iM935 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iM935 += AbstractC0438.m935((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            abstractC0438.mo941(iM935);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                abstractC0438.mo941((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        C2667 c2667 = (C2667) list;
        if (!z) {
            while (i2 < c2667.f8833) {
                int iM4968 = c2667.m4968(i2);
                abstractC0438.mo939(i, (iM4968 >> 31) ^ (iM4968 + iM4968));
                i2++;
            }
            return;
        }
        abstractC0438.mo944(i, 2);
        int iM936 = 0;
        for (int i4 = 0; i4 < c2667.f8833; i4++) {
            int iM4969 = c2667.m4968(i4);
            iM936 += AbstractC0438.m935((iM4969 >> 31) ^ (iM4969 + iM4969));
        }
        abstractC0438.mo941(iM936);
        while (i2 < c2667.f8833) {
            int iM49610 = c2667.m4968(i2);
            abstractC0438.mo941((iM49610 >> 31) ^ (iM49610 + iM49610));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public static void m4861(int i, List list, C2391 c2391, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0438 abstractC0438 = (AbstractC0438) c2391.f7924;
        int i2 = 0;
        if (!(list instanceof C4416)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC0438.mo949(((Long) list.get(i2)).longValue(), i);
                    i2++;
                }
                return;
            }
            abstractC0438.mo944(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            abstractC0438.mo941(i3);
            while (i2 < list.size()) {
                abstractC0438.mo948(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C4416 c4416 = (C4416) list;
        if (!z) {
            while (i2 < c4416.f14559) {
                abstractC0438.mo949(c4416.m7715(i2), i);
                i2++;
            }
            return;
        }
        abstractC0438.mo944(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c4416.f14559; i6++) {
            c4416.m7715(i6);
            i5 += 8;
        }
        abstractC0438.mo941(i5);
        while (i2 < c4416.f14559) {
            abstractC0438.mo948(c4416.m7715(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static int m4862(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2667)) {
            int iM935 = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM935 += AbstractC0438.m935((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iM935;
        }
        C2667 c2667 = (C2667) list;
        int iM936 = 0;
        while (i < size) {
            int iM4968 = c2667.m4968(i);
            iM936 += AbstractC0438.m935((iM4968 >> 31) ^ (iM4968 + iM4968));
            i++;
        }
        return iM936;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static int m4863(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2667)) {
            int iM934 = 0;
            while (i < size) {
                iM934 += AbstractC0438.m934(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM934;
        }
        C2667 c2667 = (C2667) list;
        int iM935 = 0;
        while (i < size) {
            iM935 += AbstractC0438.m934(c2667.m4968(i));
            i++;
        }
        return iM935;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static void m4864(int i, List list, C2391 c2391, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0438 abstractC0438 = (AbstractC0438) c2391.f7924;
        int i2 = 0;
        if (!(list instanceof C4416)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC0438.mo949(((Long) list.get(i2)).longValue(), i);
                    i2++;
                }
                return;
            }
            abstractC0438.mo944(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            abstractC0438.mo941(i3);
            while (i2 < list.size()) {
                abstractC0438.mo948(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C4416 c4416 = (C4416) list;
        if (!z) {
            while (i2 < c4416.f14559) {
                abstractC0438.mo949(c4416.m7715(i2), i);
                i2++;
            }
            return;
        }
        abstractC0438.mo944(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c4416.f14559; i6++) {
            c4416.m7715(i6);
            i5 += 8;
        }
        abstractC0438.mo941(i5);
        while (i2 < c4416.f14559) {
            abstractC0438.mo948(c4416.m7715(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static void m4865(int i, List list, C2391 c2391, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0438 abstractC0438 = (AbstractC0438) c2391.f7924;
        int i2 = 0;
        if (!(list instanceof C2667)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC0438.mo938(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC0438.mo944(i, 2);
            int iM934 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM934 += AbstractC0438.m934(((Integer) list.get(i3)).intValue());
            }
            abstractC0438.mo941(iM934);
            while (i2 < list.size()) {
                abstractC0438.mo940(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C2667 c2667 = (C2667) list;
        if (!z) {
            while (i2 < c2667.f8833) {
                abstractC0438.mo938(i, c2667.m4968(i2));
                i2++;
            }
            return;
        }
        abstractC0438.mo944(i, 2);
        int iM935 = 0;
        for (int i4 = 0; i4 < c2667.f8833; i4++) {
            iM935 += AbstractC0438.m934(c2667.m4968(i4));
        }
        abstractC0438.mo941(iM935);
        while (i2 < c2667.f8833) {
            abstractC0438.mo940(c2667.m4968(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static void m4866(int i, List list, C2391 c2391, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0438 abstractC0438 = (AbstractC0438) c2391.f7924;
        int i2 = 0;
        if (!(list instanceof C4416)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC0438.mo943(((Long) list.get(i2)).longValue(), i);
                    i2++;
                }
                return;
            }
            abstractC0438.mo944(i, 2);
            int iM934 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM934 += AbstractC0438.m934(((Long) list.get(i3)).longValue());
            }
            abstractC0438.mo941(iM934);
            while (i2 < list.size()) {
                abstractC0438.mo942(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C4416 c4416 = (C4416) list;
        if (!z) {
            while (i2 < c4416.f14559) {
                abstractC0438.mo943(c4416.m7715(i2), i);
                i2++;
            }
            return;
        }
        abstractC0438.mo944(i, 2);
        int iM935 = 0;
        for (int i4 = 0; i4 < c4416.f14559; i4++) {
            iM935 += AbstractC0438.m934(c4416.m7715(i4));
        }
        abstractC0438.mo941(iM935);
        while (i2 < c4416.f14559) {
            abstractC0438.mo942(c4416.m7715(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static void m4867(int i, List list, C2391 c2391, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0438 abstractC0438 = (AbstractC0438) c2391.f7924;
        int i2 = 0;
        if (!(list instanceof C2667)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC0438.mo951(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC0438.mo944(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            abstractC0438.mo941(i3);
            while (i2 < list.size()) {
                abstractC0438.mo937(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C2667 c2667 = (C2667) list;
        if (!z) {
            while (i2 < c2667.f8833) {
                abstractC0438.mo951(i, c2667.m4968(i2));
                i2++;
            }
            return;
        }
        abstractC0438.mo944(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c2667.f8833; i6++) {
            c2667.m4968(i6);
            i5 += 4;
        }
        abstractC0438.mo941(i5);
        while (i2 < c2667.f8833) {
            abstractC0438.mo937(c2667.m4968(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static int m4868(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2667)) {
            int iM934 = 0;
            while (i < size) {
                iM934 += AbstractC0438.m934(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM934;
        }
        C2667 c2667 = (C2667) list;
        int iM935 = 0;
        while (i < size) {
            iM935 += AbstractC0438.m934(c2667.m4968(i));
            i++;
        }
        return iM935;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static void m4869(int i, List list, C2391 c2391, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0438 abstractC0438 = (AbstractC0438) c2391.f7924;
        int i2 = 0;
        if (!(list instanceof C2667)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC0438.mo938(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC0438.mo944(i, 2);
            int iM934 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM934 += AbstractC0438.m934(((Integer) list.get(i3)).intValue());
            }
            abstractC0438.mo941(iM934);
            while (i2 < list.size()) {
                abstractC0438.mo940(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C2667 c2667 = (C2667) list;
        if (!z) {
            while (i2 < c2667.f8833) {
                abstractC0438.mo938(i, c2667.m4968(i2));
                i2++;
            }
            return;
        }
        abstractC0438.mo944(i, 2);
        int iM935 = 0;
        for (int i4 = 0; i4 < c2667.f8833; i4++) {
            iM935 += AbstractC0438.m934(c2667.m4968(i4));
        }
        abstractC0438.mo941(iM935);
        while (i2 < c2667.f8833) {
            abstractC0438.mo940(c2667.m4968(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static void m4870(int i, List list, C2391 c2391, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0438 abstractC0438 = (AbstractC0438) c2391.f7924;
        int i2 = 0;
        if (!(list instanceof C2667)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC0438.mo951(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC0438.mo944(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            abstractC0438.mo941(i3);
            while (i2 < list.size()) {
                abstractC0438.mo937(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C2667 c2667 = (C2667) list;
        if (!z) {
            while (i2 < c2667.f8833) {
                abstractC0438.mo951(i, c2667.m4968(i2));
                i2++;
            }
            return;
        }
        abstractC0438.mo944(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c2667.f8833; i6++) {
            c2667.m4968(i6);
            i5 += 4;
        }
        abstractC0438.mo941(i5);
        while (i2 < c2667.f8833) {
            abstractC0438.mo937(c2667.m4968(i2));
            i2++;
        }
    }
}
