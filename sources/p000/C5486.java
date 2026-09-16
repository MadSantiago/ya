package p000;

/* JADX INFO: renamed from: ۦۡؖٚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5486 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public /* synthetic */ Object f18093;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ InterfaceC4038 f18094;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ InterfaceC1126 f18095;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5486(InterfaceC4038 interfaceC4038, InterfaceC1126 interfaceC1126, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f18094 = interfaceC4038;
        this.f18095 = interfaceC1126;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        C5486 c5486 = new C5486(this.f18094, this.f18095, interfaceC0443);
        c5486.f18093 = obj;
        return c5486;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        AbstractC0186.m409(obj);
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) this.f18093;
        InterfaceC4038 interfaceC4038 = this.f18094;
        InterfaceC1126 interfaceC1126 = this.f18095;
        AbstractC2765.m5135(interfaceC4643, null, 4, new C0610(interfaceC4038, interfaceC1126, null, 1), 1);
        return AbstractC2765.m5135(interfaceC4643, null, 4, new C0610(interfaceC4038, interfaceC1126, null, 2), 1);
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        return ((C5486) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(C2358.f7817);
    }
}
