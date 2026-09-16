package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ۦؘؖؒۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC3331 implements Executor {

    /* JADX INFO: renamed from: ۥٖ */
    public static final Logger f11144 = Logger.getLogger(ExecutorC3331.class.getName());

    /* JADX INFO: renamed from: ۦۨ */
    public final Executor f11149;

    /* JADX INFO: renamed from: ۦ۟ */
    public final ArrayDeque f11148 = new ArrayDeque();

    /* JADX INFO: renamed from: ۥْ */
    public int f11146 = 1;

    /* JADX INFO: renamed from: ۥٓ */
    public long f11147 = 0;

    /* JADX INFO: renamed from: ۥَ */
    public final RunnableC4985 f11145 = new RunnableC4985(this);

    public ExecutorC3331(Executor executor) {
        AbstractC0487.m1047(executor);
        this.f11149 = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC0487.m1047(runnable);
        synchronized (this.f11148) {
            int i = this.f11146;
            if (i != 4 && i != 3) {
                long j = this.f11147;
                boolean z = true;
                RunnableC3497 runnableC3497 = new RunnableC3497(runnable, 1);
                this.f11148.add(runnableC3497);
                this.f11146 = 2;
                try {
                    this.f11149.execute(this.f11145);
                    if (this.f11146 != 2) {
                        return;
                    }
                    synchronized (this.f11148) {
                        try {
                            if (this.f11147 == j && this.f11146 == 2) {
                                this.f11146 = 3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f11148) {
                        try {
                            int i2 = this.f11146;
                            if ((i2 != 1 && i2 != 2) || !this.f11148.removeLastOccurrence(runnableC3497)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.f11148.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f11149 + "}";
    }
}
