package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p000.C1984;
import p000.C3600;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۥۣ */
    public static final String f266 = C1984.m3875("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C1984.m3874().m3878(f266, "Received intent " + intent);
        try {
            C3600 c3600M6413 = C3600.m6413(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (C3600.f11984) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = c3600M6413.f11994;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    c3600M6413.f11994 = pendingResultGoAsync;
                    if (c3600M6413.f11990) {
                        pendingResultGoAsync.finish();
                        c3600M6413.f11994 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            C1984.m3874().m3879(f266, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
