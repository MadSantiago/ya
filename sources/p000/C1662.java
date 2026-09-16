package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۥَٙؕؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1662 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f5527;

    /* JADX INFO: renamed from: ۥُ */
    public final float f5528;

    /* JADX INFO: renamed from: ۥّ */
    public final float f5529;

    /* JADX INFO: renamed from: ۥْ */
    public final float f5530;

    /* JADX INFO: renamed from: ۥٓ */
    public final float f5531;

    /* JADX INFO: renamed from: ۥۗ */
    public final float f5532;

    /* JADX INFO: renamed from: ۥۜ */
    public float f5533;

    /* JADX INFO: renamed from: ۥۣ */
    public final float f5534;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f5535;

    /* JADX INFO: renamed from: ۦؚ */
    public final float f5536;

    /* JADX INFO: renamed from: ۦٌ */
    public final float f5537;

    /* JADX INFO: renamed from: ۦِ */
    public final float[] f5538;

    /* JADX INFO: renamed from: ۦٛ */
    public float f5539;

    /* JADX INFO: renamed from: ۦۗ */
    public final float f5540;

    /* JADX INFO: renamed from: ۦۙ */
    public final float f5541;

    /* JADX INFO: renamed from: ۦۚ */
    public final float f5542;

    /* JADX INFO: renamed from: ۦ۟ */
    public final boolean f5543;

    /* JADX INFO: renamed from: ۦۨ */
    public final float f5544;

    public C1662(int i, float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        int i2;
        float f7;
        this.f5534 = f;
        this.f5532 = f2;
        this.f5527 = f3;
        this.f5535 = f4;
        this.f5528 = f5;
        this.f5529 = f6;
        float f8 = f5 - f3;
        float f9 = f6 - f4;
        float f10 = 0.0f;
        int i3 = 1;
        boolean z2 = i == 1 || (i == 4 ? f9 > 0.0f : !(i != 5 || f9 >= 0.0f));
        float f11 = z2 ? -1.0f : 1.0f;
        this.f5537 = f11;
        float f12 = 1.0f / (f2 - f);
        this.f5540 = f12;
        float[] fArr = new float[101];
        this.f5538 = fArr;
        boolean z3 = i == 3;
        if (z3 || Math.abs(f8) < 0.001f || Math.abs(f9) < 0.001f) {
            float fHypot = (float) Math.hypot(f9, f8);
            this.f5541 = fHypot;
            this.f5536 = fHypot * f12;
            this.f5530 = f8 * f12;
            this.f5531 = f9 * f12;
            this.f5542 = Float.NaN;
            this.f5544 = Float.NaN;
            z = true;
        } else {
            this.f5542 = f8 * f11;
            this.f5544 = f9 * (-f11);
            this.f5530 = z2 ? f5 : f3;
            this.f5531 = z2 ? f4 : f6;
            float f13 = f5 - f3;
            float f14 = f4 - f6;
            float[] fArr2 = AbstractC2776.f9255;
            float f15 = f14;
            float fHypot2 = 0.0f;
            float f16 = 0.0f;
            int i4 = 1;
            while (true) {
                double d = (float) (((((double) i4) * 90.0d) / 90.0d) * 0.017453292519943295d);
                i2 = i3;
                float fSin = ((float) Math.sin(d)) * f13;
                float fCos = ((float) Math.cos(d)) * f14;
                f7 = f10;
                fHypot2 += (float) Math.hypot(fSin - f16, fCos - f15);
                fArr2[i4] = fHypot2;
                if (i4 == 90) {
                    break;
                }
                i4++;
                f16 = fSin;
                f15 = fCos;
                i3 = i2;
                f10 = f7;
            }
            this.f5541 = fHypot2;
            int i5 = i2;
            while (true) {
                fArr2[i5] = fArr2[i5] / fHypot2;
                if (i5 == 90) {
                    break;
                } else {
                    i5++;
                }
            }
            int length = fArr.length;
            for (int i6 = 0; i6 < length; i6++) {
                float f17 = i6 / 100.0f;
                int iBinarySearch = Arrays.binarySearch(fArr2, 0, 91, f17);
                if (iBinarySearch >= 0) {
                    fArr[i6] = iBinarySearch / 90.0f;
                } else if (iBinarySearch == -1) {
                    fArr[i6] = f7;
                } else {
                    int i7 = -iBinarySearch;
                    int i8 = i7 - 2;
                    float f18 = i8;
                    float f19 = fArr2[i8];
                    fArr[i6] = (((f17 - f19) / (fArr2[i7 - i2] - f19)) + f18) / 90.0f;
                }
            }
            this.f5536 = this.f5541 * this.f5540;
            z = z3;
        }
        this.f5543 = z;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m3470(float f) {
        float f2 = (this.f5537 == -1.0f ? this.f5532 - f : f - this.f5534) * this.f5540;
        float f3 = 0.0f;
        if (f2 > 0.0f) {
            f3 = 1.0f;
            if (f2 < 1.0f) {
                float f4 = f2 * 100.0f;
                int i = (int) f4;
                float[] fArr = this.f5538;
                float f5 = fArr[i];
                f3 = ((fArr[i + 1] - f5) * (f4 - i)) + f5;
            }
        }
        double d = f3 * 1.5707964f;
        this.f5533 = (float) Math.sin(d);
        this.f5539 = (float) Math.cos(d);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final float m3471() {
        float f = this.f5542 * this.f5539;
        float f2 = (-this.f5544) * this.f5533;
        return f2 * this.f5537 * (this.f5536 / ((float) Math.hypot(f, f2)));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final float m3472() {
        float f = this.f5542 * this.f5539;
        return f * this.f5537 * (this.f5536 / ((float) Math.hypot(f, (-this.f5544) * this.f5533)));
    }
}
