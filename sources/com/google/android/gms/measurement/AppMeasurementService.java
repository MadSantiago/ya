package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import p000.AbstractC1982;
import p000.BinderC5179;
import p000.C2391;
import p000.C3610;
import p000.C5034;
import p000.C5371;
import p000.InterfaceC3258;
import p000.RunnableC0682;
import p000.RunnableC5413;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends Service implements InterfaceC3258 {

    /* JADX INFO: renamed from: ۦۨ */
    public C2391 f306;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        C2391 c2391M118 = m118();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC5179(C5034.m8482((Service) c2391M118.f7924));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) m118().f7924).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) m118().f7924).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        m118();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C2391 c2391M118 = m118();
        if (intent == null) {
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) c2391M118.f7924;
        C3610 c3610 = C5371.m9019(service, null, null, null).f17717;
        C5371.m9020(c3610);
        String action = intent.getAction();
        c3610.f12023.m9434(Integer.valueOf(i2), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        RunnableC0682 runnableC0682 = new RunnableC0682(c2391M118, i2, c3610, intent);
        C5034 c5034M8482 = C5034.m8482(service);
        c5034M8482.mo2406().m6515(new RunnableC5413(c2391M118, c5034M8482, runnableC0682));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        m118();
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
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC3258
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo115(Intent intent) {
        SparseArray sparseArray = AbstractC1982.f6547;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = AbstractC1982.f6547;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC3258
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo116(int i) {
        return stopSelfResult(i);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final C2391 m118() {
        C2391 c2391 = this.f306;
        if (c2391 != null) {
            return c2391;
        }
        C2391 c2392 = new C2391(15, this);
        this.f306 = c2392;
        return c2392;
    }
}
