package p000;

/* JADX INFO: renamed from: ۥِؒۥؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1091 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Runnable f3805;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C4228 f3806;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ ScheduledExecutorServiceC2597 f3807;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f3808;

    public /* synthetic */ RunnableC1091(ScheduledExecutorServiceC2597 scheduledExecutorServiceC2597, Runnable runnable, C4228 c4228, int i) {
        this.f3808 = i;
        this.f3807 = scheduledExecutorServiceC2597;
        this.f3805 = runnable;
        this.f3806 = c4228;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3808;
        final C4228 c4228 = this.f3806;
        final Runnable runnable = this.f3805;
        ScheduledExecutorServiceC2597 scheduledExecutorServiceC2597 = this.f3807;
        switch (i) {
            case 0:
                final int i2 = 0;
                scheduledExecutorServiceC2597.f8680.execute(new Runnable() { // from class: ۦٍٕؓؓ
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i3 = i2;
                        C4228 c4229 = c4228;
                        Runnable runnable2 = runnable;
                        switch (i3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((ScheduledFutureC3471) c4229.f14025).mo1898(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC3471) c4229.f14025).mo1898(e2);
                                    return;
                                }
                            default:
                                ScheduledFutureC3471 scheduledFutureC3471 = (ScheduledFutureC3471) c4229.f14025;
                                try {
                                    runnable2.run();
                                    scheduledFutureC3471.m6602(null);
                                    return;
                                } catch (Exception e3) {
                                    scheduledFutureC3471.mo1898(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                final int i3 = 2;
                scheduledExecutorServiceC2597.f8680.execute(new Runnable() { // from class: ۦٍٕؓؓ
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i4 = i3;
                        C4228 c4229 = c4228;
                        Runnable runnable2 = runnable;
                        switch (i4) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((ScheduledFutureC3471) c4229.f14025).mo1898(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC3471) c4229.f14025).mo1898(e2);
                                    return;
                                }
                            default:
                                ScheduledFutureC3471 scheduledFutureC3471 = (ScheduledFutureC3471) c4229.f14025;
                                try {
                                    runnable2.run();
                                    scheduledFutureC3471.m6602(null);
                                    return;
                                } catch (Exception e3) {
                                    scheduledFutureC3471.mo1898(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                final int i4 = 1;
                scheduledExecutorServiceC2597.f8680.execute(new Runnable() { // from class: ۦٍٕؓؓ
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i5 = i4;
                        C4228 c4229 = c4228;
                        Runnable runnable2 = runnable;
                        switch (i5) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((ScheduledFutureC3471) c4229.f14025).mo1898(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC3471) c4229.f14025).mo1898(e2);
                                    return;
                                }
                            default:
                                ScheduledFutureC3471 scheduledFutureC3471 = (ScheduledFutureC3471) c4229.f14025;
                                try {
                                    runnable2.run();
                                    scheduledFutureC3471.m6602(null);
                                    return;
                                } catch (Exception e3) {
                                    scheduledFutureC3471.mo1898(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
