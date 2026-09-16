package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: renamed from: ۦٟٞؕٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4802 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5086 f15840;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4802 f15841 = new C4802();

    static {
        C0639 c0639 = new C0639();
        c0639.m1457(C4193.class, C3876.f12928);
        c0639.m1457(C5314.class, C2852.f9532);
        c0639.m1457(C1760.class, C5185.f17147);
        c0639.m1457(C5899.class, C2170.f7166);
        c0639.m1457(C1045.class, C1105.f3889);
        c0639.m1457(C2271.class, C5866.f19375);
        c0639.f2395 = true;
        f15840 = new C5086(26, c0639);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C5899 m8180(C0377 c0377) throws PackageManager.NameNotFoundException {
        c0377.m825();
        Context context = c0377.f1410;
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        c0377.m825();
        String str = c0377.f1405.f9266;
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        String str4 = packageInfo.versionName;
        if (str4 == null) {
            str4 = strValueOf;
        }
        String str5 = Build.MANUFACTURER;
        c0377.m825();
        C2271 c2271M2147 = AbstractC0993.m2147(context);
        c0377.m825();
        return new C5899(str, new C1045(packageName, str4, strValueOf, c2271M2147, AbstractC0993.m2133(context)));
    }
}
