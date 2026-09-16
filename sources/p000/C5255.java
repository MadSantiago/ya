package p000;

/* JADX INFO: renamed from: ۦۛٙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5255 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ long f17329;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ long f17330;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ long f17331;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ C0857 f17332;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC5731 f17333;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ InterfaceC5731 f17334;

    public C5255(InterfaceC5731 interfaceC5731, InterfaceC5731 interfaceC5732, long j, long j2, long j3, long j4, C0857 c0857) {
        this.f17334 = interfaceC5731;
        this.f17333 = interfaceC5732;
        this.f17330 = j2;
        this.f17331 = j3;
        this.f17329 = j4;
        this.f17332 = c0857;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        C5362 c5362 = (C5362) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = 1;
        int i2 = 0;
        if (c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
            InterfaceC0705 interfaceC0705M9378 = AbstractC5568.m9378(C4217.f13994, AbstractC4753.f15691);
            C3113 c3113M9197 = AbstractC5501.m9197(AbstractC4225.f14009, C1298.f4443, c5362, 0);
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
            C3136 c3136 = C0849.f3048;
            AbstractC0993.m2127(c3136, c5362, c3113M9197);
            C3136 c3137 = C0849.f3047;
            AbstractC0993.m2127(c3137, c5362, c2103M8994);
            C3136 c3138 = C0849.f3053;
            if (c5362.f17668 || !AbstractC3831.m6874(c5362.m8999(), Integer.valueOf(iM1958))) {
                AbstractC3761.m6618(iM1958, c5362, iM1958, c3138);
            }
            C3136 c3139 = C0849.f3052;
            AbstractC0993.m2127(c3139, c5362, interfaceC0705M2161);
            c5362.m8957(346092326);
            c5362.m9009(false);
            InterfaceC5731 interfaceC5731 = this.f17334;
            if (interfaceC5731 == null) {
                c5362.m8957(346396529);
            } else {
                c5362.m8957(346396530);
                AbstractC2765.m5143(this.f17330, AbstractC4957.m8333(9, c5362), AbstractC3925.m7034(71284337, new C4343(i2, interfaceC5731), c5362), c5362, 384);
            }
            c5362.m9009(false);
            InterfaceC5731 interfaceC5732 = this.f17333;
            if (interfaceC5732 == null) {
                c5362.m8957(347174009);
            } else {
                c5362.m8957(347174010);
                AbstractC2765.m5143(this.f17331, AbstractC4957.m8333(2, c5362), AbstractC3925.m7034(705583346, new C4343(i, interfaceC5732), c5362), c5362, 384);
            }
            c5362.m9009(false);
            C3621 c3621 = new C3621(C1298.f4453);
            InterfaceC3228 interfaceC3228M2297 = AbstractC1089.m2297(C1298.f4456, false);
            int iM1959 = AbstractC0949.m1958(c5362);
            C2103 c2103M8995 = c5362.m8994();
            InterfaceC0705 interfaceC0705M2162 = AbstractC0993.m2161(c5362, c3621);
            c5362.m8983();
            if (c5362.f17668) {
                c5362.m9005(c3709);
            } else {
                c5362.m8972();
            }
            AbstractC0993.m2127(c3136, c5362, interfaceC3228M2297);
            AbstractC0993.m2127(c3137, c5362, c2103M8995);
            if (c5362.f17668 || !AbstractC3831.m6874(c5362.m8999(), Integer.valueOf(iM1959))) {
                AbstractC3761.m6618(iM1959, c5362, iM1959, c3138);
            }
            AbstractC0993.m2127(c3139, c5362, interfaceC0705M2162);
            AbstractC2765.m5143(this.f17329, AbstractC4957.m8333(10, c5362), this.f17332, c5362, 0);
            c5362.m9009(true);
            c5362.m9009(true);
        } else {
            c5362.m8982();
        }
        return C2358.f7817;
    }
}
