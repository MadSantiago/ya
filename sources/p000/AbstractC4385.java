package p000;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: renamed from: ۦٜٗؗؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4385 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4461 f14451 = new C4461(0);

    /* JADX INFO: renamed from: ۥۗ */
    public static String m7684(Context context, String str) {
        if (str.contains("#")) {
            C1078.m2272("The passed in package cannot already have a subpackage: ".concat(str));
            return null;
        }
        String packageName = context.getPackageName();
        return AbstractC3761.m6622(new StringBuilder(str.length() + 1 + String.valueOf(packageName).length()), str, "#", packageName);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static synchronized Uri m7685() {
        C4461 c4461 = f14451;
        Uri uri = (Uri) c4461.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        c4461.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
