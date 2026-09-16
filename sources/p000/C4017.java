package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۦّْؓۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4017 extends AbstractC3292 {

    /* JADX INFO: renamed from: ۥٓ */
    public static final C0178 f13385 = new C0178(8);

    /* JADX INFO: renamed from: ۥُ */
    public final float f13386;

    /* JADX INFO: renamed from: ۥّ */
    public final float f13387;

    /* JADX INFO: renamed from: ۥْ */
    public final boolean f13388;

    /* JADX INFO: renamed from: ۥۜ */
    public final float[] f13389;

    /* JADX INFO: renamed from: ۦؑ */
    public final C5780 f13390;

    /* JADX INFO: renamed from: ۦؚ */
    public final C0513 f13391;

    /* JADX INFO: renamed from: ۦٌ */
    public final C0641 f13392;

    /* JADX INFO: renamed from: ۦِ */
    public final float[] f13393;

    /* JADX INFO: renamed from: ۦٛ */
    public final float[] f13394;

    /* JADX INFO: renamed from: ۦۗ */
    public final InterfaceC3558 f13395;

    /* JADX INFO: renamed from: ۦۙ */
    public final C2318 f13396;

    /* JADX INFO: renamed from: ۦۚ */
    public final InterfaceC3558 f13397;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C0641 f13398;

    /* JADX INFO: renamed from: ۦۨ */
    public final C0513 f13399;

    /* JADX WARN: Code duplicated, block: B:41:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:42:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:45:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:53:0x0213  */
    /* JADX WARN: Code duplicated, block: B:56:0x021c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0230  */
    /* JADX WARN: Code duplicated, block: B:65:0x0248  */
    /* JADX WARN: Code duplicated, block: B:75:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x020e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public C4017(String str, float[] fArr, C5780 c5780, float[] fArr2, InterfaceC3558 interfaceC3558, InterfaceC3558 interfaceC3559, float f, float f2, C2318 c2318, int i) {
        char c;
        float f3;
        float[] fArr3;
        float f4;
        float[] fArr4;
        C4017 c4017;
        double d;
        boolean z;
        int i2;
        super(12884901888L, str, i);
        this.f13390 = c5780;
        this.f13386 = f;
        this.f13387 = f2;
        this.f13396 = c2318;
        this.f13395 = interfaceC3558;
        int i3 = 1;
        this.f13391 = new C0513(this, i3);
        int i4 = 0;
        this.f13392 = new C0641(this, i4);
        this.f13397 = interfaceC3559;
        this.f13399 = new C0513(this, i4);
        this.f13398 = new C0641(this, i3);
        if (fArr.length != 6 && fArr.length != 9) {
            C1078.m2272("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        float[] fArr5 = new float[6];
        if (fArr.length == 9) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = f5 + f6 + fArr[2];
            fArr5[0] = f5 / f7;
            fArr5[1] = f6 / f7;
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = f8 + f9 + fArr[5];
            fArr5[2] = f8 / f10;
            fArr5[3] = f9 / f10;
            float f11 = fArr[6];
            float f12 = fArr[7];
            float f13 = f11 + f12 + fArr[8];
            fArr5[4] = f11 / f13;
            fArr5[5] = f12 / f13;
        } else {
            System.arraycopy(fArr, 0, fArr5, 0, 6);
        }
        this.f13389 = fArr5;
        if (fArr2 == null) {
            float f14 = fArr5[0];
            float f15 = fArr5[1];
            float f16 = fArr5[2];
            float f17 = fArr5[3];
            float f18 = fArr5[4];
            float f19 = fArr5[5];
            f3 = 1.0f;
            float f20 = c5780.f19046;
            c = 1;
            float f21 = c5780.f19045;
            float f22 = 1.0f - f14;
            float f23 = f22 / f15;
            float f24 = 1.0f - f16;
            float f25 = 1.0f - f18;
            float f26 = (1.0f - f20) / f21;
            float f27 = f14 / f15;
            float f28 = (f16 / f17) - f27;
            float f29 = (f20 / f21) - f27;
            float f30 = (f24 / f17) - f23;
            float f31 = (f18 / f19) - f27;
            float f32 = (((f26 - f23) * f28) - (f29 * f30)) / ((((f25 / f19) - f23) * f28) - (f30 * f31));
            float f33 = (f29 - (f31 * f32)) / f28;
            float f34 = (1.0f - f33) - f32;
            float f35 = f34 / f15;
            float f36 = f33 / f17;
            float f37 = f32 / f19;
            fArr3 = new float[]{f14 * f35, f34, (f22 - f15) * f35, f16 * f36, f33, (f24 - f17) * f36, f18 * f37, f32, (f25 - f19) * f37};
            this.f13394 = fArr3;
        } else {
            c = 1;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f13394 = fArr2;
            fArr3 = fArr2;
        }
        this.f13393 = AbstractC3801.m6781(fArr3);
        float fM3035 = AbstractC1434.m3035(fArr5);
        float[] fArr6 = C3444.f11438;
        if (fM3035 / AbstractC1434.m3035(C3444.f11436) > 0.9f) {
            float[] fArr7 = C3444.f11438;
            float f38 = fArr5[0];
            float f39 = fArr7[0];
            float f40 = fArr5[c];
            float f41 = fArr7[c];
            float f42 = fArr5[2];
            float f43 = fArr7[2];
            float f44 = fArr5[3];
            float f45 = fArr7[3];
            float f46 = fArr5[4];
            float f47 = fArr7[4];
            float f48 = fArr5[5];
            float f49 = fArr7[5];
            f4 = 0.0f;
            float[] fArr8 = new float[6];
            fArr8[0] = f38 - f39;
            fArr8[c] = f40 - f41;
            fArr8[2] = f42 - f43;
            fArr8[3] = f44 - f45;
            fArr8[4] = f46 - f47;
            fArr8[5] = f48 - f49;
            float f50 = fArr8[0];
            float f51 = fArr8[c];
            if (((f41 - f49) * f50) - ((f39 - f47) * f51) >= 0.0f && ((f39 - f43) * f51) - ((f41 - f45) * f50) >= 0.0f) {
                float f52 = fArr8[2];
                float f53 = fArr8[3];
                if (((f45 - f41) * f52) - ((f43 - f39) * f53) >= 0.0f && ((f43 - f47) * f53) - ((f45 - f49) * f52) >= 0.0f) {
                    float f54 = fArr8[4];
                    float f55 = fArr8[5];
                    if (((f49 - f45) * f54) - ((f47 - f43) * f55) < 0.0f || ((f47 - f39) * f55) - ((f49 - f41) * f54) < 0.0f) {
                    }
                }
            }
            if (i != 0) {
                fArr4 = C3444.f11438;
                if (fArr5 == fArr4) {
                    i2 = 0;
                    while (true) {
                        if (i2 < 6) {
                            if (Float.compare(fArr5[i2], fArr4[i2]) != 0 || Math.abs(fArr5[i2] - fArr4[i2]) <= 0.001f) {
                                i2++;
                            }
                        } else if (AbstractC3801.m6757(c5780, AbstractC5568.f18382)) {
                            float[] fArr9 = C3444.f11438;
                            c4017 = C3444.f11429;
                            d = 0.0d;
                            while (true) {
                                if (d <= 1.0d) {
                                    z = c;
                                } else if (Math.abs(interfaceC3558.mo399(d) - c4017.f13395.mo399(d)) > 0.001d) {
                                }
                                d += 0.00392156862745098d;
                            }
                        }
                    }
                } else if (AbstractC3801.m6757(c5780, AbstractC5568.f18382) && f == f4 && f2 == f3) {
                    float[] fArr10 = C3444.f11438;
                    c4017 = C3444.f11429;
                    d = 0.0d;
                    while (true) {
                        if (d <= 1.0d) {
                            z = c;
                        } else if (Math.abs(interfaceC3558.mo399(d) - c4017.f13395.mo399(d)) > 0.001d && Math.abs(interfaceC3559.mo399(d) - c4017.f13397.mo399(d)) <= 0.001d) {
                            d += 0.00392156862745098d;
                        }
                    }
                }
                z = 0;
            } else {
                z = c;
            }
            this.f13388 = z;
        }
        f4 = 0.0f;
        int i5 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        if (i != 0) {
            fArr4 = C3444.f11438;
            if (fArr5 == fArr4) {
                i2 = 0;
                while (true) {
                    if (i2 < 6) {
                        if (Float.compare(fArr5[i2], fArr4[i2]) != 0) {
                        }
                        i2++;
                    } else if (AbstractC3801.m6757(c5780, AbstractC5568.f18382)) {
                        float[] fArr11 = C3444.f11438;
                        c4017 = C3444.f11429;
                        d = 0.0d;
                        while (true) {
                            if (d <= 1.0d) {
                                z = c;
                            } else if (Math.abs(interfaceC3558.mo399(d) - c4017.f13395.mo399(d)) > 0.001d) {
                            }
                            d += 0.00392156862745098d;
                        }
                    }
                }
            } else if (AbstractC3801.m6757(c5780, AbstractC5568.f18382)) {
                float[] fArr12 = C3444.f11438;
                c4017 = C3444.f11429;
                d = 0.0d;
                while (true) {
                    if (d <= 1.0d) {
                        z = c;
                    } else if (Math.abs(interfaceC3558.mo399(d) - c4017.f13395.mo399(d)) > 0.001d) {
                    }
                    d += 0.00392156862745098d;
                }
            }
            z = 0;
        } else {
            z = c;
        }
        this.f13388 = z;
    }

    @Override // p000.AbstractC3292
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4017.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C4017 c4017 = (C4017) obj;
        if (Float.compare(c4017.f13386, this.f13386) != 0 || Float.compare(c4017.f13387, this.f13387) != 0 || !AbstractC3831.m6874(this.f13390, c4017.f13390) || !Arrays.equals(this.f13389, c4017.f13389)) {
            return false;
        }
        C2318 c2318 = c4017.f13396;
        C2318 c2319 = this.f13396;
        if (c2319 != null) {
            return AbstractC3831.m6874(c2319, c2318);
        }
        if (c2318 == null) {
            return true;
        }
        if (AbstractC3831.m6874(this.f13395, c4017.f13395)) {
            return AbstractC3831.m6874(this.f13397, c4017.f13397);
        }
        return false;
    }

    @Override // p000.AbstractC3292
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f13389) + ((this.f13390.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.f13386;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f13387;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        C2318 c2318 = this.f13396;
        int iHashCode2 = iFloatToIntBits2 + (c2318 != null ? c2318.hashCode() : 0);
        if (c2318 != null) {
            return iHashCode2;
        }
        return this.f13397.hashCode() + ((this.f13395.hashCode() + (iHashCode2 * 31)) * 31);
    }

    @Override // p000.AbstractC3292
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo6055() {
        return this.f13388;
    }

    @Override // p000.AbstractC3292
    /* JADX INFO: renamed from: ۥُ */
    public final float mo6056(float f, float f2, float f3) {
        double d = f;
        C0641 c0641 = this.f13398;
        float fMo399 = (float) c0641.mo399(d);
        float fMo3910 = (float) c0641.mo399(f2);
        float fMo3911 = (float) c0641.mo399(f3);
        float[] fArr = this.f13394;
        return (fArr[8] * fMo3911) + (fArr[5] * fMo3910) + (fArr[2] * fMo399);
    }

    @Override // p000.AbstractC3292
    /* JADX INFO: renamed from: ۥّ */
    public final long mo6057(float f, float f2, float f3, float f4, AbstractC3292 abstractC3292) {
        float[] fArr = this.f13393;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        C0641 c0641 = this.f13392;
        return AbstractC4225.m7438((float) c0641.mo399(f5), (float) c0641.mo399(f6), (float) c0641.mo399(f7), f4, abstractC3292);
    }

    @Override // p000.AbstractC3292
    /* JADX INFO: renamed from: ۥۗ */
    public final float mo6058(int i) {
        return this.f13386;
    }

    @Override // p000.AbstractC3292
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo6059(int i) {
        return this.f13387;
    }

    @Override // p000.AbstractC3292
    /* JADX INFO: renamed from: ۦؑ */
    public final long mo6060(float f, float f2, float f3) {
        double d = f;
        C0641 c0641 = this.f13398;
        float fMo399 = (float) c0641.mo399(d);
        float fMo3910 = (float) c0641.mo399(f2);
        float fMo3911 = (float) c0641.mo399(f3);
        float[] fArr = this.f13394;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits((fArr[6] * fMo3911) + ((fArr[3] * fMo3910) + (fArr[0] * fMo399)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr[7] * fMo3911) + (fArr[4] * fMo3910) + (fArr[1] * fMo399))));
    }

    public C4017(String str, float[] fArr, C5780 c5780, final C2318 c2318, int i) {
        double d;
        InterfaceC3558 interfaceC3558;
        InterfaceC3558 interfaceC3559;
        double d2 = c2318.f7665;
        final int i2 = 0;
        final int i3 = 1;
        boolean z = d2 == -3.0d;
        double d3 = c2318.f7667;
        double d4 = c2318.f7663;
        if (z) {
            d = -3.0d;
            final int i4 = 4;
            interfaceC3558 = new InterfaceC3558() { // from class: ۦۡؖۥۤ
                @Override // p000.InterfaceC3558
                /* JADX INFO: renamed from: ۦؑ */
                public final double mo399(double d5) {
                    int i5 = i4;
                    C2318 c2319 = c2318;
                    switch (i5) {
                        case 0:
                            float[] fArr2 = C3444.f11438;
                            return C3444.m6225(c2319, d5);
                        case 1:
                            float[] fArr3 = C3444.f11438;
                            return C3444.m6223(c2319, d5);
                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                            double d6 = c2319.f7664;
                            return d5 >= c2319.f7662 ? Math.pow((d6 * d5) + c2319.f7661, c2319.f7665) : c2319.f7666 * d5;
                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                            double d7 = c2319.f7664;
                            double d8 = c2319.f7661;
                            double d9 = c2319.f7666;
                            return d5 >= c2319.f7662 ? Math.pow((d7 * d5) + d8, c2319.f7665) + c2319.f7663 : (d9 * d5) + c2319.f7667;
                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = C3444.f11438;
                            return C3444.m6224(c2319, d5);
                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = C3444.f11438;
                            return C3444.m6226(c2319, d5);
                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = c2319.f7664;
                            double d11 = c2319.f7661;
                            double d12 = c2319.f7666;
                            return d5 >= c2319.f7662 * d12 ? (Math.pow(d5, 1.0d / c2319.f7665) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = c2319.f7664;
                            double d14 = c2319.f7661;
                            double d15 = c2319.f7666;
                            return d5 >= c2319.f7662 * d15 ? (Math.pow(d5 - c2319.f7663, 1.0d / c2319.f7665) - d14) / d13 : (d5 - c2319.f7667) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final int i5 = 5;
                interfaceC3558 = new InterfaceC3558() { // from class: ۦۡؖۥۤ
                    @Override // p000.InterfaceC3558
                    /* JADX INFO: renamed from: ۦؑ */
                    public final double mo399(double d5) {
                        int i6 = i5;
                        C2318 c2319 = c2318;
                        switch (i6) {
                            case 0:
                                float[] fArr2 = C3444.f11438;
                                return C3444.m6225(c2319, d5);
                            case 1:
                                float[] fArr3 = C3444.f11438;
                                return C3444.m6223(c2319, d5);
                            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                double d6 = c2319.f7664;
                                return d5 >= c2319.f7662 ? Math.pow((d6 * d5) + c2319.f7661, c2319.f7665) : c2319.f7666 * d5;
                            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                double d7 = c2319.f7664;
                                double d8 = c2319.f7661;
                                double d9 = c2319.f7666;
                                return d5 >= c2319.f7662 ? Math.pow((d7 * d5) + d8, c2319.f7665) + c2319.f7663 : (d9 * d5) + c2319.f7667;
                            case C4261.LONG_FIELD_NUMBER /* 4 */:
                                float[] fArr4 = C3444.f11438;
                                return C3444.m6224(c2319, d5);
                            case C4261.STRING_FIELD_NUMBER /* 5 */:
                                float[] fArr5 = C3444.f11438;
                                return C3444.m6226(c2319, d5);
                            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                double d10 = c2319.f7664;
                                double d11 = c2319.f7661;
                                double d12 = c2319.f7666;
                                return d5 >= c2319.f7662 * d12 ? (Math.pow(d5, 1.0d / c2319.f7665) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = c2319.f7664;
                                double d14 = c2319.f7661;
                                double d15 = c2319.f7666;
                                return d5 >= c2319.f7662 * d15 ? (Math.pow(d5 - c2319.f7663, 1.0d / c2319.f7665) - d14) / d13 : (d5 - c2319.f7667) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final int i6 = 6;
                interfaceC3558 = new InterfaceC3558() { // from class: ۦۡؖۥۤ
                    @Override // p000.InterfaceC3558
                    /* JADX INFO: renamed from: ۦؑ */
                    public final double mo399(double d5) {
                        int i7 = i6;
                        C2318 c2319 = c2318;
                        switch (i7) {
                            case 0:
                                float[] fArr2 = C3444.f11438;
                                return C3444.m6225(c2319, d5);
                            case 1:
                                float[] fArr3 = C3444.f11438;
                                return C3444.m6223(c2319, d5);
                            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                double d6 = c2319.f7664;
                                return d5 >= c2319.f7662 ? Math.pow((d6 * d5) + c2319.f7661, c2319.f7665) : c2319.f7666 * d5;
                            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                double d7 = c2319.f7664;
                                double d8 = c2319.f7661;
                                double d9 = c2319.f7666;
                                return d5 >= c2319.f7662 ? Math.pow((d7 * d5) + d8, c2319.f7665) + c2319.f7663 : (d9 * d5) + c2319.f7667;
                            case C4261.LONG_FIELD_NUMBER /* 4 */:
                                float[] fArr4 = C3444.f11438;
                                return C3444.m6224(c2319, d5);
                            case C4261.STRING_FIELD_NUMBER /* 5 */:
                                float[] fArr5 = C3444.f11438;
                                return C3444.m6226(c2319, d5);
                            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                double d10 = c2319.f7664;
                                double d11 = c2319.f7661;
                                double d12 = c2319.f7666;
                                return d5 >= c2319.f7662 * d12 ? (Math.pow(d5, 1.0d / c2319.f7665) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = c2319.f7664;
                                double d14 = c2319.f7661;
                                double d15 = c2319.f7666;
                                return d5 >= c2319.f7662 * d15 ? (Math.pow(d5 - c2319.f7663, 1.0d / c2319.f7665) - d14) / d13 : (d5 - c2319.f7667) / d15;
                        }
                    }
                };
            } else {
                final int i7 = 7;
                interfaceC3558 = new InterfaceC3558() { // from class: ۦۡؖۥۤ
                    @Override // p000.InterfaceC3558
                    /* JADX INFO: renamed from: ۦؑ */
                    public final double mo399(double d5) {
                        int i8 = i7;
                        C2318 c2319 = c2318;
                        switch (i8) {
                            case 0:
                                float[] fArr2 = C3444.f11438;
                                return C3444.m6225(c2319, d5);
                            case 1:
                                float[] fArr3 = C3444.f11438;
                                return C3444.m6223(c2319, d5);
                            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                double d6 = c2319.f7664;
                                return d5 >= c2319.f7662 ? Math.pow((d6 * d5) + c2319.f7661, c2319.f7665) : c2319.f7666 * d5;
                            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                double d7 = c2319.f7664;
                                double d8 = c2319.f7661;
                                double d9 = c2319.f7666;
                                return d5 >= c2319.f7662 ? Math.pow((d7 * d5) + d8, c2319.f7665) + c2319.f7663 : (d9 * d5) + c2319.f7667;
                            case C4261.LONG_FIELD_NUMBER /* 4 */:
                                float[] fArr4 = C3444.f11438;
                                return C3444.m6224(c2319, d5);
                            case C4261.STRING_FIELD_NUMBER /* 5 */:
                                float[] fArr5 = C3444.f11438;
                                return C3444.m6226(c2319, d5);
                            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                double d10 = c2319.f7664;
                                double d11 = c2319.f7661;
                                double d12 = c2319.f7666;
                                return d5 >= c2319.f7662 * d12 ? (Math.pow(d5, 1.0d / c2319.f7665) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = c2319.f7664;
                                double d14 = c2319.f7661;
                                double d15 = c2319.f7666;
                                return d5 >= c2319.f7662 * d15 ? (Math.pow(d5 - c2319.f7663, 1.0d / c2319.f7665) - d14) / d13 : (d5 - c2319.f7667) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            interfaceC3559 = new InterfaceC3558() { // from class: ۦۡؖۥۤ
                @Override // p000.InterfaceC3558
                /* JADX INFO: renamed from: ۦؑ */
                public final double mo399(double d5) {
                    int i8 = i2;
                    C2318 c2319 = c2318;
                    switch (i8) {
                        case 0:
                            float[] fArr2 = C3444.f11438;
                            return C3444.m6225(c2319, d5);
                        case 1:
                            float[] fArr3 = C3444.f11438;
                            return C3444.m6223(c2319, d5);
                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                            double d6 = c2319.f7664;
                            return d5 >= c2319.f7662 ? Math.pow((d6 * d5) + c2319.f7661, c2319.f7665) : c2319.f7666 * d5;
                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                            double d7 = c2319.f7664;
                            double d8 = c2319.f7661;
                            double d9 = c2319.f7666;
                            return d5 >= c2319.f7662 ? Math.pow((d7 * d5) + d8, c2319.f7665) + c2319.f7663 : (d9 * d5) + c2319.f7667;
                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = C3444.f11438;
                            return C3444.m6224(c2319, d5);
                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = C3444.f11438;
                            return C3444.m6226(c2319, d5);
                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = c2319.f7664;
                            double d11 = c2319.f7661;
                            double d12 = c2319.f7666;
                            return d5 >= c2319.f7662 * d12 ? (Math.pow(d5, 1.0d / c2319.f7665) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = c2319.f7664;
                            double d14 = c2319.f7661;
                            double d15 = c2319.f7666;
                            return d5 >= c2319.f7662 * d15 ? (Math.pow(d5 - c2319.f7663, 1.0d / c2319.f7665) - d14) / d13 : (d5 - c2319.f7667) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            interfaceC3559 = new InterfaceC3558() { // from class: ۦۡؖۥۤ
                @Override // p000.InterfaceC3558
                /* JADX INFO: renamed from: ۦؑ */
                public final double mo399(double d5) {
                    int i8 = i3;
                    C2318 c2319 = c2318;
                    switch (i8) {
                        case 0:
                            float[] fArr2 = C3444.f11438;
                            return C3444.m6225(c2319, d5);
                        case 1:
                            float[] fArr3 = C3444.f11438;
                            return C3444.m6223(c2319, d5);
                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                            double d6 = c2319.f7664;
                            return d5 >= c2319.f7662 ? Math.pow((d6 * d5) + c2319.f7661, c2319.f7665) : c2319.f7666 * d5;
                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                            double d7 = c2319.f7664;
                            double d8 = c2319.f7661;
                            double d9 = c2319.f7666;
                            return d5 >= c2319.f7662 ? Math.pow((d7 * d5) + d8, c2319.f7665) + c2319.f7663 : (d9 * d5) + c2319.f7667;
                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = C3444.f11438;
                            return C3444.m6224(c2319, d5);
                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = C3444.f11438;
                            return C3444.m6226(c2319, d5);
                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = c2319.f7664;
                            double d11 = c2319.f7661;
                            double d12 = c2319.f7666;
                            return d5 >= c2319.f7662 * d12 ? (Math.pow(d5, 1.0d / c2319.f7665) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = c2319.f7664;
                            double d14 = c2319.f7661;
                            double d15 = c2319.f7666;
                            return d5 >= c2319.f7662 * d15 ? (Math.pow(d5 - c2319.f7663, 1.0d / c2319.f7665) - d14) / d13 : (d5 - c2319.f7667) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final int i8 = 2;
            interfaceC3559 = new InterfaceC3558() { // from class: ۦۡؖۥۤ
                @Override // p000.InterfaceC3558
                /* JADX INFO: renamed from: ۦؑ */
                public final double mo399(double d5) {
                    int i9 = i8;
                    C2318 c2319 = c2318;
                    switch (i9) {
                        case 0:
                            float[] fArr2 = C3444.f11438;
                            return C3444.m6225(c2319, d5);
                        case 1:
                            float[] fArr3 = C3444.f11438;
                            return C3444.m6223(c2319, d5);
                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                            double d6 = c2319.f7664;
                            return d5 >= c2319.f7662 ? Math.pow((d6 * d5) + c2319.f7661, c2319.f7665) : c2319.f7666 * d5;
                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                            double d7 = c2319.f7664;
                            double d8 = c2319.f7661;
                            double d9 = c2319.f7666;
                            return d5 >= c2319.f7662 ? Math.pow((d7 * d5) + d8, c2319.f7665) + c2319.f7663 : (d9 * d5) + c2319.f7667;
                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = C3444.f11438;
                            return C3444.m6224(c2319, d5);
                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = C3444.f11438;
                            return C3444.m6226(c2319, d5);
                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = c2319.f7664;
                            double d11 = c2319.f7661;
                            double d12 = c2319.f7666;
                            return d5 >= c2319.f7662 * d12 ? (Math.pow(d5, 1.0d / c2319.f7665) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = c2319.f7664;
                            double d14 = c2319.f7661;
                            double d15 = c2319.f7666;
                            return d5 >= c2319.f7662 * d15 ? (Math.pow(d5 - c2319.f7663, 1.0d / c2319.f7665) - d14) / d13 : (d5 - c2319.f7667) / d15;
                    }
                }
            };
        } else {
            final int i9 = 3;
            interfaceC3559 = new InterfaceC3558() { // from class: ۦۡؖۥۤ
                @Override // p000.InterfaceC3558
                /* JADX INFO: renamed from: ۦؑ */
                public final double mo399(double d5) {
                    int i10 = i9;
                    C2318 c2319 = c2318;
                    switch (i10) {
                        case 0:
                            float[] fArr2 = C3444.f11438;
                            return C3444.m6225(c2319, d5);
                        case 1:
                            float[] fArr3 = C3444.f11438;
                            return C3444.m6223(c2319, d5);
                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                            double d6 = c2319.f7664;
                            return d5 >= c2319.f7662 ? Math.pow((d6 * d5) + c2319.f7661, c2319.f7665) : c2319.f7666 * d5;
                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                            double d7 = c2319.f7664;
                            double d8 = c2319.f7661;
                            double d9 = c2319.f7666;
                            return d5 >= c2319.f7662 ? Math.pow((d7 * d5) + d8, c2319.f7665) + c2319.f7663 : (d9 * d5) + c2319.f7667;
                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = C3444.f11438;
                            return C3444.m6224(c2319, d5);
                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = C3444.f11438;
                            return C3444.m6226(c2319, d5);
                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = c2319.f7664;
                            double d11 = c2319.f7661;
                            double d12 = c2319.f7666;
                            return d5 >= c2319.f7662 * d12 ? (Math.pow(d5, 1.0d / c2319.f7665) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = c2319.f7664;
                            double d14 = c2319.f7661;
                            double d15 = c2319.f7666;
                            return d5 >= c2319.f7662 * d15 ? (Math.pow(d5 - c2319.f7663, 1.0d / c2319.f7665) - d14) / d13 : (d5 - c2319.f7667) / d15;
                    }
                }
            };
        }
        this(str, fArr, c5780, null, interfaceC3558, interfaceC3559, 0.0f, 1.0f, c2318, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4017(String str, float[] fArr, C5780 c5780, final double d, float f, float f2, int i) {
        InterfaceC3558 interfaceC3558;
        InterfaceC3558 interfaceC3559 = f13385;
        if (d == 1.0d) {
            interfaceC3558 = interfaceC3559;
        } else {
            final int i2 = 0;
            interfaceC3558 = new InterfaceC3558() { // from class: ۥٔؒۡۨ
                @Override // p000.InterfaceC3558
                /* JADX INFO: renamed from: ۦؑ */
                public final double mo399(double d2) {
                    switch (i2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            interfaceC3559 = new InterfaceC3558() { // from class: ۥٔؒۡۨ
                @Override // p000.InterfaceC3558
                /* JADX INFO: renamed from: ۦؑ */
                public final double mo399(double d2) {
                    switch (i3) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        InterfaceC3558 interfaceC35510 = interfaceC3559;
        this(str, fArr, c5780, null, interfaceC3558, interfaceC35510, f, f2, new C2318(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
