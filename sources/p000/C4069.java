package p000;

/* JADX INFO: renamed from: ۦْؓٗٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4069 {

    /* JADX INFO: renamed from: ۦۗ */
    public static final C4069 f13547;

    /* JADX INFO: renamed from: ۥؗ */
    public final float f13548;

    /* JADX INFO: renamed from: ۥُ */
    public final float f13549;

    /* JADX INFO: renamed from: ۥّ */
    public final float f13550;

    /* JADX INFO: renamed from: ۥۗ */
    public final float f13551;

    /* JADX INFO: renamed from: ۥۜ */
    public final float f13552;

    /* JADX INFO: renamed from: ۥۣ */
    public final float f13553;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f13554;

    /* JADX INFO: renamed from: ۦِ */
    public final float f13555;

    /* JADX INFO: renamed from: ۦٛ */
    public final float f13556;

    /* JADX INFO: renamed from: ۦۙ */
    public final float[] f13557;

    static {
        float[] fArr = AbstractC1605.f5384;
        float fPow = (float) (((Math.pow(0.5689655172413793d, 3.0d) * 100.0d) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = AbstractC1605.f5390;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = (fArr3[1] * f3) + f2;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4;
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
        float fExp = (1.0f - (((float) Math.exp(((-fPow) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f6) * fExp) + 1.0f) - fExp, (((100.0f / f7) * fExp) + 1.0f) - fExp, (((100.0f / f8) * fExp) + 1.0f) - fExp};
        float f9 = 1.0f / ((5.0f * fPow) + 1.0f);
        float f10 = f9 * f9 * f9 * f9;
        float f11 = 1.0f - f10;
        float fCbrt = (0.1f * f11 * f11 * ((float) Math.cbrt(((double) fPow) * 5.0d))) + (f10 * fPow);
        float fPow2 = ((float) (Math.pow(0.5689655172413793d, 3.0d) * 100.0d)) / fArr[1];
        double d2 = fPow2;
        float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float fPow3 = 0.725f / ((float) Math.pow(d2, 0.20000000298023224d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * fCbrt) * f6) / 100.0f, 0.41999998688697815d), (float) Math.pow(((fArr6[1] * fCbrt) * f7) / 100.0f, 0.41999998688697815d), (float) Math.pow(((fArr6[2] * fCbrt) * f8) / 100.0f, 0.41999998688697815d)};
        float f12 = fArr7[0];
        float f13 = (f12 * 400.0f) / (f12 + 27.13f);
        float f14 = fArr7[1];
        float f15 = (f14 * 400.0f) / (f14 + 27.13f);
        float f16 = fArr7[2];
        float[] fArr8 = {f13, f15, (400.0f * f16) / (f16 + 27.13f)};
        f13547 = new C4069(fPow2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow3, fPow3, fPow3, 0.69000006f, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public C4069(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f13553 = f;
        this.f13551 = f2;
        this.f13548 = f3;
        this.f13554 = f4;
        this.f13549 = f5;
        this.f13550 = f6;
        this.f13557 = fArr;
        this.f13552 = f7;
        this.f13556 = f8;
        this.f13555 = f9;
    }
}
