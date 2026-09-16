package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: ۦٖؗۧ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4320 extends AbstractC4971 {

    /* JADX INFO: renamed from: ۥۜ */
    public final /* synthetic */ AtomicReferenceArray f14285;

    /* JADX INFO: renamed from: ۦۙ */
    public final C5559 f14286;

    public C4320(long j, C4320 c4320, C5559 c5559, int i) {
        super(j, c4320, i);
        this.f14286 = c5559;
        this.f14285 = new AtomicReferenceArray(AbstractC1786.f5960 * 2);
    }

    @Override // p000.AbstractC4971
    /* JADX INFO: renamed from: ۥّ */
    public final int mo7620() {
        return AbstractC1786.f5960;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final void m7621(int i, boolean z) {
        if (z) {
            this.f14286.m9316((this.f16448 * ((long) AbstractC1786.f5960)) + ((long) i));
        }
        m8355();
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final void m7622(int i, Object obj) {
        this.f14285.set(i * 2, obj);
    }

    /* JADX INFO: renamed from: ۦِ */
    public final boolean m7623(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f14285;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final Object m7624(int i) {
        return this.f14285.get((i * 2) + 1);
    }

    @Override // p000.AbstractC4971
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo7625(int i, InterfaceC3534 interfaceC3534) {
        C5559 c5559;
        int i2 = AbstractC1786.f5960;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.f14285.get(i * 2);
        while (true) {
            Object objM7624 = m7624(i);
            boolean z2 = objM7624 instanceof InterfaceC2728;
            c5559 = this.f14286;
            if (z2 || (objM7624 instanceof C0962)) {
                if (m7623(i, objM7624, z ? AbstractC1786.f5966 : AbstractC1786.f5968)) {
                    m7622(i, null);
                    m7621(i, !z);
                    if (z) {
                        c5559.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objM7624 == AbstractC1786.f5966 || objM7624 == AbstractC1786.f5968) {
                    break;
                }
                if (objM7624 != AbstractC1786.f5969 && objM7624 != AbstractC1786.f5957) {
                    if (objM7624 == AbstractC1786.f5967 || objM7624 == AbstractC1786.f5963 || objM7624 == AbstractC1786.f5964) {
                        return;
                    }
                    C5028.m8449(objM7624, "unexpected state: ");
                    return;
                }
            }
        }
        m7622(i, null);
        if (z) {
            c5559.getClass();
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final void m7626(int i, Object obj) {
        this.f14285.set((i * 2) + 1, obj);
    }
}
