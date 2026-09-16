package p000;

import android.content.res.Resources;
import android.os.Binder;
import android.os.Parcelable;
import android.text.Spanned;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.MotionEvent;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import ru.bluecat.yandexmapspatcher.R;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۥ٘ؖۦۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1605 {

    /* JADX INFO: renamed from: ۦِ */
    public static final C5536 f5394;

    /* JADX INFO: renamed from: ۦٛ */
    public static final C5536 f5395;

    /* JADX INFO: renamed from: ۥۣ */
    public static final float[][] f5390 = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: ۥۗ */
    public static final float[][] f5388 = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: ۥؗ */
    public static final float[] f5384 = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: ۦؑ */
    public static final double[][] f5391 = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};

    /* JADX INFO: renamed from: ۥُ */
    public static final double[][] f5385 = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};

    /* JADX INFO: renamed from: ۥّ */
    public static final Class[] f5386 = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: ۦۙ */
    public static final C4992 f5397 = new C4992(6);

    /* JADX INFO: renamed from: ۥۜ */
    public static final StackTraceElement[] f5389 = new StackTraceElement[0];

    /* JADX INFO: renamed from: ۦۗ */
    public static final String[] f5396 = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};

    /* JADX INFO: renamed from: ۦؚ */
    public static final String[] f5392 = {"ad_impression"};

    /* JADX INFO: renamed from: ۦٌ */
    public static final String[] f5393 = {"ad_impression", "in_app_purchase"};

    /* JADX INFO: renamed from: ۦۚ */
    public static final String[] f5398 = {"ad_impression"};

    /* JADX INFO: renamed from: ۦۨ */
    public static final String[] f5400 = {"ad_impression", "in_app_purchase"};

    /* JADX INFO: renamed from: ۦ۟ */
    public static final String[] f5399 = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};

    /* JADX INFO: renamed from: ۥْ */
    public static final String[] f5387 = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    static {
        int i = 2;
        f5395 = new C5536(i, "NONE");
        f5394 = new C5536(i, "PENDING");
    }

    /* JADX INFO: renamed from: ۥؔ */
    public static void m3330(int i, String str, List list) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i + " parameters found " + list.size());
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static float m3331(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final Object m3332(C3580 c3580, C1754 c1754) throws Exception {
        if (!c3580.m6398()) {
            C2600 c2600 = new C2600(1, AbstractC2776.m5232(c1754));
            c2600.m4913();
            c3580.f11911.m9159(new C3517(ExecutorC3678.f12285, new C2041(c2600)));
            c3580.m6400();
            return c2600.m4909();
        }
        Exception excM6387 = c3580.m6387();
        if (excM6387 != null) {
            throw excM6387;
        }
        if (!c3580.f11913) {
            return c3580.m6388();
        }
        throw new CancellationException("Task " + c3580 + " was cancelled normally.");
    }

    /* JADX INFO: renamed from: ۥؙ */
    public static void m3333(C1489 c1489) {
        int iM3354 = m3354(c1489.m3146("runtime.counter").mo1610().doubleValue() + 1.0d);
        if (iM3354 <= 1000000) {
            c1489.m3100("runtime.counter", new C5563(Double.valueOf(iM3354)));
        } else {
            C1078.m2276("Instructions allowed exceeded");
        }
    }

    /* JADX INFO: renamed from: ۥؚ */
    public static HashMap m3334(C5162 c5162) {
        HashMap map = new HashMap();
        for (String str : new ArrayList(c5162.f17096.keySet())) {
            Object objM3348 = m3348(c5162.mo2281(str));
            if (objM3348 != null) {
                map.put(str, objM3348);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ۥً */
    public static final boolean m3335(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* JADX INFO: renamed from: ۥَ */
    public static boolean m3336(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = C1160.f4027;
            }
        } else {
            if (!(collection instanceof AbstractC1425)) {
                return false;
            }
            objComparator = ((AbstractC1425) collection).f4899;
        }
        return comparator.equals(objComparator);
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final boolean m3337(Object obj) {
        if (obj instanceof InterfaceC5910) {
            InterfaceC5910 interfaceC5910 = (InterfaceC5910) obj;
            if (interfaceC5910.mo355() == C0373.f1364 || interfaceC5910.mo355() == C1298.f4439 || interfaceC5910.mo355() == C1397.f4792) {
                Object value = interfaceC5910.getValue();
                if (value == null) {
                    return true;
                }
                return m3337(value);
            }
        } else if (!(obj instanceof InterfaceC0400) || !(obj instanceof Serializable)) {
            for (int i = 0; i < 7; i++) {
                if (f5386[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static final void m3338(InterfaceC3534 interfaceC3534, Throwable th) {
        if (th instanceof C0768) {
            th = ((C0768) th).f2784;
        }
        try {
            InterfaceC3500 interfaceC3500 = (InterfaceC3500) interfaceC3534.mo865(C1298.f4446);
            if (interfaceC3500 != null) {
                interfaceC3500.mo1639(interfaceC3534, th);
            } else {
                AbstractC5378.m9065(interfaceC3534, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC5537.m9223(runtimeException, th);
                th = runtimeException;
            }
            AbstractC5378.m9065(interfaceC3534, th);
        }
    }

    /* JADX INFO: renamed from: ۥٕ */
    public static final Object[] m3339(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC0246.m519(0, i, 6, objArr, objArr2);
        AbstractC0246.m510(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static final boolean m3340(C0971 c0971, InterfaceC0103 interfaceC0103) {
        List annotations = interfaceC0103.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof InterfaceC4061) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public static boolean m3341(InterfaceC2150 interfaceC2150) {
        if (interfaceC2150 == null) {
            return false;
        }
        Double dMo1610 = interfaceC2150.mo1610();
        return !dMo1610.isNaN() && dMo1610.doubleValue() >= 0.0d && dMo1610.equals(Double.valueOf(Math.floor(dMo1610.doubleValue())));
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static boolean m3342(C5051 c5051) {
        C1007 c1007M2202 = c5051.f16767;
        C1007 c1007 = AbstractC0088.f16843;
        c1007M2202.getClass();
        int iMo2206 = c1007M2202.mo2206(c1007.mo2204());
        if (iMo2206 == -1) {
            C1007 c1008 = c5051.f16767;
            C1007 c1009 = AbstractC0088.f16842;
            c1008.getClass();
            iMo2206 = c1008.mo2206(c1009.mo2204());
        }
        if (iMo2206 != -1) {
            c1007M2202 = C1007.m2202(c1007M2202, iMo2206 + 1, 0, 2);
        } else if (c5051.m8570() != null && c1007M2202.mo2205() == 2) {
            c1007M2202 = C1007.f3595;
        }
        String strM2214 = c1007M2202.m2214();
        return !strM2214.regionMatches(true, strM2214.length() - 6, ".class", 0, 6);
    }

    /* JADX INFO: renamed from: ۥٛ */
    public static EnumC3130 m3343(String str) {
        EnumC3130 enumC3130;
        if (str == null || str.isEmpty()) {
            enumC3130 = null;
        } else {
            enumC3130 = (EnumC3130) EnumC3130.f10531.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (enumC3130 != null) {
            return enumC3130;
        }
        C1078.m2272(AbstractC3761.m6628("Unsupported commandId ", str));
        return null;
    }

    /* JADX INFO: renamed from: ۥٝ */
    public static double m3344(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return ((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d));
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static int m3345(float f) {
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
        float[] fArr = f5384;
        return AbstractC1373.m2911(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static int m3346(double d) {
        double d2 = (d + 16.0d) / 116.0d;
        double d3 = d > 8.0d ? d2 * d2 * d2 : d / 903.2962962962963d;
        double d4 = d2 * d2 * d2;
        boolean z = d4 > 0.008856451679035631d;
        double d5 = z ? d4 : d / 903.2962962962963d;
        if (!z) {
            d4 = d / 903.2962962962963d;
        }
        float[] fArr = f5384;
        double d6 = d5 * ((double) fArr[0]);
        double d7 = d3 * ((double) fArr[1]);
        double d8 = d4 * ((double) fArr[2]);
        double[][] dArr = f5385;
        double[] dArr2 = dArr[0];
        double d9 = (dArr2[2] * d8) + (dArr2[1] * d7) + (dArr2[0] * d6);
        double[] dArr3 = dArr[1];
        double d10 = (dArr3[2] * d8) + (dArr3[1] * d7) + (dArr3[0] * d6);
        double[] dArr4 = dArr[2];
        return ((m3361(d9) & 255) << 16) | (-16777216) | ((m3361(d10) & 255) << 8) | (m3361((dArr4[2] * d8) + (dArr4[1] * d7) + (dArr4[0] * d6)) & 255);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (p000.C3133.m5783(r9, r1, p000.AbstractC3831.m6874(r7, r2) ? r0.getWidth() : p000.AbstractC0080.m7961(r7.f670, r8), p000.AbstractC3831.m6874(r7, r2) ? r0.getHeight() : p000.AbstractC0080.m7961(r7.f669, r8), r8) == 1.0d) goto L24;
     */
    /* JADX INFO: renamed from: ۥۜ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap m3347(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, p000.C0181 r7, int r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC1605.m3347(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, ۥؘَؑؓ, int, boolean):android.graphics.Bitmap");
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static Object m3348(InterfaceC2150 interfaceC2150) {
        if (InterfaceC2150.f7054.equals(interfaceC2150)) {
            return null;
        }
        if (InterfaceC2150.f7060.equals(interfaceC2150)) {
            return "";
        }
        if (interfaceC2150 instanceof C5162) {
            return m3334((C5162) interfaceC2150);
        }
        if (!(interfaceC2150 instanceof C1173)) {
            return !interfaceC2150.mo1610().isNaN() ? interfaceC2150.mo1610() : interfaceC2150.mo1607();
        }
        ArrayList arrayList = new ArrayList();
        C1173 c1173 = (C1173) interfaceC2150;
        int i = 0;
        while (i < c1173.m2495()) {
            if (i >= c1173.m2495()) {
                C0178.m384(AbstractC5078.m8673(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
                return null;
            }
            int i2 = i + 1;
            Object objM3348 = m3348(c1173.m2496(i));
            if (objM3348 != null) {
                arrayList.add(objM3348);
            }
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4994 m3349(Object obj) {
        if (obj == null) {
            obj = AbstractC2776.f9256;
        }
        return new C4994(obj);
    }

    /* JADX INFO: renamed from: ۥۤ */
    public static boolean m3350(InterfaceC2150 interfaceC2150, InterfaceC2150 interfaceC2151) {
        if (!interfaceC2150.getClass().equals(interfaceC2151.getClass())) {
            return false;
        }
        if ((interfaceC2150 instanceof C4607) || (interfaceC2150 instanceof C4493)) {
            return true;
        }
        if (interfaceC2150 instanceof C5563) {
            if (Double.isNaN(interfaceC2150.mo1610().doubleValue()) || Double.isNaN(interfaceC2151.mo1610().doubleValue())) {
                return false;
            }
            return interfaceC2150.mo1610().equals(interfaceC2151.mo1610());
        }
        if (interfaceC2150 instanceof C2485) {
            return interfaceC2150.mo1607().equals(interfaceC2151.mo1607());
        }
        if (interfaceC2150 instanceof C0726) {
            return interfaceC2150.mo1609().equals(interfaceC2151.mo1609());
        }
        return interfaceC2150 == interfaceC2151;
    }

    /* JADX INFO: renamed from: ۥۦ */
    public static final void m3351(C0188 c0188, int i, Object obj, int i2, Object obj2) {
        int i3 = c0188.f702 - c0188.f700[c0188.f698 - 1].f18678;
        Object[] objArr = c0188.f703;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public static final void m3352(C0971 c0971, InterfaceC0103 interfaceC0103) {
        AbstractC3831.m6874(interfaceC0103.mo183(), C3626.f12098);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static float m3353(int i) {
        Set set = C3332.f11151;
        if (i == 2) {
            return 900.0f;
        }
        return i == 1 ? 480.0f : 0.0f;
    }

    /* JADX INFO: renamed from: ۦؒ */
    public static int m3354(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    /* JADX INFO: renamed from: ۦؖ */
    public static final void m3355(C0188 c0188, int i, Object obj) {
        c0188.f703[(c0188.f702 - c0188.f700[c0188.f698 - 1].f18678) + i] = obj;
    }

    /* JADX INFO: renamed from: ۦؗ */
    public static final C3161 m3356(C0710 c0710, C3950 c3950, C1901 c1901, Float f) {
        InterfaceC4541.f15007.getClass();
        C0852 c0852 = C0852.f3157;
        C2346 c2346 = new C2346(9, c0710, C4794.f15814);
        C4994 c4994M3349 = m3349(f);
        return new C3161(c4994M3349, AbstractC2765.m5142(c3950, (InterfaceC3534) c2346.f7785, c1901.equals(C2969.f9952) ? 1 : 4, new C1734(c1901, (InterfaceC4707) c2346.f7786, c4994M3349, f, null, 5)));
    }

    /* JADX INFO: renamed from: ۦؙ */
    public static boolean m3357(CharSequence charSequence, Object obj, int i) {
        return (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(obj) == i;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static final boolean m3358(C3129 c3129) {
        Object objM6027 = c3129.f10476.f8490.m6027(AbstractC2771.f9222);
        if (objM6027 == null) {
            objM6027 = null;
        }
        EnumC2887 enumC2887 = (EnumC2887) objM6027;
        C3262 c3262 = c3129.f10476.f8490;
        Object objM6028 = c3262.m6027(AbstractC2771.f9196);
        if (objM6028 == null) {
            objM6028 = null;
        }
        C2155 c2155 = (C2155) objM6028;
        boolean z = enumC2887 != null;
        Object objM6029 = c3262.m6027(AbstractC2771.f9218);
        if (((Boolean) (objM6029 != null ? objM6029 : null)) == null || (c2155 != null && c2155.f7116 == 4)) {
            return z;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static final String m3359(C3129 c3129, Resources resources) {
        C2542 c2542 = c3129.f10476;
        C2542 c2543 = c3129.f10476;
        Object objM6027 = c2542.f8490.m6027(AbstractC2771.f9210);
        String string = null;
        if (objM6027 == null) {
            objM6027 = null;
        }
        C3262 c3262 = c2543.f8490;
        Object objM6028 = c3262.m6027(AbstractC2771.f9222);
        if (objM6028 == null) {
            objM6028 = null;
        }
        EnumC2887 enumC2887 = (EnumC2887) objM6028;
        Object objM6029 = c3262.m6027(AbstractC2771.f9196);
        if (objM6029 == null) {
            objM6029 = null;
        }
        C2155 c2155 = (C2155) objM6029;
        if (enumC2887 != null) {
            int iOrdinal = enumC2887.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        C1078.m2275();
                        return null;
                    }
                    if (objM6027 == null) {
                        objM6027 = resources.getString(R.string.indeterminate);
                    }
                } else if (c2155 != null && c2155.f7116 == 2 && objM6027 == null) {
                    objM6027 = resources.getString(R.string.state_off);
                }
            } else if (c2155 != null && c2155.f7116 == 2 && objM6027 == null) {
                objM6027 = resources.getString(R.string.state_on);
            }
        }
        Object objM60210 = c3262.m6027(AbstractC2771.f9218);
        if (objM60210 == null) {
            objM60210 = null;
        }
        Boolean bool = (Boolean) objM60210;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((c2155 == null || c2155.f7116 != 4) && objM6027 == null) {
                objM6027 = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object objM60211 = c3262.m6027(AbstractC2771.f9197);
        if (objM60211 == null) {
            objM60211 = null;
        }
        C5238 c5238 = (C5238) objM60211;
        if (c5238 != null) {
            if (c5238 != C5238.f17294) {
                if (objM6027 == null) {
                    objM6027 = resources.getString(R.string.template_percent, 0);
                }
            } else if (objM6027 == null) {
                objM6027 = resources.getString(R.string.in_progress);
            }
        }
        C3059 c3059 = AbstractC2771.f9219;
        if (c3262.m6015(c3059)) {
            C3262 c3263 = new C3129(c3129.f10475, true, c3129.f10471, c2543).m5769().f8490;
            Object objM60212 = c3263.m6027(AbstractC2771.f9213);
            if (objM60212 == null) {
                objM60212 = null;
            }
            Collection collection = (Collection) objM60212;
            if (collection == null || collection.isEmpty()) {
                Object objM60213 = c3263.m6027(AbstractC2771.f9198);
                if (objM60213 == null) {
                    objM60213 = null;
                }
                Collection collection2 = (Collection) objM60213;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objM60214 = c3263.m6027(c3059);
                    if (objM60214 == null) {
                        objM60214 = null;
                    }
                    CharSequence charSequence = (CharSequence) objM60214;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(R.string.state_empty);
                    }
                }
            }
            objM6027 = string;
        }
        return (String) objM6027;
    }

    /* JADX INFO: renamed from: ۦُ */
    public static final void m3360(C5639 c5639, long j, InterfaceC4745 interfaceC4745, boolean z) {
        MotionEvent motionEventM9476 = c5639.m9476();
        if (motionEventM9476 == null) {
            C1078.m2272("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEventM9476.getAction();
        if (z) {
            motionEventM9476.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEventM9476.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        interfaceC4745.mo211(motionEventM9476);
        motionEventM9476.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEventM9476.setAction(action);
    }

    /* JADX INFO: renamed from: ۦِ */
    public static int m3361(double d) {
        double d2 = d / 100.0d;
        int iRound = (int) Math.round((d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d);
        if (iRound < 0) {
            return 0;
        }
        if (iRound > 255) {
            return 255;
        }
        return iRound;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static final boolean m3362(C3129 c3129, Resources resources) {
        Object objM6027 = c3129.f10476.f8490.m6027(AbstractC2771.f9213);
        if (objM6027 == null) {
            objM6027 = null;
        }
        List list = (List) objM6027;
        return !AbstractC2776.m5245(c3129) && (c3129.f10476.f8487 || (c3129.m5772() && ((list != null ? (String) AbstractC0973.m2058(list) : null) != null || m3369(c3129) != null || m3359(c3129, resources) != null || m3358(c3129))));
    }

    /* JADX INFO: renamed from: ۦٖ */
    public static final C2793 m3363(InterfaceC2015 interfaceC2015) {
        C2793 c2793M8142 = C4773.m8142(interfaceC2015, true);
        long jMo2806 = interfaceC2015.mo2806(c2793M8142.m5322());
        float f = c2793M8142.f9341;
        float f2 = c2793M8142.f9344;
        long jMo2807 = interfaceC2015.mo2806((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        return new C2793(Float.intBitsToFloat((int) (jMo2806 >> 32)), Float.intBitsToFloat((int) (jMo2806 & 4294967295L)), Float.intBitsToFloat((int) (jMo2807 >> 32)), Float.intBitsToFloat((int) (jMo2807 & 4294967295L)));
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static final int m3364(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public static final Object[] m3365(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        AbstractC0246.m519(0, i, 6, objArr, objArr2);
        AbstractC0246.m510(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static AbstractC0941 m3366(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                return (AbstractC0941) declaredConstructor.newInstance(null);
            } catch (IllegalAccessException e) {
                C0178.m394("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                C0178.m394("Cannot create an instance of ", cls, e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            C0178.m394("Cannot create an instance of ", cls, e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static final boolean m3367(C3129 c3129) {
        return !c3129.m5769().f8490.m6015(AbstractC2771.f9223);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static int m3368(Comparable comparable, Comparable comparable2) {
        if (comparable == null) {
            return comparable2 == null ? 0 : -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static final C1249 m3369(C3129 c3129) {
        Object objM6027 = c3129.f10476.f8490.m6027(AbstractC2771.f9219);
        if (objM6027 == null) {
            objM6027 = null;
        }
        C1249 c1249 = (C1249) objM6027;
        Object objM6028 = c3129.f10476.f8490.m6027(AbstractC2771.f9198);
        if (objM6028 == null) {
            objM6028 = null;
        }
        List list = (List) objM6028;
        return c1249 == null ? list != null ? (C1249) AbstractC0973.m2058(list) : null : c1249;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static final Object[] m3370(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        AbstractC0246.m519(0, i, 6, objArr, objArr2);
        AbstractC0246.m510(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    /* JADX INFO: renamed from: ۦۜ */
    public static void m3371(int i, String str, List list) {
        if (list.size() >= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i + " parameters found " + list.size());
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C2600 m3372(InterfaceC0443 interfaceC0443) {
        Unsafe unsafe;
        C2600 c2600;
        C2600 c2601;
        if (!(interfaceC0443 instanceof C4437)) {
            return new C2600(1, interfaceC0443);
        }
        C4437 c4437 = (C4437) interfaceC0443;
        C5536 c5536 = AbstractC5378.f17759;
        long j = C4437.f14625;
        loop0: while (true) {
            unsafe = AbstractC3456.f11473;
            Object objectVolatile = unsafe.getObjectVolatile(c4437, j);
            c2600 = null;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(c4437, j, c5536);
                c2601 = null;
                break;
            }
            if (objectVolatile instanceof C2600) {
                do {
                    unsafe = AbstractC3456.f11473;
                    if (unsafe.compareAndSwapObject(c4437, C4437.f14625, objectVolatile, c5536)) {
                        c2601 = (C2600) objectVolatile;
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(c4437, j) == objectVolatile);
            } else if (objectVolatile != c5536 && !(objectVolatile instanceof Throwable)) {
                C5028.m8449(objectVolatile, "Inconsistent state ");
                return null;
            }
        }
        if (c2601 != null) {
            long j2 = C2600.f8689;
            Object objectVolatile2 = unsafe.getObjectVolatile(c2601, j2);
            if (!(objectVolatile2 instanceof C2381) || ((C2381) objectVolatile2).f7899 == null) {
                unsafe.putIntVolatile(c2601, C2600.f8687, 536870911);
                unsafe.putObjectVolatile(c2601, j2, C5703.f18785);
                c2600 = c2601;
            } else {
                c2601.m4900();
            }
            if (c2600 != null) {
                return c2600;
            }
        }
        return new C2600(2, interfaceC0443);
    }

    /* JADX INFO: renamed from: ۦۣ */
    public static void m3373(String str, int i, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i + " parameters found " + arrayList.size());
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static final int m3374(InterfaceC0103 interfaceC0103, C0971 c0971, String str) {
        m3352(c0971, interfaceC0103);
        int iMo188 = interfaceC0103.mo188(str);
        if (iMo188 != -3) {
            return iMo188;
        }
        C4228 c4228 = c0971.f3429;
        C1225 c1225 = new C1225(13, interfaceC0103, c0971);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c4228.f14025;
        Map map = (Map) concurrentHashMap.get(interfaceC0103);
        C4992 c4992 = f5397;
        Object obj = map != null ? map.get(c4992) : null;
        Object objMo449 = obj != null ? obj : null;
        if (objMo449 == null) {
            objMo449 = c1225.mo449();
            Object concurrentHashMap2 = concurrentHashMap.get(interfaceC0103);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(interfaceC0103, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(c4992, objMo449);
        }
        Integer num = (Integer) ((Map) objMo449).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* JADX INFO: renamed from: ۥؓ */
    public abstract void mo3375(C0838 c0838);

    /* JADX INFO: renamed from: ۥّ */
    public abstract void mo3376(C0838 c0838);

    /* JADX INFO: renamed from: ۥْ */
    public abstract Member mo2502();

    /* JADX INFO: renamed from: ۥۙ */
    public /* synthetic */ void m3377() {
        if (AbstractC4266.m7562(mo2502())) {
            return;
        }
        C2316.m4357(this, "\" accessible. Please check if the member is accessible or if the security manager allows it.", "Failed to make the member \"");
    }
}
