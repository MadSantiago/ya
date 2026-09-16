package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: ۦۨؕ۟۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5886 implements InterfaceC1025 {

    /* JADX INFO: renamed from: ۥَ */
    public static final String f19415 = C1984.m3875("SystemJobScheduler");

    /* JADX INFO: renamed from: ۥْ */
    public final C5175 f19416;

    /* JADX INFO: renamed from: ۥٓ */
    public final WorkDatabase f19417;

    /* JADX INFO: renamed from: ۦ۟ */
    public final JobScheduler f19418;

    /* JADX INFO: renamed from: ۦۨ */
    public final Context f19419;

    public C5886(Context context, WorkDatabase workDatabase, C2813 c2813) {
        JobScheduler jobSchedulerM3533 = AbstractC1718.m3533(context);
        C5175 c5175 = new C5175(context, (C4575) c2813.f9390);
        this.f19419 = context;
        this.f19418 = jobSchedulerM3533;
        this.f19416 = c5175;
        this.f19417 = workDatabase;
    }

    /* JADX INFO: renamed from: ۥّ */
    public static C1860 m9717(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return new C1860(extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0), extras.getString("EXTRA_WORK_SPEC_ID"));
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m9718(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            C1984.m3874().m3879(f19415, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static ArrayList m9719(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        String str = AbstractC1718.f5721;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            C1984.m3874().m3879(AbstractC1718.f5721, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // p000.InterfaceC1025
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo2234(C4142... c4142Arr) {
        WorkDatabase workDatabase = this.f19417;
        C1186 c1186 = new C1186(workDatabase);
        int i = 0;
        for (C4142 c4142 : c4142Arr) {
            workDatabase.m91();
            try {
                C0177 c0177Mo103 = workDatabase.mo103();
                String str = c4142.f13787;
                C4142 c4142M378 = c0177Mo103.m378(str);
                String str2 = f19415;
                if (c4142M378 == null) {
                    C1984.m3874().m3885(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.m87();
                } else if (c4142M378.f13785 != EnumC4972.f16455) {
                    C1984.m3874().m3885(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.m87();
                } else {
                    C1860 c1860M2155 = AbstractC0993.m2155(c4142);
                    int i2 = c1860M2155.f6201;
                    String str3 = c1860M2155.f6202;
                    int i3 = 1;
                    C3193 c3193 = (C3193) AbstractC0487.m1075(workDatabase.mo88().f11784, true, false, new C2224(i2, i, str3));
                    int iIntValue = c3193 != null ? c3193.f10727 : ((Number) c1186.f4075.m105(new CallableC4849(i3, c1186))).intValue();
                    if (c3193 == null) {
                        C3193 c3194 = new C3193(i2, iIntValue, str3);
                        C3551 c3551Mo88 = workDatabase.mo88();
                        AbstractC0487.m1075(c3551Mo88.f11784, false, true, new C1708(6, c3551Mo88, c3194));
                    }
                    m9720(c4142, iIntValue);
                    workDatabase.m87();
                }
                workDatabase.m95();
            } catch (Throwable th) {
                workDatabase.m95();
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC1025
    /* JADX INFO: renamed from: ۥُ */
    public final boolean mo2235() {
        return true;
    }

    @Override // p000.InterfaceC1025
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2236(String str) {
        ArrayList arrayList;
        Context context = this.f19419;
        JobScheduler jobScheduler = this.f19418;
        ArrayList<JobInfo> arrayListM9719 = m9719(context, jobScheduler);
        if (arrayListM9719 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : arrayListM9719) {
                C1860 c1860M9717 = m9717(jobInfo);
                if (c1860M9717 != null && str.equals(c1860M9717.f6202)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m9718(jobScheduler, ((Integer) it.next()).intValue());
        }
        AbstractC0487.m1075(this.f19417.mo88().f11784, false, true, new C3203(8, str));
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m9720(C4142 c4142, int i) {
        int i2;
        List<JobInfo> allPendingJobs;
        String str;
        C4628 c4628 = c4142.f13791;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str2 = c4142.f13787;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str2);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", c4142.f13782);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", c4142.m7323());
        JobInfo.Builder builder = new JobInfo.Builder(i, this.f19416.f17126);
        boolean z = c4628.f15276;
        Set<C5628> set = c4628.f15283;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z);
        boolean z2 = c4628.f15282;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z2).setExtras(persistableBundle);
        NetworkRequest networkRequestM8012 = c4628.m8012();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28 || networkRequestM8012 == null) {
            int i4 = c4628.f15281;
            if (i3 < 30 || i4 != 6) {
                int iM6632 = AbstractC3761.m6632(i4);
                if (iM6632 == 0) {
                    i2 = 0;
                } else if (iM6632 == 1) {
                    i2 = 1;
                } else if (iM6632 != 2) {
                    i2 = 3;
                    if (iM6632 != 3) {
                        i2 = 4;
                        if (iM6632 != 4) {
                            C1984.m3874().m3878(C5175.f17125, "API version too low. Cannot convert network type value ".concat(AbstractC5078.m8684(i4)));
                            i2 = 1;
                        }
                    }
                } else {
                    i2 = 2;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            extras.setRequiredNetwork(networkRequestM8012);
        }
        if (!z2) {
            extras.setBackoffCriteria(c4142.f13790, c4142.f13789 == 2 ? 0 : 1);
        }
        long jMax = Math.max(c4142.m7324() - System.currentTimeMillis(), 0L);
        if (i3 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!c4142.f13780) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (C5628 c5628 : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(c5628.f18556, c5628.f18555 ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(c4628.f15284);
            extras.setTriggerContentMaxDelay(c4628.f15280);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(c4628.f15277);
        extras.setRequiresStorageNotLow(c4628.f15278);
        boolean z3 = c4142.f13795 > 0;
        boolean z4 = jMax > 0;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31 && c4142.f13780 && !z3 && !z4) {
            extras.setExpedited(true);
        }
        if (i5 >= 35 && (str = c4142.f13792) != null) {
            extras.setTraceTag(str);
        }
        JobInfo jobInfoBuild = extras.build();
        String str3 = f19415;
        C1984.m3874().m3878(str3, "Scheduling work ID " + str2 + "Job ID " + i);
        try {
            if (this.f19418.schedule(jobInfoBuild) == 0) {
                C1984.m3874().m3885(str3, "Unable to schedule work ID " + str2);
                if (c4142.f13780 && c4142.f13781 == 1) {
                    c4142.f13780 = false;
                    C1984.m3874().m3878(str3, "Scheduling a non-expedited job (work ID " + str2 + ")");
                    m9720(c4142, i);
                }
            }
        } catch (IllegalStateException e) {
            String str4 = AbstractC1718.f5721;
            int i6 = Build.VERSION.SDK_INT;
            int i7 = i6 >= 31 ? 150 : 100;
            int size = ((List) AbstractC0487.m1075(this.f19417.mo103().f663, true, false, new C3875(22))).size();
            Context context = this.f19419;
            String strM2056 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i6 >= 34) {
                JobScheduler jobSchedulerM3533 = AbstractC1718.m3533(context);
                try {
                    allPendingJobs = jobSchedulerM3533.getAllPendingJobs();
                } catch (Throwable th) {
                    C1984.m3874().m3879(AbstractC1718.f5721, "getAllPendingJobs() is not reliable on this device.", th);
                    allPendingJobs = null;
                }
                if (allPendingJobs != null) {
                    ArrayList arrayListM9719 = m9719(context, jobSchedulerM3533);
                    int size2 = arrayListM9719 != null ? allPendingJobs.size() - arrayListM9719.size() : 0;
                    String str5 = size2 == 0 ? null : size2 + " of which are not owned by WorkManager";
                    ArrayList arrayListM97110 = m9719(context, (JobScheduler) context.getSystemService("jobscheduler"));
                    int size3 = arrayListM97110 != null ? arrayListM97110.size() : 0;
                    strM2056 = AbstractC0973.m2056(AbstractC0246.m524(new String[]{allPendingJobs.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str5, size3 != 0 ? size3 + " from WorkManager in the default namespace" : null}), ",\n", null, null, null, 62);
                }
            } else {
                ArrayList arrayListM97111 = m9719(context, AbstractC1718.m3533(context));
                if (arrayListM97111 != null) {
                    strM2056 = arrayListM97111.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sb = new StringBuilder("JobScheduler ");
            sb.append(i7);
            sb.append(" job limit exceeded.\nIn JobScheduler there are ");
            sb.append(strM2056);
            sb.append(".\nThere are ");
            String strM6630 = AbstractC3761.m6630(size, " jobs tracked by WorkManager's database;\nthe Configuration limit is 20.", sb);
            C1984.m3874().m3884(str3, strM6630);
            throw new IllegalStateException(strM6630, e);
        } catch (Throwable th2) {
            C1984.m3874().m3879(str3, "Unable to schedule " + c4142, th2);
        }
    }
}
