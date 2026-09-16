package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: ۥٌؙؑؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0698 extends AbstractC2132 implements InterfaceC1312 {

    /* JADX INFO: renamed from: ۦٗ */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2532 = AtomicIntegerFieldUpdater.newUpdater(C0698.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: ۦۛ */
    public static final /* synthetic */ long f2533 = AbstractC3456.f11473.objectFieldOffset(C0698.class.getDeclaredField("runningWorkers$volatile"));
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: ۥَ */
    public final C3491 f2534;

    /* JADX INFO: renamed from: ۥْ */
    public final AbstractC2132 f2535;

    /* JADX INFO: renamed from: ۥٓ */
    public final int f2536;

    /* JADX INFO: renamed from: ۥٖ */
    public final Object f2537;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC1312 f2538;

    /* JADX WARN: Multi-variable type inference failed */
    public C0698(AbstractC2132 abstractC2132, int i) {
        InterfaceC1312 interfaceC1312 = abstractC2132 instanceof InterfaceC1312 ? (InterfaceC1312) abstractC2132 : null;
        this.f2538 = interfaceC1312 == null ? AbstractC4195.f13945 : interfaceC1312;
        this.f2535 = abstractC2132;
        this.f2536 = i;
        this.f2534 = new C3491();
        this.f2537 = new Object();
    }

    @Override // p000.AbstractC2132
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2535);
        sb.append(".limitedParallelism(");
        return AbstractC3761.m6638(sb, this.f2536, ')');
    }

    @Override // p000.AbstractC2132
    /* JADX INFO: renamed from: ۥؙ */
    public final void mo1465(InterfaceC3534 interfaceC3534, Runnable runnable) {
        Runnable runnableM1550;
        this.f2534.m6284(runnable);
        if (AbstractC3456.f11473.getIntVolatile(this, f2533) >= this.f2536 || !m1551() || (runnableM1550 = m1550()) == null) {
            return;
        }
        try {
            this.f2535.mo1465(this, new RunnableC4985(9, this, runnableM1550, false));
        } catch (Throwable th) {
            f2532.decrementAndGet(this);
            throw th;
        }
    }

    @Override // p000.AbstractC2132
    /* JADX INFO: renamed from: ۥؚ */
    public final void mo1466(InterfaceC3534 interfaceC3534, Runnable runnable) {
        Runnable runnableM1550;
        this.f2534.m6284(runnable);
        if (AbstractC3456.f11473.getIntVolatile(this, f2533) >= this.f2536 || !m1551() || (runnableM1550 = m1550()) == null) {
            return;
        }
        try {
            AbstractC5378.m9042(this.f2535, this, new RunnableC4985(9, this, runnableM1550, false));
        } catch (Throwable th) {
            f2532.decrementAndGet(this);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥۥ */
    public final Runnable m1550() {
        while (true) {
            Runnable runnable = (Runnable) this.f2534.m6285();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f2537) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2532;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f2534.m6282() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۨ */
    public final boolean m1551() {
        synchronized (this.f2537) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2532;
            if (AbstractC3456.f11473.getIntVolatile(this, f2533) >= this.f2536) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // p000.InterfaceC1312
    /* JADX INFO: renamed from: ۦٚ */
    public final InterfaceC4883 mo1552(long j, Runnable runnable, InterfaceC3534 interfaceC3534) {
        return this.f2538.mo1552(j, runnable, interfaceC3534);
    }

    @Override // p000.InterfaceC1312
    /* JADX INFO: renamed from: ۦ۟ */
    public final void mo1553(long j, C2600 c2600) {
        this.f2538.mo1553(j, c2600);
    }
}
