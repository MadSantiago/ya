package p000;

/* JADX INFO: renamed from: ۥٚؔۗٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1726 implements InterfaceC2609 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C2155 f5749;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ InterfaceC4448 f5750;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ boolean f5751;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ InterfaceC3016 f5752;

    public C1726(InterfaceC3016 interfaceC3016, boolean z, C2155 c2155, InterfaceC4448 interfaceC4448) {
        this.f5752 = interfaceC3016;
        this.f5751 = z;
        this.f5749 = c2155;
        this.f5750 = interfaceC4448;
    }

    @Override // p000.InterfaceC2609
    /* JADX INFO: renamed from: ۦۙ */
    public final Object mo1173(Object obj, Object obj2, Object obj3) {
        C5362 c5362 = (C5362) obj2;
        ((Number) obj3).intValue();
        c5362.m8957(-1525724089);
        Object objM8999 = c5362.m8999();
        if (objM8999 == C2850.f9517) {
            objM8999 = new C2243();
            c5362.m8987(objM8999);
        }
        C2243 c2243 = (C2243) objM8999;
        InterfaceC0705 interfaceC0705Mo1571 = AbstractC5022.m8437(C4217.f13994, c2243, this.f5752).mo1571(new C1680(c2243, null, false, this.f5751, null, this.f5749, this.f5750));
        c5362.m9009(false);
        return interfaceC0705Mo1571;
    }
}
