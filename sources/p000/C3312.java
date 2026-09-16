package p000;

/* JADX INFO: renamed from: ۦؕٞۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3312 {

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f11086;

    /* JADX INFO: renamed from: ۥُ */
    public double f11087;

    /* JADX INFO: renamed from: ۥّ */
    public double f11088;

    /* JADX INFO: renamed from: ۥۗ */
    public double f11089;

    /* JADX INFO: renamed from: ۥۜ */
    public double f11090;

    /* JADX INFO: renamed from: ۥۣ */
    public double f11091;

    /* JADX INFO: renamed from: ۦؑ */
    public double f11092;

    /* JADX INFO: renamed from: ۦِ */
    public final C4695 f11093;

    /* JADX INFO: renamed from: ۦٛ */
    public double f11094;

    /* JADX INFO: renamed from: ۦۙ */
    public double f11095;

    public C3312() {
        this.f11091 = Math.sqrt(1500.0d);
        this.f11089 = 0.5d;
        this.f11086 = false;
        this.f11094 = Double.MAX_VALUE;
        this.f11093 = new C4695();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final C4695 m6087(double d, double d2, long j) {
        double dSin;
        double dCos;
        if (!this.f11086) {
            if (this.f11094 == Double.MAX_VALUE) {
                C1078.m2276("Error: Final position of the spring must be set before the animation starts");
                return null;
            }
            double d3 = this.f11089;
            if (d3 > 1.0d) {
                double d4 = this.f11091;
                this.f11088 = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.f11089;
                double d6 = this.f11091;
                this.f11095 = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.f11090 = Math.sqrt(1.0d - (d3 * d3)) * this.f11091;
            }
            this.f11086 = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.f11094;
        double d9 = this.f11089;
        if (d9 > 1.0d) {
            double d10 = this.f11095;
            double d11 = ((d10 * d8) - d2) / (d10 - this.f11088);
            double d12 = d8 - d11;
            dSin = (Math.pow(2.718281828459045d, this.f11088 * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d13 = this.f11095;
            double dPow = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
            double d14 = this.f11088;
            dCos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + dPow;
        } else if (d9 == 1.0d) {
            double d15 = this.f11091;
            double d16 = (d15 * d8) + d2;
            double d17 = (d16 * d7) + d8;
            double dPow2 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f11091) * d7) * d17;
            double d18 = -this.f11091;
            dCos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (dPow3 * d18);
            dSin = dPow2;
        } else {
            double d19 = 1.0d / this.f11090;
            double d20 = this.f11091;
            double d21 = ((d9 * d20 * d8) + d2) * d19;
            dSin = ((Math.sin(this.f11090 * d7) * d21) + (Math.cos(this.f11090 * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
            double d22 = this.f11091;
            double d23 = this.f11089;
            double d24 = (-d22) * dSin * d23;
            double dPow4 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
            double d25 = this.f11090;
            double dSin2 = Math.sin(d25 * d7) * (-d25) * d8;
            double d26 = this.f11090;
            dCos = (((Math.cos(d26 * d7) * d21 * d26) + dSin2) * dPow4) + d24;
        }
        float f = (float) (dSin + this.f11094);
        C4695 c4695 = this.f11093;
        c4695.f15484 = f;
        c4695.f15483 = (float) dCos;
        return c4695;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m6088(float f) {
        if (f <= 0.0f) {
            C1078.m2272("Spring stiffness constant must be positive.");
        } else {
            this.f11091 = Math.sqrt(f);
            this.f11086 = false;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m6089(float f) {
        if (f < 0.0f) {
            C1078.m2272("Damping ratio must be non-negative");
        } else {
            this.f11089 = f;
            this.f11086 = false;
        }
    }

    public C3312(float f) {
        this.f11091 = Math.sqrt(1500.0d);
        this.f11089 = 0.5d;
        this.f11086 = false;
        this.f11093 = new C4695();
        this.f11094 = f;
    }
}
