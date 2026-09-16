package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ۦّ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0070 extends AbstractC2776 {

    /* JADX INFO: renamed from: ۥۜ */
    public final AtomicReferenceFieldUpdater f13328;

    /* JADX INFO: renamed from: ۦؚ */
    public final AtomicReferenceFieldUpdater f13329;

    /* JADX INFO: renamed from: ۦِ */
    public final AtomicReferenceFieldUpdater f13330;

    /* JADX INFO: renamed from: ۦٛ */
    public final AtomicReferenceFieldUpdater f13331;

    /* JADX INFO: renamed from: ۦۗ */
    public final AtomicReferenceFieldUpdater f13332;

    public C0070(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f13328 = atomicReferenceFieldUpdater;
        this.f13331 = atomicReferenceFieldUpdater2;
        this.f13330 = atomicReferenceFieldUpdater3;
        this.f13332 = atomicReferenceFieldUpdater4;
        this.f13329 = atomicReferenceFieldUpdater5;
    }

    @Override // p000.AbstractC2776
    /* JADX INFO: renamed from: ۥؔ */
    public final void mo4350(C0060 c0060, Thread thread) {
        this.f13328.lazySet(c0060, thread);
    }

    @Override // p000.AbstractC2776
    /* JADX INFO: renamed from: ۥُ */
    public final boolean mo4351(AbstractC0065 abstractC0065, C0085 c0085, C0085 c0086) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f13332;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0065, c0085, c0086)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0065) == c0085);
        return false;
    }

    @Override // p000.AbstractC2776
    /* JADX INFO: renamed from: ۥّ */
    public final boolean mo4352(AbstractC0065 abstractC0065, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f13329;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0065, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0065) == obj);
        return false;
    }

    @Override // p000.AbstractC2776
    /* JADX INFO: renamed from: ۦٖ */
    public final void mo4353(C0060 c0060, C0060 c0061) {
        this.f13331.lazySet(c0060, c0061);
    }

    @Override // p000.AbstractC2776
    /* JADX INFO: renamed from: ۦۙ */
    public final boolean mo4354(AbstractC0065 abstractC0065, C0060 c0060, C0060 c0061) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f13330;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0065, c0060, c0061)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0065) == c0060);
        return false;
    }
}
