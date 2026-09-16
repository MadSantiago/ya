package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ۦٕٓؒۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4110 implements InterfaceC2735 {

    /* JADX INFO: renamed from: ۥؗ */
    public static boolean f13702;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f13703 = Math.max(5, 10);

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC3077 f13704;

    public C4110(InterfaceC3077 interfaceC3077) {
        this.f13704 = interfaceC3077;
    }

    @Override // p000.InterfaceC2735
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo3893() {
        synchronized (C4110.class) {
            try {
                if (!f13702) {
                    RunnableC2054 runnableC2054 = new RunnableC2054(this);
                    long j = this.f13703;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    ScheduledExecutorServiceC3499 scheduledExecutorServiceC3499 = (ScheduledExecutorServiceC3499) this.f13704.get();
                    RunnableC0226 runnableC0226 = new RunnableC0226(this, runnableC2054, scheduledExecutorServiceC3499, j);
                    scheduledExecutorServiceC3499.getClass();
                    RunnableFutureC1595 runnableFutureC1595 = new RunnableFutureC1595(Executors.callable(runnableC0226, null));
                    ScheduledFutureC2832 scheduledFutureC2832 = new ScheduledFutureC2832(runnableFutureC1595, scheduledExecutorServiceC3499.f11603.schedule(runnableFutureC1595, j, timeUnit));
                    scheduledFutureC2832.mo3760(new RunnableC3365(25, scheduledFutureC2832), EnumC0486.f1767);
                    f13702 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
