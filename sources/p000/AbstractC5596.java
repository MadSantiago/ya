package p000;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۦۣؓ۠ٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5596 extends AbstractC2132 implements InterfaceC1312 {

    /* JADX INFO: renamed from: ۥَ */
    public static final /* synthetic */ long f18439;

    /* JADX INFO: renamed from: ۥٖ */
    public static final /* synthetic */ long f18440;

    /* JADX INFO: renamed from: ۦٗ */
    public static final /* synthetic */ long f18441;

    /* JADX INFO: renamed from: ۦۛ */
    public static final /* synthetic */ int f18442 = 0;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: ۥْ */
    public boolean f18443;

    /* JADX INFO: renamed from: ۥٓ */
    public C5219 f18444;

    /* JADX INFO: renamed from: ۦ۟ */
    public long f18445;

    static {
        Unsafe unsafe = AbstractC3456.f11473;
        f18441 = unsafe.objectFieldOffset(AbstractC5596.class.getDeclaredField("_queue$volatile"));
        f18439 = unsafe.objectFieldOffset(AbstractC5596.class.getDeclaredField("_delayed$volatile"));
        f18440 = unsafe.objectFieldOffset(AbstractC5596.class.getDeclaredField("_isCompleted$volatile"));
    }

    public void shutdown() {
        C5536 c5536;
        Unsafe unsafe;
        AbstractRunnableC1169 abstractRunnableC1169M5433;
        AbstractC4253.f14094.set(null);
        AbstractC3456.f11473.putIntVolatile(this, f18440, 1);
        C5536 c5537 = AbstractC0487.f1772;
        long j = f18441;
        loop0: while (true) {
            Object objectVolatile = AbstractC3456.f11473.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe2 = AbstractC3456.f11473;
                    c5536 = c5537;
                    if (unsafe2.compareAndSwapObject(this, f18441, (Object) null, c5537)) {
                        break loop0;
                    } else if (unsafe2.getObjectVolatile(this, j) != null) {
                        break;
                    } else {
                        c5537 = c5536;
                    }
                }
                c5537 = c5536;
            } else {
                c5536 = c5537;
                if (objectVolatile instanceof C5101) {
                    ((C5101) objectVolatile).m8731();
                    break;
                }
                if (objectVolatile == c5536) {
                    break;
                }
                C5101 c5101 = new C5101(8, true);
                c5101.m8732((Runnable) objectVolatile);
                do {
                    unsafe = AbstractC3456.f11473;
                    if (unsafe.compareAndSwapObject(this, f18441, objectVolatile, c5101)) {
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                c5537 = c5536;
            }
        }
        while (m9445() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C4041 c4041 = (C4041) AbstractC3456.f11473.getObjectVolatile(this, f18439);
            if (c4041 == null) {
                return;
            }
            synchronized (c4041) {
                abstractRunnableC1169M5433 = c4041.m5434() > 0 ? c4041.m5433(0) : null;
            }
            if (abstractRunnableC1169M5433 == null) {
                return;
            } else {
                mo2411(jNanoTime, abstractRunnableC1169M5433);
            }
        }
    }

    @Override // p000.AbstractC2132
    /* JADX INFO: renamed from: ۥؚ */
    public final void mo1466(InterfaceC3534 interfaceC3534, Runnable runnable) {
        mo2413(runnable);
    }

    /* JADX INFO: renamed from: ۥِ */
    public final void m9439() {
        AbstractRunnableC1169 abstractRunnableC1169M5433;
        C4041 c4041 = (C4041) AbstractC3456.f11473.getObjectVolatile(this, f18439);
        if (c4041 == null || c4041.m5434() == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (c4041) {
                try {
                    AbstractRunnableC1169[] abstractRunnableC1169Arr = c4041.f9584;
                    abstractRunnableC1169M5433 = null;
                    AbstractRunnableC1169 abstractRunnableC1169 = abstractRunnableC1169Arr != null ? abstractRunnableC1169Arr[0] : null;
                    if (abstractRunnableC1169 != null) {
                        if (jNanoTime - abstractRunnableC1169.f4056 >= 0 ? m9440(abstractRunnableC1169) : false) {
                            abstractRunnableC1169M5433 = c4041.m5433(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (abstractRunnableC1169M5433 != null);
    }

    /* JADX INFO: renamed from: ۥٞ */
    public void mo2411(long j, AbstractRunnableC1169 abstractRunnableC1169) {
        RunnableC1153.f4006.m9447(j, abstractRunnableC1169);
    }

    /* JADX INFO: renamed from: ۥۘ */
    public final boolean m9440(Runnable runnable) {
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe unsafe3;
        while (true) {
            Unsafe unsafe4 = AbstractC3456.f11473;
            long j = f18441;
            Object objectVolatile = unsafe4.getObjectVolatile(this, j);
            if (unsafe4.getIntVolatile(this, f18440) == 1) {
                return false;
            }
            if (objectVolatile == null) {
                do {
                    unsafe = AbstractC3456.f11473;
                    if (unsafe.compareAndSwapObject(this, f18441, (Object) null, runnable)) {
                        return true;
                    }
                } while (unsafe.getObjectVolatile(this, j) == null);
            } else if (objectVolatile instanceof C5101) {
                C5101 c5101 = (C5101) objectVolatile;
                int iM8732 = c5101.m8732(runnable);
                if (iM8732 == 0) {
                    return true;
                }
                if (iM8732 == 1) {
                    C5101 c5101M8730 = c5101.m8730();
                    do {
                        unsafe2 = AbstractC3456.f11473;
                        if (unsafe2.compareAndSwapObject(this, f18441, objectVolatile, c5101M8730)) {
                            break;
                        }
                    } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
                } else if (iM8732 == 2) {
                    return false;
                }
            } else {
                if (objectVolatile == AbstractC0487.f1772) {
                    return false;
                }
                C5101 c5102 = new C5101(8, true);
                c5102.m8732((Runnable) objectVolatile);
                c5102.m8732(runnable);
                do {
                    unsafe3 = AbstractC3456.f11473;
                    if (unsafe3.compareAndSwapObject(this, f18441, objectVolatile, c5102)) {
                        return true;
                    }
                } while (unsafe3.getObjectVolatile(this, j) == objectVolatile);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۢ */
    public final void m9441(boolean z) {
        this.f18445 = (z ? 4294967296L : 1L) + this.f18445;
        if (z) {
            return;
        }
        this.f18443 = true;
    }

    /* JADX INFO: renamed from: ۥۥ */
    public final void m9442(boolean z) {
        long j = this.f18445 - (z ? 4294967296L : 1L);
        this.f18445 = j;
        if (j <= 0 && this.f18443) {
            shutdown();
        }
    }

    /* JADX INFO: renamed from: ۥۨ */
    public final void m9443(AbstractC5549 abstractC5549) {
        C5219 c5219 = this.f18444;
        if (c5219 == null) {
            c5219 = new C5219();
            this.f18444 = c5219;
        }
        c5219.addLast(abstractC5549);
    }

    /* JADX INFO: renamed from: ۦ */
    public final boolean m9444() {
        C5219 c5219 = this.f18444;
        if (c5219 != null ? c5219.isEmpty() : true) {
            Unsafe unsafe = AbstractC3456.f11473;
            C4041 c4041 = (C4041) unsafe.getObjectVolatile(this, f18439);
            if (c4041 != null && c4041.m5434() != 0) {
                return false;
            }
            Object objectVolatile = unsafe.getObjectVolatile(this, f18441);
            if (objectVolatile != null) {
                if (objectVolatile instanceof C5101) {
                    long longVolatile = unsafe.getLongVolatile((C5101) objectVolatile, C5101.f16937);
                    return ((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == AbstractC0487.f1772) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦؔ */
    public abstract Thread mo2412();

    /* JADX INFO: renamed from: ۦٝ */
    public final long m9445() {
        Unsafe unsafe;
        AbstractC5596 abstractC5596;
        Unsafe unsafe2;
        Runnable runnable;
        AbstractRunnableC1169 abstractRunnableC1169;
        C5536 c5536 = AbstractC0487.f1772;
        long j = f18441;
        if (!m9446()) {
            m9439();
            loop0: while (true) {
                unsafe = AbstractC3456.f11473;
                Object objectVolatile = unsafe.getObjectVolatile(this, j);
                if (objectVolatile == null) {
                    abstractC5596 = this;
                } else if (objectVolatile instanceof C5101) {
                    C5101 c5101 = (C5101) objectVolatile;
                    Object objM8733 = c5101.m8733();
                    if (objM8733 != C5101.f16935) {
                        Runnable runnable2 = (Runnable) objM8733;
                        abstractC5596 = this;
                        runnable = runnable2;
                        unsafe2 = unsafe;
                        break;
                    }
                    C5101 c5101M8730 = c5101.m8730();
                    while (true) {
                        Unsafe unsafe3 = AbstractC3456.f11473;
                        abstractC5596 = this;
                        if (unsafe3.compareAndSwapObject(abstractC5596, f18441, objectVolatile, c5101M8730) || unsafe3.getObjectVolatile(abstractC5596, j) != objectVolatile) {
                            break;
                        }
                        this = abstractC5596;
                    }
                    this = abstractC5596;
                } else {
                    abstractC5596 = this;
                    if (objectVolatile != c5536) {
                        do {
                            unsafe2 = AbstractC3456.f11473;
                            if (unsafe2.compareAndSwapObject(abstractC5596, f18441, objectVolatile, (Object) null)) {
                                runnable = (Runnable) objectVolatile;
                                unsafe = unsafe2;
                                break loop0;
                            }
                        } while (unsafe2.getObjectVolatile(abstractC5596, j) == objectVolatile);
                        this = abstractC5596;
                    }
                }
                unsafe2 = unsafe;
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            C5219 c5219 = abstractC5596.f18444;
            if (((c5219 == null || c5219.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object objectVolatile2 = unsafe.getObjectVolatile(abstractC5596, j);
                if (objectVolatile2 != null) {
                    if (objectVolatile2 instanceof C5101) {
                        long longVolatile = unsafe2.getLongVolatile((C5101) objectVolatile2, C5101.f16937);
                        if (((int) (1073741823 & longVolatile)) != ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (objectVolatile2 == c5536) {
                        return Long.MAX_VALUE;
                    }
                }
                C4041 c4041 = (C4041) unsafe.getObjectVolatile(abstractC5596, f18439);
                if (c4041 != null) {
                    synchronized (c4041) {
                        AbstractRunnableC1169[] abstractRunnableC1169Arr = c4041.f9584;
                        abstractRunnableC1169 = abstractRunnableC1169Arr != null ? abstractRunnableC1169Arr[0] : null;
                    }
                    if (abstractRunnableC1169 != null) {
                        long jNanoTime = abstractRunnableC1169.f4056 - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦٞ */
    public final boolean m9446() {
        C5219 c5219 = this.f18444;
        if (c5219 == null) {
            return false;
        }
        AbstractC5549 abstractC5549 = (AbstractC5549) (c5219.isEmpty() ? null : c5219.removeFirst());
        if (abstractC5549 == null) {
            return false;
        }
        abstractC5549.run();
        return true;
    }

    /* JADX INFO: renamed from: ۦٟ */
    public final void m9447(long j, AbstractRunnableC1169 abstractRunnableC1169) {
        AbstractC5596 abstractC5596;
        int iM2492;
        Unsafe unsafe;
        Thread threadMo2412;
        long j2 = f18439;
        Unsafe unsafe2 = AbstractC3456.f11473;
        if (unsafe2.getIntVolatile(this, f18440) == 1) {
            abstractC5596 = this;
            iM2492 = 1;
        } else {
            C4041 c4041 = (C4041) unsafe2.getObjectVolatile(this, j2);
            if (c4041 == null) {
                C4041 c4042 = new C4041();
                c4042.f13480 = j;
                while (true) {
                    unsafe = AbstractC3456.f11473;
                    abstractC5596 = this;
                    if (unsafe.compareAndSwapObject(abstractC5596, f18439, (Object) null, c4042) || unsafe.getObjectVolatile(abstractC5596, j2) != null) {
                        break;
                    } else {
                        this = abstractC5596;
                    }
                }
                c4041 = (C4041) unsafe.getObjectVolatile(abstractC5596, j2);
                unsafe2 = unsafe;
            } else {
                abstractC5596 = this;
            }
            iM2492 = abstractRunnableC1169.m2492(j, c4041, abstractC5596);
        }
        if (iM2492 != 0) {
            if (iM2492 == 1) {
                abstractC5596.mo2411(j, abstractRunnableC1169);
                return;
            } else {
                if (iM2492 == 2) {
                    return;
                }
                C1078.m2276("unexpected result");
                return;
            }
        }
        C4041 c4043 = (C4041) unsafe2.getObjectVolatile(abstractC5596, j2);
        AbstractRunnableC1169 abstractRunnableC11610 = null;
        if (c4043 != null) {
            synchronized (c4043) {
                AbstractRunnableC1169[] abstractRunnableC1169Arr = c4043.f9584;
                abstractRunnableC11610 = abstractRunnableC1169Arr != null ? abstractRunnableC1169Arr[0] : null;
            }
        }
        if (abstractRunnableC11610 != abstractRunnableC1169 || Thread.currentThread() == (threadMo2412 = abstractC5596.mo2412())) {
            return;
        }
        LockSupport.unpark(threadMo2412);
    }

    @Override // p000.InterfaceC1312
    /* JADX INFO: renamed from: ۦ۟ */
    public final void mo1553(long j, C2600 c2600) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            C0815 c0815 = new C0815(this, j2 + jNanoTime, c2600);
            m9447(jNanoTime, c0815);
            c2600.m4902(new C3011(2, c0815));
        }
    }

    /* JADX INFO: renamed from: ۦ۠ */
    public void mo2413(Runnable runnable) {
        m9439();
        if (!m9440(runnable)) {
            RunnableC1153.f4006.mo2413(runnable);
            return;
        }
        Thread threadMo2412 = mo2412();
        if (Thread.currentThread() != threadMo2412) {
            LockSupport.unpark(threadMo2412);
        }
    }
}
