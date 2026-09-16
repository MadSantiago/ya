package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۦٜٜؔۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4687 {
    /* JADX INFO: renamed from: ۥۗ */
    static InterfaceC2150 m8033(InterfaceC4687 interfaceC4687, C2485 c2485, C1489 c1489, ArrayList arrayList) {
        String str = c2485.f8277;
        if (!interfaceC4687.mo2282(str)) {
            if ("hasOwnProperty".equals(str)) {
                AbstractC1605.m3330(1, "hasOwnProperty", arrayList);
                return interfaceC4687.mo2282(((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0)).mo1607()) ? InterfaceC2150.f7055 : InterfaceC2150.f7056;
            }
            C1078.m2272(AbstractC3761.m6628("Object has no function ", str));
            return null;
        }
        InterfaceC2150 interfaceC2150Mo2281 = interfaceC4687.mo2281(str);
        if (interfaceC2150Mo2281 instanceof AbstractC1079) {
            return ((AbstractC1079) interfaceC2150Mo2281).mo779(c1489, arrayList);
        }
        throw new IllegalArgumentException(str + " is not a function");
    }

    /* JADX INFO: renamed from: ۦِ */
    InterfaceC2150 mo2281(String str);

    /* JADX INFO: renamed from: ۦۗ */
    boolean mo2282(String str);

    /* JADX INFO: renamed from: ۦۙ */
    void mo2283(String str, InterfaceC2150 interfaceC2150);
}
