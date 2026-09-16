package p000;

/* JADX INFO: renamed from: ۦؘۣؓۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C3479 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final EnumC1616 f11555;

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC5635 f11556;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4448 f11557;

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean f11558;

    public C3479(InterfaceC4448 interfaceC4448, InterfaceC5635 interfaceC5635, EnumC1616 enumC1616, boolean z) {
        this.f11557 = interfaceC4448;
        this.f11556 = interfaceC5635;
        this.f11555 = enumC1616;
        this.f11558 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3479)) {
            return false;
        }
        C3479 c3479 = (C3479) obj;
        return this.f11557 == c3479.f11557 && AbstractC3831.m6874(this.f11556, c3479.f11556) && this.f11555 == c3479.f11555 && this.f11558 == c3479.f11558;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC5078.m8672((this.f11555.hashCode() + ((this.f11556.hashCode() + (this.f11557.hashCode() * 31)) * 31)) * 31, 31, this.f11558);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C4891 c4891 = (C4891) abstractC5381;
        c4891.f16105 = this.f11557;
        c4891.f16111 = this.f11556;
        EnumC1616 enumC1616 = c4891.f16106;
        EnumC1616 enumC1617 = this.f11555;
        if (enumC1616 != enumC1617) {
            c4891.f16106 = enumC1617;
            AbstractC0186.m412(c4891);
        }
        boolean z = c4891.f16107;
        boolean z2 = this.f11558;
        if (z == z2) {
            return;
        }
        c4891.f16107 = z2;
        c4891.m8229();
        AbstractC0186.m412(c4891);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        return new C4891(this.f11557, this.f11556, this.f11555, this.f11558);
    }
}
