package p000;

import android.util.Log;
import de.robv.android.xposed.XposedBridge;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۥ۠ؓ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2503 {

    /* JADX INFO: renamed from: ۥؗ */
    public static boolean f8320;

    /* JADX INFO: renamed from: ۥۣ */
    public static final ArrayList f8322 = new ArrayList();

    /* JADX INFO: renamed from: ۥۗ */
    public static final C4575 f8321 = new C4575(5);

    /* JADX INFO: renamed from: ۥؗ */
    public static void m4651() {
        AbstractC4009.f13362 = 2;
        if (f8320) {
            return;
        }
        AbstractC4009.f13365 = f8321;
        f8320 = true;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static void m4652(String str) {
        m4653(4, new C4006(null, "W", String.valueOf(str), null, 55), false);
    }

    /* JADX INFO: renamed from: ۥّ */
    public static void m4653(int i, C4006 c4006, boolean z) {
        m4651();
        String str = c4006.f13355;
        boolean z2 = !AbstractC0684.m1534(str) || (AbstractC0684.m1534(str) && c4006.f13356 != null);
        int iM6632 = AbstractC3761.m6632(i);
        if (iM6632 == 0) {
            m4655(c4006);
            return;
        }
        if (iM6632 == 1) {
            m4659(z2, c4006, z);
            return;
        }
        if (iM6632 == 2) {
            boolean z3 = C0113.f449;
            if (C0113.m208()) {
                m4659(z2, c4006, z);
                return;
            } else {
                m4655(c4006);
                return;
            }
        }
        if (iM6632 != 3) {
            C1078.m2275();
            return;
        }
        m4655(c4006);
        boolean z4 = C0113.f449;
        if (C0113.m208()) {
            m4659(z2, c4006, z);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m4654(String str) {
        m4653(2, new C4006(AbstractC3801.f12618, "I", String.valueOf(str), null, 51), false);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static final void m4655(C4006 c4006) {
        String str = c4006.f13352;
        Throwable th = c4006.f13356;
        String str2 = c4006.f13355;
        String str3 = c4006.f13351;
        int iHashCode = str.hashCode();
        if (iHashCode != 68) {
            if (iHashCode != 69) {
                if (iHashCode != 73) {
                    if (iHashCode == 87 && str.equals("W")) {
                        Log.w(str3, str2, th);
                        return;
                    }
                } else if (str.equals("I")) {
                    Log.i(str3, str2, th);
                    return;
                }
            } else if (str.equals("E")) {
                Log.e(str3, str2, th);
                return;
            }
        } else if (str.equals("D")) {
            Log.d(str3, str2, th);
            return;
        }
        Log.wtf(str3, str2, th);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m4656(String str, Throwable th) {
        m4653(4, new C4006(AbstractC3801.f12618, "E", String.valueOf(str), th, 51), false);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static void m4657(int i, String str, Throwable th) {
        if ((i & 2) != 0) {
            th = null;
        }
        m4653(4, new C4006(null, "E", String.valueOf(str), th, 55), (i & 4) == 0);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static void m4658(int i, String str, Throwable th) {
        if ((i & 2) != 0) {
            th = null;
        }
        Throwable th2 = th;
        m4653((i & 8) != 0 ? 4 : 2, new C4006(AbstractC3801.f12618, "W", String.valueOf(str), th2, 51), false);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX INFO: renamed from: ۦۙ */
    public static final void m4659(boolean z, C4006 c4006, boolean z2) {
        Object c4535;
        boolean zBooleanValue;
        Object c4536;
        if (z) {
            c4006.f13354 = z2;
            String string = c4006.toString();
            Throwable th = c4006.f13356;
            int[] iArr = AbstractC2776.f9251;
            boolean zBooleanValue2 = false;
            int i = iArr[0];
            if (AbstractC1630.f5457[AbstractC3761.m6632(i)] == 1) {
                try {
                    XposedBridge.getXposedVersion();
                    c4535 = Boolean.TRUE;
                } catch (Throwable th2) {
                    c4535 = new C4535(th2);
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
            if (i != 2) {
                int i2 = iArr[0];
                if (AbstractC1630.f5457[AbstractC3761.m6632(i2)] == 1) {
                    try {
                        XposedBridge.getXposedVersion();
                        c4536 = Boolean.TRUE;
                    } catch (Throwable th3) {
                        c4536 = new C4535(th3);
                    }
                    Boolean bool2 = (Boolean) (c4536 instanceof C4535 ? null : c4536);
                    if (bool2 != null) {
                        zBooleanValue2 = bool2.booleanValue();
                    }
                }
                int iM6632 = AbstractC3761.m6632(zBooleanValue2 ? i2 : 2);
                if (iM6632 != 0) {
                    if (iM6632 != 1) {
                        C1078.m2275();
                        return;
                    } else {
                        C1078.m2276("YukiHookAPI cannot support current Hook API or cannot found any available Hook APIs in current environment");
                        return;
                    }
                }
                XposedBridge.log(string);
                if (th != null) {
                    XposedBridge.log(th);
                }
            }
        }
    }
}
