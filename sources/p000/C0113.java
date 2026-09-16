package p000;

import android.content.pm.ApplicationInfo;
import dalvik.system.PathClassLoader;
import de.robv.android.xposed.XposedBridge;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: ۥؙؐؓۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0113 {

    /* JADX INFO: renamed from: ۥؗ */
    public static boolean f444;

    /* JADX INFO: renamed from: ۥۗ */
    public static boolean f447;

    /* JADX INFO: renamed from: ۥۣ */
    public static boolean f449;

    /* JADX INFO: renamed from: ۦِ */
    public static C2885 f451;

    /* JADX INFO: renamed from: ۦۙ */
    public static C2582 f453;

    /* JADX INFO: renamed from: ۦؑ */
    public static final LinkedHashMap f450 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۥُ */
    public static final LinkedHashSet f445 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۥّ */
    public static final LinkedHashMap f446 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۥۜ */
    public static String f448 = "";

    /* JADX INFO: renamed from: ۦٛ */
    public static String f452 = "";

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX INFO: renamed from: ۥؗ */
    public static boolean m208() {
        Object c4535;
        boolean zBooleanValue;
        int i = AbstractC2776.f9251[0];
        if (AbstractC1630.f5457[AbstractC3761.m6632(i)] == 1) {
            try {
                XposedBridge.getXposedVersion();
                c4535 = Boolean.TRUE;
            } catch (Throwable th) {
                c4535 = new C4535(th);
            }
            if (c4535 instanceof C4535) {
                c4535 = null;
            }
            Boolean bool = (Boolean) c4535;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
        } else {
            zBooleanValue = false;
        }
        if (!zBooleanValue) {
            i = 2;
        }
        return i != 2 && f449;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static boolean m209(int i, String str) {
        if (str == null) {
            return false;
        }
        String str2 = str + ":" + AbstractC3761.m6624(i);
        LinkedHashSet linkedHashSet = f445;
        if (linkedHashSet.contains(str2)) {
            return true;
        }
        linkedHashSet.add(str + ":" + AbstractC3761.m6624(i));
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C2319 m210(int i, String str, String str2, ClassLoader classLoader, ApplicationInfo applicationInfo, AbstractC3013 abstractC3013, int i2) {
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        if ((i2 & 8) != 0) {
            classLoader = null;
        }
        if ((i2 & 16) != 0) {
            applicationInfo = null;
        }
        f444 = i == 1;
        LinkedHashMap linkedHashMap = f446;
        if (linkedHashMap.get(str) != null) {
            C2319 c2319 = (C2319) linkedHashMap.get(str);
            if (c2319 != null) {
                c2319.f7671 = i;
                if (str != null) {
                    if (AbstractC0684.m1534(str)) {
                        str = null;
                    }
                    if (str != null) {
                        c2319.f7670 = str;
                    }
                }
                if (str2 != null) {
                    if (AbstractC0684.m1534(str2)) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        c2319.f7668 = str2;
                    }
                }
                if (classLoader != null) {
                    ClassLoader classLoader2 = (i == 1 || (classLoader instanceof PathClassLoader)) ? classLoader : null;
                    if (classLoader2 != null) {
                        c2319.f7672 = classLoader2;
                    }
                }
                if (applicationInfo != null) {
                    c2319.f7669 = applicationInfo;
                }
                return c2319;
            }
        } else if (i == 1 || classLoader != null) {
            String str3 = str == null ? "android" : str;
            if (str2 == null) {
                str2 = "android";
            }
            if (classLoader == null) {
                classLoader = ClassLoader.getSystemClassLoader();
            }
            C2319 c23110 = new C2319();
            c23110.f7671 = i;
            c23110.f7670 = str3;
            c23110.f7668 = str2;
            c23110.f7672 = classLoader;
            c23110.f7669 = applicationInfo;
            if (str == null) {
                str = "android";
            }
            linkedHashMap.put(str, c23110);
            return c23110;
        }
        return null;
    }
}
