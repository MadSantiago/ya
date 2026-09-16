package p000;

import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Pair;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ۦۣۤؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5689 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f18716;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f18717;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f18718;

    public /* synthetic */ RunnableC5689(C3525 c3525, Throwable th) {
        this.f18718 = 8;
        Map map = Collections.EMPTY_MAP;
        this.f18717 = c3525;
        this.f18716 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2740 interfaceC2740;
        switch (this.f18718) {
            case 0:
                AbstractC0797.m1704((ViewOnAttachStateChangeListenerC4316) this.f18717, (LongSparseArray) this.f18716);
                return;
            case 1:
                ExecutorC2205 executorC2205 = (ExecutorC2205) this.f18717;
                try {
                    ((Runnable) this.f18716).run();
                    return;
                } finally {
                    executorC2205.m4263();
                }
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC5378.m9069((C3600) this.f18717, ((UUID) this.f18716).toString());
                return;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                AbstractActivityC1500 abstractActivityC1500 = (AbstractActivityC1500) this.f18717;
                abstractActivityC1500.f5665.mo2388(new C1653((C4023) this.f18716, abstractActivityC1500));
                return;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C1510 c1510 = (C1510) this.f18717;
                InterfaceC2090 interfaceC2090 = (InterfaceC2090) this.f18716;
                if (c1510.f5127 != C1510.f5126) {
                    C1078.m2276("provide() can be called only once.");
                    return;
                }
                synchronized (c1510) {
                    interfaceC2740 = c1510.f5128;
                    c1510.f5128 = null;
                    c1510.f5127 = interfaceC2090;
                    break;
                }
                interfaceC2740.mo397(interfaceC2090);
                return;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C0413 c0413 = (C0413) this.f18717;
                InterfaceC2090 interfaceC2091 = (InterfaceC2090) this.f18716;
                synchronized (c0413) {
                    try {
                        if (c0413.f1501 == null) {
                            c0413.f1502.add(interfaceC2091);
                        } else {
                            c0413.f1501.add(interfaceC2091.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                List<C2296> list = (List) this.f18717;
                AbstractC3959 abstractC3959 = (AbstractC3959) this.f18716;
                for (C2296 c2296 : list) {
                    Object obj = abstractC3959.f13233;
                    AbstractC0818 abstractC0818 = c2296.f7625;
                    Object c4495 = abstractC0818.mo1304(obj) ? new C4495(abstractC0818.mo1302()) : C1385.f4736;
                    C3002 c3002 = c2296.f7624;
                    c3002.getClass();
                    c3002.mo5597(c4495);
                }
                return;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                ((C4743) this.f18717).m8065((String) this.f18716, Boolean.FALSE);
                return;
            case 8:
                C3525 c3525 = (C3525) this.f18717;
                Throwable th2 = (Throwable) this.f18716;
                Map map = Collections.EMPTY_MAP;
                C4743 c4743 = c3525.f11685;
                Thread threadCurrentThread = Thread.currentThread();
                c4743.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                C3248 c3248 = c4743.f15668;
                if (c3248 == null || !c3248.f10911.get()) {
                    long j = jCurrentTimeMillis / 1000;
                    String strM8063 = c4743.m8063();
                    if (strM8063 == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    C1097 c1097 = new C1097(strM8063, j, map);
                    C3571 c3571 = c4743.f15663;
                    String strConcat = "Persisting non-fatal event for session ".concat(strM8063);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strConcat, null);
                    }
                    c3571.m6374(th2, threadCurrentThread, "error", c1097, false);
                    return;
                }
                return;
            case 9:
                ThreadFactoryC3076 threadFactoryC3076 = (ThreadFactoryC3076) this.f18717;
                Runnable runnable = (Runnable) this.f18716;
                Process.setThreadPriority(threadFactoryC3076.f10324);
                StrictMode.ThreadPolicy threadPolicy = threadFactoryC3076.f10327;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 10:
                ((InterfaceC3901) this.f18717).mo3081((Throwable) this.f18716);
                return;
            case 11:
                Callable callable = (Callable) this.f18717;
                ScheduledFutureC3471 scheduledFutureC3471 = (ScheduledFutureC3471) ((C4228) this.f18716).f14025;
                try {
                    scheduledFutureC3471.m6602(callable.call());
                    return;
                } catch (Exception e) {
                    scheduledFutureC3471.mo1898(e);
                    return;
                }
            case 12:
                ((C2600) this.f18717).m4901((C5136) this.f18716);
                return;
            case 13:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f18717;
                JobParameters jobParameters = (JobParameters) this.f18716;
                int i = JobInfoSchedulerService.f280;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 14:
                Executor executor = (Executor) this.f18717;
                InterfaceC4573 interfaceC4573 = (InterfaceC4573) this.f18716;
                try {
                    C3267 c3267M4818 = AbstractC2552.m4818();
                    if (executor == null) {
                        interfaceC4573.mo395(c3267M4818);
                    } else {
                        executor.execute(new RunnableC5689(15, interfaceC4573, c3267M4818));
                    }
                    return;
                } catch (C0887 unused) {
                    return;
                }
            case 15:
                ((InterfaceC4573) this.f18717).mo395((C3267) this.f18716);
                return;
            case 16:
                C3654 c3654 = (C3654) this.f18717;
                C1860 c1860 = (C1860) this.f18716;
                synchronized (c3654.f12236) {
                    try {
                        Iterator it = c3654.f12234.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC0978) it.next()).mo108(c1860, false);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
            case 17:
                C3943 c3943 = (C3943) this.f18717;
                CountDownLatch countDownLatch = (CountDownLatch) this.f18716;
                try {
                    C4046.m7245().f13491.m1023(((C1360) c3943.f13161.f4871).m2866(EnumC4021.f13409), 1);
                    break;
                } catch (Exception unused2) {
                }
                countDownLatch.countDown();
                return;
            case 18:
                ((C0835) this.f18717).m1741((Typeface) this.f18716);
                return;
            case 19:
                ((ServiceConnection) this.f18717).onNullBinding((ComponentName) ((Pair) ((C5459) this.f18716)).first);
                return;
            case 20:
                ((ServiceConnection) this.f18716).onServiceDisconnected((ComponentName) ((Pair) ((C1356) ((Pair) ((C2087) this.f18717)).first).f4662).first);
                return;
            case 21:
                BinderC0972 binderC0972 = (BinderC0972) this.f18717;
                IBinder iBinder = (IBinder) this.f18716;
                Iterator it2 = binderC0972.f3434.iterator();
                while (it2.hasNext()) {
                    ((ServiceConnection) it2.next()).onServiceConnected(binderC0972.f3433, iBinder);
                }
                return;
            case 22:
                ((C2346) ((C1489) this.f18717).f5057).m4412((C2666) this.f18716, 3);
                return;
            case 23:
                Runnable runnable2 = (Runnable) this.f18717;
                ExecutorC2205 executorC2206 = (ExecutorC2205) this.f18716;
                try {
                    runnable2.run();
                    return;
                } finally {
                    executorC2206.m4263();
                }
            default:
                C2074 c2074 = (C2074) this.f18717;
                AbstractC1434 abstractC1434 = (AbstractC1434) this.f18716;
                if (c2074.f6845) {
                    return;
                }
                c2074.f6846 = abstractC1434;
                abstractC1434.mo2388(c2074);
                return;
        }
    }

    public /* synthetic */ RunnableC5689(int i, Object obj, Object obj2) {
        this.f18718 = i;
        this.f18717 = obj;
        this.f18716 = obj2;
    }

    public /* synthetic */ RunnableC5689(C5002 c5002, InterfaceC3901 interfaceC3901, Throwable th) {
        this.f18718 = 10;
        this.f18717 = interfaceC3901;
        this.f18716 = th;
    }
}
