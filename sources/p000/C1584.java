package p000;

/* JADX INFO: renamed from: ۥٟ٘ؕؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1584 extends AbstractC1127 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C2339 f5330;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f5331;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1584(C2339 c2339, int i) {
        super(0);
        this.f5331 = i;
        this.f5330 = c2339;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f5331;
        C2358 c2358 = C2358.f7817;
        C2339 c2339 = this.f5330;
        switch (i) {
            case 0:
                C1233 c1233 = c2339.f7752;
                c1233.f4248 = 0;
                C0863 c0863M1329 = c1233.f4243.m1329();
                Object[] objArr = c0863M1329.f3182;
                int i2 = c0863M1329.f3180;
                for (int i3 = 0; i3 < i2; i3++) {
                    C2339 c23310 = ((C0605) objArr[i3]).f2261.f4252;
                    c23310.f7773 = c23310.f7757;
                    c23310.f7757 = Integer.MAX_VALUE;
                    c23310.f7767 = false;
                    if (c23310.f7776 == 2) {
                        c23310.f7776 = 3;
                    }
                }
                C0605 c0605 = c1233.f4243;
                C0605 c0606 = c1233.f4243;
                C0863 c0863M13210 = c0605.m1329();
                Object[] objArr2 = c0863M13210.f3182;
                int i4 = c0863M13210.f3180;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((C0605) objArr2[i5]).f2261.f4252.f7768.f571 = false;
                }
                if (c2339.mo333().f12092) {
                    C3482 c3482 = (C3482) c0606.m1361();
                    int i6 = ((C0863) c3482.f11560).f3180;
                    for (int i7 = 0; i7 < i6; i7++) {
                        ((AbstractC1311) ((C0605) c3482.get(i7)).f2256.f8201).f12092 = true;
                    }
                }
                c2339.mo333().mo2789().mo620();
                if (c2339.mo333().f12092) {
                    C3482 c3483 = (C3482) c0606.m1361();
                    int i8 = ((C0863) c3483.f11560).f3180;
                    for (int i9 = 0; i9 < i8; i9++) {
                        ((AbstractC1311) ((C0605) c3483.get(i9)).f2256.f8201).f12092 = false;
                    }
                }
                C0863 c0863M13211 = c0606.m1329();
                Object[] objArr3 = c0863M13211.f3182;
                int i10 = c0863M13211.f3180;
                for (int i11 = 0; i11 < i10; i11++) {
                    C0605 c0607 = (C0605) objArr3[i11];
                    C1233 c1234 = c0607.f2261;
                    if (c1234.f4252.f7773 != c0607.m1362()) {
                        c0606.m1366();
                        c0606.m1319();
                        if (c0607.m1362() == Integer.MAX_VALUE) {
                            if (c1234.f4237 || AbstractC2765.m5126(c0607)) {
                                c1234.f4240.m5507(false);
                            }
                            c1234.f4252.m4388();
                        }
                    }
                }
                C0863 c0863M13212 = c0606.m1329();
                Object[] objArr4 = c0863M13212.f3182;
                int i12 = c0863M13212.f3180;
                for (int i13 = 0; i13 < i12; i13++) {
                    C0143 c0143 = ((C0605) objArr4[i13]).f2261.f4252.f7768;
                    c0143.f566 = c0143.f571;
                }
                break;
            case 1:
                c2339.f7752.m2603().mo3597(c2339.f7775);
                break;
            default:
                C1233 c1235 = c2339.f7752;
                AbstractC1311 abstractC1311 = c1235.m2603().f4514;
                AbstractC1842 placementScope = abstractC1311 != null ? abstractC1311.f12090 : ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(c1235.f4243)).getPlacementScope();
                InterfaceC4745 interfaceC4745 = c2339.f7756;
                if (interfaceC4745 == null) {
                    AbstractC1311 abstractC1311M2603 = c1235.m2603();
                    long j = c2339.f7759;
                    float f = c2339.f7749;
                    placementScope.m3629(abstractC1311M2603);
                    abstractC1311M2603.mo571(C0873.m1861(j, abstractC1311M2603.f981), f, null);
                } else {
                    AbstractC1311 abstractC1311M2604 = c1235.m2603();
                    long j2 = c2339.f7759;
                    float f2 = c2339.f7749;
                    placementScope.m3629(abstractC1311M2604);
                    abstractC1311M2604.mo571(C0873.m1861(j2, abstractC1311M2604.f981), f2, interfaceC4745);
                }
                break;
        }
        return c2358;
    }
}
