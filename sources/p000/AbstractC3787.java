package p000;

import android.util.Log;

/* JADX INFO: renamed from: ۦٍؕؕؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3787 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3168 f12578 = C3168.f10657;

    /* JADX INFO: renamed from: ۥؗ */
    public static final void m6702(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308, String str) {
        m6703(new C3672(abstractComponentCallbacksC0308, "Attempting to reuse fragment " + abstractComponentCallbacksC0308 + " with previous ID " + str));
        m6704(abstractComponentCallbacksC0308).getClass();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m6703(C3672 c3672) {
        if (C2790.m5261(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(c3672.f12270.getClass().getName()), c3672);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C3168 m6704(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308) {
        while (abstractComponentCallbacksC0308 != null) {
            if (abstractComponentCallbacksC0308.f1136 != null && abstractComponentCallbacksC0308.f1125) {
                abstractComponentCallbacksC0308.m657();
            }
            abstractComponentCallbacksC0308 = abstractComponentCallbacksC0308.f1144;
        }
        return f12578;
    }
}
