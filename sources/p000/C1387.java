package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۥٕؒٞۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1387 extends C5718 implements InterfaceC3087 {

    /* JADX INFO: renamed from: ۥۖ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4741 = AtomicReferenceFieldUpdater.newUpdater(C1387.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: ۦٕ */
    public static final /* synthetic */ long f4742 = AbstractC3456.f11473.objectFieldOffset(C1387.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public C1387() {
        super(1);
        this.owner$volatile = AbstractC4554.f15049;
    }

    public final String toString() {
        return "Mutex@" + AbstractC4489.m7777(this) + "[isLocked=" + m2948() + ",owner=" + AbstractC3456.f11473.getObjectVolatile(this, f4742) + ']';
    }

    /* JADX INFO: renamed from: ۥّ */
    public final boolean m2948() {
        return Math.max(AbstractC3456.f11473.getIntVolatile(this, C5718.f18816), 0) == 0;
    }

    @Override // p000.InterfaceC3087
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo2949(AbstractC0772 abstractC0772) {
        boolean zM2951 = m2951();
        C2358 c2358 = C2358.f7817;
        if (!zM2951) {
            C2600 c2600M3372 = AbstractC1605.m3372(AbstractC2776.m5232(abstractC0772));
            try {
                C1863 c1863 = new C1863(this, c2600M3372);
                while (true) {
                    int andDecrement = C5718.f18813.getAndDecrement(this);
                    if (andDecrement <= this.f18820) {
                        if (andDecrement > 0) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4741;
                            C1387 c1387 = c1863.f6205;
                            atomicReferenceFieldUpdater.set(c1387, null);
                            C2600 c2600 = c1863.f6206;
                            c2600.m4910(c2358, c2600.f18326, new C3032(0, new C0091(22, c1387, c1863)));
                            break;
                        }
                        if (m9533(c1863)) {
                            break;
                        }
                    }
                }
                Object objM4909 = c2600M3372.m4909();
                EnumC2282 enumC2282 = EnumC2282.f7590;
                if (objM4909 != enumC2282) {
                    objM4909 = c2358;
                }
                if (objM4909 == enumC2282) {
                    return objM4909;
                }
            } catch (Throwable th) {
                c2600M3372.m4898();
                throw th;
            }
        }
        return c2358;
    }

    @Override // p000.InterfaceC3087
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2950(Object obj) {
        while (this.m2948()) {
            Unsafe unsafe = AbstractC3456.f11473;
            long j = f4742;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            C5536 c5536 = AbstractC4554.f15049;
            if (objectVolatile != c5536) {
                if (objectVolatile != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    C1387 c1387 = this;
                    if (AbstractC3456.f11473.compareAndSwapObject(c1387, f4742, objectVolatile, c5536)) {
                        c1387.m9532();
                        return;
                    } else {
                        if (AbstractC3456.f11473.getObjectVolatile(c1387, j) != objectVolatile) {
                            this = c1387;
                            break;
                        }
                        this = c1387;
                    }
                }
            }
        }
        C1078.m2276("This mutex is not locked");
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final boolean m2951() {
        C1387 c1387;
        while (true) {
            Unsafe unsafe = AbstractC3456.f11473;
            long j = C5718.f18816;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile > this.f18820) {
                while (true) {
                    Unsafe unsafe2 = AbstractC3456.f11473;
                    long j2 = C5718.f18816;
                    int intVolatile2 = unsafe2.getIntVolatile(this, j2);
                    int i = this.f18820;
                    if (intVolatile2 <= i) {
                        c1387 = this;
                        break;
                    }
                    C1387 c1388 = this;
                    c1387 = c1388;
                    if (unsafe2.compareAndSwapInt(c1388, j2, intVolatile2, i)) {
                        break;
                    }
                    this = c1387;
                }
            } else {
                c1387 = this;
                if (intVolatile <= 0) {
                    return false;
                }
                if (unsafe.compareAndSwapInt(c1387, j, intVolatile, intVolatile - 1)) {
                    unsafe.putObjectVolatile(c1387, f4742, (Object) null);
                    return true;
                }
            }
            this = c1387;
        }
    }
}
