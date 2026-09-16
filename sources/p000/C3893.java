package p000;

/* JADX INFO: renamed from: ۦُِؓۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3893 extends AbstractC1814 {

    /* JADX INFO: renamed from: ۥۣ */
    public float f13013;

    public C3893(float f) {
        this.f13013 = f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3893) && ((C3893) obj).f13013 == this.f13013;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13013);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f13013;
    }

    @Override // p000.AbstractC1814
    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC1814 mo2171() {
        return new C3893(0.0f);
    }

    @Override // p000.AbstractC1814
    /* JADX INFO: renamed from: ۥُ */
    public final void mo2172(int i, float f) {
        if (i == 0) {
            this.f13013 = f;
        }
    }

    @Override // p000.AbstractC1814
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo2173() {
        return 1;
    }

    @Override // p000.AbstractC1814
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo2174(int i) {
        if (i == 0) {
            return this.f13013;
        }
        return 0.0f;
    }

    @Override // p000.AbstractC1814
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo2175() {
        this.f13013 = 0.0f;
    }
}
