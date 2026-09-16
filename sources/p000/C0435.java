package p000;

/* JADX INFO: renamed from: ۥؕؑ٘ؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0435 extends AbstractC5381 implements InterfaceC4825, InterfaceC4933 {

    /* JADX INFO: renamed from: ۥً */
    public final C3564 f1594;

    /* JADX INFO: renamed from: ۥٕ */
    public C1458 f1595;

    /* JADX INFO: renamed from: ۦٚ */
    public C4879 f1596;

    public C0435(C3564 c3564) {
        this.f1594 = c3564;
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۥ */
    public final void mo780() {
        C3564 c3564M9238 = AbstractC5537.m9238(this.f1594, AbstractC5537.m9270(this).f2272);
        InterfaceC4434 interfaceC4434 = (InterfaceC4434) AbstractC2552.m4807(this, AbstractC2853.f9553);
        m930(c3564M9238, interfaceC4434);
        EnumC2459 enumC2459 = AbstractC5537.m9270(this).f2272;
        InterfaceC2880 interfaceC2880 = AbstractC5537.m9270(this).f2236;
        C4879 c4879 = this.f1596;
        if (c4879 != null) {
            this.f1595 = new C1458(enumC2459, interfaceC2880, interfaceC4434, c3564M9238, c4879.f16042);
        } else {
            AbstractC4690.m8037("Font resolution state is not set.");
            C1078.m2274();
        }
    }

    /* JADX INFO: renamed from: ۥؑ */
    public final void m930(C3564 c3564, InterfaceC4434 interfaceC4434) {
        C0553 c0553 = c3564.f11803;
        AbstractC0903 abstractC0903 = c0553.f1986;
        C1626 c1626 = c0553.f1984;
        if (c1626 == null) {
            c1626 = C1626.f5439;
        }
        C5827 c5827 = c0553.f1990;
        int i = c5827 != null ? c5827.f19197 : 0;
        C2848 c2848 = c0553.f1985;
        this.f1596 = ((C1226) interfaceC4434).m2590(abstractC0903, c1626, i, c2848 != null ? c2848.f9512 : 65535);
        C5063.m8642(this);
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5370 mo931(InterfaceC2427 interfaceC2427, InterfaceC1827 interfaceC1827, long j) {
        C1458 c1458 = this.f1595;
        if (c1458 == null) {
            AbstractC4690.m8037("Min size state is not set.");
            C1078.m2274();
            return null;
        }
        C4852 c4852 = c1458.f4972;
        C4879 c4879 = this.f1596;
        if (c4879 == null) {
            AbstractC4690.m8037("Font resolution state is not set.");
            C1078.m2274();
            return null;
        }
        Object obj = c4879.f16042;
        if (!AbstractC3831.m6874(obj, c1458.f4971)) {
            c1458.f4971 = obj;
            c4852.setValue(Boolean.TRUE);
        }
        if (((Boolean) c4852.getValue()).booleanValue()) {
            c1458.f4976 = AbstractC1287.m2716(c1458.f4975, c1458.f4973, c1458.f4970, AbstractC1287.f4393, 1);
            c4852.setValue(Boolean.FALSE);
        }
        long j2 = c1458.f4976;
        AbstractC0275 abstractC0275Mo3597 = interfaceC1827.mo3597(AbstractC0671.m1492(j, AbstractC0671.m1494((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return interfaceC2427.mo755(abstractC0275Mo3597.f985, abstractC0275Mo3597.f984, C0204.f751, new C2785(abstractC0275Mo3597, 8));
    }

    @Override // p000.InterfaceC3975
    /* JADX INFO: renamed from: ۥ۠ */
    public final void mo932() {
        C1458 c1458 = this.f1595;
        if (c1458 != null) {
            C1458.m3080(c1458, AbstractC5537.m9270(this).f2272, null, null, 30);
        }
        C5063.m8642(this);
    }

    @Override // p000.InterfaceC3975
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo933() {
        C1458 c1458 = this.f1595;
        if (c1458 != null) {
            C1458.m3080(c1458, null, AbstractC5537.m9270(this).f2236, null, 29);
        }
        C5063.m8642(this);
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦؘ */
    public final boolean mo786() {
        return false;
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦٓ */
    public final void mo788() {
        this.f1596 = null;
        this.f1595 = null;
    }
}
