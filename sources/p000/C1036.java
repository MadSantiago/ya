package p000;

/* JADX INFO: renamed from: ۥُؑۢٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1036 implements InterfaceC1441 {
    private static final InterfaceC0103 descriptor;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C1036 f3669;

    static {
        C1036 c1036 = new C1036();
        f3669 = c1036;
        C4688 c4688 = new C4688(new C4441(new long[]{-221585067056343851L, 4369758260180953083L, -3990153007465041072L, 3625332178647780563L, -1965666071231151670L, -231776848808860746L, 3627201559769797030L, 6591340820040564175L, 6267059908524135762L}).toString(), c1036, 3);
        c4688.m8034(new C4441(new long[]{1103244874521244252L, -1005839899711970357L, 541141546675551102L}).toString(), false);
        c4688.m8034(new C4441(new long[]{-1515762573848578853L, 601614971947161856L}).toString(), true);
        c4688.m8034(new C4441(new long[]{-1932147204066596666L, -8508762153178211919L, -1833752085049738307L}).toString(), true);
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
        boolean zMo5163 = false;
        boolean zMo5164 = false;
        while (z) {
            int iMo6291 = interfaceC5308Mo4114.mo6291(interfaceC0103);
            if (iMo6291 == -1) {
                z = false;
            } else if (iMo6291 == 0) {
                strMo5167 = interfaceC5308Mo4114.mo5167(interfaceC0103, 0);
                i |= 1;
            } else if (iMo6291 == 1) {
                zMo5163 = interfaceC5308Mo4114.mo5163(interfaceC0103, 1);
                i |= 2;
            } else {
                if (iMo6291 != 2) {
                    throw new C0720(iMo6291);
                }
                zMo5164 = interfaceC5308Mo4114.mo5163(interfaceC0103, 2);
                i |= 4;
            }
        }
        interfaceC5308Mo4114.mo5156(interfaceC0103);
        return new C1185(i, strMo5167, zMo5163, zMo5164);
    }

    @Override // p000.InterfaceC1441
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4734[] mo404() {
        C2323 c2323 = C2323.f7684;
        return new InterfaceC4734[]{C2258.f7505, c2323, c2323};
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        C1185 c1185 = (C1185) obj;
        InterfaceC0103 interfaceC0103 = descriptor;
        C3782 c3782M6691 = c3782.m6691(interfaceC0103);
        String str = c1185.f4074;
        boolean z = c1185.f4072;
        boolean z2 = c1185.f4073;
        c3782M6691.m6687(interfaceC0103, 0, str);
        if (c3782M6691.m6688() || z2) {
            c3782M6691.m6685(interfaceC0103, 1);
            c3782M6691.m6689(z2);
        }
        if (c3782M6691.m6688() || z) {
            c3782M6691.m6685(interfaceC0103, 2);
            c3782M6691.m6689(z);
        }
        c3782M6691.m6683();
    }
}
