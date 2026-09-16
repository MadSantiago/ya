package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: ۥؘؒۜۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0659 implements Executor {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ AbstractC5352 f2437;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ Executor f2438;

    public ExecutorC0659(Executor executor, AbstractC5352 abstractC5352) {
        this.f2438 = executor;
        this.f2437 = abstractC5352;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f2438.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.f2437.m3763(e);
        }
    }
}
