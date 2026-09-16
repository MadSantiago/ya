package p000;

/* JADX INFO: renamed from: ۦَؚٚؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4532 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C2391 f14982;

    /* JADX INFO: renamed from: ۥۗ */
    public static volatile String f14983;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3606 f14984;

    static {
        C5816 c5816 = C5816.f19149;
        int i = AbstractC4821.f15885;
        C0613 c0613 = new C0613(c5816, true, C2745.f9080);
        C3225 c3225 = new C3225();
        c3225.f10838 = c0613;
        f14982 = new C2391(16, c3225);
        f14984 = new C3606("__phenotype_server_token", c3225, "");
        f14983 = null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static String m7854() {
        return (String) f14984.get();
    }
}
