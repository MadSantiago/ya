package p000;

import android.content.pm.ApplicationInfo;
import dalvik.system.PathClassLoader;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ۥؑۚؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0225 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C3223 f844;

    /* JADX INFO: renamed from: ۥۗ */
    public static boolean f845;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C0225 f846;

    static {
        new C4441(new long[]{-5340620683162104507L, -1138353990291874971L, -518638055049974670L, 8200164557447039665L, 6860847955506601085L}).toString();
        f846 = new C0225();
        f844 = new C3223(11);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m481(C0225 c0225, XC_LoadPackage.LoadPackageParam loadPackageParam, int i) {
        Object c4535;
        Object c4536;
        ClassLoader classLoader;
        ClassLoader classLoader2;
        int i2;
        C2582 c2582;
        String str;
        boolean z = (i & 1) == 0;
        C2319 c2319M210 = null;
        XC_LoadPackage.LoadPackageParam loadPackageParam2 = (i & 2) != 0 ? null : loadPackageParam;
        boolean z2 = f845;
        Object c4537 = C2358.f7817;
        if (!z2) {
            try {
                f844.getClass();
                AbstractC3801.f12618 = new C4441(new long[]{-2413392893113825620L, 1029635455481413521L, -1296537175859697984L, 3466828416808462208L}).toString();
                if (!C0113.f447 && C0113.f453 != null) {
                    String string = new C4441(new long[]{-2026401455084035745L, 4284315593109722097L, -3878418647317120955L, 4784889004641259239L, 2557225326669261923L, -7079906581691162458L, -1118305945364588652L, -540459926982546470L, -4025515116140105861L, -3250982416977684040L}).toString();
                    ArrayList arrayList = C2503.f8322;
                    C2503.m4657(4, string, null);
                    return;
                }
                C2582 c2583 = new C2582(22);
                boolean z3 = C0113.f449;
                if (C0113.m208()) {
                    C0113.f453 = c2583;
                } else {
                    ArrayList arrayList2 = C2503.f8322;
                    C2503.m4657(2, "Could not found any available Hook APIs in current environment! Aborted", null);
                }
                C0113.f447 = true;
                c4535 = c4537;
                Throwable thM405 = AbstractC0183.m405(c4535);
                if (thM405 != null) {
                    String string2 = new C4441(new long[]{-3734477406049045900L, -1301316256893566679L, -7846239939809671435L, 1480003241667237142L, -3549368938419387821L, -2081682125931126698L, -4822247222766604752L}).toString();
                    ArrayList arrayList3 = C2503.f8322;
                    C2503.m4657(4, string2, thM405);
                }
            } catch (Throwable th) {
                c4535 = new C4535(th);
            }
        }
        int i3 = (z || loadPackageParam2 == null) ? 1 : 2;
        String str2 = (loadPackageParam2 == null || (str = loadPackageParam2.packageName) == null) ? null : str;
        String str3 = loadPackageParam2 != null ? loadPackageParam2.processName : null;
        if (loadPackageParam2 == null || (classLoader = loadPackageParam2.classLoader) == null) {
            try {
                c4536 = XposedBridge.BOOTCLASSLOADER;
            } catch (Throwable th2) {
                c4536 = new C4535(th2);
            }
            if (c4536 instanceof C4535) {
                c4536 = null;
            }
            classLoader = (ClassLoader) c4536;
        }
        ClassLoader classLoader3 = classLoader;
        ApplicationInfo applicationInfo = loadPackageParam2 != null ? loadPackageParam2.appInfo : null;
        boolean z4 = C0113.f449;
        if ((AbstractC3831.m6874(str2, "com.miui.contentcatcher") || AbstractC3831.m6874(str2, "com.miui.catcherpatch")) && (classLoader2 = C0113.class.getClassLoader()) != null && AbstractC2405.m4528(classLoader2, "android.miui.R")) {
            return;
        }
        int iM6632 = AbstractC3761.m6632(i3);
        if (iM6632 != 0) {
            if (iM6632 != 1) {
                if (iM6632 != 2) {
                    C1078.m2275();
                    return;
                } else if (!C0113.m209(3, str2)) {
                    C1967.f6501.getClass();
                    if (AbstractC3831.m6874(str2, C1967.m3847())) {
                        c2319M210 = C0113.m210(3, str2, null, null, null, null, 28);
                    }
                }
            } else if (!C0113.m209(2, str2)) {
                c2319M210 = C0113.m210(2, str2, str3, classLoader3, applicationInfo, null, 32);
            }
            i2 = 1;
        } else {
            i2 = 1;
            c2319M210 = C0113.m210(1, "android", "android", classLoader3, null, null, 48);
        }
        if (c2319M210 != null) {
            try {
                int i4 = c2319M210.f7671;
                if ((i4 == i2 || (i4 != i2 && (c2319M210.f7672 instanceof PathClassLoader))) && (c2582 = C0113.f453) != null) {
                    LinkedHashMap linkedHashMap = C0113.f450;
                    String str4 = "android-zygote";
                    C4047 c4047 = (C4047) linkedHashMap.get(i4 == 1 ? "android-zygote" : c2319M210.f7670);
                    if (c4047 == null) {
                        c4047 = new C4047();
                        if (c2319M210.f7671 != 1) {
                            str4 = c2319M210.f7670;
                        }
                        linkedHashMap.put(str4, c4047);
                    }
                    c4047.f13492 = c2319M210;
                    c2582.mo211(c4047);
                }
                if (c2319M210.f7671 != i2 && c2319M210.f7670.equals(C0113.f448)) {
                    C1967 c1967 = C1967.f6501;
                    ClassLoader classLoader4 = c2319M210.f7672;
                    int i5 = c2319M210.f7671;
                    c1967.getClass();
                    C1967.m3848(classLoader4, i5);
                }
                if (c2319M210.f7671 == 2) {
                    C1967.f6501.m3852(c2319M210.f7670);
                }
            } catch (Throwable th3) {
                c4537 = new C4535(th3);
            }
            Throwable thM406 = AbstractC0183.m405(c4537);
            if (thM406 != null) {
                ArrayList arrayList4 = C2503.f8322;
                C2503.m4657(4, "An exception occurred in the Hooking Process of YukiHookAPI", thM406);
            }
        }
    }
}
