package p000;

import android.os.Build;
import dalvik.system.VMStack;

/* JADX INFO: renamed from: ۥؘٜٚؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1735 extends AbstractC2306 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C4575 f5769;

    static {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            AbstractC0186.class.getName().equals(m3543());
        } catch (Throwable unused) {
        }
        String str = Build.FINGERPRINT;
        if (str != null) {
            "robolectric".equals(str);
        }
        f5769 = new C4575(6);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static String m3543() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }
}
