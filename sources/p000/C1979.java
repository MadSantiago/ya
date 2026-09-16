package p000;

/* JADX INFO: renamed from: ۥٕٞٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1979 {

    /* JADX INFO: renamed from: ۥۗ */
    public final float f6539;

    /* JADX INFO: renamed from: ۥۣ */
    public final float f6540;

    public C1979(float f, float f2) {
        this.f6540 = f;
        this.f6539 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1979)) {
            return false;
        }
        C1979 c1979 = (C1979) obj;
        return Float.compare(this.f6540, c1979.f6540) == 0 && Float.compare(this.f6539, c1979.f6539) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6539) + (Float.hashCode(this.f6540) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.f6540);
        sb.append(", velocityCoefficient=");
        return AbstractC3761.m6639(sb, this.f6539, ')');
    }
}
