package p000;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;

/* JADX INFO: renamed from: ۥْٖؕؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1466 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final String f4981 = C1984.m3875("PackageManagerHelper");

    /* JADX INFO: renamed from: ۥۣ */
    public static void m3083(Context context, Class cls, boolean z) {
        String str = f4981;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z2 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z2 = true;
            }
            if (z == z2) {
                C1984.m3874().m3878(str, "Skipping component enablement for ".concat(cls.getName()));
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            C1984 c1984M3874 = C1984.m3874();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z ? "enabled" : "disabled");
            c1984M3874.m3878(str, sb.toString());
        } catch (Exception e) {
            C1984 c1984M3875 = C1984.m3874();
            StringBuilder sb2 = new StringBuilder(cls.getName());
            sb2.append("could not be ");
            sb2.append(z ? "enabled" : "disabled");
            String string = sb2.toString();
            if (c1984M3875.f6551 <= 3) {
                Log.d(str, string, e);
            }
        }
    }
}
