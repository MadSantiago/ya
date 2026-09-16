package p000;

/* JADX INFO: renamed from: ۦؘٗؗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4382 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final long f14445;

    /* JADX INFO: renamed from: ۦؑ */
    public static final C0969 f14448;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C0994 f14447 = new C0994(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: ۥۗ */
    public static final C1280 f14446 = new C1280(new C4215(12), new C4215(13));

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        f14445 = jFloatToRawIntBits;
        f14448 = new C0969(new C1553(jFloatToRawIntBits));
    }
}
