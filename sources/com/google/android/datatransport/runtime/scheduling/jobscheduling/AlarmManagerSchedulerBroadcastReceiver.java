package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import java.util.concurrent.Executor;
import p000.AbstractC3020;
import p000.C0474;
import p000.C1360;
import p000.C2808;
import p000.C4046;
import p000.RunnableC4026;
import p000.RunnableC5382;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۥۣ */
    public static final /* synthetic */ int f279 = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C4046.m7244(context);
        C2808 c2808M2865 = C1360.m2865();
        c2808M2865.m5335(queryParameter);
        c2808M2865.f9377 = AbstractC3020.m5613(iIntValue);
        if (queryParameter2 != null) {
            c2808M2865.f9378 = Base64.decode(queryParameter2, 0);
        }
        C0474 c0474 = C4046.m7245().f13491;
        ((Executor) c0474.f1723).execute(new RunnableC5382(i, 1, c0474, c2808M2865.m5345(), new RunnableC4026(0)));
    }
}
