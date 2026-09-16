package p000;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۥًؔؗٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0414 extends AbstractC5752 {

    /* JADX INFO: renamed from: ۦٗ */
    public static final /* synthetic */ long f1503 = AbstractC3456.f11473.objectFieldOffset(C0414.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: ۥَ */
    public final Thread f1504 = Thread.currentThread();

    /* JADX INFO: renamed from: ۥٖ */
    public InterfaceC4883 f1505;

    /* JADX INFO: renamed from: ۦۨ */
    public static void m921(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // p000.AbstractC5752
    /* JADX INFO: renamed from: ۦؚ */
    public final boolean mo922() {
        return true;
    }

    @Override // p000.AbstractC5752
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo923(Throwable th) {
        while (true) {
            Unsafe unsafe = AbstractC3456.f11473;
            long j = f1503;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1 || intVolatile == 2 || intVolatile == 3) {
                    return;
                }
                m921(intVolatile);
                throw null;
            }
            C0414 c0414 = this;
            if (unsafe.compareAndSwapInt(c0414, f1503, intVolatile, 2)) {
                c0414.f1504.interrupt();
                unsafe.putIntVolatile(c0414, j, 3);
                return;
            }
            this = c0414;
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final void m924() {
        C0414 c0414;
        while (true) {
            Unsafe unsafe = AbstractC3456.f11473;
            long j = f1503;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == 0) {
                c0414 = this;
                if (unsafe.compareAndSwapInt(c0414, j, intVolatile, 1)) {
                    InterfaceC4883 interfaceC4883 = c0414.f1505;
                    if (interfaceC4883 != null) {
                        interfaceC4883.mo1376();
                        return;
                    }
                    return;
                }
            } else {
                if (intVolatile != 2) {
                    if (intVolatile == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m921(intVolatile);
                        throw null;
                    }
                }
                c0414 = this;
            }
            this = c0414;
        }
    }
}
