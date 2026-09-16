package p000;

/* JADX INFO: renamed from: ۥً٘ؑۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1553 {

    /* JADX INFO: renamed from: ۥۣ */
    public final long f5241;

    public /* synthetic */ C1553(long j) {
        this.f5241 = j;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final float m3303(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat));
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final long m3304(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final long m3305(float f, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final boolean m3306(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static long m3307(long j, float f, int i) {
        float fIntBitsToFloat = (i & 1) != 0 ? Float.intBitsToFloat((int) (j >> 32)) : 0.0f;
        if ((i & 2) != 0) {
            f = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final long m3308(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static String m3309(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + C3133.m5791(Float.intBitsToFloat((int) (j >> 32))) + ", " + C3133.m5791(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1553) {
            return this.f5241 == ((C1553) obj).f5241;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5241);
    }

    public final String toString() {
        return m3309(this.f5241);
    }
}
