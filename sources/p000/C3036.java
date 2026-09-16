package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: ۦٟؑؔٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3036 extends AbstractC4383 {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ int f10210 = 1;

    /* JADX INFO: renamed from: ۦؑ */
    public final Context f10211;

    public C3036(Context context) {
        super(9, 10);
        this.f10211 = context;
    }

    @Override // p000.AbstractC4383
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo5624(C0956 c0956) {
        int i = this.f10210;
        Context context = this.f10211;
        switch (i) {
            case 0:
                if (this.f14449 >= 10) {
                    c0956.m1984(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                c0956.m1982("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    c0956.m1986();
                    try {
                        c0956.m1984(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        c0956.m1984(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                        sharedPreferences.edit().clear().apply();
                        c0956.m1983();
                        c0956.m1981();
                    } catch (Throwable th) {
                        c0956.m1981();
                        throw th;
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i2 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i3 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    c0956.m1986();
                    try {
                        c0956.m1984(new Object[]{"next_job_scheduler_id", Integer.valueOf(i2)});
                        c0956.m1984(new Object[]{"next_alarm_manager_id", Integer.valueOf(i3)});
                        sharedPreferences2.edit().clear().apply();
                        c0956.m1983();
                        return;
                    } finally {
                        c0956.m1981();
                    }
                }
                return;
        }
    }

    public C3036(Context context, int i, int i2) {
        super(i, i2);
        this.f10211 = context;
    }
}
