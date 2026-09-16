package p000;

/* JADX INFO: renamed from: ۦؘٝؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3519 implements InterfaceC4734 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3519 f11655 = new C3519();

    /* JADX INFO: renamed from: ۥۗ */
    public static final C2148 f11654 = AbstractC1631.m3426("kotlinx.serialization.json.JsonPrimitive", C2204.f7302, new InterfaceC0103[0]);

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0103 mo193() {
        return f11654;
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo196(InterfaceC2125 interfaceC2125) {
        C3501 c3501M7968 = AbstractC4593.m7968(interfaceC2125);
        AbstractC0695 abstractC0695M6290 = c3501M7968.m6290();
        if (abstractC0695M6290 instanceof AbstractC1020) {
            return (AbstractC1020) abstractC0695M6290;
        }
        String str = "Unexpected JSON element, expected JsonPrimitive, had " + AbstractC5041.m8557(abstractC0695M6290.getClass());
        C3510 c3510 = c3501M7968.m6289().f3430;
        throw new C2770(AbstractC3801.m6762(-1, str, null, null, AbstractC3801.m6795(-1, abstractC0695M6290.toString()).toString()));
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        AbstractC1020 abstractC1020 = (AbstractC1020) obj;
        AbstractC4593.m7969(c3782);
        if (abstractC1020 instanceof C0437) {
            c3782.m6701(C4317.f14277, C0437.INSTANCE);
        } else {
            c3782.m6701(C2996.f10073, (C0173) abstractC1020);
        }
    }
}
