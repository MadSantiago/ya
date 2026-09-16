package p000;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ۥۦؗۧٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ScheduledFutureC2832 implements ScheduledFuture, InterfaceFutureC4378, Future {

    /* JADX INFO: renamed from: ۦ۟ */
    public final ScheduledFuture f9467;

    /* JADX INFO: renamed from: ۦۨ */
    public final AbstractC0032 f9468;

    public ScheduledFutureC2832(AbstractC0032 abstractC0032, ScheduledFuture scheduledFuture) {
        this.f9468 = abstractC0032;
        this.f9467 = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zM5401 = m5401(z);
        if (zM5401) {
            this.f9467.cancel(z);
        }
        return zM5401;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f9467.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f9468.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f9467.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9468.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f9468.isDone();
    }

    public final String toString() {
        return this.f9468.toString();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m5401(boolean z) {
        return this.f9468.cancel(z);
    }

    @Override // p000.InterfaceFutureC4378
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo3760(Runnable runnable, Executor executor) {
        this.f9468.mo3760(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f9468.get(j, timeUnit);
    }
}
