package p000;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۥٚۨٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1755 extends C5555 {

    /* JADX INFO: renamed from: ۥَ */
    public static final /* synthetic */ long f5847 = AbstractC3456.f11473.objectFieldOffset(C1755.class.getDeclaredField("_decision$volatile"));
    private volatile /* synthetic */ int _decision$volatile;

    @Override // p000.C5555, p000.AbstractC0386
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo882(Object obj) throws C0768 {
        mo888(obj);
    }

    @Override // p000.C5555, p000.AbstractC0386
    /* JADX INFO: renamed from: ۦۚ */
    public final void mo888(Object obj) throws C0768 {
        while (true) {
            Unsafe unsafe = AbstractC3456.f11473;
            long j = f5847;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1) {
                    AbstractC5378.m9066(AbstractC2776.m5232(this.f18337), AbstractC0186.m430(obj));
                    return;
                } else {
                    C1078.m2276("Already resumed");
                    return;
                }
            }
            C1755 c1755 = this;
            if (unsafe.compareAndSwapInt(c1755, j, 0, 2)) {
                return;
            } else {
                this = c1755;
            }
        }
    }
}
