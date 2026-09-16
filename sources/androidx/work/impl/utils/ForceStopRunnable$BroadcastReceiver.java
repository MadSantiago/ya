package androidx.work.impl.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import p000.C1984;
import p000.RunnableC2363;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۥۣ */
    public static final String f278 = C1984.m3875("ForceStopRunnable$Rcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            return;
        }
        if (C1984.m3874().f6551 <= 2) {
            Log.v(f278, "Rescheduling alarm that keeps track of force-stops.");
        }
        RunnableC2363.m4431(context);
    }
}
