package p000;

/* JADX INFO: renamed from: ۦؖؔۦٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C3356 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final EnumC1616 f11219;

    /* JADX INFO: renamed from: ۥۗ */
    public final C5086 f11220;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4464 f11221;

    public C3356(InterfaceC4464 interfaceC4464, C5086 c5086, EnumC1616 enumC1616) {
        this.f11221 = interfaceC4464;
        this.f11220 = c5086;
        this.f11219 = enumC1616;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3356)) {
            return false;
        }
        C3356 c3356 = (C3356) obj;
        return AbstractC3831.m6874(this.f11221, c3356.f11221) && AbstractC3831.m6874(this.f11220, c3356.f11220) && this.f11219 == c3356.f11219;
    }

    public final int hashCode() {
        return this.f11219.hashCode() + AbstractC5078.m8672((this.f11220.hashCode() + (this.f11221.hashCode() * 31)) * 31, 31, false);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C3317 c3317 = (C3317) abstractC5381;
        c3317.f11112 = this.f11221;
        c3317.f11114 = this.f11220;
        c3317.f11113 = this.f11219;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C3317 c3317 = new C3317();
        c3317.f11112 = this.f11221;
        c3317.f11114 = this.f11220;
        c3317.f11113 = this.f11219;
        return c3317;
    }
}
