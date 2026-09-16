package p000;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۥؚؒۥؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0772 extends AbstractC2870 {

    /* JADX INFO: renamed from: ۥْ */
    public transient InterfaceC0443 f2790;

    /* JADX INFO: renamed from: ۦ۟ */
    public final InterfaceC3534 f2791;

    public AbstractC0772(InterfaceC0443 interfaceC0443) {
        this(interfaceC0443, interfaceC0443 != null ? interfaceC0443.mo334() : null);
    }

    @Override // p000.InterfaceC0443
    /* JADX INFO: renamed from: ۥُ */
    public InterfaceC3534 mo334() {
        return this.f2791;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۦٗ */
    public void mo1662() {
        Unsafe unsafe;
        long j;
        InterfaceC0443 interfaceC0443 = this.f2790;
        if (interfaceC0443 != null && interfaceC0443 != this) {
            ((AbstractC2132) mo334().mo865(C0373.f1369)).getClass();
            C4437 c4437 = (C4437) interfaceC0443;
            do {
                unsafe = AbstractC3456.f11473;
                j = C4437.f14625;
            } while (unsafe.getObjectVolatile(c4437, j) == AbstractC5378.f17759);
            Object objectVolatile = unsafe.getObjectVolatile(c4437, j);
            C2600 c2600 = objectVolatile instanceof C2600 ? (C2600) objectVolatile : null;
            if (c2600 != null) {
                c2600.m4900();
            }
        }
        this.f2790 = C2949.f9891;
    }

    public AbstractC0772(InterfaceC0443 interfaceC0443, InterfaceC3534 interfaceC3534) {
        super(interfaceC0443);
        this.f2791 = interfaceC3534;
    }
}
