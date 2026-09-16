package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ۦؙٟؗؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3408 extends AbstractC2426 implements InterfaceC2609 {

    /* JADX INFO: renamed from: ۥَ */
    public /* synthetic */ C0327 f11339;

    /* JADX INFO: renamed from: ۥٖ */
    public /* synthetic */ C1337 f11340;

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        AbstractC0186.m409(obj);
        C0327 c0327 = this.f11339;
        C1337 c1337 = this.f11340;
        Set setKeySet = c1337.m2851().keySet();
        ArrayList arrayList = new ArrayList(AbstractC5573.m9402(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3637) it.next()).f12167);
        }
        Map<String, ?> all = c0327.f1220.getAll();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            Set set = c0327.f1219;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC4554.m7911(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = AbstractC0973.m2052((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        C1337 c1338 = new C1337(new LinkedHashMap(c1337.m2851()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String str = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                c1338.m2852(new C3637(str), value2);
            } else if (value2 instanceof Float) {
                c1338.m2852(new C3637(str), value2);
            } else if (value2 instanceof Integer) {
                c1338.m2852(new C3637(str), value2);
            } else if (value2 instanceof Long) {
                c1338.m2852(new C3637(str), value2);
            } else if (value2 instanceof String) {
                c1338.m2852(new C3637(str), value2);
            } else if (value2 instanceof Set) {
                c1338.m2852(new C3637(str), (Set) value2);
            }
        }
        return new C1337(new LinkedHashMap(c1338.m2851()), true);
    }

    @Override // p000.InterfaceC2609
    /* JADX INFO: renamed from: ۦۙ */
    public final Object mo1173(Object obj, Object obj2, Object obj3) {
        C3408 c3408 = new C3408(3, (InterfaceC0443) obj3);
        c3408.f11339 = (C0327) obj;
        c3408.f11340 = (C1337) obj2;
        return c3408.mo218(C2358.f7817);
    }
}
