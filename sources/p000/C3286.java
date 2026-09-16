package p000;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ۦؕؖؐۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3286 {

    /* JADX INFO: renamed from: ۥۜ */
    public static volatile C3286 f11007;

    /* JADX INFO: renamed from: ۥؗ */
    public final ArrayList f11008;

    /* JADX INFO: renamed from: ۥُ */
    public boolean f11009;

    /* JADX INFO: renamed from: ۥّ */
    public volatile InterfaceC5122 f11010;

    /* JADX INFO: renamed from: ۥۗ */
    public final AppMeasurementSdk f11011;

    /* JADX INFO: renamed from: ۥۣ */
    public final ExecutorService f11012;

    /* JADX INFO: renamed from: ۦؑ */
    public int f11013;

    /* JADX INFO: renamed from: ۦۙ */
    public volatile long f11014;

    public C3286(Context context, Bundle bundle) {
        ThreadFactoryC0311 threadFactoryC0311 = new ThreadFactoryC0311(this);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactoryC0311);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f11012 = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f11011 = new AppMeasurementSdk(this);
        this.f11008 = new ArrayList();
        int i = 0;
        try {
            if (AbstractC0949.m1934(context, AbstractC4009.m7185(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C3286.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f11009 = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        m6045(new C1770(this, context, bundle, i));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C3183(i, this));
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static C3286 m6043(Context context, Bundle bundle) {
        AbstractC0487.m1047(context);
        if (f11007 == null) {
            synchronized (C3286.class) {
                try {
                    if (f11007 == null) {
                        f11007 = new C3286(context, bundle == null ? new Bundle() : new Bundle(bundle));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11007;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m6044(Exception exc, boolean z, boolean z2) {
        this.f11009 |= z;
        if (z) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            m6045(new C1976(this, exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m6045(AbstractRunnableC2435 abstractRunnableC2435) {
        this.f11012.execute(abstractRunnableC2435);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final long m6046() {
        BinderC0902 binderC0902 = new BinderC0902();
        m6045(new C1285(this, binderC0902, 2));
        Long l = (Long) BinderC0902.m1886(binderC0902.m1887(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = this.f11013 + 1;
        this.f11013 = i;
        return jNextLong + ((long) i);
    }
}
