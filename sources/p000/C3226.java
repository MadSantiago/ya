package p000;

/* JADX INFO: renamed from: ۦؔؔٚؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3226 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C3635 f10840;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f10841;

    public /* synthetic */ C3226(C3635 c3635, int i) {
        this.f10841 = i;
        this.f10840 = c3635;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0120  */
    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        C2793 c2793;
        InterfaceC2015 interfaceC2015M9643;
        char c;
        float fIntBitsToFloat;
        InterfaceC2015 interfaceC2015M9644;
        InterfaceC2015 interfaceC2015M9645;
        InterfaceC2015 interfaceC2015M9646;
        InterfaceC2015 interfaceC2015M9647;
        int i = this.f10841;
        C3635 c3635 = this.f10840;
        switch (i) {
            case 0:
                return new C4954(6, c3635);
            case 1:
                c3635.m6470();
                return C2358.f7817;
            default:
                InterfaceC2015 interfaceC2015 = (InterfaceC2015) obj;
                C5837 c5837 = c3635.f12150;
                C2793 c2794 = C2793.f9340;
                if (c5837 == null) {
                    c2793 = c2794;
                } else {
                    if (c5837.f19245) {
                        c5837 = null;
                    }
                    if (c5837 != null) {
                        InterfaceC4120 interfaceC4120 = c3635.f12147;
                        long j = c3635.m6479().f18943;
                        int i2 = C3346.f11195;
                        int iMo4319 = interfaceC4120.mo4319((int) (j >> 32));
                        int iMo43110 = c3635.f12147.mo4319((int) (c3635.m6479().f18943 & 4294967295L));
                        C5837 c5838 = c3635.f12150;
                        long jMo2808 = 0;
                        long jMo2809 = (c5838 == null || (interfaceC2015M9647 = c5838.m9643()) == null) ? 0L : interfaceC2015M9647.mo2808(c3635.m6481(true));
                        C5837 c5839 = c3635.f12150;
                        if (c5839 != null && (interfaceC2015M9646 = c5839.m9643()) != null) {
                            jMo2808 = interfaceC2015M9646.mo2808(c3635.m6481(false));
                        }
                        C5837 c58310 = c3635.f12150;
                        float fIntBitsToFloat2 = 0.0f;
                        if (c58310 == null || (interfaceC2015M9645 = c58310.m9643()) == null) {
                            c = ' ';
                            fIntBitsToFloat = 0.0f;
                        } else {
                            C2449 c2449M9648 = c5837.m9648();
                            c = ' ';
                            fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC2015M9645.mo2808((((long) Float.floatToRawIntBits(c2449M9648 != null ? c2449M9648.f8158.m6824(iMo4319).f9342 : 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)) & 4294967295L));
                        }
                        C5837 c58311 = c3635.f12150;
                        if (c58311 != null && (interfaceC2015M9644 = c58311.m9643()) != null) {
                            C2449 c2449M9649 = c5837.m9648();
                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC2015M9644.mo2808((((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(c2449M9649 != null ? c2449M9649.f8158.m6824(iMo43110).f9342 : 0.0f)) & 4294967295L)) & 4294967295L));
                        }
                        int i3 = (int) (jMo2809 >> c);
                        int i4 = (int) (jMo2808 >> c);
                        c2793 = new C2793(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), (c5837.f19232.f1628.mo746() * 25.0f) + Math.max(Float.intBitsToFloat((int) (jMo2809 & 4294967295L)), Float.intBitsToFloat((int) (jMo2808 & 4294967295L))));
                    } else {
                        c2793 = c2794;
                    }
                }
                C5837 c58312 = c3635.f12150;
                if (c58312 == null || (interfaceC2015M9643 = c58312.m9643()) == null) {
                    return null;
                }
                return (interfaceC2015M9643.mo2807() && interfaceC2015.mo2807()) ? AbstractC5568.m9368(interfaceC2015.mo2783(C4773.m8145(interfaceC2015M9643), c2793.m5322()), c2793.m5316()) : c2794;
        }
    }
}
