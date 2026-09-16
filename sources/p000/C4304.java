package p000;

/* JADX INFO: renamed from: ۦًٖؕۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4304 implements InterfaceC1441 {
    private static final InterfaceC0103 descriptor;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4304 f14238;

    static {
        C4304 c4304 = new C4304();
        f14238 = c4304;
        C4688 c4688 = new C4688("com.google.firebase.sessions.ProcessData", c4304, 2);
        c4688.m8034("pid", false);
        c4688.m8034("uuid", false);
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
        String strMo5167 = null;
        boolean z = true;
        int i = 0;
        int iMo5158 = 0;
        while (z) {
            int iMo6291 = interfaceC5308Mo4114.mo6291(interfaceC0103);
            if (iMo6291 == -1) {
                z = false;
            } else if (iMo6291 == 0) {
                iMo5158 = interfaceC5308Mo4114.mo5158(interfaceC0103, 0);
                i |= 1;
            } else {
                if (iMo6291 != 1) {
                    throw new C0720(iMo6291);
                }
                strMo5167 = interfaceC5308Mo4114.mo5167(interfaceC0103, 1);
                i |= 2;
            }
        }
        interfaceC5308Mo4114.mo5156(interfaceC0103);
        return new C1060(i, iMo5158, strMo5167);
    }

    @Override // p000.InterfaceC1441
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4734[] mo404() {
        return new InterfaceC4734[]{C1438.f4929, C2258.f7505};
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        C1060 c1060 = (C1060) obj;
        InterfaceC0103 interfaceC0103 = descriptor;
        C3782 c3782M6691 = c3782.m6691(interfaceC0103);
        int i = c1060.f3738;
        c3782M6691.m6685(interfaceC0103, 0);
        c3782M6691.m6695(i);
        c3782M6691.m6687(interfaceC0103, 1, c1060.f3737);
        c3782M6691.m6683();
    }
}
