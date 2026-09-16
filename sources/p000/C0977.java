package p000;

/* JADX INFO: renamed from: ۥٍٟؗٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C0977 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f3440;

    /* JADX INFO: renamed from: ۥُ */
    public final boolean f3441;

    /* JADX INFO: renamed from: ۥۗ */
    public final float f3442;

    /* JADX INFO: renamed from: ۥۣ */
    public final float f3443;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f3444;

    public C0977(float f, float f2, float f3, float f4, boolean z, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0977)) {
            return false;
        }
        C0977 c0977 = (C0977) obj;
        return C4497.m7826(this.f3443, c0977.f3443) && C4497.m7826(this.f3442, c0977.f3442) && C4497.m7826(this.f3440, c0977.f3440) && C4497.m7826(this.f3444, c0977.f3444) && this.f3441 == c0977.f3441;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3441) + AbstractC3761.m6635(this.f3444, AbstractC3761.m6635(this.f3440, AbstractC3761.m6635(this.f3442, Float.hashCode(this.f3443) * 31, 31), 31), 31);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C4788 c4788 = (C4788) abstractC5381;
        c4788.f15794 = this.f3443;
        c4788.f15798 = this.f3442;
        c4788.f15795 = this.f3440;
        c4788.f15796 = this.f3444;
        c4788.f15797 = this.f3441;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C4788 c4788 = new C4788();
        c4788.f15794 = this.f3443;
        c4788.f15798 = this.f3442;
        c4788.f15795 = this.f3440;
        c4788.f15796 = this.f3444;
        c4788.f15797 = this.f3441;
        return c4788;
    }

    public C0977(float f, float f2, float f3, float f4, boolean z) {
        this.f3443 = f;
        this.f3442 = f2;
        this.f3440 = f3;
        this.f3444 = f4;
        this.f3441 = z;
    }
}
