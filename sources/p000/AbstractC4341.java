package p000;

/* JADX INFO: renamed from: ۦٗؑۖؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4341 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C0517 f14326;

    /* JADX INFO: renamed from: ۥۣ */
    public static final String[] f14327 = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};

    static {
        C0517 c0517;
        for (int i = 0; i < 2; i++) {
            c0517 = null;
            try {
                c0517 = (C0517) Class.forName(f14327[i]).asSubclass(C0517.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (c0517 != null) {
                f14326 = c0517;
            }
        }
        c0517 = new C0517();
        f14326 = c0517;
    }
}
