package p000;

/* JADX INFO: renamed from: ۦؔؗٓؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C3236 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C3564 f10874;

    public C3236(C3564 c3564) {
        this.f10874 = c3564;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3236)) {
            return false;
        }
        return AbstractC3831.m6874(this.f10874, ((C3236) obj).f10874);
    }

    public final int hashCode() {
        return this.f10874.hashCode();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C0435 c0435 = (C0435) abstractC5381;
        c0435.getClass();
        C3564 c3564M9238 = AbstractC5537.m9238(this.f10874, AbstractC5537.m9270(c0435).f2272);
        c0435.m930(c3564M9238, (InterfaceC4434) AbstractC2552.m4807(c0435, AbstractC2853.f9553));
        C1458 c1458 = c0435.f1595;
        if (c1458 != null) {
            C1458.m3080(c1458, null, null, c3564M9238, 23);
            C5063.m8642(c0435);
        } else {
            AbstractC4690.m8037("Min size state is not set.");
            C1078.m2274();
        }
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        return new C0435(this.f10874);
    }
}
