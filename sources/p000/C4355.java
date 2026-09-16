package p000;

/* JADX INFO: renamed from: ۦٗؓؗؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4355 extends C5559 {

    /* JADX INFO: renamed from: ۥٕ */
    public final int f14358;

    public C4355(int i, int i2) {
        super(i);
        this.f14358 = i2;
        if (i2 == 1) {
            C2316.m4357(AbstractC5041.m8557(C5559.class).m5775(), " instead", "This implementation does not support suspension for senders, use ");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        C1078.m2273(AbstractC5078.m8681(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    @Override // p000.C5559
    /* JADX INFO: renamed from: ۥؖ */
    public final boolean mo7645() {
        return this.f14358 == 2;
    }

    @Override // p000.C5559, p000.InterfaceC4783
    /* JADX INFO: renamed from: ۥؗ */
    public final Object mo5594(InterfaceC0443 interfaceC0443, Object obj) throws Throwable {
        if (m7646(obj, true) instanceof C4577) {
            throw m9318();
        }
        return C2358.f7817;
    }

    @Override // p000.C5559, p000.InterfaceC4783
    /* JADX INFO: renamed from: ۦۗ */
    public final Object mo5597(Object obj) {
        return m7646(obj, false);
    }

    /* JADX INFO: renamed from: ۦۜ */
    public final Object m7646(Object obj, boolean z) {
        C2358 c2358 = C2358.f7817;
        if (this.f14358 == 3) {
            Object objMo5597 = super.mo5597(obj);
            return (!(objMo5597 instanceof C1259) || (objMo5597 instanceof C4577)) ? objMo5597 : c2358;
        }
        Object obj2 = AbstractC1786.f5963;
        C4320 c4320 = (C4320) C5559.f18351.get(this);
        while (true) {
            long andIncrement = C5559.f18359.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean zM9325 = m9325(andIncrement, false);
            int i = AbstractC1786.f5960;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (c4320.f16448 != j3) {
                C4320 c4320M9341 = m9341(j3, c4320);
                if (c4320M9341 != null) {
                    c4320 = c4320M9341;
                } else if (zM9325) {
                    return new C4577(m9318());
                }
            }
            int iM9334 = m9334(c4320, i2, obj, j, obj2, zM9325);
            if (iM9334 == 0) {
                c4320.m3086();
                return c2358;
            }
            if (iM9334 != 1) {
                if (iM9334 != 2) {
                    if (iM9334 == 3) {
                        C1078.m2276("unexpected");
                        return null;
                    }
                    if (iM9334 == 4) {
                        if (j < m9322()) {
                            c4320.m3086();
                        }
                        return new C4577(m9318());
                    }
                    if (iM9334 == 5) {
                        c4320.m3086();
                    }
                } else {
                    if (zM9325) {
                        c4320.m8355();
                        return new C4577(m9318());
                    }
                    InterfaceC2728 interfaceC2728 = obj2 instanceof InterfaceC2728 ? (InterfaceC2728) obj2 : null;
                    if (interfaceC2728 != null) {
                        interfaceC2728.mo681(c4320, i2 + i);
                    }
                    m9340((c4320.f16448 * j2) + ((long) i2));
                }
            }
            return c2358;
        }
    }
}
