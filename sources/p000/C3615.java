package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۦؚۣؖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3615 extends AbstractC0063 {

    /* JADX INFO: renamed from: ۥۣ */
    public final AtomicReference f12049 = new AtomicReference(null);

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC0443[] mo6443(AbstractC0072 abstractC0072) {
        this.f12049.set(null);
        return C4773.f15735;
    }

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo6444(AbstractC0072 abstractC0072) {
        AtomicReference atomicReference = this.f12049;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(AbstractC1605.f5395);
        return true;
    }
}
