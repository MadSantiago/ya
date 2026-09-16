package p000;

/* JADX INFO: renamed from: ۥٟۙؓ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2214 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C0969 f7340 = AbstractC4489.m7811(0.0f, 0.0f, null, 7);

    /* JADX INFO: renamed from: ۥۣ */
    public static final InterfaceC5372 m4275(long j, C0969 c0969, String str, C5362 c5362, int i, int i2) {
        if ((i2 & 2) != 0) {
            c0969 = f7340;
        }
        C0969 c09610 = c0969;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        boolean zM8963 = c5362.m8963(C1327.m2824(j));
        Object objM8999 = c5362.m8999();
        if (zM8963 || objM8999 == C2850.f9517) {
            C1280 c1280 = new C1280(C1931.f6364, new C2932(8, C1327.m2824(j)));
            c5362.m8987(c1280);
            objM8999 = c1280;
        }
        return AbstractC1152.m2408(new C1327(j), (C1280) objM8999, c09610, null, str2, c5362, (i << 6) & 57344, 8);
    }
}
