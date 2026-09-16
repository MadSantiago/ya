package p000;

/* JADX INFO: renamed from: ۦَؚؖٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3855 extends AbstractC1814 {

    /* JADX INFO: renamed from: ۥؗ */
    public float f12878;

    /* JADX INFO: renamed from: ۥۗ */
    public float f12879;

    /* JADX INFO: renamed from: ۥۣ */
    public float f12880;

    public C3855(float f, float f2, float f3) {
        this.f12880 = f;
        this.f12879 = f2;
        this.f12878 = f3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3855)) {
            return false;
        }
        C3855 c3855 = (C3855) obj;
        return c3855.f12880 == this.f12880 && c3855.f12879 == this.f12879 && c3855.f12878 == this.f12878;
    }

    public final int hashCode() {
        return Float.hashCode(this.f12878) + AbstractC3761.m6635(this.f12879, Float.hashCode(this.f12880) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f12880 + ", v2 = " + this.f12879 + ", v3 = " + this.f12878;
    }

    @Override // p000.AbstractC1814
    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC1814 mo2171() {
        return new C3855(0.0f, 0.0f, 0.0f);
    }

    @Override // p000.AbstractC1814
    /* JADX INFO: renamed from: ۥُ */
    public final void mo2172(int i, float f) {
        if (i == 0) {
            this.f12880 = f;
        } else if (i == 1) {
            this.f12879 = f;
        } else {
            if (i != 2) {
                return;
            }
            this.f12878 = f;
        }
    }

    @Override // p000.AbstractC1814
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo2173() {
        return 3;
    }

    @Override // p000.AbstractC1814
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo2174(int i) {
        if (i == 0) {
            return this.f12880;
        }
        if (i == 1) {
            return this.f12879;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.f12878;
    }

    @Override // p000.AbstractC1814
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo2175() {
        this.f12880 = 0.0f;
        this.f12879 = 0.0f;
        this.f12878 = 0.0f;
    }
}
