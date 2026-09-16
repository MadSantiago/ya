package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: ۥ٘ؓٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1564 extends AbstractC2474 {

    /* JADX INFO: renamed from: ۥَ */
    public C5300 f5266;

    /* JADX INFO: renamed from: ۥٓ */
    public final AlarmManager f5267;

    /* JADX INFO: renamed from: ۥٖ */
    public Integer f5268;

    public C1564(C5034 c5034) {
        super(c5034);
        this.f5267 = (AlarmManager) ((C5371) this.f18660).f17739.getSystemService("alarm");
    }

    @Override // p000.AbstractC2474
    /* JADX INFO: renamed from: ۥٖ */
    public final void mo2428() {
        AlarmManager alarmManager = this.f5267;
        if (alarmManager != null) {
            Context context = ((C5371) this.f18660).f17739;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), AbstractC4925.f16237));
        }
        m3315();
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final int m3313() {
        Integer numValueOf = this.f5268;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf("measurement".concat(String.valueOf(((C5371) this.f18660).f17739.getPackageName())).hashCode());
            this.f5268 = numValueOf;
        }
        return numValueOf.intValue();
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final void m3314() {
        m4637();
        C5371 c5371 = (C5371) this.f18660;
        C3610 c3610 = c5371.f17717;
        C5371.m9020(c3610);
        c3610.f12023.m9432("Unscheduling upload");
        AlarmManager alarmManager = this.f5267;
        if (alarmManager != null) {
            Context context = c5371.f17739;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), AbstractC4925.f16237));
        }
        C5300 c5300 = this.f5266;
        if (c5300 == null) {
            c5300 = new C5300(this, this.f19371.f16665, 1);
            this.f5266 = c5300;
        }
        c5300.m2198();
        m3315();
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final void m3315() {
        JobScheduler jobScheduler = (JobScheduler) ((C5371) this.f18660).f17739.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m3313());
        }
    }
}
