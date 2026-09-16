package p000;

/* JADX INFO: renamed from: ۦؘ۠ؑۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5426 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f17909;

    /* JADX INFO: renamed from: ۥُ */
    public int f17910;

    /* JADX INFO: renamed from: ۥّ */
    public final float[] f17911;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f17912;

    /* JADX INFO: renamed from: ۥۜ */
    public final float[] f17913;

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean f17914;

    /* JADX INFO: renamed from: ۦؑ */
    public final C0752[] f17915;

    /* JADX INFO: renamed from: ۦۙ */
    public final float[] f17916;

    public C5426(int i, boolean z) {
        int i2;
        this.f17914 = z;
        this.f17912 = i;
        if (z && AbstractC3761.m6625(i, 1)) {
            C1078.m2276("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int iM6632 = AbstractC3761.m6632(i);
        if (iM6632 == 0) {
            i2 = 3;
        } else {
            if (iM6632 != 1) {
                C1078.m2275();
                throw null;
            }
            i2 = 2;
        }
        this.f17909 = i2;
        this.f17915 = new C0752[20];
        this.f17911 = new float[20];
        this.f17916 = new float[20];
        this.f17913 = new float[3];
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final float m9101(float f) {
        int i;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        float f3;
        float fSignum;
        float f4 = 0.0f;
        if (f <= 0.0f) {
            AbstractC3480.m6278("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.f17910;
        C0752[] c0752Arr = this.f17915;
        C0752 c0752 = c0752Arr[i2];
        if (c0752 == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            C0752 c0753 = c0752;
            while (true) {
                C0752 c0754 = c0752Arr[i2];
                boolean z2 = this.f17914;
                i = this.f17912;
                fArr = this.f17911;
                fArr2 = this.f17916;
                if (c0754 == null) {
                    f2 = f4;
                    z = z2;
                    break;
                }
                long j = c0752.f2735;
                f2 = f4;
                int i4 = i2;
                long j2 = c0754.f2735;
                float f5 = j - j2;
                z = z2;
                float fAbs = Math.abs(j2 - c0753.f2735);
                c0753 = (i == 1 || z) ? c0754 : c0752;
                if (f5 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i3] = c0754.f2734;
                fArr2[i3] = -f5;
                i2 = (i4 == 0 ? 20 : i4) - 1;
                i3++;
                if (i3 >= 20) {
                    break;
                }
                f4 = f2;
            }
            if (i3 >= this.f17909) {
                int iM6632 = AbstractC3761.m6632(i);
                if (iM6632 == 0) {
                    try {
                        float[] fArr3 = this.f17913;
                        AbstractC3831.m6840(fArr2, fArr, i3, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f2;
                    }
                } else {
                    if (iM6632 != 1) {
                        C1078.m2275();
                        return f2;
                    }
                    int i5 = i3 - 1;
                    float f6 = fArr2[i5];
                    int i6 = i5;
                    float fAbs2 = f2;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f7 = fArr2[i7];
                        if (f6 != f7) {
                            float f8 = (z ? -fArr[i7] : fArr[i6] - fArr[i7]) / (f6 - f7);
                            fAbs2 += Math.abs(f8) * (f8 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2.0f))));
                            if (i6 == i5) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i6--;
                        f6 = f7;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2.0f));
                }
                f3 = fSignum * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || Float.isNaN(f3)) {
            return f2;
        }
        if (f3 <= f2) {
            float f9 = -f;
            if (f3 < f9) {
                return f9;
            }
        } else if (f3 > f) {
            f3 = f;
        }
        return f3;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m9102(float f, long j) {
        int i = (this.f17910 + 1) % 20;
        this.f17910 = i;
        C0752[] c0752Arr = this.f17915;
        C0752 c0752 = c0752Arr[i];
        if (c0752 != null) {
            c0752.f2735 = j;
            c0752.f2734 = f;
        } else {
            C0752 c0753 = new C0752();
            c0753.f2735 = j;
            c0753.f2734 = f;
            c0752Arr[i] = c0753;
        }
    }

    public /* synthetic */ C5426() {
        this(1, false);
    }

    public C5426(int i) {
        this(2, true);
    }
}
