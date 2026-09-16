package p000;

/* JADX INFO: renamed from: ۥْٟٖؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2010 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ InterfaceC4448 f6624;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ InterfaceC3016 f6625;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ boolean f6626;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ C0857 f6627;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ boolean f6628;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ InterfaceC0705 f6629;

    public C2010(InterfaceC0705 interfaceC0705, boolean z, C0599 c0599, boolean z2, InterfaceC4448 interfaceC4448, C0857 c0857) {
        this.f6629 = interfaceC0705;
        this.f6628 = z;
        this.f6625 = c0599;
        this.f6626 = z2;
        this.f6624 = interfaceC4448;
        this.f6627 = c0857;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        C5362 c5362 = (C5362) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
            InterfaceC0705 interfaceC0705Mo1571 = AbstractC3831.m6866(this.f6629, this.f6628, this.f6625, this.f6626, new C2155(4), this.f6624).mo1571(AbstractC4410.f14521);
            C3113 c3113M9197 = AbstractC5501.m9197(AbstractC4225.f14015, C1298.f4426, c5362, 54);
            int iM1958 = AbstractC0949.m1958(c5362);
            C2103 c2103M8994 = c5362.m8994();
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705Mo1571);
            InterfaceC4576.f15106.getClass();
            C3709 c3709 = C0849.f3049;
            c5362.m8983();
            if (c5362.f17668) {
                c5362.m9005(c3709);
            } else {
                c5362.m8972();
            }
            AbstractC0993.m2127(C0849.f3048, c5362, c3113M9197);
            AbstractC0993.m2127(C0849.f3047, c5362, c2103M8994);
            C3136 c3136 = C0849.f3053;
            if (c5362.f17668 || !AbstractC3831.m6874(c5362.m8999(), Integer.valueOf(iM1958))) {
                AbstractC3761.m6618(iM1958, c5362, iM1958, c3136);
            }
            AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
            this.f6627.mo1173(C1869.f6214, c5362, 6);
            c5362.m9009(true);
        } else {
            c5362.m8982();
        }
        return C2358.f7817;
    }
}
