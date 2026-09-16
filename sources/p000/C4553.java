package p000;

/* JADX INFO: renamed from: ۦٚؔ٘ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4553 implements InterfaceC3096 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C5704 f15035;

    /* JADX INFO: renamed from: ۥۗ */
    public final C5704 f15036;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ InterfaceC3096 f15037;

    public C4553(InterfaceC3096 interfaceC3096, final C4950 c4950) {
        this.f15037 = interfaceC3096;
        final int i = 0;
        this.f15036 = AbstractC3004.m5600(new InterfaceC4448() { // from class: ۦۖؕۦِ
            @Override // p000.InterfaceC4448
            /* JADX INFO: renamed from: ۥۣ */
            public final Object mo449() {
                int i2 = i;
                C4950 c4951 = c4950;
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(c4951.f16381.m1711() < c4951.f16380.m1711());
                    default:
                        return Boolean.valueOf(c4951.f16381.m1711() > 0.0f);
                }
            }
        });
        final int i2 = 1;
        this.f15035 = AbstractC3004.m5600(new InterfaceC4448() { // from class: ۦۖؕۦِ
            @Override // p000.InterfaceC4448
            /* JADX INFO: renamed from: ۥۣ */
            public final Object mo449() {
                int i3 = i2;
                C4950 c4951 = c4950;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(c4951.f16381.m1711() < c4951.f16380.m1711());
                    default:
                        return Boolean.valueOf(c4951.f16381.m1711() > 0.0f);
                }
            }
        });
    }

    @Override // p000.InterfaceC3096
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo1391() {
        return ((Boolean) this.f15036.getValue()).booleanValue();
    }

    @Override // p000.InterfaceC3096
    /* JADX INFO: renamed from: ۥُ */
    public final Object mo1392(EnumC4386 enumC4386, InterfaceC5731 interfaceC5731, AbstractC0772 abstractC0772) {
        return this.f15037.mo1392(enumC4386, interfaceC5731, abstractC0772);
    }

    @Override // p000.InterfaceC3096
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo1397() {
        return this.f15037.mo1397();
    }

    @Override // p000.InterfaceC3096
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo1399() {
        return ((Boolean) this.f15035.getValue()).booleanValue();
    }

    @Override // p000.InterfaceC3096
    /* JADX INFO: renamed from: ۦؑ */
    public final float mo1400(float f) {
        return this.f15037.mo1400(f);
    }
}
