package p000;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ۥؑۚ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0226 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f847;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f848;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ long f849;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f850 = 1;

    public RunnableC0226(C5266 c5266, C0932 c0932, long j) {
        this.f847 = c0932;
        this.f849 = j;
        Objects.requireNonNull(c5266);
        this.f848 = c5266;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f850;
        Object obj = this.f848;
        long j = this.f849;
        Object obj2 = this.f847;
        switch (i) {
            case 0:
                C5266 c5266 = (C5266) obj;
                c5266.m8898((C0932) obj2, false, j);
                c5266.f17353 = null;
                C5695 c5695M9028 = ((C5371) c5266.f18660).m9028();
                c5695M9028.mo6517();
                c5695M9028.m7643();
                c5695M9028.m9509(new RunnableC5413(c5695M9028, null));
                break;
            default:
                ((RunnableC2054) obj2).run();
                ScheduledExecutorServiceC3499 scheduledExecutorServiceC3499 = (ScheduledExecutorServiceC3499) obj;
                scheduledExecutorServiceC3499.getClass();
                RunnableFutureC1595 runnableFutureC1595 = new RunnableFutureC1595(Executors.callable(this, null));
                ScheduledFutureC2832 scheduledFutureC2832 = new ScheduledFutureC2832(runnableFutureC1595, scheduledExecutorServiceC3499.f11603.schedule(runnableFutureC1595, j, TimeUnit.MINUTES));
                scheduledFutureC2832.mo3760(new RunnableC3365(25, scheduledFutureC2832), EnumC0486.f1767);
                break;
        }
    }

    public RunnableC0226(C4110 c4110, RunnableC2054 runnableC2054, ScheduledExecutorServiceC3499 scheduledExecutorServiceC3499, long j) {
        this.f847 = runnableC2054;
        this.f848 = scheduledExecutorServiceC3499;
        this.f849 = j;
    }
}
