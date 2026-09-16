package p000;

import java.util.WeakHashMap;

/* JADX INFO: renamed from: ۥؘۚؓۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2264 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final float f7519;

    /* JADX INFO: renamed from: ۥۗ */
    public static final float f7520;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4216 f7521 = new C4216(0, new C0062(11));

    static {
        C4773.m8125(new C0062(12));
        new C0756(0.8f, 0.0f, 0.8f, 0.15f);
        f7520 = 4.0f;
        f7519 = 12.0f;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final void m4307(final InterfaceC0705 interfaceC0705, final InterfaceC5813 interfaceC5813, final long j, final long j2, final long j3, long j4, final C0857 c0857, final C3564 c3564, final C3564 c3565, InterfaceC4448 interfaceC4448, final C0857 c0858, C0857 c0859, final float f, C5362 c5362, final int i) {
        final InterfaceC4448 interfaceC4449;
        C0857 c08510;
        final long j5 = j4;
        C1911 c1911 = C1298.f4443;
        c5362.m8979(126395868);
        int i2 = i | (c5362.m8963(interfaceC0705) ? 4 : 2) | (c5362.m8963(interfaceC5813) ? 32 : 16) | (c5362.m8961(j) ? 256 : 128) | (c5362.m8961(j2) ? 2048 : 1024) | (c5362.m8961(j3) ? 16384 : 8192) | (c5362.m8961(j5) ? 131072 : 65536) | (c5362.m8977(c0857) ? 1048576 : 524288) | (c5362.m8963(c3564) ? 8388608 : 4194304) | (c5362.m8977(null) ? 67108864 : 33554432) | (c5362.m8963(c3565) ? 536870912 : 268435456);
        int i3 = 1600566 | (c5362.m8963(c1911) ? 256 : 128) | (c5362.m8977(c0858) ? 131072 : 65536) | (c5362.m8956(f) ? 8388608 : 4194304);
        if (c5362.m9011(i2 & 1, ((i2 & 306783379) == 306783378 && (4793491 & i3) == 4793490) ? false : true)) {
            boolean z = ((i2 & 112) == 32) | ((i3 & 896) == 256) | ((29360128 & i3) == 8388608);
            Object objM8999 = c5362.m8999();
            C4036 c4036 = C2850.f9517;
            if (z || objM8999 == c4036) {
                objM8999 = new C3935(interfaceC5813, f);
                c5362.m8987(objM8999);
            }
            C3935 c3935 = (C3935) objM8999;
            int iM1958 = AbstractC0949.m1958(c5362);
            C2103 c2103M8994 = c5362.m8994();
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705);
            InterfaceC4576.f15106.getClass();
            C3709 c3709 = C0849.f3049;
            c5362.m8983();
            if (c5362.f17668) {
                c5362.m9005(c3709);
            } else {
                c5362.m8972();
            }
            C3136 c3136 = C0849.f3048;
            AbstractC0993.m2127(c3136, c5362, c3935);
            C3136 c3137 = C0849.f3047;
            AbstractC0993.m2127(c3137, c5362, c2103M8994);
            C3136 c3138 = C0849.f3053;
            if (c5362.f17668 || !AbstractC3831.m6874(c5362.m8999(), Integer.valueOf(iM1958))) {
                AbstractC3761.m6618(iM1958, c5362, iM1958, c3138);
            }
            C3136 c3139 = C0849.f3052;
            AbstractC0993.m2127(c3139, c5362, interfaceC0705M2161);
            C4217 c4217 = C4217.f13994;
            InterfaceC0705 interfaceC0705M1922 = AbstractC0949.m1922(c4217, "navigationIcon");
            float f2 = f7520;
            InterfaceC0705 interfaceC0705M9381 = AbstractC5568.m9381(interfaceC0705M1922, f2, 0.0f, 0.0f, 0.0f, 14);
            C3039 c3039 = C1298.f4456;
            InterfaceC3228 interfaceC3228M2297 = AbstractC1089.m2297(c3039, false);
            int iM1959 = AbstractC0949.m1958(c5362);
            C2103 c2103M8995 = c5362.m8994();
            InterfaceC0705 interfaceC0705M2162 = AbstractC0993.m2161(c5362, interfaceC0705M9381);
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
            C4216 c4216 = AbstractC0194.f721;
            C4773.m8137(c4216.mo4313(new C1327(j)), c0858, c5362, ((i3 >> 12) & 112) | 8);
            c5362.m9009(true);
            c5362.m8957(-1359701523);
            InterfaceC0705 interfaceC0705M9372 = AbstractC5568.m9372(AbstractC0949.m1922(c4217, "title"), f2, 0.0f, 2);
            c5362.m8957(510340109);
            c5362.m9009(false);
            InterfaceC0705 interfaceC0705Mo1571 = interfaceC0705M9372.mo1571(c4217);
            Object objM89910 = c5362.m8999();
            if (objM89910 == c4036) {
                interfaceC4449 = interfaceC4448;
                objM89910 = new C2288(0, interfaceC4449);
                c5362.m8987(objM89910);
            } else {
                interfaceC4449 = interfaceC4448;
            }
            InterfaceC0705 interfaceC0705M7887 = AbstractC4554.m7887(interfaceC0705Mo1571, (InterfaceC4745) objM89910);
            InterfaceC3228 interfaceC3228M2298 = AbstractC1089.m2297(c3039, false);
            int iM19510 = AbstractC0949.m1958(c5362);
            C2103 c2103M8996 = c5362.m8994();
            InterfaceC0705 interfaceC0705M2163 = AbstractC0993.m2161(c5362, interfaceC0705M7887);
            c5362.m8983();
            if (c5362.f17668) {
                c5362.m9005(c3709);
            } else {
                c5362.m8972();
            }
            AbstractC0993.m2127(c3136, c5362, interfaceC3228M2298);
            AbstractC0993.m2127(c3137, c5362, c2103M8996);
            if (c5362.f17668 || !AbstractC3831.m6874(c5362.m8999(), Integer.valueOf(iM19510))) {
                AbstractC3761.m6618(iM19510, c5362, iM19510, c3138);
            }
            AbstractC0993.m2127(c3139, c5362, interfaceC0705M2163);
            AbstractC2765.m5143(j2, c3564, c0857, c5362, ((i2 >> 9) & 14) | ((i2 >> 18) & 112) | ((i2 >> 12) & 896));
            c5362.m9009(true);
            c5362.m9009(false);
            InterfaceC0705 interfaceC0705M9382 = AbstractC5568.m9381(AbstractC0949.m1922(c4217, "actionIcons"), 0.0f, 0.0f, f2, 0.0f, 11);
            InterfaceC3228 interfaceC3228M2299 = AbstractC1089.m2297(c3039, false);
            int iM19511 = AbstractC0949.m1958(c5362);
            C2103 c2103M8997 = c5362.m8994();
            InterfaceC0705 interfaceC0705M2164 = AbstractC0993.m2161(c5362, interfaceC0705M9382);
            c5362.m8983();
            if (c5362.f17668) {
                c5362.m9005(c3709);
            } else {
                c5362.m8972();
            }
            AbstractC0993.m2127(c3136, c5362, interfaceC3228M2299);
            AbstractC0993.m2127(c3137, c5362, c2103M8997);
            if (c5362.f17668 || !AbstractC3831.m6874(c5362.m8999(), Integer.valueOf(iM19511))) {
                AbstractC3761.m6618(iM19511, c5362, iM19511, c3138);
            }
            AbstractC0993.m2127(c3139, c5362, interfaceC0705M2164);
            j5 = j4;
            c08510 = c0859;
            C4773.m8137(c4216.mo4313(new C1327(j5)), c08510, c5362, 56);
            c5362.m9009(true);
            c5362.m9009(true);
        } else {
            interfaceC4449 = interfaceC4448;
            c08510 = c0859;
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            final C0857 c08511 = c08510;
            c5863M8965.f19365 = new InterfaceC5731(interfaceC5813, j, j2, j3, j5, c0857, c3564, c3565, interfaceC4449, c0858, c08511, f, i) { // from class: ۥٙٚۙ

                /* JADX INFO: renamed from: ۥؓ */
                public final /* synthetic */ float f5640;

                /* JADX INFO: renamed from: ۥؖ */
                public final /* synthetic */ C0857 f5641;

                /* JADX INFO: renamed from: ۥَ */
                public final /* synthetic */ long f5642;

                /* JADX INFO: renamed from: ۥْ */
                public final /* synthetic */ long f5643;

                /* JADX INFO: renamed from: ۥٓ */
                public final /* synthetic */ long f5644;

                /* JADX INFO: renamed from: ۥٖ */
                public final /* synthetic */ long f5645;

                /* JADX INFO: renamed from: ۥٙ */
                public final /* synthetic */ C0857 f5646;

                /* JADX INFO: renamed from: ۥۖ */
                public final /* synthetic */ C3564 f5647;

                /* JADX INFO: renamed from: ۦٕ */
                public final /* synthetic */ InterfaceC4448 f5648;

                /* JADX INFO: renamed from: ۦٗ */
                public final /* synthetic */ C0857 f5649;

                /* JADX INFO: renamed from: ۦۛ */
                public final /* synthetic */ C3564 f5650;

                /* JADX INFO: renamed from: ۦ۟ */
                public final /* synthetic */ InterfaceC5813 f5651;

                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM6835 = AbstractC3831.m6835(1);
                    AbstractC2264.m4307(this.f5652, this.f5651, this.f5643, this.f5644, this.f5642, this.f5645, this.f5649, this.f5650, this.f5647, this.f5648, this.f5646, this.f5641, this.f5640, (C5362) obj, iM6835);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:75:0x010a  */
    /* JADX WARN: Code duplicated, block: B:79:0x013c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0146  */
    /* JADX WARN: Code duplicated, block: B:83:0x0162  */
    /* JADX WARN: Code duplicated, block: B:88:0x019c  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۥۗ */
    public static final void m4308(final C0857 c0857, InterfaceC0705 interfaceC0705, final C0857 c0858, InterfaceC2609 interfaceC2609, float f, InterfaceC4686 interfaceC4686, C4692 c4692, C5277 c5277, C5362 c5362, final int i, final int i2) {
        int i3;
        final InterfaceC2609 interfaceC26010;
        int i4;
        C4692 c4693;
        int i5;
        C5277 c5278;
        int i6;
        boolean z;
        final InterfaceC0705 interfaceC0706;
        final float f2;
        final InterfaceC4686 interfaceC4687;
        final C5277 c5279;
        final C4692 c4694;
        C5863 c5863M8965;
        float f3;
        InterfaceC2609 interfaceC26011;
        C4447 c4447;
        int i7;
        C4217 c4217;
        C4692 c4695;
        InterfaceC0705 interfaceC0707;
        InterfaceC2609 interfaceC26012;
        int i8;
        C5277 c52710;
        InterfaceC4686 interfaceC4688;
        float f4;
        C2917 c2917;
        C4692 c4696;
        c5362.m8979(1784421840);
        if ((i & 6) == 0) {
            i3 = (c5362.m8977(c0857) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i3 | 48;
        if ((i & 384) == 0) {
            i9 |= c5362.m8977(c0858) ? 256 : 128;
        }
        int i10 = i2 & 8;
        if (i10 == 0) {
            if ((i & 3072) == 0) {
                interfaceC26010 = interfaceC2609;
                i9 |= c5362.m8977(interfaceC26010) ? 2048 : 1024;
            }
            i4 = i9 | 24576;
            if ((196608 & i) == 0) {
                i4 = 90112 | i9;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    c4693 = c4692;
                    int i11 = c5362.m8963(c4693) ? 1048576 : 524288;
                    i4 |= i11;
                } else {
                    c4693 = c4692;
                }
                i4 |= i11;
            } else {
                c4693 = c4692;
            }
            i5 = i2 & 128;
            if (i5 != 0) {
                if ((12582912 & i) == 0) {
                    c5278 = c5277;
                    if (c5362.m8963(c5278)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                    i4 |= i6;
                }
                if ((4793491 & i4) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (c5362.m9011(i4 & 1, z)) {
                    c5362.m8971();
                    f3 = 64.0f;
                    if ((i & 1) != 0 || c5362.m8969()) {
                        if (i10 != 0) {
                            interfaceC26011 = AbstractC5888.f19424;
                        } else {
                            interfaceC26011 = interfaceC26010;
                        }
                        WeakHashMap weakHashMap = C2816.f9398;
                        C3080 c3080 = new C3080(AbstractC1434.m3061(c5362).f9416, AbstractC1434.m3061(c5362).f9406);
                        int i12 = AbstractC3925.f13098;
                        c4447 = new C4447(c3080, 15 | 16);
                        i7 = i4 & (-458753);
                        if ((i2 & 64) != 0) {
                            c2917 = (C2917) c5362.m8997(AbstractC0118.f470);
                            c4696 = c2917.f9754;
                            if (c4696 == null) {
                                c4696 = new C4692(AbstractC0118.m212(c2917, 35), AbstractC0118.m212(c2917, 37), AbstractC0118.m212(c2917, 18), AbstractC0118.m212(c2917, 18), AbstractC0118.m212(c2917, 19), AbstractC0118.m212(c2917, 19));
                                c2917.f9754 = c4696;
                            }
                            C4692 c4697 = c4696;
                            i7 = i4 & (-4128769);
                            c4693 = c4697;
                        }
                        c4217 = C4217.f13994;
                        if (i5 != 0) {
                            interfaceC4688 = c4447;
                            f4 = 64.0f;
                            c4695 = c4693;
                            interfaceC0707 = c4217;
                            interfaceC26012 = interfaceC26011;
                            i8 = i7;
                            c52710 = null;
                        } else {
                            c4695 = c4693;
                            interfaceC0707 = c4217;
                            interfaceC26012 = interfaceC26011;
                            i8 = i7;
                            c52710 = c5278;
                            interfaceC4688 = c4447;
                            f4 = 64.0f;
                        }
                    } else {
                        c5362.m8982();
                        i8 = i4 & (-458753);
                        if ((i2 & 64) != 0) {
                            i8 = i4 & (-4128769);
                        }
                        f4 = f;
                        c4695 = c4693;
                        interfaceC26012 = interfaceC26010;
                        interfaceC0707 = interfaceC0705;
                        c52710 = c5278;
                        interfaceC4688 = interfaceC4686;
                    }
                    c5362.m8964();
                    C3564 c3564M8333 = AbstractC4957.m8333(13, c5362);
                    C3564 c3564 = C3564.f11800;
                    if (!C4497.m7826(f4, Float.NaN) && !C4497.m7826(f4, Float.POSITIVE_INFINITY)) {
                        f3 = f4;
                    }
                    int i13 = i8 << 12;
                    m4309(interfaceC0707, c0857, c3564M8333, c3564, c0858, interfaceC26012, f3, interfaceC4688, c4695, c52710, c5362, ((i8 >> 3) & 14) | 224256 | ((i8 << 3) & 112) | (i13 & 3670016) | (i13 & 29360128), (i8 >> 18) & 126);
                    interfaceC0706 = interfaceC0707;
                    interfaceC26010 = interfaceC26012;
                    interfaceC4687 = interfaceC4688;
                    c4694 = c4695;
                    c5279 = c52710;
                    f2 = f4;
                } else {
                    c5362.m8982();
                    interfaceC0706 = interfaceC0705;
                    f2 = f;
                    interfaceC4687 = interfaceC4686;
                    c5279 = c5278;
                    c4694 = c4693;
                }
                c5863M8965 = c5362.m8965();
                if (c5863M8965 != null) {
                    c5863M8965.f19365 = new InterfaceC5731() { // from class: ۦٟۣٛؑ
                        @Override // p000.InterfaceC5731
                        /* JADX INFO: renamed from: ۥۜ */
                        public final Object mo219(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC2264.m4308(c0857, interfaceC0706, c0858, interfaceC26010, f2, interfaceC4687, c4694, c5279, (C5362) obj, AbstractC3831.m6835(i | 1), i2);
                            return C2358.f7817;
                        }
                    };
                }
            }
            i4 |= 12582912;
            c5278 = c5277;
            if ((4793491 & i4) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (c5362.m9011(i4 & 1, z)) {
                c5362.m8971();
                f3 = 64.0f;
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        interfaceC26011 = AbstractC5888.f19424;
                    } else {
                        interfaceC26011 = interfaceC26010;
                    }
                    WeakHashMap weakHashMap2 = C2816.f9398;
                    C3080 c3081 = new C3080(AbstractC1434.m3061(c5362).f9416, AbstractC1434.m3061(c5362).f9406);
                    int i14 = AbstractC3925.f13098;
                    c4447 = new C4447(c3081, 15 | 16);
                    i7 = i4 & (-458753);
                    if ((i2 & 64) != 0) {
                        c2917 = (C2917) c5362.m8997(AbstractC0118.f470);
                        c4696 = c2917.f9754;
                        if (c4696 == null) {
                            c4696 = new C4692(AbstractC0118.m212(c2917, 35), AbstractC0118.m212(c2917, 37), AbstractC0118.m212(c2917, 18), AbstractC0118.m212(c2917, 18), AbstractC0118.m212(c2917, 19), AbstractC0118.m212(c2917, 19));
                            c2917.f9754 = c4696;
                        }
                        C4692 c4698 = c4696;
                        i7 = i4 & (-4128769);
                        c4693 = c4698;
                    }
                    c4217 = C4217.f13994;
                    if (i5 != 0) {
                        interfaceC4688 = c4447;
                        f4 = 64.0f;
                        c4695 = c4693;
                        interfaceC0707 = c4217;
                        interfaceC26012 = interfaceC26011;
                        i8 = i7;
                        c52710 = null;
                    } else {
                        c4695 = c4693;
                        interfaceC0707 = c4217;
                        interfaceC26012 = interfaceC26011;
                        i8 = i7;
                        c52710 = c5278;
                        interfaceC4688 = c4447;
                        f4 = 64.0f;
                    }
                } else {
                    if (i10 != 0) {
                        interfaceC26011 = AbstractC5888.f19424;
                    } else {
                        interfaceC26011 = interfaceC26010;
                    }
                    WeakHashMap weakHashMap3 = C2816.f9398;
                    C3080 c3082 = new C3080(AbstractC1434.m3061(c5362).f9416, AbstractC1434.m3061(c5362).f9406);
                    int i15 = AbstractC3925.f13098;
                    c4447 = new C4447(c3082, 15 | 16);
                    i7 = i4 & (-458753);
                    if ((i2 & 64) != 0) {
                        c2917 = (C2917) c5362.m8997(AbstractC0118.f470);
                        c4696 = c2917.f9754;
                        if (c4696 == null) {
                            c4696 = new C4692(AbstractC0118.m212(c2917, 35), AbstractC0118.m212(c2917, 37), AbstractC0118.m212(c2917, 18), AbstractC0118.m212(c2917, 18), AbstractC0118.m212(c2917, 19), AbstractC0118.m212(c2917, 19));
                            c2917.f9754 = c4696;
                        }
                        C4692 c4699 = c4696;
                        i7 = i4 & (-4128769);
                        c4693 = c4699;
                    }
                    c4217 = C4217.f13994;
                    if (i5 != 0) {
                        interfaceC4688 = c4447;
                        f4 = 64.0f;
                        c4695 = c4693;
                        interfaceC0707 = c4217;
                        interfaceC26012 = interfaceC26011;
                        i8 = i7;
                        c52710 = null;
                    } else {
                        c4695 = c4693;
                        interfaceC0707 = c4217;
                        interfaceC26012 = interfaceC26011;
                        i8 = i7;
                        c52710 = c5278;
                        interfaceC4688 = c4447;
                        f4 = 64.0f;
                    }
                }
                c5362.m8964();
                C3564 c3564M8334 = AbstractC4957.m8333(13, c5362);
                C3564 c3565 = C3564.f11800;
                if (!C4497.m7826(f4, Float.NaN)) {
                    f3 = f4;
                }
                int i16 = i8 << 12;
                m4309(interfaceC0707, c0857, c3564M8334, c3565, c0858, interfaceC26012, f3, interfaceC4688, c4695, c52710, c5362, ((i8 >> 3) & 14) | 224256 | ((i8 << 3) & 112) | (i16 & 3670016) | (i16 & 29360128), (i8 >> 18) & 126);
                interfaceC0706 = interfaceC0707;
                interfaceC26010 = interfaceC26012;
                interfaceC4687 = interfaceC4688;
                c4694 = c4695;
                c5279 = c52710;
                f2 = f4;
            } else {
                c5362.m8982();
                interfaceC0706 = interfaceC0705;
                f2 = f;
                interfaceC4687 = interfaceC4686;
                c5279 = c5278;
                c4694 = c4693;
            }
            c5863M8965 = c5362.m8965();
            if (c5863M8965 != null) {
                c5863M8965.f19365 = new InterfaceC5731() { // from class: ۦٟۣٛؑ
                    @Override // p000.InterfaceC5731
                    /* JADX INFO: renamed from: ۥۜ */
                    public final Object mo219(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC2264.m4308(c0857, interfaceC0706, c0858, interfaceC26010, f2, interfaceC4687, c4694, c5279, (C5362) obj, AbstractC3831.m6835(i | 1), i2);
                        return C2358.f7817;
                    }
                };
            }
        }
        i9 |= 3072;
        interfaceC26010 = interfaceC2609;
        i4 = i9 | 24576;
        if ((196608 & i) == 0) {
            i4 = 90112 | i9;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                c4693 = c4692;
                if (c5362.m8963(c4693)) {
                }
                i4 |= i11;
            } else {
                c4693 = c4692;
            }
            i4 |= i11;
        } else {
            c4693 = c4692;
        }
        i5 = i2 & 128;
        if (i5 != 0) {
            if ((12582912 & i) == 0) {
                c5278 = c5277;
                if (c5362.m8963(c5278)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i4 |= i6;
            }
            if ((4793491 & i4) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (c5362.m9011(i4 & 1, z)) {
                c5362.m8971();
                f3 = 64.0f;
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        interfaceC26011 = AbstractC5888.f19424;
                    } else {
                        interfaceC26011 = interfaceC26010;
                    }
                    WeakHashMap weakHashMap4 = C2816.f9398;
                    C3080 c3083 = new C3080(AbstractC1434.m3061(c5362).f9416, AbstractC1434.m3061(c5362).f9406);
                    int i17 = AbstractC3925.f13098;
                    c4447 = new C4447(c3083, 15 | 16);
                    i7 = i4 & (-458753);
                    if ((i2 & 64) != 0) {
                        c2917 = (C2917) c5362.m8997(AbstractC0118.f470);
                        c4696 = c2917.f9754;
                        if (c4696 == null) {
                            c4696 = new C4692(AbstractC0118.m212(c2917, 35), AbstractC0118.m212(c2917, 37), AbstractC0118.m212(c2917, 18), AbstractC0118.m212(c2917, 18), AbstractC0118.m212(c2917, 19), AbstractC0118.m212(c2917, 19));
                            c2917.f9754 = c4696;
                        }
                        C4692 c46910 = c4696;
                        i7 = i4 & (-4128769);
                        c4693 = c46910;
                    }
                    c4217 = C4217.f13994;
                    if (i5 != 0) {
                        interfaceC4688 = c4447;
                        f4 = 64.0f;
                        c4695 = c4693;
                        interfaceC0707 = c4217;
                        interfaceC26012 = interfaceC26011;
                        i8 = i7;
                        c52710 = null;
                    } else {
                        c4695 = c4693;
                        interfaceC0707 = c4217;
                        interfaceC26012 = interfaceC26011;
                        i8 = i7;
                        c52710 = c5278;
                        interfaceC4688 = c4447;
                        f4 = 64.0f;
                    }
                } else {
                    if (i10 != 0) {
                        interfaceC26011 = AbstractC5888.f19424;
                    } else {
                        interfaceC26011 = interfaceC26010;
                    }
                    WeakHashMap weakHashMap5 = C2816.f9398;
                    C3080 c3084 = new C3080(AbstractC1434.m3061(c5362).f9416, AbstractC1434.m3061(c5362).f9406);
                    int i18 = AbstractC3925.f13098;
                    c4447 = new C4447(c3084, 15 | 16);
                    i7 = i4 & (-458753);
                    if ((i2 & 64) != 0) {
                        c2917 = (C2917) c5362.m8997(AbstractC0118.f470);
                        c4696 = c2917.f9754;
                        if (c4696 == null) {
                            c4696 = new C4692(AbstractC0118.m212(c2917, 35), AbstractC0118.m212(c2917, 37), AbstractC0118.m212(c2917, 18), AbstractC0118.m212(c2917, 18), AbstractC0118.m212(c2917, 19), AbstractC0118.m212(c2917, 19));
                            c2917.f9754 = c4696;
                        }
                        C4692 c46911 = c4696;
                        i7 = i4 & (-4128769);
                        c4693 = c46911;
                    }
                    c4217 = C4217.f13994;
                    if (i5 != 0) {
                        interfaceC4688 = c4447;
                        f4 = 64.0f;
                        c4695 = c4693;
                        interfaceC0707 = c4217;
                        interfaceC26012 = interfaceC26011;
                        i8 = i7;
                        c52710 = null;
                    } else {
                        c4695 = c4693;
                        interfaceC0707 = c4217;
                        interfaceC26012 = interfaceC26011;
                        i8 = i7;
                        c52710 = c5278;
                        interfaceC4688 = c4447;
                        f4 = 64.0f;
                    }
                }
                c5362.m8964();
                C3564 c3564M8335 = AbstractC4957.m8333(13, c5362);
                C3564 c3566 = C3564.f11800;
                if (!C4497.m7826(f4, Float.NaN)) {
                    f3 = f4;
                }
                int i19 = i8 << 12;
                m4309(interfaceC0707, c0857, c3564M8335, c3566, c0858, interfaceC26012, f3, interfaceC4688, c4695, c52710, c5362, ((i8 >> 3) & 14) | 224256 | ((i8 << 3) & 112) | (i19 & 3670016) | (i19 & 29360128), (i8 >> 18) & 126);
                interfaceC0706 = interfaceC0707;
                interfaceC26010 = interfaceC26012;
                interfaceC4687 = interfaceC4688;
                c4694 = c4695;
                c5279 = c52710;
                f2 = f4;
            } else {
                c5362.m8982();
                interfaceC0706 = interfaceC0705;
                f2 = f;
                interfaceC4687 = interfaceC4686;
                c5279 = c5278;
                c4694 = c4693;
            }
            c5863M8965 = c5362.m8965();
            if (c5863M8965 != null) {
                c5863M8965.f19365 = new InterfaceC5731() { // from class: ۦٟۣٛؑ
                    @Override // p000.InterfaceC5731
                    /* JADX INFO: renamed from: ۥۜ */
                    public final Object mo219(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC2264.m4308(c0857, interfaceC0706, c0858, interfaceC26010, f2, interfaceC4687, c4694, c5279, (C5362) obj, AbstractC3831.m6835(i | 1), i2);
                        return C2358.f7817;
                    }
                };
            }
        }
        i4 |= 12582912;
        c5278 = c5277;
        if ((4793491 & i4) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (c5362.m9011(i4 & 1, z)) {
            c5362.m8971();
            f3 = 64.0f;
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    interfaceC26011 = AbstractC5888.f19424;
                } else {
                    interfaceC26011 = interfaceC26010;
                }
                WeakHashMap weakHashMap6 = C2816.f9398;
                C3080 c3085 = new C3080(AbstractC1434.m3061(c5362).f9416, AbstractC1434.m3061(c5362).f9406);
                int i110 = AbstractC3925.f13098;
                c4447 = new C4447(c3085, 15 | 16);
                i7 = i4 & (-458753);
                if ((i2 & 64) != 0) {
                    c2917 = (C2917) c5362.m8997(AbstractC0118.f470);
                    c4696 = c2917.f9754;
                    if (c4696 == null) {
                        c4696 = new C4692(AbstractC0118.m212(c2917, 35), AbstractC0118.m212(c2917, 37), AbstractC0118.m212(c2917, 18), AbstractC0118.m212(c2917, 18), AbstractC0118.m212(c2917, 19), AbstractC0118.m212(c2917, 19));
                        c2917.f9754 = c4696;
                    }
                    C4692 c46912 = c4696;
                    i7 = i4 & (-4128769);
                    c4693 = c46912;
                }
                c4217 = C4217.f13994;
                if (i5 != 0) {
                    interfaceC4688 = c4447;
                    f4 = 64.0f;
                    c4695 = c4693;
                    interfaceC0707 = c4217;
                    interfaceC26012 = interfaceC26011;
                    i8 = i7;
                    c52710 = null;
                } else {
                    c4695 = c4693;
                    interfaceC0707 = c4217;
                    interfaceC26012 = interfaceC26011;
                    i8 = i7;
                    c52710 = c5278;
                    interfaceC4688 = c4447;
                    f4 = 64.0f;
                }
            } else {
                if (i10 != 0) {
                    interfaceC26011 = AbstractC5888.f19424;
                } else {
                    interfaceC26011 = interfaceC26010;
                }
                WeakHashMap weakHashMap7 = C2816.f9398;
                C3080 c3086 = new C3080(AbstractC1434.m3061(c5362).f9416, AbstractC1434.m3061(c5362).f9406);
                int i111 = AbstractC3925.f13098;
                c4447 = new C4447(c3086, 15 | 16);
                i7 = i4 & (-458753);
                if ((i2 & 64) != 0) {
                    c2917 = (C2917) c5362.m8997(AbstractC0118.f470);
                    c4696 = c2917.f9754;
                    if (c4696 == null) {
                        c4696 = new C4692(AbstractC0118.m212(c2917, 35), AbstractC0118.m212(c2917, 37), AbstractC0118.m212(c2917, 18), AbstractC0118.m212(c2917, 18), AbstractC0118.m212(c2917, 19), AbstractC0118.m212(c2917, 19));
                        c2917.f9754 = c4696;
                    }
                    C4692 c46913 = c4696;
                    i7 = i4 & (-4128769);
                    c4693 = c46913;
                }
                c4217 = C4217.f13994;
                if (i5 != 0) {
                    interfaceC4688 = c4447;
                    f4 = 64.0f;
                    c4695 = c4693;
                    interfaceC0707 = c4217;
                    interfaceC26012 = interfaceC26011;
                    i8 = i7;
                    c52710 = null;
                } else {
                    c4695 = c4693;
                    interfaceC0707 = c4217;
                    interfaceC26012 = interfaceC26011;
                    i8 = i7;
                    c52710 = c5278;
                    interfaceC4688 = c4447;
                    f4 = 64.0f;
                }
            }
            c5362.m8964();
            C3564 c3564M8336 = AbstractC4957.m8333(13, c5362);
            C3564 c3567 = C3564.f11800;
            if (!C4497.m7826(f4, Float.NaN)) {
                f3 = f4;
            }
            int i112 = i8 << 12;
            m4309(interfaceC0707, c0857, c3564M8336, c3567, c0858, interfaceC26012, f3, interfaceC4688, c4695, c52710, c5362, ((i8 >> 3) & 14) | 224256 | ((i8 << 3) & 112) | (i112 & 3670016) | (i112 & 29360128), (i8 >> 18) & 126);
            interfaceC0706 = interfaceC0707;
            interfaceC26010 = interfaceC26012;
            interfaceC4687 = interfaceC4688;
            c4694 = c4695;
            c5279 = c52710;
            f2 = f4;
        } else {
            c5362.m8982();
            interfaceC0706 = interfaceC0705;
            f2 = f;
            interfaceC4687 = interfaceC4686;
            c5279 = c5278;
            c4694 = c4693;
        }
        c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731() { // from class: ۦٟۣٛؑ
                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC2264.m4308(c0857, interfaceC0706, c0858, interfaceC26010, f2, interfaceC4687, c4694, c5279, (C5362) obj, AbstractC3831.m6835(i | 1), i2);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m4309(final InterfaceC0705 interfaceC0705, final C0857 c0857, final C3564 c3564, final C3564 c3565, final C0857 c0858, final InterfaceC2609 interfaceC2609, final float f, final InterfaceC4686 interfaceC4686, final C4692 c4692, final C5277 c5277, C5362 c5362, final int i, final int i2) {
        int i3;
        C3564 c3566;
        InterfaceC2609 interfaceC26010;
        float f2;
        InterfaceC4686 interfaceC4687;
        int i4;
        C5277 c5278;
        C1911 c1911 = C1298.f4443;
        c5362.m8979(-2033800111);
        if ((i & 6) == 0) {
            i3 = (c5362.m8963(interfaceC0705) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c5362.m8977(c0857) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c5362.m8963(c3564) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c5362.m8977(null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            c3566 = c3565;
            i3 |= c5362.m8963(c3566) ? 16384 : 8192;
        } else {
            c3566 = c3565;
        }
        if ((196608 & i) == 0) {
            i3 |= c5362.m8963(c1911) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= c5362.m8977(c0858) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            interfaceC26010 = interfaceC2609;
            i3 |= c5362.m8977(interfaceC26010) ? 8388608 : 4194304;
        } else {
            interfaceC26010 = interfaceC2609;
        }
        if ((100663296 & i) == 0) {
            f2 = f;
            i3 |= c5362.m8956(f2) ? 67108864 : 33554432;
        } else {
            f2 = f;
        }
        if ((805306368 & i) == 0) {
            interfaceC4687 = interfaceC4686;
            i3 |= c5362.m8963(interfaceC4687) ? 536870912 : 268435456;
        } else {
            interfaceC4687 = interfaceC4686;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (c5362.m8963(c4692) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            c5278 = c5277;
            i4 |= c5362.m8963(c5278) ? 32 : 16;
        } else {
            c5278 = c5277;
        }
        if (c5362.m9011(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            ((C4691) c5362.m8997(f7521)).m8040(new C4741(interfaceC0705, c0857, c3564, c3566, c0858, interfaceC26010, f2, interfaceC4687, c4692, c5278), c5362, 0);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731() { // from class: ۦَؔؗؑ
                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC2264.m4309(interfaceC0705, c0857, c3564, c3565, c0858, interfaceC2609, f, interfaceC4686, c4692, c5277, (C5362) obj, AbstractC3831.m6835(i | 1), AbstractC3831.m6835(i2));
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: ۦؑ */
    public static final Object m4310(C5765 c5765, float f, C5468 c5468, InterfaceC3347 interfaceC3347, AbstractC0772 abstractC0772) {
        C4260 c4260;
        C1916 c1916;
        C1916 c1917;
        if (abstractC0772 instanceof C4260) {
            c4260 = (C4260) abstractC0772;
            int i = c4260.f14118;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4260.f14118 = i - Integer.MIN_VALUE;
            } else {
                c4260 = new C4260(abstractC0772);
            }
        } else {
            c4260 = new C4260(abstractC0772);
        }
        C4260 c4261 = c4260;
        Object obj = c4261.f14117;
        int i2 = c4261.f14118;
        int i3 = 1;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        if (i2 != 0) {
            if (i2 == 1) {
                C1916 c1918 = c4261.f14116;
                interfaceC3347 = c4261.f14114;
                C5765 c5766 = (C5765) c4261.f14115;
                AbstractC0186.m409(obj);
                c1916 = c1918;
                c5765 = c5766;
            } else {
                if (i2 != 2) {
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c1917 = (C1916) c4261.f14115;
                AbstractC0186.m409(obj);
            }
            c1916 = c1917;
            return new C0963(AbstractC3933.m7091(0.0f, c1916.f6312));
        }
        AbstractC0186.m409(obj);
        if (c5765.m9577() < 0.01f || c5765.m9577() == 1.0f) {
            return new C0963(0L);
        }
        c1916 = new C1916();
        c1916.f6312 = f;
        if (c5468 != null && Math.abs(f) > 1.0f) {
            C1916 c1919 = new C1916();
            C3411 c3411M7901 = AbstractC4554.m7901(0.0f, f, 28);
            C3464 c3464 = new C3464(c1919, c5765, c1916, i3);
            c4261.f14115 = c5765;
            c4261.f14114 = interfaceC3347;
            c4261.f14116 = c1916;
            c4261.f14118 = 1;
            if (AbstractC3831.m6843(c3411M7901, c5468, false, c3464, c4261) != enumC2282) {
            }
            return enumC2282;
        }
        return new C0963(AbstractC3933.m7091(0.0f, c1916.f6312));
        if (interfaceC3347 != null) {
            C0811 c0811 = c5765.f19005;
            if (c0811.m1711() < 0.0f && c0811.m1711() > c5765.f19007) {
                C3411 c3411M7902 = AbstractC4554.m7901(c0811.m1711(), 0.0f, 30);
                Float f2 = new Float(c5765.m9577() < 0.5f ? 0.0f : c5765.f19007);
                C0511 c0511 = new C0511(c5765, i3);
                c4261.f14115 = c1916;
                c4261.f14114 = null;
                c4261.f14116 = null;
                c4261.f14118 = 2;
                if (AbstractC3831.m6854(c3411M7902, f2, interfaceC3347, c0511, c4261, 4) != enumC2282) {
                    c1917 = c1916;
                    c1916 = c1917;
                }
                return enumC2282;
            }
        }
        return new C0963(AbstractC3933.m7091(0.0f, c1916.f6312));
    }
}
