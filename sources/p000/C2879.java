package p000;

/* JADX INFO: renamed from: ۥۧؖٙؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C2879 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC3016 f9606;

    /* JADX INFO: renamed from: ۥُ */
    public final boolean f9607;

    /* JADX INFO: renamed from: ۥّ */
    public final C2155 f9608;

    /* JADX INFO: renamed from: ۥۗ */
    public final C2243 f9609;

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean f9610;

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean f9611;

    /* JADX INFO: renamed from: ۦۙ */
    public final InterfaceC4448 f9612;

    public C2879(boolean z, C2243 c2243, InterfaceC3016 interfaceC3016, boolean z2, boolean z3, C2155 c2155, InterfaceC4448 interfaceC4448) {
        this.f9610 = z;
        this.f9609 = c2243;
        this.f9606 = interfaceC3016;
        this.f9611 = z2;
        this.f9607 = z3;
        this.f9608 = c2155;
        this.f9612 = interfaceC4448;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2879.class != obj.getClass()) {
            return false;
        }
        C2879 c2879 = (C2879) obj;
        return this.f9610 == c2879.f9610 && AbstractC3831.m6874(this.f9609, c2879.f9609) && AbstractC3831.m6874(this.f9606, c2879.f9606) && this.f9611 == c2879.f9611 && this.f9607 == c2879.f9607 && AbstractC3831.m6874(this.f9608, c2879.f9608) && this.f9612 == c2879.f9612;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f9610) * 31;
        C2243 c2243 = this.f9609;
        int iHashCode2 = (iHashCode + (c2243 != null ? c2243.hashCode() : 0)) * 31;
        InterfaceC3016 interfaceC3016 = this.f9606;
        int iM8672 = AbstractC5078.m8672(AbstractC5078.m8672((iHashCode2 + (interfaceC3016 != null ? interfaceC3016.hashCode() : 0)) * 31, 31, this.f9611), 31, this.f9607);
        C2155 c2155 = this.f9608;
        return this.f9612.hashCode() + ((iM8672 + (c2155 != null ? Integer.hashCode(c2155.f7116) : 0)) * 31);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C3891 c3891 = (C3891) abstractC5381;
        boolean z = c3891.f13005;
        boolean z2 = this.f9610;
        if (z != z2) {
            c3891.f13005 = z2;
            AbstractC0186.m412(c3891);
        }
        c3891.m9754(this.f9609, this.f9606, this.f9611, this.f9607, null, this.f9608, this.f9612);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C3891 c3891 = new C3891(this.f9609, this.f9606, this.f9611, this.f9607, null, this.f9608, this.f9612);
        c3891.f13005 = this.f9610;
        return c3891;
    }
}
