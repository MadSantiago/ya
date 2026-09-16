package p000;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۦؘؕؗؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C3491 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final /* synthetic */ long f11589 = AbstractC3456.f11473.objectFieldOffset(C3491.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new C5101(8, false);

    /* JADX INFO: renamed from: ۥؗ */
    public final int m6282() {
        C5101 c5101 = (C5101) AbstractC3456.f11473.getObjectVolatile(this, f11589);
        c5101.getClass();
        long longVolatile = AbstractC3456.f11473.getLongVolatile(c5101, C5101.f16937);
        return 1073741823 & (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile)));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m6283() {
        C3491 c3491;
        while (true) {
            Unsafe unsafe = AbstractC3456.f11473;
            long j = f11589;
            C5101 c5101 = (C5101) unsafe.getObjectVolatile(this, j);
            if (c5101.m8731()) {
                return;
            }
            C5101 c5101M8730 = c5101.m8730();
            while (true) {
                c3491 = this;
                if (AbstractC3456.f11473.compareAndSwapObject(c3491, f11589, c5101, c5101M8730) || AbstractC3456.f11473.getObjectVolatile(c3491, j) != c5101) {
                    break;
                } else {
                    this = c3491;
                }
            }
            this = c3491;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m6284(Runnable runnable) {
        C3491 c3491;
        while (true) {
            Unsafe unsafe = AbstractC3456.f11473;
            long j = f11589;
            C5101 c5101 = (C5101) unsafe.getObjectVolatile(this, j);
            int iM8732 = c5101.m8732(runnable);
            if (iM8732 == 0) {
                return true;
            }
            if (iM8732 == 1) {
                C5101 c5101M8730 = c5101.m8730();
                while (true) {
                    Unsafe unsafe2 = AbstractC3456.f11473;
                    c3491 = this;
                    if (unsafe2.compareAndSwapObject(c3491, f11589, c5101, c5101M8730) || unsafe2.getObjectVolatile(c3491, j) != c5101) {
                        break;
                    }
                    this = c3491;
                }
            } else {
                if (iM8732 == 2) {
                    return false;
                }
                c3491 = this;
            }
            this = c3491;
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final Object m6285() {
        C3491 c3491;
        while (true) {
            Unsafe unsafe = AbstractC3456.f11473;
            long j = f11589;
            C5101 c5101 = (C5101) unsafe.getObjectVolatile(this, j);
            Object objM8733 = c5101.m8733();
            if (objM8733 != C5101.f16935) {
                return objM8733;
            }
            C5101 c5101M8730 = c5101.m8730();
            while (true) {
                c3491 = this;
                if (AbstractC3456.f11473.compareAndSwapObject(c3491, f11589, c5101, c5101M8730) || AbstractC3456.f11473.getObjectVolatile(c3491, j) != c5101) {
                    break;
                }
                this = c3491;
            }
            this = c3491;
        }
    }
}
