package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ۦؚؐؒؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2966 {

    /* JADX INFO: renamed from: ۥۗ */
    public final HashMap f9949;

    /* JADX INFO: renamed from: ۥۣ */
    public final HashMap f9950 = new HashMap();

    public C2966(HashMap map) {
        this.f9949 = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC1924 enumC1924 = (EnumC1924) entry.getValue();
            List arrayList = (List) this.f9950.get(enumC1924);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f9950.put(enumC1924, arrayList);
            }
            arrayList.add((C3539) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m5524(List list, InterfaceC4507 interfaceC4507, EnumC1924 enumC1924, InterfaceC0335 interfaceC0335) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C3539 c3539 = (C3539) list.get(size);
                Method method = c3539.f11744;
                try {
                    int i = c3539.f11745;
                    if (i == 0) {
                        method.invoke(interfaceC0335, null);
                    } else if (i == 1) {
                        method.invoke(interfaceC0335, interfaceC4507);
                    } else if (i == 2) {
                        method.invoke(interfaceC0335, interfaceC4507, enumC1924);
                    }
                } catch (IllegalAccessException e) {
                    C5028.m8450(e);
                    return;
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
