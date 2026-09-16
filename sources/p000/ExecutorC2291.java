package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: ۥۚؗٞۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC2291 implements Executor {

    /* JADX INFO: renamed from: ۦۨ */
    public final ExecutorService f7614;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f7613 = new Object();

    /* JADX INFO: renamed from: ۥْ */
    public C3580 f7612 = AbstractC5378.m9075(null);

    public ExecutorC2291(ExecutorService executorService) {
        this.f7614 = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f7614.execute(runnable);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C3580 m4345(Callable callable) {
        C3580 c3580M6392;
        synchronized (this.f7613) {
            c3580M6392 = this.f7612.m6392(this.f7614, new C5322(3, callable));
            this.f7612 = c3580M6392;
        }
        return c3580M6392;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C3580 m4346(Runnable runnable) {
        C3580 c3580M6392;
        synchronized (this.f7613) {
            c3580M6392 = this.f7612.m6392(this.f7614, new C5322(4, runnable));
            this.f7612 = c3580M6392;
        }
        return c3580M6392;
    }
}
