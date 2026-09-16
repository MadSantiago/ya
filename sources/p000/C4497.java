package p000;

/* JADX INFO: renamed from: ۦٙؕۦؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4497 implements Comparable {

    /* JADX INFO: renamed from: ۦۨ */
    public final float f14871;

    /* JADX INFO: renamed from: ۥؗ */
    public static String m7825(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final boolean m7826(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static int m7827(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m7827(this.f14871, ((C4497) obj).f14871);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4497) {
            return Float.compare(this.f14871, ((C4497) obj).f14871) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14871);
    }

    public final String toString() {
        return m7825(this.f14871);
    }
}
