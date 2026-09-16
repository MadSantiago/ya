package p000;

/* JADX INFO: renamed from: ۦٖ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0075 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f14157;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ AbstractC0006 f14158;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0075(AbstractC0006 abstractC0006, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f14157 = i;
        this.f14158 = abstractC0006;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f14157;
        AbstractC0006 abstractC0006 = this.f14158;
        switch (i) {
            case 0:
                return new C0075(abstractC0006, interfaceC0443, 0);
            default:
                return new C0075(abstractC0006, interfaceC0443, 1);
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f14157;
        C2358 c2358 = C2358.f7817;
        InterfaceC0443 interfaceC0443 = null;
        AbstractC0006 abstractC0006 = this.f14158;
        int i2 = 0;
        switch (i) {
            case 0:
                AbstractC0186.m409(obj);
                if (abstractC0006.f1331 == null) {
                    C0266 c0266 = new C0266();
                    C2243 c2243 = abstractC0006.f1324;
                    if (c2243 != null) {
                        AbstractC2765.m5135(abstractC0006.m9076(), null, 0, new C0023(c2243, c0266, interfaceC0443, i2), 3);
                    }
                    abstractC0006.f1331 = c0266;
                }
                break;
            default:
                AbstractC0186.m409(obj);
                C0266 c0267 = abstractC0006.f1331;
                if (c0267 != null) {
                    C5116 c5116 = new C5116(c0267);
                    C2243 c2244 = abstractC0006.f1324;
                    if (c2244 != null) {
                        AbstractC2765.m5135(abstractC0006.m9076(), null, 0, new C0023(c2244, c5116, interfaceC0443, 1), 3);
                    }
                    abstractC0006.f1331 = null;
                }
                break;
        }
        return c2358;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f14157;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                ((C0075) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
                break;
            default:
                ((C0075) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
                break;
        }
        return c2358;
    }
}
