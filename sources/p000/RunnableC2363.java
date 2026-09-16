package p000;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ۥٕۜؑٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2363 implements Runnable {

    /* JADX INFO: renamed from: ۥَ */
    public static final String f7824 = C1984.m3875("ForceStopRunnable");

    /* JADX INFO: renamed from: ۥٖ */
    public static final long f7825 = 315360000000L;

    /* JADX INFO: renamed from: ۥْ */
    public final C1186 f7826;

    /* JADX INFO: renamed from: ۥٓ */
    public int f7827 = 0;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C3600 f7828;

    /* JADX INFO: renamed from: ۦۨ */
    public final Context f7829;

    public RunnableC2363(Context context, C3600 c3600) {
        this.f7829 = context.getApplicationContext();
        this.f7828 = c3600;
        this.f7826 = c3600.f11995;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static void m4431(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + f7825;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f7829;
        String str = f7824;
        C3600 c3600 = this.f7828;
        C2813 c2813 = c3600.f11989;
        try {
            if (!m4432()) {
                c3600.m6415();
                return;
            }
            while (true) {
                try {
                    AbstractC2133.m4153(context);
                    C1984.m3874().m3878(str, "Performing cleanup operations.");
                    try {
                        m4433();
                        c3600.m6415();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e) {
                        int i = this.f7827 + 1;
                        this.f7827 = i;
                        if (i >= 3) {
                            String str2 = AbstractC2552.m4827(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            C1984.m3874().m3879(str, str2, e);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e);
                            c2813.getClass();
                            throw illegalStateException;
                        }
                        long j = ((long) i) * 300;
                        String str3 = "Retrying after " + j;
                        if (C1984.m3874().f6551 <= 3) {
                            Log.d(str, str3, e);
                        }
                        try {
                            Thread.sleep(((long) this.f7827) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    C1984.m3874().m3884(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    c2813.getClass();
                    throw illegalStateException2;
                }
            }
        } catch (Throwable th) {
            c3600.m6415();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m4432() {
        this.f7828.f11989.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f7824;
        if (zIsEmpty) {
            C1984.m3874().m3878(str, "The default process name was not specified.");
            return true;
        }
        boolean zM2596 = AbstractC1230.m2596(this.f7829);
        C1984.m3874().m3878(str, "Is default app process = " + zM2596);
        return zM2596;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0207  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x01ef  */
    /* JADX INFO: renamed from: ۥۣ */
    public final void m4433() {
        boolean z;
        C1186 c1186 = this.f7826;
        C3600 c3600 = this.f7828;
        C2813 c2813 = c3600.f11989;
        C1186 c1187 = c3600.f11995;
        WorkDatabase workDatabase = c3600.f11986;
        String str = C5886.f19415;
        Context context = this.f7829;
        JobScheduler jobSchedulerM3533 = AbstractC1718.m3533(context);
        ArrayList<JobInfo> arrayListM9719 = C5886.m9719(context, jobSchedulerM3533);
        List list = (List) AbstractC0487.m1075(workDatabase.mo88().f11784, true, false, new C4215(28));
        HashSet hashSet = new HashSet(arrayListM9719 != null ? arrayListM9719.size() : 0);
        if (arrayListM9719 != null && !arrayListM9719.isEmpty()) {
            for (JobInfo jobInfo : arrayListM9719) {
                C1860 c1860M9717 = C5886.m9717(jobInfo);
                if (c1860M9717 != null) {
                    hashSet.add(c1860M9717.f6202);
                } else {
                    C5886.m9718(jobSchedulerM3533, jobInfo.getId());
                }
            }
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    C1984.m3874().m3878(C5886.f19415, "Reconciling jobs");
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            workDatabase.m91();
            try {
                C0177 c0177Mo103 = workDatabase.mo103();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    c0177Mo103.m380(-1L, (String) it2.next());
                }
                workDatabase.m87();
                workDatabase.m95();
            } catch (Throwable th) {
                workDatabase.m95();
                throw th;
            }
        }
        C0177 c0177Mo104 = workDatabase.mo103();
        C3488 c3488Mo98 = workDatabase.mo98();
        workDatabase.m91();
        try {
            List<C4142> list2 = (List) AbstractC0487.m1075(c0177Mo104.f663, true, false, new C3875(24));
            boolean z2 = (list2 == null || list2.isEmpty()) ? false : true;
            if (z2) {
                for (C4142 c4142 : list2) {
                    EnumC4972 enumC4972 = EnumC4972.f16455;
                    String str2 = c4142.f13787;
                    c0177Mo104.m376(enumC4972, str2);
                    c0177Mo104.m377(-512, str2);
                    c0177Mo104.m380(-1L, str2);
                }
            }
            AbstractC0487.m1075(c3488Mo98.f11586, false, true, new C3875(21));
            workDatabase.m87();
            workDatabase.m95();
            boolean z3 = z2 || z;
            Long lM6540 = c1187.f4075.mo102().m6540("reschedule_needed");
            int i = 29;
            String str3 = f7824;
            if (lM6540 != null && lM6540.longValue() == 1) {
                C1984.m3874().m3878(str3, "Rescheduling Workers.");
                c3600.m6414();
                c1187.getClass();
                C5435 c5435 = new C5435("reschedule_needed", 0L);
                C3680 c3680Mo102 = c1187.f4075.mo102();
                AbstractC0487.m1075(c3680Mo102.f12293, false, true, new C0079(i, c3680Mo102, c5435));
                return;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                int i3 = i2 >= 31 ? 570425344 : 536870912;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i3);
                if (i2 < 30) {
                    if (broadcast == null) {
                        m4431(context);
                        C1984.m3874().m3878(str3, "Application was force-stopped, rescheduling.");
                        c3600.m6414();
                        Object obj = c2813.f9390;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        c1186.getClass();
                        C5435 c5436 = new C5435("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis));
                        C3680 c3680Mo103 = c1186.f4075.mo102();
                        AbstractC0487.m1075(c3680Mo103.f12293, false, true, new C0079(i, c3680Mo103, c5436));
                        return;
                    }
                    if (z3) {
                        C1984.m3874().m3878(str3, "Found unfinished work, scheduling it.");
                        AbstractC5554.m9308(c2813, workDatabase, c3600.f11987);
                    }
                }
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long lM6541 = c1186.f4075.mo102().m6540("last_force_stop_ms");
                    long jLongValue = lM6541 != null ? lM6541.longValue() : 0L;
                    for (int i4 = 0; i4 < historicalProcessExitReasons.size(); i4++) {
                        ApplicationExitInfo applicationExitInfoM2886 = AbstractC1369.m2886(historicalProcessExitReasons.get(i4));
                        if (applicationExitInfoM2886.getReason() == 10 && applicationExitInfoM2886.getTimestamp() >= jLongValue) {
                            C1984.m3874().m3878(str3, "Application was force-stopped, rescheduling.");
                            c3600.m6414();
                            Object obj2 = c2813.f9390;
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            c1186.getClass();
                            C5435 c5437 = new C5435("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis2));
                            C3680 c3680Mo104 = c1186.f4075.mo102();
                            AbstractC0487.m1075(c3680Mo104.f12293, false, true, new C0079(i, c3680Mo104, c5437));
                            return;
                        }
                    }
                }
                if (z3) {
                    C1984.m3874().m3878(str3, "Found unfinished work, scheduling it.");
                    AbstractC5554.m9308(c2813, workDatabase, c3600.f11987);
                }
            } catch (IllegalArgumentException e) {
                e = e;
                if (C1984.m3874().f6551 <= 5) {
                    Log.w(str3, "Ignoring exception", e);
                }
            } catch (SecurityException e2) {
                e = e2;
                if (C1984.m3874().f6551 <= 5) {
                    Log.w(str3, "Ignoring exception", e);
                }
            }
        } catch (Throwable th2) {
            workDatabase.m95();
            throw th2;
        }
    }
}
