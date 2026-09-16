package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import p000.AbstractC0487;
import p000.AbstractC5378;
import p000.C2588;
import p000.C3156;
import p000.C3286;
import p000.C3696;
import p000.C3735;
import p000.InterfaceC0550;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: ۥۗ */
    public static volatile FirebaseAnalytics f346;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3286 f347;

    public FirebaseAnalytics(C3286 c3286) {
        AbstractC0487.m1047(c3286);
        this.f347 = c3286;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (f346 == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f346 == null) {
                        f346 = new FirebaseAnalytics(C3286.m6043(context, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f346;
    }

    public static InterfaceC0550 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C3286 c3286M6043 = C3286.m6043(context, bundle);
        if (c3286M6043 == null) {
            return null;
        }
        return new C3735(c3286M6043);
    }

    public String getFirebaseInstanceId() {
        try {
            return (String) AbstractC5378.m9038(C2588.m4881().m4882(), 30000L);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        C3156 c3156M5837 = C3156.m5837(activity);
        C3286 c3286 = this.f347;
        c3286.getClass();
        c3286.m6045(new C3696(c3286, c3156M5837, str, str2));
    }
}
