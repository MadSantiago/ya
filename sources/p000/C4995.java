package p000;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ۦۗ۟٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4995 implements InterfaceFutureC4378 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final C5112 f16533 = new C5112(this);

    /* JADX INFO: renamed from: ۦۨ */
    public final WeakReference f16534;

    public C4995(C4206 c4206) {
        this.f16534 = new WeakReference(c4206);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C4206 c4206 = (C4206) this.f16534.get();
        boolean zCancel = this.f16533.cancel(z);
        if (zCancel && c4206 != null) {
            c4206.f13967 = null;
            c4206.f13966 = null;
            c4206.f13965.m6602(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f16533.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f16533.f12495 instanceof C0052;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f16533.isDone();
    }

    public final String toString() {
        return this.f16533.toString();
    }

    @Override // p000.InterfaceFutureC4378
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo3760(Runnable runnable, Executor executor) {
        this.f16533.mo3760(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f16533.get(j, timeUnit);
    }
}
