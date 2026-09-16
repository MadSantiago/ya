package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: ۥؓؔؖؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0311 implements ThreadFactory {

    /* JADX INFO: renamed from: ۥۗ */
    public final Object f1157;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f1158;

    public ThreadFactoryC0311() {
        this.f1158 = 0;
        this.f1157 = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.f1158;
        Object obj = this.f1157;
        switch (i) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) obj).getAndIncrement());
                return thread;
            case 1:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(new RunnableC2863(0, runnable));
                threadNewThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) obj).getAndIncrement());
                return threadNewThread;
            default:
                Thread threadNewThread2 = ((ThreadFactory) obj).newThread(runnable);
                threadNewThread2.setName("ScionFrontendApi");
                return threadNewThread2;
        }
    }

    public ThreadFactoryC0311(C3286 c3286) {
        this.f1158 = 2;
        this.f1157 = Executors.defaultThreadFactory();
    }

    public ThreadFactoryC0311(AtomicLong atomicLong) {
        this.f1158 = 1;
        this.f1157 = atomicLong;
    }
}
