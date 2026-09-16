package p000;

/* JADX INFO: renamed from: ۥۦِؑۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2781 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C0857 f9271;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ long f9272;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ float f9273;

    public C2781(float f, long j, C0857 c0857) {
        this.f9273 = f;
        this.f9272 = j;
        this.f9271 = c0857;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        C5362 c5362 = (C5362) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
            C1393 c1393 = AbstractC1487.f5051;
            InterfaceC0705 interfaceC0705M9378 = AbstractC5568.m9378(AbstractC4410.m7710(C4217.f13994, 40.0f, this.f9273, 8), AbstractC1487.f5051);
            InterfaceC3228 interfaceC3228M2297 = AbstractC1089.m2297(C1298.f4456, false);
            int iM1958 = AbstractC0949.m1958(c5362);
            C2103 c2103M8994 = c5362.m8994();
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705M9378);
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
            C4773.m8123(new C3467[]{AbstractC0194.f721.mo4313(new C1327(this.f9272)), AbstractC0495.f1787.mo4313(AbstractC4957.m8333(3, c5362))}, this.f9271, c5362, 8);
            c5362.m9009(true);
        } else {
            c5362.m8982();
        }
        return C2358.f7817;
    }
}
