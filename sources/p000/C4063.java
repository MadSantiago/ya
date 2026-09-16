package p000;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ۦؙْؒٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4063 implements InterfaceC2482 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ long f13530;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Runnable f13531;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ long f13532;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ TimeUnit f13533;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ ScheduledExecutorServiceC2597 f13534;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f13535;

    public /* synthetic */ C4063(ScheduledExecutorServiceC2597 scheduledExecutorServiceC2597, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.f13535 = i;
        this.f13534 = scheduledExecutorServiceC2597;
        this.f13531 = runnable;
        this.f13532 = j;
        this.f13530 = j2;
        this.f13533 = timeUnit;
    }

    @Override // p000.InterfaceC2482
    /* JADX INFO: renamed from: ۥۣ */
    public final ScheduledFuture mo4641(C4228 c4228) {
        int i = this.f13535;
        Runnable runnable = this.f13531;
        ScheduledExecutorServiceC2597 scheduledExecutorServiceC2597 = this.f13534;
        switch (i) {
            case 0:
                return scheduledExecutorServiceC2597.f8679.scheduleAtFixedRate(new RunnableC1091(scheduledExecutorServiceC2597, runnable, c4228, 0), this.f13532, this.f13530, this.f13533);
            default:
                return scheduledExecutorServiceC2597.f8679.scheduleWithFixedDelay(new RunnableC1091(scheduledExecutorServiceC2597, runnable, c4228, 2), this.f13532, this.f13530, this.f13533);
        }
    }
}
