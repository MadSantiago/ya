package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: ۥؘٖۙؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC2205 implements Executor {

    /* JADX INFO: renamed from: ۥَ */
    public final Executor f7308;

    /* JADX INFO: renamed from: ۥْ */
    public Runnable f7309;

    /* JADX INFO: renamed from: ۥٓ */
    public final Object f7310;

    /* JADX INFO: renamed from: ۦ۟ */
    public final ArrayDeque f7311;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f7312;

    public ExecutorC2205(Executor executor) {
        this.f7312 = 2;
        this.f7308 = executor;
        this.f7311 = new ArrayDeque();
        this.f7310 = new Object();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f7312) {
            case 0:
                synchronized (this.f7310) {
                    try {
                        this.f7311.add(new RunnableC5689(1, this, runnable));
                        if (this.f7309 == null) {
                            m4263();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 1:
                synchronized (this.f7310) {
                    try {
                        this.f7311.add(new RunnableC4985(13, this, runnable));
                        if (this.f7309 == null) {
                            m4263();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f7310) {
                    this.f7311.offer(new RunnableC5689(23, runnable, this));
                    if (this.f7309 == null) {
                        m4263();
                    }
                    break;
                }
                return;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4263() {
        switch (this.f7312) {
            case 0:
                synchronized (this.f7310) {
                    try {
                        Runnable runnable = (Runnable) this.f7311.poll();
                        this.f7309 = runnable;
                        if (runnable != null) {
                            ((ExecutorC3678) this.f7308).execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 1:
                Runnable runnable2 = (Runnable) this.f7311.poll();
                this.f7309 = runnable2;
                if (runnable2 != null) {
                    ((ExecutorService) this.f7308).execute(runnable2);
                    return;
                }
                return;
            default:
                synchronized (this.f7310) {
                    Object objPoll = this.f7311.poll();
                    Runnable runnable3 = (Runnable) objPoll;
                    this.f7309 = runnable3;
                    if (objPoll != null) {
                        this.f7308.execute(runnable3);
                    }
                    break;
                }
                return;
        }
    }

    public ExecutorC2205(ExecutorService executorService) {
        this.f7312 = 1;
        this.f7308 = executorService;
        this.f7311 = new ArrayDeque();
        this.f7310 = new Object();
    }

    public ExecutorC2205(ExecutorC3678 executorC3678) {
        this.f7312 = 0;
        this.f7310 = new Object();
        this.f7311 = new ArrayDeque();
        this.f7308 = executorC3678;
    }
}
