package p000;

/* JADX INFO: renamed from: ۥُٞؒ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1929 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final /* synthetic */ int f6355 = 0;

    /* JADX INFO: renamed from: ۥۣ */
    public static final long f6356 = m3791(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: ۥۗ */
    public static String m3790(long j) {
        return "InlineDensity(density=" + Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j & 4294967295L)) + ')';
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static long m3791(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }
}
