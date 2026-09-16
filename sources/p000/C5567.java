package p000;

/* JADX INFO: renamed from: ۦَۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5567 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ AbstractC4702 f18379;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f18380;

    public /* synthetic */ C5567(AbstractC4702 abstractC4702, int i) {
        this.f18380 = i;
        this.f18379 = abstractC4702;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f18380;
        AbstractC4702 abstractC4702 = this.f18379;
        InterfaceC0289 interfaceC0289 = (InterfaceC0289) obj;
        switch (i) {
            case 0:
                AbstractC4702 abstractC4703 = (AbstractC4702) interfaceC0289;
                InterfaceC4686 interfaceC4686 = abstractC4702.f15511;
                if (!AbstractC3831.m6874(abstractC4703.f15510, interfaceC4686)) {
                    abstractC4703.f15510 = interfaceC4686;
                    abstractC4703.mo8045();
                }
                return EnumC1848.f6132;
            default:
                abstractC4702.f15510 = ((AbstractC4702) interfaceC0289).f15511;
                return Boolean.FALSE;
        }
    }
}
