package p000;

/* JADX INFO: renamed from: ۦٔؖۚؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4195 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final InterfaceC1312 f13945;

    static {
        String property;
        C5136 c5136;
        InterfaceC1312 interfaceC1312;
        int i = AbstractC1768.f5896;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C0649 c0649 = AbstractC0912.f3276;
            c5136 = AbstractC5794.f19088;
            C5136 c5137 = c5136.f17018;
            if (c5136 == null) {
                interfaceC1312 = c5136;
                interfaceC1312 = RunnableC1153.f4006;
            }
        } else {
            interfaceC1312 = RunnableC1153.f4006;
        }
        interfaceC1312 = c5136;
        f13945 = interfaceC1312;
    }
}
