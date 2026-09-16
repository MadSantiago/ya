package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ۦ۠ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0093 extends AbstractC5537 {

    /* JADX INFO: renamed from: ۥۜ */
    public final AtomicReferenceFieldUpdater f17703;

    /* JADX INFO: renamed from: ۦؚ */
    public final AtomicReferenceFieldUpdater f17704;

    /* JADX INFO: renamed from: ۦِ */
    public final AtomicReferenceFieldUpdater f17705;

    /* JADX INFO: renamed from: ۦٛ */
    public final AtomicReferenceFieldUpdater f17706;

    /* JADX INFO: renamed from: ۦۗ */
    public final AtomicReferenceFieldUpdater f17707;

    public C0093(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f17703 = atomicReferenceFieldUpdater;
        this.f17706 = atomicReferenceFieldUpdater2;
        this.f17705 = atomicReferenceFieldUpdater3;
        this.f17707 = atomicReferenceFieldUpdater4;
        this.f17704 = atomicReferenceFieldUpdater5;
    }

    @Override // p000.AbstractC5537
    /* JADX INFO: renamed from: ۥۤ */
    public final void mo4163(C0083 c0083, C0083 c0084) {
        this.f17706.lazySet(c0083, c0084);
    }

    @Override // p000.AbstractC5537
    /* JADX INFO: renamed from: ۥۦ */
    public final C0083 mo4164(AbstractC0032 abstractC0032) {
        return (C0083) this.f17705.getAndSet(abstractC0032, C0083.f15752);
    }

    @Override // p000.AbstractC5537
    /* JADX INFO: renamed from: ۦؒ */
    public final void mo4165(C0083 c0083, Thread thread) {
        this.f17703.lazySet(c0083, thread);
    }

    @Override // p000.AbstractC5537
    /* JADX INFO: renamed from: ۦؖ */
    public final C0050 mo4166(AbstractC0032 abstractC0032) {
        return (C0050) this.f17707.getAndSet(abstractC0032, C0050.f9656);
    }

    @Override // p000.AbstractC5537
    /* JADX INFO: renamed from: ۦؚ */
    public final boolean mo4167(AbstractC0032 abstractC0032, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f17704;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0032, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0032) == obj);
        return false;
    }

    @Override // p000.AbstractC5537
    /* JADX INFO: renamed from: ۦٌ */
    public final boolean mo4168(AbstractC0032 abstractC0032, C0083 c0083, C0083 c0084) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f17705;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0032, c0083, c0084)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0032) == c0083);
        return false;
    }

    @Override // p000.AbstractC5537
    /* JADX INFO: renamed from: ۦۗ */
    public final boolean mo4169(AbstractC0032 abstractC0032, C0050 c0050, C0050 c0051) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f17707;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0032, c0050, c0051)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0032) == c0050);
        return false;
    }
}
