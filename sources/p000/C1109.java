package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۥُِؕۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1172
public final class C1109 {
    public static final C5784 Companion = new C5784();

    /* JADX INFO: renamed from: ۦؑ */
    public static final InterfaceC5130[] f3896 = {null, null, AbstractC3933.m7095(2, new C2971(5))};

    /* JADX INFO: renamed from: ۥؗ */
    public final Map f3897;

    /* JADX INFO: renamed from: ۥۗ */
    public final C4959 f3898;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1521 f3899;

    public /* synthetic */ C1109(int i, C1521 c1521, C4959 c4959, Map map) {
        if (1 != (i & 1)) {
            AbstractC5568.m9392(i, 1, C0182.f671.mo193());
            throw null;
        }
        this.f3899 = c1521;
        if ((i & 2) == 0) {
            this.f3898 = null;
        } else {
            this.f3898 = c4959;
        }
        if ((i & 4) == 0) {
            this.f3897 = null;
        } else {
            this.f3897 = map;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C1109 m2327(C1109 c1109, C1521 c1521, C4959 c4959, Map map, int i) {
        if ((i & 1) != 0) {
            c1521 = c1109.f3899;
        }
        if ((i & 2) != 0) {
            c4959 = c1109.f3898;
        }
        if ((i & 4) != 0) {
            map = c1109.f3897;
        }
        c1109.getClass();
        return new C1109(c1521, c4959, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1109)) {
            return false;
        }
        C1109 c1109 = (C1109) obj;
        return AbstractC3831.m6874(this.f3899, c1109.f3899) && AbstractC3831.m6874(this.f3898, c1109.f3898) && AbstractC3831.m6874(this.f3897, c1109.f3897);
    }

    public final int hashCode() {
        int iHashCode = this.f3899.hashCode() * 31;
        C4959 c4959 = this.f3898;
        int iHashCode2 = (iHashCode + (c4959 == null ? 0 : Long.hashCode(c4959.f16406))) * 31;
        Map map = this.f3897;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.f3899 + ", backgroundTime=" + this.f3898 + ", processDataMap=" + this.f3897 + ')';
    }

    public C1109(C1521 c1521, C4959 c4959, Map map) {
        this.f3899 = c1521;
        this.f3898 = c4959;
        this.f3897 = map;
    }
}
