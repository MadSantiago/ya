package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import java.io.InterruptedIOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ۥؚٖٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1489 implements InterfaceC5478, InterfaceC5641, InterfaceC5709, InterfaceC1292, InterfaceC4895 {

    /* JADX INFO: renamed from: ۥٖ */
    public static final C4671 f5055 = new C4671("_root_");

    /* JADX INFO: renamed from: ۥَ */
    public Object f5056;

    /* JADX INFO: renamed from: ۥْ */
    public Object f5057;

    /* JADX INFO: renamed from: ۥٓ */
    public Object f5058;

    /* JADX INFO: renamed from: ۦ۟ */
    public Object f5059;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f5060;

    public C1489(int i) {
        this.f5060 = i;
        switch (i) {
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                break;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f5057 = new ArrayDeque();
                this.f5058 = new ArrayDeque();
                this.f5056 = new ArrayDeque();
                break;
            case 8:
                this.f5059 = new ArrayList();
                this.f5057 = new HashMap();
                this.f5058 = new HashMap();
                break;
            case 11:
                this.f5059 = new ArrayList();
                this.f5057 = new ArrayList();
                this.f5058 = new ArrayList();
                this.f5056 = C1753.f5827;
                break;
            case 24:
                C2346 c2346 = new C2346(22);
                this.f5059 = c2346;
                C1489 c1489 = new C1489((C1489) null, c2346);
                this.f5058 = c1489;
                this.f5057 = c1489.m3148();
                C5008 c5008 = new C5008(4);
                this.f5056 = c5008;
                c1489.m3100("require", new C3733(c5008));
                c5008.f16580.put("internal.platform", CallableC0256.f956);
                c1489.m3100("runtime.counter", new C5563(Double.valueOf(0.0d)));
                break;
            default:
                this.f5059 = new ReentrantReadWriteLock();
                this.f5058 = new HashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: ۥٌ */
    public static C5479 m3094(C1330 c1330) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(AbstractC3354.f11215.m6149(62)));
        }
        return m3099(c1330, sb.toString(), -1, -1);
    }

    /* JADX INFO: renamed from: ۥٞ */
    public static final void m3095(C5479 c5479, int i, String str) {
        m3098(c5479, i, "Failed to segment " + str + " type because the size of its first element has exceeded the maximum limit");
    }

    /* JADX INFO: renamed from: ۥۦ */
    public static int m3096(Object obj) {
        Object c4535;
        boolean z = obj instanceof C1330;
        String str = z ? ((C1330) obj).f4598 : "placeholder";
        if (z) {
            obj = ((C1330) obj).f4597;
        }
        Bundle bundle = new Bundle();
        if (obj != null) {
            if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            } else if (obj instanceof Object[]) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else {
                if (!(obj instanceof Serializable)) {
                    throw new IllegalStateException(("Key-Value type " + obj.getClass().getName() + " is not allowed").toString());
                }
                bundle.putSerializable(str, (Serializable) obj);
            }
        }
        try {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeBundle(bundle);
            int iDataSize = parcelObtain.dataSize();
            parcelObtain.recycle();
            c4535 = Integer.valueOf(iDataSize);
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        if (c4535 instanceof C4535) {
            c4535 = null;
        }
        Integer num = (Integer) c4535;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۦؐ */
    public static void m3097(C1489 c1489, String str, InterfaceC4448 interfaceC4448) {
        C2993 c2993 = (C2993) c1489.f5056;
        c2993.f10070.put(str.concat(c1489.m3169(3)), new C3869((Context) c1489.f5059, new C3659(c2993, c1489, str, interfaceC4448, 6)));
    }

    /* JADX INFO: renamed from: ۦٞ */
    public static final void m3098(C5479 c5479, int i, String str) {
        ArrayList arrayList = C2503.f8322;
        C1330 c1330 = c5479.f18072;
        String str2 = c1330.f4598;
        Object obj = c1330.f4597;
        C2503.m4657(6, "YukiHookDataChannel cannot send this data key of \"" + str2 + "\" type " + (obj != null ? obj.getClass() : null) + ", because it is too large (total " + (i / 1024.0f) + " KB, limit " + (C2993.f10067 / 1024.0f) + " KB) and cannot be segmented\n" + (!AbstractC0684.m1534(str) ? str.concat("\n") : "") + "If you want to lift this restriction, use the allowSendTooLargeData function when calling, but this may cause the app crash", null);
    }

    /* JADX INFO: renamed from: ۦۢ */
    public static C5479 m3099(C1330 c1330, String str, int i, int i2) {
        return new C5479(str, i > 0, i, i2, c1330);
    }

    @Override // p000.InterfaceC4895
    public Object get() {
        switch (this.f5060) {
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C3261((C0377) ((C3121) this.f5059).f10451, (C1802) ((InterfaceC5641) this.f5057).get(), (InterfaceC3534) ((InterfaceC5641) this.f5058).get(), (C1111) ((InterfaceC5641) this.f5056).get());
            default:
                return new C1489((Executor) ((InterfaceC4895) this.f5059).get(), (C1835) ((InterfaceC4895) this.f5057).get(), (C2808) ((C2808) this.f5058).get(), (C1835) ((InterfaceC4895) this.f5056).get(), 20);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public void m3100(String str, InterfaceC2150 interfaceC2150) {
        C1489 c1489;
        HashMap map = (HashMap) this.f5058;
        if (!map.containsKey(str) && (c1489 = (C1489) this.f5059) != null && c1489.m3153(str)) {
            c1489.m3100(str, interfaceC2150);
        } else {
            if (((HashMap) this.f5056).containsKey(str)) {
                return;
            }
            if (interfaceC2150 == null) {
                map.remove(str);
            } else {
                map.put(str, interfaceC2150);
            }
        }
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۥؓ */
    public void mo3101(C3343 c3343) {
        m3116(c3343);
    }

    /* JADX INFO: renamed from: ۥؔ */
    public void m3102() {
        C2658 c2658 = (C2658) this.f5058;
        StringBuilder sb = c2658.f8818;
        if (sb.length() <= 0 || '\n' == sb.charAt(sb.length() - 1)) {
            return;
        }
        c2658.m4967('\n');
    }

    /* JADX INFO: renamed from: ۥؕ */
    public void m3103(C5479 c5479) {
        String str = (String) this.f5057;
        C1330 c1330 = c5479.f18072;
        Context contextM3850 = (Context) this.f5059;
        if (contextM3850 == null) {
            C1967.f6501.getClass();
            contextM3850 = C1967.m3850();
        }
        if (contextM3850 == null) {
            ArrayList arrayList = C2503.f8322;
            C2503.m4657(6, "Failed to sendBroadcast like \"" + c1330.f4598 + "\", because got null context in \"" + str + "\"", null);
            return;
        }
        Intent intent = new Intent();
        if (!AbstractC0684.m1534("")) {
            intent.setPackage("");
        }
        boolean z = C2993.f10065;
        intent.setAction(z ? C2993.m5583(null) : C2993.m5584(str));
        if (!AbstractC3831.m6874(str, "android")) {
            if (z) {
                str = C0113.f448;
            }
            intent.setPackage(str);
        }
        intent.putExtra(c1330.f4598 + m3131(), c5479);
        contextM3850.sendBroadcast(intent, null, null);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۥؖ */
    public void mo3104(C3401 c3401) {
        m3116(c3401);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۥؗ */
    public void mo3105(C3813 c3813) {
        m3116(c3813);
    }

    /* JADX INFO: renamed from: ۥؙ */
    public List m3106() {
        ArrayList arrayList;
        if (((ArrayList) this.f5059).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f5059)) {
            arrayList = new ArrayList((ArrayList) this.f5059);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥؚ */
    public C5479 m3107(Intent intent, String str) {
        Object c4535;
        Serializable serializable;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String strConcat = str.concat(m3131());
                Class<C5479> cls = C5479.class;
                Class<C5479> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(cls));
                if (clsM9037 != null) {
                    cls = clsM9037;
                }
                int i = AbstractC5551.f18327;
                Serializable serializable2 = extras.getSerializable(strConcat);
                if (serializable2 == null) {
                    serializable2 = null;
                }
                if (AbstractC5551.f18327 >= 33 && (serializable = extras.getSerializable(strConcat, cls)) != null) {
                    serializable2 = serializable;
                }
                c4535 = (C5479) serializable2;
            } else {
                c4535 = null;
            }
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        return (C5479) (c4535 instanceof C4535 ? null : c4535);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۥً */
    public void mo3108(C1256 c1256) {
        m3116(c1256);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥٍ */
    public Object m3109(AbstractC0772 abstractC0772) throws Throwable {
        C2562 c2562;
        InterfaceC3087 interfaceC3087;
        Throwable th;
        InterfaceC3087 interfaceC3088;
        C1489 c1489;
        if (abstractC0772 instanceof C2562) {
            c2562 = (C2562) abstractC0772;
            int i = c2562.f8555;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2562.f8555 = i - Integer.MIN_VALUE;
            } else {
                c2562 = new C2562(this, abstractC0772);
            }
        } else {
            c2562 = new C2562(this, abstractC0772);
        }
        Object obj = c2562.f8553;
        int i2 = c2562.f8555;
        C2358 c2358 = C2358.f7817;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        try {
            if (i2 == 0) {
                AbstractC0186.m409(obj);
                if (!(((C3529) this.f5057).m890() instanceof InterfaceC0465)) {
                    return c2358;
                }
                interfaceC3087 = (C1387) this.f5059;
                c2562.f8552 = this;
                c2562.f8551 = interfaceC3087;
                c2562.f8555 = 1;
                if (interfaceC3087.mo2949(c2562) != enumC2282) {
                }
                return enumC2282;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC3088 = c2562.f8551;
                c1489 = c2562.f8552;
                try {
                    AbstractC0186.m409(obj);
                    ((C3529) c1489.f5057).m854(c2358);
                    interfaceC3088.mo2950(null);
                    return c2358;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC3088.mo2950(null);
                    throw th;
                }
            }
            InterfaceC3087 interfaceC3089 = c2562.f8551;
            C1489 c14810 = c2562.f8552;
            AbstractC0186.m409(obj);
            interfaceC3087 = interfaceC3089;
            this = c14810;
            if (!(((C3529) this.f5057).m890() instanceof InterfaceC0465)) {
                interfaceC3087.mo2950(null);
                return c2358;
            }
            c2562.f8552 = this;
            c2562.f8551 = interfaceC3087;
            c2562.f8555 = 2;
            if (this.m3157(c2562) != enumC2282) {
                c1489 = this;
                interfaceC3088 = interfaceC3087;
                ((C3529) c1489.f5057).m854(c2358);
                interfaceC3088.mo2950(null);
                return c2358;
            }
            return enumC2282;
        } catch (Throwable th3) {
            InterfaceC3087 interfaceC30810 = interfaceC3087;
            th = th3;
            interfaceC3088 = interfaceC30810;
            interfaceC3088.mo2950(null);
            throw th;
        }
    }

    @Override // p000.InterfaceC2707
    /* JADX INFO: renamed from: ۥَ */
    public AbstractC1814 mo687(long j, AbstractC1814 abstractC1814, AbstractC1814 abstractC1815, AbstractC1814 abstractC1816) {
        AbstractC1814 abstractC1817;
        AbstractC1814 abstractC1814Mo2171 = (AbstractC1814) this.f5058;
        if (abstractC1814Mo2171 == null) {
            abstractC1814Mo2171 = abstractC1816.mo2171();
            this.f5058 = abstractC1814Mo2171;
        }
        int iMo2173 = abstractC1814Mo2171.mo2173();
        int i = 0;
        while (true) {
            abstractC1817 = (AbstractC1814) this.f5058;
            if (i >= iMo2173) {
                break;
            }
            if (abstractC1817 == null) {
                abstractC1817 = null;
            }
            long j2 = j;
            abstractC1817.mo2172(i, ((InterfaceC0260) this.f5059).get(i).mo1836(j2, abstractC1814.mo2174(i), abstractC1815.mo2174(i), abstractC1816.mo2174(i)));
            i++;
            j = j2;
        }
        if (abstractC1817 == null) {
            return null;
        }
        return abstractC1817;
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۥُ */
    public void mo3110(AbstractC1112 abstractC1112) {
        m3116(abstractC1112);
    }

    /* JADX INFO: renamed from: ۥِ */
    public int m3111() {
        return ((C2658) this.f5058).f8818.length();
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۥّ */
    public void mo3112(AbstractC2791 abstractC2791) {
        m3116(abstractC2791);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۥْ */
    public void mo3113(C3273 c3273) {
        m3116(c3273);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۥٓ */
    public void mo3114(C4456 c4456) {
        m3116(c4456);
    }

    /* JADX INFO: renamed from: ۥٕ */
    public void m3115(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308) {
        if (((ArrayList) this.f5059).contains(abstractComponentCallbacksC0308)) {
            C0178.m390(abstractComponentCallbacksC0308, "Fragment already added: ");
            return;
        }
        synchronized (((ArrayList) this.f5059)) {
            ((ArrayList) this.f5059).add(abstractComponentCallbacksC0308);
        }
        abstractComponentCallbacksC0308.f1125 = true;
    }

    /* JADX INFO: renamed from: ۥٗ */
    public void m3116(AbstractC3959 abstractC3959) {
        InterfaceC2059 interfaceC2059 = (InterfaceC2059) ((Map) this.f5056).get(abstractC3959.getClass());
        if (interfaceC2059 != null) {
            interfaceC2059.mo1989(this, abstractC3959);
        } else {
            m3155(abstractC3959);
        }
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public AbstractComponentCallbacksC0308 m3117(String str) {
        for (C1239 c1239 : ((HashMap) this.f5057).values()) {
            if (c1239 != null) {
                AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308M3117 = c1239.f4258;
                if (!str.equals(abstractComponentCallbacksC0308M3117.f1118)) {
                    abstractComponentCallbacksC0308M3117 = abstractComponentCallbacksC0308M3117.f1142.f9298.m3117(str);
                }
                if (abstractComponentCallbacksC0308M3117 != null) {
                    return abstractComponentCallbacksC0308M3117;
                }
            }
        }
        return null;
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۥٙ */
    public void mo3118(C2623 c2623) {
        m3116(c2623);
    }

    /* JADX INFO: renamed from: ۥٚ */
    public Bundle m3119(String str, Bundle bundle) {
        HashMap map = (HashMap) this.f5058;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    /* JADX INFO: renamed from: ۥٛ */
    public void m3120(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        m3161();
    }

    /* JADX INFO: renamed from: ۥٝ */
    public ArrayList m3121() {
        ArrayList arrayList = new ArrayList();
        for (C1239 c1239 : ((HashMap) this.f5057).values()) {
            if (c1239 != null) {
                arrayList.add(c1239);
            }
        }
        return arrayList;
    }

    @Override // p000.InterfaceC2707
    /* JADX INFO: renamed from: ۥۖ */
    public AbstractC1814 mo3122(AbstractC1814 abstractC1814, AbstractC1814 abstractC1815, AbstractC1814 abstractC1816) {
        AbstractC1814 abstractC1817;
        AbstractC1814 abstractC1814Mo2171 = (AbstractC1814) this.f5056;
        if (abstractC1814Mo2171 == null) {
            abstractC1814Mo2171 = abstractC1816.mo2171();
            this.f5056 = abstractC1814Mo2171;
        }
        int iMo2173 = abstractC1814Mo2171.mo2173();
        int i = 0;
        while (true) {
            abstractC1817 = (AbstractC1814) this.f5056;
            if (i >= iMo2173) {
                break;
            }
            if (abstractC1817 == null) {
                abstractC1817 = null;
            }
            abstractC1817.mo2172(i, ((InterfaceC0260) this.f5059).get(i).mo1837(abstractC1814.mo2174(i), abstractC1815.mo2174(i), abstractC1816.mo2174(i)));
            i++;
        }
        if (abstractC1817 == null) {
            return null;
        }
        return abstractC1817;
    }

    @Override // p000.InterfaceC2707
    /* JADX INFO: renamed from: ۥۗ */
    public long mo3123(AbstractC1814 abstractC1814, AbstractC1814 abstractC1815, AbstractC1814 abstractC1816) {
        int iMo2173 = abstractC1814.mo2173();
        long jMax = 0;
        for (int i = 0; i < iMo2173; i++) {
            jMax = Math.max(jMax, ((InterfaceC0260) this.f5059).get(i).mo1839(abstractC1814.mo2174(i), abstractC1815.mo2174(i), abstractC1816.mo2174(i)));
        }
        return jMax;
    }

    /* JADX INFO: renamed from: ۥۘ */
    public void m3124(C1239 c1239) {
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = c1239.f4258;
        String str = abstractComponentCallbacksC0308.f1118;
        HashMap map = (HashMap) this.f5057;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC0308.f1118, c1239);
        if (C2790.m5261(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0308);
        }
    }

    /* JADX INFO: renamed from: ۥۙ */
    public void m3125(AbstractC1359 abstractC1359) {
        if (((LinkedHashSet) this.f5056).add(abstractC1359)) {
            ((C5436) this.f5057).m9110(this, abstractC1359, -1);
        }
    }

    /* JADX INFO: renamed from: ۥۚ */
    public void m3126(C2666 c2666) {
        RunnableC5689 runnableC5689 = new RunnableC5689(22, this, c2666);
        synchronized (this.f5058) {
        }
        ((Handler) ((C4228) this.f5059).f14025).postDelayed(runnableC5689, 5400000L);
    }

    /* JADX INFO: renamed from: ۥۛ */
    public InterfaceC2150 m3127(C1173 c1173) {
        InterfaceC2150 interfaceC2150M4397 = InterfaceC2150.f7060;
        Iterator itM2500 = c1173.m2500();
        while (itM2500.hasNext()) {
            interfaceC2150M4397 = ((C2346) this.f5057).m4397(this, c1173.m2496(((Integer) itM2500.next()).intValue()));
            if (interfaceC2150M4397 instanceof C1710) {
                break;
            }
        }
        return interfaceC2150M4397;
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۥۜ */
    public void mo3128(C0674 c0674) {
        m3116(c0674);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public ArrayList m3129() {
        ArrayList arrayList = new ArrayList();
        for (C1239 c1239 : ((HashMap) this.f5057).values()) {
            if (c1239 != null) {
                arrayList.add(c1239.f4258);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00fe A[Catch: NumberFormatException | JSONException -> 0x010b, NumberFormatException | JSONException -> 0x010b, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x010b, blocks: (B:10:0x0031, B:24:0x0065, B:24:0x0065, B:26:0x0072, B:26:0x0072, B:28:0x0084, B:28:0x0084, B:29:0x008d, B:29:0x008d, B:51:0x00fe, B:51:0x00fe, B:33:0x009a, B:33:0x009a, B:35:0x00a7, B:35:0x00a7, B:37:0x00b9, B:37:0x00b9, B:38:0x00c2, B:38:0x00c2, B:42:0x00ce, B:42:0x00ce, B:46:0x00de, B:46:0x00de, B:50:0x00f2, B:50:0x00f2), top: B:63:0x0031, outer: #1 }] */
    /* JADX INFO: renamed from: ۥ۠ */
    public Bundle m3130() {
        C4474 c4474 = (C4474) this.f5056;
        C5371 c5371 = (C5371) c4474.f18660;
        if (((Bundle) this.f5058) == null) {
            String string = c4474.m7755().getString((String) this.f5059, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                C0237.m498();
                                                if (c5371.f17715.m1162(null, AbstractC4936.f16258)) {
                                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                    int length = jSONArray2.length();
                                                    long[] jArr = new long[length];
                                                    for (int i2 = 0; i2 < length; i2++) {
                                                        jArr[i2] = jSONArray2.optLong(i2);
                                                    }
                                                    bundle.putLongArray(string2, jArr);
                                                }
                                            } else {
                                                C3610 c3610 = c5371.f17717;
                                                C5371.m9020(c3610);
                                                c3610.f12020.m9430(string3, "Unrecognized persisted bundle type. Type");
                                            }
                                        } else if (string3.equals("ia")) {
                                            C0237.m498();
                                            if (c5371.f17715.m1162(null, AbstractC4936.f16258)) {
                                                JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                                int length2 = jSONArray3.length();
                                                int[] iArr = new int[length2];
                                                for (int i3 = 0; i3 < length2; i3++) {
                                                    iArr[i3] = jSONArray3.optInt(i3);
                                                }
                                                bundle.putIntArray(string2, iArr);
                                            }
                                        } else {
                                            C3610 c3611 = c5371.f17717;
                                            C5371.m9020(c3611);
                                            c3611.f12020.m9430(string3, "Unrecognized persisted bundle type. Type");
                                        }
                                    } else if (string3.equals("s")) {
                                        bundle.putString(string2, jSONObject.getString("v"));
                                    } else {
                                        C3610 c3612 = c5371.f17717;
                                        C5371.m9020(c3612);
                                        c3612.f12020.m9430(string3, "Unrecognized persisted bundle type. Type");
                                    }
                                } else if (string3.equals("l")) {
                                    bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                } else {
                                    C3610 c3613 = c5371.f17717;
                                    C5371.m9020(c3613);
                                    c3613.f12020.m9430(string3, "Unrecognized persisted bundle type. Type");
                                }
                            } else if (string3.equals("d")) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else {
                                C3610 c3614 = c5371.f17717;
                                C5371.m9020(c3614);
                                c3614.f12020.m9430(string3, "Unrecognized persisted bundle type. Type");
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            C3610 c3615 = c5371.f17717;
                            C5371.m9020(c3615);
                            c3615.f12020.m9432("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f5058 = bundle;
                } catch (JSONException unused2) {
                    C3610 c3616 = c5371.f17717;
                    C5371.m9020(c3616);
                    c3616.f12020.m9432("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.f5058) == null) {
                this.f5058 = (Bundle) this.f5057;
            }
        }
        Bundle bundle2 = (Bundle) this.f5058;
        AbstractC0487.m1047(bundle2);
        return new Bundle(bundle2);
    }

    /* JADX INFO: renamed from: ۥۡ */
    public String m3131() {
        return AbstractC5078.m8670(((String) this.f5057).hashCode(), "_");
    }

    /* JADX INFO: renamed from: ۥۢ */
    public boolean m3132(AbstractC3305 abstractC3305, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f5059).onActionItemClicked(m3139(abstractC3305), new MenuItemC0784((Context) this.f5057, (InterfaceMenuItemC4632) menuItem));
    }

    /* JADX INFO: renamed from: ۥۤ */
    public void m3133(RunnableC3850 runnableC3850) {
        runnableC3850.f12869.decrementAndGet();
        m3120((ArrayDeque) this.f5058, runnableC3850);
    }

    /* JADX INFO: renamed from: ۥۥ */
    public AbstractC1814 m3134(long j, AbstractC1814 abstractC1814, AbstractC1814 abstractC1815) {
        AbstractC1814 abstractC1816;
        AbstractC1814 abstractC1814Mo2171 = (AbstractC1814) this.f5058;
        if (abstractC1814Mo2171 == null) {
            abstractC1814Mo2171 = abstractC1814.mo2171();
            this.f5058 = abstractC1814Mo2171;
        }
        int iMo2173 = abstractC1814Mo2171.mo2173();
        int i = 0;
        while (true) {
            abstractC1816 = (AbstractC1814) this.f5058;
            if (i >= iMo2173) {
                break;
            }
            if (abstractC1816 == null) {
                abstractC1816 = null;
            }
            C3121 c3121 = (C3121) this.f5059;
            abstractC1814.getClass();
            long j2 = j / 1000000;
            C2550 c2550M8043 = ((C4695) c3121.f10451).m8043(abstractC1815.mo2174(i));
            long j3 = c2550M8043.f8508;
            abstractC1816.mo2172(i, (((Math.signum(c2550M8043.f8510) * AbstractC3671.m6539(j3 > 0 ? j2 / j3 : 1.0f).f6539) * c2550M8043.f8509) / j3) * 1000.0f);
            i++;
        }
        if (abstractC1816 == null) {
            return null;
        }
        return abstractC1816;
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۥۧ */
    public void mo3135(C4374 c4374) {
        m3116(c4374);
    }

    /* JADX INFO: renamed from: ۥۨ */
    public AbstractC0941 m3136(C3131 c3131, String str) {
        AbstractC0941 abstractC0941;
        AbstractC0941 abstractC0941Mo475;
        C3022 c3022;
        AbstractC1434 abstractC1434;
        synchronized (((C4992) this.f5056)) {
            try {
                abstractC0941 = (AbstractC0941) ((C3160) this.f5059).f10641.get(str);
                if (c3131.m5774(abstractC0941)) {
                    InterfaceC0217 interfaceC0217 = (InterfaceC0217) this.f5057;
                    if ((interfaceC0217 instanceof C3022) && (abstractC1434 = (c3022 = (C3022) interfaceC0217).f10181) != null) {
                        C2346 c2346 = c3022.f10179;
                        C2178 c2178 = (C2178) abstractC0941.m1914("androidx.lifecycle.savedstate.vm.tag");
                        if (c2178 != null && !c2178.f7202) {
                            c2178.m4235(c2346, abstractC1434);
                            EnumC0458 enumC0458Mo2387 = abstractC1434.mo2387();
                            if (enumC0458Mo2387 == EnumC0458.f1656 || enumC0458Mo2387.m976(EnumC0458.f1654)) {
                                c2346.m4404();
                            } else {
                                abstractC1434.mo2388(new C4389(1, abstractC1434, c2346));
                            }
                        }
                    }
                } else {
                    C4397 c4397 = new C4397((AbstractC5760) this.f5058);
                    c4397.m7687(AbstractC2164.f7142, str);
                    InterfaceC0217 interfaceC0218 = (InterfaceC0217) this.f5057;
                    try {
                        try {
                            abstractC0941Mo475 = interfaceC0218.mo476(c3131, c4397);
                        } catch (AbstractMethodError unused) {
                            abstractC0941Mo475 = interfaceC0218.mo474(c3131.f10543, c4397);
                        }
                    } catch (AbstractMethodError unused2) {
                        abstractC0941Mo475 = interfaceC0218.mo475(c3131.f10543);
                    }
                    abstractC0941 = abstractC0941Mo475;
                    AbstractC0941 abstractC0942 = (AbstractC0941) ((C3160) this.f5059).f10641.put(str, abstractC0941);
                    if (abstractC0942 != null) {
                        abstractC0942.m1915();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC0941;
    }

    /* JADX INFO: renamed from: ۦ */
    public boolean m3137(AbstractC3305 abstractC3305, MenuC4903 menuC4903) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f5059;
        C3466 c3466M3139 = m3139(abstractC3305);
        C0796 c0796 = (C0796) this.f5056;
        Menu menuC4451 = (Menu) c0796.get(menuC4903);
        if (menuC4451 == null) {
            menuC4451 = new MenuC4451((Context) this.f5057, menuC4903);
            c0796.put(menuC4903, menuC4451);
        }
        return callback.onCreateActionMode(c3466M3139, menuC4451);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۦؑ */
    public void mo3138(C2149 c2149) {
        m3116(c2149);
    }

    /* JADX INFO: renamed from: ۦؒ */
    public C3466 m3139(AbstractC3305 abstractC3305) {
        ArrayList arrayList = (ArrayList) this.f5058;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C3466 c3466 = (C3466) arrayList.get(i);
            if (c3466 != null && c3466.f11499 == abstractC3305) {
                return c3466;
            }
        }
        C3466 c3467 = new C3466((Context) this.f5057, abstractC3305);
        arrayList.add(c3467);
        return c3467;
    }

    /* JADX INFO: renamed from: ۦؓ */
    public void m3140(Object obj, String str) {
        m3160(m3094(new C1330(obj, str)));
    }

    /* JADX INFO: renamed from: ۦؔ */
    public void m3141(C1239 c1239) {
        HashMap map = (HashMap) this.f5057;
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = c1239.f4258;
        if (abstractComponentCallbacksC0308.f1126) {
            ((C0333) this.f5056).m767(abstractComponentCallbacksC0308);
        }
        if (map.get(abstractComponentCallbacksC0308.f1118) == c1239 && ((C1239) map.put(abstractComponentCallbacksC0308.f1118, null)) != null && C2790.m5261(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0308);
        }
    }

    /* JADX INFO: renamed from: ۦؖ */
    public void m3142(AbstractC3959 abstractC3959) {
        if (((AbstractC3959) abstractC3959.f13234) != null) {
            m3102();
            ((C2658) this.f5058).m4967('\n');
        }
    }

    /* JADX INFO: renamed from: ۦؗ */
    public void m3143(C2666 c2666) {
        Runnable runnable;
        synchronized (this.f5058) {
            runnable = (Runnable) ((LinkedHashMap) this.f5056).remove(c2666);
        }
        if (runnable != null) {
            ((Handler) ((C4228) this.f5059).f14025).removeCallbacks(runnable);
        }
    }

    /* JADX INFO: renamed from: ۦؘ */
    public void m3144(Bundle bundle) {
        C4474 c4474 = (C4474) this.f5056;
        C5371 c5371 = (C5371) c4474.f18660;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences.Editor editorEdit = c4474.m7755().edit();
        int size = bundle2.size();
        String str = (String) this.f5059;
        if (size == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        C0237.m498();
                        if (c5371.f17715.m1162(null, AbstractC4936.f16258)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                C3610 c3610 = c5371.f17717;
                                C5371.m9020(c3610);
                                c3610.f12020.m9430(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                C3610 c3611 = c5371.f17717;
                                C5371.m9020(c3611);
                                c3611.f12020.m9430(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e) {
                        C3610 c3612 = c5371.f17717;
                        C5371.m9020(c3612);
                        c3612.f12020.m9430(e, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f5058 = bundle2;
    }

    /* JADX INFO: renamed from: ۦؙ */
    public void m3145(C0683 c0683, int i) {
        if (i != 1 && i != 0) {
            C1078.m2273(AbstractC5078.m8670(i, "Unsupported priority value: "));
        } else if (((LinkedHashSet) this.f5056).add(c0683)) {
            ((C5436) this.f5057).m9110(this, c0683, i);
        }
    }

    /* JADX INFO: renamed from: ۦً */
    public InterfaceC2150 m3146(String str) {
        HashMap map = (HashMap) this.f5058;
        if (map.containsKey(str)) {
            return (InterfaceC2150) map.get(str);
        }
        C1489 c1489 = (C1489) this.f5059;
        if (c1489 != null) {
            return c1489.m3146(str);
        }
        throw new IllegalArgumentException(str + " is not defined");
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۦٌ */
    public void mo3147(C1507 c1507) {
        m3116(c1507);
    }

    /* JADX INFO: renamed from: ۦٍ */
    public C1489 m3148() {
        return new C1489(this, (C2346) this.f5057);
    }

    /* JADX INFO: renamed from: ۦَ */
    public void m3149(AbstractC3959 abstractC3959, int i) {
        Class<?> cls = abstractC3959.getClass();
        C2711 c2711 = (C2711) this.f5059;
        InterfaceC1652 interfaceC1652M5748 = ((C3121) c2711.f8983).m5748(cls);
        if (interfaceC1652M5748 != null) {
            m3171(i, interfaceC1652M5748.mo3440(c2711, (C5008) this.f5057));
        }
    }

    /* JADX INFO: renamed from: ۦُ */
    public void m3150(AbstractC1359 abstractC1359, C1318 c1318) {
        C5436 c5436 = (C5436) this.f5057;
        if (c5436.f17945 != 0) {
            return;
        }
        C1585 c1585M9108 = c5436.m9108(-1);
        c5436.f17935 = c1585M9108;
        c5436.f17945 = -1;
        c5436.f17937 = abstractC1359;
        if (c1318 != null) {
            if (c1585M9108 != null) {
                c1585M9108.f5336.mo667(new C0948(c1318));
            }
            c5436.f17938.m8388(null, new C1364(c1318));
        }
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۦِ */
    public void mo3151(C3523 c3523) {
        m3116(c3523);
    }

    /* JADX INFO: renamed from: ۦّ */
    public InterfaceC2150 m3152(InterfaceC2150 interfaceC2150) {
        return ((C2346) this.f5057).m4397(this, interfaceC2150);
    }

    /* JADX INFO: renamed from: ۦْ */
    public boolean m3153(String str) {
        if (((HashMap) this.f5058).containsKey(str)) {
            return true;
        }
        C1489 c1489 = (C1489) this.f5059;
        if (c1489 != null) {
            return c1489.m3153(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦٓ */
    public void m3154(String str, InterfaceC2150 interfaceC2150) {
        if (((HashMap) this.f5056).containsKey(str)) {
            return;
        }
        HashMap map = (HashMap) this.f5058;
        if (interfaceC2150 == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC2150);
        }
    }

    /* JADX INFO: renamed from: ۦٔ */
    public void m3155(AbstractC3959 abstractC3959) {
        AbstractC3959 abstractC39510 = (AbstractC3959) abstractC3959.f13232;
        while (abstractC39510 != null) {
            AbstractC3959 abstractC39511 = (AbstractC3959) abstractC39510.f13234;
            abstractC39510.mo1504(this);
            abstractC39510 = abstractC39511;
        }
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۦٕ */
    public void mo3156(C1799 c1799) {
        m3116(c1799);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX INFO: renamed from: ۦٖ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m3157(p000.AbstractC0772 r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f5056
            ۦؚٙؔؐ r0 = (p000.C4482) r0
            boolean r1 = r7 instanceof p000.C4596
            if (r1 == 0) goto L17
            r1 = r7
            ۦٕٛؑٚ r1 = (p000.C4596) r1
            int r2 = r1.f15169
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f15169 = r2
            goto L1c
        L17:
            ۦٕٛؑٚ r1 = new ۦٕٛؑٚ
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.f15166
            int r2 = r1.f15169
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            ۥؚٖٗ r6 = r1.f15167
            p000.AbstractC0186.m409(r7)
            goto L61
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r6)
            return r3
        L35:
            ۥؚٖٗ r6 = r1.f15167
            p000.AbstractC0186.m409(r7)
            goto L70
        L3b:
            p000.AbstractC0186.m409(r7)
            java.lang.Object r7 = r6.f5058
            java.util.List r7 = (java.util.List) r7
            ۥٟۚؕۨ r2 = p000.EnumC2282.f7590
            if (r7 == 0) goto L64
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L4d
            goto L64
        L4d:
            ۦؚۧؕؖ r7 = r0.m7761()
            ۦٟٟؖ r5 = new ۦٟٟؖ
            r5.<init>(r0, r6, r3)
            r1.f15167 = r6
            r1.f15169 = r4
            java.lang.Object r7 = r7.mo5826(r5, r1)
            if (r7 != r2) goto L61
            goto L6f
        L61:
            ۦٌٖٓؕ r7 = (p000.C4127) r7
            goto L72
        L64:
            r1.f15167 = r6
            r1.f15169 = r5
            r7 = 0
            java.lang.Object r7 = r0.m7763(r7, r1)
            if (r7 != r2) goto L70
        L6f:
            return r2
        L70:
            ۦٌٖٓؕ r7 = (p000.C4127) r7
        L72:
            java.lang.Object r6 = r6.f5056
            ۦؚٙؔؐ r6 = (p000.C4482) r6
            ۦۙؑۙؑ r6 = r6.f14796
            r6.m8698(r7)
            ۥۜؑؒؑ r6 = p000.C2358.f7817
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1489.m3157(ۥؚؒۥؔ):java.lang.Object");
    }

    @Override // p000.InterfaceC2707
    /* JADX INFO: renamed from: ۦٗ */
    public AbstractC1814 mo700(long j, AbstractC1814 abstractC1814, AbstractC1814 abstractC1815, AbstractC1814 abstractC1816) {
        AbstractC1814 abstractC1817;
        AbstractC1814 abstractC1814Mo2171 = (AbstractC1814) this.f5057;
        if (abstractC1814Mo2171 == null) {
            abstractC1814Mo2171 = abstractC1814.mo2171();
            this.f5057 = abstractC1814Mo2171;
        }
        int iMo2173 = abstractC1814Mo2171.mo2173();
        int i = 0;
        while (true) {
            abstractC1817 = (AbstractC1814) this.f5057;
            if (i >= iMo2173) {
                break;
            }
            if (abstractC1817 == null) {
                abstractC1817 = null;
            }
            long j2 = j;
            abstractC1817.mo2172(i, ((InterfaceC0260) this.f5059).get(i).mo1838(j2, abstractC1814.mo2174(i), abstractC1815.mo2174(i), abstractC1816.mo2174(i)));
            i++;
            j = j2;
        }
        if (abstractC1817 == null) {
            return null;
        }
        return abstractC1817;
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۦٚ */
    public void mo3158(C4839 c4839) {
        m3116(c4839);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۦٛ */
    public void mo3159(C1350 c1350) {
        m3116(c1350);
    }

    /* JADX INFO: renamed from: ۦٝ */
    public void m3160(C5479 c5479) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < 15; i2++) {
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(AbstractC3354.f11215.m6149(62)));
        }
        String string = sb.toString();
        C1330 c1330 = c5479.f18072;
        String str = c1330.f4598;
        int iM3096 = m3096(c1330);
        if (iM3096 < 0) {
            ArrayList arrayList = C2503.f8322;
            C2503.m4657(6, "YukiHookDataChannel cannot calculate the byte size of the data key of \"" + str + "\" to be sent, so this data cannot be sent\nIf you want to lift this restriction, use the allowSendTooLargeData function when calling, but this may cause the app crash", null);
            return;
        }
        if (c5479.f18075) {
            m3103(c5479);
            return;
        }
        int i3 = C2993.f10067;
        if (iM3096 < i3) {
            m3103(c5479);
            return;
        }
        Object obj = c1330.f4597;
        if (obj instanceof List) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList3.add(it.next());
                if (m3096(arrayList3) >= C2993.f10067 / C2993.f10064) {
                    arrayList2.add(arrayList3);
                    arrayList3 = new ArrayList();
                }
            }
            if (!arrayList3.isEmpty()) {
                arrayList2.add(arrayList3);
            }
            arrayList2.size();
            ArrayList arrayList4 = !arrayList2.isEmpty() ? arrayList2 : null;
            if (arrayList4 == null) {
                m3095(c5479, iM3096, "List");
                return;
            }
            for (Object obj2 : arrayList4) {
                int i4 = i + 1;
                if (i < 0) {
                    AbstractC2164.m4180();
                    throw null;
                }
                m3103(m3099(new C1330((List) obj2, str), string, arrayList2.size(), i));
                i = i4;
            }
            return;
        }
        if (obj instanceof Map) {
            ArrayList arrayList5 = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
                if (m3096(linkedHashMap) >= C2993.f10067 / C2993.f10064) {
                    arrayList5.add(linkedHashMap);
                    linkedHashMap = new LinkedHashMap();
                }
            }
            if (!linkedHashMap.isEmpty()) {
                arrayList5.add(linkedHashMap);
            }
            arrayList5.size();
            ArrayList arrayList6 = !arrayList5.isEmpty() ? arrayList5 : null;
            if (arrayList6 == null) {
                m3095(c5479, iM3096, "Map");
                return;
            }
            for (Object obj3 : arrayList6) {
                int i5 = i + 1;
                if (i < 0) {
                    AbstractC2164.m4180();
                    throw null;
                }
                m3103(m3099(new C1330((Map) obj3, str), string, arrayList5.size(), i));
                i = i5;
            }
            return;
        }
        if (obj instanceof Set) {
            ArrayList arrayList7 = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = ((Set) obj).iterator();
            while (it2.hasNext()) {
                linkedHashSet.add(it2.next());
                if (m3096(linkedHashSet) >= C2993.f10067 / C2993.f10064) {
                    arrayList7.add(linkedHashSet);
                    linkedHashSet = new LinkedHashSet();
                }
            }
            if (!linkedHashSet.isEmpty()) {
                arrayList7.add(linkedHashSet);
            }
            arrayList7.size();
            ArrayList arrayList8 = !arrayList7.isEmpty() ? arrayList7 : null;
            if (arrayList8 == null) {
                m3095(c5479, iM3096, "Set");
                return;
            }
            for (Object obj4 : arrayList8) {
                int i6 = i + 1;
                if (i < 0) {
                    AbstractC2164.m4180();
                    throw null;
                }
                m3103(m3099(new C1330((Set) obj4, str), string, arrayList7.size(), i));
                i = i6;
            }
            return;
        }
        if (!(obj instanceof String)) {
            if ((obj instanceof byte[]) || (obj instanceof char[]) || (obj instanceof short[]) || (obj instanceof int[]) || (obj instanceof long[]) || (obj instanceof float[]) || (obj instanceof double[]) || (obj instanceof boolean[]) || (obj instanceof Object[])) {
                m3098(c5479, iM3096, "Primitive Array type like String[], int[] ... cannot be segmented, the suggestion is send those data using List type");
                return;
            } else {
                m3098(c5479, iM3096, "");
                return;
            }
        }
        String str2 = (String) obj;
        int i7 = i3 / 2;
        ArrayList arrayList9 = new ArrayList();
        int length = str2.length();
        if (i7 <= 0) {
            C1078.m2272(AbstractC5078.m8681(i7, "Step must be positive, was: ", "."));
            return;
        }
        int iM8638 = C5063.m8638(0, length, i7);
        if (iM8638 >= 0) {
            int i8 = 0;
            while (true) {
                int i9 = i8 + i7;
                if (i9 <= str2.length()) {
                    arrayList9.add(str2.substring(i8, i9));
                } else {
                    arrayList9.add(str2.substring(i8, str2.length()));
                }
                if (i8 == iM8638) {
                    break;
                } else {
                    i8 = i9;
                }
            }
        }
        if (arrayList9.size() == 1) {
            m3103(c5479);
            return;
        }
        arrayList9.size();
        ArrayList arrayList10 = !arrayList9.isEmpty() ? arrayList9 : null;
        if (arrayList10 == null) {
            m3095(c5479, iM3096, "String");
            return;
        }
        for (Object obj5 : arrayList10) {
            int i10 = i + 1;
            if (i < 0) {
                AbstractC2164.m4180();
                throw null;
            }
            m3103(m3099(new C1330((String) obj5, str), string, arrayList9.size(), i));
            i = i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x006e A[Catch: all -> 0x009c, TRY_LEAVE, TryCatch #4 {, blocks: (B:22:0x0068, B:24:0x006e), top: B:53:0x0068 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x006e, please report this as an issue */
    /* JADX INFO: renamed from: ۦٟ */
    public void m3161() {
        int size;
        int i;
        RunnableC3850 runnableC3850;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = AbstractC4031.f13451;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f5057).iterator();
                while (it.hasNext()) {
                    RunnableC3850 runnableC3851 = (RunnableC3850) it.next();
                    if (((ArrayDeque) this.f5058).size() >= 64) {
                        break;
                    }
                    if (runnableC3851.f12869.get() < 5) {
                        it.remove();
                        runnableC3851.f12869.incrementAndGet();
                        arrayList.add(runnableC3851);
                        ((ArrayDeque) this.f5058).add(runnableC3851);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f5058).size();
                    ((ArrayDeque) this.f5056).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    runnableC3850 = (RunnableC3850) arrayList.get(i);
                    synchronized (this) {
                        threadPoolExecutor = (ThreadPoolExecutor) this.f5059;
                        if (threadPoolExecutor == null) {
                            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC1581(AbstractC4031.f13453 + " Dispatcher", false));
                            this.f5059 = threadPoolExecutor2;
                            threadPoolExecutor = threadPoolExecutor2;
                        }
                    }
                    C0201 c0201 = runnableC3850.f12868;
                    byte[] bArr2 = AbstractC4031.f13451;
                    try {
                        try {
                            threadPoolExecutor.execute(runnableC3850);
                        } catch (RejectedExecutionException e) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e);
                            c0201.m461(interruptedIOException);
                            runnableC3850.f12870.mo1169(c0201, interruptedIOException);
                            c0201.f746.f8550.m3133(runnableC3850);
                        }
                    } catch (Throwable th) {
                        c0201.f746.f8550.m3133(runnableC3850);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        size = arrayList.size();
        while (i < size) {
            runnableC3850 = (RunnableC3850) arrayList.get(i);
            synchronized (this) {
                threadPoolExecutor = (ThreadPoolExecutor) this.f5059;
                if (threadPoolExecutor == null) {
                    ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC1581(AbstractC4031.f13453 + " Dispatcher", false));
                    this.f5059 = threadPoolExecutor3;
                    threadPoolExecutor = threadPoolExecutor3;
                }
                C0201 c0202 = runnableC3850.f12868;
                byte[] bArr3 = AbstractC4031.f13451;
                threadPoolExecutor.execute(runnableC3850);
            }
        }
    }

    /* JADX INFO: renamed from: ۦۖ */
    public InterfaceC2150 m3162(C1489 c1489, C1854... c1854Arr) {
        InterfaceC2150 interfaceC2150M445 = InterfaceC2150.f7060;
        for (C1854 c1854 : c1854Arr) {
            interfaceC2150M445 = AbstractC0186.m445(c1854);
            AbstractC1605.m3333((C1489) this.f5058);
            if ((interfaceC2150M445 instanceof C4837) || (interfaceC2150M445 instanceof C2929)) {
                interfaceC2150M445 = ((C2346) this.f5059).m4397(c1489, interfaceC2150M445);
            }
        }
        return interfaceC2150M445;
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۦۗ */
    public void mo3163(C0829 c0829) {
        m3116(c0829);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۦۙ */
    public void mo3164(C5141 c5141) {
        m3116(c5141);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۦۚ */
    public void mo3165(C1011 c1011) {
        m3116(c1011);
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۦۛ */
    public void mo3166(C3475 c3475) {
        m3116(c3475);
    }

    /* JADX INFO: renamed from: ۦۜ */
    public void m3167(Iterable iterable) {
        if (iterable == null) {
            C0178.m387("extensions must not be null");
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC5443 interfaceC5443 = (InterfaceC5443) it.next();
            if (interfaceC5443 instanceof C5353) {
                switch (((C5353) interfaceC5443).f17620) {
                    case 0:
                        ((ArrayList) this.f5057).add(new C4539(0));
                        break;
                    case 1:
                        ((ArrayList) this.f5057).add(new C4539(1));
                        break;
                    default:
                        ((ArrayList) this.f5059).add(new C4165(6));
                        break;
                }
            }
        }
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۦ۟ */
    public void mo3168(C3811 c3811) {
        m3116(c3811);
    }

    /* JADX INFO: renamed from: ۦ۠ */
    public String m3169(int i) {
        String name;
        String strM3131 = m3131();
        if (C2993.f10065) {
            name = "X";
        } else {
            Context context = (Context) this.f5059;
            name = context != null ? context.getClass().getName() : "M";
        }
        return strM3131 + "_" + name + "_" + AbstractC3761.m6632(i);
    }

    /* JADX INFO: renamed from: ۦۣ */
    public AbstractComponentCallbacksC0308 m3170(String str) {
        C1239 c1239 = (C1239) ((HashMap) this.f5057).get(str);
        if (c1239 != null) {
            return c1239.f4258;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤ */
    public void m3171(int i, Object obj) {
        C2658 c2658 = (C2658) this.f5058;
        C2658.m4964(c2658, obj, i, c2658.f8818.length());
    }

    /* JADX INFO: renamed from: ۦۦ */
    public void m3172(String str, InterfaceC4745 interfaceC4745) {
        C2993 c2993 = (C2993) this.f5056;
        c2993.f10070.put(str.concat(m3169(1)), new C3869((Context) this.f5059, new C3659(c2993, this, str, interfaceC4745, 5)));
    }

    /* JADX INFO: renamed from: ۦۧ */
    public AbstractC1814 m3173(AbstractC1814 abstractC1814, AbstractC1814 abstractC1815) {
        AbstractC1814 abstractC1816;
        C1489 c1489 = this;
        AbstractC1814 abstractC1814Mo2171 = (AbstractC1814) c1489.f5056;
        if (abstractC1814Mo2171 == null) {
            abstractC1814Mo2171 = abstractC1814.mo2171();
            c1489.f5056 = abstractC1814Mo2171;
        }
        int iMo2173 = abstractC1814Mo2171.mo2173();
        int i = 0;
        while (true) {
            abstractC1816 = (AbstractC1814) c1489.f5056;
            if (i >= iMo2173) {
                break;
            }
            if (abstractC1816 == null) {
                abstractC1816 = null;
            }
            C3121 c3121 = (C3121) c1489.f5059;
            float fMo2174 = abstractC1814.mo2174(i);
            float fMo2175 = abstractC1815.mo2174(i);
            C4695 c4695 = (C4695) c3121.f10451;
            double dM8042 = c4695.m8042(fMo2175);
            double d = AbstractC0362.f1315;
            abstractC1816.mo2172(i, (Math.signum(fMo2175) * ((float) (Math.exp((d / (d - 1.0d)) * dM8042) * ((double) (c4695.f15484 * c4695.f15483))))) + fMo2174);
            i++;
            c1489 = this;
            iMo2173 = iMo2173;
        }
        if (abstractC1816 == null) {
            return null;
        }
        return abstractC1816;
    }

    @Override // p000.InterfaceC5709
    /* JADX INFO: renamed from: ۦۨ */
    public void mo3174(C3157 c3157) {
        m3116(c3157);
    }

    public /* synthetic */ C1489(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f5060 = i;
        this.f5059 = obj;
        this.f5057 = obj2;
        this.f5058 = obj3;
        this.f5056 = obj4;
    }

    public C1489(C1489 c1489, C2346 c2346) {
        this.f5060 = 25;
        this.f5058 = new HashMap();
        this.f5056 = new HashMap();
        this.f5059 = c1489;
        this.f5057 = c2346;
    }

    public C1489(C4474 c4474, String str) {
        this.f5060 = 26;
        this.f5056 = c4474;
        AbstractC0487.m1090(str);
        this.f5059 = str;
        this.f5057 = new Bundle();
    }

    public C1489(C4228 c4228, C2346 c2346) {
        this.f5060 = 15;
        this.f5059 = c4228;
        this.f5057 = c2346;
        this.f5058 = new Object();
        this.f5056 = new LinkedHashMap();
    }

    public C1489(InterfaceC4643 interfaceC4643, C2932 c2932, C0023 c0023) {
        this.f5060 = 13;
        this.f5059 = interfaceC4643;
        this.f5057 = c0023;
        this.f5058 = AbstractC1631.m3405(Integer.MAX_VALUE, 0, 6);
        this.f5056 = new C0352(0);
        InterfaceC3196 interfaceC3196 = (InterfaceC3196) interfaceC4643.mo1586().mo865(C1397.f4791);
        if (interfaceC3196 != null) {
            interfaceC3196.mo859(new C5544(10, c2932, this));
        }
    }

    public /* synthetic */ C1489(int i, Object obj) {
        this.f5060 = i;
        this.f5059 = obj;
    }

    public C1489(C3160 c3160, InterfaceC0217 interfaceC0217, AbstractC5760 abstractC5760) {
        this.f5060 = 19;
        this.f5059 = c3160;
        this.f5057 = interfaceC0217;
        this.f5058 = abstractC5760;
        this.f5056 = new C4992(29);
    }

    public C1489(C1489 c1489) {
        this.f5060 = 12;
        ArrayList arrayList = (ArrayList) c1489.f5059;
        LinkedHashSet linkedHashSet = (LinkedHashSet) c1489.f5056;
        LinkedHashSet linkedHashSet2 = C1753.f5827;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add(C1753.f5826.get((Class) it.next()));
        }
        this.f5059 = arrayList2;
        this.f5058 = new C3223(19);
        this.f5056 = (ArrayList) c1489.f5058;
        ArrayList arrayList3 = (ArrayList) c1489.f5057;
        this.f5057 = arrayList3;
        new C5049(new C3369(1, arrayList3, Collections.EMPTY_MAP));
    }

    public C1489(C1414 c1414) {
        this.f5060 = 0;
        this.f5059 = c1414;
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f5057 = setNewSetFromMap;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f5058 = concurrentHashMap;
        C4671 c4671 = f5055;
        C2354 c2354 = new C2354(c4671, "_root_", null, c1414, 8);
        this.f5056 = c2354;
        setNewSetFromMap.add(c4671);
        concurrentHashMap.put("_root_", c2354);
    }

    public C1489(ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850, C5488 c5488) {
        this.f5060 = 2;
        this.f5059 = viewTreeObserverOnGlobalLayoutListenerC0850;
        this.f5057 = c5488;
        AutofillManager autofillManager = (AutofillManager) viewTreeObserverOnGlobalLayoutListenerC0850.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.f5058 = autofillManager;
            viewTreeObserverOnGlobalLayoutListenerC0850.setImportantForAutofill(1);
            AutofillId autofillId = viewTreeObserverOnGlobalLayoutListenerC0850.getAutofillId();
            if (autofillId != null) {
                this.f5056 = autofillId;
                return;
            }
            throw AbstractC3761.m6633("Required value was null.");
        }
        C1078.m2276("Autofill service could not be located.");
        throw null;
    }

    public C1489(ExecutorService executorService) {
        this.f5060 = 22;
        this.f5058 = new Handler(Looper.getMainLooper());
        this.f5056 = new ExecutorC0170(2, this);
        ExecutorC2205 executorC2205 = new ExecutorC2205(executorService);
        this.f5059 = executorC2205;
        this.f5057 = AbstractC4489.m7819(executorC2205);
    }

    public C1489(C2711 c2711, C5008 c5008, C2658 c2658, Map map, C0373 c0373) {
        this.f5060 = 9;
        this.f5059 = c2711;
        this.f5057 = c5008;
        this.f5058 = c2658;
        this.f5056 = map;
    }

    public C1489(C5322 c5322) {
        this.f5060 = 10;
        this.f5059 = c5322;
        this.f5057 = new C5436();
        new LinkedHashSet();
        this.f5058 = new LinkedHashSet();
        this.f5056 = new LinkedHashSet();
    }

    public C1489(Context context, ActionMode.Callback callback) {
        this.f5060 = 14;
        this.f5057 = context;
        this.f5059 = callback;
        this.f5058 = new ArrayList();
        this.f5056 = new C0796(0);
    }

    public C1489(C2993 c2993, Context context, String str) {
        this.f5060 = 23;
        this.f5056 = c2993;
        this.f5059 = context;
        this.f5057 = str;
        this.f5058 = new ConcurrentHashMap();
    }

    public C1489(C4482 c4482, List list) {
        this.f5060 = 5;
        this.f5056 = c4482;
        this.f5059 = new C1387();
        this.f5057 = AbstractC4009.m7162();
        this.f5058 = AbstractC0973.m2039(list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1489(InterfaceC0862 interfaceC0862) {
        this(17, new C1039(18, interfaceC0862));
        this.f5060 = 17;
    }
}
