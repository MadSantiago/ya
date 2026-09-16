package p000;

import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۦؐؗۥۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3002 extends AbstractC0031 implements InterfaceC4541, InterfaceC4783 {

    /* JADX INFO: renamed from: ۥٓ */
    public final C5559 f10101;

    public C3002(InterfaceC3534 interfaceC3534, C5559 c5559) {
        super(interfaceC3534, true);
        this.f10101 = c5559;
    }

    @Override // p000.InterfaceC4541
    public final C1893 iterator() {
        C5559 c5559 = this.f10101;
        c5559.getClass();
        return new C1893(c5559);
    }

    /* JADX INFO: renamed from: ۥؕ */
    public final void m5593(C5757 c5757) {
        Unsafe unsafe;
        Unsafe unsafe2;
        C5559 c5559 = this.f10101;
        c5559.getClass();
        long j = C5559.f18352;
        do {
            unsafe = AbstractC3456.f11473;
            if (unsafe.compareAndSwapObject(c5559, C5559.f18352, (Object) null, c5757)) {
                return;
            }
        } while (unsafe.getObjectVolatile(c5559, j) == null);
        while (true) {
            Object objectVolatile = AbstractC3456.f11473.getObjectVolatile(c5559, j);
            C5536 c5536 = AbstractC1786.f5958;
            if (objectVolatile != c5536) {
                if (objectVolatile == AbstractC1786.f5959) {
                    C1078.m2276("Another handler was already registered and successfully invoked");
                    return;
                } else {
                    C5028.m8449(objectVolatile, "Another handler is already registered: ");
                    return;
                }
            }
            C5536 c5537 = AbstractC1786.f5959;
            do {
                unsafe2 = AbstractC3456.f11473;
                if (unsafe2.compareAndSwapObject(c5559, C5559.f18352, c5536, c5537)) {
                    c5757.mo211(c5559.m9342());
                    return;
                }
            } while (unsafe2.getObjectVolatile(c5559, j) == c5536);
        }
    }

    @Override // p000.InterfaceC4783
    /* JADX INFO: renamed from: ۥؗ */
    public final Object mo5594(InterfaceC0443 interfaceC0443, Object obj) {
        return this.f10101.mo5594(interfaceC0443, obj);
    }

    @Override // p000.AbstractC0031
    /* JADX INFO: renamed from: ۥٞ */
    public final void mo3705(Object obj) {
        this.f10101.m9329(null);
    }

    @Override // p000.InterfaceC4541
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo5595() {
        return this.f10101.mo5595();
    }

    @Override // p000.AbstractC0386, p000.InterfaceC3196
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo871(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C1440(mo852(), null, this);
        }
        mo885(cancellationException);
    }

    @Override // p000.InterfaceC4541
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo5596(C5696 c5696) {
        C5559 c5559 = this.f10101;
        c5559.getClass();
        return C5559.m9312(c5559, c5696);
    }

    @Override // p000.AbstractC0386
    /* JADX INFO: renamed from: ۦٗ */
    public final void mo885(CancellationException cancellationException) {
        this.f10101.m9319(cancellationException, true);
        m858(cancellationException);
    }

    @Override // p000.AbstractC0031
    /* JADX INFO: renamed from: ۦٞ */
    public final void mo3706(Throwable th, boolean z) {
        if (this.f10101.m9319(th, false) || z) {
            return;
        }
        AbstractC1605.m3338(this.f6194, th);
    }

    @Override // p000.InterfaceC4783
    /* JADX INFO: renamed from: ۦۗ */
    public final Object mo5597(Object obj) {
        return this.f10101.mo5597(obj);
    }

    @Override // p000.InterfaceC4541
    /* JADX INFO: renamed from: ۦۙ */
    public final Object mo5598(InterfaceC0443 interfaceC0443) {
        return this.f10101.mo5598(interfaceC0443);
    }
}
