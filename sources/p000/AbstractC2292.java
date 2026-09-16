package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ۥۚؗۛؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2292 {

    /* JADX INFO: renamed from: ۥؗ */
    public static boolean f7615 = false;

    /* JADX INFO: renamed from: ۥُ */
    public static final /* synthetic */ int f7616 = 0;

    /* JADX INFO: renamed from: ۥۗ */
    public static boolean f7617 = false;

    /* JADX INFO: renamed from: ۥۣ */
    public static final AtomicBoolean f7618 = new AtomicBoolean();

    /* JADX INFO: renamed from: ۦؑ */
    public static final AtomicBoolean f7619 = new AtomicBoolean();

    /* JADX INFO: renamed from: ۥۣ */
    public static boolean m4347(Context context) {
        try {
            if (!f7615) {
                PackageInfo packageInfoM564 = C3866.m6899(context).m564(Build.VERSION.SDK_INT >= 28 ? 134217792 : 64, "com.google.android.gms");
                C3225.m5951(context);
                if (packageInfoM564 == null || C3225.m5952(packageInfoM564, false) || !C3225.m5952(packageInfoM564, true)) {
                    f7617 = false;
                } else {
                    f7617 = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
        } finally {
            f7615 = true;
        }
        return f7617 || !"user".equals(Build.TYPE);
    }
}
