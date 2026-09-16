package p000;

/* JADX INFO: renamed from: ۥۛ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0039 extends AbstractC2776 {
    @Override // p000.AbstractC2776
    /* JADX INFO: renamed from: ۥؔ */
    public final void mo4350(C0060 c0060, Thread thread) {
        c0060.f11483 = thread;
    }

    @Override // p000.AbstractC2776
    /* JADX INFO: renamed from: ۥُ */
    public final boolean mo4351(AbstractC0065 abstractC0065, C0085 c0085, C0085 c0086) {
        synchronized (abstractC0065) {
            try {
                if (abstractC0065.f12494 != c0085) {
                    return false;
                }
                abstractC0065.f12494 = c0086;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC2776
    /* JADX INFO: renamed from: ۥّ */
    public final boolean mo4352(AbstractC0065 abstractC0065, Object obj, Object obj2) {
        synchronized (abstractC0065) {
            try {
                if (abstractC0065.f12495 != obj) {
                    return false;
                }
                abstractC0065.f12495 = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC2776
    /* JADX INFO: renamed from: ۦٖ */
    public final void mo4353(C0060 c0060, C0060 c0061) {
        c0060.f11482 = c0061;
    }

    @Override // p000.AbstractC2776
    /* JADX INFO: renamed from: ۦۙ */
    public final boolean mo4354(AbstractC0065 abstractC0065, C0060 c0060, C0060 c0061) {
        synchronized (abstractC0065) {
            try {
                if (abstractC0065.f12493 != c0060) {
                    return false;
                }
                abstractC0065.f12493 = c0061;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
