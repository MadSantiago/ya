package p000;

/* JADX INFO: renamed from: ۦۚؕۧؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5186 implements InterfaceC1861 {

    /* JADX INFO: renamed from: ۥؓ */
    public C4228 f17149;

    /* JADX INFO: renamed from: ۥؖ */
    public float[] f17150;

    /* JADX INFO: renamed from: ۥَ */
    public int[] f17151 = AbstractC3085.f10346;

    /* JADX INFO: renamed from: ۥْ */
    public final int f17152;

    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC3015 f17153;

    /* JADX INFO: renamed from: ۥٖ */
    public float[] f17154;

    /* JADX INFO: renamed from: ۥٙ */
    public float[] f17155;

    /* JADX INFO: renamed from: ۥۖ */
    public AbstractC1814 f17156;

    /* JADX INFO: renamed from: ۦٕ */
    public AbstractC1814 f17157;

    /* JADX INFO: renamed from: ۦٗ */
    public AbstractC1814 f17158;

    /* JADX INFO: renamed from: ۦۛ */
    public AbstractC1814 f17159;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C4912 f17160;

    /* JADX INFO: renamed from: ۦۨ */
    public final C4523 f17161;

    public C5186(C4523 c4523, C4912 c4912, int i, InterfaceC3015 interfaceC3015) {
        this.f17161 = c4523;
        this.f17160 = c4912;
        this.f17152 = i;
        this.f17153 = interfaceC3015;
        float[] fArr = AbstractC3085.f10345;
        this.f17154 = fArr;
        this.f17155 = fArr;
        this.f17150 = fArr;
        this.f17149 = AbstractC3085.f10344;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final int m8799(int i) {
        int i2;
        C4523 c4523 = this.f17161;
        int i3 = c4523.f14948;
        if (i3 <= 0) {
            AbstractC2552.m4812("");
            throw null;
        }
        int i4 = i3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = c4523.f14949[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = -(i5 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    @Override // p000.InterfaceC2707
    /* JADX INFO: renamed from: ۥَ */
    public final AbstractC1814 mo687(long j, AbstractC1814 abstractC1814, AbstractC1814 abstractC1815, AbstractC1814 abstractC1816) {
        long j2 = j / 1000000;
        int[] iArr = AbstractC3085.f10346;
        long j3 = this.f17152;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return abstractC1816;
        }
        m8800(abstractC1814, abstractC1815, abstractC1816);
        AbstractC1814 abstractC1817 = this.f17159;
        int i = 0;
        if (this.f17149 != AbstractC3085.f10344) {
            int i2 = (int) j4;
            float fM8801 = m8801(m8799(i2), i2, false);
            float[] fArr = this.f17150;
            C1662[][] c1662Arr = (C1662[][]) this.f17149.f14025;
            float f = c1662Arr[0][0].f5534;
            float f2 = c1662Arr[c1662Arr.length - 1][0].f5532;
            if (fM8801 < f) {
                fM8801 = f;
            }
            if (fM8801 <= f2) {
                f2 = fM8801;
            }
            int length = fArr.length;
            boolean z = false;
            for (C1662[] c1662Arr2 : c1662Arr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    C1662 c1662 = c1662Arr2[i4];
                    if (f2 <= c1662.f5532) {
                        if (c1662.f5543) {
                            fArr[i3] = c1662.f5530;
                            fArr[i3 + 1] = c1662.f5531;
                        } else {
                            c1662.m3470(f2);
                            fArr[i3] = c1662.m3472();
                            fArr[i3 + 1] = c1662.m3471();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                abstractC1817.mo2172(i, fArr[i]);
                i++;
            }
        } else {
            AbstractC1814 abstractC1814Mo700 = mo700((j4 - 1) * 1000000, abstractC1814, abstractC1815, abstractC1816);
            AbstractC1814 abstractC1814Mo701 = mo700(j4 * 1000000, abstractC1814, abstractC1815, abstractC1816);
            int iMo2173 = abstractC1814Mo700.mo2173();
            while (i < iMo2173) {
                abstractC1817.mo2172(i, (abstractC1814Mo700.mo2174(i) - abstractC1814Mo701.mo2174(i)) * 1000.0f);
                i++;
            }
        }
        return abstractC1817;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m8800(AbstractC1814 abstractC1814, AbstractC1814 abstractC1815, AbstractC1814 abstractC1816) {
        float[] fArr;
        boolean z = this.f17149 != AbstractC3085.f10344;
        AbstractC1814 abstractC1817 = this.f17158;
        C4912 c4912 = this.f17160;
        C4523 c4523 = this.f17161;
        if (abstractC1817 == null) {
            this.f17158 = abstractC1814.mo2171();
            this.f17159 = abstractC1816.mo2171();
            int i = c4523.f14948;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = c4523.m7840(i2) / 1000.0f;
            }
            this.f17154 = fArr2;
            int i3 = c4523.f14948;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                AbstractC2049.m4001(c4912.m9571(c4523.m7840(i4)));
                iArr[i4] = 0;
            }
            this.f17151 = iArr;
        }
        if (z) {
            if (this.f17149 != AbstractC3085.f10344 && AbstractC3831.m6874(this.f17156, abstractC1814) && AbstractC3831.m6874(this.f17157, abstractC1815)) {
                return;
            }
            this.f17156 = abstractC1814;
            this.f17157 = abstractC1815;
            int iMo2173 = abstractC1814.mo2173() + (abstractC1814.mo2173() % 2);
            this.f17155 = new float[iMo2173];
            this.f17150 = new float[iMo2173];
            int i5 = c4523.f14948;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iM7840 = c4523.m7840(i6);
                AbstractC2049.m4001(c4912.m9571(iM7840));
                if (iM7840 == 0) {
                    fArr = new float[iMo2173];
                    for (int i7 = 0; i7 < iMo2173; i7++) {
                        fArr[i7] = abstractC1814.mo2174(i7);
                    }
                } else {
                    if (iM7840 != this.f17152) {
                        throw null;
                    }
                    fArr = new float[iMo2173];
                    for (int i8 = 0; i8 < iMo2173; i8++) {
                        fArr[i8] = abstractC1815.mo2174(i8);
                    }
                }
                fArr3[i6] = fArr;
            }
            this.f17149 = new C4228(this.f17151, this.f17154, fArr3);
        }
    }

    @Override // p000.InterfaceC1861
    /* JADX INFO: renamed from: ۥٖ */
    public final int mo692() {
        return this.f17152;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final float m8801(int i, int i2, boolean z) {
        float f;
        C4523 c4523 = this.f17161;
        if (i >= c4523.f14948 - 1) {
            f = i2;
        } else {
            int iM7840 = c4523.m7840(i);
            int iM7841 = c4523.m7840(i + 1);
            if (i2 != iM7840) {
                AbstractC2049.m4001(this.f17160.m9571(iM7840));
                float f2 = iM7841 - iM7840;
                float fMo1642 = this.f17153.mo1642((i2 - iM7840) / f2);
                return z ? fMo1642 : ((f2 * fMo1642) + iM7840) / 1000.0f;
            }
            f = iM7840;
        }
        return f / 1000.0f;
    }

    @Override // p000.InterfaceC1861
    /* JADX INFO: renamed from: ۦؚ */
    public final int mo696() {
        return 0;
    }

    @Override // p000.InterfaceC2707
    /* JADX INFO: renamed from: ۦٗ */
    public final AbstractC1814 mo700(long j, AbstractC1814 abstractC1814, AbstractC1814 abstractC1815, AbstractC1814 abstractC1816) {
        long j2 = j / 1000000;
        int[] iArr = AbstractC3085.f10346;
        int i = this.f17152;
        long j3 = i;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i2 = (int) j3;
        C4912 c4912 = this.f17160;
        AbstractC2049.m4001(c4912.m9571(i2));
        if (i2 >= i) {
            return abstractC1815;
        }
        if (i2 <= 0) {
            return abstractC1814;
        }
        m8800(abstractC1814, abstractC1815, abstractC1816);
        AbstractC1814 abstractC1817 = this.f17158;
        int i3 = 0;
        if (this.f17149 == AbstractC3085.f10344) {
            int iM8799 = m8799(i2);
            float fM8801 = m8801(iM8799, i2, true);
            C4523 c4523 = this.f17161;
            AbstractC2049.m4001(c4912.m9571(c4523.m7840(iM8799)));
            AbstractC2049.m4001(c4912.m9571(c4523.m7840(iM8799 + 1)));
            int iMo2173 = abstractC1817.mo2173();
            for (int i4 = 0; i4 < iMo2173; i4++) {
                abstractC1817.mo2172(i4, (abstractC1815.mo2174(i4) * fM8801) + ((1.0f - fM8801) * abstractC1814.mo2174(i4)));
            }
            return abstractC1817;
        }
        float fM8802 = m8801(m8799(i2), i2, false);
        float[] fArr = this.f17155;
        C1662[][] c1662Arr = (C1662[][]) this.f17149.f14025;
        int length = c1662Arr.length - 1;
        float f = c1662Arr[0][0].f5534;
        float f2 = c1662Arr[length][0].f5532;
        int length2 = fArr.length;
        if (fM8802 < f || fM8802 > f2) {
            if (fM8802 > f2) {
                f = f2;
            } else {
                length = 0;
            }
            float f3 = fM8802 - f;
            int i5 = 0;
            int i6 = 0;
            while (i5 < length2 - 1) {
                C1662 c1662 = c1662Arr[length][i6];
                boolean z = c1662.f5543;
                float f4 = c1662.f5531;
                float f5 = c1662.f5530;
                if (z) {
                    float f6 = c1662.f5534;
                    float f7 = c1662.f5540;
                    float f8 = c1662.f5527;
                    fArr[i5] = (f5 * f3) + ((c1662.f5528 - f8) * (f - f6) * f7) + f8;
                    float f9 = (f - f6) * f7;
                    float f10 = c1662.f5535;
                    fArr[i5 + 1] = (f4 * f3) + ((c1662.f5529 - f10) * f9) + f10;
                } else {
                    c1662.m3470(f);
                    fArr[i5] = (c1662.m3472() * f3) + (c1662.f5542 * c1662.f5533) + f5;
                    fArr[i5 + 1] = (c1662.m3471() * f3) + (c1662.f5544 * c1662.f5539) + f4;
                }
                i5 += 2;
                i6++;
                c1662Arr = c1662Arr;
            }
        } else {
            int length3 = c1662Arr.length;
            int i7 = 0;
            boolean z2 = false;
            while (i7 < length3) {
                int i8 = i3;
                int i9 = i8;
                while (i8 < length2 - 1) {
                    C1662 c1663 = c1662Arr[i7][i9];
                    if (fM8802 <= c1663.f5532) {
                        if (c1663.f5543) {
                            float f11 = c1663.f5534;
                            float f12 = c1663.f5540;
                            float f13 = c1663.f5527;
                            fArr[i8] = ((c1663.f5528 - f13) * (fM8802 - f11) * f12) + f13;
                            float f14 = c1663.f5535;
                            fArr[i8 + 1] = ((c1663.f5529 - f14) * (fM8802 - f11) * f12) + f14;
                        } else {
                            c1663.m3470(fM8802);
                            fArr[i8] = (c1663.f5542 * c1663.f5533) + c1663.f5530;
                            fArr[i8 + 1] = (c1663.f5544 * c1663.f5539) + c1663.f5531;
                        }
                        z2 = true;
                    }
                    i8 += 2;
                    i9++;
                }
                if (z2) {
                    break;
                }
                i7++;
                i3 = 0;
            }
        }
        int length4 = fArr.length;
        for (int i10 = 0; i10 < length4; i10++) {
            abstractC1817.mo2172(i10, fArr[i10]);
        }
        return abstractC1817;
    }
}
