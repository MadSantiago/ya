package p000;

/* JADX INFO: renamed from: ۦۣ٘ؓۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4422 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥؓ */
    public final /* synthetic */ long f14574;

    /* JADX INFO: renamed from: ۥؖ */
    public final /* synthetic */ long f14575;

    /* JADX INFO: renamed from: ۥً */
    public final /* synthetic */ InterfaceC5731 f14576;

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ C5825 f14577;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C1705 f14578;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C5348 f14579;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ InterfaceC4643 f14580;

    /* JADX INFO: renamed from: ۥٙ */
    public final /* synthetic */ InterfaceC2864 f14581;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ float f14582;

    /* JADX INFO: renamed from: ۥۧ */
    public final /* synthetic */ C0857 f14583;

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ boolean f14584;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ InterfaceC4745 f14585;

    /* JADX INFO: renamed from: ۦٚ */
    public final /* synthetic */ C0857 f14586;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ InterfaceC0705 f14587;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC4448 f14588;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ long f14589;

    public C4422(long j, InterfaceC4448 interfaceC4448, C1705 c1705, C5348 c5348, C5825 c5825, InterfaceC4643 interfaceC4643, InterfaceC4745 interfaceC4745, InterfaceC0705 interfaceC0705, float f, boolean z, InterfaceC2864 interfaceC2864, long j2, long j3, C0857 c0857, InterfaceC5731 interfaceC5731, C0857 c0858) {
        this.f14589 = j;
        this.f14588 = interfaceC4448;
        this.f14578 = c1705;
        this.f14579 = c5348;
        this.f14577 = c5825;
        this.f14580 = interfaceC4643;
        this.f14585 = interfaceC4745;
        this.f14587 = interfaceC0705;
        this.f14582 = f;
        this.f14584 = z;
        this.f14581 = interfaceC2864;
        this.f14575 = j2;
        this.f14574 = j3;
        this.f14583 = c0857;
        this.f14576 = interfaceC5731;
        this.f14586 = c0858;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        C5362 c5362 = (C5362) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
            InterfaceC0705 interfaceC0705M7973 = AbstractC4593.m7973(AbstractC4410.f14520);
            Object objM8999 = c5362.m8999();
            if (objM8999 == C2850.f9517) {
                objM8999 = new C4618(22);
                c5362.m8987(objM8999);
            }
            InterfaceC0705 interfaceC0705M3510 = AbstractC1697.m3510(interfaceC0705M7973, false, (InterfaceC4745) objM8999);
            InterfaceC3228 interfaceC3228M2297 = AbstractC1089.m2297(C1298.f4456, false);
            int iM1958 = AbstractC0949.m1958(c5362);
            C2103 c2103M8994 = c5362.m8994();
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705M3510);
            InterfaceC4576.f15106.getClass();
            C3709 c3709 = C0849.f3049;
            c5362.m8983();
            if (c5362.f17668) {
                c5362.m9005(c3709);
            } else {
                c5362.m8972();
            }
            AbstractC0993.m2127(C0849.f3048, c5362, interfaceC3228M2297);
            AbstractC0993.m2127(C0849.f3047, c5362, c2103M8994);
            C3136 c3136 = C0849.f3053;
            if (c5362.f17668 || !AbstractC3831.m6874(c5362.m8999(), Integer.valueOf(iM1958))) {
                AbstractC3761.m6618(iM1958, c5362, iM1958, c3136);
            }
            AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
            C1705 c1705 = this.f14578;
            boolean z = ((EnumC0845) c1705.f5675.f14991.getValue()) != EnumC0845.f3016;
            this.f14579.getClass();
            long j = this.f14589;
            InterfaceC4448 interfaceC4448 = this.f14588;
            AbstractC1418.m3014(j, interfaceC4448, z, c5362, 0);
            AbstractC1418.m3017(this.f14577, this.f14580, interfaceC4448, this.f14585, this.f14587, c1705, this.f14582, this.f14584, this.f14581, this.f14575, this.f14574, 0.0f, this.f14583, this.f14576, this.f14586, c5362, 70);
            c5362.m9009(true);
        } else {
            c5362.m8982();
        }
        return C2358.f7817;
    }
}
