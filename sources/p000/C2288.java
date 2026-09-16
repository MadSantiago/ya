package p000;

/* JADX INFO: renamed from: ۥٍۚؗ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2288 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC4448 f7597;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f7598;

    public /* synthetic */ C2288(int i, InterfaceC4448 interfaceC4448) {
        this.f7598 = i;
        this.f7597 = interfaceC4448;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f7598;
        C2358 c2358 = C2358.f7817;
        InterfaceC4448 interfaceC4448 = this.f7597;
        switch (i) {
            case 0:
                ((C1117) obj).m2338(((Number) interfaceC4448.mo449()).floatValue());
                return c2358;
            case 1:
                interfaceC4448.mo449();
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                interfaceC4448.mo449();
                return c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                ((Float) obj).floatValue();
                return Float.valueOf(((Number) interfaceC4448.mo449()).floatValue());
            default:
                return (C1553) interfaceC4448.mo449();
        }
    }
}
