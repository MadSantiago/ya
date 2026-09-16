package p000;

/* JADX INFO: renamed from: ۥؕؖ٘ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0478 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public /* synthetic */ Object f1740;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ InterfaceC4038 f1741;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ InterfaceC1126 f1742;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ C3635 f1743;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0478(InterfaceC4038 interfaceC4038, InterfaceC1126 interfaceC1126, C3635 c3635, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f1741 = interfaceC4038;
        this.f1742 = interfaceC1126;
        this.f1743 = c3635;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        C0478 c0478 = new C0478(this.f1741, this.f1742, this.f1743, interfaceC0443);
        c0478.f1740 = obj;
        return c0478;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        AbstractC0186.m409(obj);
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) this.f1740;
        InterfaceC4038 interfaceC4038 = this.f1741;
        InterfaceC0443 interfaceC0443 = null;
        AbstractC2765.m5135(interfaceC4643, null, 4, new C0610(interfaceC4038, this.f1742, interfaceC0443, 0), 1);
        AbstractC2765.m5135(interfaceC4643, null, 4, new C0023(interfaceC4038, this.f1743, interfaceC0443, 17), 1);
        return C2358.f7817;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        C0478 c0478 = (C0478) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj);
        C2358 c2358 = C2358.f7817;
        c0478.mo218(c2358);
        return c2358;
    }
}
