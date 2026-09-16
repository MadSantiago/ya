package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import p000.AbstractC0487;
import p000.AbstractC2080;
import p000.C0177;
import p000.C1076;
import p000.C1984;
import p000.C2972;
import p000.C3551;
import p000.C3600;
import p000.C3875;
import p000.C5301;
import p000.C5860;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    /* JADX INFO: renamed from: ۥۣ */
    public final C2972 mo82() {
        C3600 c3600M6413 = C3600.m6413(this.f245);
        WorkDatabase workDatabase = c3600M6413.f11986;
        C0177 c0177Mo103 = workDatabase.mo103();
        C1076 c1076Mo89 = workDatabase.mo89();
        C5301 c5301Mo90 = workDatabase.mo90();
        C3551 c3551Mo88 = workDatabase.mo88();
        Object obj = c3600M6413.f11989.f9390;
        List list = (List) AbstractC0487.m1075(c0177Mo103.f663, true, false, new C5860(System.currentTimeMillis() - 86400000, 4));
        WorkDatabase workDatabase2 = c0177Mo103.f663;
        List list2 = (List) AbstractC0487.m1075(workDatabase2, true, false, new C3875(24));
        List list3 = (List) AbstractC0487.m1075(workDatabase2, true, false, new C3875(28));
        if (!list.isEmpty()) {
            C1984 c1984M3874 = C1984.m3874();
            String str = AbstractC2080.f6862;
            c1984M3874.m3883(str, "Recently completed work:\n\n");
            C1984.m3874().m3883(str, AbstractC2080.m4024(c1076Mo89, c5301Mo90, c3551Mo88, list));
        }
        if (!list2.isEmpty()) {
            C1984 c1984M3875 = C1984.m3874();
            String str2 = AbstractC2080.f6862;
            c1984M3875.m3883(str2, "Running work:\n\n");
            C1984.m3874().m3883(str2, AbstractC2080.m4024(c1076Mo89, c5301Mo90, c3551Mo88, list2));
        }
        if (!list3.isEmpty()) {
            C1984 c1984M3876 = C1984.m3874();
            String str3 = AbstractC2080.f6862;
            c1984M3876.m3883(str3, "Enqueued work:\n\n");
            C1984.m3874().m3883(str3, AbstractC2080.m4024(c1076Mo89, c5301Mo90, c3551Mo88, list3));
        }
        return new C2972();
    }
}
