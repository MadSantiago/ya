package p000;

import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: renamed from: ۦٍؕٞۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3794 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ float f12593;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ long f12594;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ float f12595;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ C0857 f12596;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC2864 f12597;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ InterfaceC0705 f12598;

    public C3794(InterfaceC0705 interfaceC0705, InterfaceC2864 interfaceC2864, long j, float f, float f2, C0857 c0857) {
        this.f12598 = interfaceC0705;
        this.f12597 = interfaceC2864;
        this.f12594 = j;
        this.f12595 = f;
        this.f12593 = f2;
        this.f12596 = c0857;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        C5362 c5362 = (C5362) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean zM9011 = c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2);
        C2358 c2358 = C2358.f7817;
        if (!zM9011) {
            c5362.m8982();
            return c2358;
        }
        InterfaceC0705 interfaceC0705M1558 = AbstractC0701.m1558(this.f12598, this.f12597, AbstractC0701.m1561(this.f12594, this.f12595, c5362), null, ((InterfaceC2880) c5362.m8997(AbstractC2853.f9544)).mo741(this.f12593));
        Object objM8999 = c5362.m8999();
        C4036 c4036 = C2850.f9517;
        if (objM8999 == c4036) {
            objM8999 = new C4215(23);
            c5362.m8987(objM8999);
        }
        InterfaceC0705 interfaceC0705M3510 = AbstractC1697.m3510(interfaceC0705M1558, false, (InterfaceC4745) objM8999);
        Object objM89910 = c5362.m8999();
        if (objM89910 == c4036) {
            objM89910 = C4267.f14127;
            c5362.m8987(objM89910);
        }
        InterfaceC0705 interfaceC0705M5588 = AbstractC2995.m5588(interfaceC0705M3510, c2358, (PointerInputEventHandler) objM89910);
        InterfaceC3228 interfaceC3228M2297 = AbstractC1089.m2297(C1298.f4456, true);
        int iM1958 = AbstractC0949.m1958(c5362);
        C2103 c2103M8994 = c5362.m8994();
        InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705M5588);
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
        this.f12596.mo219(c5362, 0);
        c5362.m9009(true);
        return c2358;
    }
}
