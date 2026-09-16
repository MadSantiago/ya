package p000;

/* JADX INFO: renamed from: ۥْٖؓۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1453 extends AbstractC1814 {

    /* JADX INFO: renamed from: ۥؗ */
    public float f4959;

    /* JADX INFO: renamed from: ۥۗ */
    public float f4960;

    /* JADX INFO: renamed from: ۥۣ */
    public float f4961;

    /* JADX INFO: renamed from: ۦؑ */
    public float f4962;

    public C1453(float f, float f2, float f3, float f4) {
        this.f4961 = f;
        this.f4960 = f2;
        this.f4959 = f3;
        this.f4962 = f4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1453)) {
            return false;
        }
        C1453 c1453 = (C1453) obj;
        return c1453.f4961 == this.f4961 && c1453.f4960 == this.f4960 && c1453.f4959 == this.f4959 && c1453.f4962 == this.f4962;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4962) + AbstractC3761.m6635(this.f4959, AbstractC3761.m6635(this.f4960, Float.hashCode(this.f4961) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f4961 + ", v2 = " + this.f4960 + ", v3 = " + this.f4959 + ", v4 = " + this.f4962;
    }

    @Override // p000.AbstractC1814
    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC1814 mo2171() {
        return new C1453(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // p000.AbstractC1814
    /* JADX INFO: renamed from: ۥُ */
    public final void mo2172(int i, float f) {
        if (i == 0) {
            this.f4961 = f;
            return;
        }
        if (i == 1) {
            this.f4960 = f;
        } else if (i == 2) {
            this.f4959 = f;
        } else {
            if (i != 3) {
                return;
            }
            this.f4962 = f;
        }
    }

    @Override // p000.AbstractC1814
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo2173() {
        return 4;
    }

    @Override // p000.AbstractC1814
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo2174(int i) {
        if (i == 0) {
            return this.f4961;
        }
        if (i == 1) {
            return this.f4960;
        }
        if (i == 2) {
            return this.f4959;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.f4962;
    }

    @Override // p000.AbstractC1814
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo2175() {
        this.f4961 = 0.0f;
        this.f4960 = 0.0f;
        this.f4959 = 0.0f;
        this.f4962 = 0.0f;
    }
}
