package p000;

/* JADX INFO: renamed from: ۦٟۢؔۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5538 extends AbstractC0420 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ InterfaceC5731 f18288;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ InterfaceC0443 f18289;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f18290;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5538(InterfaceC0443 interfaceC0443, InterfaceC0443 interfaceC0444, InterfaceC5731 interfaceC5731) {
        super(interfaceC0443);
        this.f18288 = interfaceC5731;
        this.f18289 = interfaceC0444;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f18290;
        if (i == 0) {
            this.f18290 = 1;
            AbstractC0186.m409(obj);
            InterfaceC5731 interfaceC5731 = this.f18288;
            AbstractC3801.m6782(2, interfaceC5731);
            return interfaceC5731.mo219(this.f18289, this);
        }
        if (i != 1) {
            C1078.m2276("This coroutine had already completed");
            return null;
        }
        this.f18290 = 2;
        AbstractC0186.m409(obj);
        return obj;
    }
}
