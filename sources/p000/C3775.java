package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ۦٍۣؓۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3775 extends LinkedHashMap {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C3775 f12547;

    /* JADX INFO: renamed from: ۦۨ */
    public boolean f12548 = true;

    static {
        C3775 c3775 = new C3775();
        f12547 = c3775;
        c3775.f12548 = false;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static int m6678(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof InterfaceC3120) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int iM3845 = AbstractC1963.m3845(length, bArr, 0, length);
        if (iM3845 == 0) {
            return 1;
        }
        return iM3845;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m6680();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM6678 = 0;
        for (Map.Entry entry : entrySet()) {
            iM6678 += m6678(entry.getValue()) ^ m6678(entry.getKey());
        }
        return iM6678;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m6680();
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m6680();
        for (Object obj : map.keySet()) {
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m6680();
        return super.remove(obj);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C3775 m6679() {
        if (isEmpty()) {
            return new C3775();
        }
        C3775 c3775 = new C3775(this);
        c3775.f12548 = true;
        return c3775;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m6680() {
        if (!this.f12548) {
            throw new UnsupportedOperationException();
        }
    }
}
