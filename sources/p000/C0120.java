package p000;

/* JADX INFO: renamed from: ۥٟؐؓۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0120 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public /* synthetic */ Object f472;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ C3957 f473;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ C1597 f474;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ AbstractC1311 f475;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ C5304 f476;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0120(C3957 c3957, AbstractC1311 abstractC1311, C5304 c5304, C1597 c1597, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f473 = c3957;
        this.f475 = abstractC1311;
        this.f476 = c5304;
        this.f474 = c1597;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        C0120 c0120 = new C0120(this.f473, this.f475, this.f476, this.f474, interfaceC0443);
        c0120.f472 = obj;
        return c0120;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        AbstractC0186.m409(obj);
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) this.f472;
        C5304 c5304 = this.f476;
        C3957 c3957 = this.f473;
        AbstractC2765.m5135(interfaceC4643, null, 0, new C0061(c3957, this.f475, c5304, null, 8), 3);
        return AbstractC2765.m5135(interfaceC4643, null, 0, new C0023(c3957, this.f474, null, 8), 3);
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        return ((C0120) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(C2358.f7817);
    }
}
