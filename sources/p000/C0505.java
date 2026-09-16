package p000;

/* JADX INFO: renamed from: ۥؖؑؐٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0505 implements InterfaceC2880 {

    /* JADX INFO: renamed from: ۥْ */
    public final InterfaceC4770 f1822;

    /* JADX INFO: renamed from: ۦ۟ */
    public final float f1823;

    /* JADX INFO: renamed from: ۦۨ */
    public final float f1824;

    public C0505(float f, float f2, InterfaceC4770 interfaceC4770) {
        this.f1824 = f;
        this.f1823 = f2;
        this.f1822 = interfaceC4770;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0505)) {
            return false;
        }
        C0505 c0505 = (C0505) obj;
        return Float.compare(this.f1824, c0505.f1824) == 0 && Float.compare(this.f1823, c0505.f1823) == 0 && this.f1822.equals(c0505.f1822);
    }

    public final int hashCode() {
        return this.f1822.hashCode() + AbstractC3761.m6635(this.f1823, Float.hashCode(this.f1824) * 31, 31);
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f1824 + ", fontScale=" + this.f1823 + ", converter=" + this.f1822 + ')';
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۖ */
    public final long mo745(float f) {
        return AbstractC4489.m7799(this.f1822.mo1919(f), 4294967296L);
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۗ */
    public final float mo746() {
        return this.f1824;
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦُ */
    public final float mo751(long j) {
        if (C3970.m7128(C5023.m8439(j), 4294967296L)) {
            return this.f1822.mo1918(C5023.m8438(j));
        }
        C1078.m2276("Only Sp can convert to Px");
        return 0.0f;
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۚ */
    public final float mo754() {
        return this.f1823;
    }
}
