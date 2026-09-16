package p000;

/* JADX INFO: renamed from: ۦۛؖ٘ؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5240 implements InterfaceC1636, InterfaceC5109 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f17297;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f17298;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f17299;

    public /* synthetic */ C5240(InterfaceC3534 interfaceC3534, int i, C1502 c1502) {
        this.f17298 = interfaceC3534;
        this.f17299 = i;
        this.f17297 = c1502;
    }

    @Override // p000.InterfaceC5109
    /* JADX INFO: renamed from: ۥؗ */
    public Object mo3986() {
        C0474 c0474 = (C0474) this.f17298;
        ((C2808) c0474.f1728).m5349((C1360) this.f17297, this.f17299 + 1, false);
        return null;
    }

    @Override // p000.InterfaceC1636
    /* JADX INFO: renamed from: ۦؑ */
    public Object mo3441(C4206 c4206) {
        InterfaceC3534 interfaceC3534 = (InterfaceC3534) this.f17298;
        C1502 c1502 = (C1502) this.f17297;
        RunnableC0029 runnableC0029 = new RunnableC0029(11, (InterfaceC3196) interfaceC3534.mo865(C1397.f4791));
        C0914 c0914 = c4206.f13965;
        if (c0914 != null) {
            c0914.mo3760(runnableC0029, EnumC5000.f16543);
        }
        return AbstractC2765.m5135(AbstractC4009.m7151(interfaceC3534), null, this.f17299, new C0061(c1502, c4206, null, 20), 1);
    }

    public /* synthetic */ C5240(C0474 c0474, C1360 c1360, int i) {
        this.f17298 = c0474;
        this.f17297 = c1360;
        this.f17299 = i;
    }
}
