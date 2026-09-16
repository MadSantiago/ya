package p000;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: ۦِٟؒۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC4838 implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: ۥَ */
    public final C2064 f15936;

    /* JADX INFO: renamed from: ۥْ */
    public final long f15937;

    /* JADX INFO: renamed from: ۥٓ */
    public final String f15938;

    /* JADX INFO: renamed from: ۥٖ */
    public final C2064 f15939;

    /* JADX INFO: renamed from: ۦٗ */
    public final C1328 f15940;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f15941;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f15942;

    /* JADX INFO: renamed from: ۦۛ */
    public static final /* synthetic */ AtomicLongFieldUpdater f15935 = AtomicLongFieldUpdater.newUpdater(ExecutorC4838.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: ۥۖ */
    public static final /* synthetic */ AtomicLongFieldUpdater f15933 = AtomicLongFieldUpdater.newUpdater(ExecutorC4838.class, "controlState$volatile");

    /* JADX INFO: renamed from: ۦٕ */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15934 = AtomicIntegerFieldUpdater.newUpdater(ExecutorC4838.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: ۥٙ */
    public static final C5536 f15932 = new C5536(2, "NOT_IN_STACK");

    public ExecutorC4838(long j, String str, int i, int i2) {
        this.f15942 = i;
        this.f15941 = i2;
        this.f15937 = j;
        this.f15938 = str;
        if (i < 1) {
            C1078.m2273(AbstractC5078.m8681(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            C1078.m2273(AbstractC5078.m8679("Max pool size ", i2, i, " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            C1078.m2273(AbstractC5078.m8681(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f15936 = new C2064();
        this.f15939 = new C2064();
        this.f15940 = new C1328((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static /* synthetic */ void m8207(ExecutorC4838 executorC4838, Runnable runnable, int i) {
        executorC4838.m8211(runnable, false, (i & 4) == 0);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        AbstractRunnableC4045 abstractRunnableC4045M2253;
        if (f15934.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C1041 c1041 = threadCurrentThread instanceof C1041 ? (C1041) threadCurrentThread : null;
            if (c1041 == null || c1041.f3682 != this) {
                c1041 = null;
            }
            synchronized (this.f15940) {
                i = (int) (f15933.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    C1041 c1042 = (C1041) this.f15940.m2832(i2);
                    if (c1042 != c1041) {
                        while (c1042.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(c1042);
                            c1042.join(10000L);
                        }
                        C2685 c2685 = c1042.f3684;
                        C2064 c2064 = this.f15939;
                        c2685.getClass();
                        AbstractRunnableC4045 abstractRunnableC4045 = (AbstractRunnableC4045) AbstractC3456.f11473.getAndSetObject(c2685, C2685.f8908, (Object) null);
                        if (abstractRunnableC4045 != null) {
                            c2064.m6284(abstractRunnableC4045);
                        }
                        while (true) {
                            AbstractRunnableC4045 abstractRunnableC4045M4991 = c2685.m4991();
                            if (abstractRunnableC4045M4991 == null) {
                                break;
                            } else {
                                c2064.m6284(abstractRunnableC4045M4991);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f15939.m6283();
            this.f15936.m6283();
            while (true) {
                if (c1041 != null) {
                    abstractRunnableC4045M2253 = c1041.m2253(true);
                    if (abstractRunnableC4045M2253 == null) {
                        abstractRunnableC4045M2253 = (AbstractRunnableC4045) this.f15936.m6285();
                        if (abstractRunnableC4045M2253 == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    abstractRunnableC4045M2253 = (AbstractRunnableC4045) this.f15936.m6285();
                    if (abstractRunnableC4045M2253 == null && (abstractRunnableC4045M2253 = (AbstractRunnableC4045) this.f15939.m6285()) == null) {
                        break;
                    }
                }
                try {
                    abstractRunnableC4045M2253.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (c1041 != null) {
                c1041.m2252(5);
            }
            f15935.set(this, 0L);
            f15933.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m8207(this, runnable, 6);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C1328 c1328 = this.f15940;
        int iM2833 = c1328.m2833();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM2833; i6++) {
            C1041 c1041 = (C1041) c1328.m2832(i6);
            if (c1041 != null) {
                C2685 c2685 = c1041.f3684;
                c2685.getClass();
                Object objectVolatile = AbstractC3456.f11473.getObjectVolatile(c2685, C2685.f8908);
                int iM4992 = c2685.m4992();
                if (objectVolatile != null) {
                    iM4992++;
                }
                int iM6632 = AbstractC3761.m6632(c1041.f3678);
                if (iM6632 == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iM4992);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iM6632 == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM4992);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iM6632 == 2) {
                    i3++;
                } else if (iM6632 == 3) {
                    i4++;
                    if (iM4992 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iM4992);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iM6632 != 4) {
                        C1078.m2275();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = f15933.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f15938);
        sb4.append('@');
        sb4.append(AbstractC4489.m7777(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.f15942;
        sb4.append(i7);
        sb4.append(", max = ");
        sb4.append(this.f15941);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f15936.m6282());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f15939.m6282());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    /* JADX INFO: renamed from: ۥَ */
    public final void m8208(C1041 c1041, int i, int i2) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f15935;
            long j = atomicLongFieldUpdater.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objM2248 = c1041.m2248();
                    while (true) {
                        if (objM2248 == f15932) {
                            i3 = -1;
                            break;
                        }
                        if (objM2248 == null) {
                            i3 = 0;
                            break;
                        }
                        C1041 c1042 = (C1041) objM2248;
                        int iM2251 = c1042.m2251();
                        if (iM2251 != 0) {
                            i3 = iM2251;
                            break;
                        }
                        objM2248 = c1042.m2248();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                long j3 = j2 | ((long) i3);
                ExecutorC4838 executorC4838 = this;
                if (atomicLongFieldUpdater.compareAndSet(executorC4838, j, j3)) {
                    return;
                } else {
                    this = executorC4838;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final boolean m8209(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f15942;
        if (i < i2) {
            int iM8212 = m8212();
            if (iM8212 == 1 && i2 > 1) {
                m8212();
            }
            if (iM8212 > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final boolean m8210() {
        ExecutorC4838 executorC4838;
        C5536 c5536;
        int iM2251;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f15935;
            long j = atomicLongFieldUpdater.get(this);
            C1041 c1041 = (C1041) this.f15940.m2832((int) (2097151 & j));
            if (c1041 == null) {
                c1041 = null;
                executorC4838 = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objM2248 = c1041.m2248();
                while (true) {
                    c5536 = f15932;
                    if (objM2248 == c5536) {
                        iM2251 = -1;
                        break;
                    }
                    if (objM2248 == null) {
                        iM2251 = 0;
                        break;
                    }
                    C1041 c1042 = (C1041) objM2248;
                    iM2251 = c1042.m2251();
                    if (iM2251 != 0) {
                        break;
                    }
                    objM2248 = c1042.m2248();
                    atomicLongFieldUpdater = atomicLongFieldUpdater;
                    this = this;
                }
                if (iM2251 >= 0) {
                    ExecutorC4838 executorC4839 = this;
                    boolean zCompareAndSet = atomicLongFieldUpdater.compareAndSet(executorC4839, j, j2 | ((long) iM2251));
                    executorC4838 = executorC4839;
                    if (zCompareAndSet) {
                        c1041.m2256(c5536);
                    }
                    this = executorC4838;
                } else {
                    continue;
                }
            }
            if (c1041 == null) {
                return false;
            }
            if (C1041.f3675.compareAndSet(c1041, -1, 0)) {
                LockSupport.unpark(c1041);
                return true;
            }
            this = executorC4838;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m8211(Runnable runnable, boolean z, boolean z2) {
        AbstractRunnableC4045 c2326;
        int i;
        AbstractC3095.f10380.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC4045) {
            c2326 = (AbstractRunnableC4045) runnable;
            c2326.f13486 = jNanoTime;
            c2326.f13485 = z;
        } else {
            c2326 = new C2326(runnable, jNanoTime, z);
        }
        boolean z3 = c2326.f13485;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15933;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C1041 c1041 = threadCurrentThread instanceof C1041 ? (C1041) threadCurrentThread : null;
        if (c1041 == null || c1041.f3682 != this) {
            c1041 = null;
        }
        if (c1041 != null && (i = c1041.f3678) != 5 && (c2326.f13485 || i != 2)) {
            c1041.f3681 = true;
            C2685 c2685 = c1041.f3684;
            if (z2) {
                c2326 = c2685.m4993(c2326);
            } else {
                c2685.getClass();
                AbstractRunnableC4045 abstractRunnableC4045 = (AbstractRunnableC4045) AbstractC3456.f11473.getAndSetObject(c2685, C2685.f8908, c2326);
                c2326 = abstractRunnableC4045 == null ? null : c2685.m4993(abstractRunnableC4045);
            }
        }
        if (c2326 != null) {
            if (!(c2326.f13485 ? this.f15939.m6284(c2326) : this.f15936.m6284(c2326))) {
                throw new RejectedExecutionException(AbstractC3761.m6621(new StringBuilder(), this.f15938, " was terminated"));
            }
        }
        if (z3) {
            if (m8210() || m8209(jAddAndGet)) {
                return;
            }
            m8210();
            return;
        }
        if (m8210() || m8209(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m8210();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m8212() {
        synchronized (this.f15940) {
            try {
                if (f15934.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f15933;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f15942) {
                    return 0;
                }
                if (i >= this.f15941) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.f15940.m2832(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C1041 c1041 = new C1041(this, i3);
                this.f15940.m2831(i3, c1041);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                c1041.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
