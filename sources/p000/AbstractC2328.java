package p000;

/* JADX INFO: renamed from: ۥُۛؕٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2328 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final boolean f7703;

    /* JADX INFO: renamed from: ۥۣ */
    public static final Class f7704;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f7704 = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f7703 = cls2 != null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static boolean m4372() {
        return (f7704 == null || f7703) ? false : true;
    }
}
