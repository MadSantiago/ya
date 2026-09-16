package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ۥَٝؕٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1893 implements InterfaceC2728 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C5559 f6274;

    /* JADX INFO: renamed from: ۦ۟ */
    public C2600 f6275;

    /* JADX INFO: renamed from: ۦۨ */
    public Object f6276 = AbstractC1786.f5971;

    public C1893(C5559 c5559) {
        this.f6274 = c5559;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final Object m3744() {
        Object obj = this.f6276;
        C5536 c5536 = AbstractC1786.f5971;
        if (obj == c5536) {
            C1078.m2276("`hasNext()` has not been invoked");
            return null;
        }
        this.f6276 = c5536;
        if (obj != AbstractC1786.f5964) {
            return obj;
        }
        Throwable thM9321 = this.f6274.m9321();
        int i = AbstractC5768.f19013;
        throw thM9321;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final Object m3745(AbstractC0772 abstractC0772) {
        C4320 c4320M9333;
        Object obj = this.f6276;
        boolean z = true;
        if (obj == AbstractC1786.f5971 || obj == AbstractC1786.f5964) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5559.f18356;
            C5559 c5559 = this.f6274;
            C4320 c4320 = (C4320) atomicReferenceFieldUpdater.get(c5559);
            while (!c5559.m9336()) {
                long andIncrement = C5559.f18349.getAndIncrement(c5559);
                long j = AbstractC1786.f5960;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (c4320.f16448 != j2) {
                    c4320M9333 = c5559.m9333(j2, c4320);
                    if (c4320M9333 == null) {
                        continue;
                    }
                } else {
                    c4320M9333 = c4320;
                }
                Object objM9331 = c5559.m9331(c4320M9333, i, andIncrement, null);
                C5536 c5536 = AbstractC1786.f5965;
                if (objM9331 == c5536) {
                    C1078.m2276("unreachable");
                    return null;
                }
                C5536 c5537 = AbstractC1786.f5972;
                if (objM9331 == c5537) {
                    if (andIncrement < c5559.m9323()) {
                        c4320M9333.m3086();
                    }
                    c4320 = c4320M9333;
                } else {
                    if (objM9331 == AbstractC1786.f5970) {
                        C5559 c55510 = this.f6274;
                        C2600 c2600M3372 = AbstractC1605.m3372(AbstractC2776.m5232(abstractC0772));
                        try {
                            this.f6275 = c2600M3372;
                            Object objM9332 = c55510.m9331(c4320M9333, i, andIncrement, this);
                            if (objM9332 != c5536) {
                                if (objM9332 == c5537) {
                                    if (andIncrement < c55510.m9323()) {
                                        c4320M9333.m3086();
                                    }
                                    C4320 c4321 = (C4320) C5559.f18356.get(c55510);
                                    while (true) {
                                        if (c55510.m9336()) {
                                            C2600 c2600 = this.f6275;
                                            this.f6275 = null;
                                            this.f6276 = AbstractC1786.f5964;
                                            Throwable thM9342 = c5559.m9342();
                                            if (thM9342 != null) {
                                                c2600.mo335(new C4535(thM9342));
                                                break;
                                            }
                                            c2600.mo335(Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = C5559.f18349.getAndIncrement(c55510);
                                        long j3 = AbstractC1786.f5960;
                                        long j4 = andIncrement2 / j3;
                                        int i2 = (int) (andIncrement2 % j3);
                                        if (c4321.f16448 != j4) {
                                            C4320 c4320M9334 = c55510.m9333(j4, c4321);
                                            if (c4320M9334 != null) {
                                                c4321 = c4320M9334;
                                            }
                                        }
                                        Object objM9333 = c55510.m9331(c4321, i2, andIncrement2, this);
                                        if (objM9333 == AbstractC1786.f5965) {
                                            mo681(c4321, i2);
                                            break;
                                        }
                                        if (objM9333 == AbstractC1786.f5972) {
                                            if (andIncrement2 < c55510.m9323()) {
                                                c4321.m3086();
                                            }
                                        } else {
                                            if (objM9333 == AbstractC1786.f5970) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            c4321.m3086();
                                            this.f6276 = objM9333;
                                            this.f6275 = null;
                                        }
                                    }
                                } else {
                                    c4320M9333.m3086();
                                    this.f6276 = objM9332;
                                    this.f6275 = null;
                                }
                                c2600M3372.mo3712(Boolean.TRUE, null);
                                break;
                            }
                            mo681(c4320M9333, i);
                            return c2600M3372.m4909();
                        } catch (Throwable th) {
                            c2600M3372.m4898();
                            throw th;
                        }
                    }
                    c4320M9333.m3086();
                    this.f6276 = objM9331;
                }
            }
            this.f6276 = AbstractC1786.f5964;
            Throwable thM9343 = c5559.m9342();
            if (thM9343 != null) {
                int i3 = AbstractC5768.f19013;
                throw thM9343;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // p000.InterfaceC2728
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo681(AbstractC4971 abstractC4971, int i) {
        C2600 c2600 = this.f6275;
        if (c2600 != null) {
            c2600.mo681(abstractC4971, i);
        }
    }
}
