package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ۦٌؘ۠ؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC5429 implements ThreadFactory {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ boolean f17921;

    /* JADX INFO: renamed from: ۥۣ */
    public final AtomicInteger f17922 = new AtomicInteger(0);

    public ThreadFactoryC5429(boolean z) {
        this.f17921 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, (this.f17921 ? "WM.task-" : "androidx.work-") + this.f17922.incrementAndGet());
    }
}
