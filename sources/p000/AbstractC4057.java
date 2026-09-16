package p000;

/* JADX INFO: renamed from: ۦٍْؑ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4057 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C1298 f13516;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C4992 f13517;

    /* JADX INFO: renamed from: ۥۣ */
    public static final ExecutorC5176 f13518;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        int i = 29;
        if (property.equals("RoboVM")) {
            f13518 = null;
            f13517 = new C4992(24);
            f13516 = new C1298(i);
        } else if (property.equals("Dalvik")) {
            f13518 = new ExecutorC5176();
            f13517 = new C4854(0);
            f13516 = new C3492(i);
        } else {
            f13518 = null;
            f13517 = new C4854(1);
            f13516 = new C3492(i);
        }
    }
}
