package p000;

/* JADX INFO: renamed from: ۦِٖؕؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3282 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC4745 f10999;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f11000;

    public /* synthetic */ C3282(InterfaceC4745 interfaceC4745, int i) {
        this.f11000 = i;
        this.f10999 = interfaceC4745;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f11000;
        InterfaceC4745 interfaceC4745 = this.f10999;
        switch (i) {
            case 0:
                InterfaceC0289 interfaceC0289 = (InterfaceC0289) obj;
                if (!(interfaceC0289 instanceof C4774)) {
                    C1078.m2276("Node is not a GestureNode instance");
                    return null;
                }
                Boolean bool = (Boolean) interfaceC4745.mo211(((C4774) interfaceC0289).f15738);
                bool.getClass();
                return bool;
            case 1:
                AbstractC3191 abstractC3191 = (AbstractC3191) interfaceC4745.mo211((C5570) obj);
                synchronized (AbstractC1538.f5203) {
                    AbstractC1538.f5209 = AbstractC1538.f5209.m9401(abstractC3191.mo5118());
                }
                return abstractC3191;
            default:
                Long l = (Long) obj;
                l.getClass();
                return interfaceC4745.mo211(l);
        }
    }
}
