package p000;

/* JADX INFO: renamed from: ۦٕؕۥۣ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C4246 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC4448 f14073;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2243 f14074;

    public C4246(InterfaceC4448 interfaceC4448, C2243 c2243) {
        this.f14074 = c2243;
        this.f14073 = interfaceC4448;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4246.class != obj.getClass()) {
            return false;
        }
        C4246 c4246 = (C4246) obj;
        return AbstractC3831.m6874(this.f14074, c4246.f14074) && this.f14073 == c4246.f14073;
    }

    public final int hashCode() {
        C2243 c2243 = this.f14074;
        return Boolean.hashCode(true) + ((this.f14073.hashCode() + AbstractC5078.m8672(AbstractC5078.m8672((c2243 != null ? c2243.hashCode() : 0) * 961, 31, false), 29791, true)) * 923521);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C0563 c0563 = (C0563) abstractC5381;
        c0563.getClass();
        boolean z = !c0563.f1335;
        c0563.m9754(this.f14074, null, false, true, null, null, this.f14073);
        if (z) {
            C2439 c2439 = c0563.f1339;
            if (c2439 != null) {
                c2439.m4553();
            }
            c0563.m9756(false);
            c0563.m9756(true);
        }
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        return new C0563(this.f14073, this.f14074);
    }
}
