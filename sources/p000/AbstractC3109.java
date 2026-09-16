package p000;

/* JADX INFO: renamed from: ۦِؒؓۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3109 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C2450 f10424;

    static {
        C4216 c4216 = AbstractC3026.f10188;
        long j = C1327.f4587;
        long j2 = C1327.f4588;
        f10424 = new C2450(j, j2, j2, C1327.m2826(j2, 0.38f, 14), C1327.m2826(j2, 0.38f, 14));
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final void m5689(String str, boolean z, C2450 c2450, InterfaceC0705 interfaceC0705, InterfaceC2609 interfaceC2609, InterfaceC4448 interfaceC4448, C5362 c5362, int i) {
        int i2;
        c5362.m8979(-2001167027);
        if ((i & 6) == 0) {
            i2 = (c5362.m8963(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5362.m9006(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c5362.m8963(c2450) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c5362.m8963(interfaceC0705) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c5362.m8977(interfaceC2609) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c5362.m8977(interfaceC4448) ? 131072 : 65536;
        }
        if (c5362.m9011(i2 & 1, (74899 & i2) != 74898)) {
            C4274 c4274 = AbstractC1773.f5917;
            float f = AbstractC1773.f5912;
            C5452 c5452 = new C5452(f, true, new C1078(2));
            boolean z2 = ((i2 & 112) == 32) | ((458752 & i2) == 131072);
            Object objM8999 = c5362.m8999();
            if (z2 || objM8999 == C2850.f9517) {
                objM8999 = new C2669(0, interfaceC4448, z);
                c5362.m8987(objM8999);
            }
            InterfaceC0705 interfaceC0705M9372 = AbstractC5568.m9372(AbstractC4410.m7704(AbstractC0186.m432(interfaceC0705, z, str, (InterfaceC4448) objM8999, 12).mo1571(AbstractC4410.f14521), 112.0f, 48.0f, 280.0f, 48.0f), f, 0.0f, 2);
            C3668 c3668M6047 = AbstractC3287.m6047(c5452, c4274, c5362, 54);
            int iHashCode = Long.hashCode(c5362.f17657);
            C2103 c2103M8994 = c5362.m8994();
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705M9372);
            InterfaceC4576.f15106.getClass();
            C3709 c3709 = C0849.f3049;
            c5362.m8983();
            if (c5362.f17668) {
                c5362.m9005(c3709);
            } else {
                c5362.m8972();
            }
            C3136 c3136 = C0849.f3048;
            AbstractC0993.m2127(c3136, c5362, c3668M6047);
            C3136 c3137 = C0849.f3047;
            AbstractC0993.m2127(c3137, c5362, c2103M8994);
            Integer numValueOf = Integer.valueOf(iHashCode);
            C3136 c3138 = C0849.f3053;
            AbstractC0993.m2127(c3138, c5362, numValueOf);
            C1931 c1931 = C0849.f3050;
            AbstractC0993.m2146(c5362, c1931);
            C3136 c3139 = C0849.f3052;
            AbstractC0993.m2127(c3139, c5362, interfaceC0705M2161);
            if (interfaceC2609 == null) {
                c5362.m8957(-1597947094);
                c5362.m9009(false);
            } else {
                c5362.m8957(-1597947093);
                float f2 = AbstractC1773.f5913;
                InterfaceC0705 interfaceC0705M7701 = AbstractC4410.m7701(C4217.f13994, f2, 0.0f, f2, f2, 2);
                InterfaceC3228 interfaceC3228M2297 = AbstractC1089.m2297(C1298.f4456, false);
                int iHashCode2 = Long.hashCode(c5362.f17657);
                C2103 c2103M8995 = c5362.m8994();
                InterfaceC0705 interfaceC0705M2162 = AbstractC0993.m2161(c5362, interfaceC0705M7701);
                c5362.m8983();
                if (c5362.f17668) {
                    c5362.m9005(c3709);
                } else {
                    c5362.m8972();
                }
                AbstractC0993.m2127(c3136, c5362, interfaceC3228M2297);
                AbstractC0993.m2127(c3137, c5362, c2103M8995);
                AbstractC0993.m2127(c3138, c5362, Integer.valueOf(iHashCode2));
                AbstractC0993.m2146(c5362, c1931);
                AbstractC0993.m2127(c3139, c5362, interfaceC0705M2162);
                interfaceC2609.mo1173(new C1327(z ? c2450.f8159 : c2450.f8160), c5362, 0);
                c5362.m9009(true);
                c5362.m9009(false);
            }
            long j = z ? c2450.f8161 : c2450.f8163;
            AbstractC1631.m3416(str, new C4570(1.0f, true), new C3564(j, AbstractC1773.f5916, AbstractC1773.f5920, AbstractC1773.f5921, AbstractC1773.f5915, AbstractC1773.f5919, null, null, 16613240), 0, false, 1, 0, c5362, (i2 & 14) | 1572864, 952);
            c5362.m9009(true);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C1229(str, z, c2450, interfaceC0705, interfaceC2609, interfaceC4448, i);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m5690(InterfaceC0705 interfaceC0705, C2450 c2450, InterfaceC4745 interfaceC4745, C5362 c5362, int i, int i2) {
        int i3;
        int i4;
        c5362.m8979(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (c5362.m8963(interfaceC0705) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (c5362.m8963(c2450) ? 32 : 16);
        }
        int i7 = i4 | (c5362.m8977(interfaceC4745) ? 256 : 128);
        int i8 = 1;
        if (c5362.m9011(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                interfaceC0705 = C4217.f13994;
            }
            if (i6 != 0) {
                c2450 = f10424;
            }
            m5691(c2450, interfaceC0705, AbstractC3925.m7034(-250345048, new C4513(i8, interfaceC4745, c2450), c5362), c5362, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | 384);
        } else {
            c5362.m8982();
        }
        InterfaceC0705 interfaceC0706 = interfaceC0705;
        C2450 c2451 = c2450;
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0021(interfaceC0706, c2451, interfaceC4745, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m5691(C2450 c2450, InterfaceC0705 interfaceC0705, C0857 c0857, C5362 c5362, int i) {
        int i2;
        c5362.m8979(-527864079);
        if ((i & 6) == 0) {
            i2 = (c5362.m8963(c2450) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5362.m8963(interfaceC0705) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c5362.m8977(c0857) ? 256 : 128;
        }
        if (c5362.m9011(i2 & 1, (i2 & 147) != 146)) {
            C4274 c4274 = AbstractC1773.f5917;
            C1633 c1633M1170 = AbstractC0520.m1170(4.0f);
            boolean z = C4497.m7827(3.0f, 0.0f) > 0;
            long j = AbstractC1938.f6398;
            InterfaceC0705 interfaceC0705M7907 = AbstractC4554.m7907(AbstractC5568.m9372(AbstractC2774.m5197(AbstractC5568.m9382((C4497.m7827(3.0f, 0.0f) > 0 || z) ? interfaceC0705.mo1571(new C4402(c1633M1170, z, j, j)) : interfaceC0705, c2450.f8162, AbstractC2552.f8518)), 0.0f, AbstractC1773.f5918, 1), AbstractC4554.m7939(c5362));
            int i3 = (i2 << 3) & 7168;
            C3113 c3113M9197 = AbstractC5501.m9197(AbstractC4225.f14009, C1298.f4443, c5362, 0);
            int iHashCode = Long.hashCode(c5362.f17657);
            C2103 c2103M8994 = c5362.m8994();
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705M7907);
            InterfaceC4576.f15106.getClass();
            C3709 c3709 = C0849.f3049;
            c5362.m8983();
            if (c5362.f17668) {
                c5362.m9005(c3709);
            } else {
                c5362.m8972();
            }
            AbstractC0993.m2127(C0849.f3048, c5362, c3113M9197);
            AbstractC0993.m2127(C0849.f3047, c5362, c2103M8994);
            AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode));
            AbstractC0993.m2146(c5362, C0849.f3050);
            AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
            c0857.mo1173(C1869.f6214, c5362, Integer.valueOf(((i3 >> 6) & 112) | 6));
            c5362.m9009(true);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0021(i, 6, c2450, interfaceC0705, c0857);
        }
    }
}
