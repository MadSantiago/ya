package p000;

/* JADX INFO: renamed from: ۦًٍۧؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5830 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final float f19205;

    /* JADX INFO: renamed from: ۥۗ */
    public static final float f19206;

    /* JADX INFO: renamed from: ۦؑ */
    public static final float f19207;

    /* JADX INFO: renamed from: ۥۣ */
    public final float f19208;

    static {
        m9640(0.0f);
        m9640(0.5f);
        f19206 = 0.5f;
        m9640(-1.0f);
        f19205 = -1.0f;
        m9640(1.0f);
        f19207 = 1.0f;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static String m9639(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == f19206) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == f19205) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == f19207) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m9640(float f) {
        if ((0.0f > f || f > 1.0f) && f != -1.0f) {
            AbstractC3767.m6643("topRatio should be in [0..1] range or -1");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5830) {
            return Float.compare(this.f19208, ((C5830) obj).f19208) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19208);
    }

    public final String toString() {
        return m9639(this.f19208);
    }
}
