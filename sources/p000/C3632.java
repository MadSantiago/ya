package p000;

import android.graphics.Color;

/* JADX INFO: renamed from: ۦًؚ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3632 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f12128;

    /* JADX INFO: renamed from: ۥُ */
    public final float f12129;

    /* JADX INFO: renamed from: ۥّ */
    public final float f12130;

    /* JADX INFO: renamed from: ۥۗ */
    public final float f12131;

    /* JADX INFO: renamed from: ۥۣ */
    public final float f12132;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f12133;

    public /* synthetic */ C3632(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f12132 = f;
        this.f12131 = f2;
        this.f12128 = f3;
        this.f12133 = f4;
        this.f12129 = f5;
        this.f12130 = f6;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static C3632 m6464(float f, float f2, float f3) {
        C1241 c1241 = C1241.f4263;
        float f4 = c1241.f4270;
        double d = ((double) f) / 100.0d;
        Math.sqrt(d);
        float f5 = c1241.f4269 + 4.0f;
        float f6 = c1241.f4272 * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(d))) * c1241.f4270) / f5);
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) f6) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new C3632(f3, f2, f, f7, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C3632 m6465(int i) {
        C1241 c1241 = C1241.f4263;
        float fM9045 = AbstractC5378.m9045(Color.red(i));
        float fM9046 = AbstractC5378.m9045(Color.green(i));
        float fM9047 = AbstractC5378.m9045(Color.blue(i));
        float[][] fArr = AbstractC5378.f17765;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * fM9047) + (fArr2[1] * fM9046) + (fArr2[0] * fM9045);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * fM9047) + (fArr3[1] * fM9046) + (fArr3[0] * fM9045);
        float[] fArr4 = fArr[2];
        float f3 = (fM9047 * fArr4[2]) + (fM9046 * fArr4[1]) + (fM9045 * fArr4[0]);
        float[][] fArr5 = AbstractC5378.f17764;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
        float[] fArr9 = c1241.f4273;
        float f7 = c1241.f4272;
        float f8 = c1241.f4270;
        float f9 = c1241.f4269;
        float f10 = fArr9[0] * f4;
        float f11 = fArr9[1] * f5;
        float f12 = fArr9[2] * f6;
        float f13 = c1241.f4268;
        float fPow = (float) Math.pow(((double) (Math.abs(f10) * f13)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f11) * f13)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f12) * f13)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f10) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f11) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f12) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f14 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d)) / 11.0f;
        float f15 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f16 = fSignum2 * 20.0f;
        float f17 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f16)) / 20.0f;
        float f18 = (((fSignum * 40.0f) + f16) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f15, f14)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f19 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f18 * c1241.f4267) / f9, c1241.f4271 * f8)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f20 = f9 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c1241.f4266), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c1241.f4265) * c1241.f4264) * ((float) Math.sqrt((f15 * f15) + (f14 * f14)))) / (f17 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        Math.sqrt((fPow5 * f8) / f20);
        float f21 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f7 * fSqrt * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f19;
        return new C3632(fAtan2, fSqrt, fPow4, f21, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX INFO: renamed from: ۥؗ */
    public int m6466(C4069 c4069) {
        float f = this.f12131;
        float f2 = this.f12128;
        float fSqrt = (f == 0.0f || f2 == 0.0f) ? 0.0f : f / ((float) Math.sqrt(f2 / 100.0f));
        float f3 = c4069.f13553;
        float f4 = c4069.f13552;
        float fPow = fSqrt / ((float) Math.pow(1.64f - ((float) Math.pow((float) Math.pow(0.28999999165534973d, f3), 0.7300000190734863d)), 1.1111111640930176d));
        float f5 = (this.f12132 * 3.1415927f) / 180.0f;
        float fCos = (((float) Math.cos(2.0f + f5)) + 3.8f) * 0.25f;
        float fPow2 = c4069.f13551 * ((float) Math.pow(f2 / 100.0f, (1.0f / c4069.f13549) / c4069.f13555));
        float f6 = fCos * 3846.1538f * c4069.f13550 * c4069.f13554;
        float f7 = fPow2 / c4069.f13548;
        double d = f5;
        float fSin = (float) Math.sin(d);
        float fCos2 = (float) Math.cos(d);
        float f8 = (((0.305f + f7) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f6 * 23.0f)));
        float f9 = fCos2 * f8;
        float f10 = f8 * fSin;
        float f11 = f7 * 460.0f;
        float f12 = ((288.0f * f10) + ((451.0f * f9) + f11)) / 1403.0f;
        float f13 = ((f11 - (891.0f * f9)) - (261.0f * f10)) / 1403.0f;
        float f14 = ((f11 - (f9 * 220.0f)) - (f10 * 6300.0f)) / 1403.0f;
        float f15 = 100.0f / f4;
        float fSignum = Math.signum(f12) * f15 * ((float) Math.pow(Math.max(0.0f, (Math.abs(f12) * 27.13f) / (400.0f - Math.abs(f12))), 2.3809523582458496d));
        float fSignum2 = Math.signum(f13) * f15 * ((float) Math.pow(Math.max(0.0f, (Math.abs(f13) * 27.13f) / (400.0f - Math.abs(f13))), 2.3809523582458496d));
        float fSignum3 = Math.signum(f14) * f15 * ((float) Math.pow(Math.max(0.0f, (Math.abs(f14) * 27.13f) / (400.0f - Math.abs(f14))), 2.3809523582458496d));
        float[] fArr = c4069.f13557;
        float f16 = fSignum / fArr[0];
        float f17 = fSignum2 / fArr[1];
        float f18 = fSignum3 / fArr[2];
        float[][] fArr2 = AbstractC1605.f5388;
        float[] fArr3 = fArr2[0];
        float f19 = (fArr3[2] * f18) + (fArr3[1] * f17) + (fArr3[0] * f16);
        float[] fArr4 = fArr2[1];
        float f20 = (fArr4[2] * f18) + (fArr4[1] * f17) + (fArr4[0] * f16);
        float[] fArr5 = fArr2[2];
        return AbstractC1373.m2911(f19, f20, (f18 * fArr5[2]) + (f17 * fArr5[1]) + (f16 * fArr5[0]));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX INFO: renamed from: ۦؑ */
    public int m6467(C1241 c1241) {
        float fSqrt;
        float f = this.f12131;
        double d = f;
        float f2 = this.f12128;
        if (d != 0.0d) {
            double d2 = f2;
            if (d2 == 0.0d) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f / ((float) Math.sqrt(d2 / 100.0d));
            }
        } else {
            fSqrt = 0.0f;
        }
        float f3 = c1241.f4266;
        float f4 = c1241.f4268;
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, f3), 0.73d), 1.1111111111111112d);
        double d3 = (this.f12132 * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f;
        float fPow2 = c1241.f4269 * ((float) Math.pow(((double) f2) / 100.0d, (1.0d / ((double) c1241.f4270)) / ((double) c1241.f4271)));
        float f5 = fCos * 3846.1538f * c1241.f4265 * c1241.f4264;
        float f6 = fPow2 / c1241.f4267;
        float fSin = (float) Math.sin(d3);
        float fCos2 = (float) Math.cos(d3);
        float f7 = (((0.305f + f6) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f5 * 23.0f)));
        float f8 = fCos2 * f7;
        float f9 = f7 * fSin;
        float f10 = f6 * 460.0f;
        float f11 = ((288.0f * f9) + ((451.0f * f8) + f10)) / 1403.0f;
        float f12 = ((f10 - (891.0f * f8)) - (261.0f * f9)) / 1403.0f;
        float f13 = ((f10 - (f8 * 220.0f)) - (f9 * 6300.0f)) / 1403.0f;
        float f14 = 100.0f / f4;
        float fSignum = Math.signum(f11) * f14 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f11)) * 27.13d) / (400.0d - ((double) Math.abs(f11)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f12) * f14 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f12)) * 27.13d) / (400.0d - ((double) Math.abs(f12)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f13) * f14 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f13)) * 27.13d) / (400.0d - ((double) Math.abs(f13)))), 2.380952380952381d));
        float[] fArr = c1241.f4273;
        float f15 = fSignum / fArr[0];
        float f16 = fSignum2 / fArr[1];
        float f17 = fSignum3 / fArr[2];
        float[][] fArr2 = AbstractC5378.f17762;
        float[] fArr3 = fArr2[0];
        float f18 = (fArr3[2] * f17) + (fArr3[1] * f16) + (fArr3[0] * f15);
        float[] fArr4 = fArr2[1];
        float f19 = (fArr4[2] * f17) + (fArr4[1] * f16) + (fArr4[0] * f15);
        float[] fArr5 = fArr2[2];
        return AbstractC1373.m2911(f18, f19, (f17 * fArr5[2]) + (f16 * fArr5[1]) + (f15 * fArr5[0]));
    }
}
