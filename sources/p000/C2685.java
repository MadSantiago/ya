package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۥۤؖ٘ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2685 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8906;

    /* JADX INFO: renamed from: ۥُ */
    public static final /* synthetic */ long f8907;

    /* JADX INFO: renamed from: ۥّ */
    public static final /* synthetic */ long f8908;

    /* JADX INFO: renamed from: ۥۗ */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8909;

    /* JADX INFO: renamed from: ۦؑ */
    public static final /* synthetic */ long f8910;

    /* JADX INFO: renamed from: ۦۙ */
    public static final /* synthetic */ long f8911;
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: ۥۣ */
    public final AtomicReferenceArray f8912 = new AtomicReferenceArray(128);

    static {
        Unsafe unsafe = AbstractC3456.f11473;
        f8908 = unsafe.objectFieldOffset(C2685.class.getDeclaredField("lastScheduledTask$volatile"));
        f8909 = AtomicIntegerFieldUpdater.newUpdater(C2685.class, "producerIndex$volatile");
        f8911 = unsafe.objectFieldOffset(C2685.class.getDeclaredField("producerIndex$volatile"));
        f8907 = unsafe.objectFieldOffset(C2685.class.getDeclaredField("consumerIndex$volatile"));
        f8906 = AtomicIntegerFieldUpdater.newUpdater(C2685.class, "blockingTasksInBuffer$volatile");
        f8910 = unsafe.objectFieldOffset(C2685.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractRunnableC4045 m4991() {
        AbstractRunnableC4045 abstractRunnableC4045;
        while (true) {
            Unsafe unsafe = AbstractC3456.f11473;
            long j = f8907;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, f8911) == 0) {
                return null;
            }
            int i = intVolatile & 127;
            C2685 c2685 = this;
            if (unsafe.compareAndSwapInt(c2685, j, intVolatile, intVolatile + 1) && (abstractRunnableC4045 = (AbstractRunnableC4045) c2685.f8912.getAndSet(i, null)) != null) {
                if (abstractRunnableC4045.f13485) {
                    f8906.decrementAndGet(c2685);
                }
                return abstractRunnableC4045;
            }
            this = c2685;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final int m4992() {
        return AbstractC3456.f11473.getIntVolatile(this, f8911) - AbstractC3456.f11473.getIntVolatile(this, f8907);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractRunnableC4045 m4993(AbstractRunnableC4045 abstractRunnableC4045) {
        if (m4992() == 127) {
            return abstractRunnableC4045;
        }
        if (abstractRunnableC4045.f13485) {
            f8906.incrementAndGet(this);
        }
        int intVolatile = AbstractC3456.f11473.getIntVolatile(this, f8911) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f8912;
            if (atomicReferenceArray.get(intVolatile) == null) {
                atomicReferenceArray.lazySet(intVolatile, abstractRunnableC4045);
                f8909.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractRunnableC4045 m4994(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f8912;
        AbstractRunnableC4045 abstractRunnableC4045 = (AbstractRunnableC4045) atomicReferenceArray.get(i2);
        if (abstractRunnableC4045 != null && abstractRunnableC4045.f13485 == z) {
            while (!atomicReferenceArray.compareAndSet(i2, abstractRunnableC4045, null)) {
                if (atomicReferenceArray.get(i2) != abstractRunnableC4045) {
                }
            }
            if (z) {
                f8906.decrementAndGet(this);
            }
            return abstractRunnableC4045;
        }
        return null;
    }
}
