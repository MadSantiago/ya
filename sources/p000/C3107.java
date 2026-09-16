package p000;

/* JADX INFO: renamed from: ۦؒؓۥؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3107 implements InterfaceC4734 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3107 f10419 = new C3107();

    /* JADX INFO: renamed from: ۥۗ */
    public static final C2148 f10418 = AbstractC1631.m3433("kotlinx.serialization.json.JsonElement", C5384.f17801, new InterfaceC0103[0], new C4618(3));

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0103 mo193() {
        return f10418;
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo196(InterfaceC2125 interfaceC2125) {
        return AbstractC4593.m7968(interfaceC2125).m6290();
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        AbstractC0695 abstractC0695 = (AbstractC0695) obj;
        AbstractC4593.m7969(c3782);
        if (abstractC0695 instanceof AbstractC1020) {
            c3782.m6701(C3519.f11655, abstractC0695);
            return;
        }
        if (abstractC0695 instanceof C2945) {
            c3782.m6701(C1382.f4733, abstractC0695);
        } else if (abstractC0695 instanceof C5832) {
            c3782.m6701(C3252.f10922, abstractC0695);
        } else {
            C1078.m2275();
        }
    }
}
