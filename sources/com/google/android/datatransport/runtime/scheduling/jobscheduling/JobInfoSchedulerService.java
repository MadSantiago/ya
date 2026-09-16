package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import java.util.concurrent.Executor;
import p000.AbstractC3020;
import p000.C0474;
import p000.C1360;
import p000.C2808;
import p000.C4046;
import p000.RunnableC5382;
import p000.RunnableC5689;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: ۦۨ */
    public static final /* synthetic */ int f280 = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C4046.m7244(getApplicationContext());
        C2808 c2808M2865 = C1360.m2865();
        c2808M2865.m5335(string);
        c2808M2865.f9377 = AbstractC3020.m5613(i);
        if (string2 != null) {
            c2808M2865.f9378 = Base64.decode(string2, 0);
        }
        C0474 c0474 = C4046.m7245().f13491;
        ((Executor) c0474.f1723).execute(new RunnableC5382(i2, 1, c0474, c2808M2865.m5345(), new RunnableC5689(13, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
