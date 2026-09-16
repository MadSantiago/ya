package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import java.util.Arrays;
import java.util.HashMap;
import p000.AbstractC0797;
import p000.AbstractC2611;
import p000.AbstractC3761;
import p000.C1078;
import p000.C1489;
import p000.C1860;
import p000.C1984;
import p000.C2346;
import p000.C2666;
import p000.C3066;
import p000.C3600;
import p000.C3654;
import p000.C4452;
import p000.ExecutorC2205;
import p000.InterfaceC0978;
import p000.RunnableC3599;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC0978 {

    /* JADX INFO: renamed from: ۥَ */
    public static final String f267 = C1984.m3875("SystemJobService");

    /* JADX INFO: renamed from: ۥٓ */
    public C2346 f269;

    /* JADX INFO: renamed from: ۦۨ */
    public C3600 f271;

    /* JADX INFO: renamed from: ۦ۟ */
    public final HashMap f270 = new HashMap();

    /* JADX INFO: renamed from: ۥْ */
    public final C3066 f268 = new C3066(2);

    /* JADX INFO: renamed from: ۥۗ */
    public static C1860 m106(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C1860(extras.getInt("EXTRA_WORK_SPEC_GENERATION"), extras.getString("EXTRA_WORK_SPEC_ID"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m107(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        C1078.m2276(AbstractC3761.m6629("Cannot invoke ", str, " on a background thread"));
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            C3600 c3600M6413 = C3600.m6413(getApplicationContext());
            this.f271 = c3600M6413;
            C3654 c3654 = c3600M6413.f11988;
            this.f269 = new C2346(18, c3654, c3600M6413.f11992);
            c3654.m6533(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            C1984.m3874().m3885(f267, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C3600 c3600 = this.f271;
        if (c3600 != null) {
            C3654 c3654 = c3600.f11988;
            synchronized (c3654.f12236) {
                c3654.f12234.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        m107("onStartJob");
        C3600 c3600 = this.f271;
        String str = f267;
        if (c3600 == null) {
            C1984.m3874().m3878(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        C1860 c1860M106 = m106(jobParameters);
        if (c1860M106 == null) {
            C1984.m3874().m3884(str, "WorkSpec id not found!");
            return false;
        }
        HashMap map = this.f270;
        if (map.containsKey(c1860M106)) {
            C1984.m3874().m3878(str, "Job is already being executed by SystemJobService: " + c1860M106);
            return false;
        }
        C1984.m3874().m3878(str, "onStartJob for " + c1860M106);
        map.put(c1860M106, jobParameters);
        int i = 5;
        C4452 c4452 = new C4452(5);
        if (jobParameters.getTriggeredContentUris() != null) {
            Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC2611.m4938(jobParameters);
        }
        C2346 c2346 = this.f269;
        C2666 c2666M5665 = this.f268.m5665(c1860M106);
        ((ExecutorC2205) ((C1489) c2346.f7785).f5059).execute(new RunnableC3599(c2346, c2666M5665, c4452, i));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        m107("onStopJob");
        if (this.f271 == null) {
            C1984.m3874().m3878(f267, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        C1860 c1860M106 = m106(jobParameters);
        if (c1860M106 == null) {
            C1984.m3874().m3884(f267, "WorkSpec id not found!");
            return false;
        }
        C1984.m3874().m3878(f267, "onStopJob for " + c1860M106);
        this.f270.remove(c1860M106);
        C2666 c2666M5663 = this.f268.m5663(c1860M106);
        if (c2666M5663 != null) {
            this.f269.m4412(c2666M5663, Build.VERSION.SDK_INT >= 31 ? AbstractC0797.m1702(jobParameters) : -512);
        }
        C3654 c3654 = this.f271.f11988;
        String str = c1860M106.f6202;
        synchronized (c3654.f12236) {
            zContains = c3654.f12235.contains(str);
        }
        return !zContains;
    }

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo108(C1860 c1860, boolean z) {
        m107("onExecuted");
        C1984.m3874().m3878(f267, c1860.f6202 + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.f270.remove(c1860);
        this.f268.m5663(c1860);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }
}
