package p000;

/* JADX INFO: renamed from: ۥَؒٗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0994 extends AbstractC1814 {

    /* JADX INFO: renamed from: ۥۗ */
    public float f3549;

    /* JADX INFO: renamed from: ۥۣ */
    public float f3550;

    public C0994(float f, float f2) {
        this.f3550 = f;
        this.f3549 = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0994)) {
            return false;
        }
        C0994 c0994 = (C0994) obj;
        return c0994.f3550 == this.f3550 && c0994.f3549 == this.f3549;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3549) + (Float.hashCode(this.f3550) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f3550 + ", v2 = " + this.f3549;
    }

    @Override // p000.AbstractC1814
    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC1814 mo2171() {
        return new C0994(0.0f, 0.0f);
    }

    @Override // p000.AbstractC1814
    /* JADX INFO: renamed from: ۥُ */
    public final void mo2172(int i, float f) {
        if (i == 0) {
            this.f3550 = f;
        } else {
            if (i != 1) {
                return;
            }
            this.f3549 = f;
        }
    }

    @Override // p000.AbstractC1814
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo2173() {
        return 2;
    }

    @Override // p000.AbstractC1814
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo2174(int i) {
        if (i == 0) {
            return this.f3550;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.f3549;
    }

    @Override // p000.AbstractC1814
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo2175() {
        this.f3550 = 0.0f;
        this.f3549 = 0.0f;
    }
}
