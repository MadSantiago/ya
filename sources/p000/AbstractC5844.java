package p000;

/* JADX INFO: renamed from: ۦۧؗ٘ؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5844 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final float f19253;

    /* JADX INFO: renamed from: ۥُ */
    public static final long f19254;

    /* JADX INFO: renamed from: ۥۗ */
    public static final float f19255;

    /* JADX INFO: renamed from: ۥۣ */
    public static final float f19256;

    /* JADX INFO: renamed from: ۦؑ */
    public static final float f19257;

    static {
        int i = AbstractC1431.f4910;
        f19256 = AbstractC1431.f4909;
        f19255 = 16.0f;
        f19253 = 14.0f;
        f19257 = 6.0f;
        f19254 = AbstractC4489.m7788(20);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final void m9650(InterfaceC5731 interfaceC5731, C5362 c5362, int i) {
        boolean z;
        C3039 c3039 = C1298.f4456;
        c5362.m8979(-1349901398);
        int i2 = (c5362.m8977(interfaceC5731) ? 4 : 2) | i | (c5362.m8977(null) ? 32 : 16);
        int i3 = 1;
        if (c5362.m9011(i2 & 1, (i2 & 19) != 18)) {
            int i4 = i2 & 14;
            boolean z2 = ((i2 & 112) == 32) | (i4 == 4);
            Object objM8999 = c5362.m8999();
            if (z2 || objM8999 == C2850.f9517) {
                objM8999 = new C3227(interfaceC5731, i3);
                c5362.m8987(objM8999);
            }
            InterfaceC3228 interfaceC3228 = (InterfaceC3228) objM8999;
            int iM1958 = AbstractC0949.m1958(c5362);
            C2103 c2103M8994 = c5362.m8994();
            C4217 c4217 = C4217.f13994;
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, c4217);
            InterfaceC4576.f15106.getClass();
            C3709 c3709 = C0849.f3049;
            c5362.m8983();
            if (c5362.f17668) {
                c5362.m9005(c3709);
            } else {
                c5362.m8972();
            }
            C3136 c3136 = C0849.f3048;
            AbstractC0993.m2127(c3136, c5362, interfaceC3228);
            C3136 c3137 = C0849.f3047;
            AbstractC0993.m2127(c3137, c5362, c2103M8994);
            C3136 c3138 = C0849.f3053;
            if (c5362.f17668 || !AbstractC3831.m6874(c5362.m8999(), Integer.valueOf(iM1958))) {
                AbstractC3761.m6618(iM1958, c5362, iM1958, c3138);
            }
            C3136 c3139 = C0849.f3052;
            AbstractC0993.m2127(c3139, c5362, interfaceC0705M2161);
            if (interfaceC5731 != null) {
                c5362.m8957(870361332);
                InterfaceC0705 interfaceC0705M9372 = AbstractC5568.m9372(AbstractC0949.m1922(c4217, "text"), f19255, 0.0f, 2);
                InterfaceC3228 interfaceC3228M2297 = AbstractC1089.m2297(c3039, false);
                int iM1959 = AbstractC0949.m1958(c5362);
                C2103 c2103M8995 = c5362.m8994();
                InterfaceC0705 interfaceC0705M2162 = AbstractC0993.m2161(c5362, interfaceC0705M9372);
                c5362.m8983();
                if (c5362.f17668) {
                    c5362.m9005(c3709);
                } else {
                    c5362.m8972();
                }
                AbstractC0993.m2127(c3136, c5362, interfaceC3228M2297);
                AbstractC0993.m2127(c3137, c5362, c2103M8995);
                if (c5362.f17668 || !AbstractC3831.m6874(c5362.m8999(), Integer.valueOf(iM1959))) {
                    AbstractC3761.m6618(iM1959, c5362, iM1959, c3138);
                }
                AbstractC0993.m2127(c3139, c5362, interfaceC0705M2162);
                interfaceC5731.mo219(c5362, Integer.valueOf(i4));
                z = true;
                c5362.m9009(true);
                c5362.m9009(false);
            } else {
                z = true;
                c5362.m8957(870466081);
                c5362.m9009(false);
            }
            c5362.m8957(870557345);
            c5362.m9009(false);
            c5362.m9009(z);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C2928(i, interfaceC5731);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m9651(final boolean z, final InterfaceC4448 interfaceC4448, InterfaceC0705 interfaceC0705, boolean z2, final InterfaceC5731 interfaceC5731, final long j, final long j2, C5362 c5362, final int i) {
        final InterfaceC0705 interfaceC0706;
        final boolean z3;
        InterfaceC0705 interfaceC0707;
        boolean z4;
        C0857 c0857;
        c5362.m8979(1015017965);
        int i2 = 2;
        int i3 = i | (c5362.m9006(z) ? 4 : 2) | (c5362.m8977(interfaceC4448) ? 32 : 16) | 200064 | (c5362.m8961(j) ? 1048576 : 524288) | 100663296;
        int i4 = 1;
        if (c5362.m9011(i3 & 1, (38347923 & i3) != 38347922)) {
            c5362.m8971();
            if ((i & 1) == 0 || c5362.m8969()) {
                interfaceC0707 = C4217.f13994;
                z4 = true;
            } else {
                c5362.m8982();
                interfaceC0707 = interfaceC0705;
                z4 = z2;
            }
            c5362.m8964();
            int i5 = 6;
            if (interfaceC5731 == null) {
                c5362.m8957(1830899669);
                c5362.m9009(false);
                c0857 = null;
            } else {
                c5362.m8957(1830899670);
                C0857 c0857M7034 = AbstractC3925.m7034(-1745256900, new C4343(i5, interfaceC5731), c5362);
                c5362.m9009(false);
                c0857 = c0857M7034;
            }
            m9652(z, interfaceC4448, AbstractC0487.m1049(interfaceC0707, new C2463(i4)), z4, j, j2, AbstractC3925.m7034(-906085472, new C2403(i2, c0857), c5362), c5362, ((i3 >> 6) & 57344) | (i3 & 14) | 12582912 | (i3 & 112) | 3072 | 1769472);
            interfaceC0706 = interfaceC0707;
            z3 = z4;
        } else {
            c5362.m8982();
            interfaceC0706 = interfaceC0705;
            z3 = z2;
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731(z, interfaceC4448, interfaceC0706, z3, interfaceC5731, j, j2, i) { // from class: ۦٌؚؖ۟

                /* JADX INFO: renamed from: ۥَ */
                public final /* synthetic */ InterfaceC5731 f12052;

                /* JADX INFO: renamed from: ۥْ */
                public final /* synthetic */ InterfaceC0705 f12053;

                /* JADX INFO: renamed from: ۥٓ */
                public final /* synthetic */ boolean f12054;

                /* JADX INFO: renamed from: ۥٖ */
                public final /* synthetic */ long f12055;

                /* JADX INFO: renamed from: ۦٗ */
                public final /* synthetic */ long f12056;

                /* JADX INFO: renamed from: ۦ۟ */
                public final /* synthetic */ InterfaceC4448 f12057;

                /* JADX INFO: renamed from: ۦۨ */
                public final /* synthetic */ boolean f12058;

                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM6835 = AbstractC3831.m6835(12607489);
                    AbstractC5844.m9651(this.f12058, this.f12057, this.f12053, this.f12054, this.f12052, this.f12055, this.f12056, (C5362) obj, iM6835);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m9652(final boolean z, final InterfaceC4448 interfaceC4448, final InterfaceC0705 interfaceC0705, final boolean z2, final long j, final long j2, final C0857 c0857, C5362 c5362, final int i) {
        int i2;
        InterfaceC4448 interfaceC4449;
        c5362.m8979(-1573136853);
        if ((i & 6) == 0) {
            i2 = (c5362.m9006(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            interfaceC4449 = interfaceC4448;
            i2 |= c5362.m8977(interfaceC4449) ? 32 : 16;
        } else {
            interfaceC4449 = interfaceC4448;
        }
        if ((i & 384) == 0) {
            i2 |= c5362.m8963(interfaceC0705) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c5362.m9006(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c5362.m8961(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c5362.m8961(j2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c5362.m8963(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c5362.m8977(c0857) ? 8388608 : 4194304;
        }
        if (c5362.m9011(i2 & 1, (4793491 & i2) != 4793490)) {
            c5362.m8971();
            if ((i & 1) != 0 && !c5362.m8969()) {
                c5362.m8982();
            }
            c5362.m8964();
            C0857 c0857M7034 = AbstractC3925.m7034(1128552423, new C2010(interfaceC0705, z, AbstractC4670.m8032(0.0f, 2, j, true), z2, interfaceC4449, c0857), c5362);
            int i3 = i2 >> 12;
            m9653(j, j2, z, c0857M7034, c5362, ((i2 << 6) & 896) | (i3 & 112) | (i3 & 14) | 3072);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731() { // from class: ۦٌْؔؓ
                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC5844.m9652(z, interfaceC4448, interfaceC0705, z2, j, j2, c0857, (C5362) obj, AbstractC3831.m6835(i | 1));
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final void m9653(final long j, final long j2, final boolean z, final C0857 c0857, C5362 c5362, final int i) {
        int i2;
        boolean z2;
        boolean z3;
        C0969 c0969M4817;
        c5362.m8979(-833145221);
        if ((i & 6) == 0) {
            i2 = (c5362.m8961(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5362.m8961(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= c5362.m9006(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= c5362.m8977(c0857) ? 2048 : 1024;
        }
        if (c5362.m9011(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 >> 6;
            C0777 c0777M5189 = AbstractC2774.m5189(Boolean.valueOf(z2), null, c5362, i3 & 14, 2);
            C4852 c4852 = c0777M5189.f2814;
            boolean zBooleanValue = ((Boolean) c4852.getValue()).booleanValue();
            c5362.m8957(-1069234984);
            long j3 = zBooleanValue ? j : j2;
            c5362.m9009(false);
            AbstractC3292 abstractC3292M2824 = C1327.m2824(j3);
            boolean zM8963 = c5362.m8963(abstractC3292M2824);
            Object objM8999 = c5362.m8999();
            if (zM8963 || objM8999 == C2850.f9517) {
                C1280 c1280 = new C1280(C1931.f6364, new C2932(8, abstractC3292M2824));
                c5362.m8987(c1280);
                objM8999 = c1280;
            }
            C1280 c1281 = (C1280) objM8999;
            boolean zBooleanValue2 = ((Boolean) c0777M5189.m1671()).booleanValue();
            c5362.m8957(-1069234984);
            long j4 = zBooleanValue2 ? j : j2;
            c5362.m9009(false);
            C1327 c1327 = new C1327(j4);
            boolean zBooleanValue3 = ((Boolean) c4852.getValue()).booleanValue();
            c5362.m8957(-1069234984);
            long j5 = zBooleanValue3 ? j : j2;
            c5362.m9009(false);
            C1327 c1328 = new C1327(j5);
            C2451 c2451M1673 = c0777M5189.m1673();
            c5362.m8957(1058649156);
            if (c2451M1673.m4575(Boolean.FALSE, Boolean.TRUE)) {
                c5362.m8957(272207019);
                c0969M4817 = AbstractC2552.m4817(4, c5362);
                z3 = false;
                c5362.m9009(false);
            } else {
                z3 = false;
                c5362.m8957(272326989);
                c0969M4817 = AbstractC2552.m4817(5, c5362);
                c5362.m9009(false);
            }
            C0969 c0969 = c0969M4817;
            c5362.m9009(z3);
            C3051 c3051M5195 = AbstractC2774.m5195(c0777M5189, c1327, c1328, c0969, c1281, c5362, 0);
            C4216 c4216 = AbstractC0194.f721;
            C1327 c1329 = (C1327) c3051M5195.f10275.getValue();
            long j6 = c1329.f4595;
            C4773.m8137(c4216.mo4313(c1329), c0857, c5362, 8 | (i3 & 112));
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731() { // from class: ۥۢؒٓؖ
                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC5844.m9653(j, j2, z, c0857, (C5362) obj, AbstractC3831.m6835(i | 1));
                    return C2358.f7817;
                }
            };
        }
    }
}
