package p000;

/* JADX INFO: renamed from: ۥٕؓؐۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1392 implements InterfaceC3096 {

    /* JADX INFO: renamed from: ۥُ */
    public final C4852 f4764;

    /* JADX INFO: renamed from: ۥّ */
    public final C4852 f4765;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4745 f4767;

    /* JADX INFO: renamed from: ۦؑ */
    public final C4852 f4768;

    /* JADX INFO: renamed from: ۥۗ */
    public final C2889 f4766 = new C2889(this);

    /* JADX INFO: renamed from: ۥؗ */
    public final C3375 f4763 = new C3375();

    public C1392(InterfaceC4745 interfaceC4745) {
        this.f4767 = interfaceC4745;
        Boolean bool = Boolean.FALSE;
        this.f4768 = AbstractC2774.m5183(bool);
        this.f4764 = AbstractC2774.m5183(bool);
        this.f4765 = AbstractC2774.m5183(bool);
    }

    @Override // p000.InterfaceC3096
    /* JADX INFO: renamed from: ۥُ */
    public final Object mo1392(EnumC4386 enumC4386, InterfaceC5731 interfaceC5731, AbstractC0772 abstractC0772) {
        Object objM7173 = AbstractC4009.m7173(new C0061(this, enumC4386, interfaceC5731, null, 14), abstractC0772);
        return objM7173 == EnumC2282.f7590 ? objM7173 : C2358.f7817;
    }

    @Override // p000.InterfaceC3096
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo1397() {
        return ((Boolean) this.f4768.getValue()).booleanValue();
    }

    @Override // p000.InterfaceC3096
    /* JADX INFO: renamed from: ۦؑ */
    public final float mo1400(float f) {
        return ((Number) this.f4767.mo211(Float.valueOf(f))).floatValue();
    }
}
