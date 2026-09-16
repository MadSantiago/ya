package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: ۦًؒٙٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3650 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C5388 f12209;

    /* JADX INFO: renamed from: ۥُ */
    public final Map f12210;

    /* JADX INFO: renamed from: ۥۗ */
    public final C2565 f12211;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3075 f12212;

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean f12213;

    public /* synthetic */ C3650(C3075 c3075, C2565 c2565, C5388 c5388, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : c3075, (i & 2) != 0 ? null : c2565, (i & 4) != 0 ? null : c5388, (i & 32) == 0, (i & 64) != 0 ? C0204.f751 : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3650)) {
            return false;
        }
        C3650 c3650 = (C3650) obj;
        return AbstractC3831.m6874(this.f12212, c3650.f12212) && AbstractC3831.m6874(this.f12211, c3650.f12211) && AbstractC3831.m6874(this.f12209, c3650.f12209) && this.f12213 == c3650.f12213 && AbstractC3831.m6874(this.f12210, c3650.f12210);
    }

    public final int hashCode() {
        C3075 c3075 = this.f12212;
        int iHashCode = (c3075 == null ? 0 : c3075.hashCode()) * 31;
        C2565 c2565 = this.f12211;
        int iHashCode2 = (iHashCode + (c2565 == null ? 0 : c2565.hashCode())) * 31;
        C5388 c5388 = this.f12209;
        return this.f12210.hashCode() + AbstractC5078.m8672((iHashCode2 + (c5388 != null ? c5388.hashCode() : 0)) * 29791, 31, this.f12213);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f12212 + ", slide=" + this.f12211 + ", changeSize=" + this.f12209 + ", scale=null, veil=null, hold=" + this.f12213 + ", effectsMap=" + this.f12210 + ')';
    }

    public C3650(C3075 c3075, C2565 c2565, C5388 c5388, boolean z, Map map) {
        this.f12212 = c3075;
        this.f12211 = c2565;
        this.f12209 = c5388;
        this.f12213 = z;
        this.f12210 = map;
    }
}
