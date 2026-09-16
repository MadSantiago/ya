package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۦۥْؖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C5718 {

    /* JADX INFO: renamed from: ۥَ */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18813;

    /* JADX INFO: renamed from: ۥْ */
    public static final /* synthetic */ AtomicLongFieldUpdater f18814;

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ AtomicLongFieldUpdater f18815;

    /* JADX INFO: renamed from: ۥٖ */
    public static final /* synthetic */ long f18816;

    /* JADX INFO: renamed from: ۦٗ */
    public static final /* synthetic */ long f18817;

    /* JADX INFO: renamed from: ۦۛ */
    public static final /* synthetic */ long f18818;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C3032 f18819;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f18820;

    static {
        Unsafe unsafe = AbstractC3456.f11473;
        f18817 = unsafe.objectFieldOffset(C5718.class.getDeclaredField("head$volatile"));
        f18814 = AtomicLongFieldUpdater.newUpdater(C5718.class, "deqIdx$volatile");
        f18818 = unsafe.objectFieldOffset(C5718.class.getDeclaredField("tail$volatile"));
        f18815 = AtomicLongFieldUpdater.newUpdater(C5718.class, "enqIdx$volatile");
        f18813 = AtomicIntegerFieldUpdater.newUpdater(C5718.class, "_availablePermits$volatile");
        f18816 = unsafe.objectFieldOffset(C5718.class.getDeclaredField("_availablePermits$volatile"));
    }

    public C5718(int i) {
        this.f18820 = i;
        if (i <= 0) {
            C1078.m2273(AbstractC5078.m8670(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i < 0) {
            C1078.m2273(AbstractC5078.m8670(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        C4472 c4472 = new C4472(0L, null, 2);
        this.head$volatile = c4472;
        this.tail$volatile = c4472;
        this._availablePermits$volatile = i;
        this.f18819 = new C3032(9, this);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final Object m9531(AbstractC0772 abstractC0772) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = f18813;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.f18820;
        } while (andDecrement > i);
        C2358 c2358 = C2358.f7817;
        if (andDecrement <= 0) {
            C2600 c2600M3372 = AbstractC1605.m3372(AbstractC2776.m5232(abstractC0772));
            try {
                if (!m9533(c2600M3372)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i) {
                            if (andDecrement2 > 0) {
                                c2600M3372.mo3712(c2358, this.f18819);
                                break;
                            }
                            if (m9533(c2600M3372)) {
                                break;
                            }
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

    /* JADX INFO: renamed from: ۥُ */
    public final void m9532() {
        Unsafe unsafe;
        long j;
        int intVolatile;
        int i;
        Object objM6870;
        boolean z;
        Unsafe unsafe2;
        do {
            int andIncrement = f18813.getAndIncrement(this);
            int i2 = this.f18820;
            if (andIncrement >= i2) {
                do {
                    unsafe = AbstractC3456.f11473;
                    j = f18816;
                    intVolatile = unsafe.getIntVolatile(this, j);
                    i = this.f18820;
                    if (intVolatile <= i) {
                        break;
                    }
                } while (!unsafe.compareAndSwapInt(this, j, intVolatile, i));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            Unsafe unsafe3 = AbstractC3456.f11473;
            long j2 = f18817;
            C4472 c4472 = (C4472) unsafe3.getObjectVolatile(this, j2);
            long andIncrement2 = f18814.getAndIncrement(this);
            long j3 = andIncrement2 / ((long) AbstractC5566.f18375);
            C2175 c2175 = C2175.f7178;
            while (true) {
                objM6870 = AbstractC3831.m6870(c4472, j3, c2175);
                if (!AbstractC4593.m7987(objM6870)) {
                    AbstractC4971 abstractC4971M7971 = AbstractC4593.m7971(objM6870);
                    while (true) {
                        AbstractC4971 abstractC4971 = (AbstractC4971) AbstractC3456.f11473.getObjectVolatile(this, j2);
                        if (abstractC4971.f16448 >= abstractC4971M7971.f16448) {
                            break;
                        }
                        if (!abstractC4971M7971.m8356()) {
                            break;
                        }
                        do {
                            unsafe2 = AbstractC3456.f11473;
                            if (unsafe2.compareAndSwapObject(this, f18817, abstractC4971, abstractC4971M7971)) {
                                if (!abstractC4971.m8354()) {
                                    break;
                                }
                                abstractC4971.m3087();
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(this, j2) == abstractC4971);
                        if (abstractC4971M7971.m8354()) {
                            abstractC4971M7971.m3087();
                        }
                    }
                } else {
                    break;
                }
            }
            C4472 c4473 = (C4472) AbstractC4593.m7971(objM6870);
            c4473.m3086();
            AtomicReferenceArray atomicReferenceArray = c4473.f14749;
            z = false;
            if (c4473.f16448 <= j3) {
                int i3 = (int) (andIncrement2 % ((long) AbstractC5566.f18375));
                Object andSet = atomicReferenceArray.getAndSet(i3, AbstractC5566.f18376);
                if (andSet == null) {
                    int i4 = AbstractC5566.f18377;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i4) {
                            C5536 c5536 = AbstractC5566.f18376;
                            C5536 c5537 = AbstractC5566.f18378;
                            do {
                                if (atomicReferenceArray.compareAndSet(i3, c5536, c5537)) {
                                    z = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i3) == c5536);
                            z = !z;
                            break;
                        }
                        if (atomicReferenceArray.get(i3) == AbstractC5566.f18373) {
                            z = true;
                            break;
                        }
                        i5++;
                    }
                } else if (andSet != AbstractC5566.f18374) {
                    if (!(andSet instanceof InterfaceC4242)) {
                        C5028.m8449(andSet, "unexpected: ");
                        return;
                    }
                    InterfaceC4242 interfaceC4242 = (InterfaceC4242) andSet;
                    C5536 c5536Mo3711 = interfaceC4242.mo3711(C2358.f7817, this.f18819);
                    if (c5536Mo3711 != null) {
                        interfaceC4242.mo3710(c5536Mo3711);
                        z = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean m9533(InterfaceC2728 interfaceC2728) {
        Object objM6870;
        Unsafe unsafe;
        C5718 c5718 = this;
        Unsafe unsafe2 = AbstractC3456.f11473;
        long j = f18818;
        C4472 c4472 = (C4472) unsafe2.getObjectVolatile(c5718, j);
        long andIncrement = f18815.getAndIncrement(c5718);
        C1086 c1086 = C1086.f3794;
        long j2 = andIncrement / ((long) AbstractC5566.f18375);
        loop0: while (true) {
            objM6870 = AbstractC3831.m6870(c4472, j2, c1086);
            if (AbstractC4593.m7987(objM6870)) {
                break;
            }
            AbstractC4971 abstractC4971M7971 = AbstractC4593.m7971(objM6870);
            while (true) {
                AbstractC4971 abstractC4971 = (AbstractC4971) AbstractC3456.f11473.getObjectVolatile(c5718, j);
                if (abstractC4971.f16448 >= abstractC4971M7971.f16448) {
                    c5718 = this;
                    break loop0;
                }
                if (!abstractC4971M7971.m8356()) {
                    break;
                }
                do {
                    unsafe = AbstractC3456.f11473;
                    c5718 = this;
                    if (unsafe.compareAndSwapObject(c5718, f18818, abstractC4971, abstractC4971M7971)) {
                        if (!abstractC4971.m8354()) {
                            break loop0;
                        }
                        abstractC4971.m3087();
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(c5718, j) == abstractC4971);
                if (abstractC4971M7971.m8354()) {
                    abstractC4971M7971.m3087();
                }
            }
            c5718 = this;
        }
        C4472 c4473 = (C4472) AbstractC4593.m7971(objM6870);
        AtomicReferenceArray atomicReferenceArray = c4473.f14749;
        int i = (int) (andIncrement % ((long) AbstractC5566.f18375));
        while (!atomicReferenceArray.compareAndSet(i, null, interfaceC2728)) {
            if (atomicReferenceArray.get(i) != null) {
                C5536 c5536 = AbstractC5566.f18376;
                C5536 c5537 = AbstractC5566.f18373;
                while (!atomicReferenceArray.compareAndSet(i, c5536, c5537)) {
                    if (atomicReferenceArray.get(i) != c5536) {
                        return false;
                    }
                }
                ((InterfaceC4242) interfaceC2728).mo3712(C2358.f7817, c5718.f18819);
                return true;
            }
        }
        interfaceC2728.mo681(c4473, i);
        return true;
    }
}
