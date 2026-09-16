package p000;

/* JADX INFO: renamed from: ۥّؕؓٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0452 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final /* synthetic */ int f1646 = 0;

    static {
        new C1007("\"\\".getBytes(AbstractC4637.f15306)).f3596 = "\"\\";
        new C1007("\t ,=".getBytes(AbstractC4637.f15306)).f3596 = "\t ,=";
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final boolean m974(C2147 c2147) {
        if (AbstractC3831.m6874((String) c2147.f7042.f9389, "HEAD")) {
            return false;
        }
        int i = c2147.f7033;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || AbstractC4031.m7226(c2147) != -1) {
            return true;
        }
        String strM8048 = c2147.f7034.m8048("Transfer-Encoding");
        if (strM8048 == null) {
            strM8048 = null;
        }
        return "chunked".equalsIgnoreCase(strM8048);
    }
}
