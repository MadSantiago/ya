package p000;

/* JADX INFO: renamed from: ۦۙؗۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5131 extends AbstractC2426 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ C5825 f17003;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ Object f17004;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5131(C5825 c5825, Object obj, InterfaceC0443 interfaceC0443) {
        super(1, interfaceC0443);
        this.f17003 = c5825;
        this.f17004 = obj;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        AbstractC0186.m409(obj);
        C5825 c5825 = this.f17003;
        c5825.m9635();
        Object objM9637 = c5825.m9637(this.f17004);
        c5825.f19169.f11359.setValue(objM9637);
        c5825.f19170.setValue(objM9637);
        return C2358.f7817;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        C5131 c5131 = new C5131(this.f17003, this.f17004, (InterfaceC0443) obj);
        C2358 c2358 = C2358.f7817;
        c5131.mo218(c2358);
        return c2358;
    }
}
