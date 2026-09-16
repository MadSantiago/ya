package p000;

/* JADX INFO: renamed from: ۥٔؔۖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1346 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ InterfaceC1291 f4632;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C0857 f4633;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C3176 f4634;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ InterfaceC4367 f4635;

    public C1346(InterfaceC4367 interfaceC4367, C3176 c3176, InterfaceC1291 interfaceC1291, C0857 c0857) {
        this.f4635 = interfaceC4367;
        this.f4634 = c3176;
        this.f4632 = interfaceC1291;
        this.f4633 = c0857;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        C5362 c5362 = (C5362) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
            InterfaceC0705 interfaceC0705M1922 = AbstractC0949.m1922(C4217.f13994, "Container");
            C4660 c4660 = new C4660(this.f4635, InterfaceC4367.class, "value", "getValue()Ljava/lang/Object;", 0);
            AbstractC0487.m1035(this.f4634);
            InterfaceC0705 interfaceC0705M3039 = AbstractC1434.m3039(interfaceC0705M1922, new C3464(c4660, this.f4632, C1298.f4443, 11));
            InterfaceC3228 interfaceC3228M2297 = AbstractC1089.m2297(C1298.f4456, true);
            int iM1958 = AbstractC0949.m1958(c5362);
            C2103 c2103M8994 = c5362.m8994();
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705M3039);
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
            this.f4633.mo219(c5362, 0);
            c5362.m9009(true);
        } else {
            c5362.m8982();
        }
        return C2358.f7817;
    }
}
