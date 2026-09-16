package p000;

/* JADX INFO: renamed from: ۥْ۟ؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2476 extends AbstractC2426 implements InterfaceC2609 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f8252 = 1;

    /* JADX INFO: renamed from: ۥٖ */
    public int f8253;

    /* JADX INFO: renamed from: ۦٗ */
    public /* synthetic */ Object f8254;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2476(C4482 c4482, InterfaceC0443 interfaceC0443) {
        super(3, interfaceC0443);
        this.f8254 = c4482;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f8252;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        switch (i) {
            case 0:
                int i2 = this.f8253;
                if (i2 == 0) {
                    AbstractC0186.m409(obj);
                    C4482 c4482 = (C4482) this.f8254;
                    this.f8253 = 1;
                    if (c4482.m7757(this) == enumC2282) {
                        return enumC2282;
                    }
                } else {
                    if (i2 != 1) {
                        C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC0186.m409(obj);
                }
                return C2358.f7817;
            default:
                int i3 = this.f8253;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC0186.m409(obj);
                        return obj;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
                C1986 c1986 = (C1986) this.f8254;
                this.f8253 = 1;
                c1986.getClass();
                Object objM3889 = C1986.m3889(c1986, this);
                return objM3889 == enumC2282 ? enumC2282 : objM3889;
        }
    }

    @Override // p000.InterfaceC2609
    /* JADX INFO: renamed from: ۦۙ */
    public final Object mo1173(Object obj, Object obj2, Object obj3) {
        int i = this.f8252;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                return new C2476((C4482) this.f8254, (InterfaceC0443) obj3).mo218(c2358);
            default:
                ((Boolean) obj2).getClass();
                C2476 c2476 = new C2476(3, (InterfaceC0443) obj3);
                c2476.f8254 = (C1986) obj;
                return c2476.mo218(c2358);
        }
    }

    public /* synthetic */ C2476(int i, InterfaceC0443 interfaceC0443) {
        super(i, interfaceC0443);
    }
}
