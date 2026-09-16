package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ۦۜٗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5311 implements Iterable, InterfaceC3984 {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C5311 f17488 = new C5311(C0204.f751);

    /* JADX INFO: renamed from: ۦۨ */
    public final Map f17489;

    public C5311(Map map) {
        this.f17489 = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5311) {
            return AbstractC3831.m6874(this.f17489, ((C5311) obj).f17489);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17489.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f17489;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                C0178.m382();
                return null;
            }
            arrayList.add(new C3869(str, null));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.f17489 + ')';
    }
}
