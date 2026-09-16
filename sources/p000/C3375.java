package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۦّؖؗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3375 {

    /* JADX INFO: renamed from: ۥۣ */
    public final AtomicReference f11260 = new AtomicReference(null);

    /* JADX INFO: renamed from: ۥۗ */
    public final C1387 f11259 = new C1387();

    /* JADX INFO: renamed from: ۥۣ */
    public final void m6144(C2377 c2377) {
        while (true) {
            AtomicReference atomicReference = this.f11260;
            C2377 c2378 = (C2377) atomicReference.get();
            if (c2378 != null && c2377.f7868.compareTo(c2378.f7868) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            do {
                if (atomicReference.compareAndSet(c2378, c2377)) {
                    if (c2378 != null) {
                        c2378.f7867.mo871(new C5834(0, "Mutation interrupted"));
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == c2378);
        }
    }
}
