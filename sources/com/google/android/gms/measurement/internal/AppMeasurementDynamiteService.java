package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p000.AbstractBinderC4421;
import p000.AbstractC0487;
import p000.AbstractC4936;
import p000.BinderC1409;
import p000.C0515;
import p000.C0795;
import p000.C0932;
import p000.C1078;
import p000.C1302;
import p000.C1512;
import p000.C1968;
import p000.C2382;
import p000.C2679;
import p000.C3156;
import p000.C3183;
import p000.C3610;
import p000.C3644;
import p000.C4337;
import p000.C4452;
import p000.C4461;
import p000.C4898;
import p000.C4961;
import p000.C5235;
import p000.C5266;
import p000.C5371;
import p000.C5460;
import p000.C5571;
import p000.C5590;
import p000.C5645;
import p000.EnumC5547;
import p000.InterfaceC0257;
import p000.InterfaceC2353;
import p000.InterfaceC2410;
import p000.InterfaceC3838;
import p000.InterfaceC3941;
import p000.InterfaceC4264;
import p000.RunnableC0142;
import p000.RunnableC0836;
import p000.RunnableC1877;
import p000.RunnableC1948;
import p000.RunnableC3265;
import p000.RunnableC4108;
import p000.RunnableC4289;
import p000.RunnableC4911;
import p000.RunnableC4985;
import p000.RunnableC5413;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementDynamiteService extends AbstractBinderC4421 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final C4461 f308;

    /* JADX INFO: renamed from: ۦۨ */
    public C5371 f309;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.f309 = null;
        this.f308 = new C4461(0);
    }

    @Override // p000.InterfaceC5122
    public void beginAdUnitExposure(String str, long j) {
        m121();
        C4961 c4961 = this.f309.f17725;
        C5371.m9022(c4961);
        c4961.m8338(j, str);
    }

    @Override // p000.InterfaceC5122
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        c5235.m8867(str, str2, bundle);
    }

    @Override // p000.InterfaceC5122
    public void clearMeasurementEnabled(long j) {
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        c5235.m7643();
        C3644 c3644 = ((C5371) c5235.f18660).f17733;
        C5371.m9020(c3644);
        c3644.m6515(new RunnableC4985(27, c5235, null, false));
    }

    @Override // p000.InterfaceC5122
    public void endAdUnitExposure(String str, long j) {
        m121();
        C4961 c4961 = this.f309.f17725;
        C5371.m9022(c4961);
        c4961.m8337(j, str);
    }

    @Override // p000.InterfaceC5122
    public void generateEventId(InterfaceC3838 interfaceC3838) {
        m121();
        C1512 c1512 = this.f309.f17721;
        C5371.m9021(c1512);
        long jM3214 = c1512.m3214();
        m121();
        C1512 c1513 = this.f309.f17721;
        C5371.m9021(c1513);
        c1513.m3230(interfaceC3838, jM3214);
    }

    @Override // p000.InterfaceC5122
    public void getAppInstanceId(InterfaceC3838 interfaceC3838) {
        m121();
        C3644 c3644 = this.f309.f17733;
        C5371.m9020(c3644);
        c3644.m6515(new RunnableC4911(this, interfaceC3838, 0));
    }

    @Override // p000.InterfaceC5122
    public void getCachedAppInstanceId(InterfaceC3838 interfaceC3838) {
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        m120((String) c5235.f17284.get(), interfaceC3838);
    }

    @Override // p000.InterfaceC5122
    public void getConditionalUserProperties(String str, String str2, InterfaceC3838 interfaceC3838) {
        m121();
        C3644 c3644 = this.f309.f17733;
        C5371.m9020(c3644);
        c3644.m6515(new RunnableC1948(this, interfaceC3838, str, str2, 8));
    }

    @Override // p000.InterfaceC5122
    public void getCurrentScreenClass(InterfaceC3838 interfaceC3838) {
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        C5266 c5266 = ((C5371) c5235.f18660).f17711;
        C5371.m9023(c5266);
        C0932 c0932 = c5266.f17354;
        m120(c0932 != null ? c0932.f3319 : null, interfaceC3838);
    }

    @Override // p000.InterfaceC5122
    public void getCurrentScreenName(InterfaceC3838 interfaceC3838) {
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        C5266 c5266 = ((C5371) c5235.f18660).f17711;
        C5371.m9023(c5266);
        C0932 c0932 = c5266.f17354;
        m120(c0932 != null ? c0932.f3320 : null, interfaceC3838);
    }

    @Override // p000.InterfaceC5122
    public void getGmpAppId(InterfaceC3838 interfaceC3838) {
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        m120(c5235.m8872(), interfaceC3838);
    }

    @Override // p000.InterfaceC5122
    public void getMaxUserProperties(String str, InterfaceC3838 interfaceC3838) {
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        AbstractC0487.m1090(str);
        C0515 c0515 = ((C5371) c5235.f18660).f17715;
        m121();
        C1512 c1512 = this.f309.f17721;
        C5371.m9021(c1512);
        c1512.m3225(interfaceC3838, 25);
    }

    @Override // p000.InterfaceC5122
    public void getSessionId(InterfaceC3838 interfaceC3838) {
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        C3644 c3644 = ((C5371) c5235.f18660).f17733;
        C5371.m9020(c3644);
        c3644.m6515(new RunnableC4985(c5235, interfaceC3838));
    }

    @Override // p000.InterfaceC5122
    public void getTestFlag(InterfaceC3838 interfaceC3838, int i) {
        m121();
        if (i == 0) {
            C1512 c1512 = this.f309.f17721;
            C5371.m9021(c1512);
            C5235 c5235 = this.f309.f17709;
            C5371.m9023(c5235);
            AtomicReference atomicReference = new AtomicReference();
            C3644 c3644 = ((C5371) c5235.f18660).f17733;
            C5371.m9020(c3644);
            c1512.m3219((String) c3644.m6514(atomicReference, 15000L, "String test flag value", new RunnableC3265(c5235, atomicReference, 1)), interfaceC3838);
            return;
        }
        if (i == 1) {
            C1512 c1513 = this.f309.f17721;
            C5371.m9021(c1513);
            C5235 c5236 = this.f309.f17709;
            C5371.m9023(c5236);
            AtomicReference atomicReference2 = new AtomicReference();
            C3644 c3645 = ((C5371) c5236.f18660).f17733;
            C5371.m9020(c3645);
            c1513.m3230(interfaceC3838, ((Long) c3645.m6514(atomicReference2, 15000L, "long test flag value", new RunnableC3265(c5236, atomicReference2, 2))).longValue());
            return;
        }
        if (i == 2) {
            C1512 c1514 = this.f309.f17721;
            C5371.m9021(c1514);
            C5235 c5237 = this.f309.f17709;
            C5371.m9023(c5237);
            AtomicReference atomicReference3 = new AtomicReference();
            C3644 c3646 = ((C5371) c5237.f18660).f17733;
            C5371.m9020(c3646);
            double dDoubleValue = ((Double) c3646.m6514(atomicReference3, 15000L, "double test flag value", new RunnableC3265(c5237, atomicReference3, 4))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                interfaceC3838.mo1888(bundle);
                return;
            } catch (RemoteException e) {
                C3610 c3610 = ((C5371) c1514.f18660).f17717;
                C5371.m9020(c3610);
                c3610.f12022.m9430(e, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            C1512 c1515 = this.f309.f17721;
            C5371.m9021(c1515);
            C5235 c5238 = this.f309.f17709;
            C5371.m9023(c5238);
            AtomicReference atomicReference4 = new AtomicReference();
            C3644 c3647 = ((C5371) c5238.f18660).f17733;
            C5371.m9020(c3647);
            c1515.m3225(interfaceC3838, ((Integer) c3647.m6514(atomicReference4, 15000L, "int test flag value", new RunnableC3265(c5238, atomicReference4, 3))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        C1512 c1516 = this.f309.f17721;
        C5371.m9021(c1516);
        C5235 c5239 = this.f309.f17709;
        C5371.m9023(c5239);
        AtomicReference atomicReference5 = new AtomicReference();
        C3644 c3648 = ((C5371) c5239.f18660).f17733;
        C5371.m9020(c3648);
        c1516.m3237(interfaceC3838, ((Boolean) c3648.m6514(atomicReference5, 15000L, "boolean test flag value", new RunnableC3265(c5239, atomicReference5, 0))).booleanValue());
    }

    @Override // p000.InterfaceC5122
    public void getUserProperties(String str, String str2, boolean z, InterfaceC3838 interfaceC3838) {
        m121();
        C3644 c3644 = this.f309.f17733;
        C5371.m9020(c3644);
        c3644.m6515(new RunnableC0836(this, interfaceC3838, str, str2, z));
    }

    @Override // p000.InterfaceC5122
    public void initForTests(Map map) {
        m121();
    }

    @Override // p000.InterfaceC5122
    public void initialize(InterfaceC2410 interfaceC2410, C1302 c1302, long j) {
        C5371 c5371 = this.f309;
        if (c5371 == null) {
            Context context = (Context) BinderC1409.m2976(interfaceC2410);
            AbstractC0487.m1047(context);
            this.f309 = C5371.m9019(context, c1302, Long.valueOf(j), null);
        } else {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12022.m9432("Attempting to initialize multiple times");
        }
    }

    @Override // p000.InterfaceC5122
    public void initializeWithElapsedTime(InterfaceC2410 interfaceC2410, C1302 c1302, long j, long j2) {
        C5371 c5371 = this.f309;
        if (c5371 == null) {
            Context context = (Context) BinderC1409.m2976(interfaceC2410);
            AbstractC0487.m1047(context);
            this.f309 = C5371.m9019(context, c1302, Long.valueOf(j), Long.valueOf(j2));
        } else {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12022.m9432("Attempting to initialize multiple times");
        }
    }

    @Override // p000.InterfaceC5122
    public void isDataCollectionEnabled(InterfaceC3838 interfaceC3838) {
        m121();
        C3644 c3644 = this.f309.f17733;
        C5371.m9020(c3644);
        c3644.m6515(new RunnableC4911(this, interfaceC3838, 1));
    }

    @Override // p000.InterfaceC5122
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        c5235.m8883(str, str2, bundle, z, z2, j, 0L);
    }

    @Override // p000.InterfaceC5122
    public void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC3838 interfaceC3838, long j) {
        m121();
        AbstractC0487.m1090(str2);
        String str3 = true != this.f309.f17715.m1162(null, AbstractC4936.f19563) ? "app" : "auto";
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", str3);
        C2679 c2679 = new C2679(str2, new C5645(bundle), str3, j, 0L);
        C3644 c3644 = this.f309.f17733;
        C5371.m9020(c3644);
        c3644.m6515(new RunnableC1948(this, interfaceC3838, c2679, str, 3));
    }

    @Override // p000.InterfaceC5122
    public void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        c5235.m8883(str, str2, bundle, z, z2, j, j2);
    }

    @Override // p000.InterfaceC5122
    public void logHealthData(int i, String str, InterfaceC2410 interfaceC2410, InterfaceC2410 interfaceC2411, InterfaceC2410 interfaceC2412) {
        m121();
        Object objM2976 = interfaceC2410 == null ? null : BinderC1409.m2976(interfaceC2410);
        Object objM2977 = interfaceC2411 == null ? null : BinderC1409.m2976(interfaceC2411);
        Object objM2978 = interfaceC2412 != null ? BinderC1409.m2976(interfaceC2412) : null;
        C3610 c3610 = this.f309.f17717;
        C5371.m9020(c3610);
        c3610.m6442(i, true, false, str, objM2976, objM2977, objM2978);
    }

    @Override // p000.InterfaceC5122
    public void onActivityCreated(InterfaceC2410 interfaceC2410, Bundle bundle, long j) {
        m121();
        Activity activity = (Activity) BinderC1409.m2976(interfaceC2410);
        AbstractC0487.m1047(activity);
        onActivityCreatedByScionActivityInfo(C3156.m5837(activity), bundle, j);
    }

    @Override // p000.InterfaceC5122
    public void onActivityCreatedByScionActivityInfo(C3156 c3156, Bundle bundle, long j) {
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        C3183 c3183 = c5235.f17271;
        if (c3183 != null) {
            C5235 c5236 = this.f309.f17709;
            C5371.m9023(c5236);
            c5236.m8876();
            c3183.m5856(c3156, bundle);
        }
    }

    @Override // p000.InterfaceC5122
    public void onActivityDestroyed(InterfaceC2410 interfaceC2410, long j) {
        m121();
        Activity activity = (Activity) BinderC1409.m2976(interfaceC2410);
        AbstractC0487.m1047(activity);
        onActivityDestroyedByScionActivityInfo(C3156.m5837(activity), j);
    }

    @Override // p000.InterfaceC5122
    public void onActivityDestroyedByScionActivityInfo(C3156 c3156, long j) {
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        C3183 c3183 = c5235.f17271;
        if (c3183 != null) {
            C5235 c5236 = this.f309.f17709;
            C5371.m9023(c5236);
            c5236.m8876();
            c3183.m5859(c3156);
        }
    }

    @Override // p000.InterfaceC5122
    public void onActivityPaused(InterfaceC2410 interfaceC2410, long j) {
        m121();
        Activity activity = (Activity) BinderC1409.m2976(interfaceC2410);
        AbstractC0487.m1047(activity);
        onActivityPausedByScionActivityInfo(C3156.m5837(activity), j);
    }

    @Override // p000.InterfaceC5122
    public void onActivityPausedByScionActivityInfo(C3156 c3156, long j) {
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        C3183 c3183 = c5235.f17271;
        if (c3183 != null) {
            C5235 c5236 = this.f309.f17709;
            C5371.m9023(c5236);
            c5236.m8876();
            c3183.m5857(c3156);
        }
    }

    @Override // p000.InterfaceC5122
    public void onActivityResumed(InterfaceC2410 interfaceC2410, long j) {
        m121();
        Activity activity = (Activity) BinderC1409.m2976(interfaceC2410);
        AbstractC0487.m1047(activity);
        onActivityResumedByScionActivityInfo(C3156.m5837(activity), j);
    }

    @Override // p000.InterfaceC5122
    public void onActivityResumedByScionActivityInfo(C3156 c3156, long j) {
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        C3183 c3183 = c5235.f17271;
        if (c3183 != null) {
            C5235 c5236 = this.f309.f17709;
            C5371.m9023(c5236);
            c5236.m8876();
            c3183.m5858(c3156);
        }
    }

    @Override // p000.InterfaceC5122
    public void onActivitySaveInstanceState(InterfaceC2410 interfaceC2410, InterfaceC3838 interfaceC3838, long j) {
        m121();
        Activity activity = (Activity) BinderC1409.m2976(interfaceC2410);
        AbstractC0487.m1047(activity);
        onActivitySaveInstanceStateByScionActivityInfo(C3156.m5837(activity), interfaceC3838, j);
    }

    @Override // p000.InterfaceC5122
    public void onActivitySaveInstanceStateByScionActivityInfo(C3156 c3156, InterfaceC3838 interfaceC3838, long j) {
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        C3183 c3183 = c5235.f17271;
        Bundle bundle = new Bundle();
        if (c3183 != null) {
            C5235 c5236 = this.f309.f17709;
            C5371.m9023(c5236);
            c5236.m8876();
            c3183.m5860(c3156, bundle);
        }
        try {
            interfaceC3838.mo1888(bundle);
        } catch (RemoteException e) {
            C3610 c3610 = this.f309.f17717;
            C5371.m9020(c3610);
            c3610.f12022.m9430(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // p000.InterfaceC5122
    public void onActivityStarted(InterfaceC2410 interfaceC2410, long j) {
        m121();
        Activity activity = (Activity) BinderC1409.m2976(interfaceC2410);
        AbstractC0487.m1047(activity);
        onActivityStartedByScionActivityInfo(C3156.m5837(activity), j);
    }

    @Override // p000.InterfaceC5122
    public void onActivityStartedByScionActivityInfo(C3156 c3156, long j) {
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        if (c5235.f17271 != null) {
            C5235 c5236 = this.f309.f17709;
            C5371.m9023(c5236);
            c5236.m8876();
        }
    }

    @Override // p000.InterfaceC5122
    public void onActivityStopped(InterfaceC2410 interfaceC2410, long j) {
        m121();
        Activity activity = (Activity) BinderC1409.m2976(interfaceC2410);
        AbstractC0487.m1047(activity);
        onActivityStoppedByScionActivityInfo(C3156.m5837(activity), j);
    }

    @Override // p000.InterfaceC5122
    public void onActivityStoppedByScionActivityInfo(C3156 c3156, long j) {
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        if (c5235.f17271 != null) {
            C5235 c5236 = this.f309.f17709;
            C5371.m9023(c5236);
            c5236.m8876();
        }
    }

    @Override // p000.InterfaceC5122
    public void performAction(Bundle bundle, InterfaceC3838 interfaceC3838, long j) {
        m121();
        interfaceC3838.mo1888(null);
    }

    @Override // p000.InterfaceC5122
    public void registerOnMeasurementEventListener(InterfaceC0257 interfaceC0257) {
        Object c4337;
        m121();
        C4461 c4461 = this.f308;
        synchronized (c4461) {
            try {
                c4337 = (InterfaceC4264) c4461.get(Integer.valueOf(interfaceC0257.mo537()));
                if (c4337 == null) {
                    c4337 = new C4337(this, interfaceC0257);
                    c4461.put(Integer.valueOf(interfaceC0257.mo537()), c4337);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        c5235.m7643();
        if (c5235.f17270.add(c4337)) {
            return;
        }
        C3610 c3610 = ((C5371) c5235.f18660).f17717;
        C5371.m9020(c3610);
        c3610.f12022.m9432("OnEventListener already registered");
    }

    @Override // p000.InterfaceC5122
    @Deprecated
    public void resetAnalyticsData(long j) {
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        c5235.f17284.set(null);
        C3644 c3644 = ((C5371) c5235.f18660).f17733;
        C5371.m9020(c3644);
        c3644.m6515(new RunnableC0142(c5235, j, 1));
    }

    @Override // p000.InterfaceC5122
    public void resetAnalyticsDataWithElapsedTime(long j, long j2) {
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        c5235.f17284.set(null);
        C3644 c3644 = ((C5371) c5235.f18660).f17733;
        C5371.m9020(c3644);
        c3644.m6515(new RunnableC0142(c5235, j, 1));
    }

    @Override // p000.InterfaceC5122
    public void retrieveAndUploadBatches(InterfaceC3941 interfaceC3941) {
        EnumC5547 enumC5547;
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        c5235.m7643();
        C5371 c5371 = (C5371) c5235.f18660;
        C3644 c3644 = c5371.f17733;
        C5371.m9020(c3644);
        if (c3644.m6519()) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12020.m9432("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        C3644 c3645 = c5371.f17733;
        C5371.m9020(c3645);
        if (Thread.currentThread() == c3645.f12199) {
            C3610 c3611 = c5371.f17717;
            C5371.m9020(c3611);
            c3611.f12020.m9432("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        boolean zM7739 = C4452.m7739();
        C3610 c3612 = c5371.f17717;
        if (zM7739) {
            C5371.m9020(c3612);
            c3612.f12020.m9432("Cannot retrieve and upload batches from main thread");
            return;
        }
        C5371.m9020(c3612);
        c3612.f12023.m9432("[sgtm] Started client-side batch upload work.");
        boolean z = false;
        boolean z2 = false;
        int size = 0;
        int i = 0;
        while (!z2) {
            C3610 c3613 = c5371.f17717;
            C5371.m9020(c3613);
            c3613.f12023.m9432("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            C3644 c3646 = c5371.f17733;
            C5371.m9020(c3646);
            c3646.m6514(atomicReference, 10000L, "[sgtm] Getting upload batches", new RunnableC3265(c5235, atomicReference, 6, z));
            C0795 c0795 = (C0795) atomicReference.get();
            if (c0795 == null) {
                break;
            }
            List list = c0795.f2861;
            if (list.isEmpty()) {
                break;
            }
            C3610 c3614 = c5371.f17717;
            C5371.m9020(c3614);
            c3614.f12023.m9430(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            size += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                C5571 c5571 = (C5571) it.next();
                try {
                    URL url = new URI(c5571.f18398).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    C1968 c1968M9029 = ((C5371) c5235.f18660).m9029();
                    c1968M9029.m7643();
                    AbstractC0487.m1047(c1968M9029.f6516);
                    String str = c1968M9029.f6516;
                    C5371 c5372 = (C5371) c5235.f18660;
                    C3610 c3615 = c5372.f17717;
                    C5371.m9020(c3615);
                    C5590 c5590 = c3615.f12023;
                    Long lValueOf = Long.valueOf(c5571.f18403);
                    c5590.m9431("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, c5571.f18398, Integer.valueOf(c5571.f18402.length));
                    if (!TextUtils.isEmpty(c5571.f18401)) {
                        C3610 c3616 = c5372.f17717;
                        C5371.m9020(c3616);
                        c3616.f12023.m9434(lValueOf, c5571.f18401, "[sgtm] Uploading data from app. row_id");
                    }
                    HashMap map = new HashMap();
                    Bundle bundle = c5571.f18399;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str2, string);
                        }
                    }
                    C2382 c2382 = c5372.f17712;
                    C5371.m9020(c2382);
                    byte[] bArr = c5571.f18402;
                    C5460 c5460 = new C5460(c5235, atomicReference2, c5571, 14);
                    c2382.m503();
                    AbstractC0487.m1047(url);
                    AbstractC0487.m1047(bArr);
                    C3644 c3647 = ((C5371) c2382.f18660).f17733;
                    C5371.m9020(c3647);
                    c3647.m6516(new RunnableC1877(c2382, str, url, bArr, map, c5460));
                    try {
                        C1512 c1512 = c5372.f17721;
                        C5371.m9021(c1512);
                        C5371 c5373 = (C5371) c1512.f18660;
                        c5373.f17719.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long jCurrentTimeMillis2 = 60000; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(jCurrentTimeMillis2);
                                    c5373.f17719.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        C3610 c3617 = ((C5371) c5235.f18660).f17717;
                        C5371.m9020(c3617);
                        c3617.f12022.m9432("[sgtm] Interrupted waiting for uploading batch");
                    }
                    enumC5547 = atomicReference2.get() == null ? EnumC5547.f18322 : (EnumC5547) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e) {
                    C3610 c3618 = ((C5371) c5235.f18660).f17717;
                    C5371.m9020(c3618);
                    c3618.f12020.m9431("[sgtm] Bad upload url for row_id", c5571.f18398, Long.valueOf(c5571.f18403), e);
                    enumC5547 = EnumC5547.f18320;
                }
                if (enumC5547 != EnumC5547.f18319) {
                    if (enumC5547 == EnumC5547.f18318) {
                        z2 = true;
                        break;
                    }
                } else {
                    i++;
                }
            }
            z = false;
        }
        C3610 c3619 = c5371.f17717;
        C5371.m9020(c3619);
        c3619.f12023.m9434(Integer.valueOf(size), Integer.valueOf(i), "[sgtm] Completed client-side batch upload work. total, success");
        try {
            interfaceC3941.mo5838();
        } catch (RemoteException e2) {
            C5371 c5374 = this.f309;
            AbstractC0487.m1047(c5374);
            C3610 c36110 = c5374.f17717;
            C5371.m9020(c36110);
            c36110.f12022.m9430(e2, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // p000.InterfaceC5122
    public void setConditionalUserProperty(Bundle bundle, long j) {
        m121();
        C5371 c5371 = this.f309;
        if (bundle == null) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12020.m9432("Conditional user property must not be null");
        } else {
            C5235 c5235 = c5371.f17709;
            C5371.m9023(c5235);
            c5235.m8882(bundle, j);
        }
    }

    @Override // p000.InterfaceC5122
    public void setConsentThirdParty(Bundle bundle, long j) {
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        c5235.m8878(bundle, -20, j);
    }

    @Override // p000.InterfaceC5122
    public void setCurrentScreen(InterfaceC2410 interfaceC2410, String str, String str2, long j) {
        m121();
        Activity activity = (Activity) BinderC1409.m2976(interfaceC2410);
        AbstractC0487.m1047(activity);
        setCurrentScreenByScionActivityInfo(C3156.m5837(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if (r2 > 500) goto L27;
     */
    @Override // p000.InterfaceC5122
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setCurrentScreenByScionActivityInfo(p000.C3156 r5, java.lang.String r6, java.lang.String r7, long r8) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(ۦؓؒؓٔ, java.lang.String, java.lang.String, long):void");
    }

    @Override // p000.InterfaceC5122
    public void setDataCollectionEnabled(boolean z) {
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        c5235.m7643();
        C3644 c3644 = ((C5371) c5235.f18660).f17733;
        C5371.m9020(c3644);
        c3644.m6515(new RunnableC4289(c5235, z));
    }

    @Override // p000.InterfaceC5122
    public void setDefaultEventParameters(Bundle bundle) {
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        C3644 c3644 = ((C5371) c5235.f18660).f17733;
        C5371.m9020(c3644);
        c3644.m6515(new RunnableC4108(c5235, bundle2, 2));
    }

    @Override // p000.InterfaceC5122
    public void setEventInterceptor(InterfaceC0257 interfaceC0257) {
        m121();
        C4898 c4898 = new C4898();
        c4898.f16142 = this;
        c4898.f16143 = interfaceC0257;
        C3644 c3644 = this.f309.f17733;
        C5371.m9020(c3644);
        boolean zM6519 = c3644.m6519();
        C5371 c5371 = this.f309;
        boolean z = false;
        if (!zM6519) {
            C3644 c3645 = c5371.f17733;
            C5371.m9020(c3645);
            c3645.m6515(new RunnableC4985(29, this, c4898, z));
            return;
        }
        C5235 c5235 = c5371.f17709;
        C5371.m9023(c5235);
        c5235.mo6517();
        c5235.m7643();
        C4898 c4899 = c5235.f17272;
        if (c4898 != c4899) {
            AbstractC0487.m1082("EventInterceptor already set.", c4899 == null);
        }
        c5235.f17272 = c4898;
    }

    @Override // p000.InterfaceC5122
    public void setInstanceIdProvider(InterfaceC2353 interfaceC2353) {
        m121();
    }

    @Override // p000.InterfaceC5122
    public void setMeasurementEnabled(boolean z, long j) {
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        Boolean boolValueOf = Boolean.valueOf(z);
        c5235.m7643();
        C3644 c3644 = ((C5371) c5235.f18660).f17733;
        C5371.m9020(c3644);
        c3644.m6515(new RunnableC4985(27, c5235, boolValueOf, false));
    }

    @Override // p000.InterfaceC5122
    public void setMinimumSessionDuration(long j) {
        m121();
    }

    @Override // p000.InterfaceC5122
    public void setSessionTimeoutDuration(long j) {
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        C3644 c3644 = ((C5371) c5235.f18660).f17733;
        C5371.m9020(c3644);
        c3644.m6515(new RunnableC0142(c5235, j, 0));
    }

    @Override // p000.InterfaceC5122
    public void setSgtmDebugInfo(Intent intent) {
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        C5371 c5371 = (C5371) c5235.f18660;
        Uri data = intent.getData();
        if (data == null) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12016.m9432("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            C3610 c3611 = c5371.f17717;
            C5371.m9020(c3611);
            c3611.f12016.m9432("[sgtm] Preview Mode was not enabled.");
            c5371.f17715.f1840 = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        C3610 c3612 = c5371.f17717;
        C5371.m9020(c3612);
        c3612.f12016.m9430(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        c5371.f17715.f1840 = queryParameter2;
    }

    @Override // p000.InterfaceC5122
    public void setUserId(String str, long j) {
        m121();
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        C5371 c5371 = (C5371) c5235.f18660;
        if (str != null && TextUtils.isEmpty(str)) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12022.m9432("User ID must be non-empty or null");
        } else {
            C3644 c3644 = c5371.f17733;
            C5371.m9020(c3644);
            c3644.m6515(new RunnableC5413(1, c5235, str));
            c5235.m8863(null, "_id", str, true, j);
        }
    }

    @Override // p000.InterfaceC5122
    public void setUserProperty(String str, String str2, InterfaceC2410 interfaceC2410, boolean z, long j) {
        m121();
        Object objM2976 = BinderC1409.m2976(interfaceC2410);
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        c5235.m8863(str, str2, objM2976, z, j);
    }

    @Override // p000.InterfaceC5122
    public void unregisterOnMeasurementEventListener(InterfaceC0257 interfaceC0257) {
        Object c4337;
        m121();
        C4461 c4461 = this.f308;
        synchronized (c4461) {
            c4337 = (InterfaceC4264) c4461.remove(Integer.valueOf(interfaceC0257.mo537()));
        }
        if (c4337 == null) {
            c4337 = new C4337(this, interfaceC0257);
        }
        C5235 c5235 = this.f309.f17709;
        C5371.m9023(c5235);
        c5235.m7643();
        if (c5235.f17270.remove(c4337)) {
            return;
        }
        C3610 c3610 = ((C5371) c5235.f18660).f17717;
        C5371.m9020(c3610);
        c3610.f12022.m9432("OnEventListener had not been registered");
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m120(String str, InterfaceC3838 interfaceC3838) {
        m121();
        C1512 c1512 = this.f309.f17721;
        C5371.m9021(c1512);
        c1512.m3219(str, interfaceC3838);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m121() {
        if (this.f309 != null) {
            return;
        }
        C1078.m2276("Attempting to perform action before initialize.");
    }

    @Override // p000.InterfaceC5122
    public void setConsent(Bundle bundle, long j) {
    }
}
