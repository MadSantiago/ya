package p000;

/* JADX INFO: renamed from: ۥؖؗ٘ۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0558 implements InterfaceC2609 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC4448 f2002;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f2003;

    public /* synthetic */ C0558(int i, InterfaceC4448 interfaceC4448) {
        this.f2003 = i;
        this.f2002 = interfaceC4448;
    }

    @Override // p000.InterfaceC2609
    /* JADX INFO: renamed from: ۦۙ */
    public final Object mo1173(Object obj, Object obj2, Object obj3) {
        C2243 c2243;
        switch (this.f2003) {
            case 0:
                C5362 c5362 = (C5362) obj2;
                ((Integer) obj3).getClass();
                c5362.m8957(-756081143);
                InterfaceC3016 interfaceC3016 = (InterfaceC3016) c5362.m8997(AbstractC5022.f16619);
                if (interfaceC3016 != null) {
                    c5362.m8957(-1604682242);
                    c5362.m9009(false);
                    c2243 = null;
                } else {
                    c5362.m8957(-1604549624);
                    Object objM8999 = c5362.m8999();
                    if (objM8999 == C2850.f9517) {
                        objM8999 = new C2243();
                        c5362.m8987(objM8999);
                    }
                    c2243 = (C2243) objM8999;
                    c5362.m9009(false);
                }
                InterfaceC0705 interfaceC0705M438 = AbstractC0186.m438(C4217.f13994, c2243, interfaceC3016, true, null, this.f2002);
                c5362.m9009(false);
                return interfaceC0705M438;
            default:
                InterfaceC2427 interfaceC2427 = (InterfaceC2427) obj;
                InterfaceC1827 interfaceC1827 = (InterfaceC1827) obj2;
                C3693 c3693 = (C3693) obj3;
                float f = ((C4497) this.f2002.mo449()).f14871;
                AbstractC0275 abstractC0275Mo3597 = interfaceC1827.mo3597(C3693.m6550(c3693.f12325, 0, 0, AbstractC0671.m1493(c3693.f12325, C4497.m7826(f, Float.NaN) ? 0 : interfaceC2427.mo743(f)), 0, 11));
                return interfaceC2427.mo755(abstractC0275Mo3597.f985, abstractC0275Mo3597.f984, C0204.f751, new C2785(abstractC0275Mo3597, 7));
        }
    }
}
