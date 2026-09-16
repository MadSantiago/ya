package p000;

/* JADX INFO: renamed from: ۦٕؓۚؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4232 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC5372 f14032;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f14033;

    public /* synthetic */ C4232(InterfaceC5372 interfaceC5372, int i) {
        this.f14033 = i;
        this.f14032 = interfaceC5372;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f14033;
        InterfaceC5372 interfaceC5372 = this.f14032;
        switch (i) {
            case 0:
                C1553 c1553 = (C1553) interfaceC5372.getValue();
                long j = c1553.f5241;
                return c1553;
            case 1:
                C0994 c0994 = AbstractC4382.f14447;
                C1553 c1554 = (C1553) interfaceC5372.getValue();
                long j2 = c1554.f5241;
                return c1554;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return Boolean.valueOf(((Number) interfaceC5372.getValue()).floatValue() > 0.0f);
            default:
                return Boolean.valueOf(((Number) interfaceC5372.getValue()).floatValue() > 0.0f);
        }
    }
}
