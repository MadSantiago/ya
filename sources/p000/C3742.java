package p000;

/* JADX INFO: renamed from: ۦٌٖؗۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3742 extends AbstractC2426 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f12464;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ C3635 f12465;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3742(C3635 c3635, InterfaceC0443 interfaceC0443, int i) {
        super(1, interfaceC0443);
        this.f12464 = i;
        this.f12465 = c3635;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f12464;
        C2358 c2358 = C2358.f7817;
        C3635 c3635 = this.f12465;
        switch (i) {
            case 0:
                AbstractC0186.m409(obj);
                c3635.f12136 = false;
                break;
            case 1:
                AbstractC0186.m409(obj);
                c3635.m6469();
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC0186.m409(obj);
                c3635.m6477(c3635.f12136);
                break;
            default:
                AbstractC0186.m409(obj);
                c3635.m6489();
                break;
        }
        return c2358;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f12464;
        C2358 c2358 = C2358.f7817;
        C3635 c3635 = this.f12465;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj;
        switch (i) {
            case 0:
                new C3742(c3635, interfaceC0443, 0).mo218(c2358);
                break;
            case 1:
                new C3742(c3635, interfaceC0443, 1).mo218(c2358);
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                new C3742(c3635, interfaceC0443, 2).mo218(c2358);
                break;
            default:
                new C3742(c3635, interfaceC0443, 3).mo218(c2358);
                break;
        }
        return c2358;
    }
}
