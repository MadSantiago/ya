package p000;

/* JADX INFO: renamed from: ۦؘَٜؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4713 extends AbstractRunnableC2435 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ String f15539;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ String f15540;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ C3286 f15541;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ boolean f15542;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ BinderC0902 f15543;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4713(C3286 c3286, String str, String str2, boolean z, BinderC0902 binderC0902) {
        super(c3286, true);
        this.f15539 = str;
        this.f15540 = str2;
        this.f15542 = z;
        this.f15543 = binderC0902;
        this.f15541 = c3286;
    }

    @Override // p000.AbstractRunnableC2435
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo2714() {
        this.f15543.mo1888(null);
    }

    @Override // p000.AbstractRunnableC2435
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2528() {
        InterfaceC5122 interfaceC5122 = this.f15541.f11010;
        AbstractC0487.m1047(interfaceC5122);
        interfaceC5122.getUserProperties(this.f15539, this.f15540, this.f15542, this.f15543);
    }
}
