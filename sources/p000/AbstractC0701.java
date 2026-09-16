package p000;

/* JADX INFO: renamed from: ۥؘؙْؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0701 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4216 f2545 = new C4216(0, new C2971(11));

    /* JADX INFO: renamed from: ۥؗ */
    public static final InterfaceC0705 m1558(InterfaceC0705 interfaceC0705, InterfaceC2864 interfaceC2864, long j, C3966 c3966, float f) {
        InterfaceC2864 interfaceC2865;
        InterfaceC0705 interfaceC0705M7928;
        InterfaceC0705 c4860 = C4217.f13994;
        if (f > 0.0f) {
            interfaceC2865 = interfaceC2864;
            interfaceC0705M7928 = AbstractC4554.m7928(c4860, 0.0f, 0.0f, 0.0f, f, interfaceC2865, 124895);
        } else {
            interfaceC2865 = interfaceC2864;
            interfaceC0705M7928 = c4860;
        }
        InterfaceC0705 interfaceC0705Mo1571 = interfaceC0705.mo1571(interfaceC0705M7928);
        if (c3966 != null) {
            c4860 = new C4860(c3966.f13263, c3966.f13262, interfaceC2865);
        }
        return AbstractC5537.m9269(AbstractC5568.m9382(interfaceC0705Mo1571.mo1571(c4860), j, interfaceC2865), interfaceC2865);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m1559(InterfaceC4448 interfaceC4448, InterfaceC0705 interfaceC0705, boolean z, InterfaceC2864 interfaceC2864, long j, long j2, float f, float f2, C2243 c2243, C0857 c0857, C5362 c5362, int i, int i2) {
        C2243 c2244;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        float f3 = (i2 & 64) != 0 ? 0.0f : f;
        if (c2243 == null) {
            c5362.m8957(-1701037204);
            Object objM8999 = c5362.m8999();
            if (objM8999 == C2850.f9517) {
                objM8999 = new C2243();
                c5362.m8987(objM8999);
            }
            c5362.m9009(false);
            c2244 = (C2243) objM8999;
        } else {
            c5362.m8957(2023337163);
            c5362.m9009(false);
            c2244 = c2243;
        }
        C4216 c4216 = f2545;
        float f4 = ((C4497) c5362.m8997(c4216)).f14871 + f3;
        C4773.m8123(new C3467[]{AbstractC0194.f721.mo4313(new C1327(j2)), c4216.mo4313(new C4497(f4))}, AbstractC3925.m7034(849208527, new C2385(interfaceC0705, interfaceC2864, j, f4, null, c2244, z2, interfaceC4448, f2, c0857), c5362), c5362, 56);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m1560(InterfaceC0705 interfaceC0705, InterfaceC2864 interfaceC2864, long j, long j2, float f, float f2, C0857 c0857, C5362 c5362, int i, int i2) {
        if ((i2 & 2) != 0) {
            interfaceC2864 = AbstractC2552.f8518;
        }
        InterfaceC2864 interfaceC2865 = interfaceC2864;
        if ((i2 & 4) != 0) {
            j = ((C2917) c5362.m8997(AbstractC0118.f470)).f9778;
        }
        long j3 = j;
        long jM215 = (i2 & 8) != 0 ? AbstractC0118.m215(j3, c5362) : j2;
        float f3 = (i2 & 16) != 0 ? 0.0f : f;
        float f4 = (i2 & 32) != 0 ? 0.0f : f2;
        C4216 c4216 = f2545;
        float f5 = ((C4497) c5362.m8997(c4216)).f14871 + f3;
        C4773.m8123(new C3467[]{AbstractC0194.f721.mo4313(new C1327(jM215)), c4216.mo4313(new C4497(f5))}, AbstractC3925.m7034(421772006, new C3794(interfaceC0705, interfaceC2865, j3, f5, f4, c0857), c5362), c5362, 56);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final long m1561(long j, float f, C5362 c5362) {
        C2917 c2917 = (C2917) c5362.m8997(AbstractC0118.f470);
        boolean zBooleanValue = ((Boolean) c5362.m8997(AbstractC0118.f469)).booleanValue();
        long j2 = c2917.f9778;
        int i = C1327.f4593;
        if (!C4462.m7744(j, j2) || !zBooleanValue) {
            return j;
        }
        if (C4497.m7826(f, 0.0f)) {
            return j2;
        }
        return AbstractC4225.m7451(C1327.m2826(c2917.f9739, ((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, 14), j2);
    }
}
