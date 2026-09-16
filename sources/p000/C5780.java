package p000;

/* JADX INFO: renamed from: ۦۦًؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5780 {

    /* JADX INFO: renamed from: ۥۗ */
    public final float f19045;

    /* JADX INFO: renamed from: ۥۣ */
    public final float f19046;

    public C5780(float f, float f2) {
        this.f19046 = f;
        this.f19045 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5780)) {
            return false;
        }
        C5780 c5780 = (C5780) obj;
        return Float.compare(this.f19046, c5780.f19046) == 0 && Float.compare(this.f19045, c5780.f19045) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19045) + (Float.hashCode(this.f19046) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f19046);
        sb.append(", y=");
        return AbstractC3761.m6639(sb, this.f19045, ')');
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final float[] m9595() {
        float f = this.f19046;
        float f2 = this.f19045;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }
}
