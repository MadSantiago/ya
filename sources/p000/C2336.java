package p000;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: ۥؙۛؖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2336 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C2336 f7728;

    /* JADX INFO: renamed from: ۥۣ */
    public static volatile C2336 f7729;

    static {
        C2336 c2336 = new C2336();
        Map map = Collections.EMPTY_MAP;
        f7728 = c2336;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C2336 m4376() {
        C2336 c2336;
        C5734 c5734 = C5734.f18904;
        C2336 c2337 = f7729;
        if (c2337 != null) {
            return c2337;
        }
        synchronized (C2336.class) {
            try {
                c2336 = f7729;
                if (c2336 == null) {
                    Class cls = AbstractC4055.f13514;
                    C2336 c2338 = null;
                    if (cls != null) {
                        try {
                            c2338 = (C2336) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c2336 = c2338 != null ? c2338 : f7728;
                    f7729 = c2336;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2336;
    }
}
