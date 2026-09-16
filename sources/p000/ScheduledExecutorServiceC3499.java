package p000;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ۦؘؖٞ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ScheduledExecutorServiceC3499 extends AbstractExecutorService implements ScheduledExecutorService, ExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final ScheduledExecutorService f11603;

    /* JADX INFO: renamed from: ۦۨ */
    public final ScheduledExecutorService f11604;

    public ScheduledExecutorServiceC3499(ScheduledExecutorService scheduledExecutorService) {
        scheduledExecutorService.getClass();
        this.f11604 = scheduledExecutorService;
        this.f11603 = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f11604.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ScheduledExecutorService scheduledExecutorService;
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = (scheduledExecutorService = this.f11604).isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = scheduledExecutorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f11604.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f11604.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f11604.isTerminated();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new RunnableFutureC1595(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        RunnableFutureC1595 runnableFutureC1595 = new RunnableFutureC1595(Executors.callable(runnable, null));
        return new ScheduledFutureC2832(runnableFutureC1595, this.f11603.schedule(runnableFutureC1595, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        RunnableC2360 runnableC2360 = new RunnableC2360(runnable);
        return new ScheduledFutureC2832(runnableC2360, this.f11603.scheduleAtFixedRate(runnableC2360, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        RunnableC2360 runnableC2360 = new RunnableC2360(runnable);
        return new ScheduledFutureC2832(runnableC2360, this.f11603.scheduleWithFixedDelay(runnableC2360, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f11604.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f11604.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return (InterfaceFutureC4378) super.submit(runnable);
    }

    public final String toString() {
        String string = super.toString();
        String strValueOf = String.valueOf(this.f11604);
        StringBuilder sb = new StringBuilder(strValueOf.length() + String.valueOf(string).length() + 2);
        sb.append(string);
        sb.append("[");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceFutureC4378 m6287(RunnableC5413 runnableC5413) {
        return (InterfaceFutureC4378) super.submit(runnableC5413);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return (InterfaceFutureC4378) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return (InterfaceFutureC4378) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC1595(callable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        RunnableFutureC1595 runnableFutureC1595 = new RunnableFutureC1595(callable);
        return new ScheduledFutureC2832(runnableFutureC1595, this.f11603.schedule(runnableFutureC1595, j, timeUnit));
    }
}
