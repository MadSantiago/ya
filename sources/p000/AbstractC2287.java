package p000;

/* JADX INFO: renamed from: ۥۚؗٗؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2287 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final int f7596;

    static {
        Object c4535;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            c4535 = property != null ? AbstractC4981.m8358(property) : null;
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        Integer num = (Integer) (c4535 instanceof C4535 ? null : c4535);
        f7596 = num != null ? num.intValue() : 2097152;
    }
}
