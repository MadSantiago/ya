package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ۦّۨؓۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5872 extends AbstractC4857 {

    /* JADX INFO: renamed from: ۥۖ */
    public final InterfaceFutureC4378 f19391;

    public C5872(InterfaceFutureC4378 interfaceFutureC4378) {
        this.f19391 = interfaceFutureC4378;
    }

    @Override // p000.AbstractC0032, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f19391.cancel(z);
    }

    @Override // p000.AbstractC0032, java.util.concurrent.Future
    public final Object get() {
        return this.f19391.get();
    }

    @Override // p000.AbstractC0032, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f19391.isCancelled();
    }

    @Override // p000.AbstractC0032, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f19391.isDone();
    }

    @Override // p000.AbstractC0032
    public final String toString() {
        return this.f19391.toString();
    }

    @Override // p000.AbstractC0032, p000.InterfaceFutureC4378
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo3760(Runnable runnable, Executor executor) {
        this.f19391.mo3760(runnable, executor);
    }

    @Override // p000.AbstractC0032, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f19391.get(j, timeUnit);
    }
}
