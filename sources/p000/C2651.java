package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: ۥۣؑۦؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2651 extends AbstractC1079 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ int f8802 = 1;

    /* JADX INFO: renamed from: ۥٓ */
    public final Object f8803;

    public C2651(C3743 c3743) {
        super("internal.logger");
        this.f8803 = c3743;
        this.f3771.put("log", new C0363(this, false, true));
        this.f3771.put("silent", new C2825(1, "silent"));
        ((AbstractC1079) this.f3771.get("silent")).mo2283("log", new C0363(this, true, true));
        this.f3771.put("unmonitored", new C2825(2, "unmonitored"));
        ((AbstractC1079) this.f3771.get("unmonitored")).mo2283("log", new C0363(this, false, false));
    }

    @Override // p000.AbstractC1079
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC2150 mo779(C1489 c1489, List list) {
        TreeMap treeMap;
        int i = this.f8802;
        String str = this.f3772;
        C4607 c4607 = InterfaceC2150.f7060;
        Object obj = this.f8803;
        String str2 = null;
        switch (i) {
            case 0:
                AbstractC1605.m3330(3, str, list);
                String strMo1607 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) list.get(0)).mo1607();
                InterfaceC2150 interfaceC2150 = (InterfaceC2150) list.get(1);
                C2346 c2346 = (C2346) c1489.f5057;
                long jM3344 = (long) AbstractC1605.m3344(c2346.m4397(c1489, interfaceC2150).mo1610().doubleValue());
                InterfaceC2150 interfaceC2150M4397 = c2346.m4397(c1489, (InterfaceC2150) list.get(2));
                HashMap mapM3334 = interfaceC2150M4397 instanceof C5162 ? AbstractC1605.m3334((C5162) interfaceC2150M4397) : new HashMap();
                C5460 c5460 = (C5460) obj;
                c5460.getClass();
                HashMap map = new HashMap();
                for (String str3 : mapM3334.keySet()) {
                    HashMap map2 = ((C0606) c5460.f18001).f2279;
                    map.put(str3, C0606.m1369(map2.containsKey(str3) ? map2.get(str3) : null, mapM3334.get(str3), str3));
                }
                ((ArrayList) c5460.f18000).add(new C0606(strMo1607, jM3344, map));
                return c4607;
            case 1:
                AbstractC1605.m3330(2, "getValue", list);
                InterfaceC2150 interfaceC2150M4398 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) list.get(0));
                InterfaceC2150 interfaceC2150M4399 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) list.get(1));
                String strMo1608 = interfaceC2150M4398.mo1607();
                C2346 c2347 = (C2346) obj;
                Map map3 = (Map) ((C3040) c2347.f7785).f10218.get((String) c2347.f7786);
                if (map3 != null && map3.containsKey(strMo1608)) {
                    str2 = (String) map3.get(strMo1608);
                }
                return str2 != null ? new C2485(str2) : interfaceC2150M4399;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return c4607;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                try {
                    return AbstractC0186.m443(((CallableC5867) obj).call());
                } catch (Exception unused) {
                    return c4607;
                }
            default:
                AbstractC1605.m3330(3, str, list);
                ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) list.get(0)).mo1607();
                InterfaceC2150 interfaceC2151 = (InterfaceC2150) list.get(1);
                C2346 c2348 = (C2346) c1489.f5057;
                InterfaceC2150 interfaceC2150M43910 = c2348.m4397(c1489, interfaceC2151);
                if (interfaceC2150M43910 instanceof C2929) {
                    InterfaceC2150 interfaceC2150M43911 = c2348.m4397(c1489, (InterfaceC2150) list.get(2));
                    if (interfaceC2150M43911 instanceof C5162) {
                        C5162 c5162 = (C5162) interfaceC2150M43911;
                        HashMap map4 = c5162.f17096;
                        if (map4.containsKey("type")) {
                            String strMo1609 = c5162.mo2281("type").mo1607();
                            int iM3354 = map4.containsKey("priority") ? AbstractC1605.m3354(c5162.mo2281("priority").mo1610().doubleValue()) : 1000;
                            C4898 c4898 = (C4898) obj;
                            C2929 c2929 = (C2929) interfaceC2150M43910;
                            c4898.getClass();
                            if ("create".equals(strMo1609)) {
                                treeMap = (TreeMap) c4898.f16142;
                            } else if ("edit".equals(strMo1609)) {
                                treeMap = (TreeMap) c4898.f16143;
                            } else {
                                C1078.m2276("Unknown callback type: ".concat(String.valueOf(strMo1609)));
                            }
                            if (treeMap.containsKey(Integer.valueOf(iM3354))) {
                                iM3354 = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(iM3354), c2929);
                            return c4607;
                        }
                        C1078.m2272("Undefined rule type");
                    } else {
                        C1078.m2272("Invalid callback params");
                    }
                } else {
                    C1078.m2272("Invalid callback type");
                }
                return null;
        }
    }

    public C2651(C5460 c5460) {
        super("internal.eventLogger");
        this.f8803 = c5460;
    }

    public C2651(CallableC5867 callableC5867) {
        super("internal.appMetadata");
        this.f8803 = callableC5867;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2651(C2825 c2825, C2346 c2346) {
        super("getValue");
        this.f8803 = c2346;
    }

    public C2651(C4898 c4898) {
        super("internal.registerCallback");
        this.f8803 = c4898;
    }
}
