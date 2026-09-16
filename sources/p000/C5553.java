package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦِۣۢؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5553 implements InterfaceC1441 {
    private static final InterfaceC0103 descriptor;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C5553 f18335;

    static {
        C5553 c5553 = new C5553();
        f18335 = c5553;
        C4688 c4688 = new C4688(new C4441(new long[]{4772608846243703900L, 3081119652802179994L, 5230050724423555161L, 1595422463699551285L, -9073729239611271917L, -8396741315680962564L, 5901559277212433494L, -8908589533752528441L}).toString(), c5553, 4);
        c4688.m8034(new C4441(new long[]{-1281170005299287256L, 8120632196840171142L}).toString(), false);
        c4688.m8034(new C4441(new long[]{3577865243919002190L, 8167721407009245782L}).toString(), false);
        c4688.m8034(new C4441(new long[]{-2535991099986790792L, -3826427172332053195L}).toString(), false);
        c4688.m8034(new C4441(new long[]{-2856038812147825794L, 7159905421958297881L}).toString(), false);
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
        InterfaceC5130[] interfaceC5130Arr = C2670.f8845;
        int i = 0;
        String strMo5167 = null;
        String strMo5168 = null;
        List list = null;
        String strMo5169 = null;
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
                list = (List) interfaceC5308Mo4114.mo5162(interfaceC0103, 2, (InterfaceC4734) interfaceC5130Arr[2].getValue(), list);
                i |= 4;
            } else {
                if (iMo6291 != 3) {
                    throw new C0720(iMo6291);
                }
                strMo5169 = interfaceC5308Mo4114.mo5167(interfaceC0103, 3);
                i |= 8;
            }
        }
        interfaceC5308Mo4114.mo5156(interfaceC0103);
        return new C2670(i, strMo5167, strMo5168, list, strMo5169);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1441
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4734[] mo404() {
        InterfaceC5130[] interfaceC5130Arr = C2670.f8845;
        C2258 c2258 = C2258.f7505;
        return new InterfaceC4734[]{c2258, c2258, interfaceC5130Arr[2].getValue(), c2258};
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        C2670 c2670 = (C2670) obj;
        InterfaceC0103 interfaceC0103 = descriptor;
        C3782 c3782M6691 = c3782.m6691(interfaceC0103);
        InterfaceC5130[] interfaceC5130Arr = C2670.f8845;
        c3782M6691.m6687(interfaceC0103, 0, c2670.f8848);
        c3782M6691.m6687(interfaceC0103, 1, c2670.f8847);
        c3782M6691.m6699(interfaceC0103, 2, (InterfaceC4734) interfaceC5130Arr[2].getValue(), c2670.f8846);
        c3782M6691.m6687(interfaceC0103, 3, c2670.f8849);
        c3782M6691.m6683();
    }
}
