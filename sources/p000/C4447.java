package p000;

/* JADX INFO: renamed from: ۦٕ٘ؖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4447 implements InterfaceC4686 {

    /* JADX INFO: renamed from: ۥۗ */
    public final int f14660;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4686 f14661;

    public C4447(InterfaceC4686 interfaceC4686, int i) {
        this.f14661 = interfaceC4686;
        this.f14660 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4447)) {
            return false;
        }
        C4447 c4447 = (C4447) obj;
        return AbstractC3831.m6874(this.f14661, c4447.f14661) && this.f14660 == c4447.f14660;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14660) + (this.f14661.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f14661);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = AbstractC3925.f13088;
        int i2 = this.f14660;
        if ((i2 & i) == i) {
            AbstractC3925.m7046("Start", sb3);
        }
        int i3 = AbstractC3925.f13085;
        if ((i2 & i3) == i3) {
            AbstractC3925.m7046("Left", sb3);
        }
        if ((i2 & 16) == 16) {
            AbstractC3925.m7046("Top", sb3);
        }
        int i4 = AbstractC3925.f13089;
        if ((i2 & i4) == i4) {
            AbstractC3925.m7046("End", sb3);
        }
        int i5 = AbstractC3925.f13090;
        if ((i2 & i5) == i5) {
            AbstractC3925.m7046("Right", sb3);
        }
        if ((i2 & 32) == 32) {
            AbstractC3925.m7046("Bottom", sb3);
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }

    @Override // p000.InterfaceC4686
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo1865(InterfaceC2880 interfaceC2880, EnumC2459 enumC2459) {
        if (((enumC2459 == EnumC2459.f8215 ? 4 : 1) & this.f14660) != 0) {
            return this.f14661.mo1865(interfaceC2880, enumC2459);
        }
        return 0;
    }

    @Override // p000.InterfaceC4686
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo1868(InterfaceC2880 interfaceC2880) {
        if ((this.f14660 & 16) != 0) {
            return this.f14661.mo1868(interfaceC2880);
        }
        return 0;
    }

    @Override // p000.InterfaceC4686
    /* JADX INFO: renamed from: ۥۣ */
    public final int mo1869(InterfaceC2880 interfaceC2880) {
        if ((this.f14660 & 32) != 0) {
            return this.f14661.mo1869(interfaceC2880);
        }
        return 0;
    }

    @Override // p000.InterfaceC4686
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo1870(InterfaceC2880 interfaceC2880, EnumC2459 enumC2459) {
        if (((enumC2459 == EnumC2459.f8215 ? 8 : 2) & this.f14660) != 0) {
            return this.f14661.mo1870(interfaceC2880, enumC2459);
        }
        return 0;
    }
}
