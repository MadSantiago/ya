package p000;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: ۥۨٚٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2955 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C2955 f9911;

    /* JADX INFO: renamed from: ۥۣ */
    public static volatile C2955 f9912;

    static {
        C2955 c2955 = new C2955();
        Map map = Collections.EMPTY_MAP;
        f9911 = c2955;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C2955 m5520() {
        C2955 c2955 = f9912;
        if (c2955 != null) {
            return c2955;
        }
        synchronized (C2955.class) {
            try {
                C2955 c2956 = f9912;
                if (c2956 != null) {
                    return c2956;
                }
                int i = AbstractC5529.f18251;
                C2955 c2955M3040 = AbstractC1434.m3040();
                f9912 = c2955M3040;
                return c2955M3040;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
