package p000;

/* JADX INFO: renamed from: ۥۧٞۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2894 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f9649;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ long f9650;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f9651 = 0;

    public /* synthetic */ C2894(long j, InterfaceC5731 interfaceC5731, int i) {
        this.f9650 = j;
        this.f9649 = interfaceC5731;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f9651;
        C2358 c2358 = C2358.f7817;
        Object obj3 = this.f9649;
        long j = this.f9650;
        switch (i) {
            case 0:
                InterfaceC0705 interfaceC0705 = (InterfaceC0705) obj3;
                C5362 c5362 = (C5362) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c5362.m8982();
                } else if (j == 9205357640488583168L) {
                    c5362.m8957(-1243644858);
                    AbstractC0131.m287(interfaceC0705, c5362, 0, 0);
                    c5362.m9009(false);
                } else {
                    c5362.m8957(-1244013944);
                    InterfaceC0705 interfaceC0705M7701 = AbstractC4410.m7701(interfaceC0705, C1495.m3175(j), C1495.m3176(j), 0.0f, 0.0f, 12);
                    InterfaceC3228 interfaceC3228M2297 = AbstractC1089.m2297(C1298.f4428, false);
                    int iHashCode = Long.hashCode(c5362.f17657);
                    C2103 c2103M8994 = c5362.m8994();
                    InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705M7701);
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
                    AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode));
                    AbstractC0993.m2146(c5362, C0849.f3050);
                    AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
                    AbstractC0131.m287(null, c5362, 0, 1);
                    c5362.m9009(true);
                    c5362.m9009(false);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC0487.m1071(j, (InterfaceC5731) obj3, (C5362) obj, AbstractC3831.m6835(1));
                break;
        }
        return c2358;
    }

    public /* synthetic */ C2894(long j, InterfaceC0705 interfaceC0705) {
        this.f9650 = j;
        this.f9649 = interfaceC0705;
    }
}
