package p000;

/* JADX INFO: renamed from: ۥًؘۣ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2472 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC4367 f8247;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f8248;

    public /* synthetic */ C2472(InterfaceC4367 interfaceC4367, int i) {
        this.f8248 = i;
        this.f8247 = interfaceC4367;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f8248;
        C2358 c2358 = C2358.f7817;
        InterfaceC4367 interfaceC4367 = this.f8247;
        switch (i) {
            case 0:
                C5362 c5362 = (C5362) obj;
                int iIntValue = ((Integer) obj2).intValue();
                new C4441(new long[]{8307361295374689872L, -7956760112786888955L, 8940652929518967983L, 4981529976604730101L, -3123724588379392932L, -8257864445914810277L, 1420563364338812895L, 3108350157215777526L}).toString();
                if (!c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c5362.m8982();
                } else {
                    AbstractC0495.m1105(C3133.m5804(((C0783) interfaceC4367.getValue()).f2828, c5362), null, 0L, AbstractC4489.m7788(20), null, 0L, null, 0L, 0, false, 0, 0, null, c5362, 24576, 0, 262126);
                }
                break;
            default:
                C5362 c5363 = (C5362) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                new C4441(new long[]{-531183373005087788L, 5195216820620546200L, -3353924177819632318L, 7749273726679161969L, 1313293927727785245L}).toString();
                if (!c5363.m9011(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c5363.m8982();
                } else if (((C5745) interfaceC4367.getValue()).f18944.f4307.length() <= 1) {
                    c5363.m8957(-1297234099);
                    c5363.m9009(false);
                } else {
                    c5363.m8957(-1297577176);
                    new C4441(new long[]{-7850848906961931329L, 3237319782772834755L, 3488471562843036741L, 8969637703110761911L, -442394629487600737L}).toString();
                    new C4441(new long[]{-8834957337723531035L, -6493879258695670063L, -5044092967465572259L, 2303001844809850180L, 6956517938290007434L, -2454437628239407913L}).toString();
                    Object objM8999 = c5363.m8999();
                    if (objM8999 == C2850.f9517) {
                        objM8999 = new C0681(interfaceC4367, 17);
                        c5363.m8987(objM8999);
                    }
                    AbstractC4225.m7457((InterfaceC4448) objM8999, null, false, null, null, AbstractC4489.f14861, c5363, 1572870, 62);
                    c5363.m9009(false);
                }
                break;
        }
        return c2358;
    }
}
