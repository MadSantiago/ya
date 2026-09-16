package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: ۥٜٕؑ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1808 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C1808 f6020 = new C1808(new C3650((C3075) null, (C2565) null, (C5388) null, (LinkedHashMap) null, 127));

    /* JADX INFO: renamed from: ۥۣ */
    public final C3650 f6021;

    public C1808(C3650 c3650) {
        this.f6021 = c3650;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1808) && ((C1808) obj).f6021.equals(this.f6021);
    }

    public final int hashCode() {
        return this.f6021.hashCode();
    }

    public final String toString() {
        if (equals(f6020)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        C3650 c3650 = this.f6021;
        C3075 c3075 = c3650.f12212;
        sb.append(c3075 != null ? c3075.toString() : null);
        sb.append(",\nSlide - ");
        C2565 c2565 = c3650.f12211;
        sb.append(c2565 != null ? c2565.toString() : null);
        sb.append(",\nShrink - ");
        C5388 c5388 = c3650.f12209;
        return AbstractC3761.m6621(sb, c5388 != null ? c5388.toString() : null, ",\nScale - null");
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C1808 m3590(C1808 c1808) {
        C3650 c3650 = c1808.f6021;
        C3075 c3075 = c3650.f12212;
        C3650 c3651 = this.f6021;
        if (c3075 == null) {
            c3075 = c3651.f12212;
        }
        C2565 c2565 = c3650.f12211;
        if (c2565 == null) {
            c2565 = c3651.f12211;
        }
        C5388 c5388 = c3650.f12209;
        if (c5388 == null) {
            c5388 = c3651.f12209;
        }
        Map map = c3651.f12210;
        Map map2 = c3650.f12210;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new C1808(new C3650(c3075, c2565, c5388, linkedHashMap, 32));
    }
}
