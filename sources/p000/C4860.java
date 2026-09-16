package p000;

/* JADX INFO: renamed from: ۦٟؕؓۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4860 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC2864 f15988;

    /* JADX INFO: renamed from: ۥۗ */
    public final C0547 f15989;

    /* JADX INFO: renamed from: ۥۣ */
    public final float f15990;

    public C4860(float f, C0547 c0547, InterfaceC2864 interfaceC2864) {
        this.f15990 = f;
        this.f15989 = c0547;
        this.f15988 = interfaceC2864;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4860)) {
            return false;
        }
        C4860 c4860 = (C4860) obj;
        return C4497.m7826(this.f15990, c4860.f15990) && this.f15989.equals(c4860.f15989) && AbstractC3831.m6874(this.f15988, c4860.f15988);
    }

    public final int hashCode() {
        return this.f15988.hashCode() + ((this.f15989.hashCode() + (Float.hashCode(this.f15990) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) C4497.m7825(this.f15990)) + ", brush=" + this.f15989 + ", shape=" + this.f15988 + ')';
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C5560 c5560 = (C5560) abstractC5381;
        float f = c5560.f18362;
        C3852 c3852 = c5560.f18363;
        float f2 = this.f15990;
        if (!C4497.m7826(f, f2)) {
            c5560.f18362 = f2;
            c3852.m6890();
        }
        C0547 c0547 = c5560.f18365;
        C0547 c0548 = this.f15989;
        if (!AbstractC3831.m6874(c0547, c0548)) {
            c5560.f18365 = c0548;
            c3852.m6890();
        }
        InterfaceC2864 interfaceC2864 = c5560.f18364;
        InterfaceC2864 interfaceC2865 = this.f15988;
        if (AbstractC3831.m6874(interfaceC2864, interfaceC2865)) {
            return;
        }
        c5560.f18364 = interfaceC2865;
        c3852.m6890();
        AbstractC0186.m412(c5560);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        return new C5560(this.f15990, this.f15989, this.f15988);
    }
}
