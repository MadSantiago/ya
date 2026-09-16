package p000;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۥّؔؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0377 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C2780 f1405;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f1408;

    /* JADX INFO: renamed from: ۥۜ */
    public final InterfaceC2090 f1409;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f1410;

    /* JADX INFO: renamed from: ۦؑ */
    public final C3571 f1411;

    /* JADX INFO: renamed from: ۦۙ */
    public final C0916 f1414;

    /* JADX INFO: renamed from: ۦۗ */
    public static final Object f1404 = new Object();

    /* JADX INFO: renamed from: ۦؚ */
    public static final C4461 f1403 = new C4461(0);

    /* JADX INFO: renamed from: ۥُ */
    public final AtomicBoolean f1406 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ۥّ */
    public final AtomicBoolean f1407 = new AtomicBoolean();

    /* JADX INFO: renamed from: ۦٛ */
    public final CopyOnWriteArrayList f1413 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ۦِ */
    public final CopyOnWriteArrayList f1412 = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public C0377(Context context, String str, C2780 c2780) {
        ?? arrayList;
        int i = 0;
        this.f1410 = context;
        AbstractC0487.m1090(str);
        this.f1408 = str;
        this.f1405 = c2780;
        C2760 c2760 = FirebaseInitProvider.f357;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C0771(i, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        EnumC5451 enumC5451 = EnumC5451.f17968;
        ArrayList arrayList3 = new ArrayList();
        ArrayList<C5221> arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i2 = 1;
        arrayList3.add(new C0771(i2, new FirebaseCommonRegistrar()));
        arrayList3.add(new C0771(i2, new ExecutorsRegistrar()));
        arrayList4.add(C5221.m8846(context, Context.class, new Class[0]));
        arrayList4.add(C5221.m8846(this, C0377.class, new Class[0]));
        arrayList4.add(C5221.m8846(c2780, C2780.class, new Class[0]));
        C4992 c4992 = new C4992(i2);
        if (AbstractC2552.m4827(context) && FirebaseInitProvider.f356.get()) {
            arrayList4.add(C5221.m8846(c2760, C2760.class, new Class[0]));
        }
        C3571 c3571 = new C3571();
        c3571.f11831 = new HashMap();
        c3571.f11830 = new HashMap();
        c3571.f11826 = new HashMap();
        c3571.f11827 = new HashSet();
        c3571.f11828 = new AtomicReference();
        C4048 c4048 = new C4048();
        c3571.f11825 = c4048;
        c3571.f11829 = c4992;
        ArrayList<C5221> arrayList5 = new ArrayList();
        arrayList5.add(C5221.m8846(c4048, C4048.class, InterfaceC5067.class, InterfaceC0604.class));
        arrayList5.add(C5221.m8846(c3571, C3571.class, new Class[0]));
        for (C5221 c5221 : arrayList4) {
            if (c5221 != null) {
                arrayList5.add(c5221);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList6.add(it2.next());
        }
        ArrayList arrayList7 = new ArrayList();
        synchronized (c3571) {
            Iterator it3 = arrayList6.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC2090) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList5.addAll(((C4992) c3571.f11829).m8383(componentRegistrar));
                        it3.remove();
                    }
                } catch (C3887 e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                for (Object obj : ((C5221) it4.next()).f17239.toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (((HashSet) c3571.f11827).contains(obj.toString())) {
                            it4.remove();
                            break;
                        }
                        ((HashSet) c3571.f11827).add(obj.toString());
                    }
                }
            }
            if (((HashMap) c3571.f11831).isEmpty()) {
                AbstractC1631.m3438(arrayList5);
            } else {
                ArrayList arrayList8 = new ArrayList(((HashMap) c3571.f11831).keySet());
                arrayList8.addAll(arrayList5);
                AbstractC1631.m3438(arrayList8);
            }
            for (C5221 c5222 : arrayList5) {
                ((HashMap) c3571.f11831).put(c5222, new C0916(new C2200(i, c3571, c5222)));
            }
            arrayList7.addAll(c3571.m6369(arrayList5));
            arrayList7.addAll(c3571.m6370());
            c3571.m6373();
        }
        Iterator it5 = arrayList7.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) c3571.f11828).get();
        if (bool != null) {
            c3571.m6371((HashMap) c3571.f11831, bool.booleanValue());
        }
        this.f1411 = c3571;
        Trace.endSection();
        this.f1414 = new C0916(new C2200(2, this, context));
        this.f1409 = c3571.mo5372(C0161.class);
        C1428 c1428 = new C1428(this);
        m825();
        if (this.f1406.get()) {
            ComponentCallbacks2C5722.f18829.f18833.get();
        }
        this.f1413.add(c1428);
        Trace.endSection();
    }

    /* JADX INFO: renamed from: ۥُ */
    public static C0377 m821(Context context) {
        synchronized (f1404) {
            try {
                if (f1403.containsKey("[DEFAULT]")) {
                    return m823();
                }
                C2780 c2780M5257 = C2780.m5257(context);
                if (c2780M5257 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return m822(context, c2780M5257);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public static C0377 m822(Context context, C2780 c2780) {
        C0377 c0377;
        AtomicReference atomicReference = C0152.f586;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = C0152.f586;
            if (atomicReference2.get() == null) {
                C0152 c0152 = new C0152();
                do {
                    if (atomicReference2.compareAndSet(null, c0152)) {
                        ComponentCallbacks2C5722.m9534(application);
                        ComponentCallbacks2C5722 componentCallbacks2C5722 = ComponentCallbacks2C5722.f18829;
                        componentCallbacks2C5722.getClass();
                        synchronized (componentCallbacks2C5722) {
                            componentCallbacks2C5722.f18830.add(c0152);
                        }
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f1404) {
            C4461 c4461 = f1403;
            AbstractC0487.m1082("FirebaseApp name [DEFAULT] already exists!", !c4461.containsKey("[DEFAULT]"));
            AbstractC0487.m1048(context, "Application context cannot be null.");
            c0377 = new C0377(context, "[DEFAULT]", c2780);
            c4461.put("[DEFAULT]", c0377);
        }
        c0377.m826();
        return c0377;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static C0377 m823() {
        C0377 c0377;
        synchronized (f1404) {
            try {
                c0377 = (C0377) f1403.get("[DEFAULT]");
                if (c0377 == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C4773.m8130() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((C0161) c0377.f1409.get()).m343();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0377;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0377)) {
            return false;
        }
        C0377 c0377 = (C0377) obj;
        c0377.m825();
        return this.f1408.equals(c0377.f1408);
    }

    public final int hashCode() {
        return this.f1408.hashCode();
    }

    public final String toString() {
        C3369 c3369 = new C3369((Object) this);
        c3369.m6135(this.f1408, "name");
        c3369.m6135(this.f1405, "options");
        return c3369.toString();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final String m824() {
        StringBuilder sb = new StringBuilder();
        m825();
        byte[] bytes = this.f1408.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        m825();
        byte[] bytes2 = this.f1405.f9266.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m825() {
        AbstractC0487.m1082("FirebaseApp was deleted", !this.f1407.get());
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m826() {
        HashMap map;
        if (!AbstractC2552.m4827(this.f1410)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            m825();
            sb.append(this.f1408);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f1410;
            AtomicReference atomicReference = C1195.f4123;
            if (atomicReference.get() == null) {
                C1195 c1195 = new C1195(context);
                while (!atomicReference.compareAndSet(null, c1195)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(c1195, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        m825();
        sb2.append(this.f1408);
        Log.i("FirebaseApp", sb2.toString());
        C3571 c3571 = this.f1411;
        m825();
        boolean zEquals = "[DEFAULT]".equals(this.f1408);
        AtomicReference atomicReference2 = (AtomicReference) c3571.f11828;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference2.compareAndSet(null, boolValueOf)) {
            if (atomicReference2.get() != null) {
                ((C0161) this.f1409.get()).m343();
            }
        }
        synchronized (c3571) {
            map = new HashMap((HashMap) c3571.f11831);
        }
        c3571.m6371(map, zEquals);
        ((C0161) this.f1409.get()).m343();
    }
}
