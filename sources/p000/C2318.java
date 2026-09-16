package p000;

/* JADX INFO: renamed from: ۥۛؓۥۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2318 {

    /* JADX INFO: renamed from: ۥؗ */
    public final double f7661;

    /* JADX INFO: renamed from: ۥُ */
    public final double f7662;

    /* JADX INFO: renamed from: ۥّ */
    public final double f7663;

    /* JADX INFO: renamed from: ۥۗ */
    public final double f7664;

    /* JADX INFO: renamed from: ۥۣ */
    public final double f7665;

    /* JADX INFO: renamed from: ۦؑ */
    public final double f7666;

    /* JADX INFO: renamed from: ۦۙ */
    public final double f7667;

    public C2318(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.f7665 = d;
        this.f7664 = d2;
        this.f7661 = d3;
        this.f7666 = d4;
        this.f7662 = d5;
        this.f7663 = d6;
        this.f7667 = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            C1078.m2272("Parameters cannot be NaN");
            throw null;
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            C1078.m2272("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            C1078.m2272("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            C1078.m2272("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d4 < 0.0d) {
            C1078.m2272("The transfer function must be increasing");
            throw null;
        }
        if (d2 < 0.0d || d < 0.0d) {
            C1078.m2272("The transfer function must be positive or increasing");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2318)) {
            return false;
        }
        C2318 c2318 = (C2318) obj;
        return Double.compare(this.f7665, c2318.f7665) == 0 && Double.compare(this.f7664, c2318.f7664) == 0 && Double.compare(this.f7661, c2318.f7661) == 0 && Double.compare(this.f7666, c2318.f7666) == 0 && Double.compare(this.f7662, c2318.f7662) == 0 && Double.compare(this.f7663, c2318.f7663) == 0 && Double.compare(this.f7667, c2318.f7667) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f7667) + ((Double.hashCode(this.f7663) + ((Double.hashCode(this.f7662) + ((Double.hashCode(this.f7666) + ((Double.hashCode(this.f7661) + ((Double.hashCode(this.f7664) + (Double.hashCode(this.f7665) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f7665 + ", a=" + this.f7664 + ", b=" + this.f7661 + ", c=" + this.f7666 + ", d=" + this.f7662 + ", e=" + this.f7663 + ", f=" + this.f7667 + ')';
    }

    public /* synthetic */ C2318(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
