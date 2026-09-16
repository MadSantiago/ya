package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* JADX INFO: renamed from: ۦًؙؓؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3532 extends AbstractC5265 {

    /* JADX INFO: renamed from: ۥؗ */
    public String f11704;

    /* JADX INFO: renamed from: ۥُ */
    public final C3351 f11705;

    /* JADX INFO: renamed from: ۥّ */
    public InterfaceC4448 f11706;

    /* JADX INFO: renamed from: ۥۗ */
    public final C1412 f11707;

    /* JADX INFO: renamed from: ۥۜ */
    public C1516 f11708;

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f11709;

    /* JADX INFO: renamed from: ۦؚ */
    public float f11710;

    /* JADX INFO: renamed from: ۦٌ */
    public final C2236 f11711;

    /* JADX INFO: renamed from: ۦِ */
    public long f11712;

    /* JADX INFO: renamed from: ۦٛ */
    public final C4852 f11713;

    /* JADX INFO: renamed from: ۦۗ */
    public float f11714;

    /* JADX INFO: renamed from: ۦۙ */
    public final C4852 f11715;

    public C3532(C1412 c1412) {
        this.f11707 = c1412;
        c1412.f4861 = new C2236(this, 0);
        this.f11704 = "";
        this.f11709 = true;
        this.f11705 = new C3351();
        this.f11706 = C3709.f12366;
        this.f11715 = AbstractC2774.m5183(null);
        this.f11713 = AbstractC2774.m5183(new C3291(0L));
        this.f11712 = 9205357640488583168L;
        this.f11714 = 1.0f;
        this.f11710 = 1.0f;
        this.f11711 = new C2236(this, 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f11704);
        sb.append("\n\tviewportWidth: ");
        C4852 c4852 = this.f11713;
        sb.append(Float.intBitsToFloat((int) (((C3291) c4852.getValue()).f11025 >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((C3291) c4852.getValue()).f11025 & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:51:0x010d  */
    /* JADX INFO: renamed from: ۥُ */
    public final void m6321(InterfaceC2442 interfaceC2442, float f, C1516 c1516) {
        int i;
        C1516 c1517;
        C1955 c1955M411;
        char c;
        long j;
        long jM2826;
        C1516 c1518;
        int i2;
        int i3;
        C1412 c1412 = this.f11707;
        boolean z = c1412.f4857;
        C4852 c4852 = this.f11715;
        if (!z || c1412.f4851 == 16) {
            i = 0;
        } else {
            C1516 c1519 = (C1516) c4852.getValue();
            int i4 = AbstractC0184.f672;
            if (!(c1519 instanceof C1516) ? c1519 == null : (i3 = c1519.f5153) == 5 || i3 == 3) {
                i = 0;
            } else if (!(c1516 instanceof C1516) ? c1516 == null : (i2 = c1516.f5153) == 5 || i2 == 3) {
                i = 0;
            } else {
                i = 1;
            }
        }
        boolean z2 = this.f11709;
        C3351 c3351 = this.f11705;
        if (z2 || !C3291.m6053(this.f11712, interfaceC2442.mo4567())) {
            if (i == 1) {
                jM2826 = c1412.f4851;
                int i5 = AbstractC0184.f672;
                if (C1327.m2823(jM2826) != 1.0f) {
                    jM2826 = C1327.m2826(jM2826, 1.0f, 14);
                }
                c1517 = new C1516(jM2826, 5);
            } else {
                c1517 = null;
            }
            this.f11708 = c1517;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC2442.mo4567() >> 32));
            C4852 c4853 = this.f11713;
            this.f11714 = fIntBitsToFloat / Float.intBitsToFloat((int) (((C3291) c4853.getValue()).f11025 >> 32));
            this.f11710 = Float.intBitsToFloat((int) (interfaceC2442.mo4567() & 4294967295L)) / Float.intBitsToFloat((int) (((C3291) c4853.getValue()).f11025 & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC2442.mo4567() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC2442.mo4567() & 4294967295L))))) & 4294967295L);
            EnumC2459 layoutDirection = interfaceC2442.getLayoutDirection();
            c1955M411 = c3351.f11205;
            C0979 c0979 = c3351.f11204;
            if (c1955M411 != null || c0979 == null) {
                c = ' ';
                j = 4294967295L;
            } else {
                int i6 = (int) (jCeil >> 32);
                Bitmap bitmap = c1955M411.f6452;
                c = ' ';
                j = 4294967295L;
                if (i6 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || c3351.f11206 != i) {
                }
                c3351.f11202 = jCeil;
                C2004 c2004 = c3351.f11203;
                C2406 c2406 = c2004.f6604;
                long jM9235 = AbstractC5537.m9235(jCeil);
                InterfaceC2880 interfaceC2880 = c2406.f8016;
                EnumC2459 enumC2459 = c2406.f8015;
                InterfaceC3212 interfaceC3212 = c2406.f8014;
                C0979 c09710 = c0979;
                long j2 = c2406.f8017;
                c2406.f8016 = interfaceC2442;
                c2406.f8015 = layoutDirection;
                c2406.f8014 = c09710;
                c2406.f8017 = jM9235;
                c09710.mo2092();
                InterfaceC2442.m4561(c2004, C1327.f4588, 0L, 0.0f, 62);
                this.f11711.mo211(c2004);
                c09710.mo2095();
                c2406.f8016 = interfaceC2880;
                c2406.f8015 = enumC2459;
                c2406.f8014 = interfaceC3212;
                c2406.f8017 = j2;
                c1955M411.f6452.prepareToDraw();
                this.f11709 = false;
                this.f11712 = interfaceC2442.mo4567();
            }
            c1955M411 = AbstractC0186.m411((int) (jCeil >> c), (int) (jCeil & j), i);
            Canvas canvas = AbstractC5664.f18633;
            c0979 = new C0979();
            c0979.f3447 = new Canvas(AbstractC0949.m1928(c1955M411));
            c3351.f11205 = c1955M411;
            c3351.f11204 = c0979;
            c3351.f11206 = i;
            c3351.f11202 = jCeil;
            C2004 c2005 = c3351.f11203;
            C2406 c2407 = c2005.f6604;
            long jM9236 = AbstractC5537.m9235(jCeil);
            InterfaceC2880 interfaceC2881 = c2407.f8016;
            EnumC2459 enumC24510 = c2407.f8015;
            InterfaceC3212 interfaceC3213 = c2407.f8014;
            C0979 c09711 = c0979;
            long j3 = c2407.f8017;
            c2407.f8016 = interfaceC2442;
            c2407.f8015 = layoutDirection;
            c2407.f8014 = c09711;
            c2407.f8017 = jM9236;
            c09711.mo2092();
            InterfaceC2442.m4561(c2005, C1327.f4588, 0L, 0.0f, 62);
            this.f11711.mo211(c2005);
            c09711.mo2095();
            c2407.f8016 = interfaceC2881;
            c2407.f8015 = enumC24510;
            c2407.f8014 = interfaceC3213;
            c2407.f8017 = j3;
            c1955M411.f6452.prepareToDraw();
            this.f11709 = false;
            this.f11712 = interfaceC2442.mo4567();
        } else {
            C1955 c1955 = c3351.f11205;
            if (i != (c1955 != null ? c1955.m3836() : 0)) {
                if (i == 1) {
                    jM2826 = c1412.f4851;
                    int i7 = AbstractC0184.f672;
                    if (C1327.m2823(jM2826) != 1.0f) {
                        jM2826 = C1327.m2826(jM2826, 1.0f, 14);
                    }
                    c1517 = new C1516(jM2826, 5);
                } else {
                    c1517 = null;
                }
                this.f11708 = c1517;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC2442.mo4567() >> 32));
                C4852 c4854 = this.f11713;
                this.f11714 = fIntBitsToFloat2 / Float.intBitsToFloat((int) (((C3291) c4854.getValue()).f11025 >> 32));
                this.f11710 = Float.intBitsToFloat((int) (interfaceC2442.mo4567() & 4294967295L)) / Float.intBitsToFloat((int) (((C3291) c4854.getValue()).f11025 & 4294967295L));
                long jCeil2 = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC2442.mo4567() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC2442.mo4567() & 4294967295L))))) & 4294967295L);
                EnumC2459 layoutDirection2 = interfaceC2442.getLayoutDirection();
                c1955M411 = c3351.f11205;
                C0979 c09712 = c3351.f11204;
                if (c1955M411 != null) {
                    c = ' ';
                    j = 4294967295L;
                    c1955M411 = AbstractC0186.m411((int) (jCeil2 >> c), (int) (jCeil2 & j), i);
                    Canvas canvas2 = AbstractC5664.f18633;
                    c09712 = new C0979();
                    c09712.f3447 = new Canvas(AbstractC0949.m1928(c1955M411));
                    c3351.f11205 = c1955M411;
                    c3351.f11204 = c09712;
                    c3351.f11206 = i;
                } else {
                    c = ' ';
                    j = 4294967295L;
                    c1955M411 = AbstractC0186.m411((int) (jCeil2 >> c), (int) (jCeil2 & j), i);
                    Canvas canvas3 = AbstractC5664.f18633;
                    c09712 = new C0979();
                    c09712.f3447 = new Canvas(AbstractC0949.m1928(c1955M411));
                    c3351.f11205 = c1955M411;
                    c3351.f11204 = c09712;
                    c3351.f11206 = i;
                }
                c3351.f11202 = jCeil2;
                C2004 c2006 = c3351.f11203;
                C2406 c2408 = c2006.f6604;
                long jM9237 = AbstractC5537.m9235(jCeil2);
                InterfaceC2880 interfaceC2882 = c2408.f8016;
                EnumC2459 enumC24511 = c2408.f8015;
                InterfaceC3212 interfaceC3214 = c2408.f8014;
                C0979 c09713 = c09712;
                long j4 = c2408.f8017;
                c2408.f8016 = interfaceC2442;
                c2408.f8015 = layoutDirection2;
                c2408.f8014 = c09713;
                c2408.f8017 = jM9237;
                c09713.mo2092();
                InterfaceC2442.m4561(c2006, C1327.f4588, 0L, 0.0f, 62);
                this.f11711.mo211(c2006);
                c09713.mo2095();
                c2408.f8016 = interfaceC2882;
                c2408.f8015 = enumC24511;
                c2408.f8014 = interfaceC3214;
                c2408.f8017 = j4;
                c1955M411.f6452.prepareToDraw();
                this.f11709 = false;
                this.f11712 = interfaceC2442.mo4567();
            }
        }
        if (c1516 != null) {
            c1518 = c1516;
        } else {
            c1518 = ((C1516) c4852.getValue()) != null ? (C1516) c4852.getValue() : this.f11708;
        }
        C1955 c1956 = c3351.f11205;
        if (c1956 == null) {
            AbstractC3480.m6278("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        InterfaceC2442.m4559(interfaceC2442, c1956, c3351.f11202, 0L, f, c1518, 0, 858);
    }

    @Override // p000.AbstractC5265
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2982(InterfaceC2442 interfaceC2442) {
        m6321(interfaceC2442, 1.0f, null);
    }
}
