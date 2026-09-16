package p000;

/* JADX INFO: renamed from: ۥَۜؗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2411 implements InterfaceC5641 {

    /* JADX INFO: renamed from: ۥْ */
    public final InterfaceC5641 f8028;

    /* JADX INFO: renamed from: ۦ۟ */
    public final InterfaceC5641 f8029;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f8030;

    public /* synthetic */ C2411(InterfaceC5641 interfaceC5641, InterfaceC5641 interfaceC5642, int i) {
        this.f8030 = i;
        this.f8029 = interfaceC5641;
        this.f8028 = interfaceC5642;
    }

    @Override // p000.InterfaceC4895
    public final Object get() {
        int i = this.f8030;
        InterfaceC5641 interfaceC5641 = this.f8028;
        InterfaceC5641 interfaceC5642 = this.f8029;
        switch (i) {
            case 0:
                return new C1862((C3729) interfaceC5642.get(), (C3142) interfaceC5641.get());
            default:
                return new C1802((InterfaceC2615) interfaceC5642.get(), (InterfaceC2615) interfaceC5641.get());
        }
    }
}
