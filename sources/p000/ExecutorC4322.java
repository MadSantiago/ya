package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ۦؘٖؐٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC4322 implements Executor {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f14288;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f14288) {
            case 0:
                C1774.m3564().f5925.f14298.execute(runnable);
                break;
            case 1:
                runnable.run();
                break;
            default:
                AbstractC1436.m3064(runnable);
                break;
        }
    }
}
