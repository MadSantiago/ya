package p000;

/* JADX INFO: renamed from: ۦٟۘؓؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5012 extends AbstractC5376 {

    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC2387 f16585;

    /* JADX INFO: renamed from: ۦؑ */
    public final /* synthetic */ int f16586;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5012(C4828 c4828, C2561 c2561, InterfaceC2003 interfaceC2003, InterfaceC2387 interfaceC2387, int i) {
        super(c4828, c2561, interfaceC2003);
        this.f16586 = i;
        this.f16585 = interfaceC2387;
    }

    @Override // p000.AbstractC5376
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo7864(C0724 c0724, Object[] objArr) {
        int i = this.f16586;
        InterfaceC2387 interfaceC2387 = this.f16585;
        switch (i) {
            case 0:
                return interfaceC2387.mo4464(c0724);
            default:
                InterfaceC5065 interfaceC5065 = (InterfaceC5065) interfaceC2387.mo4464(c0724);
                InterfaceC0443 interfaceC0443 = (InterfaceC0443) objArr[objArr.length - 1];
                try {
                    C2600 c2600 = new C2600(1, AbstractC2776.m5232(interfaceC0443));
                    c2600.m4913();
                    c2600.m4908(new C1879(interfaceC5065, 2));
                    interfaceC5065.mo1599(new C1464(c2600, 1));
                    return c2600.m4909();
                } catch (Exception e) {
                    AbstractC0993.m2165(e, interfaceC0443);
                    return EnumC2282.f7590;
                }
        }
    }
}
