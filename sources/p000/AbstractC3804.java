package p000;

/* JADX INFO: renamed from: ۦٍؖ۠ؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3804 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4216 f12631;

    static {
        C4773.m8125(new C0871(10));
        C4773.m8125(new C0871(11));
        f12631 = new C4216(0, new C0871(12));
        C4773.m8125(new C0871(13));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final C2354 m6801(C5362 c5362) {
        C4216 c4216 = f12631;
        try {
            C0657 c0657 = (C0657) c5362.m8997(c4216);
            Object objMo449 = c0657.f2435;
            if (objMo449 == null) {
                objMo449 = c0657.f2436.mo449();
                c0657.f2435 = objMo449;
            }
            if (objMo449 != null) {
                return (C2354) objMo449;
            }
            throw new IllegalStateException("Can't retrieve Koin context value. Ensure Koin is properly initialized with startKoin() or KoinApplication.");
        } catch (Exception e) {
            C0657 c0658 = (C0657) c5362.m8997(c4216);
            Object objMo4410 = c0658.f2436.mo449();
            c0658.f2435 = objMo4410;
            C2354 c2354 = (C2354) objMo4410;
            if (c2354 != null) {
                return c2354;
            }
            C5028.m8449(e, "Can't get Koin scope due to error: ");
            return null;
        }
    }
}
