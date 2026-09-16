package p000;

import android.R;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: ۦؘ۠ؒؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5378 {

    /* JADX INFO: renamed from: ۥَ */
    public static C3963 f17757;

    /* JADX INFO: renamed from: ۥُ */
    public static final C5536 f17758;

    /* JADX INFO: renamed from: ۥّ */
    public static final C5536 f17759;

    /* JADX INFO: renamed from: ۥْ */
    public static boolean f17760;

    /* JADX INFO: renamed from: ۥٓ */
    public static int f17761;

    /* JADX INFO: renamed from: ۥۜ */
    public static final C5536 f17763;

    /* JADX INFO: renamed from: ۦِ */
    public static final C5536 f17768;

    /* JADX INFO: renamed from: ۦٛ */
    public static final C5536 f17769;

    /* JADX INFO: renamed from: ۦۗ */
    public static final C5536 f17770;

    /* JADX INFO: renamed from: ۦۙ */
    public static final C5536 f17771;

    /* JADX INFO: renamed from: ۥۣ */
    public static final float[][] f17764 = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: ۥۗ */
    public static final float[][] f17762 = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: ۥؗ */
    public static final float[] f17756 = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: ۦؑ */
    public static final float[][] f17765 = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: ۦؚ */
    public static final C1017 f17766 = new C1017(false);

    /* JADX INFO: renamed from: ۦٌ */
    public static final C1017 f17767 = new C1017(true);

    /* JADX INFO: renamed from: ۦۚ */
    public static final StackTraceElement[] f17772 = new StackTraceElement[0];

    /* JADX INFO: renamed from: ۦۨ */
    public static final Object f17774 = new Object();

    /* JADX INFO: renamed from: ۦ۟ */
    public static final Object f17773 = new Object();

    static {
        int i = 2;
        f17758 = new C5536(i, "UNDEFINED");
        f17759 = new C5536(i, "REUSABLE_CLAIMED");
        f17771 = new C5536(i, "COMPLETING_ALREADY");
        f17763 = new C5536(i, "COMPLETING_WAITING_CHILDREN");
        f17769 = new C5536(i, "COMPLETING_RETRY");
        f17768 = new C5536(i, "TOO_LATE_TO_CANCEL");
        f17770 = new C5536(i, "SEALED");
    }

    /* JADX INFO: renamed from: ۥؓ */
    public static final Object m9032(Object[] objArr, InterfaceC4448 interfaceC4448, C5362 c5362) {
        return m9054(Arrays.copyOf(objArr, objArr.length), AbstractC5537.f18283, interfaceC4448, c5362, 3456);
    }

    /* JADX INFO: renamed from: ۥؔ */
    public static final Object m9033(Object obj) {
        C1348 c1348 = obj instanceof C1348 ? (C1348) obj : null;
        return c1348 != null ? c1348.f4637 : obj;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static final void m9034(C0126 c0126, InterfaceC4790 interfaceC4790, int i) {
        while (true) {
            int i2 = c0126.f503;
            if (i > i2 && i < c0126.f498) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            c0126.m260();
            if (c0126.m259(c0126.f503)) {
                interfaceC4790.mo2820();
            }
            c0126.m263();
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final void m9035(C5817 c5817, C3129 c3129) {
        C2542 c2542 = c3129.f10476;
        C3262 c3262 = c2542.f8490;
        Object objM6027 = c2542.f8490.m6027(AbstractC2771.f9196);
        if (objM6027 == null) {
            objM6027 = null;
        }
        C2155 c2155 = (C2155) objM6027;
        if (AbstractC1605.m3367(c3129)) {
            if (c2155 != null && c2155.f7116 == 8) {
                return;
            }
            Object objM6028 = c3262.m6027(AbstractC0208.f770);
            if (objM6028 == null) {
                objM6028 = null;
            }
            C0078 c0078 = (C0078) objM6028;
            if (c0078 != null) {
                c5817.m9630(new C5464(R.id.accessibilityActionPageUp, c0078.f14721));
            }
            Object objM6029 = c3262.m6027(AbstractC0208.f760);
            if (objM6029 == null) {
                objM6029 = null;
            }
            C0078 c0079 = (C0078) objM6029;
            if (c0079 != null) {
                c5817.m9630(new C5464(R.id.accessibilityActionPageDown, c0079.f14721));
            }
            Object objM60210 = c3262.m6027(AbstractC0208.f761);
            if (objM60210 == null) {
                objM60210 = null;
            }
            C0078 c00710 = (C0078) objM60210;
            if (c00710 != null) {
                c5817.m9630(new C5464(R.id.accessibilityActionPageLeft, c00710.f14721));
            }
            Object objM60211 = c3262.m6027(AbstractC0208.f775);
            C0078 c00711 = (C0078) (objM60211 != null ? objM60211 : null);
            if (c00711 != null) {
                c5817.m9630(new C5464(R.id.accessibilityActionPageRight, c00711.f14721));
            }
        }
    }

    /* JADX INFO: renamed from: ۥً */
    public static final Object m9036(Object[] objArr, InterfaceC2856 interfaceC2856, InterfaceC4448 interfaceC4448, C5362 c5362, int i) {
        return m9054(Arrays.copyOf(objArr, objArr.length), interfaceC2856, interfaceC4448, c5362, ((i << 3) & 7168) | 384);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۥَ */
    public static final Class m9037(C3131 c3131) {
        Class cls = c3131.f10543;
        if (cls.isPrimitive()) {
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public static Object m9038(C3580 c3580, long j) throws TimeoutException {
        AbstractC0487.m1093("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            C1078.m2276("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        AbstractC0487.m1048(c3580, "Task must not be null");
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC0487.m1048(timeUnit, "TimeUnit must not be null");
        if (c3580.m6398()) {
            return m9052(c3580);
        }
        C1039 c1039 = new C1039(26);
        Executor executor = AbstractC4007.f13359;
        c3580.m6389(executor, c1039);
        c3580.m6391(executor, c1039);
        c3580.f11911.m9159(new C3517(executor, (InterfaceC2342) c1039));
        c3580.m6400();
        if (((CountDownLatch) c1039.f3672).await(j, timeUnit)) {
            return m9052(c3580);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* JADX INFO: renamed from: ۥّ */
    public static C3580 m9039(Executor executor, Callable callable) {
        AbstractC0487.m1048(executor, "Executor must not be null");
        C3580 c3580 = new C3580();
        executor.execute(new RunnableC5413(11, c3580, callable));
        return c3580;
    }

    /* JADX INFO: renamed from: ۥْ */
    public static C0822 m9040(String str) {
        Matcher matcher = C0822.f2914.matcher(str);
        if (!matcher.lookingAt()) {
            C1078.m2273(AbstractC5078.m8669('\"', "No subtype found for: \"", str));
            return null;
        }
        String strGroup = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = strGroup.toLowerCase(locale);
        matcher.group(2).toLowerCase(locale);
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = C0822.f2913.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(iEnd) + "\" for: \"" + str + '\"').toString());
            }
            String strGroup2 = matcher2.group(1);
            if (strGroup2 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup3 = matcher2.group(2);
                if (strGroup3 == null) {
                    strGroup3 = matcher2.group(3);
                } else if (strGroup3.startsWith("'") && strGroup3.endsWith("'") && strGroup3.length() > 2) {
                    strGroup3 = strGroup3.substring(1, strGroup3.length() - 1);
                }
                arrayList.add(strGroup2);
                arrayList.add(strGroup3);
                iEnd = matcher2.end();
            }
        }
        return new C0822(str, lowerCase, (String[]) arrayList.toArray(new String[0]));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۥٓ */
    public static final Class m9041(C3131 c3131) {
        Class cls = c3131.f10543;
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return cls;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public static final void m9042(AbstractC2132 abstractC2132, InterfaceC3534 interfaceC3534, Runnable runnable) throws C0768 {
        try {
            abstractC2132.mo1466(interfaceC3534, runnable);
        } catch (Throwable th) {
            throw new C0768(th, abstractC2132, interfaceC3534);
        }
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static final int m9043(C3828 c3828, int i) {
        C2537 c2537 = c3828.f12697;
        C2276 c2276 = c3828.f12696;
        if (c2537.f8430.f4307.length() != 0) {
            int iM4335 = c2276.m4335(i);
            if ((i != 0 && iM4335 == c2276.m4335(i - 1)) || (i != c2537.f8430.f4307.length() && iM4335 == c2276.m4335(i + 1))) {
                return c3828.m6828(i);
            }
        }
        return c3828.m6831(i);
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public static float m9044() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static float m9045(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: ۥٛ */
    public static int m9046(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥۖ */
    public static final void m9047(InterfaceC0951 interfaceC0951) {
        if (((AbstractC5381) interfaceC0951).f17791.f17786) {
            AbstractC5537.m9245(interfaceC0951, 1).m9779();
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m9048(C0857 c0857, C5362 c5362, int i) {
        c5362.m8979(-709502251);
        int i2 = 1;
        if (c5362.m9011(i & 1, (i & 3) != 2)) {
            AbstractC2266 abstractC2266 = AbstractC3198.f10737;
            Object obj = (InterfaceC0814) c5362.m8997(abstractC2266);
            c5362.m8957(1967007413);
            Object[] objArr = new Object[0];
            Object objM8999 = c5362.m8999();
            Object obj2 = C2850.f9517;
            if (objM8999 == obj2) {
                objM8999 = new C2971(i2);
                c5362.m8987(objM8999);
            }
            C5108 c5108 = (C5108) m9036(objArr, C5108.f16950, (InterfaceC4448) objM8999, c5362, 384);
            c5108.f16951 = (InterfaceC0814) c5362.m8997(abstractC2266);
            c5362.m9009(false);
            Object[] objArr2 = {obj};
            int i3 = 7;
            C2346 c2346 = new C2346(i3, new C4876(i3), new C0079(18, obj, c5108));
            boolean zM8977 = c5362.m8977(obj) | c5362.m8977(c5108);
            Object objM89910 = c5362.m8999();
            if (zM8977 || objM89910 == obj2) {
                objM89910 = new C1225(15, obj, c5108);
                c5362.m8987(objM89910);
            }
            Object obj3 = (C2069) m9036(objArr2, c2346, (InterfaceC4448) objM89910, c5362, 0);
            C4773.m8137(abstractC2266.mo4313(obj3), AbstractC3925.m7034(-412824043, new C4762(11, c0857, obj3), c5362), c5362, 56);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4904(c0857, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۥۙ */
    public static final boolean m9049(AbstractC2132 abstractC2132, InterfaceC3534 interfaceC3534) throws C0768 {
        try {
            return abstractC2132.mo4118(interfaceC3534);
        } catch (Throwable th) {
            throw new C0768(th, abstractC2132, interfaceC3534);
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static final Object m9050(C1870 c1870, int i) {
        Object obj;
        int iM4217 = AbstractC2164.m4217(c1870.f6215, i, c1870.f6217);
        if (iM4217 < 0 || (obj = c1870.f6216[iM4217]) == f17774) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m9051(C3635 c3635, C0857 c0857, C5362 c5362, int i) {
        int i2;
        InterfaceC0705 interfaceC0705M8118;
        c5362.m8979(1533506138);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (c5362.m8977(c3635) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5362.m8977(c0857) ? 32 : 16;
        }
        int i4 = 0;
        if (c5362.m9011(i2 & 1, (i2 & 19) != 18)) {
            c5362.m8957(-885604480);
            if (c3635.m6483()) {
                InterfaceC0443 interfaceC0443 = null;
                interfaceC0705M8118 = C4773.m8118(AbstractC2133.m4148(new C3592(c3635, interfaceC0443, i4)), c3635.f12154, new C4846(c3635, interfaceC0443, i3), new C3742(c3635, interfaceC0443, i4), new C3226(c3635, i3));
            } else {
                interfaceC0705M8118 = C4217.f13994;
            }
            AbstractC2164.m4194(interfaceC0705M8118, c0857, c5362, i2 & 112);
            c5362.m9009(false);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C3099(c3635, c0857, i, i4);
        }
    }

    /* JADX INFO: renamed from: ۥۤ */
    public static Object m9052(C3580 c3580) throws ExecutionException {
        if (c3580.m6390()) {
            return c3580.m6388();
        }
        if (c3580.f11913) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(c3580.m6387());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [ۦٌُٝؔ] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX INFO: renamed from: ۥۦ */
    public static final void m9053(InterfaceC3975 interfaceC3975, Object obj, InterfaceC4745 interfaceC4745) {
        C2457 c2457;
        if (!((AbstractC5381) interfaceC3975).f17791.f17786) {
            AbstractC3480.m6278("visitAncestors called on an unattached node");
        }
        AbstractC5381 abstractC5381 = ((AbstractC5381) interfaceC3975).f17791.f17780;
        C0605 c0605M9270 = AbstractC5537.m9270(interfaceC3975);
        while (c0605M9270 != null) {
            if ((((AbstractC5381) c0605M9270.f2256.f8210).f17782 & 262144) != 0) {
                while (abstractC5381 != null) {
                    if ((abstractC5381.f17781 & 262144) != 0) {
                        ?? M9233 = abstractC5381;
                        ?? c0863 = 0;
                        while (M9233 != 0) {
                            if (M9233 instanceof InterfaceC0289) {
                                InterfaceC0289 interfaceC0289 = (InterfaceC0289) M9233;
                                if (!(obj.equals(interfaceC0289.mo612()) ? ((Boolean) interfaceC4745.mo211(interfaceC0289)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((M9233.f17781 & 262144) != 0 && (M9233 instanceof AbstractC3019)) {
                                AbstractC5381 abstractC5382 = ((AbstractC3019) M9233).f10167;
                                int i = 0;
                                while (abstractC5382 != null) {
                                    if ((abstractC5382.f17781 & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            M9233 = M9233;
                                            c0863 = c0863;
                                            c0863 = c0863;
                                            M9233 = abstractC5382;
                                        } else {
                                            if (c0863 == 0) {
                                                c0863 = new C0863(new AbstractC5381[16]);
                                            }
                                            if (M9233 != 0) {
                                                c0863.m1843(M9233);
                                                M9233 = 0;
                                            }
                                            c0863.m1843(abstractC5382);
                                        }
                                    } else {
                                        M9233 = M9233;
                                        c0863 = c0863;
                                    }
                                    abstractC5382 = abstractC5382.f17783;
                                    M9233 = M9233;
                                    c0863 = c0863;
                                }
                                if (i == 1) {
                                    M9233 = M9233;
                                    c0863 = c0863;
                                } else {
                                    M9233 = M9233;
                                    c0863 = c0863;
                                }
                            }
                            M9233 = AbstractC5537.m9233(c0863);
                        }
                    }
                    abstractC5381 = abstractC5381.f17780;
                }
            }
            c0605M9270 = c0605M9270.m1356();
            abstractC5381 = (c0605M9270 == null || (c2457 = c0605M9270.f2256) == null) ? null : (C1850) c2457.f8202;
        }
    }

    /* JADX INFO: renamed from: ۥۧ */
    public static final Object m9054(Object[] objArr, InterfaceC2856 interfaceC2856, InterfaceC4448 interfaceC4448, C5362 c5362, int i) {
        Object[] objArr2;
        InterfaceC2856 interfaceC2857;
        final Object obj;
        Object objMo1713;
        long j = c5362.f17657;
        AbstractC2133.m4156(36);
        final String string = Long.toString(j, 36);
        final InterfaceC0814 interfaceC0814 = (InterfaceC0814) c5362.m8997(AbstractC3198.f10737);
        Object objM8999 = c5362.m8999();
        Object obj2 = C2850.f9517;
        if (objM8999 == obj2) {
            Object objMo3466 = (interfaceC0814 == null || (objMo1713 = interfaceC0814.mo1713(string)) == null) ? null : interfaceC2856.mo3466(objMo1713);
            if (objMo3466 == null) {
                objMo3466 = interfaceC4448.mo449();
            }
            objArr2 = objArr;
            interfaceC2857 = interfaceC2856;
            Object c5869 = new C5869(interfaceC2857, interfaceC0814, string, objMo3466, objArr2);
            c5362.m8987(c5869);
            objM8999 = c5869;
        } else {
            objArr2 = objArr;
            interfaceC2857 = interfaceC2856;
        }
        final C5869 c58610 = (C5869) objM8999;
        Object objMo449 = Arrays.equals(objArr2, c58610.f19381) ? c58610.f19383 : null;
        if (objMo449 == null) {
            objMo449 = interfaceC4448.mo449();
        }
        boolean zM8977 = c5362.m8977(c58610) | ((((i & 112) ^ 48) > 32 && c5362.m8977(interfaceC2857)) || (i & 48) == 32) | c5362.m8977(interfaceC0814) | c5362.m8963(string) | c5362.m8977(objMo449) | c5362.m8977(objArr2);
        Object objM89910 = c5362.m8999();
        if (zM8977 || objM89910 == obj2) {
            final Object[] objArr3 = objArr2;
            obj = objMo449;
            final InterfaceC2856 interfaceC2858 = interfaceC2857;
            Object obj3 = new InterfaceC4448() { // from class: ۦُِؗۚ
                @Override // p000.InterfaceC4448
                /* JADX INFO: renamed from: ۥۣ */
                public final Object mo449() {
                    boolean z;
                    C5869 c58611 = c58610;
                    InterfaceC0814 interfaceC0815 = c58611.f19386;
                    InterfaceC0814 interfaceC0816 = interfaceC0814;
                    boolean z2 = true;
                    if (interfaceC0815 != interfaceC0816) {
                        c58611.f19386 = interfaceC0816;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = c58611.f19382;
                    String str2 = string;
                    if (AbstractC3831.m6874(str, str2)) {
                        z2 = z;
                    } else {
                        c58611.f19382 = str2;
                    }
                    c58611.f19387 = interfaceC2858;
                    c58611.f19383 = obj;
                    c58611.f19381 = objArr3;
                    InterfaceC0468 interfaceC0468 = c58611.f19384;
                    if (interfaceC0468 != null && z2) {
                        ((C2808) interfaceC0468).m5350();
                        c58611.f19384 = null;
                        c58611.m9686();
                    }
                    return C2358.f7817;
                }
            };
            c5362.m8987(obj3);
            objM89910 = obj3;
        } else {
            obj = objMo449;
        }
        AbstractC3925.m7040((InterfaceC4448) objM89910, c5362);
        return obj;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static Object m9055(C3580 c3580) throws InterruptedException {
        AbstractC0487.m1093("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            C1078.m2276("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        if (c3580.m6398()) {
            return m9052(c3580);
        }
        C1039 c1039 = new C1039(26);
        Executor executor = AbstractC4007.f13359;
        c3580.m6389(executor, c1039);
        c3580.m6391(executor, c1039);
        c3580.f11911.m9159(new C3517(executor, (InterfaceC2342) c1039));
        c3580.m6400();
        ((CountDownLatch) c1039.f3672).await();
        return m9052(c3580);
    }

    /* JADX INFO: renamed from: ۦؖ */
    public static String m9056(long j) {
        return "PointerId(value=" + j + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, ۥؒۛؒ, ۦٌِؕۤ] */
    /* JADX WARN: Type inference failed for: r11v0, types: [ۦٌُٝؔ] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX INFO: renamed from: ۦؗ */
    public static final void m9057(InterfaceC0289 interfaceC0289, InterfaceC4745 interfaceC4745) {
        C2457 c2457;
        AbstractC5381 abstractC5381 = (AbstractC5381) interfaceC0289;
        if (!abstractC5381.f17791.f17786) {
            AbstractC3480.m6278("visitAncestors called on an unattached node");
        }
        AbstractC5381 abstractC5382 = abstractC5381.f17791.f17780;
        C0605 c0605M9270 = AbstractC5537.m9270(interfaceC0289);
        while (c0605M9270 != null) {
            if ((((AbstractC5381) c0605M9270.f2256.f8210).f17782 & 262144) != 0) {
                while (abstractC5382 != null) {
                    if ((abstractC5382.f17781 & 262144) != 0) {
                        ?? M9233 = abstractC5382;
                        ?? c0863 = 0;
                        while (M9233 != 0) {
                            boolean zBooleanValue = true;
                            if (M9233 instanceof InterfaceC0289) {
                                InterfaceC0289 interfaceC02810 = (InterfaceC0289) M9233;
                                if (AbstractC3831.m6874(interfaceC0289.mo612(), interfaceC02810.mo612()) && interfaceC0289.getClass() == interfaceC02810.getClass()) {
                                    zBooleanValue = ((Boolean) interfaceC4745.mo211(interfaceC02810)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else if ((M9233.f17781 & 262144) != 0 && (M9233 instanceof AbstractC3019)) {
                                AbstractC5381 abstractC5383 = ((AbstractC3019) M9233).f10167;
                                int i = 0;
                                while (abstractC5383 != null) {
                                    if ((abstractC5383.f17781 & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            M9233 = M9233;
                                            c0863 = c0863;
                                            c0863 = c0863;
                                            M9233 = abstractC5383;
                                        } else {
                                            if (c0863 == 0) {
                                                c0863 = new C0863(new AbstractC5381[16]);
                                            }
                                            if (M9233 != 0) {
                                                c0863.m1843(M9233);
                                                M9233 = 0;
                                            }
                                            c0863.m1843(abstractC5383);
                                        }
                                    } else {
                                        M9233 = M9233;
                                        c0863 = c0863;
                                    }
                                    abstractC5383 = abstractC5383.f17783;
                                    M9233 = M9233;
                                    c0863 = c0863;
                                }
                                if (i == 1) {
                                    M9233 = M9233;
                                    c0863 = c0863;
                                } else {
                                    M9233 = M9233;
                                    c0863 = c0863;
                                }
                            }
                            M9233 = AbstractC5537.m9233(c0863);
                        }
                    }
                    abstractC5382 = abstractC5382.f17780;
                }
            }
            c0605M9270 = c0605M9270.m1356();
            abstractC5382 = (c0605M9270 == null || (c2457 = c0605M9270.f2256) == null) ? null : (C1850) c2457.f8202;
        }
    }

    /* JADX INFO: renamed from: ۦؙ */
    public static void m9058(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            AbstractC5604.m9452(window, z);
        } else {
            if (i >= 30) {
                AbstractC5604.m9451(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: ۦؚ */
    public static final Object m9059(InterfaceC4707 interfaceC4707, AbstractC0772 abstractC0772) {
        C3201 c3201;
        C5450 c5450;
        C0069 e;
        C0874 c0874;
        C5536 c5536 = AbstractC2776.f9256;
        if (abstractC0772 instanceof C3201) {
            c3201 = (C3201) abstractC0772;
            int i = c3201.f10743;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3201.f10743 = i - Integer.MIN_VALUE;
            } else {
                c3201 = new C3201(abstractC0772);
            }
        } else {
            c3201 = new C3201(abstractC0772);
        }
        Object obj = c3201.f10742;
        int i2 = c3201.f10743;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            c5450 = new C5450();
            c5450.f17965 = c5536;
            C0874 c0875 = new C0874(c5450, 0);
            try {
                c3201.f10741 = c5450;
                c3201.f10740 = c0875;
                c3201.f10743 = 1;
                Object objMo1575 = interfaceC4707.mo1575(c0875, c3201);
                Object obj2 = EnumC2282.f7590;
                if (objMo1575 == obj2) {
                    return obj2;
                }
            } catch (C0069 e2) {
                e = e2;
                c0874 = c0875;
                if (e.f13147 == c0874) {
                    throw e;
                }
                AbstractC5568.m9360(c3201.f2791);
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0874 = c3201.f10740;
            c5450 = c3201.f10741;
            try {
                AbstractC0186.m409(obj);
            } catch (C0069 e3) {
                e = e3;
                if (e.f13147 == c0874) {
                    throw e;
                }
                AbstractC5568.m9360(c3201.f2791);
            }
        }
        Object obj3 = c5450.f17965;
        if (obj3 != c5536) {
            return obj3;
        }
        C0178.m384("Expected at least one element");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: ۦٌ */
    public static final Object m9060(InterfaceC4707 interfaceC4707, InterfaceC5731 interfaceC5731, AbstractC0772 abstractC0772) {
        C3835 c3835;
        C5450 c5450;
        C0069 e;
        C5803 c5803;
        C5536 c5536 = AbstractC2776.f9256;
        if (abstractC0772 instanceof C3835) {
            c3835 = (C3835) abstractC0772;
            int i = c3835.f12729;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3835.f12729 = i - Integer.MIN_VALUE;
            } else {
                c3835 = new C3835(abstractC0772);
            }
        } else {
            c3835 = new C3835(abstractC0772);
        }
        Object obj = c3835.f12728;
        int i2 = c3835.f12729;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            C5450 c5451 = new C5450();
            c5451.f17965 = c5536;
            C5803 c5804 = new C5803(i3, interfaceC5731, c5451);
            try {
                c3835.f12727 = c5451;
                c3835.f12726 = c5804;
                c3835.f12729 = 1;
                Object objMo1575 = interfaceC4707.mo1575(c5804, c3835);
                Object obj2 = EnumC2282.f7590;
                if (objMo1575 == obj2) {
                    return obj2;
                }
                c5450 = c5451;
            } catch (C0069 e2) {
                c5450 = c5451;
                e = e2;
                c5803 = c5804;
                if (e.f13147 == c5803) {
                    throw e;
                }
                AbstractC5568.m9360(c3835.f2791);
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c5803 = c3835.f12726;
            c5450 = c3835.f12727;
            try {
                AbstractC0186.m409(obj);
            } catch (C0069 e3) {
                e = e3;
                if (e.f13147 == c5803) {
                    throw e;
                }
                AbstractC5568.m9360(c3835.f2791);
            }
        }
        Object obj3 = c5450.f17965;
        if (obj3 != c5536) {
            return obj3;
        }
        C0178.m384("Expected at least one element matching the predicate");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [ۦٌُٝؔ] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX INFO: renamed from: ۦُ */
    public static final void m9061(AbstractC5381 abstractC5381, String str, InterfaceC4745 interfaceC4745) {
        if (!abstractC5381.f17791.f17786) {
            AbstractC3480.m6278("visitSubtreeIf called on an unattached node");
        }
        C0863 c0863 = new C0863(new AbstractC5381[16]);
        AbstractC5381 abstractC5382 = abstractC5381.f17791;
        AbstractC5381 abstractC5383 = abstractC5382.f17783;
        if (abstractC5383 == null) {
            AbstractC5537.m9249(c0863, abstractC5382);
        } else {
            c0863.m1843(abstractC5383);
        }
        while (true) {
            int i = c0863.f3180;
            if (i == 0) {
                return;
            }
            AbstractC5381 abstractC5384 = (AbstractC5381) c0863.m1850(i - 1);
            if ((abstractC5384.f17782 & 262144) != 0) {
                AbstractC5381 abstractC5385 = abstractC5384;
                while (true) {
                    if (abstractC5385 != null && abstractC5385.f17786) {
                        if ((abstractC5385.f17781 & 262144) != 0) {
                            ?? M9233 = abstractC5385;
                            ?? c0864 = 0;
                            while (M9233 != 0) {
                                if (M9233 instanceof InterfaceC0289) {
                                    InterfaceC0289 interfaceC0289 = (InterfaceC0289) M9233;
                                    EnumC1848 enumC1848 = str.equals(interfaceC0289.mo612()) ? (EnumC1848) interfaceC4745.mo211(interfaceC0289) : EnumC1848.f6133;
                                    if (enumC1848 != EnumC1848.f6130) {
                                        if (enumC1848 == EnumC1848.f6132) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((M9233.f17781 & 262144) != 0 && (M9233 instanceof AbstractC3019)) {
                                    AbstractC5381 abstractC5386 = ((AbstractC3019) M9233).f10167;
                                    int i2 = 0;
                                    M9233 = M9233;
                                    c0864 = c0864;
                                    while (abstractC5386 != null) {
                                        if ((abstractC5386.f17781 & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                c0864 = c0864;
                                                M9233 = abstractC5386;
                                            } else {
                                                if (c0864 == 0) {
                                                    c0864 = new C0863(new AbstractC5381[16]);
                                                }
                                                if (M9233 != 0) {
                                                    c0864.m1843(M9233);
                                                    M9233 = 0;
                                                }
                                                c0864.m1843(abstractC5386);
                                            }
                                        }
                                        abstractC5386 = abstractC5386.f17783;
                                        M9233 = M9233;
                                        c0864 = c0864;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M9233 = AbstractC5537.m9233(c0864);
                            }
                        }
                        abstractC5385 = abstractC5385.f17783;
                    }
                }
            }
            AbstractC5537.m9249(c0863, abstractC5384);
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public static final boolean m9062(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static int m9063(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        C5028.m8448(AbstractC5078.m8679("PROTOCOL_ERROR padding ", i3, i, " > remaining length "));
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, ۥؒۛؒ] */
    /* JADX WARN: Type inference failed for: r13v0, types: [ۦٌُٝؔ] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: ۦٖ */
    public static final void m9064(InterfaceC0289 interfaceC0289, InterfaceC4745 interfaceC4745) {
        AbstractC5381 abstractC5381 = (AbstractC5381) interfaceC0289;
        if (!abstractC5381.f17791.f17786) {
            AbstractC3480.m6278("visitSubtreeIf called on an unattached node");
        }
        C0863 c0863 = new C0863(new AbstractC5381[16]);
        AbstractC5381 abstractC5382 = abstractC5381.f17791;
        AbstractC5381 abstractC5383 = abstractC5382.f17783;
        if (abstractC5383 == null) {
            AbstractC5537.m9249(c0863, abstractC5382);
        } else {
            c0863.m1843(abstractC5383);
        }
        while (true) {
            int i = c0863.f3180;
            if (i == 0) {
                return;
            }
            AbstractC5381 abstractC5384 = (AbstractC5381) c0863.m1850(i - 1);
            if ((abstractC5384.f17782 & 262144) != 0) {
                AbstractC5381 abstractC5385 = abstractC5384;
                while (true) {
                    if (abstractC5385 != null && abstractC5385.f17786) {
                        if ((abstractC5385.f17781 & 262144) != 0) {
                            ?? M9233 = abstractC5385;
                            ?? c0864 = 0;
                            while (M9233 != 0) {
                                if (M9233 instanceof InterfaceC0289) {
                                    InterfaceC0289 interfaceC02810 = (InterfaceC0289) M9233;
                                    EnumC1848 enumC1848 = (AbstractC3831.m6874(interfaceC0289.mo612(), interfaceC02810.mo612()) && interfaceC0289.getClass() == interfaceC02810.getClass()) ? (EnumC1848) interfaceC4745.mo211(interfaceC02810) : EnumC1848.f6133;
                                    if (enumC1848 != EnumC1848.f6130) {
                                        if (enumC1848 == EnumC1848.f6132) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((M9233.f17781 & 262144) != 0 && (M9233 instanceof AbstractC3019)) {
                                    AbstractC5381 abstractC5386 = ((AbstractC3019) M9233).f10167;
                                    int i2 = 0;
                                    M9233 = M9233;
                                    c0864 = c0864;
                                    while (abstractC5386 != null) {
                                        if ((abstractC5386.f17781 & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                c0864 = c0864;
                                                M9233 = abstractC5386;
                                            } else {
                                                if (c0864 == 0) {
                                                    c0864 = new C0863(new AbstractC5381[16]);
                                                }
                                                if (M9233 != 0) {
                                                    c0864.m1843(M9233);
                                                    M9233 = 0;
                                                }
                                                c0864.m1843(abstractC5386);
                                            }
                                        }
                                        abstractC5386 = abstractC5386.f17783;
                                        M9233 = M9233;
                                        c0864 = c0864;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M9233 = AbstractC5537.m9233(c0864);
                            }
                        }
                        abstractC5385 = abstractC5385.f17783;
                    }
                }
            }
            AbstractC5537.m9249(c0863, abstractC5384);
        }
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static final void m9065(InterfaceC3534 interfaceC3534, Throwable th) {
        Throwable runtimeException;
        Iterator it = AbstractC3774.f12546.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC3500) it.next()).mo1639(interfaceC3534, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC5537.m9223(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            AbstractC5537.m9223(th, new C2598(interfaceC3534));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: ۦٚ */
    public static final void m9066(InterfaceC0443 interfaceC0443, Object obj) throws C0768 {
        if (!(interfaceC0443 instanceof C4437)) {
            interfaceC0443.mo335(obj);
            return;
        }
        C4437 c4437 = (C4437) interfaceC0443;
        AbstractC2132 abstractC2132 = c4437.f14627;
        AbstractC0772 abstractC0772 = c4437.f14626;
        Throwable thM405 = AbstractC0183.m405(obj);
        Object c5036 = thM405 == null ? obj : new C5036(thM405, false);
        if (m9049(abstractC2132, abstractC0772.mo334())) {
            c4437.f14628 = c5036;
            c4437.f18326 = 1;
            m9042(abstractC2132, abstractC0772.mo334(), c4437);
            return;
        }
        AbstractC5596 abstractC5596M7538 = AbstractC4253.m7538();
        if (abstractC5596M7538.f18445 >= 4294967296L) {
            c4437.f14628 = c5036;
            c4437.f18326 = 1;
            abstractC5596M7538.m9443(c4437);
            return;
        }
        abstractC5596M7538.m9441(true);
        try {
            InterfaceC3196 interfaceC3196 = (InterfaceC3196) abstractC0772.mo334().mo865(C1397.f4791);
            if (interfaceC3196 == null || interfaceC3196.mo866()) {
                Object obj2 = c4437.f14629;
                InterfaceC3534 interfaceC3534Mo334 = abstractC0772.mo334();
                Object objM5152 = AbstractC2765.m5152(interfaceC3534Mo334, obj2);
                C5278 c5278M5193 = objM5152 != AbstractC2765.f9155 ? AbstractC2774.m5193(abstractC0772, interfaceC3534Mo334, objM5152) : null;
                try {
                    abstractC0772.mo335(obj);
                    if (c5278M5193 == null || c5278M5193.m8915()) {
                        AbstractC2765.m5121(interfaceC3534Mo334, objM5152);
                    }
                } catch (Throwable th) {
                    if (c5278M5193 == null || c5278M5193.m8915()) {
                        AbstractC2765.m5121(interfaceC3534Mo334, objM5152);
                    }
                    throw th;
                }
            } else {
                c4437.mo335(new C4535(interfaceC3196.mo862()));
            }
            while (abstractC5596M7538.m9446()) {
            }
        } catch (Throwable th2) {
            try {
                c4437.m9277(th2);
            } finally {
                abstractC5596M7538.m9442(true);
            }
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static final C3600 m9067(Context context, C2813 c2813) {
        C4669 c4669;
        String name;
        AbstractC4105 abstractC4105Mo85;
        boolean zContainsKey;
        C1489 c1489 = new C1489((ExecutorService) c2813.f9389);
        Context applicationContext = context.getApplicationContext();
        ExecutorC2205 executorC2205 = (ExecutorC2205) c1489.f5059;
        Object obj = c2813.f9390;
        if (context.getResources().getBoolean(ru.bluecat.yandexmapspatcher.R.bool.workmanager_test_configuration)) {
            c4669 = new C4669(applicationContext, null);
            c4669.f15383 = true;
        } else {
            if (AbstractC0684.m1534("androidx.work.workdb")) {
                C1078.m2272("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                return null;
            }
            C4669 c46610 = new C4669(applicationContext, "androidx.work.workdb");
            c46610.f15377 = new C5322(13, applicationContext);
            c4669 = c46610;
        }
        c4669.f15375 = executorC2205;
        C4223 c4223 = new C4223();
        ArrayList arrayList = c4669.f15379;
        arrayList.add(c4223);
        c4669.m8031(C4847.f15956);
        c4669.m8031(new C3036(applicationContext, 2, 3));
        c4669.m8031(C4847.f15961);
        c4669.m8031(C4847.f15960);
        c4669.m8031(new C3036(applicationContext, 5, 6));
        c4669.m8031(C4847.f15962);
        c4669.m8031(C4847.f15958);
        c4669.m8031(C4847.f15959);
        c4669.m8031(new C3036(applicationContext));
        int i = 11;
        c4669.m8031(new C3036(applicationContext, 10, 11));
        c4669.m8031(C4847.f15957);
        c4669.m8031(C4847.f15954);
        c4669.m8031(C4847.f15955);
        c4669.m8031(C4847.f15963);
        c4669.m8031(new C3036(applicationContext, 21, 22));
        c4669.f15386 = false;
        c4669.f15388 = true;
        c4669.f15387 = true;
        Executor executor = c4669.f15375;
        if (executor == null && c4669.f15385 == null) {
            ExecutorC4322 executorC4322 = C1774.f5924;
            c4669.f15385 = executorC4322;
            c4669.f15375 = executorC4322;
        } else if (executor != null && c4669.f15385 == null) {
            c4669.f15385 = executor;
        } else if (executor == null) {
            c4669.f15375 = c4669.f15385;
        }
        LinkedHashSet linkedHashSet = c4669.f15380;
        boolean zIsEmpty = linkedHashSet.isEmpty();
        LinkedHashSet linkedHashSet2 = c4669.f15384;
        if (!zIsEmpty) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(iIntValue))) {
                    C1078.m2273(AbstractC5078.m8670(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                    return null;
                }
            }
        }
        InterfaceC3562 c4992 = c4669.f15377;
        if (c4992 == null) {
            c4992 = new C4992(i);
        }
        boolean z = c4669.f15383;
        Context context2 = c4669.f15376;
        Object systemService = context2.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        int i2 = (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3;
        Executor executor2 = c4669.f15375;
        if (executor2 == null) {
            C1078.m2272("Required value was null.");
            return null;
        }
        Executor executor3 = c4669.f15385;
        if (executor3 == null) {
            C1078.m2272("Required value was null.");
            return null;
        }
        C0461 c0461 = new C0461(context2, c4669.f15373, c4992, c4669.f15382, arrayList, z, i2, executor2, executor3, null, c4669.f15386, c4669.f15388, linkedHashSet2, null, null, null, c4669.f15374, c4669.f15381, c4669.f15387, null, null);
        Class cls = c4669.f15378.f10543;
        Package r0 = cls.getPackage();
        if (r0 == null || (name = r0.getName()) == null) {
            name = "";
        }
        String canonicalName = cls.getCanonicalName();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String strConcat = canonicalName.replace('.', '_').concat("_Impl");
        try {
            WorkDatabase workDatabase = (WorkDatabase) Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, cls.getClassLoader()).getDeclaredConstructor(null).newInstance(null);
            workDatabase.f256 = true;
            try {
                abstractC4105Mo85 = workDatabase.mo85();
            } catch (C1345 unused) {
                abstractC4105Mo85 = null;
            }
            if (abstractC4105Mo85 == null) {
                new C3352(c0461, new C1797(workDatabase));
                throw null;
            }
            workDatabase.f255 = new C3352(c0461, abstractC4105Mo85);
            workDatabase.f250 = workDatabase.mo94();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set setMo92 = workDatabase.mo92();
            int size = setMo92.size();
            boolean[] zArr = new boolean[size];
            Iterator it2 = setMo92.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                int i3 = -1;
                List list = c0461.f1676;
                if (zHasNext) {
                    C3131 c3131 = (C3131) it2.next();
                    int size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i4 = size2 - 1;
                            if (c3131.m5774(list.get(size2))) {
                                zArr[size2] = true;
                                i3 = size2;
                                break;
                            }
                            if (i4 < 0) {
                                break;
                            }
                            size2 = i4;
                        }
                    }
                    if (i3 < 0) {
                        C2316.m4357(c3131.m5776(), ") is missing in the database configuration.", "A required auto migration spec (");
                        return null;
                    }
                    linkedHashMap.put(c3131, list.get(i3));
                } else {
                    int size3 = list.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i5 = size3 - 1;
                            if (size3 >= size || !zArr[size3]) {
                                C1078.m2272("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                return null;
                            }
                            if (i5 < 0) {
                                break;
                            }
                            size3 = i5;
                        }
                    }
                    for (AbstractC4383 abstractC4383 : workDatabase.mo83(linkedHashMap)) {
                        int i6 = abstractC4383.f14450;
                        int i7 = abstractC4383.f14449;
                        C3066 c3066 = c0461.f1667;
                        LinkedHashMap linkedHashMap2 = c3066.f10306;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i6))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i6));
                            if (map == null) {
                                map = C0204.f751;
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(i7));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            c3066.m5664(abstractC4383);
                        }
                    }
                    LinkedHashMap linkedHashMapMo99 = workDatabase.mo99();
                    boolean[] zArr2 = new boolean[linkedHashMapMo99.size()];
                    Iterator it3 = linkedHashMapMo99.entrySet().iterator();
                    while (true) {
                        boolean zHasNext2 = it3.hasNext();
                        List list2 = c0461.f1674;
                        if (!zHasNext2) {
                            int size4 = list2.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i8 = size4 - 1;
                                    if (!zArr2[size4]) {
                                        throw new IllegalArgumentException("Unexpected type converter " + list2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                    }
                                    if (i8 < 0) {
                                        break;
                                    }
                                    size4 = i8;
                                }
                            }
                            workDatabase.f252 = c0461.f1665;
                            workDatabase.f249 = new ExecutorC2205(c0461.f1671);
                            Executor executor4 = workDatabase.f252;
                            if (executor4 == null) {
                                executor4 = null;
                            }
                            C3950 c3950M7151 = AbstractC4009.m7151(AbstractC4593.m7963(AbstractC4489.m7819(executor4), AbstractC4554.m7891()));
                            workDatabase.f254 = c3950M7151;
                            InterfaceC3534 interfaceC3534 = c3950M7151.f13208;
                            ExecutorC2205 executorC2206 = workDatabase.f249;
                            if (executorC2206 == null) {
                                executorC2206 = null;
                            }
                            interfaceC3534.mo860(AbstractC4489.m7819(executorC2206));
                            workDatabase.f258 = c0461.f1662;
                            C3352 c3352 = workDatabase.f255;
                            if (c3352 == null) {
                                c3352 = null;
                            }
                            InterfaceC2488 interfaceC2488M6116 = c3352.m6116();
                            if (interfaceC2488M6116 == null) {
                                interfaceC2488M6116 = null;
                                break;
                            }
                            while (!(interfaceC2488M6116 instanceof AbstractC1413)) {
                                if (!(interfaceC2488M6116 instanceof InterfaceC1051)) {
                                    interfaceC2488M6116 = null;
                                    break;
                                }
                                interfaceC2488M6116 = ((InterfaceC1051) interfaceC2488M6116).m2259();
                            }
                            C3352 c3353 = workDatabase.f255;
                            if (c3353 == null) {
                                c3353 = null;
                            }
                            InterfaceC2488 interfaceC2488M6117 = c3353.m6116();
                            if (interfaceC2488M6117 == null) {
                                interfaceC2488M6117 = null;
                                break;
                            }
                            while (!(interfaceC2488M6117 instanceof AbstractC1716)) {
                                if (!(interfaceC2488M6117 instanceof InterfaceC1051)) {
                                    interfaceC2488M6117 = null;
                                    break;
                                }
                                interfaceC2488M6117 = ((InterfaceC1051) interfaceC2488M6117).m2259();
                            }
                            Intent intent = c0461.f1670;
                            if (intent != null) {
                                String str = c0461.f1664;
                                if (str == null) {
                                    C1078.m2272("Required value was null.");
                                    return null;
                                }
                                C4775 c4775 = workDatabase.f250;
                                C4775 c4776 = c4775 == null ? null : c4775;
                                c4776.f15743 = intent;
                                c4776.f15747 = new C5024(c0461.f1666, str, c4776);
                            }
                            C1414 c1414 = new C1414(context.getApplicationContext(), c1489);
                            C3654 c3654 = new C3654(context.getApplicationContext(), c2813, c1489, workDatabase);
                            int i9 = C3713.f12382;
                            String str2 = AbstractC5554.f18336;
                            C5886 c5886 = new C5886(context, workDatabase, c2813);
                            AbstractC1466.m3083(context, SystemJobService.class, true);
                            C1984.m3874().m3878(AbstractC5554.f18336, "Created SystemJobScheduler and enabled SystemJobService");
                            return new C3600(context.getApplicationContext(), c2813, c1489, workDatabase, AbstractC2164.m4188(c5886, new C4889(context, c2813, c1414, c3654, new C2346(18, c3654, c1489), c1489)), c3654, c1414);
                        }
                        Map.Entry entry = (Map.Entry) it3.next();
                        C3131 c3132 = (C3131) entry.getKey();
                        for (C3131 c3133 : (List) entry.getValue()) {
                            int size5 = list2.size() - 1;
                            if (size5 < 0) {
                                size5 = -1;
                                break;
                            }
                            while (true) {
                                int i10 = size5 - 1;
                                if (c3133.m5774(list2.get(size5))) {
                                    zArr2[size5] = true;
                                    break;
                                }
                                if (i10 < 0) {
                                    size5 = -1;
                                    break;
                                }
                                size5 = i10;
                            }
                            if (size5 < 0) {
                                throw new IllegalArgumentException(("A required type converter (" + c3133.m5776() + ") for " + c3132.m5776() + " is missing in the database configuration.").toString());
                            }
                            workDatabase.f257.put(c3133, list2.get(size5));
                        }
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot access the constructor " + cls.getCanonicalName(), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName(), e3);
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static final InterfaceC0289 m9068(AbstractC3019 abstractC3019, Object obj) {
        C2457 c2457;
        if (!abstractC3019.f17791.f17786) {
            AbstractC3480.m6278("visitAncestors called on an unattached node");
        }
        AbstractC5381 abstractC5381 = abstractC3019.f17791.f17780;
        C0605 c0605M9270 = AbstractC5537.m9270(abstractC3019);
        while (c0605M9270 != null) {
            if ((((AbstractC5381) c0605M9270.f2256.f8210).f17782 & 262144) != 0) {
                while (abstractC5381 != null) {
                    if ((abstractC5381.f17781 & 262144) != 0) {
                        AbstractC5381 abstractC5381M9233 = abstractC5381;
                        C0863 c0863 = null;
                        while (abstractC5381M9233 != null) {
                            if (abstractC5381M9233 instanceof InterfaceC0289) {
                                InterfaceC0289 interfaceC0289 = (InterfaceC0289) abstractC5381M9233;
                                if (obj.equals(interfaceC0289.mo612())) {
                                    return interfaceC0289;
                                }
                            }
                            if ((abstractC5381M9233.f17781 & 262144) != 0 && (abstractC5381M9233 instanceof AbstractC3019)) {
                                int i = 0;
                                for (AbstractC5381 abstractC5382 = ((AbstractC3019) abstractC5381M9233).f10167; abstractC5382 != null; abstractC5382 = abstractC5382.f17783) {
                                    if ((abstractC5382.f17781 & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            abstractC5381M9233 = abstractC5382;
                                        } else {
                                            if (c0863 == null) {
                                                c0863 = new C0863(new AbstractC5381[16]);
                                            }
                                            if (abstractC5381M9233 != null) {
                                                c0863.m1843(abstractC5381M9233);
                                                abstractC5381M9233 = null;
                                            }
                                            c0863.m1843(abstractC5382);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            abstractC5381M9233 = AbstractC5537.m9233(c0863);
                        }
                    }
                    abstractC5381 = abstractC5381.f17780;
                }
            }
            c0605M9270 = c0605M9270.m1356();
            abstractC5381 = (c0605M9270 == null || (c2457 = c0605M9270.f2256) == null) ? null : (C1850) c2457.f8202;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static final void m9069(C3600 c3600, String str) {
        C5789 c5789M6532;
        WorkDatabase workDatabase = c3600.f11986;
        C0177 c0177Mo103 = workDatabase.mo103();
        C1894 c1894Mo86 = workDatabase.mo86();
        ArrayList arrayListM4193 = AbstractC2164.m4193(str);
        while (!arrayListM4193.isEmpty()) {
            String str2 = (String) AbstractC3649.m6528(arrayListM4193);
            EnumC4972 enumC4972M379 = c0177Mo103.m379(str2);
            if (enumC4972M379 != EnumC4972.f16450 && enumC4972M379 != EnumC4972.f16451) {
                ((Number) AbstractC0487.m1075(c0177Mo103.f663, false, true, new C3203(14, str2))).intValue();
            }
            arrayListM4193.addAll(c1894Mo86.m3746(str2));
        }
        C3654 c3654 = c3600.f11988;
        synchronized (c3654.f12236) {
            C1984.m3874().m3878(C3654.f12226, "Processor cancelling " + str);
            c3654.f12235.add(str);
            c5789M6532 = c3654.m6532(str);
        }
        C3654.m6530(str, c5789M6532, 1);
        Iterator it = c3600.f11987.iterator();
        while (it.hasNext()) {
            ((InterfaceC1025) it.next()).mo2236(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۦۚ */
    public static final Object m9070(InterfaceC4707 interfaceC4707, AbstractC0772 abstractC0772) {
        C4194 c4194;
        C5450 c5450;
        C0069 e;
        C0874 c0874;
        if (abstractC0772 instanceof C4194) {
            c4194 = (C4194) abstractC0772;
            int i = c4194.f13944;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4194.f13944 = i - Integer.MIN_VALUE;
            } else {
                c4194 = new C4194(abstractC0772);
            }
        } else {
            c4194 = new C4194(abstractC0772);
        }
        Object obj = c4194.f13943;
        int i2 = c4194.f13944;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            c5450 = new C5450();
            C0874 c0875 = new C0874(c5450, i3);
            try {
                c4194.f13942 = c5450;
                c4194.f13941 = c0875;
                c4194.f13944 = 1;
                Object objMo1575 = interfaceC4707.mo1575(c0875, c4194);
                Object obj2 = EnumC2282.f7590;
                if (objMo1575 == obj2) {
                    return obj2;
                }
            } catch (C0069 e2) {
                e = e2;
                c0874 = c0875;
                if (e.f13147 == c0874) {
                    throw e;
                }
                AbstractC5568.m9360(c4194.f2791);
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0874 = c4194.f13941;
            c5450 = c4194.f13942;
            try {
                AbstractC0186.m409(obj);
            } catch (C0069 e3) {
                e = e3;
                if (e.f13147 == c0874) {
                    throw e;
                }
                AbstractC5568.m9360(c4194.f2791);
            }
        }
        return c5450.f17965;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static int m9071(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f17756;
        return AbstractC1373.m2911(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* JADX INFO: renamed from: ۦۜ */
    public static final void m9072() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static final String m9073(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    /* JADX INFO: renamed from: ۦۣ */
    public static C3580 m9074(List list) {
        if (list == null || list.isEmpty()) {
            return m9075(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C3580) it.next()) == null) {
                C0178.m387("null tasks are not accepted");
                return null;
            }
        }
        C3580 c3580 = new C3580();
        C4993 c4993 = new C4993(list.size(), c3580);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C3580 c3581 = (C3580) it2.next();
            ExecutorC3678 executorC3678 = AbstractC4007.f13359;
            c3581.m6389(executorC3678, c4993);
            c3581.m6391(executorC3678, c4993);
            c3581.f11911.m9159(new C3517((Executor) executorC3678, (InterfaceC2342) c4993));
            c3581.m6400();
        }
        return c3580;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static C3580 m9075(Object obj) {
        C3580 c3580 = new C3580();
        c3580.m6395(obj);
        return c3580;
    }
}
