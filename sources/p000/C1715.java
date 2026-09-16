package p000;

/* JADX INFO: renamed from: ۥٜٚؒۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C1715 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC3016 f5714;

    /* JADX INFO: renamed from: ۥُ */
    public final C2155 f5715;

    /* JADX INFO: renamed from: ۥّ */
    public final InterfaceC4448 f5716;

    /* JADX INFO: renamed from: ۥۗ */
    public final C2243 f5717;

    /* JADX INFO: renamed from: ۥۣ */
    public final EnumC2887 f5718;

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean f5719;

    public C1715(EnumC2887 enumC2887, C2243 c2243, InterfaceC3016 interfaceC3016, boolean z, C2155 c2155, InterfaceC4448 interfaceC4448) {
        this.f5718 = enumC2887;
        this.f5717 = c2243;
        this.f5714 = interfaceC3016;
        this.f5719 = z;
        this.f5715 = c2155;
        this.f5716 = interfaceC4448;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1715.class != obj.getClass()) {
            return false;
        }
        C1715 c1715 = (C1715) obj;
        return this.f5718 == c1715.f5718 && AbstractC3831.m6874(this.f5717, c1715.f5717) && AbstractC3831.m6874(this.f5714, c1715.f5714) && this.f5719 == c1715.f5719 && this.f5715.equals(c1715.f5715) && this.f5716 == c1715.f5716;
    }

    public final int hashCode() {
        int iHashCode = this.f5718.hashCode() * 31;
        C2243 c2243 = this.f5717;
        int iHashCode2 = (iHashCode + (c2243 != null ? c2243.hashCode() : 0)) * 31;
        InterfaceC3016 interfaceC3016 = this.f5714;
        return this.f5716.hashCode() + AbstractC2049.m3999(this.f5715.f7116, AbstractC5078.m8672(AbstractC5078.m8672((iHashCode2 + (interfaceC3016 != null ? interfaceC3016.hashCode() : 0)) * 31, 31, false), 31, this.f5719), 31);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C2703 c2703 = (C2703) abstractC5381;
        EnumC2887 enumC2887 = c2703.f8962;
        EnumC2887 enumC2888 = this.f5718;
        if (enumC2887 != enumC2888) {
            c2703.f8962 = enumC2888;
            AbstractC0186.m412(c2703);
        }
        c2703.m9754(this.f5717, this.f5714, false, this.f5719, null, this.f5715, this.f5716);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C2703 c2703 = new C2703(this.f5717, this.f5714, false, this.f5719, null, this.f5715, this.f5716);
        c2703.f8962 = this.f5718;
        return c2703;
    }
}
