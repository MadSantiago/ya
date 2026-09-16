package p000;

import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: ۥْۦۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1242 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final ExecutorService f4274;

    static {
        ThreadFactoryC0311 threadFactoryC0311 = new ThreadFactoryC0311(new AtomicLong(1L));
        ThreadPoolExecutor.DiscardPolicy discardPolicy = new ThreadPoolExecutor.DiscardPolicy();
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactoryC0311, discardPolicy));
        Runtime.getRuntime().addShutdownHook(new Thread(new RunnableC2863(1, executorServiceUnconfigurableExecutorService), "Crashlytics Shutdown Hook for awaitEvenIfOnMainThread task continuation executor"));
        f4274 = executorServiceUnconfigurableExecutorService;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m2630(C3580 c3580) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        c3580.m6386(f4274, new C5322(12, countDownLatch));
        Looper mainLooper = Looper.getMainLooper();
        Looper looperMyLooper = Looper.myLooper();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (mainLooper == looperMyLooper) {
            countDownLatch.await(3000L, timeUnit);
        } else {
            countDownLatch.await(4000L, timeUnit);
        }
        if (c3580.m6390()) {
            c3580.m6388();
        } else {
            if (c3580.f11913) {
                throw new CancellationException("Task is already canceled");
            }
            if (!c3580.m6398()) {
                throw new TimeoutException();
            }
            throw new IllegalStateException(c3580.m6387());
        }
    }
}
