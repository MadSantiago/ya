package p000;

/* JADX INFO: renamed from: ۥٖۨؒۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2910 extends AbstractC0772 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ InterfaceC5731 f9702;

    /* JADX INFO: renamed from: ۥٓ */
    public int f9703;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ InterfaceC0443 f9704;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2910(InterfaceC0443 interfaceC0443, InterfaceC3534 interfaceC3534, InterfaceC5731 interfaceC5731, InterfaceC0443 interfaceC0444) {
        super(interfaceC0443, interfaceC3534);
        this.f9702 = interfaceC5731;
        this.f9704 = interfaceC0444;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f9703;
        if (i == 0) {
            this.f9703 = 1;
            AbstractC0186.m409(obj);
            InterfaceC5731 interfaceC5731 = this.f9702;
            AbstractC3801.m6782(2, interfaceC5731);
            return interfaceC5731.mo219(this.f9704, this);
        }
        if (i != 1) {
            C1078.m2276("This coroutine had already completed");
            return null;
        }
        this.f9703 = 2;
        AbstractC0186.m409(obj);
        return obj;
    }
}
