package p000;

import android.os.Build;

/* JADX INFO: renamed from: ۦؑؑؒؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3012 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final /* synthetic */ C3012 f10149 = new C3012();

    /* JADX INFO: renamed from: ۥۗ */
    public static final String f10148 = InterfaceC1027.class.getSimpleName();

    /* JADX INFO: renamed from: ۥۣ */
    public static InterfaceC1027 m5602() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return C2402.f8007;
        }
        if (i >= 29) {
            return C1397.f4783;
        }
        return i >= 28 ? C1298.f4430 : C0373.f1366;
    }
}
