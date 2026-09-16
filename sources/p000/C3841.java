package p000;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۦَؔ٘ؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C3841 extends AbstractC0386 {

    /* JADX INFO: renamed from: ۥْ */
    public final boolean f12857;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    public C3841(InterfaceC3196 interfaceC3196) {
        super(true);
        boolean z = true;
        m872(interfaceC3196);
        Unsafe unsafe = AbstractC3456.f11473;
        long j = AbstractC0386.f1443;
        InterfaceC3101 interfaceC3101 = (InterfaceC3101) unsafe.getObjectVolatile(this, j);
        C1866 c1866 = interfaceC3101 instanceof C1866 ? (C1866) interfaceC3101 : null;
        if (c1866 == null) {
            z = false;
            break;
        }
        AbstractC0386 abstractC0386 = c1866.f18969;
        abstractC0386 = abstractC0386 == null ? null : abstractC0386;
        if (abstractC0386 == null) {
            z = false;
            break;
        }
        while (!abstractC0386.mo883()) {
            InterfaceC3101 interfaceC3102 = (InterfaceC3101) AbstractC3456.f11473.getObjectVolatile(abstractC0386, j);
            C1866 c1867 = interfaceC3102 instanceof C1866 ? (C1866) interfaceC3102 : null;
            if (c1867 != null) {
                abstractC0386 = c1867.f18969;
                if (abstractC0386 == null) {
                    abstractC0386 = null;
                }
                if (abstractC0386 == null) {
                }
            }
            z = false;
        }
        this.f12857 = z;
    }

    @Override // p000.AbstractC0386
    /* JADX INFO: renamed from: ۦُ */
    public final boolean mo883() {
        return this.f12857;
    }

    @Override // p000.AbstractC0386
    /* JADX INFO: renamed from: ۦٖ */
    public final boolean mo884() {
        return true;
    }
}
