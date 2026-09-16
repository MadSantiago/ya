package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۦۗؕۖٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4971 extends AbstractC1469 implements InterfaceC2979 {

    /* JADX INFO: renamed from: ۥُ */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f16446 = AtomicIntegerFieldUpdater.newUpdater(AbstractC4971.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: ۥّ */
    public static final /* synthetic */ long f16447 = AbstractC3456.f11473.objectFieldOffset(AbstractC4971.class.getDeclaredField("cleanedAndPointers$volatile"));
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f16448;

    public AbstractC4971(long j, AbstractC4971 abstractC4971, int i) {
        super(abstractC4971);
        this.f16448 = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // p000.AbstractC1469
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo3084() {
        return AbstractC3456.f11473.getIntVolatile(this, f16447) == mo7620() && m3085() != null;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final boolean m8354() {
        return f16446.addAndGet(this, -65536) == mo7620() && m3085() != null;
    }

    /* JADX INFO: renamed from: ۥّ */
    public abstract int mo7620();

    /* JADX INFO: renamed from: ۥۜ */
    public final void m8355() {
        if (f16446.incrementAndGet(this) == mo7620()) {
            m3087();
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final boolean m8356() {
        while (true) {
            Unsafe unsafe = AbstractC3456.f11473;
            long j = f16447;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == this.mo7620() && this.m3085() != null) {
                return false;
            }
            AbstractC4971 abstractC4971 = this;
            if (unsafe.compareAndSwapInt(abstractC4971, j, intVolatile, intVolatile + 65536)) {
                return true;
            }
            this = abstractC4971;
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public abstract void mo7625(int i, InterfaceC3534 interfaceC3534);
}
