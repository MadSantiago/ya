package p000;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: ۥۦَؑٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2775 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C2775 f9249;

    /* JADX INFO: renamed from: ۥۣ */
    public final HashMap f9250;

    static {
        C2775 c2775 = new C2775(new LinkedHashMap());
        AbstractC0993.m2142(c2775);
        f9249 = c2775;
    }

    public C2775(C2775 c2775) {
        this.f9250 = new HashMap(c2775.f9250);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && C2775.class.equals(obj.getClass())) {
                HashMap map = ((C2775) obj).f9250;
                HashMap map2 = this.f9250;
                Set<String> setKeySet = map2.keySet();
                if (AbstractC3831.m6874(setKeySet, map.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map2.get(str);
                        Object obj3 = map.get(str);
                        if (obj2 == null || obj3 == null) {
                            zEquals = obj2 == obj3;
                        } else if (obj2 instanceof Object[]) {
                            Object[] objArr = (Object[]) obj2;
                            if (obj3 instanceof Object[]) {
                                zEquals = AbstractC0246.m521(objArr, (Object[]) obj3);
                            } else {
                                zEquals = obj2.equals(obj3);
                            }
                        } else {
                            zEquals = obj2.equals(obj3);
                        }
                        if (!zEquals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f9250.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return AbstractC3761.m6621(new StringBuilder("Data {"), AbstractC0973.m2056(this.f9250.entrySet(), null, null, null, new C3018(9), 31), "}");
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m5209(String str) {
        Object obj = this.f9250.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    public C2775(LinkedHashMap linkedHashMap) {
        this.f9250 = new HashMap(linkedHashMap);
    }
}
