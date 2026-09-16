package p000;

/* JADX INFO: renamed from: ۥۥؖ٘ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C2759 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C3323 f9137;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC3028 f9138;

    public C2759(InterfaceC3028 interfaceC3028, C3323 c3323) {
        this.f9138 = interfaceC3028;
        this.f9137 = c3323;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2759)) {
            return false;
        }
        C2759 c2759 = (C2759) obj;
        return AbstractC3831.m6874(c2759.f9138, this.f9138) && AbstractC3831.m6874(c2759.f9137, this.f9137);
    }

    public final int hashCode() {
        int iHashCode = this.f9138.hashCode() * 31;
        C3323 c3323 = this.f9137;
        return iHashCode + (c3323 != null ? c3323.hashCode() : 0);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C1386 c1386 = (C1386) abstractC5381;
        c1386.f4737 = this.f9138;
        C3323 c3323 = c1386.f4740;
        if (c3323.f11134 == c1386) {
            c3323.f11134 = null;
        }
        C3323 c3324 = this.f9137;
        if (c3324 == null) {
            c3323 = new C3323();
            c1386.f4740 = c3323;
        } else if (c3324 != c3323) {
            c1386.f4740 = c3324;
            c3323 = c3324;
        }
        if (c1386.f17786) {
            c3323.f11134 = c1386;
            c3323.f11133 = null;
            c1386.f4738 = null;
            c3323.f11132 = new C5285(17, c1386);
            c3323.f11135 = c1386.m9076();
        }
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        return new C1386(this.f9138, this.f9137);
    }
}
