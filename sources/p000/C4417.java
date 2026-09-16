package p000;

/* JADX INFO: renamed from: ۦِ٘ؒۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4417 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f14561;

    /* JADX INFO: renamed from: ۥۗ */
    public final C1705 f14562;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4643 f14563;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f14564;

    public C4417(InterfaceC4643 interfaceC4643, C1705 c1705, float f, float f2) {
        this.f14563 = interfaceC4643;
        this.f14562 = c1705;
        this.f14561 = f;
        this.f14564 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4417)) {
            return false;
        }
        C4417 c4417 = (C4417) obj;
        return AbstractC3831.m6874(this.f14563, c4417.f14563) && AbstractC3831.m6874(this.f14562, c4417.f14562) && C4497.m7826(this.f14561, c4417.f14561) && C4497.m7826(this.f14564, c4417.f14564);
    }

    public final int hashCode() {
        return Float.hashCode(this.f14564) + AbstractC3761.m6635(this.f14561, (this.f14562.hashCode() + (this.f14563.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "SheetParams(scope=" + this.f14563 + ", bottomSheetState=" + this.f14562 + ", bottomPadding=" + C4497.m7825(this.f14561) + ", maxHeight=" + C4497.m7825(this.f14564) + ")";
    }
}
