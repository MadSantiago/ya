package p000;

/* JADX INFO: renamed from: ۦٖؗٙٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4317 implements InterfaceC4734 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4317 f14277 = new C4317();

    /* JADX INFO: renamed from: ۥۗ */
    public static final C2148 f14276 = AbstractC1631.m3426("kotlinx.serialization.json.JsonNull", C0907.f3259, new InterfaceC0103[0]);

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0103 mo193() {
        return f14276;
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo196(InterfaceC2125 interfaceC2125) {
        AbstractC4593.m7968(interfaceC2125);
        if (interfaceC2125.mo4105()) {
            throw new C2770(AbstractC3801.m6762(-1, "Expected 'null' literal", null, null, null));
        }
        return C0437.INSTANCE;
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        AbstractC4593.m7969(c3782);
        c3782.m6693();
    }
}
