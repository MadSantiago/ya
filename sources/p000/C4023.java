package p000;

import android.window.OnBackInvokedDispatcher;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: ۦؙّؔۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4023 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C2432 f13417 = new C2432(new C0101(23, this));

    /* JADX INFO: renamed from: ۥۣ */
    public final Runnable f13418;

    public C4023(Runnable runnable) {
        this.f13418 = runnable;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m7195(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        m7196().f13504.m3145(new C0683(onBackInvokedDispatcher, 0), 1);
        m7196().f13504.m3145(new C0683(onBackInvokedDispatcher, 1000000), 0);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C4051 m7196() {
        return (C4051) this.f13417.getValue();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m7197(InterfaceC4507 interfaceC4507, AbstractC1665 abstractC1665) {
        final AbstractC1434 abstractC1434Mo110 = interfaceC4507.mo110();
        if (abstractC1434Mo110.mo2387() == EnumC0458.f1657) {
            return;
        }
        C1585 c1585 = new C1585(abstractC1665, new C0528(interfaceC4507, abstractC1665));
        abstractC1665.f5550.add(c1585);
        c1585.m3324(false);
        C1489 c1489 = m7196().f13504;
        c1489.getClass();
        if (((LinkedHashSet) c1489.f5058).add(c1585)) {
            C5436 c5436 = (C5436) c1489.f5057;
            if (c1585.f5332 != null) {
                C2316.m4357(c1585, "' is already registered with a dispatcher", "Handler '");
                return;
            } else {
                c5436.f17934.addFirst(c1585);
                c1585.f5332 = c1489;
                c5436.m9109();
            }
        }
        final C4389 c4389 = new C4389(c1585, this, abstractC1434Mo110);
        abstractC1434Mo110.mo2388(c4389);
        abstractC1665.f5548.add(new AutoCloseable() { // from class: ۥِٜٓؒ
            @Override // java.lang.AutoCloseable
            public final void close() {
                abstractC1434Mo110.mo2389(c4389);
            }
        });
    }
}
