package p000;

/* JADX INFO: renamed from: ۥّۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2649 extends AbstractC3008 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f8797;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f8798;

    public C2649(float f, float f2) {
        super(3);
        this.f8797 = f;
        this.f8798 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2649)) {
            return false;
        }
        C2649 c2649 = (C2649) obj;
        return Float.compare(this.f8797, c2649.f8797) == 0 && Float.compare(this.f8798, c2649.f8798) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8798) + (Float.hashCode(this.f8797) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f8797);
        sb.append(", y=");
        return AbstractC3761.m6639(sb, this.f8798, ')');
    }
}
