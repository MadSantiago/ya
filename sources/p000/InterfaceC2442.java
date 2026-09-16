package p000;

/* JADX INFO: renamed from: ۥٜ۟ؓؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2442 extends InterfaceC2880 {
    /* JADX INFO: renamed from: ۥؔ */
    static void m4558(C2497 c2497, C1955 c1955, C1516 c1516) {
        C2004 c2004 = c2497.f8304;
        c2004.f6604.f8014.mo2090(c1955, c2004.m3901(null, C1548.f5235, 1.0f, c1516, 3, 1));
    }

    /* JADX INFO: renamed from: ۥؚ */
    static void m4559(InterfaceC2442 interfaceC2442, C1955 c1955, long j, long j2, float f, C1516 c1516, int i, int i2) {
        interfaceC2442.mo3907(c1955, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, c1516, (i2 & 512) != 0 ? 1 : i);
    }

    /* JADX INFO: renamed from: ۥٕ */
    static void m4560(InterfaceC2442 interfaceC2442, long j, float f, long j2, AbstractC0213 abstractC0213, int i) {
        if ((i & 4) != 0) {
            j2 = interfaceC2442.mo4568();
        }
        long j3 = j2;
        if ((i & 16) != 0) {
            abstractC0213 = C1548.f5235;
        }
        interfaceC2442.mo3909(j, f, j3, abstractC0213);
    }

    /* JADX INFO: renamed from: ۦ */
    static void m4561(InterfaceC2442 interfaceC2442, long j, long j2, float f, int i) {
        if ((i & 4) != 0) {
            j2 = m4564(interfaceC2442.mo4567(), 0L);
        }
        long j3 = j2;
        if ((i & 8) != 0) {
            f = 1.0f;
        }
        interfaceC2442.mo3902(j, 0L, j3, f, (i & 64) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: ۦؔ */
    static void m4562(InterfaceC2442 interfaceC2442, long j, long j2, long j3, long j4, AbstractC0213 abstractC0213, int i) {
        interfaceC2442.mo3905(j, (i & 2) != 0 ? 0L : j2, j3, j4, abstractC0213);
    }

    /* JADX INFO: renamed from: ۦؙ */
    static void m4563(C2497 c2497, AbstractC0548 abstractC0548, long j, long j2, long j3, AbstractC0213 abstractC0213, int i) {
        long j4 = (i & 2) != 0 ? 0L : j;
        long jM4564 = (i & 4) != 0 ? m4564(c2497.f8304.mo4567(), j4) : j2;
        AbstractC0213 abstractC0214 = (i & 32) != 0 ? C1548.f5235 : abstractC0213;
        C2004 c2004 = c2497.f8304;
        int i2 = (int) (j4 >> 32);
        int i3 = (int) (j4 & 4294967295L);
        c2004.f6604.f8014.mo2094(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (jM4564 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jM4564 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), c2004.m3901(abstractC0548, abstractC0214, 1.0f, null, 3, 1));
    }

    /* JADX INFO: renamed from: ۦّ */
    static long m4564(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: ۦٗ */
    static void m4565(InterfaceC2442 interfaceC2442, C0935 c0935, AbstractC0548 abstractC0548, float f, C3579 c3579, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        AbstractC0213 abstractC0213 = c3579;
        if ((i & 8) != 0) {
            abstractC0213 = C1548.f5235;
        }
        interfaceC2442.mo3906(c0935, abstractC0548, f2, abstractC0213, (i & 32) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: ۦۧ */
    static void m4566(C2497 c2497, AbstractC0548 abstractC0548, long j, long j2, float f, AbstractC0213 abstractC0213, int i) {
        long j3 = (i & 2) != 0 ? 0L : j;
        long jM4564 = (i & 4) != 0 ? m4564(c2497.f8304.mo4567(), j3) : j2;
        float f2 = (i & 8) != 0 ? 1.0f : f;
        AbstractC0213 abstractC0214 = (i & 16) != 0 ? C1548.f5235 : abstractC0213;
        C2004 c2004 = c2497.f8304;
        int i2 = (int) (j3 >> 32);
        int i3 = (int) (j3 & 4294967295L);
        c2004.f6604.f8014.mo2098(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (jM4564 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jM4564 & 4294967295L)) + Float.intBitsToFloat(i3), c2004.m3901(abstractC0548, abstractC0214, f2, null, 3, 1));
    }

    EnumC2459 getLayoutDirection();

    /* JADX INFO: renamed from: ۥؕ */
    void mo3900(long j, long j2, long j3, float f);

    /* JADX INFO: renamed from: ۥٍ */
    void mo3902(long j, long j2, long j3, float f, int i);

    /* JADX INFO: renamed from: ۥِ */
    void mo3904(C0935 c0935, long j, AbstractC0213 abstractC0213);

    /* JADX INFO: renamed from: ۥٙ */
    void mo3905(long j, long j2, long j3, long j4, AbstractC0213 abstractC0213);

    /* JADX INFO: renamed from: ۥۜ */
    void mo3906(C0935 c0935, AbstractC0548 abstractC0548, float f, AbstractC0213 abstractC0213, int i);

    /* JADX INFO: renamed from: ۦؑ */
    default long mo4567() {
        return mo3908().m5355();
    }

    /* JADX INFO: renamed from: ۦؒ */
    void mo3907(C1955 c1955, long j, long j2, long j3, float f, C1516 c1516, int i);

    /* JADX INFO: renamed from: ۦٚ */
    C2808 mo3908();

    /* JADX INFO: renamed from: ۦ۠ */
    default long mo4568() {
        return AbstractC3831.m6848(mo3908().m5355());
    }

    /* JADX INFO: renamed from: ۦۢ */
    void mo3909(long j, float f, long j2, AbstractC0213 abstractC0213);
}
