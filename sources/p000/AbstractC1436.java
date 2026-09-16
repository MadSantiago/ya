package p000;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: ۥٕۥْ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1436 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final Handler f4924 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ۥۗ */
    public static final ExecutorC4322 f4923 = new ExecutorC4322(2);

    /* JADX INFO: renamed from: ۥۣ */
    public static void m3064(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            f4924.post(runnable);
        }
    }
}
