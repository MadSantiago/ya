package p000;

/* JADX INFO: renamed from: ۥؘُٖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1487 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C1393 f5051 = new C1393(8.0f, 4.0f, 8.0f, 4.0f);

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m3092(InterfaceC4396 interfaceC4396, C0857 c0857, C4153 c4153, InterfaceC0705 interfaceC0705, boolean z, C0857 c0858, C5362 c5362, int i) {
        InterfaceC4396 interfaceC4397;
        int i2;
        InterfaceC0705 interfaceC0706;
        boolean z2;
        c5362.m8979(-293753984);
        if ((i & 6) == 0) {
            interfaceC4397 = interfaceC4396;
            i2 = (c5362.m8963(interfaceC4397) ? 4 : 2) | i;
        } else {
            interfaceC4397 = interfaceC4396;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5362.m8977(c0857) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? c5362.m8963(c4153) : c5362.m8977(c4153) ? 256 : 128;
        }
        int i3 = i2 | 14380032;
        if ((100663296 & i) == 0) {
            i3 |= c5362.m8977(c0858) ? 67108864 : 33554432;
        }
        if (c5362.m9011(i3 & 1, (38347923 & i3) != 38347922)) {
            C5208 c5208 = c4153.f13839;
            boolean zM8963 = c5362.m8963(c5208);
            Object objM8999 = c5362.m8999();
            Object obj = C2850.f9517;
            if (zM8963 || objM8999 == obj) {
                AbstractC3191 abstractC3191M7473 = AbstractC4225.m7473();
                InterfaceC4745 interfaceC4745Mo4945 = abstractC3191M7473 != null ? abstractC3191M7473.mo4945() : null;
                AbstractC3191 abstractC3191M7452 = AbstractC4225.m7452(abstractC3191M7473);
                try {
                    Object c0777 = new C0777(c5208, null, "tooltip transition");
                    AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
                    c5362.m8987(c0777);
                    objM8999 = c0777;
                } catch (Throwable th) {
                    AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
                    throw th;
                }
            }
            C0777 c0778 = (C0777) objM8999;
            c5362.m8957(-1356604288);
            c0778.m1676(c5208.f17212.getValue(), c5362, 0);
            c5362.m9009(false);
            boolean zM8964 = c5362.m8963(c0778);
            Object objM89910 = c5362.m8999();
            if (zM8964 || objM89910 == obj) {
                objM89910 = new C0685(c0778, 0);
                c5362.m8987(objM89910);
            }
            AbstractC3925.m7028(c0778, (InterfaceC4745) objM89910, c5362);
            Object objM89911 = c5362.m8999();
            if (objM89911 == obj) {
                objM89911 = AbstractC2774.m5183(null);
                c5362.m8987(objM89911);
            }
            InterfaceC4367 interfaceC4367 = (InterfaceC4367) objM89911;
            Object objM89912 = c5362.m8999();
            if (objM89912 == obj) {
                new C0681(interfaceC4367, 19);
                objM89912 = new C1519();
                c5362.m8987(objM89912);
            }
            InterfaceC4396 interfaceC4398 = interfaceC4397;
            AbstractC0487.m1064(interfaceC4398, AbstractC3925.m7034(-527401546, new C3589(c0778, c0857, (C1519) objM89912), c5362), c4153, AbstractC3925.m7034(-23901870, new C0491(8, interfaceC4367, c0858), c5362), c5362, (i3 & 29360128) | (i3 & 14) | 100663344 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3));
            interfaceC0706 = C4217.f13994;
            z2 = true;
        } else {
            c5362.m8982();
            interfaceC0706 = interfaceC0705;
            z2 = z;
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C1229(interfaceC4396, c0857, c4153, interfaceC0706, z2, c0858, i);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m3093(final C1519 c1519, InterfaceC0705 interfaceC0705, float f, InterfaceC2864 interfaceC2864, long j, long j2, final C0857 c0857, C5362 c5362, final int i) {
        int i2;
        InterfaceC0705 interfaceC0706;
        final float f2;
        final InterfaceC2864 interfaceC2865;
        final long j3;
        final long j4;
        float f3;
        long jM216;
        int i3;
        InterfaceC2864 interfaceC2866;
        long j5;
        c5362.m8979(-343758958);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c5362.m8963(c1519) : c5362.m8977(c1519) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 3504;
        if ((i & 24576) == 0) {
            i4 = i2 | 11696;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        int i5 = 113246208 | i4;
        if ((805306368 & i) == 0) {
            i5 |= c5362.m8977(c0857) ? 536870912 : 268435456;
        }
        if (c5362.m9011(i5 & 1, (306783379 & i5) != 306783378)) {
            c5362.m8971();
            if ((i & 1) == 0 || c5362.m8969()) {
                f3 = AbstractC0619.f2308;
                InterfaceC2864 interfaceC2864M546 = AbstractC0265.m546(5, c5362);
                long jM217 = AbstractC0118.m216(4, c5362);
                jM216 = AbstractC0118.m216(6, c5362);
                i3 = i5 & (-4186113);
                interfaceC0706 = C4217.f13994;
                interfaceC2866 = interfaceC2864M546;
                j5 = jM217;
            } else {
                c5362.m8982();
                interfaceC0706 = interfaceC0705;
                f3 = f;
                interfaceC2866 = interfaceC2864;
                jM216 = j2;
                i3 = i5 & (-4186113);
                j5 = j;
            }
            c5362.m8964();
            c5362.m8957(-1719831991);
            c5362.m9009(false);
            int i6 = i3 >> 9;
            AbstractC0701.m1560(interfaceC0706, interfaceC2866, jM216, 0L, 0.0f, 0.0f, AbstractC3925.m7034(-1573998995, new C2781(f3, j5, c0857), c5362), c5362, (57344 & i6) | 12582912 | (i6 & 458752), 72);
            long j6 = j5;
            f2 = f3;
            j3 = j6;
            interfaceC2865 = interfaceC2866;
            j4 = jM216;
        } else {
            c5362.m8982();
            interfaceC0706 = interfaceC0705;
            f2 = f;
            interfaceC2865 = interfaceC2864;
            j3 = j;
            j4 = j2;
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            final InterfaceC0705 interfaceC0707 = interfaceC0706;
            c5863M8965.f19365 = new InterfaceC5731() { // from class: ۥٌٟۨ
                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC1487.m3093(c1519, interfaceC0707, f2, interfaceC2865, j3, j4, c0857, (C5362) obj, AbstractC3831.m6835(i | 1));
                    return C2358.f7817;
                }
            };
        }
    }
}
