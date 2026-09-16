package p000;

/* JADX INFO: renamed from: ۥؕؕؐ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0467 {

    /* JADX INFO: renamed from: ۦؑ */
    public static C0467 f1687;

    /* JADX INFO: renamed from: ۥؗ */
    public int f1688;

    /* JADX INFO: renamed from: ۥۗ */
    public long f1689;

    /* JADX INFO: renamed from: ۥۣ */
    public long f1690;

    /* JADX INFO: renamed from: ۥۣ */
    public final void m984(double d, double d2, long j) {
        float f = (j - 946728000000L) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = f2;
        double dSin = (Math.sin(f2 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f2) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + ((double) (Math.round(((double) (f - 9.0E-4f)) - d4) + 9.0E-4f)) + d4;
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d5 = 0.01745329238474369d * d;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d5))) / (Math.cos(dAsin) * Math.cos(d5));
        if (dSin3 >= 1.0d) {
            this.f1688 = 1;
            this.f1690 = -1L;
            this.f1689 = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f1688 = 0;
                this.f1690 = -1L;
                this.f1689 = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f1690 = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f1689 = jRound;
            if (jRound >= j || this.f1690 <= j) {
                this.f1688 = 1;
            } else {
                this.f1688 = 0;
            }
        }
    }
}
