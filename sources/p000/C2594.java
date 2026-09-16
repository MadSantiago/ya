package p000;

/* JADX INFO: renamed from: ۥٍۢؑٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2594 extends AbstractC1127 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ C5006 f8671;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ long f8672;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ long f8673;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ AbstractC3625 f8674;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2594(AbstractC3625 abstractC3625, long j, long j2, C5006 c5006) {
        super(0);
        this.f8674 = abstractC3625;
        this.f8672 = j;
        this.f8673 = j2;
        this.f8671 = c5006;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        AbstractC3625 abstractC3625 = this.f8674;
        abstractC3625.m6456().f16206 = false;
        abstractC3625.m6456().f16205 = this.f8672;
        abstractC3625.m6456().f16203 = this.f8673;
        InterfaceC4745 interfaceC4745Mo2711 = this.f8671.f16573.mo2711();
        if (interfaceC4745Mo2711 != null) {
            interfaceC4745Mo2711.mo211(abstractC3625.m6456());
        }
        return C2358.f7817;
    }
}
