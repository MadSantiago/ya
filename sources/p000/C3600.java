package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: ۦؚٕؕٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3600 {

    /* JADX INFO: renamed from: ۦؚ */
    public static C3600 f11983;

    /* JADX INFO: renamed from: ۦٌ */
    public static final Object f11984;

    /* JADX INFO: renamed from: ۦۗ */
    public static C3600 f11985;

    /* JADX INFO: renamed from: ۥؗ */
    public final WorkDatabase f11986;

    /* JADX INFO: renamed from: ۥُ */
    public final List f11987;

    /* JADX INFO: renamed from: ۥّ */
    public final C3654 f11988;

    /* JADX INFO: renamed from: ۥۗ */
    public final C2813 f11989;

    /* JADX INFO: renamed from: ۥۜ */
    public boolean f11990 = false;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f11991;

    /* JADX INFO: renamed from: ۦؑ */
    public final C1489 f11992;

    /* JADX INFO: renamed from: ۦِ */
    public final C1414 f11993;

    /* JADX INFO: renamed from: ۦٛ */
    public BroadcastReceiver.PendingResult f11994;

    /* JADX INFO: renamed from: ۦۙ */
    public final C1186 f11995;

    static {
        C1984.m3875("WorkManagerImpl");
        f11985 = null;
        f11983 = null;
        f11984 = new Object();
    }

    public C3600(Context context, final C2813 c2813, C1489 c1489, final WorkDatabase workDatabase, final List list, C3654 c3654, C1414 c1414) {
        int i = 0;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            C1078.m2276("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        C1984 c1984 = new C1984(4);
        synchronized (C1984.f6550) {
            try {
                if (C1984.f6549 == null) {
                    C1984.f6549 = c1984;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f11991 = applicationContext;
        this.f11992 = c1489;
        this.f11986 = workDatabase;
        this.f11988 = c3654;
        this.f11993 = c1414;
        this.f11989 = c2813;
        this.f11987 = list;
        C3950 c3950M7151 = AbstractC4009.m7151((AbstractC2132) c1489.f5057);
        this.f11995 = new C1186(workDatabase);
        final ExecutorC2205 executorC2205 = (ExecutorC2205) c1489.f5059;
        String str = AbstractC5554.f18336;
        c3654.m6533(new InterfaceC0978() { // from class: ۥٚؗ۠ۚ
            @Override // p000.InterfaceC0978
            /* JADX INFO: renamed from: ۦؑ */
            public final void mo108(C1860 c1860, boolean z) {
                executorC2205.execute(new RunnableC3679(list, c1860, c2813, workDatabase, 2));
            }
        });
        ((ExecutorC2205) c1489.f5059).execute(new RunnableC2363(applicationContext, this));
        String str2 = AbstractC1018.f3605;
        if (AbstractC1230.m2596(applicationContext)) {
            WorkDatabase workDatabase2 = workDatabase.mo103().f663;
            String[] strArr = {"workspec"};
            C3875 c3875 = new C3875(27);
            C4775 c4775 = workDatabase2.f250;
            InterfaceC0443 interfaceC0443 = null;
            c4775 = c4775 == null ? null : c4775;
            int i2 = 1;
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, 1);
            C3757 c3757 = c4775.f15739;
            C3869 c3869M6613 = c3757.m6613(strArr2);
            String[] strArr3 = (String[]) c3869M6613.f12915;
            int i3 = 1;
            InterfaceC4707 c0710 = new C0710(i3, new C1734(c3757, (int[]) c3869M6613.f12914, strArr3, interfaceC0443, 10));
            C5024 c5024 = c4775.f15747;
            C1736 c1736 = c5024 != null ? new C1736(7, c5024.f16627, strArr3) : null;
            if (c1736 != null) {
                InterfaceC4707[] interfaceC4707Arr = {c0710, c1736};
                int i4 = AbstractC5651.f18607;
                c0710 = new C1083(new C2222(i, interfaceC4707Arr), C4794.f15814, -2, i2, 1);
            }
            AbstractC2765.m5135(c3950M7151, null, 0, new C2718(new C1736(6, C3133.m5805(AbstractC4593.m7989(new C1736(3, new C4312(AbstractC4593.m7989(c0710, -1), workDatabase2, c3875), new C4704(4, null)), -1)), new C0952(applicationContext, interfaceC0443, i3)), interfaceC0443, i3), 3);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C3600 m6413(Context context) {
        C3600 c3600;
        Object obj = f11984;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        c3600 = f11985;
                        if (c3600 == null) {
                            c3600 = f11983;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c3600;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c3600 != null) {
            return c3600;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m6414() {
        Object obj = this.f11989.f9392;
        C0463 c0463 = new C0463(16, this);
        boolean zM9353 = AbstractC5568.m9353();
        if (zM9353) {
            try {
                Trace.beginSection(AbstractC5568.m9363("ReschedulingWork"));
            } finally {
                if (zM9353) {
                    Trace.endSection();
                }
            }
        }
        c0463.mo449();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m6415() {
        synchronized (f11984) {
            try {
                this.f11990 = true;
                BroadcastReceiver.PendingResult pendingResult = this.f11994;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f11994 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
