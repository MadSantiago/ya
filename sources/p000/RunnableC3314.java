package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: ۦۣؕۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3314 extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: ۥَ */
    public static final RunnableC2054 f11100;

    /* JADX INFO: renamed from: ۥٓ */
    public static final RunnableC2054 f11101;

    /* JADX INFO: renamed from: ۥْ */
    public final Object f11102;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ RunnableFutureC1595 f11103;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f11104 = 1;

    static {
        int i = 2;
        f11101 = new RunnableC2054(i);
        f11100 = new RunnableC2054(i);
    }

    public RunnableC3314(RunnableFutureC1595 runnableFutureC1595, Callable callable) {
        this.f11103 = runnableFutureC1595;
        callable.getClass();
        this.f11102 = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zIsDone;
        Thread threadCurrentThread = Thread.currentThread();
        Object objCall = null;
        if (compareAndSet(null, threadCurrentThread)) {
            int i = this.f11104;
            RunnableFutureC1595 runnableFutureC1595 = this.f11103;
            switch (i) {
                case 0:
                    zIsDone = runnableFutureC1595.isDone();
                    break;
                default:
                    zIsDone = runnableFutureC1595.isDone();
                    break;
            }
            RunnableC2054 runnableC2054 = f11101;
            if (!zIsDone) {
                Object obj = this.f11102;
                try {
                    switch (i) {
                        case 0:
                            C3743 c3743 = (C3743) obj;
                            Callable callable = (Callable) c3743.f12466;
                            EnumC0486 enumC0486 = EnumC0486.f1767;
                            RunnableFutureC1595 runnableFutureC1596 = new RunnableFutureC1595(callable);
                            enumC0486.execute(runnableFutureC1596);
                            AbstractC0949.m1952(runnableFutureC1596, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", c3743);
                            objCall = runnableFutureC1596;
                            break;
                        default:
                            objCall = ((Callable) obj).call();
                            break;
                    }
                } catch (Throwable th) {
                    if (!compareAndSet(threadCurrentThread, runnableC2054)) {
                        m6090(threadCurrentThread);
                    }
                    if (zIsDone) {
                        return;
                    }
                    switch (i) {
                        case 0:
                            runnableFutureC1595.m3763(th);
                            break;
                        default:
                            runnableFutureC1595.m3763(th);
                            break;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, runnableC2054)) {
                m6090(threadCurrentThread);
            }
            if (zIsDone) {
                return;
            }
            switch (i) {
                case 0:
                    runnableFutureC1595.m3766((InterfaceFutureC4378) objCall);
                    break;
                default:
                    runnableFutureC1595.m3762(objCall);
                    break;
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String string;
        String string2;
        Runnable runnable = (Runnable) get();
        if (runnable == f11101) {
            string = "running=[DONE]";
        } else if (runnable instanceof RunnableC1151) {
            string = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            string = sb.toString();
        } else {
            string = "running=[NOT STARTED YET]";
        }
        int i = this.f11104;
        Object obj = this.f11102;
        switch (i) {
            case 0:
                string2 = ((C3743) obj).toString();
                break;
            default:
                string2 = ((Callable) obj).toString();
                break;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(string2).length() + string.length() + 2);
        sb2.append(string);
        sb2.append(", ");
        sb2.append(string2);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m6090(Thread thread) {
        Runnable runnable = (Runnable) get();
        RunnableC1151 runnableC1151 = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof RunnableC1151;
            RunnableC2054 runnableC2054 = f11100;
            if (!z2 && runnable != runnableC2054) {
                break;
            }
            if (z2) {
                runnableC1151 = (RunnableC1151) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == runnableC2054 || compareAndSet(runnable, runnableC2054)) {
                z = Thread.interrupted() || z;
                LockSupport.park(runnableC1151);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public RunnableC3314(RunnableFutureC1595 runnableFutureC1595, C3743 c3743) {
        this.f11103 = runnableFutureC1595;
        this.f11102 = c3743;
    }
}
