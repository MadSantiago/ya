package p000;

/* JADX INFO: renamed from: ۦؙۖؕؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4916 implements InterfaceC4161 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f16217;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ C5559 f16218;

    public C4916(C5559 c5559, int i) {
        this.f16218 = c5559;
        this.f16217 = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.InterfaceC4161
    /* JADX INFO: renamed from: ۦۚ */
    public final Object mo978(Object obj, InterfaceC0443 interfaceC0443) throws C0768 {
        C4724 c4724;
        Object obj2;
        if (interfaceC0443 instanceof C4724) {
            c4724 = (C4724) interfaceC0443;
            int i = c4724.f15595;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4724.f15595 = i - Integer.MIN_VALUE;
            } else {
                c4724 = new C4724(this, interfaceC0443);
            }
        } else {
            c4724 = new C4724(this, interfaceC0443);
        }
        Object obj3 = c4724.f15594;
        int i2 = c4724.f15595;
        C2358 c2358 = C2358.f7817;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        if (i2 == 0) {
            AbstractC0186.m409(obj3);
            C3285 c3285 = new C3285(this.f16217, obj);
            c4724.f15595 = 1;
            if (this.f16218.mo5594(c4724, c3285) != enumC2282) {
            }
        }
        if (i2 == 1) {
            AbstractC0186.m409(obj3);
        } else {
            if (i2 != 2) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC0186.m409(obj3);
        }
        c4724.f15595 = 2;
        InterfaceC3534 interfaceC3534Mo334 = c4724.mo334();
        AbstractC5568.m9360(interfaceC3534Mo334);
        InterfaceC0443 interfaceC0443M5232 = AbstractC2776.m5232(c4724);
        C4437 c4437 = interfaceC0443M5232 instanceof C4437 ? (C4437) interfaceC0443M5232 : null;
        if (c4437 == null) {
            obj2 = c2358;
        } else {
            AbstractC2132 abstractC2132 = c4437.f14627;
            if (AbstractC5378.m9049(abstractC2132, interfaceC3534Mo334)) {
                c4437.f14628 = c2358;
                c4437.f18326 = 1;
                abstractC2132.mo1465(interfaceC3534Mo334, c4437);
            } else {
                InterfaceC3534 interfaceC3534Mo860 = interfaceC3534Mo334.mo860(new C2320(C2320.f7673));
                c4437.f14628 = c2358;
                c4437.f18326 = 1;
                abstractC2132.mo1465(interfaceC3534Mo860, c4437);
            }
            obj2 = enumC2282;
        }
        if (obj2 != enumC2282) {
            obj2 = c2358;
        }
        return obj2 == enumC2282 ? enumC2282 : c2358;
    }
}
