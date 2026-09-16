package p000;

import android.app.AndroidAppHelper;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ۥؘٞؗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1967 {

    /* JADX INFO: renamed from: ۥؗ */
    public static boolean f6498;

    /* JADX INFO: renamed from: ۥُ */
    public static final C3369 f6499;

    /* JADX INFO: renamed from: ۥۗ */
    public static final /* synthetic */ InterfaceC0504[] f6500 = {new C0229(C1967.class, "ActivityThreadClass", "getActivityThreadClass()Ljava/lang/Class;"), new C0229(C1967.class, "ContextImplClass", "getContextImplClass()Ljava/lang/Class;"), new C0229(C1967.class, "ActivityManagerNativeClass", "getActivityManagerNativeClass()Ljava/lang/Class;"), new C0229(C1967.class, "SingletonClass", "getSingletonClass()Ljava/lang/Class;"), new C0229(C1967.class, "IActivityManagerClass", "getIActivityManagerClass()Ljava/lang/Class;"), new C0229(C1967.class, "ActivityTaskManagerClass", "getActivityTaskManagerClass()Ljava/lang/Class;"), new C0229(C1967.class, "IActivityTaskManagerClass", "getIActivityTaskManagerClass()Ljava/lang/Class;")};

    /* JADX INFO: renamed from: ۥۣ */
    public static final C1967 f6501 = new C1967();

    /* JADX INFO: renamed from: ۦؑ */
    public static final LinkedHashMap f6502;

    static {
        new LinkedHashMap();
        f6502 = new LinkedHashMap();
        f6499 = new C3369("android.app.ActivityThread");
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static String m3847() {
        String str;
        ApplicationInfo applicationInfoM3849 = m3849();
        return (applicationInfoM3849 == null || (str = applicationInfoM3849.packageName) == null) ? "android" : str;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static void m3848(ClassLoader classLoader, int i) {
        Method method;
        String str = "com.highcapable.yukihookapi.hook.xposed.bridge.status.YukiXposedModuleStatus_Impl_Impl_ru_bluecat_yandexmapspatcher" instanceof C4535 ? null : "com.highcapable.yukihookapi.hook.xposed.bridge.status.YukiXposedModuleStatus_Impl_Impl_ru_bluecat_yandexmapspatcher";
        if (str == null) {
            str = "";
        }
        int i2 = 2;
        Class clsM4531 = AbstractC2405.m4531(str, classLoader, 2);
        if (clsM4531 != null) {
            int i3 = 1;
            C4229 c4229 = new C4229(clsM4531, null, 1);
            int i4 = 3;
            c4229.f14028 = 3;
            if (i == 3) {
                C2244 c2244 = new C2244();
                c2244.f9028 = c4229;
                c2244.f9027 = "_--_";
                C3657 c3657 = (C3657) AbstractC0973.m2058(c2244.m4293());
                C5874 c5874 = new C5874(i3, i3);
                if (c3657 == null || (method = c3657.f12248) == null) {
                    return;
                }
                C5063.m8637(method, c5874);
                return;
            }
            C2244 c2245 = new C2244();
            c2245.f9028 = c4229;
            c2245.f9027 = "__--";
            C5063.m8632((C3657) AbstractC0973.m2058(c2245.m4293()), new C5874(i3, i2));
            C2244 c2246 = new C2244();
            c2246.f9028 = c4229;
            c2246.f9027 = "_-_-";
            C5063.m8632((C3657) AbstractC0973.m2058(c2246.m4293()), new C5874(i3, i4));
            C2244 c2247 = new C2244();
            c2247.f9028 = c4229;
            c2247.f9027 = "-__-";
            C5063.m8632((C3657) AbstractC0973.m2058(c2247.m4293()), new C5874(i3, 4));
            C2244 c2248 = new C2244();
            c2248.f9028 = c4229;
            c2248.f9027 = "-_-_";
            C5063.m8632((C3657) AbstractC0973.m2058(c2248.m4293()), new C5874(i3, 5));
            C2244 c2249 = new C2244();
            c2249.f9028 = c4229;
            c2249.f9027 = "___-";
            C5063.m8632((C3657) AbstractC0973.m2058(c2249.m4293()), new C5874(i3, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0089  */
    /* JADX INFO: renamed from: ۥۗ */
    public static ApplicationInfo m3849() throws IllegalAccessException {
        Object c4535;
        C3121 c3121M7163;
        Object obj;
        C3121 c3121M7164;
        try {
            c4535 = AndroidAppHelper.currentApplicationInfo();
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        ApplicationInfo applicationInfo = null;
        if (c4535 instanceof C4535) {
            c4535 = null;
        }
        ApplicationInfo applicationInfo2 = (ApplicationInfo) c4535;
        if (applicationInfo2 != null) {
            return applicationInfo2;
        }
        f6501.getClass();
        InterfaceC0504 interfaceC0504 = f6500[0];
        C3121 c3121M7158 = AbstractC4009.m7158(f6499.m6138());
        C2432 c2432 = C1940.f6401;
        ((C4229) c3121M7158.f10451).f14027 = AbstractC3925.m7053();
        c3121M7158.m5746();
        C2244 c2244M5751 = c3121M7158.m5751();
        c2244M5751.f9027 = "currentActivityThread";
        c2244M5751.f7446 = 0;
        C3657 c3657 = (C3657) AbstractC0973.m2058(c2244M5751.m4293());
        Object objM6534 = c3657 != null ? c3657.m6534(new Object[0]) : null;
        if (objM6534 != null) {
            c3121M7163 = AbstractC4009.m7163(objM6534);
            c3121M7163.m5746();
        } else {
            c3121M7163 = null;
        }
        if (c3121M7163 != null) {
            C2749 c2749M5747 = c3121M7163.m5747();
            c2749M5747.f9027 = "mBoundApplication";
            C1865 c1865 = (C1865) AbstractC0973.m2058(c2749M5747.m5108());
            if (c1865 != null) {
                c1865.m3377();
                obj = c1865.f6208.get(c1865.f10320);
            } else {
                obj = null;
            }
        } else {
            obj = null;
        }
        if (obj != null) {
            c3121M7164 = AbstractC4009.m7163(obj);
            c3121M7164.m5746();
        } else {
            c3121M7164 = null;
        }
        if (c3121M7164 != null) {
            C2749 c2749M5748 = c3121M7164.m5747();
            c2749M5748.f9027 = "appInfo";
            C1865 c1866 = (C1865) AbstractC0973.m2058(c2749M5748.m5108());
            if (c1866 != null) {
                applicationInfo = (ApplicationInfo) c1866.m3715();
            }
        }
        return applicationInfo;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static Application m3850() {
        Object c4535;
        try {
            c4535 = AndroidAppHelper.currentApplication();
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        if (c4535 instanceof C4535) {
            c4535 = null;
        }
        Application application = (Application) c4535;
        if (application != null) {
            return application;
        }
        InterfaceC0504 interfaceC0504 = f6500[0];
        C4229 c4229 = new C4229(f6499.m6138(), null, 1);
        C2432 c2432 = C1940.f6401;
        c4229.f14027 = AbstractC3925.m7053();
        c4229.f14028 = 3;
        C2244 c2244 = new C2244();
        c2244.f9028 = c4229;
        c2244.f9027 = "currentApplication";
        C3657 c3657 = (C3657) AbstractC0973.m2058(c2244.m4293());
        if (c3657 != null) {
            return (Application) c3657.m6535(new Object[0]);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static Context m3851() {
        Object c4535;
        InterfaceC0504 interfaceC0504 = f6500[0];
        C4229 c4229 = new C4229(f6499.m6138(), null, 1);
        C2432 c2432 = C1940.f6401;
        c4229.f14027 = AbstractC3925.m7053();
        c4229.f14028 = 3;
        C2244 c2244 = new C2244();
        c2244.f9028 = c4229;
        c2244.f9027 = "currentActivityThread";
        c2244.f7446 = 0;
        C3657 c3657 = (C3657) AbstractC0973.m2058(c2244.m4293());
        Object objM6534 = c3657 != null ? c3657.m6534(new Object[0]) : null;
        C2244 c2245 = new C2244();
        c2245.f9028 = c4229;
        c2245.f9027 = "getSystemContext";
        c2245.f7446 = 0;
        C3657 c3658 = (C3657) AbstractC0973.m2058(c2245.m4293());
        if (c3658 == null) {
            return null;
        }
        c3658.m5666(objM6534);
        try {
            c4535 = c3658.m6535(Arrays.copyOf(new Object[0], 0));
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        return (Context) (c4535 instanceof C4535 ? null : c4535);
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m3852(String str) {
        Method method;
        try {
            int i = 3;
            int i2 = 1;
            if (!f6502.isEmpty()) {
                C4229 c4229 = new C4229(AbstractC5041.m8557(Application.class).f10543, null, 1);
                c4229.f14028 = 3;
                C2244 c2244 = new C2244();
                c2244.f9028 = c4229;
                c2244.f9027 = "attach";
                c2244.f7447.addAll(Arrays.asList(Arrays.copyOf(new Object[]{AbstractC5041.m8557(Context.class)}, 1)));
                C5063.m8632((C3657) AbstractC0973.m2045(c2244.m4293()), new C3243(i2, i2));
                C2244 c2245 = new C2244();
                c2245.f9028 = c4229;
                c2245.f9027 = "onTerminate";
                C5063.m8632((C3657) AbstractC0973.m2045(c2245.m4293()), new C3243(i2, 2));
                C2244 c2246 = new C2244();
                c2246.f9028 = c4229;
                c2246.f9027 = "onLowMemory";
                C5063.m8632((C3657) AbstractC0973.m2045(c2246.m4293()), new C3243(i2, i));
                C2244 c2247 = new C2244();
                c2247.f9028 = c4229;
                c2247.f9027 = "onTrimMemory";
                c2247.f7447.addAll(Arrays.asList(Arrays.copyOf(new Object[]{AbstractC5041.m8557(Integer.TYPE)}, 1)));
                C5063.m8632((C3657) AbstractC0973.m2045(c2247.m4293()), new C3243(i2, 4));
                C2244 c2248 = new C2244();
                c2248.f9028 = c4229;
                c2248.f9027 = "onConfigurationChanged";
                C5063.m8632((C3657) AbstractC0973.m2045(c2248.m4293()), new C3243(i2, 0));
            }
            C4229 c42210 = new C4229(AbstractC5041.m8557(Instrumentation.class).f10543, null, 1);
            c42210.f14028 = 3;
            C2244 c2249 = new C2244();
            c2249.f9028 = c42210;
            c2249.f9027 = "callApplicationOnCreate";
            C3657 c3657 = (C3657) AbstractC0973.m2058(c2249.m4293());
            C0392 c0392 = new C0392(this, str);
            if (c3657 == null || (method = c3657.f12248) == null) {
                return;
            }
            C5063.m8637(method, c0392);
        } catch (Throwable unused) {
        }
    }
}
