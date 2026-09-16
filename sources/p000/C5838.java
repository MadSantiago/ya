package p000;

/* JADX INFO: renamed from: ۦۧؗؑؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5838 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ String f19247;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ InterfaceC4448 f19248;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C5236 f19249;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ EnumC2459 f19250;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C2453 f19251;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5838(C2453 c2453, InterfaceC4448 interfaceC4448, C5236 c5236, String str, EnumC2459 enumC2459) {
        super(1);
        this.f19251 = c2453;
        this.f19248 = interfaceC4448;
        this.f19249 = c5236;
        this.f19247 = str;
        this.f19250 = enumC2459;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        C2453 c2453 = this.f19251;
        c2453.f8184.addView(c2453, c2453.f8171);
        c2453.m4581(this.f19248, this.f19249, this.f19247, this.f19250);
        return new C4954(1, c2453);
    }
}
