package p000;

import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥۥٌؗؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2762 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C0380 f9144 = AbstractC4489.m7820(300, AbstractC1074.f3761, 2);

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m5115(C0857 c0857, C5362 c5362, int i) {
        c5362.m8979(1033612924);
        int i2 = 1;
        if (c5362.m9011(i & 1, (i & 19) != 18)) {
            String strM9268 = AbstractC5537.m9268(R.string.m3c_bottom_sheet_drag_handle_description, c5362);
            C3621 c3621 = new C3621(C1298.f4426);
            InterfaceC3228 interfaceC3228M2297 = AbstractC1089.m2297(C1298.f4456, false);
            int iM1958 = AbstractC0949.m1958(c5362);
            C2103 c2103M8994 = c5362.m8994();
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, c3621);
            InterfaceC4576.f15106.getClass();
            InterfaceC4448 interfaceC4448 = C0849.f3049;
            c5362.m8983();
            if (c5362.f17668) {
                c5362.m9005(interfaceC4448);
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
            float f = AbstractC0619.f2308;
            C1393 c1393 = AbstractC1487.f5051;
            int iMo743 = ((InterfaceC2880) c5362.m8997(AbstractC2853.f9544)).mo743(4.0f);
            boolean zM8988 = c5362.m8988(iMo743);
            Object objM8999 = c5362.m8999();
            Object obj = C2850.f9517;
            if (zM8988 || objM8999 == obj) {
                objM8999 = new C4310(iMo743);
                c5362.m8987(objM8999);
            }
            C4310 c4310 = (C4310) objM8999;
            C0857 c0857M7034 = AbstractC3925.m7034(2059851063, new C2403(i2, strM9268), c5362);
            C3375 c3375 = AbstractC3725.f12410;
            boolean zM9006 = c5362.m9006(false) | c5362.m8963(c3375);
            Object objM89910 = c5362.m8999();
            if (zM9006 || objM89910 == obj) {
                objM89910 = new C4153(c3375);
                c5362.m8987(objM89910);
            }
            AbstractC1487.m3092(c4310, c0857M7034, (C4153) objM89910, null, false, c0857, c5362, 100663344);
            c5362.m9009(true);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4904(c0857, i, 2);
        }
    }
}
