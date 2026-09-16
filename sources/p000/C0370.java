package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥؔؑٛ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0370 implements InterfaceC1441 {
    private static final InterfaceC0103 descriptor;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C0370 f1358;

    static {
        C0370 c0370 = new C0370();
        f1358 = c0370;
        C4688 c4688 = new C4688(new C4441(new long[]{-511702961249855309L, 4899693368657839237L, 5586329709841642329L, 8790454957287400409L, 1831577278671922052L, -2731515694194852859L, -8809673532897125493L, 6200188584174634216L, 1394674911136206022L, 4045410834865899348L}).toString(), c0370, 2);
        c4688.m8034(new C4441(new long[]{-3838740541352525333L, -1542592632460073476L}).toString(), false);
        c4688.m8034(new C4441(new long[]{4846952781334992831L, 6900851767852479850L}).toString(), false);
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
        InterfaceC5130[] interfaceC5130Arr = C1488.f5052;
        String strMo5167 = null;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iMo6291 = interfaceC5308Mo4114.mo6291(interfaceC0103);
            if (iMo6291 == -1) {
                z = false;
            } else if (iMo6291 == 0) {
                strMo5167 = interfaceC5308Mo4114.mo5167(interfaceC0103, 0);
                i |= 1;
            } else {
                if (iMo6291 != 1) {
                    throw new C0720(iMo6291);
                }
                list = (List) interfaceC5308Mo4114.mo5162(interfaceC0103, 1, (InterfaceC4734) interfaceC5130Arr[1].getValue(), list);
                i |= 2;
            }
        }
        interfaceC5308Mo4114.mo5156(interfaceC0103);
        return new C1488(i, strMo5167, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1441
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4734[] mo404() {
        return new InterfaceC4734[]{C2258.f7505, C1488.f5052[1].getValue()};
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        C1488 c1488 = (C1488) obj;
        InterfaceC0103 interfaceC0103 = descriptor;
        C3782 c3782M6691 = c3782.m6691(interfaceC0103);
        InterfaceC5130[] interfaceC5130Arr = C1488.f5052;
        c3782M6691.m6687(interfaceC0103, 0, c1488.f5054);
        c3782M6691.m6699(interfaceC0103, 1, (InterfaceC4734) interfaceC5130Arr[1].getValue(), c1488.f5053);
        c3782M6691.m6683();
    }
}
