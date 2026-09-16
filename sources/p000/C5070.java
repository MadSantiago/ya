package p000;

/* JADX INFO: renamed from: ۦۘٓۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5070 extends AbstractC1127 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C2346 f16821;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ String f16822;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ boolean f16823;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5070(boolean z, C2346 c2346, String str) {
        super(0);
        this.f16823 = z;
        this.f16821 = c2346;
        this.f16822 = str;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        if (this.f16823) {
            C2346 c2346 = this.f16821;
            String str = this.f16822;
            C5140 c5140 = (C5140) c2346.f7786;
            synchronized (c5140.f17022) {
            }
        }
        return C2358.f7817;
    }
}
