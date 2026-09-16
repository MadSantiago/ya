package p000;

/* JADX INFO: renamed from: ۦٍؗؕؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3423 implements InterfaceC2609 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ InterfaceC4448 f11385;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ boolean f11386;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C2155 f11387;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ boolean f11388;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ InterfaceC3016 f11389;

    public C3423(InterfaceC3016 interfaceC3016, boolean z, boolean z2, C2155 c2155, InterfaceC4448 interfaceC4448) {
        this.f11389 = interfaceC3016;
        this.f11388 = z;
        this.f11386 = z2;
        this.f11387 = c2155;
        this.f11385 = interfaceC4448;
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
        InterfaceC0705 interfaceC0705Mo1571 = AbstractC5022.m8437(C4217.f13994, c2243, this.f11389).mo1571(new C2879(this.f11388, c2243, null, false, this.f11386, this.f11387, this.f11385));
        c5362.m9009(false);
        return interfaceC0705Mo1571;
    }
}
