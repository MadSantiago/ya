package p000;

/* JADX INFO: renamed from: ۦٔؑٔؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4153 {

    /* JADX INFO: renamed from: ۥؗ */
    public C2600 f13838;

    /* JADX INFO: renamed from: ۥۗ */
    public final C5208 f13839 = new C5208(Boolean.FALSE);

    /* JADX INFO: renamed from: ۥۣ */
    public final C3375 f13840;

    public C4153(C3375 c3375) {
        this.f13840 = c3375;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final Object m7346(EnumC4386 enumC4386, AbstractC2426 abstractC2426) {
        InterfaceC0443 interfaceC0443 = null;
        C4430 c4430 = new C4430(this, new C4846(this, interfaceC0443, 3), enumC4386, interfaceC0443, 1);
        C3375 c3375 = this.f13840;
        c3375.getClass();
        Object objM7173 = AbstractC4009.m7173(new C4522(enumC4386, c3375, c4430, interfaceC0443, 3), abstractC2426);
        return objM7173 == EnumC2282.f7590 ? objM7173 : C2358.f7817;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m7347() {
        C5208 c5208 = this.f13839;
        return ((Boolean) c5208.f17213.getValue()).booleanValue() || ((Boolean) c5208.f17212.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m7348() {
        this.f13839.f17212.setValue(Boolean.FALSE);
    }
}
