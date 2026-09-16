package p000;

/* JADX INFO: renamed from: ۥٍؕۛؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0963 {

    /* JADX INFO: renamed from: ۥۣ */
    public final long f3407;

    /* JADX INFO: renamed from: ۥؗ */
    public static final float m1995(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final long m1996(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final long m1997(float f, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final float m1998(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static long m1999(long j, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final long m2000(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static String m2001(long j) {
        return "(" + m1998(j) + ", " + m1995(j) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0963) {
            return this.f3407 == ((C0963) obj).f3407;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3407);
    }

    public final String toString() {
        return m2001(this.f3407);
    }
}
