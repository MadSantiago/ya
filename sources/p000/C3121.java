package p000;

import android.R;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.Toolbar;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ۦٜؒؕۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C3121 implements InterfaceC5641, InterfaceC5876, InterfaceC2003, InterfaceC5138, InterfaceC0614, InterfaceC0260, InterfaceC1292 {

    /* JADX INFO: renamed from: ۦ۟ */
    public Object f10451;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f10452;

    public C3121(int i, byte b) {
        this.f10452 = i;
        switch (i) {
            case 13:
                this.f10451 = new C0638((Object) null);
                break;
            case 14:
            case 15:
            default:
                C3860 c3860 = new C3860();
                this.f10451 = c3860;
                if (!c3860.f12891) {
                    if (c3860.f12889) {
                        AbstractC2731.m5089("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    c3860.m6893();
                    c3860.f12889 = true;
                    break;
                }
                break;
            case 16:
                this.f10451 = new LinkedHashSet();
                break;
            case 17:
                this.f10451 = new Region();
                break;
        }
    }

    /* JADX INFO: renamed from: ۥْ */
    public static C4079 m5734(C4562 c4562, C0834 c0834, C5772 c5772, C2431 c2431) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(c0834.f2963.getResources(), c2431.f8095);
        Map map = c2431.f8094;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z = false;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config config = AbstractC0080.f15150;
        if (c4562 != null && c4562.f15070) {
            z = true;
        }
        return new C4079(bitmapDrawable, c0834, 1, c5772, str, zBooleanValue, z);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static C3121 m5735(Object obj) {
        if (obj != null) {
            return new C3121(1, obj);
        }
        C0178.m387("instance cannot be null");
        return null;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public static InterfaceC5841 m5736(C3121 c3121, int i) {
        C0846 c0846 = (C0846) c3121.f10451;
        AbstractC3191 abstractC3191M7473 = AbstractC4225.m7473();
        InterfaceC4745 interfaceC4745Mo4945 = abstractC3191M7473 != null ? abstractC3191M7473.mo4945() : null;
        AbstractC3191 abstractC3191M7452 = AbstractC4225.m7452(abstractC3191M7473);
        try {
            C1282 c1282 = (C1282) c0846.f3021.getValue();
            return c0846.f3039.m5109(i, c1282.f4371, c0846.f3029, new C4618(i, c1282));
        } finally {
            AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
        }
    }

    @Override // p000.InterfaceC4895
    public Object get() {
        switch (this.f10452) {
            case 1:
                return this.f10451;
            default:
                return new C2171((C1862) ((InterfaceC5641) this.f10451).get());
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0093 A[LOOP:0: B:22:0x004e->B:34:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0096 A[EDGE_INSN: B:53:0x0096->B:35:0x0096 BREAK  A[LOOP:0: B:22:0x004e->B:34:0x0093], SYNTHETIC] */
    /* JADX INFO: renamed from: ۥؓ */
    public Object m5737(InterfaceC4541 interfaceC4541, InterfaceC4448 interfaceC4448) {
        C4683 c4683;
        InterfaceC4783 interfaceC4783;
        if (((AbstractC5676) this.f10451) == null) {
            AbstractC0371.m794("Called runAndWatch on a manager that has been disposed of");
        }
        AbstractC5676 abstractC5676 = (AbstractC5676) this.f10451;
        if ((abstractC5676 instanceof C4683) && (interfaceC4783 = (c4683 = (C4683) abstractC5676).f15427) != null && !interfaceC4783.equals(interfaceC4541)) {
            C4363 c4363 = new C4363();
            InterfaceC4783 interfaceC4784 = c4683.f15427;
            if (interfaceC4784 == null) {
                AbstractC0371.m794("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            C3639 c3639 = c4683.f15426;
            ArrayList arrayList = c4363.f14368;
            if (c3639 != null) {
                Object[] objArr = c3639.f12174;
                long[] jArr = c3639.f12175;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8;
                            int i3 = 8 - ((~(i - length)) >>> 31);
                            int i4 = 0;
                            while (i4 < i3) {
                                if ((j & 255) < 128) {
                                    arrayList.add(new C5896(objArr[(i << 3) + i4], interfaceC4784));
                                }
                                j >>= i2;
                                i4++;
                                i2 = i2;
                            }
                            if (i3 != i2) {
                                break;
                            }
                            if (i != length) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else {
                arrayList.add(new C5896(c4683.f15430, interfaceC4784));
            }
            c4363.mo7669();
            c4683.mo7671();
            this.f10451 = c4363;
        }
        AbstractC5676 abstractC5677 = (AbstractC5676) this.f10451;
        AbstractC3191 abstractC3191Mo4469 = AbstractC1538.m3278().mo4469(abstractC5677.mo7668(interfaceC4541));
        abstractC5677.mo7670(interfaceC4541);
        try {
            AbstractC3191 abstractC3191M5883 = abstractC3191Mo4469.m5883();
            try {
                Object objMo449 = interfaceC4448.mo449();
                AbstractC3191.m5876(abstractC3191M5883);
                abstractC3191Mo4469.mo2657();
                abstractC5677.mo7669();
                return objMo449;
            } catch (Throwable th) {
                AbstractC3191.m5876(abstractC3191M5883);
                throw th;
            }
        } catch (Throwable th2) {
            abstractC3191Mo4469.mo2657();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۥؖ */
    public C5470 m5738(C3369 c3369, ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850) {
        long j;
        boolean z;
        long jM1785;
        C0638 c0638 = (C0638) this.f10451;
        C0638 c0639 = new C0638(((ArrayList) c3369.f11255).size());
        ArrayList arrayList = (ArrayList) c3369.f11255;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C0284 c0284 = (C0284) arrayList.get(i);
            long j2 = c0284.f1055;
            C1820 c1820 = (C1820) c0638.m1450(j2);
            if (c1820 == null) {
                j = c0284.f1053;
                jM1785 = c0284.f1056;
                z = false;
            } else {
                long j3 = c1820.f6048;
                j = j3;
                z = c1820.f6046;
                jM1785 = viewTreeObserverOnGlobalLayoutListenerC0850.m1785(c1820.f6047);
            }
            long j4 = c0284.f1055;
            int i2 = i;
            ArrayList arrayList2 = arrayList;
            int i3 = size;
            c0639.m1451(j4, new C3536(j4, c0284.f1053, c0284.f1056, c0284.f1051, c0284.f1052, j, jM1785, z, c0284.f1062, c0284.f1060, c0284.f1059, c0284.f1061, c0284.f1057, c0284.f1058));
            boolean z2 = c0284.f1051;
            if (z2) {
                c0638.m1451(j2, new C1820(c0284.f1053, c0284.f1050, z2));
            } else {
                c0638.m1452(j2);
            }
            i = i2 + 1;
            arrayList = arrayList2;
            size = i3;
        }
        return new C5470(c0639, c3369);
    }

    @Override // p000.InterfaceC5138
    /* JADX INFO: renamed from: ۥؗ */
    public InterfaceC3879 mo5739(String str) {
        return new C0448(((InterfaceC2488) this.f10451).mo3508());
    }

    /* JADX INFO: renamed from: ۥً */
    public void m5740(C4730 c4730) {
        ((Region) this.f10451).set(c4730.f15612, c4730.f15611, c4730.f15610, c4730.f15613);
    }

    @Override // p000.InterfaceC2707
    /* JADX INFO: renamed from: ۥَ */
    public AbstractC1814 mo687(long j, AbstractC1814 abstractC1814, AbstractC1814 abstractC1815, AbstractC1814 abstractC1816) {
        return ((C1489) this.f10451).mo687(j, abstractC1814, abstractC1815, abstractC1816);
    }

    /* JADX INFO: renamed from: ۥُ */
    public InterfaceC3163 m5741(InterfaceC3163 interfaceC3163) {
        return interfaceC3163 instanceof C4939 ? interfaceC3163 : new C4792(-((C3472) this.f10451).m6264(), interfaceC3163);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥّ */
    public void m5742(C2281 c2281, AbstractC0772 abstractC0772) {
        C2812 c2812;
        if (abstractC0772 instanceof C2812) {
            c2812 = (C2812) abstractC0772;
            int i = c2812.f9387;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2812.f9387 = i - Integer.MIN_VALUE;
            } else {
                c2812 = new C2812(this, abstractC0772);
            }
        } else {
            c2812 = new C2812(this, abstractC0772);
        }
        Object obj = c2812.f9386;
        int i2 = c2812.f9387;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            C4994 c4994 = (C4994) this.f10451;
            c2812.f9387 = 1;
            c4994.mo1575(c2281, c2812);
            return;
        }
        if (i2 != 1) {
            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
        } else {
            AbstractC0186.m409(obj);
            C1078.m2274();
        }
    }

    /* JADX INFO: renamed from: ۥٓ */
    public void m5743(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.f10451).notifyViewVisibilityChanged(view, i, z);
        }
    }

    /* JADX INFO: renamed from: ۥٙ */
    public C5040 m5744(JSONObject jSONObject) throws JSONException {
        C3223 c3223;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            c3223 = new C3223(5);
        } else {
            c3223 = new C3223(26);
        }
        C4369 c4369 = (C4369) this.f10451;
        switch (c3223.f10836) {
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return C3223.m5944(c4369);
            default:
                jSONObject.optInt("settings_version", 0);
                int iOptInt = jSONObject.optInt("cache_duration", 3600);
                double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
                double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
                int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
                C1984 c1984 = jSONObject.has("session") ? new C1984(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new C1984(new JSONObject().optInt("max_custom_exception_events", 8));
                JSONObject jSONObject2 = jSONObject.getJSONObject("features");
                return new C5040(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : System.currentTimeMillis() + (((long) iOptInt) * 1000), c1984, new C1515(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), dOptDouble, dOptDouble2, iOptInt2);
        }
    }

    @Override // p000.InterfaceC2707
    /* JADX INFO: renamed from: ۥۖ */
    public AbstractC1814 mo3122(AbstractC1814 abstractC1814, AbstractC1814 abstractC1815, AbstractC1814 abstractC1816) {
        return ((C1489) this.f10451).mo3122(abstractC1814, abstractC1815, abstractC1816);
    }

    @Override // p000.InterfaceC2707
    /* JADX INFO: renamed from: ۥۗ */
    public long mo3123(AbstractC1814 abstractC1814, AbstractC1814 abstractC1815, AbstractC1814 abstractC1816) {
        return ((C1489) this.f10451).mo3123(abstractC1814, abstractC1815, abstractC1816);
    }

    @Override // p000.InterfaceC1292, p000.InterfaceC2707
    /* JADX INFO: renamed from: ۥۣ */
    public boolean mo2726() {
        return false;
    }

    @Override // p000.InterfaceC0614
    /* JADX INFO: renamed from: ۦؑ */
    public boolean mo1377(MenuC4903 menuC4903, MenuItem menuItem) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0150 A[PHI: r16
  0x0150: PHI (r16v3 ۥ۟ؒٔؒ) = (r16v1 ۥ۟ؒٔؒ), (r16v1 ۥ۟ؒٔؒ), (r16v5 ۥ۟ؒٔؒ) binds: [B:100:0x014e, B:96:0x0147, B:55:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x0155 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0142 A[PHI: r16 r18
  0x0142: PHI (r16v1 ۥ۟ؒٔؒ) = (r16v0 ۥ۟ؒٔؒ), (r16v0 ۥ۟ؒٔؒ), (r16v2 ۥ۟ؒٔؒ) binds: [B:91:0x013f, B:86:0x0133, B:79:0x0120] A[DONT_GENERATE, DONT_INLINE]
  0x0142: PHI (r18v2 double) = (r18v1 double), (r18v1 double), (r18v3 double) binds: [B:91:0x013f, B:86:0x0133, B:79:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۦٌ */
    public C2431 m5745(C0834 c0834, C5772 c5772, C0181 c0181, int i) {
        C2431 c2431Mo4416;
        double d;
        C2431 c2431;
        boolean zEquals;
        C2431 c2432;
        if (AbstractC3761.m6619(c0834.f2959)) {
            C4475 c4475 = (C4475) ((C1199) this.f10451).f4128.getValue();
            if (c4475 == null) {
                c2431Mo4416 = null;
            } else {
                c2431Mo4416 = c4475.f14775.mo4416(c5772);
                if (c2431Mo4416 == null) {
                    C0322 c0322 = c4475.f14774;
                    synchronized (c0322) {
                        try {
                            ArrayList arrayList = (ArrayList) ((LinkedHashMap) c0322.f1178).get(c5772);
                            if (arrayList == null) {
                                c2431Mo4416 = null;
                            } else {
                                int size = arrayList.size();
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= size) {
                                        c2432 = null;
                                        break;
                                    }
                                    C1457 c1457 = (C1457) arrayList.get(i2);
                                    Bitmap bitmap = (Bitmap) c1457.f4967.get();
                                    c2432 = bitmap != null ? new C2431(bitmap, c1457.f4966) : null;
                                    if (c2432 != null) {
                                        break;
                                    }
                                    i2++;
                                }
                                int i3 = c0322.f1179;
                                c0322.f1179 = i3 + 1;
                                if (i3 >= 10) {
                                    c0322.m688();
                                }
                                c2431Mo4416 = c2432;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            if (c2431Mo4416 != null) {
                Bitmap bitmap2 = c2431Mo4416.f8095;
                Bitmap.Config config = bitmap2.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (config != Bitmap.Config.HARDWARE || c0834.f2962) {
                    Object obj = c2431Mo4416.f8094.get("coil#is_sampled");
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    if (AbstractC3831.m6874(c0181, C0181.f668)) {
                        c2431 = null;
                        if (zBooleanValue) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                    } else {
                        String str = (String) c5772.f19023.get("coil#transformation_size");
                        if (str != null) {
                            zEquals = str.equals(c0181.toString());
                        } else {
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            AbstractC3831 abstractC3831 = c0181.f670;
                            int i4 = abstractC3831 instanceof C0189 ? ((C0189) abstractC3831).f704 : Integer.MAX_VALUE;
                            AbstractC3831 abstractC3832 = c0181.f669;
                            int i5 = abstractC3832 instanceof C0189 ? ((C0189) abstractC3832).f704 : Integer.MAX_VALUE;
                            double dM5783 = C3133.m5783(width, height, i4, i5, i);
                            boolean zM4430 = AbstractC0040.m4430(c0834);
                            if (zM4430) {
                                double d2 = dM5783 > 1.0d ? 1.0d : dM5783;
                                c2431 = null;
                                d = 1.0d;
                                if (Math.abs(((double) i4) - (((double) width) * d2)) > 1.0d && Math.abs(((double) i5) - (d2 * ((double) height))) > 1.0d) {
                                    if ((dM5783 == d && !zM4430) || (dM5783 > d && zBooleanValue)) {
                                        zEquals = false;
                                    }
                                }
                            } else {
                                d = 1.0d;
                                c2431 = null;
                                if ((i4 != Integer.MIN_VALUE && i4 != Integer.MAX_VALUE && Math.abs(i4 - width) > 1) || (i5 != Integer.MIN_VALUE && i5 != Integer.MAX_VALUE && Math.abs(i5 - height) > 1)) {
                                    if (dM5783 == d) {
                                        zEquals = false;
                                    } else {
                                        zEquals = false;
                                    }
                                }
                            }
                            zEquals = true;
                        }
                    }
                    if (zEquals) {
                        return c2431Mo4416;
                    }
                    return c2431;
                }
                zEquals = false;
                c2431 = null;
                if (zEquals) {
                    return c2431Mo4416;
                }
                return c2431;
            }
        }
        return null;
    }

    @Override // p000.InterfaceC2003
    /* JADX INFO: renamed from: ۦِ */
    public Object mo804(Object obj) {
        return Optional.ofNullable(((InterfaceC2003) this.f10451).mo804((AbstractC2978) obj));
    }

    /* JADX INFO: renamed from: ۦٕ */
    public void m5746() {
        ((C4229) this.f10451).f14028 = 3;
    }

    @Override // p000.InterfaceC2707
    /* JADX INFO: renamed from: ۦٗ */
    public AbstractC1814 mo700(long j, AbstractC1814 abstractC1814, AbstractC1814 abstractC1815, AbstractC1814 abstractC1816) {
        return ((C1489) this.f10451).mo700(j, abstractC1814, abstractC1815, abstractC1816);
    }

    /* JADX INFO: renamed from: ۦٚ */
    public void mo3458() {
        View viewFindViewById;
        View view = (View) this.f10451;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new RunnableC0029(20, viewFindViewById));
    }

    /* JADX INFO: renamed from: ۦٛ */
    public C2749 m5747() {
        C2749 c2749 = new C2749();
        c2749.f9028 = (C4229) this.f10451;
        return c2749;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public InterfaceC1652 m5748(Class cls) {
        return (InterfaceC1652) ((Map) this.f10451).get(cls);
    }

    @Override // p000.InterfaceC0614
    /* JADX INFO: renamed from: ۦۙ */
    public void mo1378(MenuC4903 menuC4903) {
        Toolbar toolbar = (Toolbar) this.f10451;
        C4718 c4718 = toolbar.f159.f96;
        if (c4718 == null || !c4718.m8051()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f136.f9376).iterator();
            while (it.hasNext()) {
                ((C2050) it.next()).f6760.m5277();
            }
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public void mo3459() {
        View view = (View) this.f10451;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: ۦۛ */
    public void m5749(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f10451).setResultCode(i);
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public C5772 m5750(C0834 c0834, Object obj, C1765 c1765, C4931 c4931) {
        String string;
        Map linkedHashMap;
        c0834.getClass();
        List list = ((C1199) this.f10451).f4130.f464;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                C3869 c3869 = (C3869) list.get(i);
                C1032 c1032 = (C1032) c3869.f12915;
                if (((Class) c3869.f12914).isAssignableFrom(obj.getClass())) {
                    switch (c1032.f3639) {
                        case 0:
                            File file = (File) obj;
                            string = file.getPath() + ':' + file.lastModified();
                            break;
                        default:
                            Uri uri = (Uri) obj;
                            if (!AbstractC3831.m6874(uri.getScheme(), "android.resource")) {
                                string = uri.toString();
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append(uri);
                                sb.append('-');
                                Configuration configuration = c1765.f5881.getResources().getConfiguration();
                                Bitmap.Config config = AbstractC0080.f15150;
                                sb.append(configuration.uiMode & 48);
                                string = sb.toString();
                            }
                            break;
                    }
                    if (string != null) {
                    }
                }
                i++;
            } else {
                string = null;
            }
        }
        if (string == null) {
            return null;
        }
        Map map = c0834.f2974.f17489;
        boolean zIsEmpty = map.isEmpty();
        C0204 c0204 = C0204.f751;
        if (zIsEmpty) {
            linkedHashMap = c0204;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getValue().getClass();
                C0178.m382();
                return null;
            }
        }
        return linkedHashMap.isEmpty() ? new C5772(string, c0204) : new C5772(string, new LinkedHashMap(linkedHashMap));
    }

    /* JADX INFO: renamed from: ۦۨ */
    public C2244 m5751() {
        C2244 c2244 = new C2244();
        c2244.f9028 = (C4229) this.f10451;
        return c2244;
    }

    @Override // p000.InterfaceC0260
    public InterfaceC0862 get(int i) {
        return (C2673) this.f10451;
    }

    public /* synthetic */ C3121(int i, Object obj) {
        this.f10452 = i;
        this.f10451 = obj;
    }

    public C3121(float f, float f2, AbstractC1814 abstractC1814) {
        Object c3121;
        this.f10452 = 29;
        int[] iArr = AbstractC3085.f10346;
        if (abstractC1814 != null) {
            c3121 = new C1039(f, f2, abstractC1814);
        } else {
            c3121 = new C3121(f, f2);
        }
        this.f10451 = new C1489(17, c3121);
    }

    public C3121(InterfaceC2880 interfaceC2880) {
        this.f10452 = 22;
        float f = AbstractC3451.f11462;
        C4695 c4695 = new C4695();
        c4695.f15484 = f;
        float fMo746 = interfaceC2880.mo746();
        float f2 = AbstractC0362.f1315;
        c4695.f15483 = fMo746 * 386.0878f * 160.0f * 0.84f;
        this.f10451 = c4695;
    }

    public C3121(C1199 c1199, C2346 c2346) {
        this.f10452 = 7;
        this.f10451 = c1199;
    }

    public /* synthetic */ C3121(char c, int i) {
        this.f10452 = i;
    }

    public C3121(ThreadFactoryC1581 threadFactoryC1581) {
        this.f10452 = 24;
        this.f10451 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactoryC1581);
    }

    public C3121(int i) {
        this.f10452 = 9;
        this.f10451 = AbstractC1605.m3349(new int[i]);
    }

    public C3121(float f, float f2) {
        this.f10452 = 28;
        this.f10451 = new C2673(f, f2, 0.01f);
    }
}
