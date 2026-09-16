package p000;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ۦؙؖٞؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC3559 implements Executor {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ Choreographer f11793;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f11793.postFrameCallback(new ChoreographerFrameCallbackC1810(runnable, 1));
    }
}
