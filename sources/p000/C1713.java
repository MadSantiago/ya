package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۥًٚؒٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1713 implements InterfaceC3762 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC3762 f5690;

    /* JADX INFO: renamed from: ۥۗ */
    public final C2384 f5691;

    /* JADX INFO: renamed from: ۦؑ */
    public final EnumC2459 f5692;

    public C1713(C2384 c2384, InterfaceC3762 interfaceC3762, EnumC2459 enumC2459) {
        this.f5691 = c2384;
        this.f5690 = interfaceC3762;
        this.f5692 = enumC2459;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0016  */
    @Override // p000.InterfaceC3762
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo3531(float f, float f2, float f3) {
        int iM1407;
        int iM1408;
        int iM1409;
        C2384 c2384 = this.f5691;
        C4852 c4852 = c2384.f2355;
        float fMo3531 = this.f5690.mo3531(f, f2, f3);
        boolean z = false;
        if (f <= 0.0f) {
            float f4 = f + f2;
            Map map = AbstractC4168.f13869;
            if (f4 <= 1.0f) {
                z = true;
            }
        } else if (f + f2 > f3) {
            z = true;
        }
        float fAbs = Math.abs(fMo3531);
        EnumC2459 enumC2459 = EnumC2459.f8214;
        EnumC1616 enumC1616 = EnumC1616.f5424;
        EnumC2459 enumC24510 = this.f5692;
        if (fAbs != 0.0f && z) {
            if (enumC24510 == enumC2459 && c2384.m1402().f7485 == enumC1616) {
                iM1409 = c2384.m1407() + (-c2384.f2338);
            } else {
                iM1409 = c2384.f2338;
            }
            float fM1407 = iM1409 * (-1.0f);
            while (fMo3531 > 0.0f && fM1407 < fMo3531) {
                fM1407 += c2384.m1407();
            }
            while (fMo3531 < 0.0f && fM1407 > fMo3531) {
                fM1407 -= c2384.m1407();
            }
            return fM1407;
        }
        if (Math.abs(c2384.f2338) < 1.0E-6d) {
            return 0.0f;
        }
        if (enumC24510 == enumC2459 && c2384.m1402().f7485 == enumC1616) {
            iM1407 = c2384.m1407() + (-c2384.f2338);
        } else {
            iM1407 = c2384.f2338;
        }
        float f5 = iM1407 * (-1.0f);
        if (enumC24510 == enumC2459 && c2384.m1402().f7485 == enumC1616) {
            if (!((Boolean) c4852.getValue()).booleanValue()) {
                iM1408 = c2384.m1407();
                f5 += iM1408;
            }
        } else if (((Boolean) c4852.getValue()).booleanValue()) {
            iM1408 = c2384.m1407();
            f5 += iM1408;
        }
        return AbstractC4554.m7922(f5, -f3, f3);
    }
}
