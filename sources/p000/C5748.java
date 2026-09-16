package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۦۦؒۘٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5748 implements InterfaceC1441 {
    private static final InterfaceC0103 descriptor;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C5748 f18960;

    static {
        C5748 c5748 = new C5748();
        f18960 = c5748;
        C4688 c4688 = new C4688(new C4441(new long[]{5892466339901074615L, -4119378042566899429L, 8863640103537455014L, 3529532175461713683L, -31267178632679187L, -4972426764703209201L, -264814122921087196L, -1768454796515203600L, -7949486814220929643L}).toString(), c5748, 1);
        c4688.m8034(new C4441(new long[]{2052954274973920542L, -1700911871719523143L, -8563669471776016371L, 4325982165483356847L}).toString(), false);
        C2872 c2872 = new C2872();
        ArrayList arrayList = c4688.f15443;
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            c4688.f15443 = arrayList;
        }
        arrayList.add(c2872);
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
        while (z) {
            int iMo6291 = interfaceC5308Mo4114.mo6291(interfaceC0103);
            if (iMo6291 == -1) {
                z = false;
            } else {
                if (iMo6291 != 0) {
                    throw new C0720(iMo6291);
                }
                strMo5167 = interfaceC5308Mo4114.mo5167(interfaceC0103, 0);
                i = 1;
            }
        }
        interfaceC5308Mo4114.mo5156(interfaceC0103);
        return new C5032(i, strMo5167);
    }

    @Override // p000.InterfaceC1441
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4734[] mo404() {
        return new InterfaceC4734[]{C2258.f7505};
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        InterfaceC0103 interfaceC0103 = descriptor;
        C3782 c3782M6691 = c3782.m6691(interfaceC0103);
        c3782M6691.m6687(interfaceC0103, 0, ((C5032) obj).f16660);
        c3782M6691.m6683();
    }
}
