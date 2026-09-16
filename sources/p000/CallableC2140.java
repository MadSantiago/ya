package p000;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: ۥۘؑٞٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC2140 implements Callable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f7018;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f7019;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f7020;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f7021;

    public /* synthetic */ CallableC2140(Object obj, Object obj2, Object obj3, int i) {
        this.f7021 = i;
        this.f7020 = obj;
        this.f7018 = obj2;
        this.f7019 = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f7021;
        Object obj = this.f7019;
        Object obj2 = this.f7018;
        Object obj3 = this.f7020;
        switch (i) {
            case 0:
                return ((ScheduledExecutorServiceC2597) obj3).f8680.submit(new RunnableC5689(11, (Callable) obj2, (C4228) obj));
            default:
                String str = (String) obj;
                WorkDatabase workDatabase = ((C3654) obj3).f12228;
                ((ArrayList) obj2).addAll((List) AbstractC0487.m1075(workDatabase.mo90().f17460, true, false, new C3203(21, str)));
                return workDatabase.mo103().m378(str);
        }
    }
}
