package p000;

import android.view.ViewParent;

/* JADX INFO: renamed from: ۥؒؗٝٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0281 implements InterfaceC4384 {

    /* JADX INFO: renamed from: ۥَ */
    public InterfaceC4448 f1012;

    /* JADX INFO: renamed from: ۥْ */
    public final ViewTreeObserverOnGlobalLayoutListenerC0850 f1013;

    /* JADX INFO: renamed from: ۥٓ */
    public InterfaceC5731 f1014;

    /* JADX INFO: renamed from: ۥٕ */
    public boolean f1015;

    /* JADX INFO: renamed from: ۥۖ */
    public float[] f1018;

    /* JADX INFO: renamed from: ۥۙ */
    public boolean f1019;

    /* JADX INFO: renamed from: ۥۧ */
    public int f1021;

    /* JADX INFO: renamed from: ۦؖ */
    public boolean f1022;

    /* JADX INFO: renamed from: ۦٕ */
    public boolean f1024;

    /* JADX INFO: renamed from: ۦٗ */
    public boolean f1025;

    /* JADX INFO: renamed from: ۦٚ */
    public AbstractC3925 f1026;

    /* JADX INFO: renamed from: ۦ۟ */
    public final InterfaceC5449 f1028;

    /* JADX INFO: renamed from: ۦۨ */
    public C4893 f1029;

    /* JADX INFO: renamed from: ۥٖ */
    public long f1016 = 9223372034707292159L;

    /* JADX INFO: renamed from: ۦۛ */
    public final float[] f1027 = C0132.m293();

    /* JADX INFO: renamed from: ۥٙ */
    public InterfaceC2880 f1017 = AbstractC4554.m7884();

    /* JADX INFO: renamed from: ۥؖ */
    public EnumC2459 f1010 = EnumC2459.f8215;

    /* JADX INFO: renamed from: ۥؓ */
    public final C2004 f1009 = new C2004();

    /* JADX INFO: renamed from: ۥً */
    public long f1011 = AbstractC5477.f18071;

    /* JADX INFO: renamed from: ۦؙ */
    public boolean f1023 = true;

    /* JADX INFO: renamed from: ۥۦ */
    public final C2932 f1020 = new C2932(18, this);

    public C0281(C4893 c4893, InterfaceC5449 interfaceC5449, ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850, InterfaceC5731 interfaceC5731, InterfaceC4448 interfaceC4448) {
        this.f1029 = c4893;
        this.f1028 = interfaceC5449;
        this.f1013 = viewTreeObserverOnGlobalLayoutListenerC0850;
        this.f1014 = interfaceC5731;
        this.f1012 = interfaceC4448;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m584() {
        if (this.f1024 || this.f1025) {
            return;
        }
        this.f1013.invalidate();
        m586(true);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m585(long j) {
        if (C4207.m7431(j, this.f1016)) {
            return;
        }
        if (ViewTreeObserverOnGlobalLayoutListenerC0850.m1770()) {
            this.f1013.m1800(-4.0f);
        }
        this.f1016 = j;
        m584();
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m586(boolean z) {
        if (z != this.f1024) {
            this.f1024 = z;
            ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = this.f1013;
            C2730 c2730 = viewTreeObserverOnGlobalLayoutListenerC0850.f3100;
            boolean z2 = viewTreeObserverOnGlobalLayoutListenerC0850.f3089;
            if (!z) {
                if (z2) {
                    return;
                }
                c2730.m5083(this);
                C2730 c2731 = viewTreeObserverOnGlobalLayoutListenerC0850.f3081;
                if (c2731 != null) {
                    c2731.m5083(this);
                    return;
                }
                return;
            }
            if (!z2) {
                c2730.m5079(this);
                return;
            }
            C2730 c2732 = viewTreeObserverOnGlobalLayoutListenerC0850.f3081;
            if (c2732 == null) {
                c2732 = new C2730();
                viewTreeObserverOnGlobalLayoutListenerC0850.f3081 = c2732;
            }
            c2732.m5079(this);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final float[] m587() {
        boolean z = this.f1015;
        float[] fArr = this.f1027;
        if (z) {
            C4893 c4893 = this.f1029;
            long jM6848 = c4893.f16133;
            InterfaceC3053 interfaceC3053 = c4893.f16122;
            if ((9223372034707292159L & jM6848) == 9205357640488583168L) {
                jM6848 = AbstractC3831.m6848(AbstractC5537.m9235(this.f1016));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jM6848 >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM6848 & 4294967295L));
            float fMo1199 = interfaceC3053.mo1199();
            float fMo1198 = interfaceC3053.mo1198();
            float fMo1226 = interfaceC3053.mo1226();
            float fMo1201 = interfaceC3053.mo1201();
            float fMo1212 = interfaceC3053.mo1212();
            float fMo1211 = interfaceC3053.mo1211();
            float fMo1209 = interfaceC3053.mo1209();
            double d = ((double) fMo1226) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f = -fSin;
            float f2 = (fMo1198 * fCos) - (0.0f * fSin);
            float f3 = (0.0f * fCos) + (fMo1198 * fSin);
            double d2 = ((double) fMo1201) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f4 = -fSin2;
            float f5 = fSin * fSin2;
            float f6 = fSin * fCos2;
            float f7 = fCos * fSin2;
            float f8 = fCos * fCos2;
            float f9 = (f3 * fSin2) + (fMo1199 * fCos2);
            float f10 = (f3 * fCos2) + ((-fMo1199) * fSin2);
            double d3 = ((double) fMo1212) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f11 = -fSin3;
            float f12 = (fCos3 * f5) + (f11 * fCos2);
            float f13 = (f5 * fSin3) + (fCos2 * fCos3);
            float f14 = fSin3 * fCos;
            float f15 = f13 * fMo1211;
            float f16 = f14 * fMo1211;
            float f17 = ((fSin3 * f6) + (fCos3 * f4)) * fMo1211;
            float f18 = f12 * fMo1209;
            float f19 = fCos * fCos3 * fMo1209;
            float f20 = ((fCos3 * f6) + (f11 * f4)) * fMo1209;
            float f21 = f7 * 1.0f;
            float f22 = f * 1.0f;
            float f23 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f15;
                fArr[1] = f16;
                fArr[2] = f17;
                fArr[3] = 0.0f;
                fArr[4] = f18;
                fArr[5] = f19;
                fArr[6] = f20;
                fArr[7] = 0.0f;
                fArr[8] = f21;
                fArr[9] = f22;
                fArr[10] = f23;
                fArr[11] = 0.0f;
                float f24 = -fIntBitsToFloat;
                fArr[12] = ((f15 * f24) - (fIntBitsToFloat2 * f18)) + f9 + fIntBitsToFloat;
                fArr[13] = ((f16 * f24) - (fIntBitsToFloat2 * f19)) + f2 + fIntBitsToFloat2;
                fArr[14] = ((f24 * f17) - (fIntBitsToFloat2 * f20)) + f10;
                fArr[15] = 1.0f;
            }
            this.f1015 = false;
            this.f1023 = AbstractC3801.m6784(fArr);
        }
        return fArr;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final float[] m588() {
        float[] fArrM293 = this.f1018;
        if (fArrM293 == null) {
            fArrM293 = C0132.m293();
            this.f1018 = fArrM293;
        }
        if (this.f1019) {
            this.f1019 = false;
            float[] fArrM587 = m587();
            if (this.f1023) {
                return fArrM587;
            }
            if (!AbstractC2164.m4182(fArrM587, fArrM293)) {
                fArrM293[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrM293[0])) {
            return null;
        }
        return fArrM293;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m589(long j) {
        boolean zM1770 = ViewTreeObserverOnGlobalLayoutListenerC0850.m1770();
        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = this.f1013;
        if (zM1770) {
            viewTreeObserverOnGlobalLayoutListenerC0850.m1800(-4.0f);
        }
        C4893 c4893 = this.f1029;
        if (!C0873.m1863(c4893.f16118, j)) {
            c4893.f16118 = j;
            c4893.f16122.mo1221((int) (j >> 32), (int) (j & 4294967295L), c4893.f16128);
        }
        ViewParent parent = viewTreeObserverOnGlobalLayoutListenerC0850.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(viewTreeObserverOnGlobalLayoutListenerC0850, viewTreeObserverOnGlobalLayoutListenerC0850);
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m590() {
        ViewTreeObserverOnGlobalLayoutListenerC0850.m1770();
        if (this.f1024) {
            if (this.f1011 != AbstractC5477.f18071 && !C4207.m7431(this.f1029.f16128, this.f1016)) {
                C4893 c4893 = this.f1029;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f1011 >> 32)) * ((int) (this.f1016 >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f1011 & 4294967295L)) * ((int) (this.f1016 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                if (!C1553.m3306(c4893.f16133, jFloatToRawIntBits)) {
                    c4893.f16133 = jFloatToRawIntBits;
                    c4893.f16122.mo1219(jFloatToRawIntBits);
                }
            }
            C4893 c4894 = this.f1029;
            InterfaceC2880 interfaceC2880 = this.f1017;
            EnumC2459 enumC2459 = this.f1010;
            long j = this.f1016;
            long j2 = c4894.f16128;
            InterfaceC3053 interfaceC3053 = c4894.f16122;
            if (!C4207.m7431(j2, j)) {
                c4894.f16128 = j;
                long j3 = c4894.f16118;
                interfaceC3053.mo1221((int) (j3 >> 32), (int) (4294967295L & j3), j);
                if (c4894.f16129 == 9205357640488583168L) {
                    c4894.f16131 = true;
                    c4894.m8233();
                }
            }
            c4894.f16120 = interfaceC2880;
            c4894.f16112 = enumC2459;
            c4894.f16123 = this.f1020;
            interfaceC3053.mo1204(interfaceC2880, enumC2459, c4894, c4894.f16114);
            m586(false);
        }
    }
}
