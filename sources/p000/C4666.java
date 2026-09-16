package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;

/* JADX INFO: renamed from: ۦُٜؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4666 extends AbstractC4351 {

    /* JADX INFO: renamed from: ۥْ */
    public JobScheduler f15370;

    @Override // p000.AbstractC4351
    /* JADX INFO: renamed from: ۥٖ */
    public final boolean mo3853() {
        return true;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final void m8029(long j) {
        C5371 c5371 = (C5371) this.f18660;
        m7643();
        mo6517();
        JobScheduler jobScheduler = this.f15370;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(c5371.f17739.getPackageName())).hashCode()) != null) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12023.m9432("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int iM8030 = m8030();
        if (iM8030 != 2) {
            C3610 c3611 = c5371.f17717;
            C5371.m9020(c3611);
            c3611.f12023.m9430(AbstractC2049.m4002(iM8030), "[sgtm] Not eligible for Scion upload");
            return;
        }
        C3610 c3612 = c5371.f17717;
        C5371.m9020(c3612);
        c3612.f12023.m9430(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(c5371.f17739.getPackageName())).hashCode(), new ComponentName(c5371.f17739, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.f15370;
        AbstractC0487.m1047(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        C3610 c3613 = c5371.f17717;
        C5371.m9020(c3613);
        c3613.f12023.m9430(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final int m8030() {
        C5371 c5371 = (C5371) this.f18660;
        m7643();
        mo6517();
        if (this.f15370 == null) {
            return 7;
        }
        Boolean boolM1166 = c5371.f17715.m1166("google_analytics_sgtm_upload_enabled");
        if (!(boolM1166 == null ? false : boolM1166.booleanValue())) {
            return 8;
        }
        if (c5371.m9029().f6515 < 119000) {
            return 6;
        }
        if (C1512.m3199(c5371.f17739)) {
            return !c5371.m9028().m9518() ? 5 : 2;
        }
        return 3;
    }
}
