package p000;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;

/* JADX INFO: renamed from: ۥۣٚؓ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1718 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final String f5721 = C1984.m3875("SystemJobScheduler");

    /* JADX INFO: renamed from: ۥۣ */
    public static final JobScheduler m3533(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        return Build.VERSION.SDK_INT >= 34 ? jobScheduler.forNamespace("androidx.work.systemjobscheduler") : jobScheduler;
    }
}
