package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import p000.AbstractC1982;
import p000.C3610;
import p000.C5371;
import p000.C5518;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends AbstractC1982 {

    /* JADX INFO: renamed from: ۥؗ */
    public C5518 f305;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f305 == null) {
            this.f305 = new C5518(this);
        }
        C3610 c3610 = C5371.m9019(context, null, null, null).f17717;
        C5371.m9020(c3610);
        if (intent == null) {
            c3610.f12022.m9432("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        c3610.f12023.m9430(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                c3610.f12022.m9432("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        c3610.f12023.m9432("Starting wakeful intent.");
        SparseArray sparseArray = AbstractC1982.f6547;
        synchronized (sparseArray) {
            try {
                int i = AbstractC1982.f6546;
                int i2 = i + 1;
                AbstractC1982.f6546 = i2;
                if (i2 <= 0) {
                    AbstractC1982.f6546 = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i, wakeLockNewWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
