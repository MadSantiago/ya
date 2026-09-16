package p000;

/* JADX INFO: renamed from: ۦٕؔؑؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4234 implements InterfaceC4686 {

    /* JADX INFO: renamed from: ۥۗ */
    public final int f14036;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f14037;

    public C4234(int i, int i2) {
        this.f14037 = i;
        this.f14036 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4234)) {
            return false;
        }
        C4234 c4234 = (C4234) obj;
        return this.f14037 == c4234.f14037 && this.f14036 == c4234.f14036;
    }

    public final int hashCode() {
        return ((this.f14037 * 31) + this.f14036) * 961;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets(left=");
        sb.append(this.f14037);
        sb.append(", top=");
        return AbstractC3761.m6630(this.f14036, ", right=0, bottom=0)", sb);
    }

    @Override // p000.InterfaceC4686
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo1865(InterfaceC2880 interfaceC2880, EnumC2459 enumC2459) {
        return 0;
    }

    @Override // p000.InterfaceC4686
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo1868(InterfaceC2880 interfaceC2880) {
        return this.f14036;
    }

    @Override // p000.InterfaceC4686
    /* JADX INFO: renamed from: ۥۣ */
    public final int mo1869(InterfaceC2880 interfaceC2880) {
        return 0;
    }

    @Override // p000.InterfaceC4686
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo1870(InterfaceC2880 interfaceC2880, EnumC2459 enumC2459) {
        return this.f14037;
    }
}
