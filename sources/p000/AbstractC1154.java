package p000;

/* JADX INFO: renamed from: ۥّؓٙٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1154 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3059 f4008 = new C3059("SelectionHandleInfo");

    /* JADX INFO: renamed from: ۥۣ */
    public static final long m2414(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
