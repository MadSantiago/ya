package p000;

/* JADX INFO: renamed from: ۥِٕؒٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1089 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3262 f3804 = m2298(true);

    /* JADX INFO: renamed from: ۥۗ */
    public static final C3262 f3803 = m2298(false);

    /* JADX INFO: renamed from: ۥؗ */
    public static final C2480 f3802 = C2480.f8263;

    /* JADX INFO: renamed from: ۥؗ */
    public static final InterfaceC3228 m2297(C3039 c3039, boolean z) {
        InterfaceC3228 interfaceC3228 = (InterfaceC3228) (z ? f3804 : f3803).m6027(c3039);
        return interfaceC3228 == null ? new C0345(c3039, z) : interfaceC3228;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final C3262 m2298(boolean z) {
        C3262 c3262 = new C3262(9);
        C3039 c3039 = C1298.f4456;
        c3262.m6023(c3039, new C0345(c3039, z));
        C3039 c30310 = C1298.f4428;
        c3262.m6023(c30310, new C0345(c30310, z));
        C3039 c30311 = C1298.f4429;
        c3262.m6023(c30311, new C0345(c30311, z));
        C3039 c30312 = C1298.f4427;
        c3262.m6023(c30312, new C0345(c30312, z));
        C3039 c30313 = C1298.f4431;
        c3262.m6023(c30313, new C0345(c30313, z));
        C3039 c30314 = C1298.f4452;
        c3262.m6023(c30314, new C0345(c30314, z));
        C3039 c30315 = C1298.f4454;
        c3262.m6023(c30315, new C0345(c30315, z));
        C3039 c30316 = C1298.f4436;
        c3262.m6023(c30316, new C0345(c30316, z));
        C3039 c30317 = C1298.f4450;
        c3262.m6023(c30317, new C0345(c30317, z));
        return c3262;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m2299(InterfaceC0705 interfaceC0705, C5362 c5362, int i) {
        int i2;
        c5362.m8979(-211209833);
        if ((i & 6) == 0) {
            i2 = (c5362.m8963(interfaceC0705) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (c5362.m9011(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(c5362.f17657);
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705);
            C2103 c2103M8994 = c5362.m8994();
            InterfaceC4576.f15106.getClass();
            C3709 c3709 = C0849.f3049;
            c5362.m8983();
            if (c5362.f17668) {
                c5362.m9005(c3709);
            } else {
                c5362.m8972();
            }
            AbstractC0993.m2127(C0849.f3048, c5362, f3802);
            AbstractC0993.m2127(C0849.f3047, c5362, c2103M8994);
            AbstractC0993.m2146(c5362, C0849.f3050);
            AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
            AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode));
            c5362.m9009(true);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C5150(interfaceC0705, i);
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final void m2300(AbstractC1842 abstractC1842, AbstractC0275 abstractC0275, InterfaceC1827 interfaceC1827, EnumC2459 enumC2459, int i, int i2, C3039 c3039) {
        C3039 c30310;
        Object objMo570 = interfaceC1827.mo570();
        C1465 c1465 = objMo570 instanceof C1465 ? (C1465) objMo570 : null;
        AbstractC1842.m3624(abstractC1842, abstractC0275, ((c1465 == null || (c30310 = c1465.f4980) == null) ? c3039 : c30310).mo608((((long) abstractC0275.f985) << 32) | (((long) abstractC0275.f984) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), enumC2459));
    }
}
