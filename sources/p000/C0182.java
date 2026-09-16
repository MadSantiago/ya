package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۥَؑؓ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0182 implements InterfaceC1441 {
    private static final InterfaceC0103 descriptor;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C0182 f671;

    static {
        C0182 c0182 = new C0182();
        f671 = c0182;
        C4688 c4688 = new C4688("com.google.firebase.sessions.SessionData", c0182, 3);
        c4688.m8034("sessionDetails", false);
        c4688.m8034("backgroundTime", true);
        c4688.m8034("processDataMap", true);
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
        InterfaceC5130[] interfaceC5130Arr = C1109.f3896;
        C1521 c1521 = null;
        boolean z = true;
        int i = 0;
        C4959 c4959 = null;
        Map map = null;
        while (z) {
            int iMo6291 = interfaceC5308Mo4114.mo6291(interfaceC0103);
            if (iMo6291 == -1) {
                z = false;
            } else if (iMo6291 == 0) {
                c1521 = (C1521) interfaceC5308Mo4114.mo5162(interfaceC0103, 0, C3511.f11625, c1521);
                i |= 1;
            } else if (iMo6291 == 1) {
                c4959 = (C4959) interfaceC5308Mo4114.mo5165(interfaceC0103, 1, C3253.f10923, c4959);
                i |= 2;
            } else {
                if (iMo6291 != 2) {
                    throw new C0720(iMo6291);
                }
                map = (Map) interfaceC5308Mo4114.mo5165(interfaceC0103, 2, (InterfaceC4734) interfaceC5130Arr[2].getValue(), map);
                i |= 4;
            }
        }
        interfaceC5308Mo4114.mo5156(interfaceC0103);
        return new C1109(i, c1521, c4959, map);
    }

    @Override // p000.InterfaceC1441
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4734[] mo404() {
        return new InterfaceC4734[]{C3511.f11625, AbstractC4489.m7783(C3253.f10923), AbstractC4489.m7783((InterfaceC4734) C1109.f3896[2].getValue())};
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        C1109 c1109 = (C1109) obj;
        InterfaceC0103 interfaceC0103 = descriptor;
        C3782 c3782M6691 = c3782.m6691(interfaceC0103);
        InterfaceC5130[] interfaceC5130Arr = C1109.f3896;
        C3511 c3511 = C3511.f11625;
        C1521 c1521 = c1109.f3899;
        Map map = c1109.f3897;
        C4959 c4959 = c1109.f3898;
        c3782M6691.m6699(interfaceC0103, 0, c3511, c1521);
        if (c3782M6691.m6688() || c4959 != null) {
            c3782M6691.m6694(interfaceC0103, 1, C3253.f10923, c4959);
        }
        if (c3782M6691.m6688() || map != null) {
            c3782M6691.m6694(interfaceC0103, 2, (InterfaceC4734) interfaceC5130Arr[2].getValue(), map);
        }
        c3782M6691.m6683();
    }
}
