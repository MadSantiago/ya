package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: ۦۢؓٚؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5521 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C3650 f18231;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5521 f18230 = new C5521(new C3650((C3075) null, (C2565) null, (C5388) null, (LinkedHashMap) null, 127));

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5521 f18229 = new C5521(new C3650((C3075) null, (C2565) null, (C5388) null, (LinkedHashMap) null, 95));

    public C5521(C3650 c3650) {
        this.f18231 = c3650;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5521) && ((C5521) obj).f18231.equals(this.f18231);
    }

    public final int hashCode() {
        return this.f18231.hashCode();
    }

    public final String toString() {
        if (equals(f18230)) {
            return "ExitTransition.None";
        }
        if (equals(f18229)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        C3650 c3650 = this.f18231;
        C3075 c3075 = c3650.f12212;
        sb.append(c3075 != null ? c3075.toString() : null);
        sb.append(",\nSlide - ");
        C2565 c2565 = c3650.f12211;
        sb.append(c2565 != null ? c2565.toString() : null);
        sb.append(",\nShrink - ");
        C5388 c5388 = c3650.f12209;
        sb.append(c5388 != null ? c5388.toString() : null);
        sb.append(",\nScale - null,\nKeepUntilTransitionsFinished - ");
        sb.append(c3650.f12213);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C5521 m9204(C5521 c5521) {
        C3650 c3650 = c5521.f18231;
        C3075 c3075 = c3650.f12212;
        C3650 c3651 = this.f18231;
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
        boolean z = c3650.f12213 || c3651.f12213;
        Map map = c3651.f12210;
        Map map2 = c3650.f12210;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new C5521(new C3650(c3075, c2565, c5388, z, linkedHashMap));
    }
}
