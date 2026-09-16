package p000;

import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ۦؐؖۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2993 {

    /* JADX INFO: renamed from: ۥُ */
    public static final String f10062;

    /* JADX INFO: renamed from: ۥّ */
    public static final C1330 f10063;

    /* JADX INFO: renamed from: ۥۜ */
    public static final int f10064;

    /* JADX INFO: renamed from: ۦؑ */
    public static final boolean f10065;

    /* JADX INFO: renamed from: ۦٛ */
    public static C2993 f10066;

    /* JADX INFO: renamed from: ۦۙ */
    public static final int f10067;

    /* JADX INFO: renamed from: ۥۗ */
    public Application f10069;

    /* JADX INFO: renamed from: ۥۣ */
    public final ConcurrentHashMap f10070 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ۥؗ */
    public final C3032 f10068 = new C3032(12, this);

    static {
        Object c4535;
        boolean z = C0113.f449;
        f10065 = C0113.m208();
        try {
            c4535 = 1785101542316L;
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        if (c4535 instanceof C4535) {
            c4535 = null;
        }
        Long l = (Long) c4535;
        f10062 = String.valueOf(l != null ? l.longValue() : 0L);
        f10063 = new C1330(null, "yuki_logger_inmemory_data_result");
        f10067 = 512000;
        f10064 = 3;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static String m5583(Context context) {
        String packageName;
        String str = C0113.f448;
        if (AbstractC0684.m1534(str)) {
            if (context == null || (packageName = context.getPackageName()) == null) {
                packageName = "";
            }
            str = packageName;
        }
        return AbstractC5078.m8670(AbstractC0684.m9760(str).toString().hashCode(), "yuki_hook_module_data_channel_");
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static String m5584(String str) {
        return AbstractC5078.m8670(AbstractC0684.m9760(str).toString().hashCode(), "yuki_hook_host_data_channel_");
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m5585(final Application application, String str) {
        this.f10069 = application;
        IntentFilter intentFilter = new IntentFilter();
        boolean z = f10065;
        intentFilter.addAction(z ? m5584(str) : m5583(application));
        C0775 c0775 = new C0775(2, this.f10068);
        if (AbstractC5551.f18327 >= 26) {
            application.registerReceiver(c0775, intentFilter, 2);
        } else {
            application.registerReceiver(c0775, intentFilter);
        }
        if (z) {
            C1489 c1489M5587 = m5587(application, str);
            final int i = 0;
            c1489M5587.m3172("module_generated_version_get", new InterfaceC4745(this) { // from class: ۥَ۟ؗٛ

                /* JADX INFO: renamed from: ۦ۟ */
                public final /* synthetic */ C2993 f8241;

                {
                    this.f8241 = this;
                }

                @Override // p000.InterfaceC4745
                /* JADX INFO: renamed from: ۦؚ */
                public final Object mo211(Object obj) {
                    int i2 = i;
                    C2358 c2358 = C2358.f7817;
                    Application application2 = application;
                    C2993 c2993 = this.f8241;
                    String str2 = (String) obj;
                    switch (i2) {
                        case 0:
                            c2993.m5587(application2, str2).m3140(C2993.f10062, "module_generated_version_result");
                            break;
                        default:
                            c2993.m5587(application2, str2).m3160(C1489.m3094(new C1330(C2503.f8322, C2993.f10063.f4598)));
                            break;
                    }
                    return c2358;
                }
            });
            final int i2 = 1;
            c1489M5587.m3172("yuki_logger_inmemory_data_get", new InterfaceC4745(this) { // from class: ۥَ۟ؗٛ

                /* JADX INFO: renamed from: ۦ۟ */
                public final /* synthetic */ C2993 f8241;

                {
                    this.f8241 = this;
                }

                @Override // p000.InterfaceC4745
                /* JADX INFO: renamed from: ۦؚ */
                public final Object mo211(Object obj) {
                    int i3 = i2;
                    C2358 c2358 = C2358.f7817;
                    Application application2 = application;
                    C2993 c2993 = this.f8241;
                    String str2 = (String) obj;
                    switch (i3) {
                        case 0:
                            c2993.m5587(application2, str2).m3140(C2993.f10062, "module_generated_version_result");
                            break;
                        default:
                            c2993.m5587(application2, str2).m3160(C1489.m3094(new C1330(C2503.f8322, C2993.f10063.f4598)));
                            break;
                    }
                    return c2358;
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m5586(Context context) {
        Object c4535;
        boolean z;
        int size;
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ComponentName componentName;
        try {
            if (!(context instanceof Application) && !f10065) {
                Context context2 = context == null ? this.f10069 : context;
                Object systemService = context2 != null ? context2.getSystemService("activity") : null;
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                if (activityManager == null || (runningTasks = activityManager.getRunningTasks(9999)) == null) {
                    size = 0;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : runningTasks) {
                        ActivityManager.RunningTaskInfo runningTaskInfo = (ActivityManager.RunningTaskInfo) obj;
                        if (AbstractC3831.m6874(context != null ? context.getClass().getName() : null, (runningTaskInfo == null || (componentName = runningTaskInfo.topActivity) == null) ? null : componentName.getClassName())) {
                            arrayList.add(obj);
                        }
                    }
                    size = arrayList.size();
                }
                z = size > 0;
            }
            c4535 = Boolean.valueOf(z);
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        Boolean bool = (Boolean) (c4535 instanceof C4535 ? null : c4535);
        if (bool != null) {
            return bool.booleanValue();
        }
        ArrayList arrayList2 = C2503.f8322;
        C2503.m4652("Couldn't got current Activity status because a SecurityException blocked it");
        return false;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final C1489 m5587(Context context, String str) {
        if (f10065 && AbstractC0684.m1534(C0113.f448)) {
            C1078.m2276("Xposed modulePackageName load failed, please reset and rebuild it");
            return null;
        }
        if (context == null) {
            context = this.f10069;
        }
        return new C1489(this, context, str);
    }
}
