package p000;

/* JADX INFO: renamed from: ۦؕؖٛؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3291 {

    /* JADX INFO: renamed from: ۥۣ */
    public final long f11025;

    public /* synthetic */ C3291(long j) {
        this.f11025 = j;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final boolean m6051(long j) {
        return (j == 9205357640488583168L) | (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final float m6052(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final boolean m6053(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static String m6054(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + C3133.m5791(Float.intBitsToFloat((int) (j >> 32))) + ", " + C3133.m5791(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3291) {
            return this.f11025 == ((C3291) obj).f11025;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11025);
    }

    public final String toString() {
        return m6054(this.f11025);
    }
}
