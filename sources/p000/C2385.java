package p000;

/* JADX INFO: renamed from: ۥۜؕٔۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2385 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ C3966 f7902;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ long f7903;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ float f7904;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ C2243 f7905;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ float f7906;

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ C0857 f7907;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ boolean f7908;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ InterfaceC4448 f7909;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC2864 f7910;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ InterfaceC0705 f7911;

    public C2385(InterfaceC0705 interfaceC0705, InterfaceC2864 interfaceC2864, long j, float f, C3966 c3966, C2243 c2243, boolean z, InterfaceC4448 interfaceC4448, float f2, C0857 c0857) {
        this.f7911 = interfaceC0705;
        this.f7910 = interfaceC2864;
        this.f7903 = j;
        this.f7904 = f;
        this.f7902 = c3966;
        this.f7905 = c2243;
        this.f7908 = z;
        this.f7909 = interfaceC4448;
        this.f7906 = f2;
        this.f7907 = c0857;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        C5362 c5362 = (C5362) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
            C2779 c2779 = AbstractC4331.f14306;
            InterfaceC0705 interfaceC0705Mo1571 = AbstractC0186.m434(AbstractC0701.m1558(this.f7911.mo1571(C0573.f2046), this.f7910, AbstractC0701.m1561(this.f7903, this.f7904, c5362), this.f7902, ((InterfaceC2880) c5362.m8997(AbstractC2853.f9544)).mo741(this.f7906)), this.f7905, AbstractC4670.m8032(0.0f, 7, 0L, false), this.f7908, null, this.f7909, 24).mo1571(new C1591(new C3018(4)));
            InterfaceC3228 interfaceC3228M2297 = AbstractC1089.m2297(C1298.f4456, true);
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
            AbstractC0993.m2127(C0849.f3048, c5362, interfaceC3228M2297);
            AbstractC0993.m2127(C0849.f3047, c5362, c2103M8994);
            C3136 c3136 = C0849.f3053;
            if (c5362.f17668 || !AbstractC3831.m6874(c5362.m8999(), Integer.valueOf(iM1958))) {
                AbstractC3761.m6618(iM1958, c5362, iM1958, c3136);
            }
            AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
            this.f7907.mo219(c5362, 0);
            c5362.m9009(true);
        } else {
            c5362.m8982();
        }
        return C2358.f7817;
    }
}
