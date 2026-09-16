package p000;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۥٍّۤؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2681 extends AbstractC5752 {

    /* JADX INFO: renamed from: ۥَ */
    public final C2600 f8899;

    public C2681(C2600 c2600) {
        this.f8899 = c2600;
    }

    @Override // p000.AbstractC5752
    /* JADX INFO: renamed from: ۦؚ */
    public final boolean mo922() {
        return true;
    }

    @Override // p000.AbstractC5752
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo923(Throwable th) throws C0768 {
        Unsafe unsafe;
        Unsafe unsafe2;
        AbstractC0386 abstractC0386 = this.f18969;
        if (abstractC0386 == null) {
            abstractC0386 = null;
        }
        C2600 c2600 = this.f8899;
        Throwable thMo3322 = c2600.mo3322(abstractC0386);
        if (c2600.m4896()) {
            C4437 c4437 = (C4437) c2600.f8691;
            long j = C4437.f14625;
            loop0: while (true) {
                Object objectVolatile = AbstractC3456.f11473.getObjectVolatile(c4437, j);
                C5536 c5536 = AbstractC5378.f17759;
                if (AbstractC3831.m6874(objectVolatile, c5536)) {
                    do {
                        unsafe = AbstractC3456.f11473;
                        if (unsafe.compareAndSwapObject(c4437, C4437.f14625, c5536, thMo3322)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(c4437, j) == c5536);
                } else {
                    if (objectVolatile instanceof Throwable) {
                        return;
                    }
                    do {
                        unsafe2 = AbstractC3456.f11473;
                        if (unsafe2.compareAndSwapObject(c4437, C4437.f14625, objectVolatile, (Object) null)) {
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(c4437, j) == objectVolatile);
                }
            }
        }
        c2600.mo3713(thMo3322);
        if (c2600.m4896()) {
            return;
        }
        c2600.m4900();
    }
}
