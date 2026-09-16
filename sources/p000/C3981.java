package p000;

/* JADX INFO: renamed from: ۦِؖؒۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3981 extends AbstractC1127 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C2453 f13298;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ InterfaceC4367 f13299;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f13300;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3981(C2453 c2453, InterfaceC4367 interfaceC4367, int i) {
        super(2);
        this.f13300 = i;
        this.f13298 = c2453;
        this.f13299 = interfaceC4367;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f13300;
        C2358 c2358 = C2358.f7817;
        InterfaceC4367 interfaceC4367 = this.f13299;
        C2453 c2453 = this.f13298;
        int i2 = 0;
        switch (i) {
            case 0:
                C5362 c5362 = (C5362) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c5362.m8982();
                } else {
                    Object objM8999 = c5362.m8999();
                    C4036 c4036 = C2850.f9517;
                    if (objM8999 == c4036) {
                        objM8999 = C1931.f6380;
                        c5362.m8987(objM8999);
                    }
                    InterfaceC0705 interfaceC0705M3510 = AbstractC1697.m3510(C4217.f13994, false, (InterfaceC4745) objM8999);
                    boolean zM8977 = c5362.m8977(c2453);
                    Object objM89910 = c5362.m8999();
                    if (zM8977 || objM89910 == c4036) {
                        objM89910 = new C4399(c2453, 1);
                        c5362.m8987(objM89910);
                    }
                    InterfaceC0705 interfaceC0705M7453 = AbstractC4225.m7453(interfaceC0705M3510, (InterfaceC4745) objM89910);
                    float f = c2453.getCanCalculatePosition() ? 1.0f : 0.0f;
                    if (f != 1.0f) {
                        interfaceC0705M7453 = AbstractC4554.m7894(interfaceC0705M7453, f, null, 520187);
                    }
                    C4216 c4216 = AbstractC3026.f10188;
                    InterfaceC5731 interfaceC5731 = (InterfaceC5731) interfaceC4367.getValue();
                    Object objM89911 = c5362.m8999();
                    if (objM89911 == c4036) {
                        objM89911 = C2480.f8262;
                        c5362.m8987(objM89911);
                    }
                    InterfaceC3228 interfaceC3228 = (InterfaceC3228) objM89911;
                    int iHashCode = Long.hashCode(c5362.f17657);
                    C2103 c2103M8994 = c5362.m8994();
                    InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705M7453);
                    InterfaceC4576.f15106.getClass();
                    C3709 c3709 = C0849.f3049;
                    c5362.m8983();
                    if (c5362.f17668) {
                        c5362.m9005(c3709);
                    } else {
                        c5362.m8972();
                    }
                    AbstractC0993.m2127(C0849.f3048, c5362, interfaceC3228);
                    AbstractC0993.m2127(C0849.f3047, c5362, c2103M8994);
                    AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode));
                    AbstractC0993.m2146(c5362, C0849.f3050);
                    AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
                    interfaceC5731.mo219(c5362, 0);
                    c5362.m9009(true);
                }
                break;
            default:
                C5362 c5363 = (C5362) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!c5363.m9011(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c5363.m8982();
                } else {
                    C4773.m8137(AbstractC3026.f10187.mo4313(Boolean.TRUE), AbstractC3925.m7034(1022273628, new C3981(c2453, interfaceC4367, i2), c5363), c5363, 56);
                }
                break;
        }
        return c2358;
    }
}
