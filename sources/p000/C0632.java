package p000;

/* JADX INFO: renamed from: ۥٌؘَؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0632 extends AbstractC1127 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ long f2363;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C2453 f2364;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C4730 f2365;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ long f2366;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C1314 f2367;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0632(C1314 c1314, C2453 c2453, C4730 c4730, long j, long j2) {
        super(0);
        this.f2367 = c1314;
        this.f2364 = c2453;
        this.f2365 = c4730;
        this.f2363 = j;
        this.f2366 = j2;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        C2453 c2453 = this.f2364;
        this.f2367.f4535 = c2453.getPositionProvider().mo7596(this.f2365, this.f2363, c2453.getParentLayoutDirection(), this.f2366);
        return C2358.f7817;
    }
}
