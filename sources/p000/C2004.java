package p000;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: renamed from: ۥُٟؔۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2004 implements InterfaceC2442 {

    /* JADX INFO: renamed from: ۥْ */
    public C0376 f6601;

    /* JADX INFO: renamed from: ۥٓ */
    public C0376 f6602;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C2808 f6603;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2406 f6604;

    public C2004() {
        C1634 c1634 = AbstractC0186.f684;
        C2406 c2406 = new C2406();
        c2406.f8016 = c1634;
        c2406.f8015 = EnumC2459.f8215;
        c2406.f8014 = C2608.f8700;
        c2406.f8017 = 0L;
        this.f6604 = c2406;
        this.f6603 = new C2808(this);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C0376 m3899(C2004 c2004, long j, AbstractC0213 abstractC0213, float f, int i) {
        C0376 c0376M3903 = c2004.m3903(abstractC0213);
        Paint paint = (Paint) c0376M3903.f1400;
        if (f != 1.0f) {
            j = C1327.m2826(j, C1327.m2823(j) * f, 14);
        }
        long jM7468 = AbstractC4225.m7468(paint.getColor());
        int i2 = C1327.f4593;
        if (!C4462.m7744(jM7468, j)) {
            c0376M3903.m818(j);
        }
        if (((Shader) c0376M3903.f1399) != null) {
            c0376M3903.m815(null);
        }
        if (!AbstractC3831.m6874((C1516) c0376M3903.f1402, null)) {
            c0376M3903.m810(null);
        }
        if (c0376M3903.f1401 != i) {
            c0376M3903.m808(i);
        }
        if (paint.isFilterBitmap()) {
            return c0376M3903;
        }
        c0376M3903.m816(1);
        return c0376M3903;
    }

    @Override // p000.InterfaceC2442
    public final EnumC2459 getLayoutDirection() {
        return this.f6604.f8015;
    }

    @Override // p000.InterfaceC2442
    /* JADX INFO: renamed from: ۥؕ */
    public final void mo3900(long j, long j2, long j3, float f) {
        InterfaceC3212 interfaceC3212 = this.f6604.f8014;
        C0376 c0376M2131 = this.f6602;
        if (c0376M2131 == null) {
            c0376M2131 = AbstractC0993.m2131();
            c0376M2131.m819(1);
            this.f6602 = c0376M2131;
        }
        Paint paint = (Paint) c0376M2131.f1400;
        long jM7468 = AbstractC4225.m7468(paint.getColor());
        int i = C1327.f4593;
        if (!C4462.m7744(jM7468, j)) {
            c0376M2131.m818(j);
        }
        if (((Shader) c0376M2131.f1399) != null) {
            c0376M2131.m815(null);
        }
        if (!AbstractC3831.m6874((C1516) c0376M2131.f1402, null)) {
            c0376M2131.m810(null);
        }
        if (c0376M2131.f1401 != 3) {
            c0376M2131.m808(3);
        }
        if (paint.getStrokeWidth() != f) {
            c0376M2131.m814(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (c0376M2131.m809() != 0) {
            c0376M2131.m817(0);
        }
        if (c0376M2131.m806() != 0) {
            c0376M2131.m813(0);
        }
        if (!paint.isFilterBitmap()) {
            c0376M2131.m816(1);
        }
        interfaceC3212.mo2093(j2, j3, c0376M2131);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final C0376 m3901(AbstractC0548 abstractC0548, AbstractC0213 abstractC0213, float f, C1516 c1516, int i, int i2) {
        C0376 c0376M3903 = m3903(abstractC0213);
        Paint paint = (Paint) c0376M3903.f1400;
        if (abstractC0548 != null) {
            abstractC0548.mo1239(f, mo4567(), c0376M3903);
        } else {
            if (((Shader) c0376M3903.f1399) != null) {
                c0376M3903.m815(null);
            }
            long jM7468 = AbstractC4225.m7468(paint.getColor());
            long j = C1327.f4588;
            if (!C4462.m7744(jM7468, j)) {
                c0376M3903.m818(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                c0376M3903.m807(f);
            }
        }
        if (!AbstractC3831.m6874((C1516) c0376M3903.f1402, c1516)) {
            c0376M3903.m810(c1516);
        }
        if (c0376M3903.f1401 != i) {
            c0376M3903.m808(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return c0376M3903;
        }
        c0376M3903.m816(i2);
        return c0376M3903;
    }

    @Override // p000.InterfaceC2442
    /* JADX INFO: renamed from: ۥٍ */
    public final void mo3902(long j, long j2, long j3, float f, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.f6604.f8014.mo2098(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3), m3899(this, j, C1548.f5235, f, i));
    }

    /* JADX INFO: renamed from: ۥُ */
    public final C0376 m3903(AbstractC0213 abstractC0213) {
        if (AbstractC3831.m6874(abstractC0213, C1548.f5235)) {
            C0376 c0376 = this.f6601;
            if (c0376 != null) {
                return c0376;
            }
            C0376 c0376M2131 = AbstractC0993.m2131();
            c0376M2131.m819(0);
            this.f6601 = c0376M2131;
            return c0376M2131;
        }
        if (!(abstractC0213 instanceof C3579)) {
            C1078.m2275();
            return null;
        }
        C0376 c0376M2132 = this.f6602;
        if (c0376M2132 == null) {
            c0376M2132 = AbstractC0993.m2131();
            c0376M2132.m819(1);
            this.f6602 = c0376M2132;
        }
        Paint paint = (Paint) c0376M2132.f1400;
        float strokeWidth = paint.getStrokeWidth();
        C3579 c3579 = (C3579) abstractC0213;
        float f = c3579.f11906;
        if (strokeWidth != f) {
            c0376M2132.m814(f);
        }
        int iM809 = c0376M2132.m809();
        int i = c3579.f11904;
        if (iM809 != i) {
            c0376M2132.m817(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = c3579.f11905;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iM806 = c0376M2132.m806();
        int i2 = c3579.f11907;
        if (iM806 == i2) {
            return c0376M2132;
        }
        c0376M2132.m813(i2);
        return c0376M2132;
    }

    @Override // p000.InterfaceC2442
    /* JADX INFO: renamed from: ۥِ */
    public final void mo3904(C0935 c0935, long j, AbstractC0213 abstractC0213) {
        this.f6604.f8014.mo2096(c0935, m3899(this, j, abstractC0213, 1.0f, 3));
    }

    @Override // p000.InterfaceC2442
    /* JADX INFO: renamed from: ۥٙ */
    public final void mo3905(long j, long j2, long j3, long j4, AbstractC0213 abstractC0213) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.f6604.f8014.mo2094(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), m3899(this, j, abstractC0213, 1.0f, 3));
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۗ */
    public final float mo746() {
        return this.f6604.f8016.mo746();
    }

    @Override // p000.InterfaceC2442
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo3906(C0935 c0935, AbstractC0548 abstractC0548, float f, AbstractC0213 abstractC0213, int i) {
        this.f6604.f8014.mo2096(c0935, m3901(abstractC0548, abstractC0213, f, null, i, 1));
    }

    @Override // p000.InterfaceC2442
    /* JADX INFO: renamed from: ۦؒ */
    public final void mo3907(C1955 c1955, long j, long j2, long j3, float f, C1516 c1516, int i) {
        this.f6604.f8014.mo2091(c1955, j, j2, j3, m3901(null, C1548.f5235, f, c1516, 3, i));
    }

    @Override // p000.InterfaceC2442
    /* JADX INFO: renamed from: ۦٚ */
    public final C2808 mo3908() {
        return this.f6603;
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۚ */
    public final float mo754() {
        return this.f6604.f8016.mo754();
    }

    @Override // p000.InterfaceC2442
    /* JADX INFO: renamed from: ۦۢ */
    public final void mo3909(long j, float f, long j2, AbstractC0213 abstractC0213) {
        this.f6604.f8014.mo2082(f, j2, m3899(this, j, abstractC0213, 1.0f, 3));
    }
}
