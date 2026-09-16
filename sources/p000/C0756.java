package p000;

/* JADX INFO: renamed from: ۥؘؙٕؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0756 implements InterfaceC3015 {

    /* JADX INFO: renamed from: ۥَ */
    public final float f2742;

    /* JADX INFO: renamed from: ۥْ */
    public final float f2743;

    /* JADX INFO: renamed from: ۥٓ */
    public final float f2744;

    /* JADX INFO: renamed from: ۥٖ */
    public final float f2745;

    /* JADX INFO: renamed from: ۦ۟ */
    public final float f2746;

    /* JADX INFO: renamed from: ۦۨ */
    public final float f2747;

    public C0756(float f, float f2, float f3, float f4) {
        int iM4828;
        this.f2747 = f;
        this.f2746 = f2;
        this.f2743 = f3;
        this.f2744 = f4;
        if (!((Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) ? false : true)) {
            AbstractC0388.m902("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f2 + ", " + f3 + ", " + f4 + '.');
        }
        float[] fArr = new float[5];
        float f5 = (f2 - 0.0f) * 3.0f;
        float f6 = (f4 - f2) * 3.0f;
        float f7 = (1.0f - f4) * 3.0f;
        double d = f5;
        double d2 = f6;
        double d3 = f7;
        double d4 = d2 * 2.0d;
        double d5 = (d - d4) + d3;
        if (d5 == 0.0d) {
            iM4828 = d2 == d3 ? 0 : AbstractC2552.m4828((float) ((d4 - d3) / (d4 - (d3 * 2.0d))), fArr, 0);
        } else {
            double d6 = -Math.sqrt((d2 * d2) - (d3 * d));
            double d7 = (-d) + d2;
            int iM4829 = AbstractC2552.m4828((float) ((-(d6 + d7)) / d5), fArr, 0);
            int iM48210 = AbstractC2552.m4828((float) ((d6 - d7) / d5), fArr, iM4829) + iM4829;
            if (iM48210 > 1) {
                float f8 = fArr[0];
                float f9 = fArr[1];
                if (f8 > f9) {
                    fArr[0] = f9;
                    fArr[1] = f8;
                } else if (f8 == f9) {
                    iM4828 = iM48210 - 1;
                }
                iM4828 = iM48210;
            } else {
                iM4828 = iM48210;
            }
        }
        float f10 = (f6 - f5) * 2.0f;
        int iM48211 = AbstractC2552.m4828((-f10) / (((f7 - f6) * 2.0f) - f10), fArr, iM4828) + iM4828;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i = 0; i < iM48211; i++) {
            float f11 = fArr[i];
            float f12 = (((((((((f2 - f4) * 3.0f) + 1.0f) - 0.0f) * f11) + (((f4 - (f2 * 2.0f)) + 0.0f) * 3.0f)) * f11) + f5) * f11) + 0.0f;
            fMin = Math.min(fMin, f12);
            fMax = Math.max(fMax, f12);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        this.f2742 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f2745 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0756)) {
            return false;
        }
        C0756 c0756 = (C0756) obj;
        return this.f2747 == c0756.f2747 && this.f2746 == c0756.f2746 && this.f2743 == c0756.f2743 && this.f2744 == c0756.f2744;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2744) + AbstractC3761.m6635(this.f2743, AbstractC3761.m6635(this.f2746, Float.hashCode(this.f2747) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.f2747);
        sb.append(", b=");
        sb.append(this.f2746);
        sb.append(", c=");
        sb.append(this.f2743);
        sb.append(", d=");
        return AbstractC3761.m6639(sb, this.f2744, ')');
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0092 A[PHI: r3
  0x0092: PHI (r3v27 float) = (r3v5 float), (r3v16 float), (r3v21 float), (r3v31 float), (r3v36 float) binds: [B:128:0x0236, B:117:0x0206, B:92:0x01bb, B:47:0x00e5, B:22:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0162 A[PHI: r12
  0x0162: PHI (r12v41 float) = (r12v25 float), (r12v36 float) binds: [B:68:0x0160, B:81:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.InterfaceC3015
    /* JADX INFO: renamed from: ۦؑ */
    public final float mo1642(float f) {
        float f2;
        if (f <= 0.0f || f >= 1.0f) {
            return f;
        }
        float fMax = Math.max(f, 1.1920929E-7f);
        float f3 = 0.0f - fMax;
        float f4 = this.f2747;
        float f5 = f4 - fMax;
        float f6 = this.f2743;
        float f7 = f6 - fMax;
        double d = f3;
        float f8 = 0.0f;
        double d2 = ((d - (((double) f5) * 2.0d)) + ((double) f7)) * 3.0d;
        double d3 = ((double) (f5 - f3)) * 3.0d;
        double d4 = (((double) (f5 - f7)) * 3.0d) + ((double) (-f3)) + ((double) (1.0f - fMax));
        float f9 = Float.NaN;
        if (Math.abs(d4 - 0.0d) >= 1.0E-7d) {
            double d5 = d2 / d4;
            double d6 = d3 / d4;
            double d7 = d / d4;
            double d8 = ((d6 * 3.0d) - (d5 * d5)) / 9.0d;
            double d9 = ((d7 * 27.0d) + ((((2.0d * d5) * d5) * d5) - ((9.0d * d5) * d6))) / 54.0d;
            double d10 = d8 * d8 * d8;
            double d11 = (d9 * d9) + d10;
            double d12 = d5 / 3.0d;
            if (d11 < 0.0d) {
                double dSqrt = Math.sqrt(-d10);
                double d13 = (-d9) / dSqrt;
                if (d13 < -1.0d) {
                    d13 = -1.0d;
                }
                if (d13 > 1.0d) {
                    d13 = 1.0d;
                }
                double dAcos = Math.acos(d13);
                double dM7983 = AbstractC4593.m7983((float) dSqrt) * 2.0f;
                float fCos = (float) ((Math.cos(dAcos / 3.0d) * dM7983) - d12);
                float f10 = fCos < 0.0f ? 0.0f : fCos;
                if (f10 > 1.0f) {
                    f10 = 1.0f;
                }
                if (Math.abs(f10 - fCos) > 1.05E-6f) {
                    f10 = Float.NaN;
                }
                if (Float.isNaN(f10)) {
                    float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dM7983) - d12);
                    f10 = fCos2 < 0.0f ? 0.0f : fCos2;
                    if (f10 > 1.0f) {
                        f10 = 1.0f;
                    }
                    if (Math.abs(f10 - fCos2) > 1.05E-6f) {
                        f10 = Float.NaN;
                    }
                    if (Float.isNaN(f10)) {
                        float fCos3 = (float) ((Math.cos((dAcos + 12.566370614359172d) / 3.0d) * dM7983) - d12);
                        if (fCos3 >= 0.0f) {
                            f8 = fCos3;
                        }
                        f2 = f8 > 1.0f ? 1.0f : f8;
                        if (Math.abs(f2 - fCos3) <= 1.05E-6f) {
                            f9 = f2;
                        }
                    } else {
                        f9 = f10;
                    }
                } else {
                    f9 = f10;
                }
            } else if (d11 == 0.0d) {
                float f11 = -AbstractC4593.m7983((float) d9);
                float f12 = (float) d12;
                float f13 = (f11 * 2.0f) - f12;
                float f14 = f13 < 0.0f ? 0.0f : f13;
                if (f14 > 1.0f) {
                    f14 = 1.0f;
                }
                if (Math.abs(f14 - f13) > 1.05E-6f) {
                    f14 = Float.NaN;
                }
                if (Float.isNaN(f14)) {
                    float f15 = (-f11) - f12;
                    if (f15 >= 0.0f) {
                        f8 = f15;
                    }
                    f2 = f8 > 1.0f ? 1.0f : f8;
                    if (Math.abs(f2 - f15) <= 1.05E-6f) {
                        f9 = f2;
                    }
                } else {
                    f9 = f14;
                }
            } else {
                double dSqrt2 = Math.sqrt(d11);
                float fM7983 = (float) (((double) (AbstractC4593.m7983((float) ((-d9) + dSqrt2)) - AbstractC4593.m7983((float) (d9 + dSqrt2)))) - d12);
                if (fM7983 >= 0.0f) {
                    f8 = fM7983;
                }
                f2 = f8 > 1.0f ? 1.0f : f8;
                if (Math.abs(f2 - fM7983) <= 1.05E-6f) {
                    f9 = f2;
                }
            }
        } else if (Math.abs(d2 - 0.0d) >= 1.0E-7d) {
            double dSqrt3 = Math.sqrt((d3 * d3) - ((4.0d * d2) * d));
            double d14 = d2 * 2.0d;
            float f16 = (float) ((dSqrt3 - d3) / d14);
            float f17 = f16 < 0.0f ? 0.0f : f16;
            if (f17 > 1.0f) {
                f17 = 1.0f;
            }
            if (Math.abs(f17 - f16) > 1.05E-6f) {
                f17 = Float.NaN;
            }
            if (Float.isNaN(f17)) {
                float f18 = (float) (((-d3) - dSqrt3) / d14);
                if (f18 >= 0.0f) {
                    f8 = f18;
                }
                f2 = f8 > 1.0f ? 1.0f : f8;
                if (Math.abs(f2 - f18) <= 1.05E-6f) {
                    f9 = f2;
                }
            } else {
                f9 = f17;
            }
        } else if (Math.abs(d3 - 0.0d) >= 1.0E-7d) {
            float f19 = (float) ((-d) / d3);
            if (f19 >= 0.0f) {
                f8 = f19;
            }
            f2 = f8 > 1.0f ? 1.0f : f8;
            if (Math.abs(f2 - f19) <= 1.05E-6f) {
                f9 = f2;
            }
        }
        boolean zIsNaN = Float.isNaN(f9);
        float f20 = this.f2744;
        float f21 = this.f2746;
        if (!zIsNaN) {
            float f22 = ((((((f21 - f20) + 0.33333334f) * f9) + (f20 - (2.0f * f21))) * f9) + f21) * 3.0f * f9;
            float f23 = this.f2742;
            if (f22 < f23) {
                f22 = f23;
            }
            float f24 = this.f2745;
            return f22 > f24 ? f24 : f22;
        }
        throw new IllegalArgumentException("The cubic curve with parameters (" + f4 + ", " + f21 + ", " + f6 + ", " + f20 + ") has no solution at " + f);
    }
}
