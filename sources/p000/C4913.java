package p000;

/* JADX INFO: renamed from: ۦۖؔۢؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4913 extends AbstractC1127 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C2921 f16211;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f16212;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4913(C2921 c2921, int i) {
        super(0);
        this.f16212 = i;
        this.f16211 = c2921;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        AbstractC2045 abstractC2045Mo2793;
        int i = this.f16212;
        C2358 c2358 = C2358.f7817;
        C2921 c2921 = this.f16211;
        switch (i) {
            case 0:
                C1233 c1233 = c2921.f9804;
                c1233.f4242 = 0;
                C0863 c0863M1329 = c1233.f4243.m1329();
                Object[] objArr = c0863M1329.f3182;
                int i2 = c0863M1329.f3180;
                for (int i3 = 0; i3 < i2; i3++) {
                    C2921 c2922 = ((C0605) objArr[i3]).f2261.f4240;
                    c2922.f9819 = c2922.f9807;
                    c2922.f9807 = Integer.MAX_VALUE;
                    if (c2922.f9815 == 2) {
                        c2922.f9815 = 3;
                    }
                }
                C0605 c0605 = c1233.f4243;
                C0605 c0606 = c1233.f4243;
                C0863 c0863M13210 = c0605.m1329();
                Object[] objArr2 = c0863M13210.f3182;
                int i4 = c0863M13210.f3180;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((C0605) objArr2[i5]).f2261.f4240.f9808.f571 = false;
                }
                C2242 c2242 = c2921.mo333().f9865;
                if (c2242 != null) {
                    boolean z = c2242.f12092;
                    C3482 c3482 = (C3482) c0606.m1361();
                    int i6 = ((C0863) c3482.f11560).f3180;
                    for (int i7 = 0; i7 < i6; i7++) {
                        AbstractC2045 abstractC2045Mo2794 = ((AbstractC1311) ((C0605) c3482.get(i7)).f2256.f8201).mo2793();
                        if (abstractC2045Mo2794 != null) {
                            abstractC2045Mo2794.f12092 = z;
                        }
                    }
                }
                c2921.mo333().f9865.mo2789().mo620();
                if (c2921.mo333().f9865 != null) {
                    C3482 c3483 = (C3482) c0606.m1361();
                    int i8 = ((C0863) c3483.f11560).f3180;
                    for (int i9 = 0; i9 < i8; i9++) {
                        AbstractC2045 abstractC2045Mo2795 = ((AbstractC1311) ((C0605) c3483.get(i9)).f2256.f8201).mo2793();
                        if (abstractC2045Mo2795 != null) {
                            abstractC2045Mo2795.f12092 = false;
                        }
                    }
                }
                C0863 c0863M13211 = c0606.m1329();
                Object[] objArr3 = c0863M13211.f3182;
                int i10 = c0863M13211.f3180;
                for (int i11 = 0; i11 < i10; i11++) {
                    C2921 c2923 = ((C0605) objArr3[i11]).f2261.f4240;
                    int i12 = c2923.f9819;
                    int i13 = c2923.f9807;
                    if (i12 != i13 && i13 == Integer.MAX_VALUE) {
                        c2923.m5507(true);
                    }
                }
                C0863 c0863M13212 = c0606.m1329();
                Object[] objArr4 = c0863M13212.f3182;
                int i14 = c0863M13212.f3180;
                for (int i15 = 0; i15 < i14; i15++) {
                    C0143 c0143 = ((C0605) objArr4[i15]).f2261.f4240.f9808;
                    c0143.f566 = c0143.f571;
                }
                break;
            case 1:
                C1233 c1234 = c2921.f9804;
                AbstractC1842 placementScope = null;
                if (AbstractC2765.m5126(c1234.f4243) || c1234.f4237) {
                    AbstractC1311 abstractC1311 = c1234.m2603().f4514;
                    if (abstractC1311 != null) {
                        placementScope = abstractC1311.f12090;
                    }
                } else {
                    AbstractC1311 abstractC1312 = c1234.m2603().f4514;
                    if (abstractC1312 != null && (abstractC2045Mo2793 = abstractC1312.mo2793()) != null) {
                        placementScope = abstractC2045Mo2793.f12090;
                    }
                }
                if (placementScope == null) {
                    placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(c1234.f4243)).getPlacementScope();
                }
                AbstractC1842.m3624(placementScope, c1234.m2603().mo2793(), c2921.f9802);
                break;
            default:
                c2921.f9804.m2603().mo2793().mo3597(c2921.f9800);
                break;
        }
        return c2358;
    }
}
