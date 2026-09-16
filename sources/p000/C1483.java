package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥٖٖؗٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1483 implements InterfaceC3228 {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ C5745 f5036;

    /* JADX INFO: renamed from: ۥُ */
    public final /* synthetic */ InterfaceC2880 f5037;

    /* JADX INFO: renamed from: ۥّ */
    public final /* synthetic */ int f5038;

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ InterfaceC4745 f5039;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ C5837 f5040;

    /* JADX INFO: renamed from: ۦؑ */
    public final /* synthetic */ InterfaceC4120 f5041;

    public C1483(C5837 c5837, InterfaceC4745 interfaceC4745, C5745 c5745, InterfaceC4120 interfaceC4120, InterfaceC2880 interfaceC2880, int i) {
        this.f5040 = c5837;
        this.f5039 = interfaceC4745;
        this.f5036 = c5745;
        this.f5041 = interfaceC4120;
        this.f5037 = interfaceC2880;
        this.f5038 = i;
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo3091(InterfaceC0151 interfaceC0151, List list, int i) {
        C5837 c5837 = this.f5040;
        c5837.f19232.m960(interfaceC0151.getLayoutDirection());
        C1414 c1414 = c5837.f19232.f1629;
        if (c1414 != null) {
            return AbstractC1434.m3058(c1414.mo2987());
        }
        C1078.m2276("layoutIntrinsics must be called first");
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ed  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [ۥؙٟؕ۟] */
    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۦۙ */
    public final InterfaceC5370 mo771(InterfaceC2427 interfaceC2427, List list, long j) {
        C3828 c3828;
        InterfaceC5370 interfaceC5370;
        C3828 c3829;
        C3828 c38210;
        C1483 c1483;
        C5837 c5837;
        int i;
        int iM3058;
        ?? r14;
        C5837 c5838 = this.f5040;
        AbstractC3191 abstractC3191M7473 = AbstractC4225.m7473();
        InterfaceC4745 interfaceC4745Mo4945 = abstractC3191M7473 != null ? abstractC3191M7473.mo4945() : null;
        AbstractC3191 abstractC3191M7452 = AbstractC4225.m7452(abstractC3191M7473);
        try {
            C2449 c2449M9648 = c5838.m9648();
            AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
            C3828 c38211 = c2449M9648 != null ? c2449M9648.f8158 : null;
            C0441 c0441 = c5838.f19232;
            EnumC2459 layoutDirection = interfaceC2427.getLayoutDirection();
            boolean z = c0441.f1622;
            int iM7934 = Integer.MAX_VALUE;
            if (c38211 != null) {
                C2276 c2276 = c38211.f12696;
                C2537 c2537 = c38211.f12697;
                C1249 c1249 = c0441.f1627;
                C3564 c3564 = c0441.f1625;
                List list2 = c0441.f1624;
                InterfaceC2880 interfaceC2880 = c0441.f1628;
                interfaceC5370 = null;
                InterfaceC4434 interfaceC4434 = c0441.f1623;
                if (!c2276.f7563.mo2997()) {
                    C1249 c12410 = c2537.f8430;
                    C3828 c38212 = c38211;
                    long j2 = c2537.f8432;
                    if (AbstractC3831.m6874(c12410, c1249) && c2537.f8428.m6358(c3564) && AbstractC3831.m6874(c2537.f8425, list2) && c2537.f8431 == Integer.MAX_VALUE && c2537.f8426 == z && c2537.f8427 == 1 && AbstractC3831.m6874(c2537.f8434, interfaceC2880) && c2537.f8429 == layoutDirection && AbstractC3831.m6874(c2537.f8433, interfaceC4434) && C3693.m6557(j) == C3693.m6557(j2) && (!z || (C3693.m6556(j) == C3693.m6556(j2) && C3693.m6551(j) == C3693.m6551(j2)))) {
                        c38210 = new C3828(new C2537(c2537.f8430, c0441.f1625, c2537.f8425, c2537.f8431, c2537.f8426, c2537.f8427, c2537.f8434, c2537.f8429, c2537.f8433, j), c2276, AbstractC0671.m1497(j, (((long) AbstractC1434.m3058(c2276.f7559)) & 4294967295L) | (((long) AbstractC1434.m3058(c2276.f7564)) << 32)));
                        c3829 = c38212;
                    } else {
                        c3828 = c38212;
                    }
                    long j3 = c38210.f12693;
                    Integer numValueOf = Integer.valueOf((int) (j3 >> 32));
                    Integer numValueOf2 = Integer.valueOf((int) (j3 & 4294967295L));
                    int iIntValue = numValueOf.intValue();
                    int iIntValue2 = numValueOf2.intValue();
                    if (AbstractC3831.m6874(c3829, c38210)) {
                        c1483 = this;
                        c5837 = c5838;
                        i = 0;
                    } else {
                        if (c2449M9648 != 0) {
                            r14 = c2449M9648.f8156;
                        } else {
                            r14 = interfaceC5370;
                        }
                        c5837 = c5838;
                        c5837.f19240.setValue(new C2449(c38210, r14));
                        i = 0;
                        c5837.f19245 = false;
                        c1483 = this;
                        c1483.f5039.mo211(c38210);
                        AbstractC2776.m5241(c5837, c1483.f5036, c1483.f5041);
                    }
                    if (c1483.f5038 == 1) {
                        iM3058 = AbstractC1434.m3058(c38210.f12696.m4332(i));
                    } else {
                        iM3058 = i;
                    }
                    c5837.f19242.setValue(new C4497(c1483.f5037.mo756(iM3058)));
                    return interfaceC2427.mo755(iIntValue, iIntValue2, AbstractC4554.m7919(new C3869(AbstractC2811.f9384, Integer.valueOf(Math.round(c38210.f12698))), new C3869(AbstractC2811.f9383, Integer.valueOf(Math.round(c38210.f12694)))), new C3018(8));
                }
                c3828 = c38211;
            } else {
                c3828 = c38211;
                interfaceC5370 = null;
            }
            c0441.m960(layoutDirection);
            int iM6557 = C3693.m6557(j);
            if (z && C3693.m6548(j)) {
                iM7934 = C3693.m6556(j);
            }
            if (iM6557 != iM7934) {
                C1414 c1414 = c0441.f1629;
                if (c1414 == null) {
                    C1078.m2276("layoutIntrinsics must be called first");
                    return interfaceC5370;
                }
                iM7934 = AbstractC4554.m7934(AbstractC1434.m3058(c1414.mo2987()), iM6557, iM7934);
            }
            C1414 c1415 = c0441.f1629;
            if (c1415 == null) {
                C1078.m2276("layoutIntrinsics must be called first");
                return interfaceC5370;
            }
            C2276 c2277 = new C2276(c1415, C5063.m8609(0, iM7934, 0, C3693.m6551(j)), Integer.MAX_VALUE, 1);
            c3829 = c3828;
            c38210 = new C3828(new C2537(c0441.f1627, c0441.f1625, c0441.f1624, Integer.MAX_VALUE, c0441.f1622, 1, c0441.f1628, layoutDirection, c0441.f1623, j), c2277, AbstractC0671.m1497(j, (((long) AbstractC1434.m3058(c2277.f7564)) << 32) | (((long) AbstractC1434.m3058(c2277.f7559)) & 4294967295L)));
            long j4 = c38210.f12693;
            Integer numValueOf3 = Integer.valueOf((int) (j4 >> 32));
            Integer numValueOf4 = Integer.valueOf((int) (j4 & 4294967295L));
            int iIntValue3 = numValueOf3.intValue();
            int iIntValue4 = numValueOf4.intValue();
            if (AbstractC3831.m6874(c3829, c38210)) {
                if (c2449M9648 != 0) {
                    r14 = c2449M9648.f8156;
                } else {
                    r14 = interfaceC5370;
                }
                c5837 = c5838;
                c5837.f19240.setValue(new C2449(c38210, r14));
                i = 0;
                c5837.f19245 = false;
                c1483 = this;
                c1483.f5039.mo211(c38210);
                AbstractC2776.m5241(c5837, c1483.f5036, c1483.f5041);
            } else {
                c1483 = this;
                c5837 = c5838;
                i = 0;
            }
            if (c1483.f5038 == 1) {
                iM3058 = AbstractC1434.m3058(c38210.f12696.m4332(i));
            } else {
                iM3058 = i;
            }
            c5837.f19242.setValue(new C4497(c1483.f5037.mo756(iM3058)));
            return interfaceC2427.mo755(iIntValue3, iIntValue4, AbstractC4554.m7919(new C3869(AbstractC2811.f9384, Integer.valueOf(Math.round(c38210.f12698))), new C3869(AbstractC2811.f9383, Integer.valueOf(Math.round(c38210.f12694)))), new C3018(8));
        } catch (Throwable th) {
            AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
            throw th;
        }
    }
}
