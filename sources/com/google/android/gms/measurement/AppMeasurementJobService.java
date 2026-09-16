package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import java.util.Objects;
import p000.AbstractC0487;
import p000.C1976;
import p000.C2391;
import p000.C3286;
import p000.C3610;
import p000.C4452;
import p000.C5034;
import p000.InterfaceC3258;
import p000.RunnableC0624;
import p000.RunnableC5413;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC3258 {

    /* JADX INFO: renamed from: ۦۨ */
    public C2391 f304;

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) m117().f7924).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) m117().f7924).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        m117();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        JobParameters jobParameters2;
        C2391 c2391M117 = m117();
        Service service = (Service) c2391M117.f7924;
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            AbstractC0487.m1047(string);
            C5034 c5034M8482 = C5034.m8482(service);
            C3610 c3610Mo2404 = c5034M8482.mo2404();
            C4452 c4452 = c5034M8482.f16665.f17714;
            c3610Mo2404.f12023.m9430(string, "Local AppMeasurementJobService called. action");
            jobParameters2 = jobParameters;
            c5034M8482.mo2406().m6515(new RunnableC5413(c2391M117, c5034M8482, new RunnableC0624(10, c2391M117, c3610Mo2404, jobParameters2, false)));
        } else {
            jobParameters2 = jobParameters;
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        AbstractC0487.m1047(string);
        C3286 c3286M6043 = C3286.m6043(service, null);
        RunnableC5413 runnableC5413 = new RunnableC5413(7, c2391M117, jobParameters2);
        c3286M6043.getClass();
        c3286M6043.m6045(new C1976(c3286M6043, runnableC5413, 2));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        m117();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    @Override // p000.InterfaceC3258
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo114(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // p000.InterfaceC3258
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo116(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final C2391 m117() {
        C2391 c2391 = this.f304;
        if (c2391 != null) {
            return c2391;
        }
        C2391 c2392 = new C2391(15, this);
        this.f304 = c2392;
        return c2392;
    }

    @Override // p000.InterfaceC3258
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo115(Intent intent) {
    }
}
