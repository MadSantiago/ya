package p000;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: ۦٌؘْؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3733 extends AbstractC1079 {

    /* JADX INFO: renamed from: ۥْ */
    public final C5008 f12435;

    /* JADX INFO: renamed from: ۥٓ */
    public final HashMap f12436;

    public C3733(C5008 c5008) {
        super("require");
        this.f12436 = new HashMap();
        this.f12435 = c5008;
    }

    @Override // p000.AbstractC1079
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC2150 mo779(C1489 c1489, List list) {
        InterfaceC2150 interfaceC2150;
        AbstractC1605.m3330(1, "require", list);
        String strMo1607 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) list.get(0)).mo1607();
        HashMap map = this.f12436;
        if (map.containsKey(strMo1607)) {
            return (InterfaceC2150) map.get(strMo1607);
        }
        HashMap map2 = this.f12435.f16580;
        if (map2.containsKey(strMo1607)) {
            try {
                interfaceC2150 = (InterfaceC2150) ((Callable) map2.get(strMo1607)).call();
            } catch (Exception unused) {
                C1078.m2276("Failed to create API implementation: ".concat(String.valueOf(strMo1607)));
                return null;
            }
        } else {
            interfaceC2150 = InterfaceC2150.f7060;
        }
        if (interfaceC2150 instanceof AbstractC1079) {
            map.put(strMo1607, (AbstractC1079) interfaceC2150);
        }
        return interfaceC2150;
    }
}
