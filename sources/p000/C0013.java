package p000;

/* JADX INFO: renamed from: ۥً */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0013 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ AbstractC0006 f2884;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f2885;

    public /* synthetic */ C0013(AbstractC0006 abstractC0006, int i) {
        this.f2885 = i;
        this.f2884 = abstractC0006;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        InterfaceC3975 interfaceC3975;
        int i = this.f2885;
        AbstractC0006 abstractC0006 = this.f2884;
        switch (i) {
            case 0:
                InterfaceC3016 interfaceC3016 = (InterfaceC3016) AbstractC2552.m4807(abstractC0006, AbstractC5022.f16619);
                if (interfaceC3016 == null) {
                    AbstractC4690.m8038("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + interfaceC3016);
                }
                InterfaceC3016 interfaceC3017 = abstractC0006.f1321;
                abstractC0006.f1321 = interfaceC3016;
                if (interfaceC3017 != null && !AbstractC3831.m6874(interfaceC3016, interfaceC3017) && ((interfaceC3975 = abstractC0006.f1325) != null || !abstractC0006.f1322)) {
                    if (interfaceC3975 != null) {
                        abstractC0006.m5607(interfaceC3975);
                    }
                    abstractC0006.f1325 = null;
                    abstractC0006.m9749();
                }
                return C2358.f7817;
            default:
                abstractC0006.f1337.mo449();
                return Boolean.TRUE;
        }
    }
}
