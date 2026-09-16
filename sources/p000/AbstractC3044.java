package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦؑؕۥۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3044 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3869 f10238;

    static {
        C2340 c2340 = C2340.f7777;
        f10238 = new C3869(c2340, c2340);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m5651(C1249 c1249, List list, C5362 c5362, int i) {
        c5362.m8979(-1794596951);
        int i2 = (i & 6) == 0 ? (c5362.m8963(c1249) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= c5362.m8977(list) ? 32 : 16;
        }
        int i3 = 1;
        if (c5362.m9011(i2 & 1, (i2 & 19) != 18)) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C2331 c2331 = (C2331) list.get(i4);
                InterfaceC2609 interfaceC2609 = (InterfaceC2609) c2331.f7719;
                int i5 = c2331.f7718;
                int i6 = c2331.f7717;
                Object objM8999 = c5362.m8999();
                if (objM8999 == C2850.f9517) {
                    objM8999 = C2480.f8267;
                    c5362.m8987(objM8999);
                }
                InterfaceC3228 interfaceC3228 = (InterfaceC3228) objM8999;
                int iHashCode = Long.hashCode(c5362.f17657);
                C2103 c2103M8994 = c5362.m8994();
                InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, C4217.f13994);
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
                interfaceC2609.mo1173(c1249.subSequence(i5, i6).f4307, c5362, 0);
                c5362.m9009(true);
            }
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0016(i, i3, c1249, list);
        }
    }
}
