package p000;

/* JADX INFO: renamed from: ۦٌؘؘٟ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3511 implements InterfaceC1441 {
    private static final InterfaceC0103 descriptor;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3511 f11625;

    static {
        C3511 c3511 = new C3511();
        f11625 = c3511;
        C4688 c4688 = new C4688("com.google.firebase.sessions.SessionDetails", c3511, 4);
        c4688.m8034("sessionId", false);
        c4688.m8034("firstSessionId", false);
        c4688.m8034("sessionIndex", false);
        c4688.m8034("sessionStartTimestampUs", false);
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
        int iMo5158 = 0;
        String strMo5167 = null;
        String strMo5168 = null;
        long jMo5155 = 0;
        boolean z = true;
        while (z) {
            int iMo6291 = interfaceC5308Mo4114.mo6291(interfaceC0103);
            if (iMo6291 == -1) {
                z = false;
            } else if (iMo6291 == 0) {
                strMo5167 = interfaceC5308Mo4114.mo5167(interfaceC0103, 0);
                i |= 1;
            } else if (iMo6291 == 1) {
                strMo5168 = interfaceC5308Mo4114.mo5167(interfaceC0103, 1);
                i |= 2;
            } else if (iMo6291 == 2) {
                iMo5158 = interfaceC5308Mo4114.mo5158(interfaceC0103, 2);
                i |= 4;
            } else {
                if (iMo6291 != 3) {
                    throw new C0720(iMo6291);
                }
                jMo5155 = interfaceC5308Mo4114.mo5155(interfaceC0103, 3);
                i |= 8;
            }
        }
        interfaceC5308Mo4114.mo5156(interfaceC0103);
        return new C1521(i, strMo5167, strMo5168, iMo5158, jMo5155);
    }

    @Override // p000.InterfaceC1441
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4734[] mo404() {
        C2258 c2258 = C2258.f7505;
        return new InterfaceC4734[]{c2258, c2258, C1438.f4929, C2788.f9293};
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        C1521 c1521 = (C1521) obj;
        InterfaceC0103 interfaceC0103 = descriptor;
        C3782 c3782M6691 = c3782.m6691(interfaceC0103);
        c3782M6691.m6687(interfaceC0103, 0, c1521.f5162);
        c3782M6691.m6687(interfaceC0103, 1, c1521.f5161);
        int i = c1521.f5160;
        c3782M6691.m6685(interfaceC0103, 2);
        c3782M6691.m6695(i);
        long j = c1521.f5163;
        c3782M6691.m6685(interfaceC0103, 3);
        c3782M6691.m6697(j);
        c3782M6691.m6683();
    }
}
