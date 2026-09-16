package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: ۦۚؔۜؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC5176 implements Executor {

    /* JADX INFO: renamed from: ۦ۟ */
    public final Handler f17127;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f17128;

    public ExecutorC5176() {
        this.f17128 = 0;
        this.f17127 = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.f17128;
        Handler handler = this.f17127;
        switch (i) {
            case 0:
                handler.post(runnable);
                return;
            default:
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public ExecutorC5176(Handler handler) {
        this.f17128 = 1;
        this.f17127 = handler;
    }
}
