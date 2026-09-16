package p000;

/* JADX INFO: renamed from: ۦٜؗۨٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4711 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C5837 f15530;

    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC4120 f15531;

    /* JADX INFO: renamed from: ۥّ */
    public final C3635 f15532;

    /* JADX INFO: renamed from: ۥۗ */
    public final C5745 f15533;

    /* JADX INFO: renamed from: ۥۜ */
    public final C3985 f15534;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3263 f15535;

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean f15536;

    /* JADX INFO: renamed from: ۦۙ */
    public final C2350 f15537;

    public C4711(C3263 c3263, C5745 c5745, C5837 c5837, boolean z, InterfaceC4120 interfaceC4120, C3635 c3635, C2350 c2350, C3985 c3985) {
        this.f15535 = c3263;
        this.f15533 = c5745;
        this.f15530 = c5837;
        this.f15536 = z;
        this.f15531 = interfaceC4120;
        this.f15532 = c3635;
        this.f15537 = c2350;
        this.f15534 = c3985;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4711) {
            C4711 c4711 = (C4711) obj;
            if (this.f15535.equals(c4711.f15535) && AbstractC3831.m6874(this.f15533, c4711.f15533) && this.f15530 == c4711.f15530 && this.f15536 == c4711.f15536 && this.f15531.equals(c4711.f15531) && this.f15532 == c4711.f15532 && AbstractC3831.m6874(this.f15537, c4711.f15537) && AbstractC3831.m6874(this.f15534, c4711.f15534)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f15534.hashCode() + ((this.f15537.hashCode() + ((this.f15532.hashCode() + ((this.f15531.hashCode() + AbstractC5078.m8672(AbstractC5078.m8672(AbstractC5078.m8672((this.f15530.hashCode() + ((this.f15533.hashCode() + (this.f15535.hashCode() * 31)) * 31)) * 31, 31, false), 31, this.f15536), 31, false)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.f15535 + ", value=" + this.f15533 + ", state=" + this.f15530 + ", readOnly=false, enabled=" + this.f15536 + ", isPassword=false, offsetMapping=" + this.f15531 + ", manager=" + this.f15532 + ", imeOptions=" + this.f15537 + ", focusRequester=" + this.f15534 + ')';
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C5666 c5666 = (C5666) abstractC5381;
        boolean z = c5666.f18639;
        C2350 c2350 = c5666.f18642;
        C3635 c3635 = c5666.f18640;
        c5666.f18636 = this.f15535;
        C5745 c5745 = this.f15533;
        c5666.f18637 = c5745;
        c5666.f18641 = this.f15530;
        boolean z2 = this.f15536;
        c5666.f18639 = z2;
        c5666.f18638 = this.f15531;
        C3635 c3636 = this.f15532;
        c5666.f18640 = c3636;
        C2350 c2351 = this.f15537;
        c5666.f18642 = c2351;
        c5666.f18643 = this.f15534;
        if (z2 != z || z2 != z || !AbstractC3831.m6874(c2351, c2350) || !C3346.m6107(c5745.f18943)) {
            AbstractC0186.m412(c5666);
        }
        if (c3636 != c3635) {
            c3636.f12141 = new C4582(c5666, 0);
        }
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C5666 c5666 = new C5666();
        c5666.f18636 = this.f15535;
        c5666.f18637 = this.f15533;
        c5666.f18641 = this.f15530;
        c5666.f18639 = this.f15536;
        c5666.f18638 = this.f15531;
        C3635 c3635 = this.f15532;
        c5666.f18640 = c3635;
        c5666.f18642 = this.f15537;
        c5666.f18643 = this.f15534;
        c3635.f12141 = new C4582(c5666, 4);
        return c5666;
    }
}
