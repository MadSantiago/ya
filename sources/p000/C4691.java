package p000;

import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: renamed from: ۦَٜؕٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4691 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4691 f15452 = new C4691();

    /* JADX INFO: renamed from: ۥۣ */
    public final void m8040(final C4741 c4741, C5362 c5362, int i) {
        C4217 c4217;
        InterfaceC0705 interfaceC0705M4640;
        C5765 c5765;
        InterfaceC0705 interfaceC0705M7453;
        C5362 c5363 = c5362;
        float f = c4741.f15649;
        c5363.m8979(2137486921);
        int i2 = 4;
        int i3 = i | (c5363.m8963(c4741) ? 4 : 2);
        int i4 = 1;
        if (c5363.m9011(i3 & 1, (i3 & 3) != 2)) {
            C4692 c4692 = c4741.f15648;
            C5277 c5277 = c4741.f15647;
            if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) >= 2139095040) {
                C1078.m2272("The expandedHeight is expected to be specified and finite");
                return;
            }
            boolean zM8963 = c5363.m8963(c4692) | c5363.m8963(c5277);
            Object objM8999 = c5363.m8999();
            C4036 c4036 = C2850.f9517;
            if (zM8963 || objM8999 == c4036) {
                objM8999 = AbstractC3004.m5600(new C2767(0, c4741));
                c5363.m8987(objM8999);
            }
            InterfaceC5372 interfaceC5372M4275 = AbstractC2214.m4275(((C1327) ((InterfaceC5372) objM8999).getValue()).f4595, AbstractC2552.m4817(4, c5363), null, c5363, 0, 12);
            C0857 c0857M7034 = AbstractC3925.m7034(-1658896622, new C4190(i4, c4741), c5363);
            C4217 c4218 = C4217.f13994;
            if (c5277 != null) {
                c5363.m8957(689467622);
                int i5 = i3 & 14;
                boolean z = i5 == 4;
                Object objM89910 = c5363.m8999();
                if (z || objM89910 == c4036) {
                    objM89910 = new C0091(8, c4741);
                    c5363.m8987(objM89910);
                }
                C5499 c5499 = AbstractC2481.f8273;
                InterfaceC4367 interfaceC4367M5175 = AbstractC2774.m5175((InterfaceC4745) objM89910, c5363);
                Object objM89911 = c5363.m8999();
                if (objM89911 == c4036) {
                    C2483 c2483 = new C2483(new C2136(interfaceC4367M5175, i2));
                    c5363.m8987(c2483);
                    objM89911 = c2483;
                }
                InterfaceC4115 interfaceC4115 = (InterfaceC4115) objM89911;
                boolean z2 = i5 == 4;
                Object objM89912 = c5363.m8999();
                if (z2 || objM89912 == c4036) {
                    objM89912 = new C1643(c4741, null);
                    c5363.m8987(objM89912);
                }
                interfaceC0705M4640 = AbstractC2481.m4640(c4218, interfaceC4115, false, false, (InterfaceC2609) objM89912, 188);
                c4217 = c4218;
                c5363.m9009(false);
            } else {
                c4217 = c4218;
                c5363.m8957(690108113);
                c5363.m9009(false);
                interfaceC0705M4640 = c4217;
            }
            InterfaceC0705 interfaceC0705Mo1571 = c4741.f15645.mo1571(interfaceC0705M4640);
            boolean zM8964 = c5363.m8963(interfaceC5372M4275);
            Object objM89913 = c5363.m8999();
            if (zM8964 || objM89913 == c4036) {
                objM89913 = new C2446(interfaceC5372M4275, 0);
                c5363.m8987(objM89913);
            }
            InterfaceC0705 interfaceC0705M3037 = AbstractC1434.m3037(interfaceC0705Mo1571, (InterfaceC4745) objM89913);
            Object objM89914 = c5363.m8999();
            if (objM89914 == c4036) {
                objM89914 = new C3018(13);
                c5363.m8987(objM89914);
            }
            InterfaceC0705 interfaceC0705M3510 = AbstractC1697.m3510(interfaceC0705M3037, false, (InterfaceC4745) objM89914);
            Object objM89915 = c5363.m8999();
            if (objM89915 == c4036) {
                objM89915 = C4267.f14128;
                c5363.m8987(objM89915);
            }
            InterfaceC0705 interfaceC0705M5588 = AbstractC2995.m5588(interfaceC0705M3510, C2358.f7817, (PointerInputEventHandler) objM89915);
            InterfaceC3228 interfaceC3228M2297 = AbstractC1089.m2297(C1298.f4456, false);
            int iM1958 = AbstractC0949.m1958(c5363);
            C2103 c2103M8994 = c5363.m8994();
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5363, interfaceC0705M5588);
            InterfaceC4576.f15106.getClass();
            C3709 c3709 = C0849.f3049;
            c5363.m8983();
            if (c5363.f17668) {
                c5363.m9005(c3709);
            } else {
                c5363.m8972();
            }
            AbstractC0993.m2127(C0849.f3048, c5363, interfaceC3228M2297);
            AbstractC0993.m2127(C0849.f3047, c5363, c2103M8994);
            C3136 c3136 = C0849.f3053;
            if (c5363.f17668 || !AbstractC3831.m6874(c5363.m8999(), Integer.valueOf(iM1958))) {
                AbstractC3761.m6618(iM1958, c5363, iM1958, c3136);
            }
            AbstractC0993.m2127(C0849.f3052, c5363, interfaceC0705M2161);
            InterfaceC0705 interfaceC0705M9226 = AbstractC5537.m9226(AbstractC5568.m9364(c4217, c4741.f15644));
            C4216 c4216 = AbstractC2264.f7521;
            if (c5277 != null && (c5765 = c5277.f17393) != null && (interfaceC0705M7453 = AbstractC4225.m7453(interfaceC0705M9226, new C0511(c5765, 0))) != null) {
                interfaceC0705M9226 = interfaceC0705M7453;
            }
            boolean z3 = (i3 & 14) == 4;
            Object objM89916 = c5363.m8999();
            if (z3 || objM89916 == c4036) {
                objM89916 = new InterfaceC5813() { // from class: ۥؚٕؑٚ
                    @Override // p000.InterfaceC5813
                    /* JADX INFO: renamed from: ۥۣ */
                    public final float mo1657() {
                        C5765 c5766;
                        C5277 c5278 = c4741.f15647;
                        if (c5278 == null || (c5766 = c5278.f17393) == null) {
                            return 0.0f;
                        }
                        return c5766.f19005.m1711();
                    }
                };
                c5363.m8987(objM89916);
            }
            InterfaceC5813 interfaceC5813 = (InterfaceC5813) objM89916;
            long j = c4692.f15453;
            long j2 = c4692.f15458;
            long j3 = c4692.f15454;
            long j4 = c4692.f15455;
            C0857 c0857 = c4741.f15643;
            C3564 c3564 = c4741.f15640;
            C3564 c3565 = c4741.f15646;
            C0857 c0858 = c4741.f15641;
            float f2 = c4741.f15649;
            InterfaceC0705 interfaceC0705 = interfaceC0705M9226;
            Object objM89917 = c5363.m8999();
            if (objM89917 == c4036) {
                objM89917 = new C0062(23);
                c5363.m8987(objM89917);
            }
            AbstractC2264.m4307(interfaceC0705, interfaceC5813, j, j2, j4, j3, c0857, c3564, c3565, (InterfaceC4448) objM89917, c0858, c0857M7034, f2, c5363, 0);
            c5363 = c5363;
            c5363.m9009(true);
        } else {
            c5363.m8982();
        }
        C5863 c5863M8965 = c5363.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4762(i, 5, this, c4741);
        }
    }
}
