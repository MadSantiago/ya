package p000;

/* JADX INFO: renamed from: ۦۣؔۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3253 implements InterfaceC1441 {
    private static final InterfaceC0103 descriptor;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3253 f10923;

    static {
        C3253 c3253 = new C3253();
        f10923 = c3253;
        C4688 c4688 = new C4688("com.google.firebase.sessions.Time", c3253, 3);
        c4688.m8034("ms", false);
        c4688.m8034("us", true);
        c4688.m8034("seconds", true);
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
        long jMo5155 = 0;
        long jMo5156 = 0;
        long jMo5157 = 0;
        boolean z = true;
        while (z) {
            int iMo6291 = interfaceC5308Mo4114.mo6291(interfaceC0103);
            if (iMo6291 == -1) {
                z = false;
            } else if (iMo6291 == 0) {
                jMo5155 = interfaceC5308Mo4114.mo5155(interfaceC0103, 0);
                i |= 1;
            } else if (iMo6291 == 1) {
                jMo5156 = interfaceC5308Mo4114.mo5155(interfaceC0103, 1);
                i |= 2;
            } else {
                if (iMo6291 != 2) {
                    throw new C0720(iMo6291);
                }
                jMo5157 = interfaceC5308Mo4114.mo5155(interfaceC0103, 2);
                i |= 4;
            }
        }
        interfaceC5308Mo4114.mo5156(interfaceC0103);
        return new C4959(i, jMo5155, jMo5156, jMo5157);
    }

    @Override // p000.InterfaceC1441
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4734[] mo404() {
        C2788 c2788 = C2788.f9293;
        return new InterfaceC4734[]{c2788, c2788, c2788};
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        C4959 c4959 = (C4959) obj;
        InterfaceC0103 interfaceC0103 = descriptor;
        C3782 c3782M6691 = c3782.m6691(interfaceC0103);
        long j = c4959.f16406;
        long j2 = c4959.f16404;
        long j3 = c4959.f16405;
        c3782M6691.m6685(interfaceC0103, 0);
        c3782M6691.m6697(j);
        if (c3782M6691.m6688() || j3 != j * 1000) {
            c3782M6691.m6685(interfaceC0103, 1);
            c3782M6691.m6697(j3);
        }
        if (c3782M6691.m6688() || j2 != j / 1000) {
            c3782M6691.m6685(interfaceC0103, 2);
            c3782M6691.m6697(j2);
        }
        c3782M6691.m6683();
    }
}
