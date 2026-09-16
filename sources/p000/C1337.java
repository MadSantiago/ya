package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ۥٔؓۦٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1337 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C5086 f4619;

    /* JADX INFO: renamed from: ۥۣ */
    public final LinkedHashMap f4620;

    public C1337(LinkedHashMap linkedHashMap, boolean z) {
        this.f4620 = linkedHashMap;
        this.f4619 = new C5086(z);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    public final boolean equals(Object obj) {
        boolean zM6874;
        if (obj instanceof C1337) {
            LinkedHashMap linkedHashMap = ((C1337) obj).f4620;
            LinkedHashMap linkedHashMap2 = this.f4620;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    zM6874 = AbstractC3831.m6874(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    zM6874 = true;
                                } else {
                                    zM6874 = false;
                                }
                            } else {
                                zM6874 = false;
                            }
                            if (!zM6874) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.f4620.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return AbstractC0973.m2056(this.f4620.entrySet(), ",\n", "{\n", "\n}", C3948.f13188, 24);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final Object m2849(C3637 c3637) {
        Object obj = this.f4620.get(c3637);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m2850() {
        if (((AtomicBoolean) this.f4619.f16877).get()) {
            C1078.m2276("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final Map m2851() {
        C3869 c3869;
        Set<Map.Entry> setEntrySet = this.f4620.entrySet();
        int iM7911 = AbstractC4554.m7911(AbstractC5573.m9402(setEntrySet, 10));
        if (iM7911 < 16) {
            iM7911 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM7911);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                c3869 = new C3869(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                c3869 = new C3869(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(c3869.f12915, c3869.f12914);
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m2852(C3637 c3637, Object obj) {
        m2850();
        LinkedHashMap linkedHashMap = this.f4620;
        if (obj == null) {
            m2850();
            linkedHashMap.remove(c3637);
        } else if (obj instanceof Set) {
            linkedHashMap.put(c3637, Collections.unmodifiableSet(AbstractC0973.m2052((Set) obj)));
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(c3637, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(c3637, Arrays.copyOf(bArr, bArr.length));
        }
    }

    public /* synthetic */ C1337(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
