package p000;

/* JADX INFO: renamed from: ۦٝؖؓۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4753 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C1393 f15689;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C1393 f15690;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C1393 f15691 = new C1393(24.0f, 24.0f, 24.0f, 24.0f);

    /* JADX INFO: renamed from: ۦؑ */
    public static final C4216 f15692;

    static {
        AbstractC5568.m9388(0.0f, 0.0f, 16.0f, 7);
        f15690 = AbstractC5568.m9388(0.0f, 0.0f, 16.0f, 7);
        f15689 = AbstractC5568.m9388(0.0f, 0.0f, 24.0f, 7);
        f15692 = new C4216(0, new C0062(8));
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final void m8078(final InterfaceC4448 interfaceC4448, final C0857 c0857, final InterfaceC0705 interfaceC0705, final InterfaceC5731 interfaceC5731, final InterfaceC5731 interfaceC5732, final InterfaceC2864 interfaceC2864, final long j, final long j2, final long j3, final long j4, final C4231 c4231, C5362 c5362, final int i, final int i2) {
        int i3;
        C0857 c0858;
        InterfaceC5731 interfaceC5733;
        InterfaceC5731 interfaceC5734;
        int i4;
        c5362.m8979(-867616355);
        if ((i & 6) == 0) {
            i3 = (c5362.m8977(interfaceC4448) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            c0858 = c0857;
            i3 |= c5362.m8977(c0858) ? 32 : 16;
        } else {
            c0858 = c0857;
        }
        if ((i & 384) == 0) {
            i3 |= c5362.m8963(interfaceC0705) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c5362.m8977(null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c5362.m8977(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            interfaceC5733 = interfaceC5731;
            i3 |= c5362.m8977(interfaceC5733) ? 131072 : 65536;
        } else {
            interfaceC5733 = interfaceC5731;
        }
        if ((1572864 & i) == 0) {
            interfaceC5734 = interfaceC5732;
            i3 |= c5362.m8977(interfaceC5734) ? 1048576 : 524288;
        } else {
            interfaceC5734 = interfaceC5732;
        }
        if ((i & 12582912) == 0) {
            i3 |= c5362.m8963(interfaceC2864) ? 8388608 : 4194304;
        }
        int i5 = i3;
        if ((i & 100663296) == 0) {
            i5 |= c5362.m8961(j) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i5 |= c5362.m8961(j2) ? 536870912 : 268435456;
        }
        int i6 = i5;
        if ((i2 & 6) == 0) {
            i4 = i2 | (c5362.m8961(j3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c5362.m8961(j4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c5362.m8956(0.0f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c5362.m8963(c4231) ? 2048 : 1024;
        }
        int i7 = i4;
        if (c5362.m9011(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 1171) == 1170) ? false : true)) {
            m8081(interfaceC4448, interfaceC0705, c4231, AbstractC3925.m7034(527420759, new C3007(interfaceC5733, interfaceC5734, interfaceC2864, j, j2, j3, j4, c0858), c5362), c5362, (i6 & 14) | 3072 | ((i6 >> 3) & 112) | ((i7 >> 3) & 896));
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731() { // from class: ۦؚؑۤؐ
                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM6835 = AbstractC3831.m6835(i | 1);
                    int iM6836 = AbstractC3831.m6835(i2);
                    AbstractC4753.m8078(interfaceC4448, c0857, interfaceC0705, interfaceC5731, interfaceC5732, interfaceC2864, j, j2, j3, j4, c4231, (C5362) obj, iM6835, iM6836);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m8079(C0857 c0857, C5362 c5362, int i) {
        c5362.m8979(-917637668);
        int i2 = 0;
        if (c5362.m9011(i & 1, (i & 147) != 146)) {
            Object objM8999 = c5362.m8999();
            if (objM8999 == C2850.f9517) {
                objM8999 = new C2480(8);
                c5362.m8987(objM8999);
            }
            InterfaceC3228 interfaceC3228 = (InterfaceC3228) objM8999;
            int iM1958 = AbstractC0949.m1958(c5362);
            C2103 c2103M8994 = c5362.m8994();
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, C4217.f13994);
            InterfaceC4576.f15106.getClass();
            C3709 c3709 = C0849.f3049;
            c5362.m8983();
            if (c5362.f17668) {
                c5362.m9005(c3709);
            } else {
                c5362.m8972();
            }
            AbstractC0993.m2127(C0849.f3048, c5362, interfaceC3228);
            AbstractC0993.m2127(C0849.f3047, c5362, c2103M8994);
            C3136 c3136 = C0849.f3053;
            if (c5362.f17668 || !AbstractC3831.m6874(c5362.m8999(), Integer.valueOf(iM1958))) {
                AbstractC3761.m6618(iM1958, c5362, iM1958, c3136);
            }
            AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
            c0857.mo219(c5362, 6);
            c5362.m9009(true);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4904(c0857, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m8080(final C0857 c0857, InterfaceC0705 interfaceC0705, final InterfaceC5731 interfaceC5731, final InterfaceC5731 interfaceC5732, final InterfaceC2864 interfaceC2864, final long j, final long j2, final long j3, final long j4, final long j5, C5362 c5362, final int i) {
        final InterfaceC0705 interfaceC0706;
        c5362.m8979(1378716401);
        int i2 = i | 48 | (c5362.m8977(null) ? 256 : 128) | (c5362.m8977(interfaceC5731) ? 2048 : 1024) | (c5362.m8977(interfaceC5732) ? 16384 : 8192) | (c5362.m8963(interfaceC2864) ? 131072 : 65536) | (c5362.m8961(j) ? 1048576 : 524288) | (c5362.m8956(0.0f) ? 8388608 : 4194304) | (c5362.m8961(j2) ? 67108864 : 33554432) | (c5362.m8961(j3) ? 536870912 : 268435456);
        if (c5362.m9011(i2 & 1, ((306783379 & i2) == 306783378 && (((c5362.m8961(j5) ? ' ' : (char) 16) | (c5362.m8961(j4) ? (char) 4 : (char) 2)) & 19) == 18) ? false : true)) {
            C0857 c0857M7034 = AbstractC3925.m7034(-652798794, new C5255(interfaceC5731, interfaceC5732, j3, j4, j5, j2, c0857), c5362);
            int i3 = i2 >> 12;
            int i4 = (i3 & 896) | (i3 & 112) | 12582918 | ((i2 >> 9) & 57344);
            C4217 c4217 = C4217.f13994;
            AbstractC0701.m1560(c4217, interfaceC2864, j, 0L, 0.0f, 0.0f, c0857M7034, c5362, i4, 104);
            interfaceC0706 = c4217;
        } else {
            c5362.m8982();
            interfaceC0706 = interfaceC0705;
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731(interfaceC0706, interfaceC5731, interfaceC5732, interfaceC2864, j, j2, j3, j4, j5, i) { // from class: ۦٌُؒ۟

                /* JADX INFO: renamed from: ۥَ */
                public final /* synthetic */ InterfaceC2864 f12346;

                /* JADX INFO: renamed from: ۥْ */
                public final /* synthetic */ InterfaceC5731 f12347;

                /* JADX INFO: renamed from: ۥٓ */
                public final /* synthetic */ InterfaceC5731 f12348;

                /* JADX INFO: renamed from: ۥٖ */
                public final /* synthetic */ long f12349;

                /* JADX INFO: renamed from: ۥۖ */
                public final /* synthetic */ long f12350;

                /* JADX INFO: renamed from: ۦٕ */
                public final /* synthetic */ long f12351;

                /* JADX INFO: renamed from: ۦٗ */
                public final /* synthetic */ long f12352;

                /* JADX INFO: renamed from: ۦۛ */
                public final /* synthetic */ long f12353;

                /* JADX INFO: renamed from: ۦ۟ */
                public final /* synthetic */ InterfaceC0705 f12354;

                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM6835 = AbstractC3831.m6835(7);
                    AbstractC4753.m8080(this.f12355, this.f12354, this.f12347, this.f12348, this.f12346, this.f12349, this.f12352, this.f12353, this.f12350, this.f12351, (C5362) obj, iM6835);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final void m8081(InterfaceC4448 interfaceC4448, InterfaceC0705 interfaceC0705, C4231 c4231, C0857 c0857, C5362 c5362, int i) {
        int i2;
        c5362.m8979(24925658);
        if ((i & 6) == 0) {
            i2 = (c5362.m8977(interfaceC4448) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5362.m8963(interfaceC0705) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c5362.m8963(c4231) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c5362.m8977(c0857) ? 2048 : 1024;
        }
        if (c5362.m9011(i2 & 1, (i2 & 1171) != 1170)) {
            ((C0942) c5362.m8997(f15692)).m1917(new C1489(interfaceC4448, interfaceC0705, c4231, c0857, 3), c5362, 0);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0089(interfaceC4448, interfaceC0705, c4231, c0857, i, 1);
        }
    }
}
