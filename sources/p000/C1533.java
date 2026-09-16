package p000;

/* JADX INFO: renamed from: ۥٗؕؕٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1533 implements InterfaceC1441 {
    private static final InterfaceC0103 descriptor;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C1533 f5191;

    static {
        C1533 c1533 = new C1533();
        f5191 = c1533;
        C4688 c4688 = new C4688("com.google.firebase.sessions.settings.SessionConfigs", c1533, 5);
        c4688.m8034("sessionsEnabled", false);
        c4688.m8034("sessionSamplingRate", false);
        c4688.m8034("sessionTimeoutSeconds", false);
        c4688.m8034("cacheDurationSeconds", false);
        c4688.m8034("cacheUpdatedTimeSeconds", false);
        descriptor = c4688;
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0103 mo193() {
        return descriptor;
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo196(InterfaceC2125 interfaceC2125) {
        InterfaceC0103 interfaceC0103 = descriptor;
        InterfaceC5308 interfaceC5308Mo4114 = interfaceC2125.mo4114(interfaceC0103);
        int i = 0;
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        boolean z = true;
        while (z) {
            int iMo6291 = interfaceC5308Mo4114.mo6291(interfaceC0103);
            if (iMo6291 == -1) {
                z = false;
            } else if (iMo6291 == 0) {
                bool = (Boolean) interfaceC5308Mo4114.mo5165(interfaceC0103, 0, C2323.f7684, bool);
                i |= 1;
            } else if (iMo6291 == 1) {
                d = (Double) interfaceC5308Mo4114.mo5165(interfaceC0103, 1, C0839.f3000, d);
                i |= 2;
            } else if (iMo6291 == 2) {
                num = (Integer) interfaceC5308Mo4114.mo5165(interfaceC0103, 2, C1438.f4929, num);
                i |= 4;
            } else if (iMo6291 == 3) {
                num2 = (Integer) interfaceC5308Mo4114.mo5165(interfaceC0103, 3, C1438.f4929, num2);
                i |= 8;
            } else {
                if (iMo6291 != 4) {
                    throw new C0720(iMo6291);
                }
                l = (Long) interfaceC5308Mo4114.mo5165(interfaceC0103, 4, C2788.f9293, l);
                i |= 16;
            }
        }
        interfaceC5308Mo4114.mo5156(interfaceC0103);
        return new C2944(i, bool, d, num, num2, l);
    }

    @Override // p000.InterfaceC1441
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4734[] mo404() {
        InterfaceC4734 interfaceC4734M7783 = AbstractC4489.m7783(C2323.f7684);
        InterfaceC4734 interfaceC4734M7784 = AbstractC4489.m7783(C0839.f3000);
        C1438 c1438 = C1438.f4929;
        return new InterfaceC4734[]{interfaceC4734M7783, interfaceC4734M7784, AbstractC4489.m7783(c1438), AbstractC4489.m7783(c1438), AbstractC4489.m7783(C2788.f9293)};
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        C2944 c2944 = (C2944) obj;
        InterfaceC0103 interfaceC0103 = descriptor;
        C3782 c3782M6691 = c3782.m6691(interfaceC0103);
        c3782M6691.m6694(interfaceC0103, 0, C2323.f7684, c2944.f9883);
        c3782M6691.m6694(interfaceC0103, 1, C0839.f3000, c2944.f9882);
        C1438 c1438 = C1438.f4929;
        c3782M6691.m6694(interfaceC0103, 2, c1438, c2944.f9880);
        c3782M6691.m6694(interfaceC0103, 3, c1438, c2944.f9884);
        c3782M6691.m6694(interfaceC0103, 4, C2788.f9293, c2944.f9881);
        c3782M6691.m6683();
    }
}
