package p000;

/* JADX INFO: renamed from: ۦؙؗ۟ٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3568 extends AbstractC3292 {

    /* JADX INFO: renamed from: ۥُ */
    public static final float[] f11817;

    /* JADX INFO: renamed from: ۥّ */
    public static final float[] f11818;

    /* JADX INFO: renamed from: ۦؑ */
    public static final float[] f11819;

    /* JADX INFO: renamed from: ۦۙ */
    public static final float[] f11820;

    static {
        float[] fArrM6758 = AbstractC3801.m6758(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, AbstractC3801.m6755((float[]) C4228.f14024.f14025, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f11819 = fArrM6758;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f11817 = fArr;
        f11818 = AbstractC3801.m6781(fArrM6758);
        f11820 = AbstractC3801.m6781(fArr);
    }

    @Override // p000.AbstractC3292
    /* JADX INFO: renamed from: ۥُ */
    public final float mo6056(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = f11820;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = f11818;
        return (fArr2[8] * f10) + (fArr2[5] * f9) + (fArr2[2] * f8);
    }

    @Override // p000.AbstractC3292
    /* JADX INFO: renamed from: ۥّ */
    public final long mo6057(float f, float f2, float f3, float f4, AbstractC3292 abstractC3292) {
        float[] fArr = f11819;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        float fM7983 = AbstractC4593.m7983(f5);
        float fM7984 = AbstractC4593.m7983(f6);
        float fM7985 = AbstractC4593.m7983(f7);
        float[] fArr2 = f11817;
        return AbstractC4225.m7438((fArr2[6] * fM7985) + (fArr2[3] * fM7984) + (fArr2[0] * fM7983), (fArr2[7] * fM7985) + (fArr2[4] * fM7984) + (fArr2[1] * fM7983), (fArr2[8] * fM7985) + (fArr2[5] * fM7984) + (fArr2[2] * fM7983), f4, abstractC3292);
    }

    @Override // p000.AbstractC3292
    /* JADX INFO: renamed from: ۥۗ */
    public final float mo6058(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    @Override // p000.AbstractC3292
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo6059(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    @Override // p000.AbstractC3292
    /* JADX INFO: renamed from: ۦؑ */
    public final long mo6060(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = f11820;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = f11818;
        return (((long) Float.floatToRawIntBits((fArr2[6] * f10) + ((fArr2[3] * f9) + (fArr2[0] * f8)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr2[7] * f10) + (fArr2[4] * f9) + (fArr2[1] * f8))));
    }
}
