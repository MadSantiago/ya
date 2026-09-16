package p000;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ۦٍٕۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5254 extends AbstractC4391 implements InterfaceC1312 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final Executor f17328;

    public C5254(Executor executor) {
        Method method;
        this.f17328 = executor;
        Method method2 = AbstractC3147.f10621;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = AbstractC3147.f10621) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f17328;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5254) && ((C5254) obj).f17328 == this.f17328;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f17328);
    }

    @Override // p000.AbstractC2132
    public final String toString() {
        return this.f17328.toString();
    }

    @Override // p000.AbstractC2132
    /* JADX INFO: renamed from: ۥؚ */
    public final void mo1466(InterfaceC3534 interfaceC3534, Runnable runnable) {
        try {
            this.f17328.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            AbstractC5568.m9380(interfaceC3534, cancellationException);
            C0649 c0649 = AbstractC0912.f3276;
            ExecutorC4540.f15006.mo1466(interfaceC3534, runnable);
        }
    }

    @Override // p000.InterfaceC1312
    /* JADX INFO: renamed from: ۦٚ */
    public final InterfaceC4883 mo1552(long j, Runnable runnable, InterfaceC3534 interfaceC3534) {
        Executor executor = this.f17328;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                AbstractC5568.m9380(interfaceC3534, cancellationException);
            }
        }
        return scheduledFutureSchedule != null ? new C0612(scheduledFutureSchedule) : RunnableC1153.f4006.mo1552(j, runnable, interfaceC3534);
    }

    @Override // p000.InterfaceC1312
    /* JADX INFO: renamed from: ۦ۟ */
    public final void mo1553(long j, C2600 c2600) {
        Executor executor = this.f17328;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            RunnableC4985 runnableC4985 = new RunnableC4985(11, this, c2600);
            InterfaceC3534 interfaceC3534 = c2600.f8690;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnableC4985, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                AbstractC5568.m9380(interfaceC3534, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            c2600.m4902(new C3011(0, scheduledFutureSchedule));
        } else {
            RunnableC1153.f4006.mo1553(j, c2600);
        }
    }
}
