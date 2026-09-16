package p000;

/* JADX INFO: renamed from: ۦؘؙٚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4582 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C5666 f15116;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f15117;

    public /* synthetic */ C4582(C5666 c5666, int i) {
        this.f15117 = i;
        this.f15116 = c5666;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f15117;
        C2358 c2358 = C2358.f7817;
        C5666 c5666 = this.f15116;
        switch (i) {
            case 0:
                AbstractC5537.m9274(c5666);
                return c2358;
            case 1:
                c5666.f18640.m6471(true);
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                c5666.f18640.m6477(true);
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                c5666.f18640.m6469();
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                AbstractC5537.m9274(c5666);
                return c2358;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                c5666.f18640.m6489();
                break;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                C5149 c5149 = c5666.f18641.f19229;
                c5149.f17059.f19226.m9678(c5666.f18642.f7792);
                break;
            default:
                C5837 c5837 = c5666.f18641;
                C3985 c3985 = c5666.f18643;
                if (c5837.m9646()) {
                    InterfaceC3508 interfaceC3508 = c5837.f19221;
                    if (interfaceC3508 != null) {
                        ((C3773) interfaceC3508).m6676();
                    }
                } else {
                    C3985.m7129(c3985);
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
