package com.google.android.gms.measurement.api;

import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import p000.BinderC0810;
import p000.BinderC0902;
import p000.C1204;
import p000.C1285;
import p000.C1976;
import p000.C2057;
import p000.C3286;
import p000.C4786;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementSdk {

    /* JADX INFO: renamed from: ۥۣ */
    public final C3286 f307;

    public AppMeasurementSdk(C3286 c3286) {
        this.f307 = c3286;
    }

    public static AppMeasurementSdk getInstance(Context context) {
        return C3286.m6043(context, null).f11011;
    }

    public void beginAdUnitExposure(String str) {
        C3286 c3286 = this.f307;
        c3286.m6045(new C1204(c3286, str, 0));
    }

    public void endAdUnitExposure(String str) {
        C3286 c3286 = this.f307;
        c3286.m6045(new C1204(c3286, str, 1));
    }

    public long generateEventId() {
        return this.f307.m6046();
    }

    public String getAppInstanceId() {
        BinderC0902 binderC0902 = new BinderC0902();
        C3286 c3286 = this.f307;
        c3286.m6045(new C1285(c3286, binderC0902, 1));
        return (String) BinderC0902.m1886(binderC0902.m1887(50L), String.class);
    }

    public String getGmpAppId() {
        BinderC0902 binderC0902 = new BinderC0902();
        C3286 c3286 = this.f307;
        c3286.m6045(new C1285(c3286, binderC0902, 0));
        return (String) BinderC0902.m1886(binderC0902.m1887(500L), String.class);
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        C3286 c3286 = this.f307;
        c3286.m6045(new C4786(c3286, str, str2, bundle, 1));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m119(C2057 c2057) {
        C3286 c3286 = this.f307;
        ArrayList arrayList = c3286.f11008;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    if (c2057.equals(((Pair) arrayList.get(i)).first)) {
                        Log.w("FA", "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            BinderC0810 binderC0810 = new BinderC0810(c2057);
            arrayList.add(new Pair(c2057, binderC0810));
            if (c3286.f11010 != null) {
                try {
                    c3286.f11010.registerOnMeasurementEventListener(binderC0810);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            c3286.m6045(new C1976(c3286, binderC0810, 4));
        }
    }
}
