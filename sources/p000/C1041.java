package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۥُؒۦۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1041 extends Thread {

    /* JADX INFO: renamed from: ۥۖ */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3675 = AtomicIntegerFieldUpdater.newUpdater(C1041.class, "workerCtl$volatile");

    /* JADX INFO: renamed from: ۦٕ */
    public static final /* synthetic */ long f3676 = AbstractC3456.f11473.objectFieldOffset(C1041.class.getDeclaredField("workerCtl$volatile"));
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX INFO: renamed from: ۥَ */
    public long f3677;

    /* JADX INFO: renamed from: ۥْ */
    public int f3678;

    /* JADX INFO: renamed from: ۥٓ */
    public long f3679;

    /* JADX INFO: renamed from: ۥٖ */
    public int f3680;

    /* JADX INFO: renamed from: ۦٗ */
    public boolean f3681;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ ExecutorC4838 f3682;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C5450 f3683;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2685 f3684;

    public C1041(ExecutorC4838 executorC4838, int i) {
        this.f3682 = executorC4838;
        setDaemon(true);
        setContextClassLoader(ExecutorC4838.class.getClassLoader());
        this.f3684 = new C2685();
        this.f3683 = new C5450();
        this.f3678 = 4;
        this.nextParkedWorker = ExecutorC4838.f15932;
        int iNanoTime = (int) System.nanoTime();
        this.f3680 = iNanoTime == 0 ? 42 : iNanoTime;
        m2250(i);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        loop0: while (true) {
            boolean z5 = z4;
            while (true) {
                if (ExecutorC4838.f15934.get(this.f3682) == 1 || this.f3678 == 5) {
                    break loop0;
                }
                AbstractRunnableC4045 abstractRunnableC4045M2253 = m2253(this.f3681);
                if (abstractRunnableC4045M2253 != null) {
                    this.f3677 = 0L;
                    ExecutorC4838 executorC4838 = this.f3682;
                    this.f3679 = 0L;
                    if (this.f3678 == 3) {
                        this.f3678 = 2;
                    }
                    if (!abstractRunnableC4045M2253.f13485) {
                        try {
                            abstractRunnableC4045M2253.run();
                            break;
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                            break;
                        }
                    }
                    if (m2252(2) && !executorC4838.m8210() && !executorC4838.m8209(ExecutorC4838.f15933.get(executorC4838))) {
                        executorC4838.m8210();
                    }
                    try {
                        abstractRunnableC4045M2253.run();
                    } catch (Throwable th2) {
                        Thread threadCurrentThread2 = Thread.currentThread();
                        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                    }
                    ExecutorC4838.f15933.addAndGet(executorC4838, -2097152L);
                    if (this.f3678 == 5) {
                        break;
                    }
                    this.f3678 = 4;
                    break;
                }
                this.f3681 = z4;
                if (this.f3677 == 0) {
                    Object obj = this.nextParkedWorker;
                    C5536 c5536 = ExecutorC4838.f15932;
                    if (obj != c5536) {
                        AbstractC3456.f11473.putIntVolatile(this, f3676, -1);
                        while (this.nextParkedWorker != ExecutorC4838.f15932) {
                            Unsafe unsafe = AbstractC3456.f11473;
                            long j = f3676;
                            if (unsafe.getIntVolatile(this, j) != -1) {
                                break;
                            }
                            ExecutorC4838 executorC4839 = this.f3682;
                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ExecutorC4838.f15934;
                            if (atomicIntegerFieldUpdater.get(executorC4839) == 1 || this.f3678 == 5) {
                                break;
                            }
                            m2252(3);
                            Thread.interrupted();
                            if (this.f3679 == 0) {
                                this.f3679 = System.nanoTime() + this.f3682.f15937;
                            }
                            LockSupport.parkNanos(this.f3682.f15937);
                            if (System.nanoTime() - this.f3679 >= 0) {
                                this.f3679 = 0L;
                                ExecutorC4838 executorC48310 = this.f3682;
                                synchronized (executorC48310.f15940) {
                                    try {
                                        if (!(atomicIntegerFieldUpdater.get(executorC48310) == 1)) {
                                            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC4838.f15933;
                                            if (((int) (atomicLongFieldUpdater.get(executorC48310) & 2097151)) > executorC48310.f15942 && unsafe.compareAndSwapInt(this, j, -1, 1)) {
                                                int i = this.indexInArray;
                                                z3 = false;
                                                m2250(0);
                                                executorC48310.m8208(this, i, 0);
                                                int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(executorC48310) & 2097151);
                                                if (andDecrement != i) {
                                                    C1041 c1041 = (C1041) executorC48310.f15940.m2832(andDecrement);
                                                    executorC48310.f15940.m2831(i, c1041);
                                                    c1041.m2250(i);
                                                    executorC48310.m8208(c1041, andDecrement, i);
                                                }
                                                executorC48310.f15940.m2831(andDecrement, null);
                                                this.f3678 = 5;
                                            }
                                        }
                                        z3 = false;
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            } else {
                                z3 = false;
                            }
                            z4 = z3;
                            z5 = z5;
                        }
                        z = z4;
                        z2 = z5;
                    } else {
                        z = z4;
                        z2 = z5;
                        ExecutorC4838 executorC48311 = this.f3682;
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC4838.f15935;
                        if (this.nextParkedWorker == c5536) {
                            while (true) {
                                long j2 = atomicLongFieldUpdater2.get(executorC48311);
                                int i2 = this.indexInArray;
                                this.nextParkedWorker = executorC48311.f15940.m2832((int) (j2 & 2097151));
                                long j3 = i2;
                                AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                                if (atomicLongFieldUpdater2.compareAndSet(executorC48311, j2, j3 | ((2097152 + j2) & (-2097152)))) {
                                    break;
                                } else {
                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                }
                            }
                        }
                    }
                    z4 = z;
                    z5 = z2;
                } else {
                    if (z5) {
                        m2252(3);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f3677);
                        this.f3677 = 0L;
                        break;
                    }
                    z5 = true;
                }
            }
        }
        m2252(5);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final Object m2248() {
        return this.nextParkedWorker;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final AbstractRunnableC4045 m2249() {
        int iM2254 = m2254(2);
        ExecutorC4838 executorC4838 = this.f3682;
        C2064 c2064 = executorC4838.f15939;
        C2064 c2065 = executorC4838.f15936;
        if (iM2254 == 0) {
            AbstractRunnableC4045 abstractRunnableC4045 = (AbstractRunnableC4045) c2065.m6285();
            return abstractRunnableC4045 != null ? abstractRunnableC4045 : (AbstractRunnableC4045) c2064.m6285();
        }
        AbstractRunnableC4045 abstractRunnableC4046 = (AbstractRunnableC4045) c2064.m6285();
        return abstractRunnableC4046 != null ? abstractRunnableC4046 : (AbstractRunnableC4045) c2065.m6285();
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m2250(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3682.f15938);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final int m2251() {
        return this.indexInArray;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final boolean m2252(int i) {
        int i2 = this.f3678;
        boolean z = i2 == 1;
        if (z) {
            ExecutorC4838.f15933.addAndGet(this.f3682, 4398046511104L);
        }
        if (i2 != i) {
            this.f3678 = i;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractRunnableC4045 m2253(boolean z) {
        AbstractRunnableC4045 abstractRunnableC4045M2249;
        AbstractRunnableC4045 abstractRunnableC4045M22410;
        long j;
        Unsafe unsafe;
        int i = this.f3678;
        ExecutorC4838 executorC4838 = this.f3682;
        AbstractRunnableC4045 abstractRunnableC4045 = null;
        C2685 c2685 = this.f3684;
        if (i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC4838.f15933;
            do {
                j = atomicLongFieldUpdater.get(executorC4838);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    c2685.getClass();
                    long j2 = C2685.f8908;
                    loop1: while (true) {
                        Unsafe unsafe2 = AbstractC3456.f11473;
                        AbstractRunnableC4045 abstractRunnableC4046 = (AbstractRunnableC4045) unsafe2.getObjectVolatile(c2685, j2);
                        if (abstractRunnableC4046 == null || !abstractRunnableC4046.f13485) {
                            int intVolatile = unsafe2.getIntVolatile(c2685, C2685.f8907);
                            int intVolatile2 = unsafe2.getIntVolatile(c2685, C2685.f8911);
                            while (intVolatile != intVolatile2 && AbstractC3456.f11473.getIntVolatile(c2685, C2685.f8910) != 0) {
                                intVolatile2--;
                                AbstractRunnableC4045 abstractRunnableC4045M4994 = c2685.m4994(intVolatile2, true);
                                if (abstractRunnableC4045M4994 != null) {
                                    abstractRunnableC4045 = abstractRunnableC4045M4994;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            unsafe = AbstractC3456.f11473;
                            if (unsafe.compareAndSwapObject(c2685, C2685.f8908, abstractRunnableC4046, (Object) null)) {
                                abstractRunnableC4045 = abstractRunnableC4046;
                                break loop1;
                            }
                        } while (unsafe.getObjectVolatile(c2685, j2) == abstractRunnableC4046);
                    }
                    if (abstractRunnableC4045 != null) {
                        return abstractRunnableC4045;
                    }
                    AbstractRunnableC4045 abstractRunnableC4047 = (AbstractRunnableC4045) executorC4838.f15939.m6285();
                    return abstractRunnableC4047 == null ? m2255(1) : abstractRunnableC4047;
                }
            } while (!ExecutorC4838.f15933.compareAndSet(executorC4838, j, j - 4398046511104L));
            this.f3678 = 1;
        }
        if (z) {
            boolean z2 = m2254(executorC4838.f15942 * 2) == 0;
            if (z2 && (abstractRunnableC4045M22410 = m2249()) != null) {
                return abstractRunnableC4045M22410;
            }
            c2685.getClass();
            AbstractRunnableC4045 abstractRunnableC4045M4991 = (AbstractRunnableC4045) AbstractC3456.f11473.getAndSetObject(c2685, C2685.f8908, (Object) null);
            if (abstractRunnableC4045M4991 == null) {
                abstractRunnableC4045M4991 = c2685.m4991();
            }
            if (abstractRunnableC4045M4991 != null) {
                return abstractRunnableC4045M4991;
            }
            if (!z2 && (abstractRunnableC4045M2249 = m2249()) != null) {
                return abstractRunnableC4045M2249;
            }
        } else {
            AbstractRunnableC4045 abstractRunnableC4045M22411 = m2249();
            if (abstractRunnableC4045M22411 != null) {
                return abstractRunnableC4045M22411;
            }
        }
        return m2255(3);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final int m2254(int i) {
        int i2 = this.f3680;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f3680 = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final AbstractRunnableC4045 m2255(int i) {
        int i2;
        long j;
        AbstractRunnableC4045 abstractRunnableC4045M4991;
        long j2;
        long j3;
        Unsafe unsafe;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC4838.f15933;
        ExecutorC4838 executorC4838 = this.f3682;
        int i3 = (int) (atomicLongFieldUpdater.get(executorC4838) & 2097151);
        AbstractRunnableC4045 abstractRunnableC4045 = null;
        if (i3 < 2) {
            return null;
        }
        int iM2254 = m2254(i3);
        int i4 = 0;
        long jMin = Long.MAX_VALUE;
        while (i4 < i3) {
            iM2254++;
            if (iM2254 > i3) {
                iM2254 = 1;
            }
            C1041 c1041 = (C1041) executorC4838.f15940.m2832(iM2254);
            if (c1041 == null || c1041 == this) {
                i2 = i3;
            } else {
                C2685 c2685 = c1041.f3684;
                c2685.getClass();
                if (i != 3) {
                    boolean z = i == 1;
                    Unsafe unsafe2 = AbstractC3456.f11473;
                    j = 0;
                    int intVolatile = unsafe2.getIntVolatile(c2685, C2685.f8907);
                    int intVolatile2 = unsafe2.getIntVolatile(c2685, C2685.f8911);
                    while (true) {
                        if (intVolatile != intVolatile2) {
                            if (z) {
                                i2 = i3;
                                if (AbstractC3456.f11473.getIntVolatile(c2685, C2685.f8910) == 0) {
                                }
                            } else {
                                i2 = i3;
                            }
                            int i5 = intVolatile + 1;
                            AbstractRunnableC4045 abstractRunnableC4045M4994 = c2685.m4994(intVolatile, z);
                            if (abstractRunnableC4045M4994 != null) {
                                abstractRunnableC4045M4991 = abstractRunnableC4045M4994;
                                break;
                            }
                            intVolatile = i5;
                            i3 = i2;
                        } else {
                            i2 = i3;
                        }
                        abstractRunnableC4045M4991 = abstractRunnableC4045;
                        break;
                    }
                } else {
                    abstractRunnableC4045M4991 = c2685.m4991();
                    i2 = i3;
                    j = 0;
                }
                C5450 c5450 = this.f3683;
                if (abstractRunnableC4045M4991 == null) {
                    j2 = -1;
                    long j4 = C2685.f8908;
                    while (true) {
                        AbstractRunnableC4045 abstractRunnableC4046 = (AbstractRunnableC4045) AbstractC3456.f11473.getObjectVolatile(c2685, j4);
                        if (abstractRunnableC4046 != null) {
                            if (((abstractRunnableC4046.f13485 ? 1 : 2) & i) != 0) {
                                AbstractC3095.f10380.getClass();
                                C2685 c2686 = c2685;
                                long jNanoTime = System.nanoTime() - abstractRunnableC4046.f13486;
                                long j5 = AbstractC3095.f10381;
                                if (jNanoTime < j5) {
                                    j3 = j5 - jNanoTime;
                                    break;
                                }
                                do {
                                    unsafe = AbstractC3456.f11473;
                                    if (unsafe.compareAndSwapObject(c2686, C2685.f8908, abstractRunnableC4046, (Object) null)) {
                                        c5450.f17965 = abstractRunnableC4046;
                                        j3 = -1;
                                        break;
                                    }
                                } while (unsafe.getObjectVolatile(c2686, j4) == abstractRunnableC4046);
                                c2685 = c2686;
                            }
                        }
                        j3 = -2;
                        break;
                    }
                } else {
                    c5450.f17965 = abstractRunnableC4045M4991;
                    j3 = -1;
                    j2 = -1;
                }
                if (j3 == j2) {
                    AbstractRunnableC4045 abstractRunnableC4047 = (AbstractRunnableC4045) c5450.f17965;
                    c5450.f17965 = null;
                    return abstractRunnableC4047;
                }
                if (j3 > j) {
                    jMin = Math.min(jMin, j3);
                }
            }
            i4++;
            i3 = i2;
            abstractRunnableC4045 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f3677 = jMin;
        return null;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m2256(Object obj) {
        this.nextParkedWorker = obj;
    }
}
